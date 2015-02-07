package com.Njit.NicknameFree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler; 
import java.util.Random;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.view.Window;
import android.view.animation.RotateAnimation;
import android.view.animation.Animation;


public class loadActivity extends Activity
{
	
	private AdView adView;
	 /** Called when the activity is first created. */
	
		private static final float ROTATE_FROM = 0.0f;
	    private static final float ROTATE_TO = -10.0f * 360.0f;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.loading);
	     //--------------------------------------------ADMOB ADS------------------------------------   
	        adView = new AdView(this, AdSize.SMART_BANNER, "a14f9877db016b7");
	    	RelativeLayout  layout = (RelativeLayout)findViewById(R.id.loadLayout);
	    	layout.addView(adView);    	
	    	AdRequest adRequest = new AdRequest();    
	    	adView.loadAd(adRequest);   	
	    	
	        
	       //------------------SPINNING IMAGE---------------------------------------------------------------- 
	         
	        ImageView spiral = (ImageView) findViewById(R.id.imageView1);

	        RotateAnimation r;
	        r = new RotateAnimation(ROTATE_FROM, ROTATE_TO, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
	        r.setDuration((long) 5000);
	        r.setRepeatCount(0);
	        spiral.startAnimation(r);
	        
	   
	        //------------------------------------------------RANDOM NUMBERS------------------------------------------------------
	        
	       String user = getIntent().getStringExtra("username");
	 
	       
	   	
	       Random ran = new Random();
	       int num = ran.nextInt(25);  
	       int begEnd = ran.nextInt(7);   //has beginning will get ending?
	             
	       String nickname = "";
	       //-----------DATABASE OF NAMES, BEINNINGS, ENDS, and RANDOMS--------------------------------------------------------------------------------------------------
	       String [] Begs = {"Old ","Young ", "Fake ","Mc", "Dr. ", "Uncle ", "Captain ", "Lil ", "Big ", "Mayor ", "Professor ", "Sargeant ", "That ", "The ", "Lucky ", "Sad ", "Happy ", "Aunt ", "Momma ", "Poppa ", "Mr. ","Mrs. "};
	       String begName = Begs[ran.nextInt(Begs.length)];
	       String [] Ends = {" n'Steens"," Nugget",  " Juice", "-Squats", "-Squad", " Cat", " Dawg", " Cheese", " Brains", " Boy", " Thang", " Baby", " Muffin", "sWorth", " Chunks", " Residue", " Sauce", " One", " Crust", "skis", " Squizzle", " Status", "-oholic", " Steam", " Junk", " Goblin", " Fungus"};
	       String endName = Ends[ran.nextInt(Ends.length)];
	       
	       
	       String [] Anames = {"A-1", "Abby", "Abe", "AC-DC", "AntPee", "Antelope","AntPoo", "Articuno", "Armadillo","ArmadilloBack", "Aerodactyl", "AnkleHumper","ArtWork", "Accident", "Accomplice","Angle", "AngelFace", "Armpit","Ava", "Axe", "Aff","Aorta", "Awer", "Anybody","AllBall", "Alee", "Aloe","Advil", "Ain", "A", "Ash", "AssBottle", "AngryPants", "AssGoblin", "Awesome", "ArmCleet", "Agnus", "AtomBomb", "Angel", "Apple Sauce", "Aviloy", "AntEater", "ArmFuzz", "AlleyCat", "Artifact", "AnkleBreaker", "Armpit Sniffer", "Animal Kisser", "Apple Eater", "Axe Thrower", "Alakazam", "Android", "Afey", "Ace", "Avenger", "Antelope", "Anchor", "Abbacus", "AvocadoEye", "AcnePuss", "AcneButt", "Acne Ring", "AltaZora", "Abbreviator", "Adventurer", "A-Cup", "Afro", "AfterWhip", "A-Wall", "Ate-Em-All", "Asian", "Aldy", "Apu", "AquaCap", "AquaMan", "AquaCat", "A-bone", "ArmsWorth", "Adams Apple", "Ardle", "Amumu", "Atari", "Abra", "Adooby", "Avion", "Aviator", "AwesomeNip", "Abraham", "Airhead", "AngelFace", "Ambro", "Aladin", "Abu", "AhChoo", "A-time"};
	       String theNameA = Anames[ran.nextInt(Anames.length)];
	    
	        
	       String [] Bnames = {"Birdie", "Bear", "BulbTit", "Boob Slime", "Butthead", "Butt Crack", "BlowJay", "Buttercup", "Boinker" , "Bomber", "Binky", "Boil", "Boil Face", "BreadedNip", "Breaded Toe", "Butt Sniffer", "Boob Poker", "BobSledder", "Buff Burger", "Beefy", "BirdSquatch", "Bing", "Boing", "Banger", "Biggleton", "Bingo", "Baffy", "Bronum", "Bro", "Bratwurst", "Brink", "Birdo", "BedHead", "Bowser", "BroSauce", "Broloni", "B", "Barf", "BarfBreath", "Bunker", "Beard", "BreadBeard", "Baffle", "BoyCott", "Blinky", "Butch", "Big Big", "BadAss", "Bad", "Badgirl", "BrokenHip", "BeachLover", "Brazil", "BenJord", "BenchWarmer", "Berfday", "Birth", "BeechThumb", "Billyum", "Brainiac", "Bronzer", "Brody", "Brolavski", "Bistro", "Bopp", "Bling Bling", "Bling", "Buster", "Boozer", "BeerQueer", "Bubble", "BubbleBack","Baboon", "Badger", "Bandicoot", "Bass", "Black","Black Attack", "Bingo", "Bobcat", "Bison", "BlackBear","Booby", "Bovine", "Bongo", "Bluefish", "Beetle","Bronco", "Bunny", "BugZit", "Buck", "Boa", "Beautiful", "BenchWarmer", "Bench", "Binky"};
	       String theNameB = Bnames[ran.nextInt(Bnames.length)];
	       
	       String [] Cnames = {"Creepster", "Creep", "Creeper","CaffMap","Chiggy","Chubs","Chubby","Chronic","Choir","Chocolate","Chodey","China", "Chipmunk","C-Monkey","Chili","Chill","ChestPuppy","ChestWatch","CherryPop","Cherry","Chef","Cheddar","Checker","Chimpzee","Chimpo","Cheapo","Charity","Chapstick","Chap","CaveWoman","CaveMan","Cacti","Cactopuss","Cacky","Cash","Carrot-Top","Carmel","Caramel","CardShark","CanCan","Cannibal","Canker","Cranky","CankerSore","Candy-Ass","Cali","CakeWalk","C", "Chrissy","Chiblet","Cumberton","CucumberNeck","Coony","CoinBag","CutSomeone", "Chuff","Claptrap","Caboose","Coconut","Cuddler", "Charmer","Cheezley","Che","CornFlab","Cunk","CatWoman","CatMan","ConWoman","ConMan","Con Artist","CokePoker","CakeBrow", "Coke", "CorkPopper", "Cat", "CornBeef", "CrackOfDragon", "ChingChou", "CornSwallow", "Chap", "Changy", "Ching", "Chingy", "Chooky", "Charlie", "Cap", "CapTooth", "Carl", "CrankThat", "Crook", "Curly", "Curly Q", "C", "Caller", "Cackler", "CahkSmoker", "Cilia", "Clean", "Clerkle", "Cabbage", "CurbStomp", "Cutesie", "Cutey", "CarpetCrotch", "CarpetNip", "Cat", "Corpse", "Coiley", "Catcher", "Catch", "CaughtUp", "Cake", "CakeBatter", "CakeBelly", "ChinChilla", "Calamari", "Child", "Cabbie", "Ceasar", "Cage", };
	       String theNameC = Cnames[ran.nextInt(Cnames.length)];
	      
	       String [] Dnames = {"Dick", "Dirtball", "DirtyTit", "Dingo", "Doofus", "DonkeyScrotum", "Drizzy", "Dingleberry","Dill Pickle","Duffledump", "Dirk", "Dufus", "Dumbo", "Ding Dong Ditcher", "Donkey Kong", "Diddly Doodle", "Drifter", "Dripster", "Drippy", "Droopy", "Dorky", "Dragon Master", "Dooey", "Dinky", "Derp", "Dunder", "Dunky", "Dipstick", "Doodle", "Dude", "Dudette", "Dent", "Dragon", "Drool", "Dribble", "Dubby", "Dirty", "Dew", "Dandruff", "Dandy", "Dank", "Duffle", "Dinkleberry", "Door Stopper", "Doorknob", "Dancer", "Dancey Pants", "Dreep", "Drowsy", "Drifty", "Dimple Dong", "Dimp", "Deenky", "Dookie", "Diablo", "Daddy", "Disaster", "Donut Vacuum", "Doughboy", "Dunny", "Dougie", "Daydreamer", "Diggy", "Darling", "Dollface", "Danger", "Dazzler", "Dwarf", "Duckling", "Duckface", "Dabbler", "Dairy Queen", "Dangler", "Darwin", "Dalmation", "Dogface", "Deedle", "Drippy Butt", "Diarrhea", "Dirby", "DeeDee", "Dumpster", "Daple", "Donut", "Diglet", "Dugtrio", "Diffy"};
	       String theNameD = Dnames[ran.nextInt(Dnames.length)];
	       
	       String [] Enames = {"Emilio","Esteban", "Eminem", "Exxon", "Email", "Equipment","Eliza", "Elvin", "English", "European", "Euro","Erffin", "ErfWorm", "Erfy", "EdBo", "Eggnog","Even", "Eclipse", "Emblem", "Elbow", "Equator","Elixer", "Empire", "Enzyme", "Editor", "Essay", "Emission", "E-boner", "Ebony", "Electrifier", "Electric", "Effect", "Engine", "Envelope", "Earthquake", "Eagle", "Elk","Elmo", "Ether", "Elton", "Earwig", "Earthworm", "Elephant", "Entertainer", "Enjoyer", "Elly", "Educate-Me", "Excreted", "Extremist", "Expert", "Elaborater","Eloper", "Easy", "Excellent", "Efficient", "Elegant", "Enchanted", "Enchanter", "Enlighted", "Eva Eva", "Eva", "Energizer", "Energy", "Estrogen", "Erit Erit", "Eraser", "Ebbzee", "Executioner", "Excuse", "Evacuator", "Eeky", "Escort", "Equal", "EpicFail", "EgoManiac", "EgoBoost", "Eevee", "Eve", "EyeBoogy", "Eye", "EyeBall", "Eggley", "EggHead", "EggWoman", "EggMan", "EelFeeler", "EelDrip", "Eel", "ElfWarrior", "Ella", "Elvis", "Elf", "EarDrop", "Ecstasy", "Easy-E", "EZ", "E", "Edge", "Echo", "Echo", "EcoBoost", "Economy", "Earner", "Ear", "EarFlab", "EarWorm", "EgoTrip", "EarlyBird", "Earl", "EarBoob", "Eagle", "EggBert", "Eskimo", "Ehh", "Emilio", "Epicness", "Evil", "EntranceToAnus"};
	       String theNameE = Enames[ran.nextInt(Enames.length)];
	       
	       String [] Fnames = {"Fat", "FatBall", "FartKnocker", "FreeBird", "Froto", "F-Sizzle", "FingerBang", "FakieBorsh", "Fruitcup", "Fruitcake", "Flirt", "Fanta", "Flapper", "Flappy", "Floppy", "Floop", "Fart", "Fartikus", "Fishbreathe", "Fishy", "Finkle", "French Fry", "Fribble", "Frankenstein", "Frulenhiemer", "Frosty Boob", "Finisher", "Flipper", "Funny Guy", "Fartknocker", "French Crueler", "Francios", "Fancy Pants", "Fingerlicker", "Fapper", "Faptimus Prime", "Flip-Flopper", "Floozy", "Floss-eater", "Flinkydink", "Funkster", "Fruitloop", "Fro", "Flo", "Fifo", "Furry Face", "Fuzzy Fingers", "Fatty", "Fat Friend", "Fuzz", "Fapenstein", "Fapmaster", "Faptina", "Frip", "Fin", "Fast Fapper", "Four-eyes", "Fanny Hammock", "Fanny", "Farfenoogan", "Farfrumpoopin", "Farkle", "Farmer Fooble", "Fipster", "Fapster", "Furp", "Funktabular", "Frosted Flake", "Frosty Nip", "Feemur", "False Foot", "Footlicker", "Foot Fiend", "Footmuncher", "Foozer", "Fez", "Fester", "Frimmy", "Feet-eater", "Forker", "Fonzi", "Fizzler", "Flabby", "Fat Flab", "Flake", "Flamer", "Flapdoodle", "Flapdinger", "Flasher", "Flatback", "Flea-bag", "Fleaflicker", "Flipper", "Flip Nugget", "Flusher", "Floater", "Frogger", "Frog Feeder", "Flogger", "Flotard", "Flub", "Fluffernutter", "Flier", "Foofy", "Fool", "Feeler", "Foreskin", "Floppy Foreskin", "Fringe", "Foxy Face", "Freshy", "Fried Fish", "Fish Funk", "Fungus-face", "Fungi", "Fungal", "Frisk", "Fritz", "Fritter", "Frombe", "Frou-Frou", "Fubb", "Flubster", "Fum", "Fudge", "Fudgenut", "Funnybutt", "Fluffikin", "Fugly"};
	       String theNameF = Fnames[ran.nextInt(Fnames.length)];
	       
	       String [] Gnames = {"Globlin","GnomeBoner", "Gint", "Googlin", "Gay", "GigglePuss", "Gargler", "Growth", "Goggle", "Gangar", "Gunk", "Ginger", "Gingerbread", "Gingey", "Goblin", "Green Goblin", "Gummy", "Gummybear", "Gum Job", "Guargum", "Guilty Gut", "Gutmuncher", "Gutter", "Gargoyle", "Garbage", "Gagger", "Gaggasaurus", "Ganglia", "Gayboy", "Ganky", "Grime", "Groper", "Grapenut", "Grope", "Grip", "Gross", "Grunge", "Gizmo", "Gremlin", "Grit-eater", "Grinner", "Grin", "Glop", "Gluestick", "Gazi", "Grass Ass", "Green Machine", "Goop", "Goon", "Gleek", "Geek", "Girdle", "Gurgle", "Gawker", "Grahamcracker", "Giant", "Great Gobble", "Gobbler", "Gaga", "Gangster", "Gap-tooth", "Gappy", "Guzzler", "Gassy Ass", "Gasser", "Gazunga", "Gender Bender", "Gutt-scuffer", "Guzunder", "Gwart", "Guzz", "Gyno", "Grass Cutter", "Grave-digger", "Grazer", "Greaser", "Grab-ass", "Goopert", "Goosh", "Glosh", "Gootch", "Goose", "Goofball", "Goofy Goober", "Goober", "Googlion", "Gook", "Goombah", "Gloomer", "Goody2shoe", "Goobwad", "Gold-digger", "Gomer", "Golly", "Goatlicker", "Gluteus Maximus", "Gluton", "Glish", "Great Gobble", "Gimpy", "Glimmer", "George Washington", "Gingah", "Gine", "Ginormo", "Giraffe", "Gorilla", "Gofer", "Giggleberry", "Gigglestick", "Gigglepuss", "Gigolo", "Grinch", "Grumb", "Ghetto Gunk", "Go-getter", "Getchy", "Ghostlicker", "Gorlami", "Gib", "Gibble", "G-funk", "G-bub"};
	       String theNameG = Gnames[ran.nextInt(Gnames.length)];
	       
	       String [] Hnames = {"Hitman", "HotSnatch", "Heepy", "Hulk", "Heavenly","HillBilly", "Hamper", "HotSalsa", "Hippo", "Hipster", "Hipbreaker", "Hearthandler", "Heart-stopper", "Hooty-Hoo", "Hollerback", "Horny", "Hairy", "Hinkle", "Hurl", "Hurlsalot", "Horner", "Hokuspokus", "Honk", "Hurp", "Herpie", "Handless", "Harley", "Hiplydip", "Hunkachunk", "Hubbahubba", "Hurdle", "Hipcrunch", "Headcase", "Headache", "Hefty", "Heifer", "Hitter", "Hopeless", "Hanky-panky", "Hankie", "Hacker", "Heckler", "Halfwit", "Halla", "Hathead", "Hunchback", "Horseface", "Hambone", "Hammy", "Ham-flap", "Hammer", "Hamster", "Hamper", "Handlebar", "Hairball", "Happy", "Hardass", "Hatchet", "Hash", "Hater", "Heavy Nip", "Hairy Pit", "Hairy Flap", "Hairy Toe", "Hairy Crack", "Hairy Back", "Hairy Eye", "Hairy Sty", "Hairy Tooth", "Hearder", "Hairy Crotch", "Hitler", "Hokie-pokie", "Hairy Hip", "Hanzel", "Hazelnut", "Heavy", "Hunk", "Hiphop", "Hopper", "Hercules", "Hyena", "Hitch-hiker", "Hoo-ha", "Hipply", "Happyfeet", "Hopper", "Hoop", "Hammock", "Hermana", "Hermano", "Hangdang", "He-she", "Heart-throb", "Heebie-jeebie", "Hellacopter Heaad", "Hellokitty", "Hell Hole", "Hermit Crab", "Hermie", "Hickey", "Hillbilly", "Hubert", "Hype-head", "Hissy", "Hizzy", "Hobag", "Hobagel", "Hobnob", "Hobo", "Hormone", "Hippie", "Hockeypuck", "Honey", "Honeybuns", "Honeybunches", "Honeybee", "Hottie-tottie", "Hotstuff", "Humpsalot", "Hufflepuff", "Huff", "Humpty Dumpty", "Hulahoop", "Hempy", "Hairless", "Hooch", "Homeslice"};
	       String theNameH = Hnames[ran.nextInt(Hnames.length)];
	       
	       String [] Inames = {"Ippy", "I-Pee", "I-Poop", "I-Cute", "I-Lover", "ICU", "I-T", "I-Flow","I-Wanker", "I-Stank", "I-Cane", "I-Snatch", "Iced Tea", "I-Smoker", "I-Crack", "I-Doosh","Ippity", "Ion", "Inviter", "Introdoosh", "In The Zone", "InAFunk", "Illegal", "Illmatic","Ill", "Ike", "Iffy", "Indy Bindy", "IndyFood", "Indy", "Indian", "Idjit","Idiot Proof", "Im Gorgeous", "I Love Me", "I Am Cute", "Ivan", "Irkle", "ItBee", "Idiot","Iota", "Idiota", "Icing", "Icky Vicky", "IcedOut", "IcedWrist", "IceyWrist", "IceyNeck","IcedNeck", "IceyChin", "IceBurg", "Ice", "Ight", "IntoMe", "IgglyPuff", "IggyBuff", "Ish", "Idiot", "Iggy", "Invisible", "InTheEar", "Ibbin", "Ight Peace"};
	       String theNameI = Inames[ran.nextInt(Inames.length)];
	       
	       String [] Jnames = {"Jord", "JingleSnatch", "Jiggley", "JuicyHole", "Jokey", "Jasper", "Jedi", "Jigglypuff", "Jiggler", "Jingle", "Juicer", "Juicehead", "Juicey Junk", "Juicey Butt", "Jambalaya", "Jungle Joe", "Jiggle Junk", "Jumper", "Jumping Jack", "Jiggle Toe", "Juice Box", "Jungle Fro", "Jabroni", "Jammer", "Jam", "Jackass", "Jackhole", "Jackhammer", "Jackolantern", "Jailbait", "Jazz", "Jazzerina", "Jizzhead", "Jizzabelle", "Jelly", "Jellysickle", "Jellystick", "Jello", "Jellybelly", "Jerkwad", "Jerkazoid", "Jezebel", "Jiff", "Jig", "Jug", "Juggler", "Jug Rug", "Joink", "Jinker", "Jigger", "Jiggle-stacks", "Jiggle-pig", "Jug Jiggler", "Jig Jag", "Jitterbug", "Jitterjaw", "Jitter Jugs", "Jive Turkey", "Jizm", "Jizz Rag", "Jobbie", "Jock", "Joe Schmoe", "Joker", "Jammin Joke", "Joggle", "John Hancock", "Johnny No Name", "Jiggly Eyes", "Jimmy Crack Corn", "Jeffle", "Joker", "Joking Johnny", "Jumping Jimmy", "Jolly", "Joyful Joe", "Joop", "Jeeper", "Joygasm", "Joyboy", "Joytoy", "Jubby", "Jippy", "Jerz", "Juble", "Juggalo", "Juju", "Jujubean", "Jumpoff", "Jumpon", "Jabberjaw", "Jabber", "Junky Janitor", "Joypop", "Jolt", "Jooba", "Jewel", "Justie", "Joop", "Juba", "Jefe", "Juandicimo", "Jinn", "Jango", "Juicey Leg", "Juicey Face", "Jerkbutt", "Jerkfinger", "Juicy Ear", "Jiggly Legs", "Jiggly Chin", "Jigglepits", "Jingle Tooth", "Jumping Jooper", "Jellyroll", "Jemflem", "Juicy Funk", "Jingleboob", "Jople", "Janky Stank", "Jimmy Jiggle", "Jizzy Juicer", "Jeeping Claw", "Jawdropper", "Jaw-popper", "Junk", "Jammie Jammer", "Jipple Nipple", "Jacuzzi", "Jamster", "Juicy Jingleball", "Jumping Juicybutt", "Jay Jay", "Jay Snazz", "J-bad", "J-crazy", "J-nasty", "J-papa", "J-bomb"};
	       String theNameJ = Jnames[ran.nextInt(Jnames.length)];
	       
	       String [] Knames = {"Knots", "Kent", "Knife", "Kataya", "Kiki", "KickMe", "Koopa", "Killer Cobra", "Killer Kan", "Killa Vanilla", "Killa", "Kranky", "Krank", "Krack", "Krusty", "Krusty Krab", "Krab", "Krab-ass", "Krabbypants", "Krusty Nut", "Krusty Face", "Krinkle", "Kink", "Koopa", "Kook", "Kookie Pookie", "Kipple", "Kibble", "Krum", "Kibble N Bits", "Kripple Kat", "Kangaroo", "Kaka", "Kakahead", "Kakawaka", "Kamikaze", "Kankle", "Kank Stank", "Kanoodle", "Kurd", "Krust Kangaroo", "Kappa Slappa", "Keeper", "Keep-it-real", "Kegger", "Kegstand", "Keep-it-on", "Keghead", "Keg-leg", "Keister", "Kemo Sabe", "Ken-doll", "Kerple", "Kunk", "Korky", "Keyhole", "Kickass", "Kick", "Kissass", "Kissy Hissy", "Killshark", "Kind Krab", "Kipster", "Kuddle Krab", "Kitty Killer", "Kitty Licker", "Kitten", "Klutzy Klown", "Klutz", "Klown", "Knob Gobbler", "Knob Slob", "Knobhead", "Knobslob", "Knockout", "Kettle", "Knocker", "Knot-tier", "Know-it-all", "Knows-nothing", "Knucklehead", "Kool-aid", "Kool Kid", "Kirb Stomper", "Kirby", "Krispy K", "K-nasty", "K-rad", "K-fab", "Krispy Kat", "Krakalack", "K-kronic", "K-cool", "K-ill", "Krunk", "Krunkster", "Kudo", "Kupple", "Kudo Klown", "Kumfum", "Kurp", "Kweef", "K-fresh", "K-baller", "Killa K-bomb", "Korny K Krust", "Kornball K", "Kooky K", "Kip", "Klean Kruster", "Kelp", "Kissabutt", "Koo-koo", "Kraft", "Kashmir", "Kinkle Kiss", "Kelpfish", "Kitten Kisser", "Kyoto", "Knick Knack", "Koala", "Krunch"};
	       String theNameK = Knames[ran.nextInt(Knames.length)];
	       
	       String [] Lnames = {"LawBreaker", "Lift", "Loosey", "LooseSac", "LoveBug", "LipCrust", "Levelin", "Lintlicker", "Lick-a-tongue", "Lick", "Lint", "Lintball", "Lollipop", "Lolly", "Lip", "Lillypad", "Laundry Licker", "Listerine Lover", "Love", "Lingerer", "Lippy", "Link", "Lint-toes", "Lizard Lover", "Lizard", "Lumberjack", "Lump", "Lumpy Lip", "Lumpy Leg", "Lumpy Stump", "Lollygag", "Leopard", "Lion", "Lion Licker", "Limper", "Leek", "Leeksalot", "Leeker", "Lerk", "Lamp", "Lady", "Lord", "Lagger", "La La", "L-squash", "L-smash", "L-chops", "Lambchops", "Lamb", "Lame-o", "Lamesquad", "Lamebrain", "Lapdog", "Lappy", "Lard", "Lardass", "Lardo", "Large and in Charge", "Lobster", "Landshark", "Leanbean", "Leech", "Leaper", "Leap", "Leaker", "Leftie", "Left-eyed", "Left-boob", "Lank", "Loser", "Loserpants", "Loserface", "Loserbutt", "Liceball", "Lice Lover", "Losertoes", "Legend", "Legendary", "Legit", "Liggle", "Loft", "Lopsided", "Loop", "Lightening bug", "Lightweight", "Lighty", "Limp Lion", "Liter", "Lunchbox", "Little Fella", "Lump Load", "Lunch Lump", "Little Loaf", "Little Licker", "Limp Loaf", "Lard Loaf", "Lard Loagie", "Loagie", "L-stanky", "L-fly", "Loco Lola", "Loca", "Lonely", "Little La La", "Lonely Larry", "Loco Coco", "Lowlife", "Log", "Lolita", "Long Dong", "Lookie", "Loony", "Looney Lard", "Lopsided Larry", "Loose Lucy", "Lost Lucy", "Loosie Goosie", "Loud Lisa", "Lard Lizard", "Limpy Lumpy", "Lousy Lou", "Lucy Loo", "Lovebird", "Ladybug", "Lovestick", "Lowball", "Loo-Loo", "Lube", "Lube Mouth", "Luck", "Lube Mountain", "Lucky Lou", "Licky Luck"};
	       String theNameL = Lnames[ran.nextInt(Lnames.length)];
	       
	       String [] Mnames = {"ManBoob", "Milfy", "Morg", "Mr Sir", "MooseBump", "Mildew", "Maven", "ManJenkins","Moneybanks", "Maxa Millionaire", "Moneysnatcher", "Monkey", "Monkeybrain", "Monkeyballsac", "Misfit", "Moseby", "Mashedpotato", "Moron", "Milk Maid", "Milk", "Mardi", "Meddler", "Merck", "Mommylover", "Mamapants", "Milkdud", "Milf", "Munch", "Munchabunch", "Mermaid", "Marmalade", "Moofy", "Muffincup", "Muff", "Macdaddy", "Macho Man", "Mackadocious", "Mac Momma", "Mad-hatter", "Mad Cow", "Maggot", "Mafia", "Mafugly", "Magic Maker", "Magic Karp", "Magic Mushroom", "Mushroom ", "Main Squeeze", "Mountain", "Montana", "Mini Me", "Mama Jama", "Mamasita", "Mami Chulo", "Mami Salami", "Man Boob", "Monster", "Maniac", "Man Chowder", "Man Powder", "Mob Slob", "Mangina", "Melonhead", "Masturbator", "Manatee", "Manky", "Manzilla", "Mario", "Mipple Monster", "Mayonnaise", "Mustard", "Matako", "Mate", "McDreamy", "McFart", "McDonald", "Measle", "Meat", "Meatwallet", "Meatwasher", "Mega Poop", "Mega Mooch", "Moocher", "Mellow Fellow", "Marshmallow", "Meow", "Meowmix", "Misfit", "Munchkin", "Moop", "Meter Maid", "Meter Eater", "Mickey Mouse", "Mouse Pee", "Midget", "Middle Mucher", "Milkaholic", "Mimzy", "Master Mind", "Mindless", "Mickle Fick", "Mingler", "Mingle Dingle", "Miniwheat", "Mint Poop", "Mitt", "Mudbutt", "Muddy Buddy", "Mudpie", "Mob Bob", "Mobee", "Model Muck", "Muck Slinger", "Mole", "Moist Muffin", "Mollywhop", "Mondo", "Moonshine", "Moneymaker", "Mongoose", "Moose", "Moolah", "Mildew", "Moo Juice", "Meese", "Moose Knuckle", "Monte Carlo", "Meat Meater", "Mormon", "Morning Wood", "Mosquito", "Mohito", "Mahbingo", "Motherload", "Motor Boat", "Mounty", "Mouth", "Murchen", "Muglet", "Muzzle", "Mule", "Murderer"};
	       String theNameM = Mnames[ran.nextInt(Mnames.length)];
	       
	       String [] Nnames = {"Noob", "n/a", "Niner", "NineTit", "Neanderthal", "NumbFlap", "NumbLips", "Nuke", "Ninja", "NinjaWarrior", "NitWit", "NoName","NeckGrowth", "Nitrogen", "Nitro", "Nod", "NubGrowth", "Nympho", "Nokia", "NutCrunch", "Nutbar", "Nurple", "Nanny","NubTouch", "NubGoblin", "Nabber", "NeckSlime", "NerfDart", "NuNa", "Numby", "Numbskull", "Nursey", "Nurse", "Nuzzler","Nuzzle", "Nunchuk", "Nucleus", "Nubbin", "Nothing", "Novelist", "Note Writer", "Noodle", "Nicky", "Nixy", "NanoGram","Nano", "Nazi Zombie", "Nazi", "Neighbor", "Needy", "NerdPimple", "Nevel", "Nincumpoomp", "Nebble", "Ninetales", "Naughty","Naturist", "Nebular", "Nebzo", "Neckline", "Negro", "Nautical", "NumNum", "Number", "Necro", "Needle", "Neat","Nad", "Nanny", "Narrator", "Narc", "Nunu", "NC", "NoseCrumb", "NoseBleed", "Nose", "Nefzee", "Nurple","NubTit", "Noon", "Nicki", "NastyAss", "Nasty", "Norman", "Nubby", "Noodle", "Ned", "NeckDot", "NeckPimple","NeckZit", "Neck", "Nipsy", "Nip", "Napple", "Nancy", "Nitch", "Neek", "Nidorino", "Nidorina", "Nidoking","Nidaqueen", "Nizz", "Nizzy", "Nifty", "Nice", "NutLicker", "NutToucher", "Nut", "Nozzler", "Nozzle", "Nerd", "Nundo", "Noop", "Nabbles", "NubDick", "NipSlime", "Nonsense", "Nelbow"};
	       String theNameN = Nnames[ran.nextInt(Nnames.length)];
	       
	       String [] Onames = {"OwlPop", "Otay", "OT", "Oscar", "Orc", "OrangeNail", "OrangeGum", "OrangeHip", "Orangehair", "OrangeHead","OffDaHook", "OffDaChain", "Oi", "Orangutan", "Orange", "OnionHand", "OnionTongue", "OnionPit", "OnionChin", "Onion", "OnFire", "Ole One Eye", "Omega", "Olay", "Olympia", "Ole Betsy","Oogie Boogie", "Oklahoma", "OokeyDokey", "OkeyDoke", "OK","OkayOkay", "Okay", "Ojay", "OJ", "Oinker", "Oink", "Oh Snap", "Oh Sheesh", "OMG", "OH","Offline", "Offie", "Offensive Coordinator", "Official", "OffDaHeezy", "OffTopic", "Offer", "OffMe", "O-face", "OD","Ockler", "OC", "Only", "OnlyMe", "Obvious", "Obvi", "Obscure", "OnTop", "Orbiter", "OtterTummy","OtterBack", "OtterFace", "Otter", "Obese", "Obeast", "Obama", "Opoly", "Oater", "Oats", "Oaf","Oatmeal", "OddLong", "Ownage", "Octopus", "Oodie", "OfficeSkank", "Orgy"};
	       String theNameO = Onames[ran.nextInt(Onames.length)];
	       
	       String [] Pnames = {"Pixie", "Peggy", "Pitcher", "Pitch", "PillPopper", "Pill", "Prozac", "Prunyion", "Prudder", "Pray", "PoopMouth", "PottyMouth","Poet", "Plumsy", "Polish", "Polka", "Pulp Fiction", "Piano", "Prowler", "Prowl", "PushMe", "Pushy", "Pope", "Prankster","Prong", "Pup", "Puppy", "Poser", "Pikachu", "PikaTit", "Plum", "PeekABoo", "Paolo", "Pharm", "Pipe", "Piper","Pidgey", "P", "Pidgeyoot", "Primeape", "Primeate", "Pidgeot", "Pidgeotto", "Parasect", "Parasite", "Plank", "Proxy", "Phlox","Pinko", "Peety", "Persister", "PaperGetter", "Pinsir", "PinBig", "PunBig", "Pun", "Pecky", "Pervert", "Pierre", "Perdy","Proton", "Pacer", "Pacifire", "Patty", "Paddy", "PimpleButt", "PimpleOnButt", "PimpleOnNub", "Pimple", "PimpU", "Pimp", "Pamp","Pamperer", "Pampos", "Pagan", "Painstaker", "Pain", "Paranoid", "Pelvis", "Punter", "Punt", "Porp", "Peek", "Peck","Penny", "PennyNip", "Pencil", "PinkTit", "Penis", "Pelvin", "Paper", "Playdoh", "Plato", "Pudding", "PurpleEye", "PurpleCalf","PurpleFat", "PurpleNut", "Psycho", "Psychic", "Psyduck", "Psymon", "Platypus", "Pudge", "Pudgey", "Packer", "PatMe", "PapStick","PipLick", "Passive", "Potent", "Portant", "Pippy", "Punkster", "Punk", "Pipsy", "Peepee", "PP", "Piss", "Poop","PissStain", "PooMop", "PurpleAss", "Pony", "Pazzle", "Poon", "PootieTang", "Pounder", "Pacman"};
	       String theNameP = Pnames[ran.nextInt(Pnames.length)];
	       	    
	       String [] Qnames = {"Quagmire", "Quagliana", "QuagStick", "QooQoo", "Qoph", "Quiji", "Quaft", "Quadroxide", "QueenCraft", "Queezy", "QueerMo","Queer", "Queerm", "Quark", "Quencher", "Quamcuat", "Qazi", "Quoon", "Quevel", "Queeko", "Quinkmo", "Quizmo","Quartz", "Quartzite", "Quarto", "Quay", "Quest", "Quester", "Quarry", "Quart", "Quater", "QuickSilver", "Que","QuedUp", "Quibsy", "Quib", "Quilter", "Quilt", "Quieteer", "Quite", "Quotient", "Quook", "Quitter", "Quintuplet","Quizzer", "Quiz", "Quirky", "Quirk", "Quank", "Quanky", "Quality", "Quail", "QuailButt", "Quail", "Quidditch","Quadder", "Quad", "Queen", "QueenBee", "Quincy", "Quinn", "Quacker", "Quack", "QT", "Q&A", "QQ","Quickie", "QueenBee", "Queezer", "Quota", "Quackers", "Queefy", "Queerdo","Q-Tip"};
	       String theNameQ = Qnames[ran.nextInt(Qnames.length)];
	       
	       String [] Rnames = {"RedTooth", "Rotation", "Rodent", "Real Real", "Rifter Crack", "Rinky Foot", "Ringo", "Radical", "Rufawnda", "Roofie", "Ruff", "Ruff Rider", "Rangler", "Rant", "Rip", "Ripper", "Reek", "Rank", "Rusty Busty", "Rinky Tinky", "Roger Rabbit", "Ron", "Rabbit Lord", "Rizzle", "Ratface", "Ratbreathe", "Rusty Balls", "Ruby", "Runt", "Rooster", "Rocko", "Rockstar", "Romper", "Rotten Egg", "Rotting Buns", "Riphead", "Ribble", "Reeper", "Rat Runner", "Rackdaddy", "Racoonface", "Rage", "Rageaholic", "Rampage", "Rag", "Railing", "Raindrop", "Ripple Nipple", "Raisin", "Raunch", "Ralpher", "Rambo", "Rump Roast", "Raspy", "Rathole", "Retart", "Rinse", "Rawr", "Rave", "Razorblade", "Razzle", "Rebound", "Ridiculous", "Redic Rick", "Redhead", "Redhot", "Redneck", "Reef", "Reepler", "Rumplestiltskins", "Referee", "Refried Bacon", "Refried Nipple", "Refried Donk", "Rejiggler", "Rent-a-cop", "Reptile Rocker", "Reptile Lip", "Re-re", "Restroom", "Rex", "Rhino", "Riblet", "Rib Rub", "Rice Runt", "Rice Rake", "Rico Suave", "Right Tit", "Right Nip", "Right Butt Cheek", "Rim Job", "Rinky-dink", "Ripe Melon", "Roach", "Roach Nibbler", "Roach Nuts", "Roasted Balls", "Roast Beef", "Rugrat", "Rack City", "Racoon Face", "Realness", "Reality Check", "RedNeck", "Raji", "ReefQueef", "Reefer", "Reverb", "Redrum", "Repo", "Ripper", "RipNip", "Reptile", "Repuke", "Ree-ree", "Ribo", "Rybo", "Ribcage", "Rib", "Rango", "Ringo", "Rasta", "RedFoot", "Roney", "Reek", "Roidz", "Roader", "Rick", "Rachey"};
	       String theNameR = Rnames[ran.nextInt(Rnames.length)];
	       
	       String [] Snames = {"Shoobie", "Sac Dipper", "SockRobber", "Singe", "Sift", "Sink", "Soda", "SoiledPants", "Sabre", "Sabertooth","Sack", "Sack Tap", "Sacred","Sacred Cow", "Satan", "Salmon","Salt", "Salty", "Salty Nugget","Salty Sploosh", "Salty Hip", "Salty Fish","Savy", "Samezee", "Sammich","Samolian", "Squirtle", "SassBox","Sauce", "Sauerkraut", "Sausage","SausageTip", "ScaredyPants", "Scar","Scarlet", "Schmegma", "Schmeggy","Schmuck", "Snazzy", "Shnozz","School", "Schwasted", "Scissor","Saree", "Sammy", "Sprinkler","Scrambler", "Scrake", "Scrank","Screamer", "Screamo", "Scratcher","Scrilla", "Scrip", "Scrabble","SrcabblePuss", "Scroggy", "Scrub","Scrubby", "Scurvy", "ScuttleButt","Skype", "SeaPuss", "SeaDonkey","SeaMonkey", "Skippy", "Scooter","Skeeter", "Scamper", "Stimpy","Scruffy", "Stinky", "Squirmy","StankThang", "Stanky", "StankBreff","StankyToes", "Second", "Second Place","Sword", "Sword Fighter", "SwordCrosser","Sexy", "So Fine", "So Cute","So Hott", "So Handsome", "So Dumb","So Stupid", "Secret", "Seed","Shoppy", "Seventy", "Sewer","SewerBreath", "SewerPants", "SmellyTit","Sexy", "Sex", "Sex Bomb","Sexcapade", "Shady", "Shag","Shaggy", "Sharpener", "Sharpie","Shawty", "ShawTay", "Shazbot","ShamWow", "Sheepy", "Sheers","Shitey", "ShipBrick", "Shaco","Shakey", "Shank", "Shanky","Shiznit", "ShortBus", "ShortStuff","Shotgun", "SweatGums", "SweatBack","SweatNeck", "SweetHeart", "Sweety","Sweetypie", "SchweddyBalls", "Shy","Sic", "Sicknasty", "Sickly","Sick", "SixToe", "SixFinger","SixFlags", "Sacthel", "StinkBug","Studio", "Sketchball", "Sketch","SketchArtist", "Skibble", "SkidMark","Skiddy", "Skittle", "Slasher","Slaughter", "Slingo", "Slave","SleazeBall", "Sleepy", "Slow-Mo","Sloppy", "Slopster", "Sloth","Slug", "Sluggy","Sasha", "Stasia", "SageManger", "Super"};
	       String theNameS = Snames[ran.nextInt(Snames.length)];
	       
	       String [] Tnames = {"Test", "Taff", "Tow", "Tang", "Tevel", "TorchButt", "Toucher", "Touchsoft", "Tosser", "Toss", "Too Ruch", "Tooney","Too Much", "ToolBox", "Tool", "Toodle", "Too Cool", "Tonk", "Todd", "ToastedLips", "ToastedAss", "Toaster", "Toast", "TLC","Tinkerbell", "Tinfoil", "Ting", "Tina", "Time Bomb", "Time", "Time Cruncher", "Tawsome", "Taint", "Teresa", "TimJim", "TimbuckToo", "Timbo","Tilter", "Tilt", "Tick", "Thunder Thighs", "Thumper", "Thump", "Thugly", "Thug", "Throw Up", "Thrasher", "Thirp", "ThongHead","Thong", "Thorny", "Thizz", "Thingamabobber", "Thingamajig", "That Thing", "Thing", "ThinStick", "Thin", "TugJob", "Tug", "T T","Thick As Hell", "Thick", "That Guy", "That Ish", "That Stuff", "That Dude", "That Chick", "Thinker", "Thirty", "Thai Food", "Thai", "Turk","Tub", "Texter", "Text", "Texas", "Television", "Teepee", "Tint", "TeenyBobber", "Tech Genius", "Techno", "Tech", "Technician","Tech N9ne", "TeaBag", "TeaBomb", "Taxer", "Tax", "TaterSalad", "Tater", "Tata", "Tatt", "Tartsy", "Tart", "Talker","Talk", "TentacleNub", "TentaclePipi", "Tentacle", "Taco Smell", "Taco Hell", "Taco Bell", "Tack", "Thood", "Thexer", "Thunderstruck", "Thunder","Thapple", "TeflonDon", "Teflon", "Tevlin", "Tupperware", "TooUgly", "TooCute", "Teddy", "Tofu", "Terdle", "TableDancer", "Table","TurkeyChest", "TurkeyNeck", "TurtleNeck", "Turkey", "Terd", "Terd Burgalar", "Tip", "Tipsy", "Tourist", "Taurus", "Toad", "Tatch","Tap", "Tapper", "TadPole", "Tinkle", "Teet", "Toot", "Tangle", "Titty", "Tit", "TopBack", "TopOff", "Tingle","Terd", "Tickled", "Tit Enlarger", "Tyke", "Tindo", "Turf", "Tidge"};
	       String theNameT = Tnames[ran.nextInt(Tnames.length)]; 
	       
	       String [] Unames = {"Ubee", "Urf", "Uptight", "Up The Butt", "UpperHand", "UpperDecker", "UpperCrack", "UpperPube", "UpInThis", "UpInYa","UpInYaGrill", "UpChuck", "Unwind", "Utopia", "Unreal", "Uven", "Ux", "Unpossible", "Universal", "Universe","Unknown", "Uni", "UniBrow Pube", "UniBrow", "Ungodly", "Unfriend", "UnderCrotch", "Uptown", "UnderBra", "UnderWear", "Uncut", "Unbelievable", "Uckty", "Uckee", "Uck", "Umber", "Umkin", "Umpteen", "Umberglaze", "Umbrella", "Umm", "UltraBall", "UltraNice", "UberPretty", "UberHandsome", "UberHott", "UberSexy", "UberCute", "UberWhack", "UberDumb", "UglyTree", "UglyStick", "Really Your Name Starts with U? ", "UnFunny", "UnCool", "Unlucky", "UglyAsHell", "Ugly", "UFO", "U2", "UpperLip", "Uber", "Uh-oh Oreo", "Uno", "UltraNap", "Uggz", "Uncle Man", "Uvo"};
	       String theNameU = Unames[ran.nextInt(Unames.length)];
	       
	       String [] Vnames = {"Verona", "Vulture", "Vugly", "Vroom Vroom", "Vroom", "Voodoo", "VomitLip", "VomitBrows", "VomitMop","Vomit", "Veep", "Vordge", "Valk", "Vans", "Vorp", "Volcano", "Voguester", "Vogue","Vixen ", "Vitamin V", "Vitamin", "VirginSasquatch", "VirginEars", "Virgin", "Viper", "VIP", "Vio","VinegarPalm", "Vinegar", "Victor", "Vidiot", "Video", "VideoTaper", "Vicious", "Vic", "Vibe","Vexer", "Vex", "Verve", "Vilk", "Versh", "Versy", "Veronica", "Venter", "Vent", "VelvetCake", "Velvet", "Velveeta", "Voochie", "Vooch", "Vlooch", "Vector", "VD", "Vato", "Vast", "Variety", "Varmint", "Varmin", "Vart", "Vaporizer", "Vapor", "Voider", "Void", "Vampire", "Vamper", "Vamp", "Valentine", "Va-jay-jay", "VanderSchmidt", "VanWorkle", "VanWinkle", "Vague", "Vagoo", "Veggie", "Vegetable", "Veg", "Vaggie", "Vaggy", "Vag", "Vaca", "Verbal", "Verb", "Vlad", "V", "VanMini", "Van", "Vortex", "Volibear", "Volley", "Volvo", "Valvo",  "Vilch", "Viking", "VaChina", "VanillaFoot", "Veggies", "Vommit", "Voodoo"};
	       String theNameV = Vnames[ran.nextInt(Vnames.length)];
	       
	       String [] Wnames = {"Wuss", "Wusband", "Wugget", "Wuppie", "Writer", "Word", "Wesk", "Wisecrack","WiseAss", "Whip", "WinWin", "WintereyLips", "Winter", "Winner", "Wild", "WigginOut","Wigger", "WhoreNeck", "WhoreMouth", "Whore", "Whopper", "Whoosh", "Whoop", "WhiteBread","WhiteAsHell", "WhiteCracker", "White", "Witty", "Whit", "Wonder", "Wonderful", "WastedChamp","Wasted", "WineTaster", "Wine", "Whiskyed", "Whisked", "Whiskey", "Whenever", "Wonka","Wink", "Wheely", "Wheels", "WhatsHisFace", "WhatsHerFace", "WhackAMole", "WetWilly", "WetFart", "WestSide", "Werd", "WeenieWrap", "Weenie", "WormBeef", "WormChode", "Wormo", "Woim", "Worm", "Weedle", "Weed", "Wedgie", "Wedger", "WeeWee", "Wee", "Wedded", "Webbedfoot", "WebbedDick", "WebsInVag", "Webby", "Web", "WeaveOnChest", "Weave", "Weaver", "Weasley", "Weasel", "Wonderer", "WeakAsHell", "Weak", "WaxButt", "WaxWrist", "WaxCheek", "WaxNip", "Wax", "WallGrime", "Wall", "WateredDown", "WateredJunk", "WhoaYourHott", "Whoa", "Walter", "Watch", "Waiter", "Wapanese", "Wankster", "Wanksta", "Walk", "WrinkStink", "WrinklePuss", "WrinkledAss", "Wrinkle", "Wake", "Wakey", "WalmartHome", "Walmart", "Wawa", "WafflesBlue", "WafflePuss", "Waffle", "Waddy", "Wad", "Workaholic", "Wacky", "Wambulance", "Wack", "WetThang", "WetGooch", "WetKunck", "WetSox", "WetZit", "WetTip", "WetNip", "WetGum" ,"Wanker", "Wiggler", "Wu-Tang", "Wafter", "WaffleHole", "Wilk", "Waldo"};
	       String theNameW = Wnames[ran.nextInt(Wnames.length)];
	       
	       String [] Xnames = {"XedEyes", "XwithSharpie", "XinCrotch", "XinSac", "XinPuss","XonNip", "XonTit", "XonBall", "Xwoman", "Xman","Xcitement", "Xcess", "X-cell", "Xystarch", "X Chromosome","Xylographic", "Xylo", "Xylol", "Xpell", "Xeme", "Xenopuss", "Xenon", "Xanthogenic", "Xanthogen", "Xanthros", "X-Axis", "XYZ", "X-Rated", "Xmas", "Xian", "XFactor", "Xerox", "XboxShapedBall", "Xbox", "XxX", "X-cuses", "X-aminer", "X", "X-panded Hole", "X-ray", "Xylophone", "X-crement"};
	       String theNameX = Xnames[ran.nextInt(Xnames.length)];
	       
	       String [] Ynames = {"YuckYuck","YuckTastic", "Yuck", "Yowzah", "Yowsa", "Yous","Yudge", "Youngin", "Young", "Yoohoo", "Yo Momma","Yeg","Yax", "Yola", "Yoko Ono", "YokeMaster", "Yoked","Yoke","Yobo", "YOLO", "YMCM", "Yinzer", "Yipper","You Pretty","You So Cute", "YapFapper", "You", "Yoo", "Yan", "Yay","Yin", "YingYang", "Yarp", "Yunder", "Yonder", "Yickle","Yike", "Yiff", "YoYo", "Yeti Snowman", "Yeti", "YetiNut","YetiTesti", "YetiBall", "Yeti", "YesterGay", "YesGirl", "YesMan","Yango", "Yepper", "Yerp", "YellowBelly", "YellowFever", "Yelvin","Yeehaw", "Yeapers", "YellowGooch", "YellowToe", "YellowTit", "YeahMan","YeahBuddy", "Yayo", "Yawn", "YardWork", "Yar", "Yankee","Yambag", "Yammer", "Yam", "Yale", "Yahoo", "YadaYada","YackzAlot", "Yack", "Yoda", "Yonker", "Y2k", "Yodle", "YellowSnatch", "York", "Yevin", "Yake", "YewJew", "Yank-Me"};
	       String theNameY = Ynames[ran.nextInt(Ynames.length)];
	       
	       String [] Znames = {"Z", "Zeez", "Zzz", "ZombieZit","Zimple", "ZitLick", "Zo Pretty", "Zo Cute","ZitPopper", "Zunga", "ZellyBelly", "Zank","Zoro", "Zounds", "Zooted", "Zort","Zoot", "Zoopy", "Zooz", "Zoompass","Zeppole", "ZoomedInNip", "ZoomZoom", "Zook","Zeet", "Zirt", "ZombiePelvis", "Zumba","Zombo", "ZombieNeck", "Zombie", "Zoit","Zoinky", "Zoink", "Zitty", "Zit","Zinger", "Zing", "ZimInvader", "Zim", "Zillion", "Zilch", "ZigZag", "Zatch", "Ziggy", "Zigg", "Zeffle", "Zammy", "Zamboney", "Zero", "Zebra", "Zerber","ZenMaster", "Zebu", "Zipper", "Zipperhead", "Ziptie", "Zippo", "Zippy", "Zip", "Zany", "Zanzabar", "Zactly", "Zackley","Zooby", "Zap", "Zappy", "Za","Zed", "Zoodle", "Zirks", "Zang", "ZippedShut", "ZappedPuss", "ZonedOut"};
	       String theNameZ = Znames[ran.nextInt(Znames.length)]; 
	       
	       String [] CrazyNames  = {"The Rick Roller","Thehven","Abominal FartMan", "Eggman BagelFace", "Nostradamus", "The Flerm", "Meow Mix", "The Golden Nubblet", "Lil Bleu Cheese", "The Real Slimm Shady", "R2D2", "The Rent-a-Cop", "Madonna", "Peaches n Cream", "Count Chocula", "Bruce Lee-Roy", "The Hamburgaler", "HashSlinging Slasher", "Kanye East", "49 Cent", "Lil Meow Meow", "Scruff Daddy", "V. Diddy", "Dunder Miflin", "Michael Scott", "Clark kent", "SuperMan", "Batman", "SpiderMan", "Wonder Woman", "Scooby Doo", "Captain America", "Green Lantern", "Goofy Goober", "Thor", "The Punisher", "Venom", "Buzz Lightyear", "Mr. Potato Head", "Mrs. Potato Head", "Tinkerbell", "PeterPan","Scrappy-Doo", "Jiminey Cricket", "Foghorn Leghorn", "Bugz", "Sylvester", "Snoopy"};
	       String crazyName = CrazyNames[ran.nextInt(CrazyNames.length)];
	 //--------------------------------------------------------------------------------------------------------------------------------------------------------     
	 //------------------------------------------------------ALGORITHM-----------------------------------------------------------------------------------------       
	   	if(user.charAt(0)=='A'||user.charAt(0)=='a')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameA+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameA;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameA;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameA;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameA+ endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='b'||user.charAt(0)=='B')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameB+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameB;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameB;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameB;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameB + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='C'||user.charAt(0)=='c')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameC+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameC;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameC;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameC;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameC + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='D'||user.charAt(0)=='d')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameD+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameD;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameD;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameD;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameD + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='e'||user.charAt(0)=='E')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameE+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameE;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameE;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameE;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameE + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='f'||user.charAt(0)=='F')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameF+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameF;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameF;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameF;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameF + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='g'||user.charAt(0)=='G')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameG+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameG;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameG;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameG;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameG + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='H'||user.charAt(0)=='h')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameH+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameH;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameH;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameH;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameH + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='i'||user.charAt(0)=='I')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameI+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameI;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameI;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameI;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameI + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='J'||user.charAt(0)=='j')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameJ+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameJ;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameJ;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameJ;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameJ + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='K'||user.charAt(0)=='k')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameK+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameK;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameK;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameK;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameK + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='l'||user.charAt(0)=='L')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameL+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameL;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameL;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameL;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameL + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='m'||user.charAt(0)=='M')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameM+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameM;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameM;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameM;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameM + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='n'||user.charAt(0)=='N')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameN+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameN;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameN;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameN;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameN + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='o'||user.charAt(0)=='O')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameO+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameO;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameO;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameO;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameO + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='p'||user.charAt(0)=='P')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameP+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameP;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameP;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameP;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameP+ endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='q'||user.charAt(0)=='Q')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameQ+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameQ;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameQ;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameQ;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameQ + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='r'||user.charAt(0)=='R')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameR+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameR;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameR;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameR;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameR + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='s'||user.charAt(0)=='S')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameS+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameS;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameS;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameS;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameS + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='t'||user.charAt(0)=='T')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameT+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameT;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameT;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameT;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameT + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='u'||user.charAt(0)=='U')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameU+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameU;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameU;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameU;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameU + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='v'||user.charAt(0)=='V')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameV+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameV;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameV;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameV;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameV + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='w'||user.charAt(0)=='W')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameW+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameW;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameW;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameW;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameW + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='x'||user.charAt(0)=='X')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameX+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameX;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameX;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameX;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameX + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='y'||user.charAt(0)=='Y')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameY+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameY;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameY;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameY;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameY + endName;
	       	}
	       
	   	}
		if(user.charAt(0)=='z'||user.charAt(0)=='Z')
	   	{
	   		if(num==0||num==1||num==2||num==3||num==21||num==22||num==23||num==24)//gets a beginning 8/25
	   		{  			
	   				if(begEnd==3)//1 in 5 chance to get beginning and endingname
	   				{      			
	       				nickname= nickname +begName+ theNameZ+endName;       			
	   				}
	   				else
	   				{
	   					nickname = nickname+begName+theNameZ;
	   				}       		       		   	
	   		} 
	   		else if (num==4||num==5||num==6||num==18||num==19||num==20) // uses THE in between words 6/25
	   		{
	   				nickname = nickname+user+" the "+theNameZ;   			
	   		}
	   		else if(num==7||num==8||num==16||num==17)//no add ons 4/25
	   		{
	   			nickname = nickname+theNameZ;
	   		}
	   		else if(num==9)//random 1/25
	   		{
	   			nickname = nickname+crazyName;
	   		}
	   		else if(num==10||num==11||num==12||num==13||num==14||num==15)//nickname with ending 6/25
	       	{
	   			nickname = nickname + theNameZ + endName;
	       	}
	       
	   	}
		
	   //---------------------------------------AFTER 8 SECONDS NEXT PAGE-------------------------------------------------------------	       	
	       final String done = nickname;
	       
	        // Timer  5 seconds to nickname screen
	        new Handler().postDelayed(new Runnable() 
	        {
	          //  @Override
	        	//overriding run method to start a new intent 
	            public void run() 
	            {
	                final Intent mainIntent = new Intent(loadActivity.this, nicknameActivity.class);
	                mainIntent.putExtra("name",done);
	                loadActivity.this.startActivity(mainIntent);
	                loadActivity.this.finish();
	            }
	            //seconds = number/1000
	        }, 5000);    
	    }
	    
	    @Override
	    public void onBackPressed()
	    {
	    moveTaskToBack(true);
	    }
	    
	    
	    
	   }