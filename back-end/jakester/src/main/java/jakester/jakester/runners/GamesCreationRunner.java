package jakester.jakester.runners;

import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import jakester.jakester.auth.entity.User;
import jakester.jakester.auth.payload.RegisterDto;
import jakester.jakester.auth.service.AuthService;
import jakester.jakester.entities.Game;
import jakester.jakester.entities.Genre;
import jakester.jakester.entities.Review;
import jakester.jakester.services.GameService;
import jakester.jakester.services.ReviewService;

@Component
public class GamesCreationRunner implements ApplicationRunner {

    @Autowired
    GameService gameService;

    @Autowired ReviewService reviewService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        
        Game Elden_Ring=new Game();
        Elden_Ring.setTitle("Elden Ring");
        Elden_Ring.setPoster_path("https://www.instant-gaming.com/images/products/4824/380x218/4824.jpg?v=1650985585");
        Elden_Ring.setBackground_img("https://s1.gaming-cdn.com/img/products/4824/pcover/4824.jpg?v=1650985585");
        Elden_Ring.setTitle_img("https://www.instant-gaming.com/images/products/4824/616x353/4824.jpg?v=1650985585");
        Elden_Ring.setVideo_path("https://s1.gaming-cdn.com/videos/products/4824/800x450/elden-ring-pc-game-steam-europe-preview.webm?v=1657036138");
        Elden_Ring.setFull_price("60€");
        Elden_Ring.setDiscount_price("39.22€");
        Elden_Ring.setPercentage_discount("-34%");
        Elden_Ring.setRating(10);
        Elden_Ring.setRating_count(546);
        Elden_Ring.setDescription("Elden Ring for PC is an action role playing game (ARPG) written by superstars George R R Martin (the author of the Song of Ice and Fire series of books which begat television show Game of Thrones) and Hidetaka Miyazake (who is famed for many popular video games: from the Souls series, to Bloodborne, to Sekiro amongst many others).");
        Elden_Ring.setRelease_date(LocalDate.of(2022, 1, 21));
        Elden_Ring.setDeveloper("FromSoftware");
        Elden_Ring.setPublisher("Bandai Namco");
        Elden_Ring.setGenres(new Genre[] {Genre.ACTION, Genre.ADVENTURE, Genre.RPG, Genre.FANTASY,Genre.CO_OP,});
        Elden_Ring.setVideo_trailer("https://www.youtube.com/embed/E3Huy2cdih0");
        Elden_Ring.setScreenshots(new String[] {
            "https://s1.gaming-cdn.com/images/products/4824/screenshot/elden-ring-pc-game-steam-europe-wallpaper-1.jpg?v=1650985585",
            "https://s1.gaming-cdn.com/images/products/4824/screenshot/elden-ring-pc-game-steam-europe-wallpaper-2.jpg?v=1650985585",
            "https://s1.gaming-cdn.com/images/products/4824/screenshot/elden-ring-pc-game-steam-europe-wallpaper-3.jpg?v=1650985585",
            "https://s1.gaming-cdn.com/images/products/4824/screenshot/elden-ring-pc-game-steam-europe-wallpaper-4.jpg?v=1650985585",
            "https://s1.gaming-cdn.com/images/products/4824/screenshot/elden-ring-pc-game-steam-europe-wallpaper-5.jpg?v=1650985585"
        });
        Elden_Ring.setAbout_the_game("The Elden Ring has been destroyed and its shards have scattered throughout the lands, forming the Great Runes. Some of these shards have fallen into the hands of the children of Queen Marika the Eternal, and the promise of even more power has corrupted each of the six demi-gods.\n\n" +
        "The people who live on the land, used to enjoy the Grace of the Ring, given by the Erdtree, which showed with a kind of golden glow in the eyes – this glow has faded, indicating the loss of Grace, and those who remain are now called ‘the Tarnished.’ You are one of them, an exile from the Lands Between, because of the loss of Grace – and now it is your job to find the shards, restore the Ring and become Elden Lord, returning good to the land.\n\n" +
        "The Lands Between is a vast open world system so you can wander through the six regions (one per boss/ demi-god) in the Lands Between:\n" +
        "exploring castles, fortresses, catacombs, caves, grassy plains, suffocating swamps, spiralling mountains and so much more.\n\n" +
        "Each demi-god (being one of the Queen’s children) rules their section of the land, and eventually defeating them is the equivalent of a boss battle. All defeated enemies are transformed into spirits who can then be summoned to help you out when you need it. This summoning is also available in multiplayer mode – although in this case you call up other players to give you a hand!\n\n" +
        "For unexplained reasons, you have a spectral horse to ride as you wrest the shards from the demi-gods and hope to impress the Erdtree into restoring your Grace.");
        Elden_Ring.setSystem_requirements(new String[]{
        "OS: Windows 7 64-bit",
        "Processor: Intel Core i5-2300 2.8 GHz / AMD FX-6300 3.5 GHz",
        "Memory: 8 GB RAM",
        "Graphics: NVIDIA GeForce GTX 760 / AMD Radeon R7 260x",
        "DirectX: Version 11",
        "Storage: 50 GB available space",
        "Sound Card: DirectX compatible sound card",
        "Additional Notes: Requires Steam account to activate"});   
        Elden_Ring.setShowVideo(false);
        Elden_Ring.setPlatform("Steam");
        Elden_Ring.setQuantity(10);
        Elden_Ring.setFormat("Digital Download");
        Elden_Ring.setOnStock(gameService.isOnStock(Elden_Ring));

        


        Game God_of_War=new Game();
        God_of_War.setTitle("God of War");
        God_of_War.setPoster_path("https://www.instant-gaming.com/images/products/7325/380x218/7325.jpg?v=1668157899");
        God_of_War.setBackground_img("https://s3.gaming-cdn.com/img/products/7325/pcover/7325.jpg?v=1668157899");
        God_of_War.setTitle_img("https://www.instant-gaming.com/images/products/7325/616x353/7325.jpg?v=1668157899");
        God_of_War.setVideo_path("https://www.instant-gaming.com/videos/products/7325/800x450/god-of-war-pc-game-steam-preview.webm?v=1657036406");
        God_of_War.setFull_price("50€");
        God_of_War.setDiscount_price("19.81€");
        God_of_War.setPercentage_discount("-60%");
        God_of_War.setRating(10);
        God_of_War.setRating_count(180);
        God_of_War.setDescription("God of War for PC was teased for months, from about halfway through 2021 until the developers finally put players out of their misery and confirmed the PC release in January 2022! It is the PC-friendly version of the 2018 Gods of War, which was initially only available on PlayStation. The game allows PC gamers to enjoy the intense Norse God action-adventure game. The game is the eighth in the whole cross-platform series and takes place against a background that while not really being open world and more a series of linked locations, is still wide and explorable within those locations. You seldom feel constrained despite the linear game progression.");
        God_of_War.setRelease_date(LocalDate.of(2022, 1, 20));
        God_of_War.setDeveloper("Santa Monica Studio");
        God_of_War.setPublisher("Sony Interactive Entertainment");
        God_of_War.setGenres(new Genre[] {Genre.ACTION, Genre.ADVENTURE, Genre.FANTASY});
        God_of_War.setVideo_trailer("https://www.youtube.com/embed/K0u_kAWLJOA");
        God_of_War.setScreenshots(new String[] {
            "https://s1.gaming-cdn.com/images/products/7325/screenshot/god-of-war-pc-game-steam-europe-wallpaper-1.jpg?v=1650985585",
		    "https://s1.gaming-cdn.com/images/products/7325/screenshot/god-of-war-pc-game-steam-europe-wallpaper-2.jpg?v=1650985585",
		    "https://s1.gaming-cdn.com/images/products/7325/screenshot/god-of-war-pc-game-steam-europe-wallpaper-3.jpg?v=1650985585",
		    "https://s1.gaming-cdn.com/images/products/7325/screenshot/god-of-war-pc-game-steam-europe-wallpaper-4.jpg?v=1650985585",
		    "https://s1.gaming-cdn.com/images/products/7325/screenshot/god-of-war-pc-game-steam-europe-wallpaper-5.jpg?v=1650985585"
        });
        God_of_War.setAbout_the_game("The game’s plot plays out against the background of Norse gods in this iteration, rather than the Ancient Greece of the original games, and it is loosely set in Medieval Scandinavia in the realm of Midgard, which is the Norse equivalent of the lands inhabited by the earliest humans when the world was young. There are two protagonists in the game, one of whom is playable. Kratos – a former Greek God of War and only playable character – is accompanied by his young son, Atreus, who looks to be anywhere between eight years old and twelve or so. The two of them are on an honour quest, to dispose of Faye’s (Atreus’s mother) ashes according to her deathbed wish, to have her remains scattered on the highest peak of the nine realms. Of course, there would be no story if everything went smoothly, and so, their quest is disrupted by monsters and gods who have other ideas about who should be able to dispose of their earthly remains on the sacred peak. The monsters start off large and scary and steadily get larger and scarier, giving you plenty of scope to improve your skills and then try them out. The combat is wonderful: bloody, brutal and – thanks to the physics engine – satisfying! Almost equally satisfying and rare in a game better known for skull-shattering crunches and broken bones, is the arc between Kratos and Atreus. When they set off, they are almost strangers to each other, both feeling that the other expects more of them than they give. This arc progresses along with the game, ending with a much closer, more respectful and loving relationship between the two. And all without impacting the joyous blood-shed!");
        God_of_War.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit",
            "Processor: Intel Core i5-2300 2.8 GHz / AMD FX-6300 3.5 GHz",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 / AMD Radeon R7 260x",
            "DirectX: Version 11",
            "Storage: 50 GB available space",
            "Sound Card: DirectX compatible sound card",
            "Additional Notes: Requires Steam account to activate"});  
        God_of_War.setShowVideo(false);
        God_of_War.setPlatform("Steam");
        God_of_War.setQuantity(10);
        God_of_War.setFormat("Digital Download");
        God_of_War.setOnStock(gameService.isOnStock(God_of_War));
        


        Game total_War_Warhammer_III=new Game();
        total_War_Warhammer_III.setTitle("Total War: Warhammer III");
        total_War_Warhammer_III.setPoster_path("https://www.instant-gaming.com/images/products/8144/380x218/8144.jpg?v=1673254568");
        total_War_Warhammer_III.setBackground_img("https://s3.gaming-cdn.com/img/products/8144/pcover/8144.jpg?v=1673254568");
        total_War_Warhammer_III.setTitle_img("https://www.instant-gaming.com/images/products/8144/616x353/8144.jpg?v=1673254568");
        total_War_Warhammer_III.setVideo_path("https://www.instant-gaming.com/videos/products/8144/800x450/total-war-warhammer-iii-pc-mac-game-steam-europe-preview.webm?v=1657036988");
        total_War_Warhammer_III.setFull_price("60€");
        total_War_Warhammer_III.setDiscount_price("29.34€");
        total_War_Warhammer_III.setPercentage_discount("-51%");
        total_War_Warhammer_III.setRating(9);
        total_War_Warhammer_III.setRating_count(54);
        total_War_Warhammer_III.setDescription("Total War: WARHAMMER III for PC is a turn-based strategy and real time video game, based on the table game of the same name, and the third in the video game series. Players take turns in moving their pieces/ characters around the map and learn how to best manage their settlements so as to achieve all their aims, defeat their enemies and get along with those they cannot immediately defeat!");
        total_War_Warhammer_III.setRelease_date(LocalDate.of(2022, 5, 28));
        total_War_Warhammer_III.setDeveloper("Creative Assembly");
        total_War_Warhammer_III.setPublisher("SEGA");
        total_War_Warhammer_III.setGenres(new Genre[] {Genre.STRATEGY,Genre.RTS,Genre.TURN_BASED});
        total_War_Warhammer_III.setVideo_trailer("https://www.youtube.com/embed/HAr7yUlM0Po");
        total_War_Warhammer_III.setScreenshots(new String[] {
            "https://s1.gaming-cdn.com/images/products/8144/screenshot/total-war-warhammer-iii-pc-game-steam-europe-wallpaper-1.jpg?v=1650985585",
		    "https://s1.gaming-cdn.com/images/products/8144/screenshot/total-war-warhammer-iii-pc-game-steam-europe-wallpaper-2.jpg?v=1650985585",
		    "https://s1.gaming-cdn.com/images/products/8144/screenshot/total-war-warhammer-iii-pc-game-steam-europe-wallpaper-3.jpg?v=1650985585",
		    "https://s1.gaming-cdn.com/images/products/8144/screenshot/total-war-warhammer-iii-pc-game-steam-europe-wallpaper-4.jpg?v=1650985585",
		    "https://s1.gaming-cdn.com/images/products/8144/screenshot/total-war-warhammer-iii-pc-game-steam-europe-wallpaper-5.jpg?v=1650985585"
        });
        total_War_Warhammer_III.setAbout_the_game("The game map is absolutely huge in this game, so you have plenty to explore, even as you battle your way to your target location by fighting through nearly never-ending hordes of relentless and blood thirsty enemies! The map involves diplomacy as well as war with AI (artificial intelligence) enemies – and only you can decide if your forces are strong enough to defeat them, or if you have to carry on being polite for a little longer!");
        total_War_Warhammer_III.setSystem_requirements(new String[]{
            "OS: Windows 10 64-bit",
            "Processor: Intel Core i7-4790 3.6 GHz / AMD Ryzen 5 1600 3.2 GHz",
            "Memory: 16 GB RAM",
            "Graphics: NVIDIA GeForce GTX 1060 6GB / AMD Radeon RX 480 8GB",
            "DirectX: Version 12",
            "Storage: 50 GB available space",
            "Sound Card: DirectX compatible sound card",
            "Additional Notes: Requires Steam account to activate"});
        total_War_Warhammer_III.setShowVideo(false);
        total_War_Warhammer_III.setPlatform("Steam");
        total_War_Warhammer_III.setQuantity(5);
        total_War_Warhammer_III.setFormat("Digital Download");
        total_War_Warhammer_III.setOnStock(gameService.isOnStock(total_War_Warhammer_III));

 

        Game Cyberpunk_2077=new Game();
        Cyberpunk_2077.setTitle("Cyberpunk 2077");
        Cyberpunk_2077.setPoster_path("https://s1.gaming-cdn.com/images/products/840/380x218/cyberpunk-2077-pc-game-gog-com-cover.jpg?v=1663862900");
        Cyberpunk_2077.setBackground_img("https://s1.gaming-cdn.com/img/products/840/pcover/840.jpg?v=1663862900");
        Cyberpunk_2077.setTitle_img("https://s1.gaming-cdn.com/images/products/840/616x353/cyberpunk-2077-pc-game-gog-com-cover.jpg?v=1663862900");
        Cyberpunk_2077.setVideo_path("https://s1.gaming-cdn.com/videos/products/840/800x450/cyberpunk-2077-pc-game-gog-com-preview.webm?v=1657028199");
        Cyberpunk_2077.setFull_price("60€");
        Cyberpunk_2077.setDiscount_price("22.51€");
        Cyberpunk_2077.setPercentage_discount("-62%");
        Cyberpunk_2077.setRating(9);
        Cyberpunk_2077.setRating_count(923);
        Cyberpunk_2077.setDescription("Cyberpunk 2077 for PC is a role-playing video game, based on the table game of the same name, and the third in the video game series. Players take turns in moving their pieces/ characters around the map and learn how to best manage their settlements so as to achieve all their aims, defeat their enemies and get along with those they cannot immediately defeat!");
        Cyberpunk_2077.setRelease_date(LocalDate.of(2022, 5, 28));
        Cyberpunk_2077.setDeveloper("CD PROJEKT RED");
        Cyberpunk_2077.setPublisher("CD PROJEKT RED");
        Cyberpunk_2077.setGenres(new Genre[] {Genre.RPG, Genre.ACTION, Genre.ADVENTURE, Genre.FPS});
        Cyberpunk_2077.setAbout_the_game("Set fifty-seven years after the table-top game upon which it is based, Cyberpunk 2020, the graphics are exquisitely rendered with characters, scenery and even actions and movements so realistic that they could be mistaken for movie footage.");
        Cyberpunk_2077.setVideo_trailer("https://www.youtube.com/embed/8X2kIfS6fb8");
        Cyberpunk_2077.setScreenshots(new String[] {
            "https://s1.gaming-cdn.com/images/products/840/screenshot/cyberpunk-2077-pc-game-gog-com-wallpaper-1.jpg?v=1663862900",
            "https://s1.gaming-cdn.com/images/products/840/screenshot/cyberpunk-2077-pc-game-gog-com-wallpaper-2.jpg?v=1663862900",
            "https://s1.gaming-cdn.com/images/products/840/screenshot/cyberpunk-2077-pc-game-gog-com-wallpaper-3.jpg?v=1663862900",
            "https://s1.gaming-cdn.com/images/products/840/screenshot/cyberpunk-2077-pc-game-gog-com-wallpaper-4.jpg?v=1663862900",
            "https://s1.gaming-cdn.com/images/products/840/screenshot/cyberpunk-2077-pc-game-gog-com-wallpaper-5.jpg?v=1663862900"
        });
        Cyberpunk_2077.setSystem_requirements(new String[]{
            "OS: Windows 10 64-bit",
            "Processor: Intel Core i5-3570K 3.4 GHz / AMD Ryzen 5 1400",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 780 3GB / AMD Radeon RX 470 4GB",
            "DirectX: Version 12",
            "Storage: 70 GB available space",
            "Sound Card: DirectX compatible sound card",
            "Additional Notes: Requires Steam account to activate"});
        Cyberpunk_2077.setShowVideo(false);
        Cyberpunk_2077.setPlatform("Steam");
        Cyberpunk_2077.setQuantity(3);
        Cyberpunk_2077.setFormat("Digital Download");
        Cyberpunk_2077.setOnStock(gameService.isOnStock(Cyberpunk_2077));



        Game Assassin_s_Creed_Valhalla=new Game();
        Assassin_s_Creed_Valhalla.setTitle("Assassin's Creed Valhalla");
        Assassin_s_Creed_Valhalla.setPoster_path("https://www.instant-gaming.com/images/products/6147/380x218/6147.jpg?v=1650550345");
        Assassin_s_Creed_Valhalla.setBackground_img("https://s1.gaming-cdn.com/img/products/6147/pcover/6147.jpg?v=1650550345");
        Assassin_s_Creed_Valhalla.setTitle_img("https://www.instant-gaming.com/images/products/6147/616x353/6147.jpg?v=1650550345");
        Assassin_s_Creed_Valhalla.setVideo_path("https://www.instant-gaming.com/videos/products/6147/800x450/assassin-s-creed-valhalla-pc-game-ubisoft-connect-europe-preview.webm?v=1657030210");
        Assassin_s_Creed_Valhalla.setFull_price("60€");
        Assassin_s_Creed_Valhalla.setDiscount_price("15.17€");
        Assassin_s_Creed_Valhalla.setPercentage_discount("-75%");
        Assassin_s_Creed_Valhalla.setRating(8);
        Assassin_s_Creed_Valhalla.setRating_count(219);
        Assassin_s_Creed_Valhalla.setDescription("Assassin’s Creed Valhalla for PC is the 12th instalment of the Assassin’s Creed games, and this one takes place in the 9th century (beginning in 873AD) carrying you across Europe as you move your clan from a seriously overcrowded and war torn Norway to England, a green land of peace, prosperity and fertile fields in which to raise your crops. The UK might have a reputation as being a chilly and rainy place, but compared to near arctic desolation, it is not too bad a substiture! It is an open world action adventure game.");
        Assassin_s_Creed_Valhalla.setRelease_date(LocalDate.of(2020, 11, 10));
        Assassin_s_Creed_Valhalla.setDeveloper("Ubisoft Montreal");
        Assassin_s_Creed_Valhalla.setPublisher("Ubisoft");
        Assassin_s_Creed_Valhalla.setGenres(new Genre[] {Genre.ACTION, Genre.ADVENTURE, Genre.RPG});
        Assassin_s_Creed_Valhalla.setVideo_trailer("https://www.youtube.com/embed/ssrNcwxALS4");
        Assassin_s_Creed_Valhalla.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/6147/screenshot/assassin-s-creed-valhalla-pc-game-ubisoft-connect-europe-wallpaper-1.jpg?v=1650550345",
            "https://s1.gaming-cdn.com/images/products/6147/screenshot/assassin-s-creed-valhalla-pc-game-ubisoft-connect-europe-wallpaper-2.jpg?v=1650550345",
            "https://s1.gaming-cdn.com/images/products/6147/screenshot/assassin-s-creed-valhalla-pc-game-ubisoft-connect-europe-wallpaper-3.jpg?v=1650550345",
            "https://s1.gaming-cdn.com/images/products/6147/screenshot/assassin-s-creed-valhalla-pc-game-ubisoft-connect-europe-wallpaper-4.jpg?v=1650550345",
            "https://s1.gaming-cdn.com/images/products/6147/screenshot/assassin-s-creed-valhalla-pc-game-ubisoft-connect-europe-wallpaper-5.jpg?v=1650550345"
        });
        Assassin_s_Creed_Valhalla.setAbout_the_game("Assassin’s Creed Valhalla for PC is the 12th instalment of the Assassin’s Creed games, and this one takes place in the 9th century (beginning in 873AD) carrying you across Europe as you move your clan from a seriously overcrowded and war torn Norway to England, a green land of peace, prosperity and fertile fields in which to raise your crops. The UK might have a reputation as being a chilly and rainy place, but compared to near arctic desolation, it is not too bad a substiture! It is an open world action adventure game.");
        Assassin_s_Creed_Valhalla.setSystem_requirements(new String[]{
            "OS: Windows 10 64-bit",
            "Processor: Intel Core i5-2500K 3.3 GHz / AMD FX-6300",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 780 3GB / AMD Radeon R9 290 4GB",
            "DirectX: Version 12",
            "Storage: 100 GB available space",
            "Sound Card: DirectX compatible sound card",
            "Additional Notes: Requires Steam account to activate"});
        Assassin_s_Creed_Valhalla.setShowVideo(false);
        Assassin_s_Creed_Valhalla.setPlatform("Steam");
        Assassin_s_Creed_Valhalla.setQuantity(1);
        Assassin_s_Creed_Valhalla.setFormat("Digital Download");
        Assassin_s_Creed_Valhalla.setOnStock(gameService.isOnStock(Assassin_s_Creed_Valhalla));

  

        Game Watch_Dogs_Legion=new Game();
        Watch_Dogs_Legion.setTitle("Watch Dogs Legion");
        Watch_Dogs_Legion.setPoster_path("https://www.instant-gaming.com/images/products/2540/380x218/2540.jpg?v=1664201416");
        Watch_Dogs_Legion.setBackground_img("https://s3.gaming-cdn.com/img/products/2540/pcover/2540.jpg?v=1664201416");
        Watch_Dogs_Legion.setTitle_img("https://www.instant-gaming.com/images/products/2540/616x353/2540.jpg?v=1664201416");
        Watch_Dogs_Legion.setVideo_path("https://www.instant-gaming.com/videos/products/2540/800x450/watch-dogs-legion-pc-game-ubisoft-connect-europe-preview.webm?v=1657031316");
        Watch_Dogs_Legion.setFull_price("60€");
        Watch_Dogs_Legion.setDiscount_price("8.38€");
        Watch_Dogs_Legion.setPercentage_discount("-86%");
        Watch_Dogs_Legion.setRating(8);
        Watch_Dogs_Legion.setRating_count(219);
        Watch_Dogs_Legion.setDescription("Watch Dogs Legion for PC is the third instalment of the Watch Dogs series, and this one takes place in a dystopian version of London in 2060. The game is set in a world where the government has been taken over by a private corporation, and the people are being controlled by a surveillance system called the Central Operating System (C.O.S.).");
        Watch_Dogs_Legion.setRelease_date(LocalDate.of(2020,10,29));
        Watch_Dogs_Legion.setDeveloper("Ubisoft Toronto");
        Watch_Dogs_Legion.setPublisher("Ubisoft");
        Watch_Dogs_Legion.setGenres(new Genre[] {Genre.ADVENTURE,Genre.ACTION,Genre.FPS,Genre.RPG});
        Watch_Dogs_Legion.setVideo_trailer("https://www.youtube.com/embed/L20nioDjCxU");
        Watch_Dogs_Legion.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/2540/screenshot/watch-dogs-legion-pc-game-ubisoft-connect-europe-wallpaper-1.jpg?v=1657031316",
            "https://s1.gaming-cdn.com/images/products/2540/screenshot/watch-dogs-legion-pc-game-ubisoft-connect-europe-wallpaper-2.jpg?v=1657031316",
            "https://s1.gaming-cdn.com/images/products/2540/screenshot/watch-dogs-legion-pc-game-ubisoft-connect-europe-wallpaper-3.jpg?v=1657031316",
            "https://s1.gaming-cdn.com/images/products/2540/screenshot/watch-dogs-legion-pc-game-ubisoft-connect-europe-wallpaper-4.jpg?v=1657031316",
            "https://s1.gaming-cdn.com/images/products/2540/screenshot/watch-dogs-legion-pc-game-ubisoft-connect-europe-wallpaper-5.jpg?v=1657031316"
        });
        Watch_Dogs_Legion.setAbout_the_game("Watch Dogs Legion for PC is an action adventure game set in a fictionalised alternate reality London. The player chooses who to play as from a number of playable characters, a few of whom the game starts with, along with others who must be recruited as the game progresses. Each character brings a unique personality and skill set to the game, so it is worthwhile investing time and effort in befriending and recruiting as many NPCS as possible.");
        Watch_Dogs_Legion.setSystem_requirements(new String[]{
            "OS: Windows 10 (x64)",
            "Processor:Intel Core i5-4460 / AMD Ryzen 5 1400",
            "Memory:8 GB",
            "Graphics:NVIDIA GeForce GTX 970 or AMD Radeon R9 290X",
            "Storage:45 GB"
        });
        Watch_Dogs_Legion.setShowVideo(false);
        Watch_Dogs_Legion.setQuantity(1);
        Watch_Dogs_Legion.setFormat("Digital Download");
        Watch_Dogs_Legion.setPlatform("Steam");
        Watch_Dogs_Legion.setOnStock(gameService.isOnStock(Watch_Dogs_Legion));



        Game hogwarts_Legacy=new Game();
        hogwarts_Legacy.setTitle("Hogwarts Legacy");
        hogwarts_Legacy.setPoster_path("https://www.instant-gaming.com/images/products/7072/380x218/7072.jpg?v=1676112832");
        hogwarts_Legacy.setBackground_img("https://s3.gaming-cdn.com/img/products/7072/pcover/7072.jpg?v=1676112832");
        hogwarts_Legacy.setTitle_img("https://www.instant-gaming.com/images/products/7072/616x353/7072.jpg?v=1676112832");
        hogwarts_Legacy.setVideo_path("https://www.instant-gaming.com/videos/products/7072/800x450/hogwarts-legacy-pc-game-steam-europe-preview.webm?v=1675271201");
        hogwarts_Legacy.setFull_price("60€");
        hogwarts_Legacy.setDiscount_price("41.75€");
        hogwarts_Legacy.setPercentage_discount("-30%");
        hogwarts_Legacy.setRating(10);
        hogwarts_Legacy.setRating_count(401);
        hogwarts_Legacy.setDescription("Hogwarts Legacy for PC is an action role-playing game set in the Harry Potter universe. The game is set in the 1800s, and the player takes on the role of a student at Hogwarts School of Witchcraft and Wizardry. The game is set in the 1800s, and the player takes on the role of a student at Hogwarts School of Witchcraft and Wizardry.");
        hogwarts_Legacy.setRelease_date(LocalDate.of(2023,2,10));
        hogwarts_Legacy.setDeveloper("Portkey Games");
        hogwarts_Legacy.setPublisher("Warner Bros. Interactive Entertainment");
        hogwarts_Legacy.setGenres(new Genre[] {Genre.FANTASY,Genre.ACTION,Genre.ADVENTURE,Genre.RPG});
        hogwarts_Legacy.setVideo_trailer("https://www.youtube.com/embed/BtyBjOW8sGY");
        hogwarts_Legacy.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/7072/screenshot/hogwarts-legacy-pc-game-steam-europe-wallpaper-1.jpg?v=1675271201",
            "https://s1.gaming-cdn.com/images/products/7072/screenshot/hogwarts-legacy-pc-game-steam-europe-wallpaper-2.jpg?v=1675271201",
            "https://s1.gaming-cdn.com/images/products/7072/screenshot/hogwarts-legacy-pc-game-steam-europe-wallpaper-3.jpg?v=1675271201",
            "https://s1.gaming-cdn.com/images/products/7072/screenshot/hogwarts-legacy-pc-game-steam-europe-wallpaper-4.jpg?v=1675271201",
            "https://s1.gaming-cdn.com/images/products/7072/screenshot/hogwarts-legacy-pc-game-steam-europe-wallpaper-5.jpg?v=1675271201"
        });  
        hogwarts_Legacy.setAbout_the_game("Hogwarts Legacy for PC is an action role-playing game set in the Harry Potter universe. The game is set in the 1800s, and the player takes on the role of a student at Hogwarts School of Witchcraft and Wizardry. The game is set in the 1800s, and the player takes on the role of a student at Hogwarts School of Witchcraft and Wizardry.");
        hogwarts_Legacy.setSystem_requirements(new String[]{
           "OS:64-bit Windows 10",
            "Processor:Intel Core i5-6600 (3.3Ghz) or AMD Ryzen 5 1400 (3.2Ghz)",
            "Memory: 16 GB RAM",
           "Graphics: NVIDIA GeForce GTX 960 4GB or AMD Radeon RX 470 4GB",
           "DirectX: Version 12",
            "Storage: 85 GB available space",
            "Additional Notes: SSD (Preferred), HDD (Supported), 720p/30 fps, Low Quality Settings"
        });    
        hogwarts_Legacy.setShowVideo(false);
        hogwarts_Legacy.setQuantity(12);
        hogwarts_Legacy.setFormat("Digital Download");
        hogwarts_Legacy.setPlatform("Steam");
        hogwarts_Legacy.setOnStock(gameService.isOnStock(hogwarts_Legacy));



        Game Fifa23=new Game();
        Fifa23.setTitle("FIFA 23");
        Fifa23.setPoster_path("https://www.instant-gaming.com/images/products/10545/380x218/10545.jpg?v=1665157647");
        Fifa23.setBackground_img("https://s3.gaming-cdn.com/img/products/10545/pcover/10545.jpg?v=1665157647");
        Fifa23.setTitle_img("https://www.instant-gaming.com/images/products/10545/616x353/10545.jpg?v=1665157647");
        Fifa23.setVideo_path("https://www.instant-gaming.com/videos/products/10545/800x450/fifa-23-pc-game-origin-preview.webm?v=1666702746");
        Fifa23.setFull_price("70€");
        Fifa23.setDiscount_price("35.74€");
        Fifa23.setPercentage_discount("-49%");
        Fifa23.setRating(5);
        Fifa23.setRating_count(355);
        Fifa23.setDescription("");
        Fifa23.setRelease_date(LocalDate.of(2022,10,1));
        Fifa23.setDeveloper("EA Vancouver");
        Fifa23.setPublisher("Electronic Arts");
        Fifa23.setGenres(new Genre[] {Genre.SPORTS});
        Fifa23.setVideo_trailer("https://www.youtube.com/embed/0tIW1X2dv0c");
        Fifa23.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/10545/screenshot/fifa-23-pc-game-origin-wallpaper-1.jpg?v=1666702746",
            "https://s1.gaming-cdn.com/images/products/10545/screenshot/fifa-23-pc-game-origin-wallpaper-2.jpg?v=1666702746",
            "https://s1.gaming-cdn.com/images/products/10545/screenshot/fifa-23-pc-game-origin-wallpaper-3.jpg?v=1666702746",
            "https://s1.gaming-cdn.com/images/products/10545/screenshot/fifa-23-pc-game-origin-wallpaper-4.jpg?v=1666702746",
            "https://s1.gaming-cdn.com/images/products/10545/screenshot/fifa-23-pc-game-origin-wallpaper-5.jpg?v=1666702746"
        });
        Fifa23.setAbout_the_game("FIFA 23 for PC is the latest in an immense line of football based games. From humble beginnings in 1993 with the release of FIFA International Soccer, this game franchise has been produced in over 18 languages in 51 countries, selling over 325 million copies – an impressive record for any video game series. About the Game This game continues the sterling work of previous games in the franchise and this includes the inclusiveness seen on the real field, with women’s teams making a strong appearance.");
        Fifa23.setSystem_requirements(new String[]{
            "OS: Windows 10 64-bit",
            "Processor: Intel Core i5 6600k or AMD Ryzen 5 1600",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 1050 Ti or AMD Radeon RX 570",
            "DirectX: Version 12",
            "Network: Broadband Internet connection",
            "Storage: 100 GB available space"
        });
        Fifa23.setShowVideo(false);
        Fifa23.setQuantity(12);
        Fifa23.setFormat("Digital Download");
        Fifa23.setPlatform("Origin");
        Fifa23.setOnStock(gameService.isOnStock(Fifa23));



        Game Atomic_Heart=new Game();
        Atomic_Heart.setTitle("Atomic Heart");
        Atomic_Heart.setPoster_path("https://www.instant-gaming.com/images/products/2587/380x218/2587.jpg?v=16787071535");
        Atomic_Heart.setBackground_img("https://s3.gaming-cdn.com/img/products/2587/pcover/2587.jpg?v=16787071535");
        Atomic_Heart.setTitle_img("https://www.instant-gaming.com/images/products/2587/616x353/2587.jpg?v=16787071535");
        Atomic_Heart.setVideo_path("https://www.instant-gaming.com/videos/products/2587/800x450/atomic-heart-pc-game-steam-preview.webm?v=1663602384");
        Atomic_Heart.setFull_price("60€");
        Atomic_Heart.setDiscount_price("41.25€");
        Atomic_Heart.setPercentage_discount("-31%");
        Atomic_Heart.setRating(9);
        Atomic_Heart.setRating_count(31);
        Atomic_Heart.setDescription("Atomic Heart for PC is a first-person shooter set in a Soviet-era research facility. The game is set in a Soviet-era research facility, where the player must explore the facility and solve puzzles to progress through the game. The game is set in a Soviet-era research facility, where the player must explore the facility and solve puzzles to progress through the game.");
        Atomic_Heart.setRelease_date(LocalDate.of(2023,2,20));
        Atomic_Heart.setDeveloper("Mundfish");
        Atomic_Heart.setPublisher("Focus Entertainment");
        Atomic_Heart.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.FANTASY});
        Atomic_Heart.setVideo_trailer("https://www.youtube.com/embed/_tEgeZrOOHM");
        Atomic_Heart.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-1.jpg?v=1663602384",
            "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-2.jpg?v=1663602384",
            "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-3.jpg?v=1663602384",
            "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-4.jpg?v=1663602384",
            "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-5.jpg?v=1663602384"
        });
        Atomic_Heart.setAbout_the_game("Welcome to a utopian world of wonders and perfection, in which humans live in harmony with their loyal and fervent robots. Well, that's how it used to be. With the launch of the latest robot-control system mere days away, only a tragic accident or a global conspiracy could disrupt it… The unstoppable course of technology along with secret experiments have brought rise to mutant creatures.");
        Atomic_Heart.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit",
            "Processor: Intel Core i5-2500K or AMD FX-6300",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260X",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 90 GB available space"
        });
        Atomic_Heart.setShowVideo(false);
        Atomic_Heart.setQuantity(22);
        Atomic_Heart.setFormat("Digital Download");
        Atomic_Heart.setPlatform("Steam");
        Atomic_Heart.setOnStock(gameService.isOnStock(Atomic_Heart));
        
 

        Game Warhammer_40000_Darktide =new Game();
        Warhammer_40000_Darktide.setTitle("Warhammer 40,000: Darktide");
        Warhammer_40000_Darktide.setPoster_path("https://s1.gaming-cdn.com/images/products/7368/380x218/warhammer-40-000-darktide-pc-game-steam-cover.jpg?v=1669810979");
        Warhammer_40000_Darktide.setBackground_img("https://s1.gaming-cdn.com/img/products/7368/pcover/7368.jpg?v=1669810979");
        Warhammer_40000_Darktide.setTitle_img("https://www.instant-gaming.com/images/products/7368/616x353/7368.jpg?v=1669810979");
        Warhammer_40000_Darktide.setVideo_path("https://vod-progressive.akamaized.net/exp=1679999262~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F3411%2F17%2F442056171%2F3428392118.mp4~hmac=9524b03ade7fef15c3fcacd5040df9cfff43adf9ec195ae7af5c4812bc5696d7/vimeo-prod-skyfire-std-us/01/3411/17/442056171/3428392118.mp4");
        Warhammer_40000_Darktide.setFull_price("40€");
        Warhammer_40000_Darktide.setDiscount_price("25.55€");
        Warhammer_40000_Darktide.setPercentage_discount("-36%");
        Warhammer_40000_Darktide.setRating(7);
        Warhammer_40000_Darktide.setRating_count(14);
        Warhammer_40000_Darktide.setDescription("Warhammer 40,000: Darktide for PC is a first-person shooter set in the Warhammer 40,000 universe. The game is set in the Warhammer 40,000 universe, where the player must explore the facility and solve puzzles to progress through the game. The game is set in the Warhammer 40,000 universe, where the player must explore the facility and solve puzzles to progress through the game.");
        Warhammer_40000_Darktide.setRelease_date(LocalDate.of(2022,11,30));
        Warhammer_40000_Darktide.setDeveloper("Fatshark");
        Warhammer_40000_Darktide.setPublisher("Fatshark");
        Warhammer_40000_Darktide.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.RPG,Genre.CO_OP});
        Warhammer_40000_Darktide.setVideo_trailer("https://www.youtube.com/embed/x-DtwQUCWx4");
        Warhammer_40000_Darktide.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-1.jpg?v=1663602384",
            "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-2.jpg?v=1663602384",
            "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-3.jpg?v=1663602384",
            "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-4.jpg?v=1663602384",
            "https://s1.gaming-cdn.com/images/products/2587/screenshot/atomic-heart-pc-game-steam-wallpaper-5.jpg?v=1663602384"
        });
        Warhammer_40000_Darktide.setAbout_the_game("Welcome to a utopian world of wonders and perfection, in which humans live in harmony with their loyal and fervent robots. Well, that's how it used to be. With the launch of the latest robot-control system mere days away, only a tragic accident or a global conspiracy could disrupt it… The unstoppable course of technology along with secret experiments have brought rise to mutant creatures.");
        Warhammer_40000_Darktide.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit",
            "Processor: Intel Core i5-2500K or AMD FX-6300",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260X",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 50 GB available space"
        });
        Warhammer_40000_Darktide.setShowVideo(false);
        Warhammer_40000_Darktide.setPlatform("Steam");
        Warhammer_40000_Darktide.setQuantity(31);
        Warhammer_40000_Darktide.setFormat("Digital Download");
        Warhammer_40000_Darktide.setOnStock(gameService.isOnStock(Warhammer_40000_Darktide));



        Game The_Witcher_3_Wild_Hunt =new Game();
        The_Witcher_3_Wild_Hunt.setTitle("The Witcher 3: Wild Hunt");
        The_Witcher_3_Wild_Hunt.setPoster_path("https://s2.gaming-cdn.com/images/products/268/380x218/the-witcher-3-wild-hunt-pc-game-gog-com-cover.jpg?v=1650526691");
        The_Witcher_3_Wild_Hunt.setBackground_img("https://s2.gaming-cdn.com/img/products/268/pcover/268.jpg?v=1650526691");
        The_Witcher_3_Wild_Hunt.setTitle_img("https://s2.gaming-cdn.com/images/products/268/616x353/the-witcher-3-wild-hunt-pc-game-gog-com-cover.jpg?v=1650526691");
        The_Witcher_3_Wild_Hunt.setVideo_path("https://s2.gaming-cdn.com/videos/products/268/800x450/the-witcher-3-wild-hunt-pc-game-gog-com-preview.webm?v=1657359894");
        The_Witcher_3_Wild_Hunt.setFull_price("30€");
        The_Witcher_3_Wild_Hunt.setDiscount_price("10.54€");
        The_Witcher_3_Wild_Hunt.setPercentage_discount("-65%");
        The_Witcher_3_Wild_Hunt.setRating(10);
        The_Witcher_3_Wild_Hunt.setRating_count(658);
        The_Witcher_3_Wild_Hunt.setDescription("The Witcher 3: Wild Hunt for PC is a role-playing game set in an open world environment. The game is set in the Warhammer 40,000 universe, where the player must explore the facility and solve puzzles to progress through the game. The game is set in the Warhammer 40,000 universe, where the player must explore the facility and solve puzzles to progress through the game.");
        The_Witcher_3_Wild_Hunt.setRelease_date(LocalDate.of(2015, 5, 19));
        The_Witcher_3_Wild_Hunt.setDeveloper("CD Projekt RED");
        The_Witcher_3_Wild_Hunt.setPublisher("CD Projekt RED");
        The_Witcher_3_Wild_Hunt.setGenres(new Genre[] {Genre.ACTION, Genre.ADVENTURE, Genre.FANTASY, Genre.RPG,});
        The_Witcher_3_Wild_Hunt.setVideo_trailer("https://www.youtube.com/embed/c0i88t0Kacs");
        The_Witcher_3_Wild_Hunt.setScreenshots(new String[]{
            "https://s2.gaming-cdn.com/images/products/268/screenshot/the-witcher-3-wild-hunt-pc-game-gog-com-wallpaper-1.jpg?v=1657359894",
            "https://s2.gaming-cdn.com/images/products/268/screenshot/the-witcher-3-wild-hunt-pc-game-gog-com-wallpaper-2.jpg?v=1657359894",
            "https://s2.gaming-cdn.com/images/products/268/screenshot/the-witcher-3-wild-hunt-pc-game-gog-com-wallpaper-3.jpg?v=1657359894",
            "https://s2.gaming-cdn.com/images/products/268/screenshot/the-witcher-3-wild-hunt-pc-game-gog-com-wallpaper-4.jpg?v=1657359894",
            "https://s2.gaming-cdn.com/images/products/268/screenshot/the-witcher-3-wild-hunt-pc-game-gog-com-wallpaper-5.jpg?v=1657359894"
        });
        The_Witcher_3_Wild_Hunt.setAbout_the_game("The Witcher 3: Wild Hunt for PC is a role-playing game set in an open world environment. The game is set in the Warhammer 40,000 universe, where the player must explore the facility and solve puzzles to progress through the game. The game is set in the Warhammer 40,000 universe, where the player must explore the facility and solve puzzles to progress through the game.");
        The_Witcher_3_Wild_Hunt.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit",
            "Processor: Intel Core i5-2500K or AMD FX-6300",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260X",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 50 GB available space"
        });
        The_Witcher_3_Wild_Hunt.setShowVideo(false);
        The_Witcher_3_Wild_Hunt.setPlatform("Steam");
        The_Witcher_3_Wild_Hunt.setQuantity(19);
        The_Witcher_3_Wild_Hunt.setFormat("Digital Download");
        The_Witcher_3_Wild_Hunt.setOnStock(gameService.isOnStock(The_Witcher_3_Wild_Hunt));



        Game Wo_Long_Fallen_Dynasty=new Game();
        Wo_Long_Fallen_Dynasty.setTitle("Wo Long: Fallen Dynasty");
        Wo_Long_Fallen_Dynasty.setPoster_path("https://www.instant-gaming.com/images/products/12153/380x218/12153.jpg?v=1677841491");
        Wo_Long_Fallen_Dynasty.setBackground_img("https://s1.gaming-cdn.com/img/products/12153/pcover/12153.jpg?v=1677841491");
        Wo_Long_Fallen_Dynasty.setTitle_img("https://www.instant-gaming.com/images/products/12153/616x353/12153.jpg?v=1677841491");
        Wo_Long_Fallen_Dynasty.setVideo_path("https://s2.gaming-cdn.com/videos/products/268/800x450/the-witcher-3-wild-hunt-pc-game-gog-com-preview.webm?v=1657359894");
        Wo_Long_Fallen_Dynasty.setFull_price("70€");
        Wo_Long_Fallen_Dynasty.setDiscount_price("45.37€");
        Wo_Long_Fallen_Dynasty.setPercentage_discount("-35%");
        Wo_Long_Fallen_Dynasty.setRating(8);
        Wo_Long_Fallen_Dynasty.setRating_count(45);
        Wo_Long_Fallen_Dynasty.setDescription("From the depths of darkness, a dragon soars. A new dark fantasy Three Kingdoms action RPG from Team NINJA, the developers of Nioh. 184 AD, Later Han Dynasty China. The land is overcome by chaos and destruction. The imperial dynasty that prospered for many years is now about to collapse. Wo Long: Fallen Dynasty is a dramatic, action-packed story of a nameless militia soldier fighting for survival in a dark fantasy.");
        Wo_Long_Fallen_Dynasty.setRelease_date(LocalDate.of(2023, 3, 3));
        Wo_Long_Fallen_Dynasty.setDeveloper("KOEI TECMO GAMES CO., LTD.");
        Wo_Long_Fallen_Dynasty.setPublisher("KOEI TECMO GAMES CO., LTD.");
        Wo_Long_Fallen_Dynasty.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.RPG});
        Wo_Long_Fallen_Dynasty.setVideo_trailer("https://www.youtube.com/embed/SWRcZN4jMW8");
        Wo_Long_Fallen_Dynasty.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/12153/screenshot/wo-long-fallen-dynasty-pc-game-steam-wallpaper-1.jpg?v=1677841491",
		    "https://s1.gaming-cdn.com/images/products/12153/screenshot/wo-long-fallen-dynasty-pc-game-steam-wallpaper-2.jpg?v=1677841491",
		    "https://s1.gaming-cdn.com/images/products/12153/screenshot/wo-long-fallen-dynasty-pc-game-steam-wallpaper-3.jpg?v=1677841491",
		    "https://s1.gaming-cdn.com/images/products/12153/screenshot/wo-long-fallen-dynasty-pc-game-steam-wallpaper-4.jpg?v=1677841491",
		    "https://s1.gaming-cdn.com/images/products/12153/screenshot/wo-long-fallen-dynasty-pc-game-steam-wallpaper-5.jpg?v=1677841491"
        });
        Wo_Long_Fallen_Dynasty.setAbout_the_game("Wo Long: Fallen Dynasty for PC is a role-playing game set in an open world environment. The game is set in the Warhammer 40,000 universe, where the player must explore the facility and solve puzzles to progress through the game. The game is set in the Warhammer 40,000 universe, where the player must explore the facility and solve puzzles to progress through the game.");
        Wo_Long_Fallen_Dynasty.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit",
            "Processor: Intel Core i5-2500K or AMD FX-6300",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260X",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 60 GB available space"
        });
        Wo_Long_Fallen_Dynasty.setShowVideo(false);
        Wo_Long_Fallen_Dynasty.setPlatform("Steam");
        Wo_Long_Fallen_Dynasty.setQuantity(23);
        Wo_Long_Fallen_Dynasty.setFormat("Digital Download");
        Wo_Long_Fallen_Dynasty.setOnStock(gameService.isOnStock(Wo_Long_Fallen_Dynasty));

 

        Game Resident_Evil_Village_Gold_Edition=new Game();
        Resident_Evil_Village_Gold_Edition.setTitle("Resident Evil Village Gold Edition");
        Resident_Evil_Village_Gold_Edition.setPoster_path("https://s1.gaming-cdn.com/images/products/13107/380x218/resident-evil-village-gold-edition-gold-edition-pc-game-steam-cover.jpg?v=1676388965");
        Resident_Evil_Village_Gold_Edition.setBackground_img("https://s3.gaming-cdn.com/img/products/6329/pcover/6329.jpg?v=1651568947");
        Resident_Evil_Village_Gold_Edition.setTitle_img("https://s1.gaming-cdn.com/images/products/13107/616x353/resident-evil-village-gold-edition-gold-edition-pc-game-steam-cover.jpg?v=1676388965");
        Resident_Evil_Village_Gold_Edition.setVideo_path("https://s1.gaming-cdn.com/videos/products/13107/800x450/resident-evil-village-gold-edition-gold-edition-pc-game-steam-preview.webm?v=1667386254");
        Resident_Evil_Village_Gold_Edition.setFull_price("50€");
        Resident_Evil_Village_Gold_Edition.setDiscount_price("29.01€");
        Resident_Evil_Village_Gold_Edition.setPercentage_discount("-42%");
        Resident_Evil_Village_Gold_Edition.setRating(9);
        Resident_Evil_Village_Gold_Edition.setRating_count(186);
        Resident_Evil_Village_Gold_Edition.setDescription("Resident Evil Village is a survival horror game developed and published by Capcom. It is the ninth major installment in the Resident Evil series and the sequel to 2017's Resident Evil 7: Biohazard. The game was released for Microsoft Windows, PlayStation 4, PlayStation 5, Stadia, and Xbox One in May 2021, and for Xbox Series X and Series S in June 2021. A Nintendo Switch version was released in July 2021.");
        Resident_Evil_Village_Gold_Edition.setRelease_date(LocalDate.of(2021, 5, 7));
        Resident_Evil_Village_Gold_Edition.setDeveloper("CAPCOM CO., LTD.");
        Resident_Evil_Village_Gold_Edition.setPublisher("CAPCOM CO., LTD.");
        Resident_Evil_Village_Gold_Edition.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.HORROR, Genre.RPG});
        Resident_Evil_Village_Gold_Edition.setVideo_trailer("https://www.youtube.com/embed/IJDIenuQepo");
        Resident_Evil_Village_Gold_Edition.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/13107/screenshot/resident-evil-village-gold-edition-gold-edition-pc-game-steam-wallpaper-1.jpg?v=1676388965",
            "https://s1.gaming-cdn.com/images/products/13107/screenshot/resident-evil-village-gold-edition-gold-edition-pc-game-steam-wallpaper-2.jpg?v=1676388965",
            "https://s1.gaming-cdn.com/images/products/13107/screenshot/resident-evil-village-gold-edition-gold-edition-pc-game-steam-wallpaper-3.jpg?v=1676388965",
            "https://s1.gaming-cdn.com/images/products/13107/screenshot/resident-evil-village-gold-edition-gold-edition-pc-game-steam-wallpaper-4.jpg?v=1676388965",
            "https://s1.gaming-cdn.com/images/products/13107/screenshot/resident-evil-village-gold-edition-gold-edition-pc-game-steam-wallpaper-5.jpg?v=1676388965"
        });
        Resident_Evil_Village_Gold_Edition.setAbout_the_game("Resident Evil Village is a survival horror game developed and published by Capcom. It is the ninth major installment in the Resident Evil series and the sequel to 2017's Resident Evil 7: Biohazard. The game was released for Microsoft Windows, PlayStation 4, PlayStation 5, Stadia, and Xbox One in May 2021, and for Xbox Series X and Series S in June 2021. A Nintendo Switch version was released in July 2021.");
        Resident_Evil_Village_Gold_Edition.setSystem_requirements(new String[]{
            "OS: Windows 10 64-bit",
            "Processor: Intel Core i5-4460, 2.70GHz or AMD FX-6300",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260X",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 50 GB available space"
        });
        Resident_Evil_Village_Gold_Edition.setShowVideo(false);
        Resident_Evil_Village_Gold_Edition.setPlatform("Steam");
        Resident_Evil_Village_Gold_Edition.setQuantity(34);
        Resident_Evil_Village_Gold_Edition.setFormat("Digital Download");
        Resident_Evil_Village_Gold_Edition.setOnStock(gameService.isOnStock(Resident_Evil_Village_Gold_Edition));



        Game The_Elder_Scrolls_V_Skyrim_Special_Edition=new Game();
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setTitle("The Elder Scrolls V: Skyrim Special Edition");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setPoster_path("https://www.instant-gaming.com/images/products/13322/380x218/13322.jpg?v=1670857179");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setBackground_img("https://s1.gaming-cdn.com/img/products/1512/pcover/1512.jpg?v=1666705850");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setTitle_img("https://www.instant-gaming.com/images/products/13322/616x353/13322.jpg?v=1670857179");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setVideo_path("https://www.instant-gaming.com/videos/products/13322/800x450/the-elder-scrolls-v-skyrim-anniversary-upgrade-xbox-one-xbox-series-x-s-xbox-series-x-s-xbox-one-game-microsoft-store-europe-preview.webm?v=1670857078");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setFull_price("40€");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setDiscount_price("8.54€");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setPercentage_discount("-79%");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setRating(10);
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setRating_count(836);
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setDescription("The Elder Scrolls V: Skyrim Special Edition is a remastered version of the 2011 game The Elder Scrolls V: Skyrim, the fifth installment in The Elder Scrolls series, following The Elder Scrolls IV: Oblivion. The Special Edition includes the original game and add-ons with all-new features like remastered art and effects, volumetric god rays, dynamic depth of field, screen-space reflections, and more. Skyrim Special Edition also brings the power of mods to the PC and consoles. New quests, environments, characters, dialogue, armor, weapons and more – with Mods, there are no limits to what you can experience.");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setRelease_date(LocalDate.of(2016, 10, 28));
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setDeveloper("Bethesda Game Studios");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setPublisher("Bethesda Softworks");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.RPG});
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setVideo_trailer("https://www.youtube.com/embed/lTjRZ__-278");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/13322/screenshot/the-elder-scrolls-v-skyrim-special-edition-special-edition-pc-game-steam-wallpaper-1.jpg?v=1670857179",
            "https://s1.gaming-cdn.com/images/products/13322/screenshot/the-elder-scrolls-v-skyrim-special-edition-special-edition-pc-game-steam-wallpaper-2.jpg?v=1670857179",
            "https://s1.gaming-cdn.com/images/products/13322/screenshot/the-elder-scrolls-v-skyrim-special-edition-special-edition-pc-game-steam-wallpaper-3.jpg?v=1670857179",
            "https://s1.gaming-cdn.com/images/products/13322/screenshot/the-elder-scrolls-v-skyrim-special-edition-special-edition-pc-game-steam-wallpaper-4.jpg?v=1670857179",
            "https://s1.gaming-cdn.com/images/products/13322/screenshot/the-elder-scrolls-v-skyrim-special-edition-special-edition-pc-game-steam-wallpaper-5.jpg?v=1670857179"
        });
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setAbout_the_game("The Elder Scrolls V: Skyrim Special Edition is a remastered version of the 2011 game The Elder Scrolls V: Skyrim, the fifth installment in The Elder Scrolls series, following The Elder Scrolls IV: Oblivion. The Special Edition includes the original game and add-ons with all-new features like remastered art and effects, volumetric god rays, dynamic depth of field, screen-space reflections, and more. Skyrim Special Edition also brings the power of mods to the PC and consoles. New quests, environments, characters, dialogue, armor, weapons and more – with Mods, there are no limits to what you can experience.");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setSystem_requirements(new String[]{
            "OS: Windows 7/8.1/10 (64-bit versions)",
            "Processor: Intel Core i5-750, 2.67 GHz or AMD Phenom II X4 955, 3.2 GHz",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 470 (1GB VRAM) or AMD Radeon HD 7870 (2GB VRAM)",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 12 GB available space"
        });
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setShowVideo(false);
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setPlatform("Steam");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setQuantity(4);
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setFormat("Digital Download");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setOnStock(gameService.isOnStock(The_Elder_Scrolls_V_Skyrim_Special_Edition));

  

        Game City_Skylines=new Game();
        City_Skylines.setTitle("City Skylines");
        City_Skylines.setPoster_path("https://www.instant-gaming.com/images/products/519/380x218/519.jpg?v=1662469928");
        City_Skylines.setBackground_img("https://s1.gaming-cdn.com/img/products/519/pcover/519.jpg?v=1662469928");
        City_Skylines.setTitle_img("https://www.instant-gaming.com/images/products/519/616x353/519.jpg?v=1662469928");
        City_Skylines.setVideo_path("https://www.instant-gaming.com/videos/products/519/800x450/cities-skylines-pc-mac-game-steam-preview.webm?v=1670926218");
        City_Skylines.setFull_price("28€");
        City_Skylines.setDiscount_price("4.27€");
        City_Skylines.setPercentage_discount("-85%");
        City_Skylines.setRating(9);
        City_Skylines.setRating_count(454);
        City_Skylines.setDescription("City Skylines is a city-building game developed by Colossal Order and published by Paradox Interactive. The game is a modern take on the classic city simulation. The game introduces new game play elements to realize the thrill and hardships of creating and maintaining a real city whilst expanding on some well-established tropes of the city building experience. In City Skylines, the city is your canvas. You can create your city from the ground up, placing roads, buildings, parks, and other civic and commercial structures. You can also control the city's services, such as power, water, police, fire, and education. You can even create your own policies and ordinances to manage the city and shape it to your liking.");
        City_Skylines.setRelease_date(LocalDate.of(2015, 3, 10));
        City_Skylines.setDeveloper("Colossal Order");
        City_Skylines.setPublisher("Paradox Interactive");
        City_Skylines.setGenres(new Genre[] {Genre.STRATEGY,Genre.MANAGEMENT});
        City_Skylines.setVideo_trailer("https://www.youtube.com/embed/lgpgzx8SW2Y");
        City_Skylines.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/519/screenshot/cities-skylines-pc-mac-game-steam-wallpaper-1.jpg?v=1670926218",
            "https://s1.gaming-cdn.com/images/products/519/screenshot/cities-skylines-pc-mac-game-steam-wallpaper-2.jpg?v=1670926218",
            "https://s1.gaming-cdn.com/images/products/519/screenshot/cities-skylines-pc-mac-game-steam-wallpaper-3.jpg?v=1670926218",
            "https://s1.gaming-cdn.com/images/products/519/screenshot/cities-skylines-pc-mac-game-steam-wallpaper-4.jpg?v=1670926218",
            "https://s1.gaming-cdn.com/images/products/519/screenshot/cities-skylines-pc-mac-game-steam-wallpaper-5.jpg?v=1670926218"
        });
        City_Skylines.setAbout_the_game("City Skylines is a city-building game developed by Colossal Order and published by Paradox Interactive. The game is a modern take on the classic city simulation. The game introduces new game play elements to realize the thrill and hardships of creating and maintaining a real city whilst expanding on some well-established tropes of the city building experience. In City Skylines, the city is your canvas. You can create your city from the ground up, placing roads, buildings, parks, and other civic and commercial structures. You can also control the city's services, such as power, water, police, fire, and education. You can even create your own policies and ordinances to manage the city and shape it to your liking.");
        City_Skylines.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit",
            "Processor: Intel Core i3-2100 or AMD Phenom II X4 965",
            "Memory: 4 GB RAM",
            "Graphics: NVIDIA GeForce GTX 650 1GB or AMD Radeon HD 7770 1GB",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 4 GB available space",
            "Additional Notes: 2 GB VRAM"
        });
        City_Skylines.setShowVideo(false);
        City_Skylines.setPlatform("Steam");
        City_Skylines.setQuantity(14);
        City_Skylines.setFormat("Digital Download");
        City_Skylines.setOnStock(gameService.isOnStock(City_Skylines));


        Game Monster_Hunter_World=new Game();
        Monster_Hunter_World.setTitle("Monster Hunter World");
        Monster_Hunter_World.setPoster_path("https://www.instant-gaming.com/images/products/5858/380x218/5858.jpg?v=1651505652");
        Monster_Hunter_World.setBackground_img("https://s2.gaming-cdn.com/img/products/2155/pcover/2155.jpg?v=1650371419");
        Monster_Hunter_World.setTitle_img("https://www.instant-gaming.com/images/products/5858/616x353/5858.jpg?v=1651505652");
        Monster_Hunter_World.setVideo_path("https://www.instant-gaming.com/videos/products/5858/800x450/monster-hunter-world-pc-game-steam-preview.webm?v=1657033336");
        Monster_Hunter_World.setFull_price("30€");
        Monster_Hunter_World.setDiscount_price("10.72€");
        Monster_Hunter_World.setPercentage_discount("-64%");
        Monster_Hunter_World.setRating(10);
        Monster_Hunter_World.setRating_count(398);
        Monster_Hunter_World.setDescription("Monster Hunter: World is an action role-playing game developed and published by Capcom. It is the fifth mainline entry in the Monster Hunter series, and was released worldwide for PlayStation 4 and Xbox One in January 2018, with a Microsoft Windows version following in August 2018. The game is set in a fantasy world where players take on the role of a hunter that completes quests to hunt down and either kill or trap monsters that roam in one of several environmental spaces. The game features both single-player and online multiplayer gameplay, with the latter supporting up to four players. The game's story follows a new hunter who is tasked with finding their missing mentor, and is set in a new continent known as \"New World\". The game features a new crafting system, allowing players to craft weapons and armor from collected materials, as well as a new \"clutch claw\" mechanic that allows players to latch onto monsters and perform actions such as mounting them, or using them as a shield. The game also features a new \"Slinger\" weapon, which allows players to fire projectiles at monsters, as well as a new \"Palico\" companion system, which allows players to customize their Palicoes and send them on quests to gather materials.");
        Monster_Hunter_World.setRelease_date(LocalDate.of(2018, 1, 26));
        Monster_Hunter_World.setDeveloper("Capcom");
        Monster_Hunter_World.setPublisher("Capcom");
        Monster_Hunter_World.setGenres(new Genre[] {Genre.ACTION, Genre.ADVENTURE, Genre.RPG,Genre.CO_OP});
        Monster_Hunter_World.setVideo_trailer("https://www.youtube.com/embed/Ro6r15wzp2o");
        Monster_Hunter_World.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/5858/screenshot/monster-hunter-world-pc-game-steam-wallpaper-1.jpg?v=1651505652",
            "https://s1.gaming-cdn.com/images/products/5858/screenshot/monster-hunter-world-pc-game-steam-wallpaper-2.jpg?v=1651505652",
            "https://s1.gaming-cdn.com/images/products/5858/screenshot/monster-hunter-world-pc-game-steam-wallpaper-3.jpg?v=1651505652",
            "https://s1.gaming-cdn.com/images/products/5858/screenshot/monster-hunter-world-pc-game-steam-wallpaper-4.jpg?v=1651505652",
            "https://s1.gaming-cdn.com/images/products/5858/screenshot/monster-hunter-world-pc-game-steam-wallpaper-5.jpg?v=1651505652"
        });
        Monster_Hunter_World.setAbout_the_game("Monster Hunter: World is an action role-playing game developed and published by Capcom. It is the fifth mainline entry in the Monster Hunter series, and was released worldwide for PlayStation 4 and Xbox One in January 2018, with a Microsoft Windows version following in August 2018. The game is set in a fantasy world where players take on the role of a hunter that completes quests to hunt down and either kill or trap monsters that roam in one of several environmental spaces. The game features both single-player and online multiplayer gameplay, with the latter supporting up to four players. The game's story follows a new hunter who is tasked with finding their missing mentor, and is set in a new continent known as \"New World\". The game features a new crafting system, allowing players to craft weapons and armor from collected materials, as well as a new \"clutch claw\" mechanic that allows players to latch onto monsters and perform actions such as mounting them, or using them as a shield. The game also features a new \"Slinger\" weapon, which allows players to fire projectiles at monsters, as well as a new \"Palico\" companion system, which allows players to customize their Palicoes and send them on quests to gather materials.");
        Monster_Hunter_World.setSystem_requirements(new String[]{
            "OS: Windows 7 SP1 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-4460, 2.70GHz or AMD FX-6300 or better",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 52 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        Monster_Hunter_World.setShowVideo(false);
        Monster_Hunter_World.setPlatform("Steam");
        Monster_Hunter_World.setQuantity(32);
        Monster_Hunter_World.setFormat("Digital Download");
        Monster_Hunter_World.setOnStock(gameService.isOnStock(Monster_Hunter_World));



        Game kerbal_Space_Program_2=new Game();
        kerbal_Space_Program_2.setTitle("Kerbal Space Program 2");
        kerbal_Space_Program_2.setPoster_path("https://www.instant-gaming.com/images/products/5380/380x218/5380.jpg?v=1677251444");
        kerbal_Space_Program_2.setBackground_img("https://s2.gaming-cdn.com/img/products/5380/pcover/5380.jpg?v=1677251444");
        kerbal_Space_Program_2.setTitle_img("https://www.instant-gaming.com/images/products/5380/616x353/5380.jpg?v=1677251444");
        kerbal_Space_Program_2.setVideo_path("https://www.instant-gaming.com/videos/products/5380/800x450/kerbal-space-program-2-pc-game-steam-europe-preview.webm?v=1677171763");
        kerbal_Space_Program_2.setFull_price("50€");
        kerbal_Space_Program_2.setDiscount_price("37.14€");
        kerbal_Space_Program_2.setPercentage_discount("-25%");
        kerbal_Space_Program_2.setRating(8);
        kerbal_Space_Program_2.setRating_count(11);
        kerbal_Space_Program_2.setDescription("The original Kerbal Space Program is one of the most beloved games of all time and, years after its release, it's bigger than ever before. Its sequel, Kerbal Space Program 2, has been fully redesigned from the ground up to meet the demands of modern and next-generation space exploration, all while maintaining the monumental foundations of the first game. ");
        kerbal_Space_Program_2.setRelease_date(LocalDate.of(2023, 2, 24));
        kerbal_Space_Program_2.setDeveloper("	Intercept Games");
        kerbal_Space_Program_2.setPublisher("Private Division");
        kerbal_Space_Program_2.setGenres(new Genre[] {Genre.MANAGEMENT});
        kerbal_Space_Program_2.setVideo_trailer("https://www.youtube.com/embed/P_nj6wW6Gsc");
        kerbal_Space_Program_2.setScreenshots(new String[]{
            "https://s1.gaming-cdn.com/images/products/5380/screenshot/kerbal-space-program-2-pc-game-steam-wallpaper-1.jpg?v=1677171763",
            "https://s1.gaming-cdn.com/images/products/5380/screenshot/kerbal-space-program-2-pc-game-steam-wallpaper-2.jpg?v=1677171763",
            "https://s1.gaming-cdn.com/images/products/5380/screenshot/kerbal-space-program-2-pc-game-steam-wallpaper-3.jpg?v=1677171763",
            "https://s1.gaming-cdn.com/images/products/5380/screenshot/kerbal-space-program-2-pc-game-steam-wallpaper-4.jpg?v=1677171763",
            "https://s1.gaming-cdn.com/images/products/5380/screenshot/kerbal-space-program-2-pc-game-steam-wallpaper-5.jpg?v=1677171763"
        });
        kerbal_Space_Program_2.setAbout_the_game("Kerbal Space Program 2 is a space flight simulation video game developed and published by Private Division. It is the sequel to Kerbal Space Program, and was released for Microsoft Windows, PlayStation 4, and Xbox One in February 2023. The game is set in a fictional solar system, and features a new \"Career Mode\" that allows players to build and launch rockets, and complete missions to earn funds and unlock new parts. The game also features a new \"Sandbox Mode\", which allows players to build and launch rockets without any restrictions, as well as a new \"Mission Builder\" mode, which allows players to create their own missions and share them with other players. The game also features a new \"Kerbal Construction System\", which allows players to build and customize their own space stations, as well as a new \"Kerbal Character System\", which allows players to customize their Kerbals' appearance and personality.");
        kerbal_Space_Program_2.setSystem_requirements(new String[]{
            "OS: Windows 7 SP1 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-4460, 2.70GHz or AMD FX-6300 or better",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 52 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        kerbal_Space_Program_2.setShowVideo(false);
        kerbal_Space_Program_2.setPlatform("Steam");
        kerbal_Space_Program_2.setQuantity(0);
        kerbal_Space_Program_2.setFormat("Digital Download");
        kerbal_Space_Program_2.setOnStock(gameService.isOnStock(kerbal_Space_Program_2));



        Game SpellForce_Conquest_of_Eo=new Game();
        SpellForce_Conquest_of_Eo.setTitle("SpellForce: Conquest of Eo");
        SpellForce_Conquest_of_Eo.setPoster_path("https://s3.gaming-cdn.com/images/products/13538/380x218/spellforce-conquest-of-eo-pc-game-steam-cover.jpg?v=1675432796");
        SpellForce_Conquest_of_Eo.setBackground_img("https://s3.gaming-cdn.com/img/products/13538/pcover/13538.jpg?v=1675432796");
        SpellForce_Conquest_of_Eo.setTitle_img("https://s3.gaming-cdn.com/images/products/13538/616x353/spellforce-conquest-of-eo-pc-game-steam-cover.jpg?v=1675432796");
        SpellForce_Conquest_of_Eo.setVideo_path("https://s3.gaming-cdn.com/videos/products/13538/800x450/spellforce-conquest-of-eo-pc-game-steam-preview.webm?v=1675436530");
        SpellForce_Conquest_of_Eo.setFull_price("30€");
        SpellForce_Conquest_of_Eo.setDiscount_price("18.77€");
        SpellForce_Conquest_of_Eo.setPercentage_discount("-37%");
        SpellForce_Conquest_of_Eo.setRating(7);
        SpellForce_Conquest_of_Eo.setRating_count(14);
        SpellForce_Conquest_of_Eo.setDescription("In this turn-based strategy game set in the fantastic world of SpellForce, take up the mantle of your master as the heir to his mysterious wizard’s tower. Study a multitude of spells to cast over the lands around you, summon fantastical minions and train mighty warriors to roam the world. Fight in fast-paced but tactical turn-based battles.Explore the Realm of Eo Win over mighty heroes to go on adventures.");
        //SpellForce_Conquest_of_Eo.setRelease_date("3 February 2023")
        SpellForce_Conquest_of_Eo.setRelease_date(LocalDate.of(2023,2,3));
        SpellForce_Conquest_of_Eo.setDeveloper("Owned by Gravity");
        SpellForce_Conquest_of_Eo.setPublisher("THQ Nordic");
        SpellForce_Conquest_of_Eo.setGenres(new Genre[] {Genre.ACTION,Genre.STRATEGY,Genre.ADVENTURE,Genre.RPG});
        SpellForce_Conquest_of_Eo.setAbout_the_game("Study a multitude of spells to cast over the lands around you, summon fantastical minions and train mighty warriors to roam the world. Fight in fast-paced but tactical turn-based battles.Explore the Realm of Eo Win over mighty heroes to go on adventures.");
        SpellForce_Conquest_of_Eo.setVideo_trailer("https://www.youtube.com/embed/7GxwbnHWpKs");
        SpellForce_Conquest_of_Eo.setSystem_requirements(new String[]{
            "OS: Windows 7 SP1 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-4460, 2.70GHz or AMD FX-6300 or better",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 9 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        SpellForce_Conquest_of_Eo.setShowVideo(false);
        SpellForce_Conquest_of_Eo.setPlatform("Steam");
        SpellForce_Conquest_of_Eo.setQuantity(10);
        SpellForce_Conquest_of_Eo.setFormat("Digital Download");
        SpellForce_Conquest_of_Eo.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/13538/screenshot/spellforce-conquest-of-eo-pc-game-steam-wallpaper-1.jpg?v=1675432796",
            "https://gaming-cdn.com/images/products/13538/screenshot/spellforce-conquest-of-eo-pc-game-steam-wallpaper-2.jpg?v=1675432796",
            "https://gaming-cdn.com/images/products/13538/screenshot/spellforce-conquest-of-eo-pc-game-steam-wallpaper-3.jpg?v=1675432796",
            "https://gaming-cdn.com/images/products/13538/screenshot/spellforce-conquest-of-eo-pc-game-steam-wallpaper-4.jpg?v=1675432796",
            "https://gaming-cdn.com/images/products/13538/screenshot/spellforce-conquest-of-eo-pc-game-steam-wallpaper-5.jpg?v=1675432796",
        });
        SpellForce_Conquest_of_Eo.setOnStock(gameService.isOnStock(SpellForce_Conquest_of_Eo));



        Game Warhammer_40000_Chaos_Gate_Deamonhunters=new Game();
        Warhammer_40000_Chaos_Gate_Deamonhunters.setTitle("Warhammer 40,000: Chaos Gate - Deamonhunters");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setPoster_path("https://www.instant-gaming.com/images/products/8972/380x218/8972.jpg?v=1652339552");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setBackground_img("https://s3.gaming-cdn.com/img/products/8972/pcover/8972.jpg?v=1652339552");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setTitle_img("https://www.instant-gaming.com/images/products/8972/616x353/8972.jpg?v=1652339552");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setVideo_path("https://www.instant-gaming.com/videos/products/8972/800x450/warhammer-40-000-chaos-gate-daemonhunters-pc-game-steam-europe-preview.webm?v=1657053008");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setFull_price("45€");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setDiscount_price("16.48€");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setPercentage_discount("-63%");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setRating(7);
        Warhammer_40000_Chaos_Gate_Deamonhunters.setRating_count(11);
        Warhammer_40000_Chaos_Gate_Deamonhunters.setDescription("Warhammer 40,000: Chaos Gate - Deamonhunters is a turn-based strategy video game developed by Black Hole Entertainment and published by THQ Nordic. It is the first expansion pack for Warhammer 40,000: Chaos Gate, and was released for Microsoft Windows in February 2023. The game features a new \"Daemonhunters\" faction, which is led by the \"Daemonhunters\" hero unit, and features a new \"Daemonhunters\" campaign, which allows players to play as the Daemonhunters faction and fight against the Chaos faction. The game also features a new \"Daemonhunters\" multiplayer mode, which allows players to play as the Daemonhunters faction and fight against other players.");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setRelease_date(LocalDate.of( 2022, 5, 5));
        Warhammer_40000_Chaos_Gate_Deamonhunters.setDeveloper("Complex Games");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setPublisher("Frontier Foundry");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.RPG,Genre.FANTASY});
        Warhammer_40000_Chaos_Gate_Deamonhunters.setAbout_the_game("Lead humanity’s greatest weapon, the Grey Knights, against the corrupting forces of Chaos in this brutal and fast-paced turn-based tactical RPG. Root out and put a stop to an insidious plot to infect the galaxy with the Bloom, an intergalactic cosmic plague capable of rotting worlds into oblivion.");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setVideo_trailer("https://www.youtube.com/embed/iuuuUDwUVPg");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setSystem_requirements(new String[]{
            "OS: Windows 7 SP1 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-4460, 2.70GHz or AMD FX-6300 or better",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 18 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        Warhammer_40000_Chaos_Gate_Deamonhunters.setShowVideo(false);
        Warhammer_40000_Chaos_Gate_Deamonhunters.setPlatform("Steam");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setQuantity(12);
        Warhammer_40000_Chaos_Gate_Deamonhunters.setFormat("Digital Download");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/8972/screenshot/warhammer-40-000-chaos-gate-daemonhunters-pc-game-steam-europe-wallpaper-1.jpg?v=1652339552",
            "https://gaming-cdn.com/images/products/8972/screenshot/warhammer-40-000-chaos-gate-daemonhunters-pc-game-steam-europe-wallpaper-2.jpg?v=1652339552",
            "https://gaming-cdn.com/images/products/8972/screenshot/warhammer-40-000-chaos-gate-daemonhunters-pc-game-steam-europe-wallpaper-3.jpg?v=1652339552",
            "https://gaming-cdn.com/images/products/8972/screenshot/warhammer-40-000-chaos-gate-daemonhunters-pc-game-steam-europe-wallpaper-4.jpg?v=1652339552",
            "https://gaming-cdn.com/images/products/8972/screenshot/warhammer-40-000-chaos-gate-daemonhunters-pc-game-steam-europe-wallpaper-5.jpg?v=1652339552",
        });
        Warhammer_40000_Chaos_Gate_Deamonhunters.setOnStock(gameService.isOnStock(Warhammer_40000_Chaos_Gate_Deamonhunters));

 

        Game bioshock_The_Collection=new Game();
        bioshock_The_Collection.setTitle("Bioshock: The Collection");
        bioshock_The_Collection.setPoster_path("https://www.instant-gaming.com/images/products/1543/380x218/1543.jpg?v=1676972625");
        bioshock_The_Collection.setBackground_img("https://s3.gaming-cdn.com/img/products/1543/pcover/1543.jpg?v=1676972625");
        bioshock_The_Collection.setTitle_img("https://www.instant-gaming.com/images/products/1543/616x353/1543.jpg?v=1676972625");
        bioshock_The_Collection.setVideo_path("https://www.instant-gaming.com/videos/products/1543/800x450/bioshock-the-collection-the-collection-pc-game-steam-europe-preview.webm?v=1657039096");
        bioshock_The_Collection.setFull_price("60€");
        bioshock_The_Collection.setDiscount_price("4.63€");
        bioshock_The_Collection.setPercentage_discount("-92%");
        bioshock_The_Collection.setRating(10);
        bioshock_The_Collection.setRating_count(104);
        bioshock_The_Collection.setDescription("Bioshock: The Collection is a first-person shooter video game developed by 2K Marin and published by 2K Games. It is a compilation of the first three Bioshock games, and was released for Microsoft Windows, PlayStation 4 and Xbox One in February 2023. The game features a new \"Bioshock: The Collection\" campaign, which allows players to play as the Bioshock: The Collection faction and fight against the Bioshock: The Collection faction. The game also features a new \"Bioshock: The Collection\" multiplayer mode, which allows players to play as the Bioshock: The Collection faction and fight against other players.");
        bioshock_The_Collection.setRelease_date(LocalDate.of( 2016, 9, 16));
        bioshock_The_Collection.setDeveloper("2K Marin");
        bioshock_The_Collection.setPublisher("2K Games");
        bioshock_The_Collection.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.RPG,Genre.FANTASY});
        bioshock_The_Collection.setAbout_the_game("Return to the cities of Rapture and Columbia and experience the award-winning BioShock franchise like never before, beautifully remastered in 1080p. BioShock: The Collection contains all single-player content from BioShock, BioShock 2, and BioShock Infinite, all single-player add-on content, the “Columbia’s Finest” pack, and Director’s Commentary: Imagining BioShock, featuring Ken Levine and Shawn Robertson.");
        bioshock_The_Collection.setVideo_trailer("https://www.youtube.com/embed/-UaeVy-tutU");
        bioshock_The_Collection.setSystem_requirements(new String[]{
            "OS: Windows 7 SP1 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-4460, 2.70GHz or AMD FX-6300 or better",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 18 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        bioshock_The_Collection.setShowVideo(false);
        bioshock_The_Collection.setPlatform("Steam");
        bioshock_The_Collection.setQuantity(9);
        bioshock_The_Collection.setFormat("Digital Download");
        bioshock_The_Collection.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/1543/screenshot/bioshock-the-collection-the-collection-pc-game-steam-europe-wallpaper-1.jpg?v=1652339552",
            "https://gaming-cdn.com/images/products/1543/screenshot/bioshock-the-collection-the-collection-pc-game-steam-europe-wallpaper-2.jpg?v=1652339552",
            "https://gaming-cdn.com/images/products/1543/screenshot/bioshock-the-collection-the-collection-pc-game-steam-europe-wallpaper-3.jpg?v=1652339552",
            "https://gaming-cdn.com/images/products/1543/screenshot/bioshock-the-collection-the-collection-pc-game-steam-europe-wallpaper-4.jpg?v=1652339552",
            "https://gaming-cdn.com/images/products/1543/screenshot/bioshock-the-collection-the-collection-pc-game-steam-europe-wallpaper-5.jpg?v=1652339552",
        });
        bioshock_The_Collection.setOnStock(gameService.isOnStock(bioshock_The_Collection));




        Game Batman_Arkham_Collection=new Game();
        Batman_Arkham_Collection.setTitle("Batman: Arkham Collection");
        Batman_Arkham_Collection.setPoster_path("https://www.instant-gaming.com/images/products/6728/380x218/6728.jpg?v=1665750833");
        Batman_Arkham_Collection.setBackground_img("https://s3.gaming-cdn.com/img/products/6728/pcover/6728.jpg?v=1665750833");
        Batman_Arkham_Collection.setTitle_img("https://www.instant-gaming.com/images/products/6728/616x353/6728.jpg?v=1665750833");
        Batman_Arkham_Collection.setVideo_path("https://www.instant-gaming.com/videos/products/6728/800x450/batman-arkham-collection-arkham-collection-pc-game-steam-preview.webm?v=1657095829");
        Batman_Arkham_Collection.setFull_price("60€");
        Batman_Arkham_Collection.setDiscount_price("5.56€");
        Batman_Arkham_Collection.setPercentage_discount("-91%");
        Batman_Arkham_Collection.setRating(10);
        Batman_Arkham_Collection.setRating_count(63);
        Batman_Arkham_Collection.setDescription("Batman: Arkham Collection is a third-person action-adventure video game developed by Rocksteady Studios and published by Warner Bros. Interactive Entertainment. It is the fourth installment in the Batman: Arkham series, and the sequel to Batman: Arkham City. The game was released for Microsoft Windows, PlayStation 4 and Xbox One in October 2023. The game features a new \"Batman: Arkham Collection\" campaign, which allows players to play as the Batman: Arkham Collection faction and fight against the Batman: Arkham Collection faction. The game also features a new \"Batman: Arkham Collection\" multiplayer mode, which allows players to play as the Batman: Arkham Collection faction and fight against other players.");
        Batman_Arkham_Collection.setRelease_date(LocalDate.of( 2016, 10, 21));
        Batman_Arkham_Collection.setDeveloper("Rocksteady Studios");
        Batman_Arkham_Collection.setPublisher("Warner Bros. Interactive Entertainment");
        Batman_Arkham_Collection.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.RPG,Genre.FANTASY});
        Batman_Arkham_Collection.setAbout_the_game("Batman: Arkham Collection is a third-person action-adventure video game developed by Rocksteady Studios and published by Warner Bros. Interactive Entertainment. It is the fourth installment in the Batman: Arkham series, and the sequel to Batman: Arkham City. The game was released for Microsoft Windows, PlayStation 4 and Xbox One in October 2023. The game features a new \"Batman: Arkham Collection\" campaign, which allows players to play as the Batman: Arkham Collection faction and fight against the Batman: Arkham Collection faction. The game also features a new \"Batman: Arkham Collection\" multiplayer mode, which allows players to play as the Batman: Arkham Collection faction and fight against other players.");
        Batman_Arkham_Collection.setVideo_trailer("https://www.youtube.com/embed/AWv07fouYvs");
        Batman_Arkham_Collection.setSystem_requirements(new String[]{
            "OS: Windows 7 SP1 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-4460, 2.70GHz or AMD FX-6300 or better",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 50 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        Batman_Arkham_Collection.setShowVideo(false);
        Batman_Arkham_Collection.setPlatform("Steam");
        Batman_Arkham_Collection.setQuantity(11);
        Batman_Arkham_Collection.setFormat("Digital Download");
        Batman_Arkham_Collection.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/6728/screenshot/batman-arkham-collection-arkham-collection-pc-game-steam-wallpaper-1.jpg?v=1665750833",
            "https://gaming-cdn.com/images/products/6728/screenshot/batman-arkham-collection-arkham-collection-pc-game-steam-wallpaper-2.jpg?v=1665750833",
            "https://gaming-cdn.com/images/products/6728/screenshot/batman-arkham-collection-arkham-collection-pc-game-steam-wallpaper-3.jpg?v=1665750833",
            "https://gaming-cdn.com/images/products/6728/screenshot/batman-arkham-collection-arkham-collection-pc-game-steam-wallpaper-4.jpg?v=1665750833",
            "https://gaming-cdn.com/images/products/6728/screenshot/batman-arkham-collection-arkham-collection-pc-game-steam-wallpaper-5.jpg?v=1665750833",
        });
        Batman_Arkham_Collection.setOnStock(gameService.isOnStock(Batman_Arkham_Collection));

      

        Game Marvels_Spiderman_Miles_Morales=new Game();
        Marvels_Spiderman_Miles_Morales.setTitle("Marvel's Spider-Man: Miles Morales");
        Marvels_Spiderman_Miles_Morales.setPoster_path("https://www.instant-gaming.com/images/products/12953/380x218/12953.jpg?v=1673341651");
        Marvels_Spiderman_Miles_Morales.setBackground_img("https://s3.gaming-cdn.com/img/products/12953/pcover/12953.jpg?v=1673341651");
        Marvels_Spiderman_Miles_Morales.setTitle_img("https://www.instant-gaming.com/images/products/12953/616x353/12953.jpg?v=1673341651");
        Marvels_Spiderman_Miles_Morales.setVideo_path("https://www.instant-gaming.com/videos/products/12953/800x450/marvel-s-spider-man-miles-morales-pc-game-steam-preview.webm?v=1668772926");
        Marvels_Spiderman_Miles_Morales.setFull_price("50€");
        Marvels_Spiderman_Miles_Morales.setDiscount_price("21.67€");
        Marvels_Spiderman_Miles_Morales.setPercentage_discount("-57%");
        Marvels_Spiderman_Miles_Morales.setRating(10);
        Marvels_Spiderman_Miles_Morales.setRating_count(51);
        Marvels_Spiderman_Miles_Morales.setDescription("he game picks up after the events of the movie, continuing Miles Morales adventures as he learns to juggle civilian life verse superheroing. It is not long before he discovers that his new home in Harlem is threatened by a battle between the tech giant, Roxxon Energy Co, and the latest villainous crew, the Underground, led by mysterious villain, The Tinkerer.");
        Marvels_Spiderman_Miles_Morales.setRelease_date(LocalDate.of( 2020, 11, 12));
        Marvels_Spiderman_Miles_Morales.setDeveloper("Insomniac Games");
        Marvels_Spiderman_Miles_Morales.setPublisher("Sony Interactive Entertainment");
        Marvels_Spiderman_Miles_Morales.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.RPG,Genre.FANTASY});
        Marvels_Spiderman_Miles_Morales.setAbout_the_game("The game picks up after the events of the movie, continuing Miles Morales adventures as he learns to juggle civilian life verse superheroing. It is not long before he discovers that his new home in Harlem is threatened by a battle between the tech giant, Roxxon Energy Co, and the latest villainous crew, the Underground, led by mysterious villain, The Tinkerer.");
        Marvels_Spiderman_Miles_Morales.setVideo_trailer("https://www.youtube.com/embed/Gr5H85CxI58");
        Marvels_Spiderman_Miles_Morales.setSystem_requirements(new String[]{
            "OS: Windows 10 64-bit",
            "Processor: Intel Core i5-2500K or AMD FX-6300",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 770 or AMD Radeon R9 280X (3GB VRAM with Shader Model 5.0 or better)",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 100 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        Marvels_Spiderman_Miles_Morales.setShowVideo(false);
        Marvels_Spiderman_Miles_Morales.setPlatform("Steam");
        Marvels_Spiderman_Miles_Morales.setQuantity(21);
        Marvels_Spiderman_Miles_Morales.setFormat("Digital Download");
        Marvels_Spiderman_Miles_Morales.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/12953/screenshot/marvel-s-spider-man-miles-morales-pc-game-steam-wallpaper-1.jpg?v=1673341651",
            "https://gaming-cdn.com/images/products/12953/screenshot/marvel-s-spider-man-miles-morales-pc-game-steam-wallpaper-2.jpg?v=1673341651",
            "https://gaming-cdn.com/images/products/12953/screenshot/marvel-s-spider-man-miles-morales-pc-game-steam-wallpaper-3.jpg?v=1673341651",
            "https://gaming-cdn.com/images/products/12953/screenshot/marvel-s-spider-man-miles-morales-pc-game-steam-wallpaper-4.jpg?v=1673341651",
            "https://gaming-cdn.com/images/products/12953/screenshot/marvel-s-spider-man-miles-morales-pc-game-steam-wallpaper-5.jpg?v=1673341651",
        });
        Marvels_Spiderman_Miles_Morales.setOnStock(gameService.isOnStock(Marvels_Spiderman_Miles_Morales));

        

        Game warhammer_Vermintide_2=new Game(); 
        warhammer_Vermintide_2.setTitle("Warhammer: Vermintide 2");
        warhammer_Vermintide_2.setPoster_path("https://www.instant-gaming.com/images/products/2401/380x218/2401.jpg?v=1649317626");
        warhammer_Vermintide_2.setBackground_img("https://s3.gaming-cdn.com/img/products/2401/pcover/2401.jpg?v=1649317626");
        warhammer_Vermintide_2.setTitle_img("https://www.instant-gaming.com/images/products/2401/616x353/2401.jpg?v=1649317626");
        warhammer_Vermintide_2.setVideo_path("https://www.instant-gaming.com/videos/products/2401/800x450/warhammer-vermintide-2-pc-game-steam-preview.webm?v=1657052538");
        warhammer_Vermintide_2.setFull_price("28€");
        warhammer_Vermintide_2.setDiscount_price("3.94€");
        warhammer_Vermintide_2.setPercentage_discount("-86%");
        warhammer_Vermintide_2.setRating(9);
        warhammer_Vermintide_2.setRating_count(99);
        warhammer_Vermintide_2.setDescription("Warhammer: Vermintide 2 is a first-person action game set in the apocalyptic End Times of the war-ravaged Warhammer Fantasy Battles world. Play solo or alongside friends in a thrilling co-operative experience as you hack, slash and smash your way through hordes of enemies in a desperate fight for survival.");
        warhammer_Vermintide_2.setRelease_date(LocalDate.of( 2018, 3, 8));
        warhammer_Vermintide_2.setDeveloper("Fatshark");
        warhammer_Vermintide_2.setPublisher("Fatshark");
        warhammer_Vermintide_2.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.RPG,Genre.FANTASY,Genre.HORROR,Genre.FPS,Genre.CO_OP});
        warhammer_Vermintide_2.setAbout_the_game("Warhammer: Vermintide 2 is a first-person action game set in the apocalyptic End Times of the war-ravaged Warhammer Fantasy Battles world. Play solo or alongside friends in a thrilling co-operative experience as you hack, slash and smash your way through hordes of enemies in a desperate fight for survival.");
        warhammer_Vermintide_2.setVideo_trailer("https://www.youtube.com/embed/Z17l3BzkQIM");
        warhammer_Vermintide_2.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-2500K or AMD FX-6300",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 105 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        warhammer_Vermintide_2.setShowVideo(false);
        warhammer_Vermintide_2.setPlatform("Steam");
        warhammer_Vermintide_2.setQuantity(28);
        warhammer_Vermintide_2.setFormat("Digital Download");
        warhammer_Vermintide_2.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/2401/screenshot/warhammer-vermintide-2-pc-game-steam-wallpaper-1.jpg?v=1649317626",
            "https://gaming-cdn.com/images/products/2401/screenshot/warhammer-vermintide-2-pc-game-steam-wallpaper-2.jpg?v=1649317626",
            "https://gaming-cdn.com/images/products/2401/screenshot/warhammer-vermintide-2-pc-game-steam-wallpaper-3.jpg?v=1649317626",
            "https://gaming-cdn.com/images/products/2401/screenshot/warhammer-vermintide-2-pc-game-steam-wallpaper-4.jpg?v=1649317626",
            "https://gaming-cdn.com/images/products/2401/screenshot/warhammer-vermintide-2-pc-game-steam-wallpaper-5.jpg?v=1649317626",
        });
        warhammer_Vermintide_2.setOnStock(gameService.isOnStock(warhammer_Vermintide_2));



        Game Monster_Hunter_Rise=new Game();
        Monster_Hunter_Rise.setTitle("Monster Hunter Rise");
        Monster_Hunter_Rise.setPoster_path("https://www.instant-gaming.com/images/products/7893/380x218/7893.jpg?v=1666607273");
        Monster_Hunter_Rise.setBackground_img("https://s3.gaming-cdn.com/img/products/7893/pcover/7893.jpg?v=1666607273");
        Monster_Hunter_Rise.setTitle_img("https://www.instant-gaming.com/images/products/7893/616x353/7893.jpg?v=1666607273");
        Monster_Hunter_Rise.setVideo_path("https://www.instant-gaming.com/videos/products/7893/800x450/monster-hunter-rise-pc-game-steam-preview.webm?v=1666185577");
        Monster_Hunter_Rise.setFull_price("40€");
        Monster_Hunter_Rise.setDiscount_price("13.07€");
        Monster_Hunter_Rise.setPercentage_discount("-67%");
        Monster_Hunter_Rise.setRating(9);
        Monster_Hunter_Rise.setRating_count(50);
        Monster_Hunter_Rise.setDescription("Monster Hunter Rise is an action role-playing game developed and published by Capcom. It is the fifth mainline entry in the Monster Hunter series, and the first to be released for the Nintendo Switch.");
        Monster_Hunter_Rise.setRelease_date(LocalDate.of( 2021, 3, 26));
        Monster_Hunter_Rise.setDeveloper("Capcom");
        Monster_Hunter_Rise.setPublisher("Capcom");
        Monster_Hunter_Rise.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.CO_OP,Genre.FANTASY,Genre.RPG});
        Monster_Hunter_Rise.setAbout_the_game("Monster Hunter Rise is an action role-playing game developed and published by Capcom. It is the fifth mainline entry in the Monster Hunter series, and the first to be released for the Nintendo Switch.");
        Monster_Hunter_Rise.setVideo_trailer("https://www.youtube.com/embed/TdCec2GRg-w");
        Monster_Hunter_Rise.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-2500K or AMD FX-6300",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 30 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        Monster_Hunter_Rise.setShowVideo(false);
        Monster_Hunter_Rise.setPlatform("Steam");
        Monster_Hunter_Rise.setQuantity(18);
        Monster_Hunter_Rise.setFormat("Digital Download");
        Monster_Hunter_Rise.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/7893/screenshot/monster-hunter-rise-pc-game-steam-wallpaper-1.jpg?v=1666607273",
            "https://gaming-cdn.com/images/products/7893/screenshot/monster-hunter-rise-pc-game-steam-wallpaper-2.jpg?v=1666607273",
            "https://gaming-cdn.com/images/products/7893/screenshot/monster-hunter-rise-pc-game-steam-wallpaper-3.jpg?v=1666607273",
            "https://gaming-cdn.com/images/products/7893/screenshot/monster-hunter-rise-pc-game-steam-wallpaper-4.jpg?v=1666607273",
            "https://gaming-cdn.com/images/products/7893/screenshot/monster-hunter-rise-pc-game-steam-wallpaper-5.jpg?v=1666607273",
        });
        Monster_Hunter_Rise.setOnStock(gameService.isOnStock(Monster_Hunter_Rise));

        

        Game Dead_Space=new Game();
        Dead_Space.setTitle("Dead Space (2008)");
        Dead_Space.setPoster_path("https://s3.gaming-cdn.com/images/products/338/380x218/dead-space-2008-pc-game-origin-cover.jpg?v=1666264909");
        Dead_Space.setBackground_img("https://s3.gaming-cdn.com/img/products/338/pcover/338.jpg?v=1666264909");
        Dead_Space.setTitle_img("https://s3.gaming-cdn.com/images/products/338/616x353/dead-space-2008-pc-game-origin-cover.jpg?v=1666264909");
        Dead_Space.setVideo_path("https://s3.gaming-cdn.com/videos/products/338/800x450/dead-space-2008-pc-game-origin-preview.webm?v=1657059313");
        Dead_Space.setFull_price("20€");
        Dead_Space.setDiscount_price("2.76€");
        Dead_Space.setPercentage_discount("-86%");
        Dead_Space.setRating(9);
        Dead_Space.setRating_count(34);
        Dead_Space.setDescription("Dead Space is a survival horror video game developed by EA Redwood Shores and published by Electronic Arts. It was released for the PlayStation 3, Xbox 360, and Microsoft Windows in October 2008. The game is set in the year 2509, where a mining ship, the USG Ishimura, is sent to investigate a distress signal from a planet called Aegis VII. The ship is attacked by a necromorph outbreak, and the player assumes the role of engineer Isaac Clarke, who must fight to survive and escape the ship.");
        Dead_Space.setRelease_date(LocalDate.of( 2008, 10, 14));
        Dead_Space.setDeveloper("EA Redwood Shores");
        Dead_Space.setPublisher("Electronic Arts");
        Dead_Space.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.HORROR,Genre.RPG});
        Dead_Space.setAbout_the_game("Dead Space is a survival horror video game developed by EA Redwood Shores and published by Electronic Arts. It was released for the PlayStation 3, Xbox 360, and Microsoft Windows in October 2008. The game is set in the year 2509, where a mining ship, the USG Ishimura, is sent to investigate a distress signal from a planet called Aegis VII. The ship is attacked by a necromorph outbreak, and the player assumes the role of engineer Isaac Clarke, who must fight to survive and escape the ship.");
        Dead_Space.setVideo_trailer("https://www.youtube.com/embed/67cTIWDuKXM");
        Dead_Space.setSystem_requirements(new String[]{
            "OS: Windows XP SP3",
            "Processor: Intel Core 2 Duo 2.4 GHz or AMD Athlon X2 2.8 GHz",
            "Memory: 2 GB RAM",
            "Graphics: NVIDIA GeForce 8800 GT or ATI Radeon HD 3850",
            "DirectX: Version 9.0c",
            "Network: Broadband Internet connection",
            "Storage: 8 GB available space",
            "Additional Notes: 720p @ 30fps"
        }); 
        Dead_Space.setShowVideo(false);
        Dead_Space.setPlatform("Steam");
        Dead_Space.setQuantity(8);
        Dead_Space.setFormat("Digital Download");
        Dead_Space.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/338/screenshot/dead-space-2008-pc-game-origin-wallpaper-1.jpg?v=1666264909",
            "https://gaming-cdn.com/images/products/338/screenshot/dead-space-2008-pc-game-origin-wallpaper-2.jpg?v=1666264909",
            "https://gaming-cdn.com/images/products/338/screenshot/dead-space-2008-pc-game-origin-wallpaper-3.jpg?v=1666264909",
            "https://gaming-cdn.com/images/products/338/screenshot/dead-space-2008-pc-game-origin-wallpaper-4.jpg?v=1666264909",
            "https://gaming-cdn.com/images/products/338/screenshot/dead-space-2008-pc-game-origin-wallpaper-5.jpg?v=1666264909",
        });
        Dead_Space.setOnStock(gameService.isOnStock(Dead_Space));

        

        Game Tekken_7=new Game();
        Tekken_7.setTitle("Tekken 7");
        Tekken_7.setPoster_path("https://www.instant-gaming.com/images/products/1515/380x218/1515.jpg?v=1649168311");
        Tekken_7.setBackground_img("https://s1.gaming-cdn.com/img/products/1515/pcover/1515.jpg?v=1649168311");
        Tekken_7.setTitle_img("https://www.instant-gaming.com/images/products/1515/616x353/1515.jpg?v=1649168311");
        Tekken_7.setVideo_path("https://www.instant-gaming.com/videos/products/1515/800x450/tekken-7-pc-game-steam-preview.webm?v=1657031264");
        Tekken_7.setFull_price("40€");
        Tekken_7.setDiscount_price("4.57€");
        Tekken_7.setPercentage_discount("-89%");
        Tekken_7.setRating(10);
        Tekken_7.setRating_count(149);
        Tekken_7.setDescription("Tekken 7 is a fighting game developed and published by Bandai Namco Entertainment. It is the ninth main installment in the Tekken series, and the first to make use of the Unreal Engine. It was released worldwide in June 2017 for the PlayStation 4, Xbox One, and Microsoft Windows.");
        Tekken_7.setRelease_date(LocalDate.of( 2017, 6, 2));
        Tekken_7.setDeveloper("Bandai Namco Studios");
        Tekken_7.setPublisher("Bandai Namco Entertainment");
        Tekken_7.setGenres(new Genre[] {Genre.FIGHTING});
        Tekken_7.setVideo_trailer("https://www.youtube.com/embed/uZRnk2mPyCM");
        Tekken_7.setAbout_the_game("Tekken 7 is a fighting game developed and published by Bandai Namco Entertainment. It is the ninth main installment in the Tekken series, and the first to make use of the Unreal Engine. It was released worldwide in June 2017 for the PlayStation 4, Xbox One, and Microsoft Windows.");
        Tekken_7.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-4460 or AMD FX-6300",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 760 or AMD Radeon R7 260x with 2GB Video RAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 60 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        Tekken_7.setShowVideo(false);
        Tekken_7.setPlatform("Steam");
        Tekken_7.setQuantity(48);
        Tekken_7.setFormat("Digital Download");
        Tekken_7.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/1515/screenshot/tekken-7-pc-game-steam-wallpaper-1.jpg?v=1649168311",
            "https://gaming-cdn.com/images/products/1515/screenshot/tekken-7-pc-game-steam-wallpaper-2.jpg?v=1649168311",
            "https://gaming-cdn.com/images/products/1515/screenshot/tekken-7-pc-game-steam-wallpaper-3.jpg?v=1649168311",
            "https://gaming-cdn.com/images/products/1515/screenshot/tekken-7-pc-game-steam-wallpaper-4.jpg?v=1649168311",
            "https://gaming-cdn.com/images/products/1515/screenshot/tekken-7-pc-game-steam-wallpaper-5.jpg?v=1649168311",
        });
        Tekken_7.setOnStock(gameService.isOnStock(Tekken_7));

        
        Game Street_Fighter_V=new Game();
        Street_Fighter_V.setTitle("Street Fighter V");
        Street_Fighter_V.setPoster_path("https://www.instant-gaming.com/images/products/671/380x218/671.jpg?v=1662539255");
        Street_Fighter_V.setBackground_img("https://s1.gaming-cdn.com/img/products/671/pcover/671.jpg?v=1662539255");
        Street_Fighter_V.setTitle_img("https://www.instant-gaming.com/images/products/671/616x353/671.jpg?v=1662539255");
        Street_Fighter_V.setVideo_path("https://www.instant-gaming.com/videos/products/671/800x450/street-fighter-v-pc-game-steam-preview.webm?v=1657038037");
        Street_Fighter_V.setFull_price("20€");
        Street_Fighter_V.setDiscount_price("3.25€");
        Street_Fighter_V.setPercentage_discount("-84%");
        Street_Fighter_V.setRating(8);
        Street_Fighter_V.setRating_count(103);
        Street_Fighter_V.setDescription("Street Fighter V is a fighting game developed and published by Capcom. It is the sixth main numbered entry in the Street Fighter series and the follow-up to 2014's Street Fighter IV. It was released for the PlayStation 4 and Microsoft Windows in February 2016, and for the Xbox One in September 2016.");
        Street_Fighter_V.setRelease_date(LocalDate.of( 2016, 2, 16));
        Street_Fighter_V.setDeveloper("Capcom");
        Street_Fighter_V.setPublisher("Capcom");
        Street_Fighter_V.setGenres(new Genre[] {Genre.FIGHTING});
        Street_Fighter_V.setVideo_trailer("https://www.youtube.com/embed/mX8DBQGWBAc");
        Street_Fighter_V.setAbout_the_game("Street Fighter V is a fighting game developed and published by Capcom. It is the sixth main numbered entry in the Street Fighter series and the follow-up to 2014's Street Fighter IV. It was released for the PlayStation 4 and Microsoft Windows in February 2016, and for the Xbox One in September 2016.");
        Street_Fighter_V.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i3-4160 or AMD FX-8120",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 480 or AMD Radeon HD 7800 Series with 1GB VRAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 60 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        Street_Fighter_V.setShowVideo(false);
        Street_Fighter_V.setPlatform("Steam");
        Street_Fighter_V.setQuantity(58);
        Street_Fighter_V.setFormat("Digital Download");
        Street_Fighter_V.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/671/screenshot/street-fighter-v-pc-game-steam-wallpaper-1.jpg?v=1662539255",
            "https://gaming-cdn.com/images/products/671/screenshot/street-fighter-v-pc-game-steam-wallpaper-2.jpg?v=1662539255",
            "https://gaming-cdn.com/images/products/671/screenshot/street-fighter-v-pc-game-steam-wallpaper-3.jpg?v=1662539255",
            "https://gaming-cdn.com/images/products/671/screenshot/street-fighter-v-pc-game-steam-wallpaper-4.jpg?v=1662539255",
            "https://gaming-cdn.com/images/products/671/screenshot/street-fighter-v-pc-game-steam-wallpaper-5.jpg?v=1662539255",
        });
        Street_Fighter_V.setOnStock(gameService.isOnStock(Street_Fighter_V));   

        


        Game Mortal_Kombat_11=new Game();
        Mortal_Kombat_11.setTitle("Mortal Kombat 11");
        Mortal_Kombat_11.setPoster_path("https://www.instant-gaming.com/images/products/3339/380x218/3339.jpg?v=1649408755");
        Mortal_Kombat_11.setBackground_img("https://s1.gaming-cdn.com/img/products/3339/pcover/3339.jpg?v=1649408755");
        Mortal_Kombat_11.setTitle_img("https://www.instant-gaming.com/images/products/3339/616x353/3339.jpg?v=1649408755");
        Mortal_Kombat_11.setVideo_path("https://www.instant-gaming.com/videos/products/3339/800x450/mortal-kombat-11-pc-game-steam-preview.webm?v=1657041299");
        Mortal_Kombat_11.setFull_price("50€");
        Mortal_Kombat_11.setDiscount_price("5.62€");
        Mortal_Kombat_11.setPercentage_discount("-89%");
        Mortal_Kombat_11.setRating(8);
        Mortal_Kombat_11.setRating_count(103);
        Mortal_Kombat_11.setDescription("Mortal Kombat 11 is a fighting game developed by NetherRealm Studios and published by Warner Bros. Interactive Entertainment. It is the eleventh main installment in the Mortal Kombat series and a sequel to 2015's Mortal Kombat X. It was released for the PlayStation 4, Xbox One, and Microsoft Windows in April 2019.");
        Mortal_Kombat_11.setRelease_date(LocalDate.of( 2019, 4, 23));
        Mortal_Kombat_11.setDeveloper("NetherRealm Studios");
        Mortal_Kombat_11.setPublisher("Warner Bros. Interactive Entertainment");
        Mortal_Kombat_11.setGenres(new Genre[] {Genre.FIGHTING});
        Mortal_Kombat_11.setVideo_trailer("https://www.youtube.com/embed/7zwQPJmg-Kg");
        Mortal_Kombat_11.setAbout_the_game("Mortal Kombat 11 is a fighting game developed by NetherRealm Studios and published by Warner Bros. Interactive Entertainment. It is the eleventh main installment in the Mortal Kombat series and a sequel to 2015's Mortal Kombat X. It was released for the PlayStation 4, Xbox One, and Microsoft Windows in April 2019.");
        Mortal_Kombat_11.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-750 or AMD Phenom II X4 965",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 670 or AMD Radeon HD 7950 with 2 GB VRAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 60 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        Mortal_Kombat_11.setShowVideo(false);
        Mortal_Kombat_11.setPlatform("Steam");
        Mortal_Kombat_11.setQuantity(68);
        Mortal_Kombat_11.setFormat("Digital Download");
        Mortal_Kombat_11.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/3339/screenshot/mortal-kombat-11-pc-game-steam-wallpaper-1.jpg?v=1649408755",
            "https://gaming-cdn.com/images/products/3339/screenshot/mortal-kombat-11-pc-game-steam-wallpaper-2.jpg?v=1649408755",
            "https://gaming-cdn.com/images/products/3339/screenshot/mortal-kombat-11-pc-game-steam-wallpaper-3.jpg?v=1649408755",
            "https://gaming-cdn.com/images/products/3339/screenshot/mortal-kombat-11-pc-game-steam-wallpaper-4.jpg?v=1649408755",
            "https://gaming-cdn.com/images/products/3339/screenshot/mortal-kombat-11-pc-game-steam-wallpaper-5.jpg?v=1649408755",
        });
        Mortal_Kombat_11.setOnStock(gameService.isOnStock(Mortal_Kombat_11));

        

        Game Portal_2=new Game();
        Portal_2.setTitle("Portal 2");
        Portal_2.setPoster_path("https://www.instant-gaming.com/images/products/220/380x218/220.jpg?v=1662377458");
        Portal_2.setBackground_img("https://s1.gaming-cdn.com/img/products/220/pcover/220.jpg?v=1662377458");
        Portal_2.setTitle_img("https://www.instant-gaming.com/images/products/220/616x353/220.jpg?v=1662377458");
        Portal_2.setVideo_path("https://www.instant-gaming.com/videos/products/220/800x450/portal-2-pc-mac-game-steam-preview.webm?v=1657109406");
        Portal_2.setFull_price("9.75€");
        Portal_2.setDiscount_price("0.97€");
        Portal_2.setPercentage_discount("-90%");
        Portal_2.setRating(10);
        Portal_2.setRating_count(60);
        Portal_2.setDescription("Portal 2 is a first-person puzzle-platform video game developed and published by Valve Corporation. It was released in April 2011 for Microsoft Windows, OS X, Linux, PlayStation 3, and Xbox 360. The game is a sequel to Portal (2007) and was released about a year and a half after the original game. The game's story takes place after the events of the original game, and follows Chell, who is now living in a post-apocalyptic world. The game's single-player mode was met with critical acclaim, with praise directed at its story, humor, and gameplay. The game's multiplayer mode, titled Portal 2 Co-op, was also well received, with praise directed at its use of the single-player mechanics.");
        Portal_2.setRelease_date(LocalDate.of( 2011, 4, 19));
        Portal_2.setDeveloper("Valve");
        Portal_2.setPublisher("Valve");
        Portal_2.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.PUZZLE,Genre.CO_OP});
        Portal_2.setVideo_trailer("https://www.youtube.com/embed/tax4e4hBBZc");
        Portal_2.setAbout_the_game("Portal 2 is a first-person puzzle-platform video game developed and published by Valve Corporation. It was released in April 2011 for Microsoft Windows, OS X, Linux, PlayStation 3, and Xbox 360. The game is a sequel to Portal (2007) and was released about a year and a half after the original game. The game's story takes place after the events of the original game, and follows Chell, who is now living in a post-apocalyptic world. The game's single-player mode was met with critical acclaim, with praise directed at its story, humor, and gameplay. The game's multiplayer mode, titled Portal 2 Co-op, was also well received, with praise directed at its use of the single-player mechanics.");
        Portal_2.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-750 or AMD Phenom II X4 965",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 670 or AMD Radeon HD 7950 with 2 GB VRAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 8 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        Portal_2.setShowVideo(false);
        Portal_2.setPlatform("Steam");
        Portal_2.setQuantity(28);
        Portal_2.setFormat("Digital Download");
        Portal_2.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/220/screenshot/portal-2-pc-mac-game-steam-wallpaper-1.jpg?v=1662377458",
            "https://gaming-cdn.com/images/products/220/screenshot/portal-2-pc-mac-game-steam-wallpaper-2.jpg?v=1662377458",
            "https://gaming-cdn.com/images/products/220/screenshot/portal-2-pc-mac-game-steam-wallpaper-3.jpg?v=1662377458",
            "https://gaming-cdn.com/images/products/220/screenshot/portal-2-pc-mac-game-steam-wallpaper-4.jpg?v=1662377458",
            "https://gaming-cdn.com/images/products/220/screenshot/portal-2-pc-mac-game-steam-wallpaper-5.jpg?v=1662377458",
        });
        Portal_2.setOnStock(gameService.isOnStock(Portal_2));

        

        Game Portal=new Game();
        Portal.setTitle("Portal");
        Portal.setPoster_path("https://www.instant-gaming.com/images/products/1158/380x218/1158.jpg?v=1621584659");
        Portal.setBackground_img("https://s1.gaming-cdn.com/img/products/1158/pcover/1158.jpg?v=1621584659");
        Portal.setTitle_img("https://www.instant-gaming.com/images/products/1158/616x353/1158.jpg?v=1621584659");
        Portal.setVideo_path("https://www.instant-gaming.com/videos/products/1158/800x450/game-steam-portal-preview.webm?v=1657376760");
        Portal.setFull_price("9.75€");
        Portal.setDiscount_price("0.97€");
        Portal.setPercentage_discount("-90%");
        Portal.setRating(10);
        Portal.setRating_count(60);
        Portal.setDescription("Portal is a first-person puzzle-platform video game developed and published by Valve Corporation. It was released in April 2011 for Microsoft Windows, OS X, Linux, PlayStation 3, and Xbox 360. The game is a sequel to Portal (2007) and was released about a year and a half after the original game. The game's story takes place after the events of the original game, and follows Chell, who is now living in a post-apocalyptic world. The game's single-player mode was met with critical acclaim, with praise directed at its story, humor, and gameplay. The game's multiplayer mode, titled Portal 2 Co-op, was also well received, with praise directed at its use of the single-player mechanics.");
        Portal.setRelease_date(LocalDate.of( 2007, 10, 10));
        Portal.setDeveloper("Valve");
        Portal.setPublisher("Valve");
        Portal.setGenres(new Genre[] {Genre.ACTION,Genre.ADVENTURE,Genre.PUZZLE});
        Portal.setVideo_trailer("https://www.youtube.com/embed/TluRVBhmf8w");
        Portal.setAbout_the_game("Portal is a first-person puzzle-platform video game developed and published by Valve Corporation. It was released in April 2011 for Microsoft Windows, OS X, Linux, PlayStation 3, and Xbox 360. The game is a sequel to Portal (2007) and was released about a year and a half after the original game. The game's story takes place after the events of the original game, and follows Chell, who is now living in a post-apocalyptic world. The game's single-player mode was met with critical acclaim, with praise directed at its story, humor, and gameplay. The game's multiplayer mode, titled Portal 2 Co-op, was also well received, with praise directed at its use of the single-player mechanics.");
        Portal.setSystem_requirements(new String[]{
            "OS: Windows 7 64-bit or Windows 8.1 64-bit or Windows 10 64-bit",
            "Processor: Intel Core i5-750 or AMD Phenom II X4 965",
            "Memory: 8 GB RAM",
            "Graphics: NVIDIA GeForce GTX 670 or AMD Radeon HD 7950 with 2 GB VRAM",
            "DirectX: Version 11",
            "Network: Broadband Internet connection",
            "Storage: 8 GB available space",
            "Additional Notes: 720p @ 30fps"
        });
        Portal.setShowVideo(false);
        Portal.setPlatform("Steam");
        Portal.setQuantity(38);
        Portal.setFormat("Digital Download");
        Portal.setScreenshots(new String[]{
            "https://gaming-cdn.com/images/products/1158/screenshot/game-steam-portal-wallpaper-1.jpg?v=1621584659",
            "https://gaming-cdn.com/images/products/1158/screenshot/game-steam-portal-wallpaper-2.jpg?v=1621584659",
            "https://gaming-cdn.com/images/products/1158/screenshot/game-steam-portal-wallpaper-3.jpg?v=1621584659",
            "https://gaming-cdn.com/images/products/1158/screenshot/game-steam-portal-wallpaper-4.jpg?v=1621584659",
            "https://gaming-cdn.com/images/products/1158/screenshot/game-steam-portal-wallpaper-5.jpg?v=1621584659",
        });
        Portal.setOnStock(gameService.isOnStock(Portal));


        Elden_Ring.setVertical_poster("https://preview.redd.it/3quah3zosi571.jpg?width=2715&format=pjpg&auto=webp&s=59d3a2d86fe661ca6207e388b30c4ae23045d2ac");
        God_of_War.setVertical_poster("https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/71DRhS9jOeL._AC_SL1499_.jpg");
        total_War_Warhammer_III.setVertical_poster("https://thumbnails.pcgamingwiki.com/d/d7/Total_War_Warhammer_III_cover.jpg/300px-Total_War_Warhammer_III_cover.jpg");
        Cyberpunk_2077.setVertical_poster("https://i.pinimg.com/736x/9e/91/13/9e9113e9bfeac9d6298a3e81c7c02326.jpg");
        Assassin_s_Creed_Valhalla.setVertical_poster("https://i.pinimg.com/736x/31/96/c1/3196c14ef4255c0965436f0f85497fbb.jpg");
        Watch_Dogs_Legion.setVertical_poster("https://thumbnails.pcgamingwiki.com/1/1a/Watch_Dogs_Legion_cover.jpg/300px-Watch_Dogs_Legion_cover.jpg");
        hogwarts_Legacy.setVertical_poster("https://mir-s3-cdn-cf.behance.net/project_modules/2800_opt_1/5e248b105639481.5f7d9f64aa1a0.jpg");
        Fifa23.setVertical_poster("https://w0.peakpx.com/wallpaper/120/566/HD-wallpaper-fifa-23-paris-saint-germain-games-fifa23.jpg");
        Atomic_Heart.setVertical_poster("https://thumbnails.pcgamingwiki.com/d/d3/Atomic_Heart_cover.jpg/300px-Atomic_Heart_cover.jpg");
        Warhammer_40000_Darktide.setVertical_poster("https://preview.redd.it/hvsk6lrbkl691.jpg?width=640&crop=smart&auto=webp&s=097c130ddedf9b058a272eeb62f2bef235a9ee3c");
        The_Elder_Scrolls_V_Skyrim_Special_Edition.setVertical_poster("https://thumbnails.pcgamingwiki.com/9/99/The_Elder_Scrolls_V_Skyrim_Special_Edition_cover.jpg/300px-The_Elder_Scrolls_V_Skyrim_Special_Edition_cover.jpg");
        City_Skylines.setVertical_poster("https://i0.wp.com/news.xbox.com/en-us/wp-content/uploads/sites/2/2023/02/cities-skylines-remastered-hero-9ead87e627a7dd4d2eaa.jpg?resize=300%2C300&ssl=1");
        Monster_Hunter_World.setVertical_poster("https://picfiles.alphacoders.com/198/thumb-198634.jpg");
        Monster_Hunter_Rise.setVertical_poster("https://i0.wp.com/funglr.games/wp-content/uploads/2022/08/monsterhunter-series-sale-steam-playstation01.jpg");
        kerbal_Space_Program_2.setVertical_poster("https://wiki.kerbalspaceprogram.com/images/e/e0/KSP2New.jpeg");
        SpellForce_Conquest_of_Eo.setVertical_poster("https://thumbnails.pcgamingwiki.com/e/e4/SpellForce_Conquest_of_Eo_cover.jpg/300px-SpellForce_Conquest_of_Eo_cover.jpg");
        Warhammer_40000_Chaos_Gate_Deamonhunters.setVertical_poster("https://images.g2a.com/300x300/1x1x0/warhammer-40000-chaos-gate-daemonhunters-pc-steam-key-europe-i10000256879003/196e85b99eaa45bca9196002");
        bioshock_The_Collection.setVertical_poster("https://cdn.vox-cdn.com/thumbor/l9HuDRPupJDWNgdBmntr0g_vNjo=/0x0:550x825/1200x0/filters:focal(0x0:550x825):no_upscale()/cdn.vox-cdn.com/uploads/chorus_asset/file/6728465/2K_BioShock-The-Collection_Artwork-Vertical.0.jpg");
        Batman_Arkham_Collection.setVertical_poster("https://upload.wikimedia.org/wikipedia/en/4/4d/Batman-Arkham-Origins-Box-Art.jpg");
        Marvels_Spiderman_Miles_Morales.setVertical_poster("https://xtech-frontend.s3.amazonaws.com/media/img/banner-top-spider-cat-rs-v2.jpg");
        warhammer_Vermintide_2.setVertical_poster("https://thumbnails.pcgamingwiki.com/d/d6/Warhammer_Vermintide_2_cover.png/300px-Warhammer_Vermintide_2_cover.png");
        Mortal_Kombat_11.setVertical_poster("https://www.xtrafondos.com/wallpapers/vertical/mortal-kombat-11-scorpion-3406.jpg");
        Dead_Space.setVertical_poster("https://upload.wikimedia.org/wikipedia/en/5/57/Dead_Space_Box_Art.jpg");
        Tekken_7.setVertical_poster("https://cdn-prod.scalefast.com/public/assets/user/122595/image/8e5526926e2ff60e83d9cd6ccffb78ac.jpg");
        Street_Fighter_V.setVertical_poster("https://www.giantbomb.com/a/uploads/scale_medium/18/187968/2707240-rsz_15774215657_dbc508b182_b.jpg"); 
        Portal.setVertical_poster("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/6b058d1f-dbc7-4a51-b8f3-2767cfc2369a/d5o0zhg-f0c67274-8eb1-47c7-b925-38a619a704dd.png/v1/fill/w_1600,h_2263,q_80,strp/portal_minimalist_poster_by_howling_techie_d5o0zhg-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MjI2MyIsInBhdGgiOiJcL2ZcLzZiMDU4ZDFmLWRiYzctNGE1MS1iOGYzLTI3NjdjZmMyMzY5YVwvZDVvMHpoZy1mMGM2NzI3NC04ZWIxLTQ3YzctYjkyNS0zOGE2MTlhNzA0ZGQucG5nIiwid2lkdGgiOiI8PTE2MDAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.Zkwzi9tA7OO3EgdVSdsYdUAjVnXCkhOJ19vT4zeEDEw");
        Portal_2.setVertical_poster("https://upload.wikimedia.org/wikipedia/en/f/f9/Portal2cover.jpg");
        The_Witcher_3_Wild_Hunt.setVertical_poster("https://picfiles.alphacoders.com/198/thumb-198636.jpg");
        Wo_Long_Fallen_Dynasty.setVertical_poster("https://thumbnails.pcgamingwiki.com/e/e9/Wo_Long_Fallen_Dynasty_cover.png/300px-Wo_Long_Fallen_Dynasty_cover.png");
        Resident_Evil_Village_Gold_Edition.setVertical_poster("https://image.api.playstation.com/vulcan/ap/rnd/202207/0706/D8YACd9U8RAcdtOVpXeXDpzg.png");
        
        gameService.saveGame(Elden_Ring);      
        gameService.saveGame(God_of_War);
        gameService.saveGame(total_War_Warhammer_III);
        gameService.saveGame(Cyberpunk_2077);
        gameService.saveGame(Assassin_s_Creed_Valhalla);
        gameService.saveGame(Watch_Dogs_Legion);
        gameService.saveGame(hogwarts_Legacy);
        gameService.saveGame(Fifa23);
        gameService.saveGame(Atomic_Heart);
        gameService.saveGame(Warhammer_40000_Darktide);
        gameService.saveGame(The_Witcher_3_Wild_Hunt);
        gameService.saveGame(Wo_Long_Fallen_Dynasty);
        gameService.saveGame(Resident_Evil_Village_Gold_Edition);
        gameService.saveGame(The_Elder_Scrolls_V_Skyrim_Special_Edition);        
        gameService.saveGame(City_Skylines);
        gameService.saveGame(Monster_Hunter_World);
        gameService.saveGame(kerbal_Space_Program_2);
        gameService.saveGame(SpellForce_Conquest_of_Eo);
        gameService.saveGame(Warhammer_40000_Chaos_Gate_Deamonhunters);
        gameService.saveGame(bioshock_The_Collection);
        gameService.saveGame(Batman_Arkham_Collection);
        gameService.saveGame(Marvels_Spiderman_Miles_Morales);        
        gameService.saveGame(warhammer_Vermintide_2);
        gameService.saveGame(Monster_Hunter_Rise);
        gameService.saveGame(Mortal_Kombat_11);
        gameService.saveGame(Dead_Space);
        gameService.saveGame(Tekken_7);
        gameService.saveGame(Street_Fighter_V);
        gameService.saveGame(Portal_2);
        gameService.saveGame(Portal);




        

        









    }
}
