/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import Model.Location;
import Model.Map;
import Model.Scene;

/**
 *
 * @author Josh
 */
public class SceneControl {
    
     public enum SceneType {
        start,
        trainMap,
        firstSeat,
        secondSeat,
        subwayStation,
        hospitalLobby,
        waitingRoom,
        frontDesk,
        doctorOffice,
        hospitalStation,
        officeLobby,
        elevators,
        thirdFloor,
        desk,
        officeStation,
        gymLobby,
        gym,
        lockerRoom,
        locker,
        basementDoor,
        basementEntrance,
        diningHall,
        lab,
        bathroom,
        basementOffice,
        finish;
    }
    
    public static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "You find yourself on a crowded subway train, full of "
                + "people coming home from the daily grind. Your head is"
                + "pounding, you feel sun burnt and nothing seems familiar, "
                + "not even yourself or what you were doing."
                + "You are getting strange stares, "
                + "especially from an old woman, clutching her pocket book"
                + "in her lap. The train is headed northbound with a stop"
                + "incoming in 15 minutes.");
        startingScene.setDisplaySymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(15);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene subwayStationScene = new Scene();
        subwayStationScene.setDescription(
                     "You are on the subway platform. "
                   + "Trains are heading in multiple directions.");
        subwayStationScene.setDisplaySymbol(" SS ");
        subwayStationScene.setBlocked(false);
        subwayStationScene.setTravelTime(15);
        scenes[SceneType.subwayStation.ordinal()] = subwayStationScene;
        
        Scene trainMapScene = new Scene();
        trainMapScene.setDescription(
                     "A map of the subway stops"
                   + " is posted on the wall of the train.");
        trainMapScene.setDisplaySymbol(" TM ");
        trainMapScene.setBlocked(false);
        trainMapScene.setTravelTime(15);
        scenes[SceneType.trainMap.ordinal()] = trainMapScene;
        
        Scene firstSeatScene = new Scene();
        firstSeatScene.setDescription(
                     "You sit in the chair directly across from the old lady.");
        firstSeatScene.setDisplaySymbol(" 1S ");
        firstSeatScene.setBlocked(false);
        firstSeatScene.setTravelTime(15);
        scenes[SceneType.firstSeat.ordinal()] = firstSeatScene;
        
        Scene secondSeatScene = new Scene();
        secondSeatScene.setDescription(
                     "You sit in the seat next to the old lady.");
        secondSeatScene.setDisplaySymbol(" 2S ");
        secondSeatScene.setBlocked(false);
        secondSeatScene.setTravelTime(15);
        scenes[SceneType.secondSeat.ordinal()] = secondSeatScene;
        
        Scene hospitalLobbyScene = new Scene();
        hospitalLobbyScene.setDescription(
                     "The hospital is quiet this late in the night with only a "
                      + "few doctors and nurses making the rounds in the "
                             + "hallway. The waiting room has a slight minty "
                             + "scent with chairs lined up for waiting and a "
                             + "front desk with a receptionist busy on the "
                             + "phone.");
        hospitalLobbyScene.setDisplaySymbol(" HL ");
        hospitalLobbyScene.setBlocked(false);
        hospitalLobbyScene.setTravelTime(15);
        scenes[SceneType.hospitalLobby.ordinal()] = hospitalLobbyScene;
        
        Scene waitingRoomScene = new Scene();
        waitingRoomScene.setDescription(
                     "You sit in a chair in the waiting room.");
        waitingRoomScene.setDisplaySymbol(" WR ");
        waitingRoomScene.setBlocked(false);
        waitingRoomScene.setTravelTime(15);
        scenes[SceneType.waitingRoom.ordinal()] = waitingRoomScene;
        
        Scene frontDeskScene = new Scene();
        frontDeskScene.setDescription(
                     "You approach the receptionist at the desk.");
        frontDeskScene.setDisplaySymbol(" FD ");
        frontDeskScene.setBlocked(false);
        frontDeskScene.setTravelTime(15);
        scenes[SceneType.frontDesk.ordinal()] = frontDeskScene;
        
        Scene doctorOfficeScene = new Scene();
        doctorOfficeScene.setDescription(
                     "You are brought to an examination table "
                   + "in a doctor’s office and are told to sit up "
                   + "and wait for the doctor. The doctor eventually "
                   + "comes and introduces himself as Dr. Dennis. "
                   + "He pokes and prods and looks into your eyes. "
                   + "He has a hard time diagnosing you, but says "
                   + "you look like it could possibly be food poisoning. "
                   + "He leaves saying he will return with a nausea medicine.");
        doctorOfficeScene.setDisplaySymbol(" DO ");
        doctorOfficeScene.setBlocked(false);
        doctorOfficeScene.setTravelTime(15);
        scenes[SceneType.doctorOffice.ordinal()] = doctorOfficeScene;
        
        Scene hospitalStationScene = new Scene();
        hospitalStationScene.setDescription(
                     "You are on the subway platform. "
                   + "Trains are heading in multiple directions.");
                    
        hospitalStationScene.setDisplaySymbol(" HS ");
        hospitalStationScene.setBlocked(false);
        hospitalStationScene.setTravelTime(15);
        scenes[SceneType.hospitalStation.ordinal()] = hospitalStationScene;
        
        Scene officeLobbyScene = new Scene();
        officeLobbyScene.setDescription(
                     "The newspaper offices are closed this late at night, but "
                             + "the main doors into the lobby are unlocked and "
                             + "a sole security guard is sitting behind a large "
                             + "desk in the well-kept lobby.");
        officeLobbyScene.setDisplaySymbol(" OL ");
        officeLobbyScene.setBlocked(false);
        officeLobbyScene.setTravelTime(15);
        scenes[SceneType.officeLobby.ordinal()] = officeLobbyScene;
        
        Scene elevatorsScene = new Scene();
        elevatorsScene.setDescription(
                     "You stand in front of the bank of elevators. "
                             + "There is a plaque on the wall next to the elevators "
                             + "listing the offices on each floor.");
        elevatorsScene.setDisplaySymbol(" EL ");
        elevatorsScene.setBlocked(false);
        elevatorsScene.setTravelTime(15);
        scenes[SceneType.elevators.ordinal()] = elevatorsScene;
        
        Scene thirdFloorScene = new Scene();
        thirdFloorScene.setDescription(
                     "The offices of the newspaper are dark and deserted. "
                             + "There is an empty receptionist desk immediately facing you.");
        thirdFloorScene.setDisplaySymbol(" 3F ");
        thirdFloorScene.setBlocked(false);
        thirdFloorScene.setTravelTime(15);
        scenes[SceneType.thirdFloor.ordinal()] = thirdFloorScene;
        
        Scene deskScene = new Scene();
        deskScene.setDescription(
                     "The office is unkempt. There are piles of papers and file "
                             + "boxes everywhere. The walls are covered with "
                             + "notes and photos with strings of yarn connecting "
                             + "them.");
        deskScene.setDisplaySymbol(" DK ");
        deskScene.setBlocked(false);
        deskScene.setTravelTime(15);
        scenes[SceneType.desk.ordinal()] = deskScene;
        
        Scene officeStationScene = new Scene();
        officeStationScene.setDescription(
                     "You are on the subway platform. "
                   + "Trains are heading in multiple directions.");
        officeStationScene.setDisplaySymbol(" OS ");
        officeStationScene.setBlocked(false);
        officeStationScene.setTravelTime(15);
        scenes[SceneType.officeStation.ordinal()] = officeStationScene;
        
        Scene gymLobbyScene = new Scene();
        gymLobbyScene.setDescription(
                     "A three-floor, 10,000-square-foot facility that is open "
                             + "24 hours. Its rows of of cardio equipment, "
                             + "strength machines, free weights and medicine "
                             + "balls are mostly unused at this hour, however. "
                             + "There are a few late-night fitness enthusiasts "
                             + "scattered throughout the building, but it is "
                             + "mostly quiet.");
        gymLobbyScene.setDisplaySymbol(" GL ");
        gymLobbyScene.setBlocked(false);
        gymLobbyScene.setTravelTime(15);
        scenes[SceneType.gymLobby.ordinal()] = gymLobbyScene;
        
        Scene gymScene = new Scene();
        gymScene.setDescription(
                     "You are standing in a massive room with free weights on your left and strength machines on your right. "
                             + "Straight ahead is a staircase stating that there are cardio machines upstairs and locker rooms downstairs.");
        gymScene.setDisplaySymbol(" GM ");
        gymScene.setBlocked(false);
        gymScene.setTravelTime(15);
        scenes[SceneType.gym.ordinal()] = gymScene;
        
        Scene lockerRoomScene = new Scene();
        lockerRoomScene.setDescription(
                     "The locker room is empty this late at night.");
        lockerRoomScene.setDisplaySymbol(" LR ");
        lockerRoomScene.setBlocked(false);
        lockerRoomScene.setTravelTime(15);
        scenes[SceneType.lockerRoom.ordinal()] = lockerRoomScene;
        
        Scene lockerScene = new Scene();
        lockerScene.setDescription(
                     "Inside the locker you find a nice leather jacket hanging on a hook.");
        lockerScene.setDisplaySymbol(" LK ");
        lockerScene.setBlocked(false);
        lockerScene.setTravelTime(15);
        scenes[SceneType.locker.ordinal()] = lockerScene;
        
        Scene basementDoorScene = new Scene();
        basementDoorScene.setDescription(
                     "The room is old, dark and musty. "
                             + "There are boxes of storage and some broken fitness equipment scattered around. "
                             + "Following the phone message’s instructions, you find a strange panel on the wall and remove it. "
                             + "Behind it is a secret room.");
        basementDoorScene.setDisplaySymbol(" BD ");
        basementDoorScene.setBlocked(false);
        basementDoorScene.setTravelTime(15);
        scenes[SceneType.basementDoor.ordinal()] = basementDoorScene;
        
        Scene basementEntranceScene = new Scene();
        basementEntranceScene.setDescription(
                     "To be filled at a later time.");
        basementEntranceScene.setDisplaySymbol(" BE ");
        basementEntranceScene.setBlocked(false);
        basementEntranceScene.setTravelTime(15);
        scenes[SceneType.basementEntrance.ordinal()] = basementEntranceScene;
        
        Scene diningHallScene = new Scene();
        diningHallScene.setDescription(
                     "To be filled at a later time.");
        diningHallScene.setDisplaySymbol(" DH ");
        diningHallScene.setBlocked(false);
        diningHallScene.setTravelTime(15);
        scenes[SceneType.diningHall.ordinal()] = diningHallScene;
        
        Scene labScene = new Scene();
        labScene.setDescription(
                     "To be filled at a later time.");
        labScene.setDisplaySymbol(" LB ");
        labScene.setBlocked(false);
        labScene.setTravelTime(15);
        scenes[SceneType.lab.ordinal()] = labScene;
        
        
        Scene basementOfficeScene = new Scene();
        basementOfficeScene.setDescription(
                     "To be filled at a later time.");
        basementOfficeScene.setDisplaySymbol(" BO ");
        basementOfficeScene.setBlocked(false);
        basementOfficeScene.setTravelTime(15);
        scenes[SceneType.basementOffice.ordinal()] = basementOfficeScene;
        
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                     "You stopped the secret society from releasing "
                   + "the deadly poison! More exposition to come!");
        finishScene.setDisplaySymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }
    
    static void assignScenesToLocation(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[4][0].setScene(scenes[SceneType.subwayStation.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.trainMap.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.firstSeat.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.secondSeat.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.hospitalLobby.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.waitingRoom.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.frontDesk.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.doctorOffice.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.hospitalStation.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.officeLobby.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.elevators.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.thirdFloor.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.desk.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.officeStation.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.gymLobby.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.gym.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.lockerRoom.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.locker.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.basementDoor.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.basementEntrance.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.diningHall.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.lab.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.basementOffice.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.finish.ordinal()]);
    }

    
    
    
}
