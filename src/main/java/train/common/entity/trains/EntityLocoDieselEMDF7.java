package train.common.entity.trains;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.skin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.client.render.models.*;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityLocoDieselEMDF7 extends EntityTrainCore {

    public EntityLocoDieselEMDF7(World worldObj) {
        super(worldObj);
    }

    public EntityLocoDieselEMDF7(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityLocoDieselEMDF7((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Loco Diesel EMD F-7";}
    @Override
    public String transportcountry(){return "Undefined";}
    @Override
    public String transportYear(){return "Undefined";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.client.render.models.ModelEMDF7()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{-2.2f, 0.1f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 180.0f, 180.0f}};}
    @Override
    public void registerSkins(){
        String description ="";
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/emdf7_Black.png","Black", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/emdf7_Lime.png","Lime", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/emdf7_Red.png","Red", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/emdf7_Brown.png","Brown", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/emdf7_Green.png","Green", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/emdf7_Orange.png","Orange", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/emdf7_Yellow.png","Yellow", description));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Black";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                new ItemStack(), new ItemStack(), new ItemStack(), 
                new ItemStack(), new ItemStack(), new ItemStack(), 
                new ItemStack(), new ItemStack(), new ItemStack(), 
        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{-1.9f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{-1.2f, 1.2f};}
    //Train specific stuff
    @Override
    public String transportFuelType(){return "diesel";}
    @Override
    public float transportMetricHorsePower(){return 1600;}
    @Override
    public float transportTopSpeed(){return 150;}
    @Override
    public ItemStackSlot fuelSlot(){
        return super.fuelSlot().setOverlay(Items.coal);
    }
    @Override
    public int[] getTankCapacity(){return new int[]{12000};}



    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return false;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

}