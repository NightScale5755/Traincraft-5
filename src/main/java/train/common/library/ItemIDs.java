/*******************************************************************************
 * Copyright (c) 2012 mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author mrbrutal
 ******************************************************************************/

package train.common.library;

import net.minecraft.item.Item;

public enum ItemIDs {
	diesel("ItemContainer", "item_diesel_filled", 20),
	stake("ItemStacked", "item_stake", 1),
	steeldust("ItemTrain", "item_steeldust", 0),
	coaldust("ItemTrain", "item_coaldust", 15),
	graphite("ItemTrain", "item_graphite", 10),
	boiler("ItemTrain", "item_boiler_steel", 5),
	firebox("ItemTrain", "item_firebox_steel", 5),
	bogie("ItemTrain", "item_bogie_steel", 4),
	steelframe("ItemTrain", "item_frame_steel", 6),
	steelcab("ItemTrain", "item_cab_steel", 5),
	steelchimney("ItemTrain", "item_chimney_steel", 5),
	airship("ItemZeppelin", "item_zeppelin", 1),
	balloon("ItemTrain", "item_balloon", 7),
	propeller("ItemTrain", "item_propeller", 6),
	steamengine("ItemTrain", "item_engine_steam", 2),
	dieselengine("ItemTrain", "item_engine_diesel", 1),
	piston("ItemTrain", "item_piston", 9),
	camshaft("ItemTrain", "item_camshaft", 8),
	cylinder("ItemTrain", "item_cylinder", 7),
	electmotor("ItemTrain", "item_engine_electric", 1),
	woodenFrame("ItemTrain", "item_frame_wood", 12),
	woodenBogie("ItemTrain", "item_bogie_wood", 15),
	woodenCab("ItemTrain", "item_cab_wood", 10),
	ironChimney("ItemTrain", "item_chimney_iron", 7),
	ironFirebox("ItemTrain", "item_firebox_iron", 4),
	ironBoiler("ItemTrain", "item_boiler_iron", 5),
	ironFrame("ItemTrain", "item_frame_iron", 6),
	ironBogie("ItemTrain", "item_bogie_iron", 8),
	ironCab("ItemTrain", "item_cab_iron", 5),
	steel("ItemTrain", "item_steel", 4),
	refinedFuel("ItemContainer", "item_fuel_filled", 15),
	signal("ItemSignal", "item_signal", 0),
	seats("ItemTrain", "item_seats", 15),
	transformer("ItemTrain", "item_transformer", 4),
	controls("ItemTrain", "item_controls", 7),
	transmition("ItemTrain", "item_transmition", 5),
	generator("ItemTrain", "item_generator", 5),
	overalls("ItemTCArmor", "armour_overalls", 1),
	jacket("ItemTCArmor", "armour_jacket", 1),
	hat("ItemTCArmor", "armour_hat", 1),
	rawPlastic("ItemTrain", "item_plastic", 20),
	ingotCopper("ItemTrain", "item_copper", 9),
	copperWireFine("ItemTrain", "item_wire", 4),
	electronicCircuit("ItemTrain", "item_circuit", 2),
	chunkLoaderActivator("ItemChunkLoaderActivator", "item_chunk_loader", 1),
	//refinedFuelLiquid("ItemTrain", "item_liquid_fuel"),
	//dieselLiquid("ItemTrain", "item_liquid_diesel"),
	emptyCanister("ItemContainer", "item_canister", 40),
	//copperRail("ItemRail", "item_rail_copper", 1),
	//steelRail("ItemRail", "item_rail_steel", 1),
	copperRail("ItemTrain", "item_rail_copper", 1),
	steelRail("ItemTrain", "item_rail_steel", 1),
	recipeBook("ItemRecipeBook", "item_book_blue", 1),
	adminBook("ItemAdminBook", "item_book_blue", 0),
	wirelessTransmitter("ItemWirelessTransmitter", "wireless_transmitter", 3),

	atoCard("ItemATOCard", "ato_card", 5),
	minecartWork("ItemRollingStock", "train_work", 4),
	minecartTender("ItemRollingStock", "train_tender", 4),
	minecartChest("ItemRollingStock", "train_freight_1", 4),
	minecartFreightBamboo("ItemRollingStock", "train_freight_bamboo", 2),
	minecartTrainBamboo("ItemRollingStock", "train_train_bamboo", 3),
	minecartPassengerBamboo("ItemRollingStock", "train_passenger_bamboo", 1),
	minecartFreightGermanPost("ItemRollingStock", "train_freight_german_post", 2),
	minecartFreightDepressedFlatbed("ItemRollingStock", "train_freight_depressed_flatbed", 2),
	minecartPower("ItemRollingStock", "train_steam_normal", 10),
	minecartASTFAutorack("ItemRollingStock", "train_autorack", 5),
	minecartLoco3("ItemRollingStock", "train_steam_small", 7),
	minecartBuilder("ItemRollingStock", "train_builder", 20),
	minecartCaboose("ItemRollingStock", "train_caboose", 6),
	minecartGrain("ItemRollingStock", "train_hopper_grain", 6),
	minecartWatertransp("ItemRollingStock", "train_tank_lava", 7),
	minecartWood("ItemRollingStock", "train_transport_wood", 3),
	minecartPassenger2("ItemRollingStock", "train_passenger_1", 2),
	minecartBR_E69("ItemRollingStock", "train_bre69", 10),
	minecartShunter("ItemRollingStock", "train_shunter", 10),
	minecartVL10("ItemRollingStock", "train_vl10", 10),
	minecartTramWood("ItemRollingStock", "train_tram", 7),
	minecartChmE3("ItemRollingStock", "train_chme3", 8),
	minecartHeavySteam("ItemRollingStock", "train_steam_heavy", 7),
	minecartTenderHeavy("ItemRollingStock", "train_tender_heavy", 5),
	minecartFlatCart("ItemRollingStock", "train_flat", 1),
	//minecartNewHighSpeedLoco("ItemRollingStock","train_speed",10),
	minecartFreightCart2("ItemRollingStock", "train_freight_2", 2),
	minecartOpenWagon("ItemRollingStock", "train_hopper", 3),
	minecartTankWagon("ItemRollingStock", "train_tank_us", 5),
	minecartJukeBoxCart("ItemRollingStock", "train_jukebox", 10),
	minecartStockCar("ItemRollingStock", "train_stock", 10),
	minecartDRWGStockCar("ItemRollingStock", "drwg_stockcar", 10),
	minecartCabooseWork("ItemRollingStock", "train_caboose_work", 3),
	minecartPassenger5("ItemRollingStock", "train_passenger_2", 2),
	minecartTankWagon2("ItemRollingStock", "train_tank_blue", 5),
	minecartPassengerBlue("ItemRollingStock", "train_passenger_3", 2),
	minecartGP7Red("ItemRollingStock", "train_gp7", 10),
	minecartCD742("ItemRollingStock", "train_cd742", 10),
	minecartFlatCartSU("ItemRollingStock", "train_flat_su", 1),
	minecartFlatCartUS("ItemRollingStock", "train_flat_us", 1),
	minecartBoxCartUS("ItemRollingStock", "train_box_us", 4),
	minecartBoxCartPRR("ItemRollingStock", "train_box_prr", 4),
	minecartFreightHopperUS("ItemRollingStock", "train_hopper_us", 6),
	minecartFreight100TonHopper("ItemRollingStock", "train_100_ton_hopper", 8),
	minecartTankWagonUS("ItemRollingStock", "train_tank_us_2", 8),
	minecartTankWagonThreeDome("ItemRollingStock", "train_tank_three_dome", 7),
	minecartFlatCartWoodUS("ItemRollingStock", "train_flat_wood", 3),
	minecartBulkheadFlatCart("ItemRollingStock", "train_bulkheadflat_wood", 3),
	minecartFreightCartUS("ItemRollingStock", "train_freight_3", 4),
	minecartFreightCartSmall("ItemRollingStock", "train_freight_4", 2),
	minecartLocoCherepanov("ItemRollingStock", "train_cherpanov", 4),
	minecartMineTrain("ItemRollingStock", "train_mine_cart", 1),
	minecartLocoMineTrain("ItemRollingStock", "train_mine_train", 2),
	minecartSteamRedTender("ItemRollingStock", "train_tender_steam", 4),
	minecartFreightWood2("ItemRollingStock", "train_transport_wood_2", 6),
	minecartCaboose3("ItemRollingStock", "train_caboose_2", 3),
	minecartGWRBrakeVan("ItemRollingStock", "train_gwr_brakevan", 3),
	minecartPassenger7("ItemRollingStock", "train_passenger_4", 2),
	minecartFreightClosed("ItemRollingStock", "train_freight_closed", 5),
	minecartFreightOpen2("ItemRollingStock", "train_freight_open", 6),
	minecartLocomogulBlue("ItemRollingStock", "train_mogul", 10),
	minecartLocoForneyRed("ItemRollingStock", "train_forney", 10),
	minecartLocoBR01_DB("ItemRollingStock", "train_br01", 15),
	minecartLocoCoranationClass("ItemRollingStock", "train_coronationclass", 15),
	minecartLocoCoranationClassTender("ItemRollingStock", "train_coronationclasstender", 15),
	minecartMailWagon_DB("ItemRollingStock", "train_mail", 4),
	minecartFreightWagon_DB("ItemRollingStock", "train_freight_db", 3),
	minecartPassenger8_1class_DB("ItemRollingStock", "train_passenger_5", 6),
	minecartPassenger9_2class_DB("ItemRollingStock", "train_passenger_6", 5),
	minecartLocoBR80_DB("ItemRollingStock", "train_br80", 10),
	minecartTenderBR01_DB("ItemRollingStock", "train_tender_br01", 15),
	minecartFlatCartRail_DB("ItemRollingStock", "train_transport_rail", 6),
	minecartFlatCart_DB("ItemRollingStock", "train_flat_db", 1),
	minecartFlatCartLogs_DB("ItemRollingStock", "train_transport_wood_3", 2),
	minecartPropagandaJapan("ItemRollingStock", "propaganda_japan", 2),
	minecartPropagandaBritish("ItemRollingStock", "propaganda_british", 2),
	minecartPropagandaUSSR("ItemRollingStock", "propaganda_ussr", 2),
	minecartPropagandaUs("ItemRollingStock", "propaganda_us", 2),
	minecartFreightGondola_DB("ItemRollingStock", "train_freight_gondola", 3),
	minecartFreightL("ItemRollingStock", "train_freight_l", 3),
	minecartTankWagon_DB("ItemRollingStock", "train_tank_db", 6),
	minecartLocoSD70("ItemRollingStock", "train_sd70", 10),
	minecartLocoBP4("ItemRollingStock", "train_bp4", 10),
	minecartHeavyweightFreight("ItemRollingStock", "train_heavyweight_freight", 10),
	minecartLocoEMDF7("ItemRollingStock", "train_emdf7", 10),
	minecartLocoEMDF3("ItemRollingStock", "train_emdf3", 10),
	minecartLocoEMDF7B("ItemRollingStock", "train_emdf7b", 10),
	minecartLocoEMDF3B("ItemRollingStock", "train_emdf3b", 10),
	minecartLocoDD35B("ItemRollingStock", "train_dd35b", 10),
	minecartLocoWLs40("ItemRollingStock", "train_wls40", 10),
	//minecartRotativeDigger("ItemRotativeDigger","train_",10),
	minecartLocoEr("ItemRollingStock", "train_ussr", 10),
	minecartTenderEr("ItemRollingStock", "train_tender_ussr", 4),
	minecartTenderC41("ItemRollingStock", "train_tender_c41", 4),
	minecartLocoC41("ItemRollingStock", "train_c41", 6),
	minecartLocoC41_080("ItemRollingStock", "train_c41_080", 6),
	minecartLocoAlcoSC4("ItemRollingStock", "train_alcosc4", 6),
	minecartLocoC41T("ItemRollingStock", "train_c41t", 6),
	minecartLocoSouthern1102("ItemRollingStock", "train_southern1102", 6),
	minecartTenderSouthern1102("ItemRollingStock", "train_southern1102tender", 3),
	minecartLocoUSATCUS("ItemRollingStock", "train_S100US", 6),
	minecartLocoUSATCUK("ItemRollingStock", "train_S100UK", 6),
	//minecartLocoU57("ItemRollingStock","train_",10),
	//minecartTenderU57("ItemRollingStock","train_",10),
	//minecartLocoSD40("ItemRollingStock","train_",10),
	minecartFreightCenterBeam_Empty("ItemRollingStock", "train_freight_empty", 2),
	minecartFreightCenterBeam_Wood_1("ItemRollingStock", "train_freight_wood_1", 3),
	minecartFreightCenterBeam_Wood_2("ItemRollingStock", "train_freight_wood_2", 3),
	minecartFreightTrailer("ItemRollingStock", "train_freight_trailer", 5),
	minecartFreightWellcar("ItemRollingStock", "train_freight_wellcar", 5),
	minecartFreightGTNG("ItemRollingStock", "freight_gtng", 5),
	minecartHeavyweightMailcar("ItemRollingStock", "heavyweight_mailcar", 5),
	minecartKof_DB("ItemRollingStock", "train_kof", 10),
	minecartV60_DB("ItemRollingStock", "train_v60", 10),
	minecartLocoCD151("ItemRollingStock", "train_CD151", 3),
	minecartE10_DB("ItemRollingStock", "train_e10db", 10),
	minecartE103("ItemRollingStock", "train_e103", 10),
	minecartIC4_DSB_FG("ItemRollingStock", "train_ic4_dsb_fg", 10),
	minecartIC4_DSB_FH("ItemRollingStock", "train_ic4_dsb_fh", 10),
	minecartIC4_DSB_MG("ItemRollingStock", "train_ic4_dsb_mg", 10),
	minecartGS4_Loco("ItemRollingStock", "GS4_engine", 10),
	minecartGS4_Passenger("ItemRollingStock", "GS4_passenger", 10),
	minecartGS4_Baggage("ItemRollingStock", "GS4_baggage", 10),
	minecartGS4_Observatory("ItemRollingStock", "GS4_observatory", 10),
	minecartGS4_Tail("ItemRollingStock", "GS4_tail", 10),
	minecartGS4_Tender("ItemRollingStock", "GS4_tender", 10),
	minecart4000GallonTender("ItemRollingStock", "4000GallonTender", 10),
	minecarttenderBerk1225("ItemRollingStock", "BerkshireTender", 10),
	minecartLocoHallClass("ItemRollingStock", "HallClass", 3),
	minecartLocoBerk1225("ItemRollingStock", "Berkshire1225", 3),
	minecartLocoBerk765("ItemRollingStock", "Berkshire765", 3),
	minecartLocoFowler("ItemRollingStock", "Fowler 4F", 3),
	minecartFowler4FTender("ItemRollingStock", "Fowler 4F Tender", 3),
	minecartLocoKingClass("ItemRollingStock", "KingClass", 3),
	minecartLoco44TonSwitcher("ItemRollingStock", "train_44tonner", 10),
	minecartDenverRioGrandePassenger("ItemRollingStock", "denverriogrande_passenger", 10),
	minecartDenverRioGrandeCombo("ItemRollingStock", "denverriogrande_combo", 10),
	minecartDenverRioGrandeBaggage("ItemRollingStock", "denverriogrande_baggage", 10),
	minecartMILW_H1044("ItemRollingStock", "MILW_H1044", 10),
	minecartSlateWagon("ItemRollingStock", "slatewagon", 10),
	minecartIceWagon("ItemRollingStock", "icewagon", 10),
	minecartICE1_Loco("ItemRollingStock", "train_ice1", 10),
	minecartICE1_1stClass("ItemRollingStock", "train_ice1_passenger", 10),
	minecartICE1_2ndClass("ItemRollingStock", "train_ice1_passenger", 10),
	minecartICE1_Restaurant("ItemRollingStock", "train_ice1_restaurant", 10),

	hat_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_hat", 1),
	pants_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_pants", 1),
	jacket_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_jacket", 1),
	hat_driver_paintable("ItemTCArmor", "armor_driver_hat", 1),
	pants_driver_paintable("ItemTCArmor", "armor_driver_pants", 1),
	jacket_driver_paintable("ItemTCArmor", "armor_driver_jacket", 1),

	helmet_suit_paintable("ItemTCArmor", "armor_composite_helmet", 1),
	pants_suit_paintable("ItemTCArmor", "armor_composite_pants", 1),
	boots_suit_paintable("ItemTCArmor", "armor_composite_boots", 1),
	jacket_suit_paintable("ItemTCArmor", "armor_composite_chest", 1),
	reinforcedPlastic("ItemTrain", "item_fiberglass_plate", 10),
	reinforcedPlates("ItemTrain", "item_reinforced_plate", 10),
	composite_wrench("ItemWrench", "item_composite_wrench", 1),

	minecartPassengerHighSpeedCarZeroED("ItemRollingStock", "train_high_speed_cart_zeroed", 14),
	minecartNYTram("ItemRollingStock", "train_tram_ny", 7),
	minecartLocoHighSpeedZeroED("ItemRollingStock", "train_high_speed_loco_zeroed", 17),
	minecartLocoA4Mallard("ItemRollingStock", "train_loco_a4_mallard", 14),
	minecartLocoA4MallardTender("ItemRollingStock", "train_loco_a4_mallard_tender", 5),
	minecartLocoC62Class("ItemRollingStock", "train_loco_c62_class", 14),
	minecartLocoD51Short("ItemRollingStock", "train_loco_d51s", 14),
	minecartLocoD51Long("ItemRollingStock", "train_loco_d51", 14),
	minecartTenderC62Class("ItemRollingStock", "train_tender_c62_class", 5),
	minecartTenderD51("ItemRollingStock", "train_tender_d51", 5),

	minecartLocoSteamShay("ItemRollingStock", "train_shay", 4),
	minecartLocoSteamVBShay("ItemRollingStock", "train_vbshay", 4),
	minecartLocoSteamClimax("ItemRollingStock", "train_climax", 4),
	minecartLocoSteamPannier("ItemRollingStock", "train_pannier", 4),
	minecartLocoSteamAdler("ItemRollingStock", "train_adler", 3),
	minecartLocoSteamAlice("ItemRollingStock", "train_alice", 3),
	minecartLocoSteamGLYN("ItemRollingStock", "train_glyn", 3),
	minecartLocoSteam262T("ItemRollingStock", "train_262t", 3),
	minecartLocoSteam040vb("ItemRollingStock", "train_040VB", 3),
	minecartLocoBR185("ItemRollingStock", "train_br101", 3),
	minecartLocoClass85("ItemRollingStock", "train_class85", 3),
	minecartLocoDeltic("ItemRollingStock", "train_deltic", 3),
	minecartLocoDD35A("ItemRollingStock", "train_dd35a", 3),
	minecartLocoSnowPlow("ItemRollingStock", "train_snowplow", 3),
	minecartLocoEWSClass66("ItemRollingStock", "train_ewsclass66", 3),
	minecartTenderAdler("ItemRollingStock", "train_tender_adler", 1),
	minecartPassengerAdler("ItemRollingStock", "train_passenger_adler", 2),
	minecartLocoFOLM1("ItemRollingStock", "train_fol_m1", 10),
	minecartKClassRailBox("ItemRollingStock", "train_k_class_railbox", 2),
	minecartLocoLSSP7("ItemRollingStock", "train_lssp7", 4),
	minecartLongCoveredHopper("ItemRollingStock", "train_longcoveredhopper", 3),
	minecartShortCoveredHopper("ItemRollingStock", "train_shortcoveredhopper", 2),

	minecartPassengerRheingold("ItemRollingStock", "train_passenger_rheingold", 5),
	minecartPassengerRheingoldDining1("ItemRollingStock", "train_passenger_rheingolddining1", 5),
	minecartPassengerRheingoldDining2("ItemRollingStock", "train_passenger_rheingolddining2", 5),
	minecartPassengerRheingoldPanorama("ItemRollingStock", "train_passenger_rheingoldpanorama", 5),

	minecartPassengerMILW("ItemRollingStock", "train_passenger_milw", 5),
	minecartPassengerMILWTail("ItemRollingStock", "train_passenger_milw_tail", 5),
	minecartBaggageMILW("ItemRollingStock", "train_baggage_milw", 5),
	//minecartPassengerMILWDiner("ItemRollingStock", "train_passenger_milw_diner", 5),
	minecartLocoMILWClassA("ItemRollingStock", "train_milw_class_a", 7),
	minecartMILWTender("ItemRollingStock", "train_milw_tender", 5),

	minecartCabooseLogging("ItemRollingStock", "train_logging_caboose", 1),
	minecartCabooseLoggingPRR("ItemRollingStock", "train_prr_caboose", 1),
	minecartPassengerTramNY("ItemRollingStock", "train_tram_ny", 3),

	minecartPassengerDBOriental("ItemRollingStock", "train_passenger_orient", 2),
	minecartLocoSD40("ItemRollingStock", "train_sd40", 10),
	zeppelin("ItemZeppelin", "item_zeppelin_one_balloon", 1),

	tcRailSmallStraight("ItemTCRail", "item_rail_straight_small", 5),
	tcRailMediumStraight("ItemTCRail", "item_rail_straight_medium", 5),
	tcRailLongStraight("ItemTCRail", "item_rail_straight_large", 5),
	tcRailSmallRoadCrossing("ItemTCRail", "item_rail_small_road_crossing", 5),
	tcRailSmallRoadCrossing1("ItemTCRail", "item_rail_small_road_crossing_1", 5),
	tcRailSmallRoadCrossing2("ItemTCRail", "item_rail_small_road_crossing_2", 5),

	tcRailMediumTurn("ItemTCRail", "item_rail_turn_medium", 5),
	tcRailLargeTurn("ItemTCRail", "item_rail_turn_large", 5),
	tcRailVeryLargeTurn("ItemTCRail", "item_rail_turn_veryLarge", 5),

	tcRailMediumSwitch("ItemTCRail", "item_rail_switch_medium", 5),
	tcRailLargeSwitch("ItemTCRail", "item_rail_switch_large", 5),
	tcRailMediumParallelSwitch("ItemTCRail", "item_rail_switch_parallel", 5),

	tcRailTwoWaysCrossing("ItemTCRail","item_rail_two_ways_crossing",5),
	tcRailSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 5),
	tcRailSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 5),
	tcRailSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 5),
	tcRailLargeSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
	tcRailLargeSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
	tcRailLargeSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),
	tcRailVeryLargeSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
	tcRailVeryLargeSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
	tcRailVeryLargeSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),

	minecartLocoCF7("ItemRollingStock", "train_cf7", 4),
	minecartLocoGP15("ItemRollingStock", "train_gp15", 4),
	minecartLocoSW8("ItemRollingStock", "train_sw8", 4),
	minecartFOLM1B("ItemRollingStock", "folm1b", 4),
	minecartLocoBR07("ItemRollingStock", "train_br07", 3),
	minecartLocoBR04("ItemRollingStock", "train_br04", 3),
	//minecartLocoSM42("ItemRollingStock", "train_sm42", 4),
	minecartLocoWWCPGP7("ItemRollingStock", "train_WWCPGP7", 4),
	minecartLocoGE44Ton("ItemRollingStock", "44-tonner_icon", 4),

	minecartClimaxNew("ItemRollingStock", "train_climax2", 5),
	minecartVBShay2("ItemRollingStock", "vbshay2", 5),
	minecartLocoC11("ItemRollingStock", "train_C11", 5),

	minecartLocoRenfe446Motor("ItemRollingStock", "446_motor_icon", 3),
	minecartPassengerRenfe446Coach("ItemRollingStock", "446_middle_icon", 3),
	minecartCabooseRenfe446Tail("ItemRollingStock", "446_tail_icon", 3),
	minecartPCH120Commute("ItemRollingStock", "pch120", 4),
	minecartPCH120Car("ItemRollingStock", "pch120car", 3),
	minecartPS52seatCoach("ItemRollingStock", "PS52seatCoach", 3),
	minecartPScombine("ItemRollingStock", "PScombine", 3),
	minecartPSCenterDiner("ItemRollingStock", "PScenterDiner", 3),
	minecartDstockEngine("ItemRollingStock","DstockEngine", 4),
	minecartDstockCar("ItemRollingStock","DstockCar", 3),
	minecartLUengine("ItemRollingStock","luengine", 4),
	minecartLUcar("ItemRollingStock","lupassenger", 3),
	minecartClass345engine("ItemRollingStock", "Class345Engine", 4),
	minecartClass345car("ItemRollingStock", "Class345Coach", 3),
	minecartLocoRenfe450Motor("ItemRollingStock", "450_front_icon", 3),
	minecartPassengerRenfe450Coach("ItemRollingStock", "450_middle_icon", 3),
	minecartCabooseRenfe450Tail("ItemRollingStock", "450_tail_icon", 3),
	minecartCD010("ItemRollingStock", "CD010", 2),
	minecartCD810("ItemRollingStock", "CD810", 2),
	minecartCD014("ItemRollingStock", "CD014", 2),// bruh
	minecartCD814("ItemRollingStock", "CD814", 2),
	minecartCD914("ItemRollingStock", "CD914", 2),

	minecartRoundHopper("ItemRollingStock", "train_RoundHopper", 2),
	minecartRibbedHopper("ItemRollingStock", "train_ribbed_hopper", 2),
	;

	public Item item;
	public String className;
	public String iconName;

	/**
	 * amount for one emerald. For ItemRollingStock, it is the price for one train
	 */
	public int amountForEmerald;

	/**
	 * @param classMethodName
	 * @param iconName
	 * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
	 */
	ItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

}