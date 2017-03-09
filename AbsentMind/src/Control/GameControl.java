/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Clue;
import Model.Player;
import absentmind.AbsentMind;
import Model.Game;
import Model.KeyItem;
import Model.Location;
import Model.Map;
import Model.NpcClue;
import Model.Scene;
import java.util.ArrayList;

/**
 *
 * @author Kailey
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
        
        if (playerName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playerName);
        
        AbsentMind.setPlayer(player); // save the player
        
        return player;
        
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game(); // create new game
        AbsentMind.setCurrentGame(game); // save in AbsentMind
        
        game.setPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        ArrayList<KeyItem> KeyItemList = GameControl.createKeyItemList();
        game.setKeyItem(KeyItemList);
        
        ArrayList<Clue> ClueList = GameControl.createClueList();
        game.setClue(ClueList);
        
        ArrayList<NpcClue> NpcClueList = GameControl.createNpcClueList();
        game.setNpcClue(NpcClueList);
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
        MapControl.moveNPCtoStartingLocation(map);
        MapControl.movePlayertoStartingLocation(map);
        
    } 

    public static ArrayList<KeyItem> createKeyItemList() {
        
        ArrayList<KeyItem> keyItem = new ArrayList<>();
        
        KeyItem key = new KeyItem("Key", "The unmarked key you found in your pocket. It appears to be a door key.");
        keyItem.add(key);
        
        keyItem.add(new KeyItem("Gym Membership Card", "A membership card to Gym Neighbors with your name on it."));
        keyItem.add(new KeyItem("Cellphone", "The cellphone you found in your coat pocket. It is password protected."));
        keyItem.add(new KeyItem("Antidote", "The antidote to your poison."));

       return keyItem;
    }

    private static ArrayList<Clue> createClueList() {
        
        ArrayList<Clue> clue = new ArrayList<>();
        
        Clue newspaper = new Clue("Newspaper", "Newspaper from the Big City Gazette. The front page article was written by you.");
        clue.add(newspaper);
        
        clue.add(new Clue("Notebook", "Notebook info tbd"));
        clue.add(new Clue("Locker Combination", "A sticky note with your Gym locker number and combination on it."));
        clue.add(new Clue("Sticky Note", "A sticky note explaining the phone password puzzle."));
        clue.add(new Clue("Phone Message", "Phone message info tbd"));

       return clue;
    }

    private static ArrayList<NpcClue> createNpcClueList() {
        
        ArrayList<NpcClue> npcClue = new ArrayList<>();
        
        NpcClue oldWoman = new NpcClue("Old Woman", "Clue obtained from the old woman on the subway.");
        npcClue.add(oldWoman);
        
        npcClue.add(new NpcClue("Receptionist", "Hospital Receptionist gave you no new information."));
        npcClue.add(new NpcClue("Dr. Dennis", "Dr. Dennis told you that you were poisoned."));
        npcClue.add(new NpcClue("Security Guard", "Info from the security guard goes here."));
        npcClue.add(new NpcClue("Society Member", "Missing info from Society Member goes here."));
        
       return npcClue;
    }
    
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
                     "To be filled at a later time.");
        subwayStationScene.setDisplaySymbol(" SS ");
        subwayStationScene.setBlocked(false);
        subwayStationScene.setTravelTime(15);
        scenes[SceneType.subwayStation.ordinal()] = subwayStationScene;
        
        Scene trainMapScene = new Scene();
        trainMapScene.setDescription(
                     "To be filled at a later time.");
        trainMapScene.setDisplaySymbol(" TM ");
        trainMapScene.setBlocked(false);
        trainMapScene.setTravelTime(15);
        scenes[SceneType.trainMap.ordinal()] = trainMapScene;
        
        Scene firstSeatScene = new Scene();
        firstSeatScene.setDescription(
                     "To be filled at a later time.");
        firstSeatScene.setDisplaySymbol(" 1S ");
        firstSeatScene.setBlocked(false);
        firstSeatScene.setTravelTime(15);
        scenes[SceneType.firstSeat.ordinal()] = firstSeatScene;
        
        Scene secondSeatScene = new Scene();
        secondSeatScene.setDescription(
                     "To be filled at a later time.");
        secondSeatScene.setDisplaySymbol(" 2S ");
        secondSeatScene.setBlocked(false);
        secondSeatScene.setTravelTime(15);
        scenes[SceneType.secondSeat.ordinal()] = secondSeatScene;
        
        Scene hospitalLobbyScene = new Scene();
        hospitalLobbyScene.setDescription(
                     "To be filled at a later time.");
        hospitalLobbyScene.setDisplaySymbol(" HL ");
        hospitalLobbyScene.setBlocked(false);
        hospitalLobbyScene.setTravelTime(15);
        scenes[SceneType.hospitalLobby.ordinal()] = hospitalLobbyScene;
        
        Scene waitingRoomScene = new Scene();
        waitingRoomScene.setDescription(
                     "To be filled at a later time.");
        waitingRoomScene.setDisplaySymbol(" WR ");
        waitingRoomScene.setBlocked(false);
        waitingRoomScene.setTravelTime(15);
        scenes[SceneType.waitingRoom.ordinal()] = waitingRoomScene;
        
        Scene frontDeskScene = new Scene();
        frontDeskScene.setDescription(
                     "To be filled at a later time.");
        frontDeskScene.setDisplaySymbol(" FD ");
        frontDeskScene.setBlocked(false);
        frontDeskScene.setTravelTime(15);
        scenes[SceneType.frontDesk.ordinal()] = frontDeskScene;
        
        Scene doctorOfficeScene = new Scene();
        doctorOfficeScene.setDescription(
                     "To be filled at a later time.");
        doctorOfficeScene.setDisplaySymbol(" DO ");
        doctorOfficeScene.setBlocked(false);
        doctorOfficeScene.setTravelTime(15);
        scenes[SceneType.doctorOffice.ordinal()] = doctorOfficeScene;
        
        Scene hospitalStationScene = new Scene();
        hospitalStationScene.setDescription(
                     "To be filled at a later time.");
        hospitalStationScene.setDisplaySymbol(" HS ");
        hospitalStationScene.setBlocked(false);
        hospitalStationScene.setTravelTime(15);
        scenes[SceneType.hospitalStation.ordinal()] = hospitalStationScene;
        
        Scene officeLobbyScene = new Scene();
        officeLobbyScene.setDescription(
                     "To be filled at a later time.");
        officeLobbyScene.setDisplaySymbol(" OL ");
        officeLobbyScene.setBlocked(false);
        officeLobbyScene.setTravelTime(15);
        scenes[SceneType.officeLobby.ordinal()] = officeLobbyScene;
        
        Scene elevatorsScene = new Scene();
        elevatorsScene.setDescription(
                     "To be filled at a later time.");
        elevatorsScene.setDisplaySymbol(" EL ");
        elevatorsScene.setBlocked(false);
        elevatorsScene.setTravelTime(15);
        scenes[SceneType.elevators.ordinal()] = elevatorsScene;
        
        Scene thirdFloorScene = new Scene();
        thirdFloorScene.setDescription(
                     "To be filled at a later time.");
        thirdFloorScene.setDisplaySymbol(" 3F ");
        thirdFloorScene.setBlocked(false);
        thirdFloorScene.setTravelTime(15);
        scenes[SceneType.thirdFloor.ordinal()] = thirdFloorScene;
        
        Scene deskScene = new Scene();
        deskScene.setDescription(
                     "To be filled at a later time.");
        deskScene.setDisplaySymbol(" DK ");
        deskScene.setBlocked(false);
        deskScene.setTravelTime(15);
        scenes[SceneType.desk.ordinal()] = deskScene;
        
        Scene officeStationScene = new Scene();
        officeStationScene.setDescription(
                     "To be filled at a later time.");
        officeStationScene.setDisplaySymbol(" OS ");
        officeStationScene.setBlocked(false);
        officeStationScene.setTravelTime(15);
        scenes[SceneType.officeStation.ordinal()] = officeStationScene;
        
        Scene gymLobbyScene = new Scene();
        gymLobbyScene.setDescription(
                     "To be filled at a later time.");
        gymLobbyScene.setDisplaySymbol(" GL ");
        gymLobbyScene.setBlocked(false);
        gymLobbyScene.setTravelTime(15);
        scenes[SceneType.gymLobby.ordinal()] = gymLobbyScene;
        
        Scene gymScene = new Scene();
        gymScene.setDescription(
                     "To be filled at a later time.");
        gymScene.setDisplaySymbol(" GM ");
        gymScene.setBlocked(false);
        gymScene.setTravelTime(15);
        scenes[SceneType.gym.ordinal()] = gymScene;
        
        Scene lockerRoomScene = new Scene();
        lockerRoomScene.setDescription(
                     "To be filled at a later time.");
        lockerRoomScene.setDisplaySymbol(" LR ");
        lockerRoomScene.setBlocked(false);
        lockerRoomScene.setTravelTime(15);
        scenes[SceneType.lockerRoom.ordinal()] = lockerRoomScene;
        
        Scene lockerScene = new Scene();
        lockerScene.setDescription(
                     "To be filled at a later time.");
        lockerScene.setDisplaySymbol(" LK ");
        lockerScene.setBlocked(false);
        lockerScene.setTravelTime(15);
        scenes[SceneType.locker.ordinal()] = lockerScene;
        
        Scene basementDoorScene = new Scene();
        basementDoorScene.setDescription(
                     "To be filled at a later time.");
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
        
        locations[0][0].setScene(scenes[SceneType.subwayStation.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.trainMap.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.firstSeat.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.secondSeat.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.hospitalLobby.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.waitingRoom.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.frontDesk.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.doctorOffice.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.hospitalStation.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.officeLobby.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.elevators.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.thirdFloor.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.desk.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.officeStation.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.gymLobby.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.gym.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.lockerRoom.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.locker.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.basementDoor.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.basementEntrance.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.diningHall.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.lab.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.basementOffice.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.finish.ordinal()]);
    }

    
}
