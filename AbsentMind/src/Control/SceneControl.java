/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;



import Model.Clue;
import Model.KeyItem;
import Model.Location;
import Model.Map;
import Model.NpcClue;
import Model.Scene;

/**
 *
 * @author Josh
 */
public class SceneControl {
    public static boolean keyObtained = false;
    public static boolean noteObtained = false;
    public static boolean phoneMessage = false;
    public static boolean weightComplete = false;
    public static boolean antidoteFound = false;

    
    
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
                "It is a crowded subway train, full of "
                + "\npeople coming home from the daily grind. Your head is"
                + "\npounding, you feel sun burnt and nothing seems familiar, "
                + "\nnot even yourself or what you were doing."
                + "\nYou are getting strange stares, "
                + "\nespecially from an old woman, clutching her pocket book"
                + "\nin her lap. The train is headed northbound with a stop"
                + "\nincoming. You are also holding a laminated gym card...");
        startingScene.setDisplaySymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(15);
        Clue status = new Clue("Your Status","you have a sunburn and no memory"
                + " other than your name.");
        KeyItem gymCard = new KeyItem("Gym Card","a gym membership card with"
                + " your photo and name.");
        startingScene.setKeyItem(gymCard);
        startingScene.setClue(status);
        startingScene.setNpcClue(null);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene subwayStationScene = new Scene();
        subwayStationScene.setDescription(
                     "You are on the subway platform. You can enter the subway train"
                    + "\n to the north, or head towards a hospital to the East. "
                   + "\nTrains are heading in multiple directions.");
        subwayStationScene.setDisplaySymbol(" SS ");
        subwayStationScene.setBlocked(false);
        subwayStationScene.setTravelTime(15);
        subwayStationScene.setKeyItem(null);
        subwayStationScene.setClue(null);
        subwayStationScene.setNpcClue(null);
        scenes[SceneType.subwayStation.ordinal()] = subwayStationScene;
        
        Scene trainMapScene = new Scene();
        trainMapScene.setDescription(
                     "A map of the subway stops"
                   + "\n are posted on the wall of the train. There is a stop"
                             + "\n at the hospital, and another incoming towards"
                             + "\n downtown and the journalism office. The previous"
                             + "\n stop was a gym.");
        trainMapScene.setDisplaySymbol(" TM ");
        trainMapScene.setBlocked(false);
        trainMapScene.setTravelTime(15);
        Clue map = new Clue("Subway Map","there was a map on the subway showing"
                + "\n three possible stops. Downtown, the hospital, and the Gym.");
        trainMapScene.setKeyItem(null);
        trainMapScene.setClue(map);
        trainMapScene.setNpcClue(null);
        scenes[SceneType.trainMap.ordinal()] = trainMapScene;
        
        Scene firstSeatScene = new Scene();
        firstSeatScene.setDescription(
                     "You sit in the chair across from the old lady and avoid "
                             + "\nmaking eye contact. You feel something poking you in your"
                             + "\n pocket. You find a sinlge key with no identification.");
        firstSeatScene.setDisplaySymbol(" 1S ");
        firstSeatScene.setBlocked(false);
        firstSeatScene.setTravelTime(15);
        keyObtained = true;
        KeyItem key = new KeyItem("Key","a key in your pocket. It appears to"
                + " be a door key.");
        firstSeatScene.setKeyItem(key);
        firstSeatScene.setClue(null);
        firstSeatScene.setNpcClue(null);
        scenes[SceneType.firstSeat.ordinal()] = firstSeatScene;
        
        Scene secondSeatScene = new Scene();
        secondSeatScene.setDescription(
                     "You sit in the seat next to the old lady. Her stare softens"
                             + "\n and she begins to speak, 'You don't look too well."
                             + "\n Weren't you being taken to the hospital? Those workers"
                             + "\n brought you to the trian unconscious, and you put up"
                             + "\n quite a fight when you woke up! Get some rest and "
                             + "\nfeel better.");
        secondSeatScene.setDisplaySymbol(" 2S ");
        secondSeatScene.setBlocked(false);
        secondSeatScene.setTravelTime(15);
        NpcClue oldWoman = new NpcClue("Old Woman","that you were being taken to the hospital"
                + "\n after being found unconscious at the Gym.");
        secondSeatScene.setKeyItem(null);
        secondSeatScene.setClue(null);
        secondSeatScene.setNpcClue(oldWoman);
        scenes[SceneType.secondSeat.ordinal()] = secondSeatScene;
        
        Scene hospitalLobbyScene = new Scene();
        hospitalLobbyScene.setDescription(
                     "The hospital is quiet this late in the night with only a "
                      + "\nfew doctors and nurses making the rounds in the "
                             + "\nhallway. The waiting room has a slight minty "
                             + "\nscent with chairs lined up for waiting and a "
                             + "\nfront desk with a receptionist busy on the "
                             + "\nphone.");
        hospitalLobbyScene.setDisplaySymbol(" HL ");
        hospitalLobbyScene.setBlocked(false);
        hospitalLobbyScene.setTravelTime(15);
        hospitalLobbyScene.setKeyItem(null);
        hospitalLobbyScene.setClue(null);
        hospitalLobbyScene.setNpcClue(null);
        scenes[SceneType.hospitalLobby.ordinal()] = hospitalLobbyScene;
        
        Scene waitingRoomScene = new Scene();
        waitingRoomScene.setDescription(
                     "You sit in a chair in the hospital waiting room. "
                             + "\nIt's reasonably comfortable."
                             + "\n You can hear the receptionist chatting away, probably"
                             + "\n on a personal call. You find a Newspaper to read. "
                             + "\nAtonished, you find that the front page article "
                             + "\n has your name on it.");
        waitingRoomScene.setDisplaySymbol(" WR ");
        waitingRoomScene.setBlocked(false);
        waitingRoomScene.setTravelTime(15);
        Clue newspaper = new Clue("Newspaper","you write for the newspaper "
                + "\n'The Big City Gazette'. Your name is on the front page"
                + "\n article.");
        waitingRoomScene.setKeyItem(null);
        waitingRoomScene.setClue(newspaper);
        waitingRoomScene.setNpcClue(null);
        scenes[SceneType.waitingRoom.ordinal()] = waitingRoomScene;
        
        Scene frontDeskScene = new Scene();
        frontDeskScene.setDescription(
                     "You approach the receptionist at the desk. The receptionist is"
                             + "\n chatting away on the phone. It doesn't sound"
                             + "\n very professional... With a sneer she says the doctor"
                             + "\n isn't busy and you can go back anytime. She"
                             + "\n doesn't seem to want to bother with you...");
        frontDeskScene.setDisplaySymbol(" FD ");
        frontDeskScene.setBlocked(false);
        frontDeskScene.setTravelTime(15);
        NpcClue receptionist = new NpcClue("Receptionist","that you could go see the "
                + "doctor whenever you wanted. Not very professional...");
        frontDeskScene.setKeyItem(null);
        frontDeskScene.setClue(null);
        frontDeskScene.setNpcClue(receptionist);
        scenes[SceneType.frontDesk.ordinal()] = frontDeskScene;
        
        Scene doctorOfficeScene = new Scene();
        doctorOfficeScene.setDescription(
                     "\nYou are brought to an examination table "
                   + "\nin a doctor’s office and are told to sit up "
                   + "\nand wait for the doctor. The doctor eventually "
                   + "\ncomes and introduces himself as Dr. Dennis. "
                   + "\nHe pokes and prods and looks into your eyes. "
                   + "\nHe has a hard time diagnosing you, but says "
                   + "\nyou look like it could possibly be food poisoning. "
                   + "\nHe leaves saying he will return with a nausea medicine.");
        doctorOfficeScene.setDisplaySymbol(" DO ");
        doctorOfficeScene.setBlocked(false);
        doctorOfficeScene.setTravelTime(15);
        NpcClue dennis = new NpcClue("Dr. Dennis","that you could possible have"
                + "\nfood poisoning, but don't really know. You havea feeling it"
                + "\nis much more deadly than that.");
        doctorOfficeScene.setKeyItem(null);
        doctorOfficeScene.setClue(null);
        doctorOfficeScene.setNpcClue(dennis);
        scenes[SceneType.doctorOffice.ordinal()] = doctorOfficeScene;
        
        Scene hospitalStationScene = new Scene();
        hospitalStationScene.setDescription(
                     "\nYou are on the subway platform with the hospital entrance"
                             + "to the West. "
                   + "\nTrains are heading in multiple directions.");
                    
        hospitalStationScene.setDisplaySymbol(" HS ");
        hospitalStationScene.setBlocked(false);
        hospitalStationScene.setTravelTime(15);
        hospitalStationScene.setKeyItem(null);
        hospitalStationScene.setClue(null);
        hospitalStationScene.setNpcClue(null);
        scenes[SceneType.hospitalStation.ordinal()] = hospitalStationScene;
        
        Scene officeLobbyScene = new Scene();
        officeLobbyScene.setDescription(
                     "\nThe newspaper offices are closed this late at night, but "
                             + "\nthe main doors into the lobby are unlocked and "
                             + "\na sole security guard is sitting behind a large "
                             + "\ndesk in the well-kept lobby. The security gaurd"
                             + "\n gives you a wave and says, 'Hey! Here for "
                             + "\nsome more late night work? Well, I left the"
                             + "\n elevators unlocked for you, so you should"
                             + "\n have no problem getting to the journalism"
                             + "\n office on the third floor.'");
        officeLobbyScene.setDisplaySymbol(" OL ");
        officeLobbyScene.setBlocked(false);
        officeLobbyScene.setTravelTime(15);
        NpcClue guard = new NpcClue("\nSecurity Guard","that you have an office"
                + "\n on the third floor. Seems you come here often, it's probably"
                + "\n where you work.");
        officeLobbyScene.setKeyItem(null);
        officeLobbyScene.setClue(null);
        officeLobbyScene.setNpcClue(guard);
        scenes[SceneType.officeLobby.ordinal()] = officeLobbyScene;
        
        Scene elevatorsScene = new Scene();
        elevatorsScene.setDescription(
                     "\nYou are in the elevator, waiting for your floor.");
        elevatorsScene.setDisplaySymbol(" EL ");
        elevatorsScene.setBlocked(false);
        elevatorsScene.setTravelTime(15);
        elevatorsScene.setKeyItem(null);
        elevatorsScene.setClue(null);
        elevatorsScene.setNpcClue(null);
        scenes[SceneType.elevators.ordinal()] = elevatorsScene;
        
        Scene thirdFloorScene = new Scene();
        thirdFloorScene.setDescription(
                     "\nThe offices of the newspaper are dark and deserted. "
                             + "\nThere is a familiar desk north to where you are "
                             + "\nstanding. You safely assume this is your desk.");
        thirdFloorScene.setDisplaySymbol(" 3F ");
        thirdFloorScene.setBlocked(false);
        thirdFloorScene.setTravelTime(15);
        thirdFloorScene.setKeyItem(null);
        thirdFloorScene.setClue(null);
        thirdFloorScene.setNpcClue(null);
        scenes[SceneType.thirdFloor.ordinal()] = thirdFloorScene;
        
        Scene deskScene = new Scene();
        if (keyObtained = false){
        deskScene.setDescription(
                     "\nThe office is unkempt. There are piles of papers and file "
                             + "\nboxes everywhere. The walls are covered with "
                             + "\nnotes and photos with strings of yarn connecting "
                             + "\nthem. You notice a locked drawer, but without a key"
                             + "\n you can't do anything about it.");
        deskScene.setDisplaySymbol(" DK ");
        deskScene.setBlocked(false);
        deskScene.setTravelTime(15);
        deskScene.setKeyItem(null);
        deskScene.setClue(null);
        deskScene.setNpcClue(null);
        scenes[SceneType.desk.ordinal()] = deskScene;
        } else {
           deskScene.setDescription(
                     "\nThe office is unkempt. There are piles of papers and file "
                             + "\nboxes everywhere. The walls are covered with "
                             + "\nnotes and photos with strings of yarn connecting "
                             + "\nthem. You notice a locked drawer and use the key"
                             + "\n you found on the subway to open it. Inside you"
                             + "\n find a notebook and recognize your handwriting:"
                             + "\n 'I know something is going on at the Gym, something"
                             + "\nbig! I have gotten a membership and have investigated"
                             + "\n under-cover so far, but I think they are onto me."
                             + "\nI have a feeling that I should be careful to stay"
                             + "\n on high alert and away from the tanning beds.");
        deskScene.setDisplaySymbol(" DK ");
        deskScene.setBlocked(false);
        deskScene.setTravelTime(15);
        Clue notebook = new Clue("Notebook","you were investigating some kind "
                + "\nof conspiracy going on at the Gym. ");
        deskScene.setKeyItem(null);
        deskScene.setClue(notebook);
        deskScene.setNpcClue(null);
        scenes[SceneType.desk.ordinal()] = deskScene; 
        }
        
        Scene officeStationScene = new Scene();
        officeStationScene.setDescription(
                     "You are on the subway platform with the journalism office "
                             + "\n to the East."
                   + "\nTrains are heading in multiple directions.");
        officeStationScene.setDisplaySymbol(" OS ");
        officeStationScene.setBlocked(false);
        officeStationScene.setTravelTime(15);
        officeStationScene.setKeyItem(null);
        officeStationScene.setClue(null);
        officeStationScene.setNpcClue(null);
        scenes[SceneType.officeStation.ordinal()] = officeStationScene;
        
        Scene gymLobbyScene = new Scene();
        gymLobbyScene.setDescription(
                     "A three-floor, 10,000-square-foot facility that is open "
                             + "\n24 hours. Its rows of of cardio equipment, "
                             + "\nstrength machines, free weights and medicine "
                             + "\nballs are mostly unused at this hour, however. "
                             + "\nThere are a few late-night fitness enthusiasts "
                             + "\nscattered throughout the building, but it is "
                             + "\nmostly quiet. You use your membership card to get in.");
        gymLobbyScene.setDisplaySymbol(" GL ");
        gymLobbyScene.setBlocked(false);
        gymLobbyScene.setTravelTime(15);
        gymLobbyScene.setKeyItem(null);
        gymLobbyScene.setClue(null);
        gymLobbyScene.setNpcClue(null);
        scenes[SceneType.gymLobby.ordinal()] = gymLobbyScene;
        
        Scene gymScene = new Scene();
        gymScene.setDescription(
                     "You are standing in a massive room with free weights on your "
                             + "\nleft and strength machines on your right. "
                             + "\nThe way to the locker rooms is South"
                             + "\n of your position and there is a strange"
                             + "\n and supiscious dark stairway to the West."
                             + "\n You find the nearby tanning beds of interest as"
                             + "\n your head starts to pound with pain. You remember"
                             + "\n being knocked out here and placed in a tanning bed."
                             + "\n that explains the sunburn... You also find a sticky-note"
                             + "\n attached to a damaged bed. It reads: 3-27-17 and"
                             + "\n 'YOUR NAME' in bold, quickly drawn out letters.");
        gymScene.setDisplaySymbol(" GM ");
        gymScene.setBlocked(false);
        gymScene.setTravelTime(15);
        noteObtained = true;
        KeyItem stickyNote = new KeyItem("Notebook","a sticky note with a locker combination"
                + "\n and the message 'YOUR NAME' in bold letters.");
        gymScene.setKeyItem(stickyNote);
        gymScene.setClue(null);
        gymScene.setNpcClue(null);
        scenes[SceneType.gym.ordinal()] = gymScene;
        
        Scene lockerRoomScene = new Scene();
        lockerRoomScene.setDescription(
                     "The locker room is empty this late at night."
                             + "\n You recognize your locker at the south end"
                             + "\n of the room. Number '777'. How lucky.");
        lockerRoomScene.setDisplaySymbol(" LR ");
        lockerRoomScene.setBlocked(false);
        lockerRoomScene.setTravelTime(15);
        lockerRoomScene.setKeyItem(null);
        lockerRoomScene.setClue(null);
        lockerRoomScene.setNpcClue(null);
        scenes[SceneType.lockerRoom.ordinal()] = lockerRoomScene;
        
        Scene lockerScene = new Scene();
         if (noteObtained = false){
        lockerScene.setDescription(
                     "You find your locker in the Gym, but it is locked by a combination coded lock."
                             + "\n You are unable to open it.");
        lockerScene.setDisplaySymbol(" LK ");
        lockerScene.setBlocked(false);
        lockerScene.setTravelTime(15);
        lockerScene.setKeyItem(null);
        lockerScene.setClue(null);
        lockerScene.setNpcClue(null);
        scenes[SceneType.locker.ordinal()] = lockerScene;
         } else{
             lockerScene.setDescription(
                     "You find your locker in the Gym, and are able to open it using the"
                             + "\n combination you found earlier. You find your phone. But it"
                             + "\nis password locked. You turn it on and make an attempt:");
        lockerScene.setDisplaySymbol(" LK ");
        lockerScene.setBlocked(false);
        lockerScene.setTravelTime(15);
        lockerScene.setKeyItem(null);
        lockerScene.setClue(null);
        lockerScene.setNpcClue(null);
        scenes[SceneType.locker.ordinal()] = lockerScene;
         }
        
        Scene basementDoorScene = new Scene();
        if (phoneMessage == true){
        basementDoorScene.setDescription(
                     "The room is old, dark and musty. "
                             + "There are boxes of storage and some broken fitness equipment scattered around. "
                             + "\nFollowing the phone message’s instructions, you find a strange panel on the wall and remove it. "
                             + "\nBehind it is a secret room. In this room is an ancient"
                             + "\n looking door with two scales and eight keys. Perhaps you"
                             + "\n can find the right key by weighing the different keys"
                             + "\n on the scales?");
        basementDoorScene.setDisplaySymbol(" BD ");
        basementDoorScene.setBlocked(false);
        basementDoorScene.setTravelTime(15);
        basementDoorScene.setKeyItem(null);
        basementDoorScene.setClue(null);
        basementDoorScene.setNpcClue(null);
        scenes[SceneType.basementDoor.ordinal()] = basementDoorScene;
        }else{
            basementDoorScene.setDescription(
                     "The room is old, dark and musty. "
                             + "\nThere are boxes of storage and some broken "
                             + "\nfitness equipment scattered around. "
                             + "\nThere doesn't seem to be anything of interest here...");
        basementDoorScene.setDisplaySymbol(" BD ");
        basementDoorScene.setBlocked(false);
        basementDoorScene.setTravelTime(15);
        basementDoorScene.setKeyItem(null);
        basementDoorScene.setClue(null);
        basementDoorScene.setNpcClue(null);
        scenes[SceneType.basementDoor.ordinal()] = basementDoorScene;
        }
        
        Scene basementEntranceScene = new Scene();
        basementEntranceScene.setDescription(
                     "The entrance to the society's secret base. It looks"
                             + "\n like a dungeon from ancient times with large"
                             + "\n stone walls and dark corriders. It's amazing"
                             + "\n something like this is hidden under the gym.");
        basementEntranceScene.setDisplaySymbol(" BE ");
        basementEntranceScene.setBlocked(false);
        basementEntranceScene.setTravelTime(15);
        basementEntranceScene.setKeyItem(null);
        basementEntranceScene.setClue(null);
        basementEntranceScene.setNpcClue(null);
        scenes[SceneType.basementEntrance.ordinal()] = basementEntranceScene;
        
        Scene diningHallScene = new Scene();
        diningHallScene.setDescription(
                     "It's a dining hall where the society must gather for "
                             + "meetings.");
        diningHallScene.setDisplaySymbol(" DH ");
        diningHallScene.setBlocked(false);
        diningHallScene.setTravelTime(15);
        diningHallScene.setKeyItem(null);
        diningHallScene.setClue(null);
        diningHallScene.setNpcClue(null);
        scenes[SceneType.diningHall.ordinal()] = diningHallScene;
        
        Scene labScene = new Scene();
        labScene.setDescription(
                     "A laboratory filled with neon vials and bubbling"
                             + "\n concoctions. It smells awful. You find a paper"
                             + "\n detailing a deadly poison the society plans to "
                             + "\nunleash onto the city! Next to the paper is a small"
                             + "\n white vial labeled, 'Antidote'. You decide this "
                             + "\nmust be the cure to the poison you feel coursing through you."
                             + "\n You take it and place it into your pocket. You also destroy all the"
                             + "\n equipment producing the poison. Now, you need to find a way out.");
        labScene.setDisplaySymbol(" LB ");
        labScene.setBlocked(false);
        labScene.setTravelTime(15);
        KeyItem antidote = new KeyItem("Antidote","a bottle of antidote to your poison.");
        labScene.setKeyItem(antidote);
        labScene.setClue(null);
        labScene.setNpcClue(null);
        antidoteFound = true;
        scenes[SceneType.lab.ordinal()] = labScene;
        
        
        Scene basementOfficeScene = new Scene();
        basementOfficeScene.setDescription(
                     "It's a small office in the hidden basement. "
                             + "\nThere is a society member at the desk, "
                             + "\nbut they don't seem bothered by you. They look up and"
                             + "\n say, 'Hey! I'm new! Are you one of the higher ups? "
                             + "\nJust so you know, I finished my job! The lab with the poison"
                             + "\n is all cleaned up! We shall release the toxin upon the"
                             + "\n unworthy in no time! Go Evil Team Force of Evil!'");
        basementOfficeScene.setDisplaySymbol(" BO ");
        basementOfficeScene.setBlocked(false);
        basementOfficeScene.setTravelTime(15);
        NpcClue societyMember = new NpcClue("\nSociety Member","that the society"
                + "\n plans to unleash a deadly poison onto the city! You need "
                + "\nto find the lab and stop it!");
        basementOfficeScene.setKeyItem(null);
        basementOfficeScene.setClue(null);
        basementOfficeScene.setNpcClue(societyMember);
        scenes[SceneType.basementOffice.ordinal()] = basementOfficeScene;
        
        
        Scene finishScene = new Scene();
        if (antidoteFound == true){
        finishScene.setDescription(
                     "You escape with your life from the dungeon and "
                             + "\nprepare to take the antidote to your"
                             + "\n poison...");
        finishScene.setDisplaySymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        finishScene.setKeyItem(null);
        finishScene.setClue(null);
        finishScene.setNpcClue(null);
        scenes[SceneType.finish.ordinal()] = finishScene;
        } else {
           finishScene.setDescription(
                     "You found the exit from the horrible dungeon. "
                             + "\nYou escape and tell the world about them and"
                             + "\n their deadly poison. You saved the world, but"
                             + "\n you never found the antidote for yourself. You"
                             + "\n die an unsung hero.");
        finishScene.setDisplaySymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        finishScene.setKeyItem(null);
        finishScene.setClue(null);
        finishScene.setNpcClue(null);
        scenes[SceneType.finish.ordinal()] = finishScene; 
        }
        
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
        locations[1][1].setScene(scenes[SceneType.lab.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.basementOffice.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.finish.ordinal()]);
    }

    
    
    
}
