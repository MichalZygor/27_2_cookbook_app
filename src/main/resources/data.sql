INSERT INTO author(id, first_name, last_name)
VALUES
(1, 'Michał', 'Ciopek'),
(2, 'Anna', 'Nowak'),
(3, 'Paweł', 'Staszewski'),
(4, 'Tomasz', 'Juzik'),
(5, 'Marek', 'Fiołek'),
(6, 'Aleksandra', 'Czupała'),
(7, 'Katarzyna', 'Mączka');

INSERT INTO recipe(id, TITLE, DESCRIPTION, TOTAL_TIME_MIN, TIME_DEFINITION, LIKE_COUNT, DISLIKE_COUNT, CREATE_DATE, UPDATE_DATE, MAIN_PHOTO)
VALUES
(1, 'Krążki cebulowe', 'Domowe krążki cebulowe to niezwykle prosta i super pyszna przekąska na każdą okazję. Przepis na ' ||
 'onion rings sprawdzi się na każdym przyjęciu oraz zawsze, gdy masz ochotę na ciekawą przystawkę.' ||
  '<br>- niezwykle proste do zrobienia <br>- tylko kilka takich i łatwo dostępnych składników ' ||
   '<br>- bardzo prosta przekąska i dodatek do wielu dań<br><b>Składniki</b>:<br>2 średnie cebule zwykłe lub czosnkowe ' ||
    '- około 350 g <br>130 g mąki pszennej np. uniwersalnej - około 5 czubatych łyżek <br>około 3/5 szklanki mleka ' ||
     'lub wody - 150 ml <br>1 średnie lub duże jajko <br>1 łyżeczka proszku do pieczenia <br>przyprawy: 1/3 płaskiej ' ||
      'łyżeczki soli, po 1/4 płaskiej łyżeczki słodkiej papryki i oregano* <br>trochę ponad pół szklanki bułki ' ||
       'tartej - około 85 g <br>około 500 ml oleju do smażenia', 55, '30min + 20min', 10, 5, '2021-02-24', null, 3),
(2, 'Podpłomyk','lorem ipsum wspaniała sprawa z tymi przepsiadcz', 50, 'Czas przygotowania: 25 minut; Czas smażenia ' ||
 'łącznie: 30 minut', 10, 5, '2021-02-24', null, 3),
(3, 'Udka pieczone','Pieczone udka z kurczaka to szybki i prosty pomysł na obiad dla całej rodziny. Przepis sprawdzi się' ||
 ' zarówno na co dzień, jak i na wyjątkowe okazje. Można je podać z warzywami i ulubioną surówką. <br> <b>Składniki:</b>' ||
  '<br>4 nogi z kurczaka - około 1200 g<br>2 łyżki oliwy<br>1 łyżka musztardy np. Dijon<br>3 ząbki czosnku - 15 g<br>' ||
   '2 łyżki sosu sojowego lub pół łyżeczki soli<br>łyżeczka słodkiej papryki<br>1/3 płaskiej łyżeczki pieprzu<br>' ||
    'dodatkowo: jedna czerwona papryka lub po 1/3 z papryki czerwonej, żółtej i zielonej - można pominąć', 130,
    'przygotowania: 10 minut; marynowania minimum : 1 godzina; pieczenia: 1 godzina;', 0, 0, '2021-02-27', null, 3),
(4, 'Makaron z brokułami','opis', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(5, 'Pampuszki','opis', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(6, 'Rolada bezowa','opis', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(7, 'Mini pączki jogurtowe','opis', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(8, 'Szyszk','Szyszki z ryżu preparowanego z krówkami lub z kajmakiem to słodki deser znany od lat. Kiedyś szyszki szykowało się z wyłącznie krówek i masła. Obecnie jest wiele różnych sposobów na szyszki na słodko.', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(9, 'Pączki pieczone','Pączki pieczone to świetny pomysł na puszyste bułeczki drożdżowe, które wyglądają i smakują bardzo podobnie do tych smażonych. Zapraszam po mój sprawdzony przepis.', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(10, 'Gniazdka','Polecam mój najlepszy i sprawdzony przepis na pyszne gniazdka, które szykuję zazwyczaj z cytrusowym lukrem. Domowe pączki hiszpańskie smażę zarówno na Tłusty Czwartek, jak i na przyjęcia.', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(11, 'Ciasto jak żółty ser','Zapraszam po przepis na przepyszny i super prosty deser, który do złudzenia przypomina krążek żółtego sera z dziurami. Jogurtowiec jak żółty ser zachwyca i wyglądem i smakiem. ', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(12, 'Kapsalon','Kapsalon to super pyszny fast food prosto z Holandii. Mamy tu i frytki i soczyste mięso, oraz rozpływający się ser i kolorową sałatkę. Całość polana idealnym sosem czosnkowym.  ', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(13, 'Banany w cieście','Zapraszam po przepyszne i niezwykle proste do zrobienia banany w cieście. Mój przepis na te puszyste pączusie z kawałkami bananów w środku, to świetny pomysł na deser na każdą okazję. ', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(14, 'Ciasteczka kawowe','Niesamowicie proste i śliczne ciasteczka kawowe to super pomysł na szybki deser, który na każdym zrobi ogromne wrażenie. Przepis jest niezwykle prosty, więc zachęcam do pieczenia.', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(15, 'Kotlety z ciecierzycy','Kotlety z ciecierzycy to bardzo smaczna i ciekawa propozycja na zrobienie kotlecików warzywnych. Są bardzo smaczne i proste do usmażenia. Kotlety wychodzą mięciutkie i delikatne. ', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(16, 'Drożdżówki z budyniem','Domowe drożdżówki z budyniem są super delikatne, puszyste i pachnące. To proste do zrobienia bułeczki, z dużą ilością budyniu i z chrupiącą kruszonką. Skuszą każdego łasucha', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(17, 'Fasola w sosie pomidorowym','Fasola w sosie pomidorowym to pyszny pomysł na obiad. Można ją podać na wiele sposobów, a nawet zamknąć w słoiki. Zapraszam po mój ulubiony i sprawdzony przepis', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(18, 'Grochówka','Grochówka należy do moich ulubieńców, jeśli chodzi o rozgrzewające i sycące zupy. Mój przepis jest super prosty a sama zupa grochowa wyjątkowo szybka do zrobienia. ', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(19, 'Rogaliki z ciasta francuskiego','Rogaliki z ciasta francuskiego to jedna z najszybszych, słodkich przekąsek. To przepis, który szykuje się błyskawicznie. Rogaliki wychodzą piękne, pachnące i super pyszne.', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(20, 'Salsa','Sos salsa to jedna z pyszniejszych wizytówek kulinarnych Meksyku. Zapraszam Cię po mój ulubiony przepis na sos salsa z pomidorami, który podaję nie tylko do chipsów nachos. ', 50, 'detaleczasu', 0, 0, '2021-02-27', null, 3),
(21, 'Frytki z piekarnika','lorem ipsum wspaniała sprawa z tymi przepsiadcz', 52, '30min + 20min', 10, 5, '2021-02-24', null, 3);

INSERT INTO photo(title,  file_name, RECIPE_ID )
VALUES
('Krążki cebulowe', 'https://cdn.aniagotuje.com/pictures/articles/2021/02/12452553-v-1080x1080.jpg', 1),
('Podpłomyk', 'https://cdn.aniagotuje.com/pictures/articles/2021/02/12435210-v-1080x1080.jpg', 1),
('Frytki z piekarnika', 'https://aniagotuje.pl/przepis/frytki-z-piekarnika', 2),
('Kotlety z ciecierzycy', 'https://cdn.aniagotuje.com/pictures/articles/2021/01/11321336-v-1080x1080.jpg', 2),
('Fasola w sosie pomidorowym', 'https://cdn.aniagotuje.com/pictures/articles/2021/01/11511368-v-1080x1080.jpg', 2),
('Udka pieczone', 'https://cdn.aniagotuje.com/pictures/articles/2021/02/12660142-v-1080x1080.jpg', 3),
('nazwa', 'adresurl', 4),
('nazwa', 'adresurl', 5),
('nazwa', 'adresurl', 6),
('nazwa', 'adresurl', 7),
('nazwa', 'adresurl', 8),
('nazwa', 'adresurl', 9),
('nazwa', 'adresurl', 10),
('nazwa', 'adresurl', 11),
('nazwa', 'adresurl', 12),
('nazwa', 'adresurl', 13),
('nazwa', 'adresurl', 14),
('nazwa', 'adresurl', 15),
('nazwa', 'adresurl', 16),
('nazwa', 'adresurl', 17),
('Grochówka', 'https://cdn.aniagotuje.com/pictures/articles/2021/01/11314931-v-1080x1080.jpg', 18),
('Rogaliki z ciasta francuskiego', 'https://cdn.aniagotuje.com/pictures/articles/2021/01/11309368-v-1080x1080.jpg', 19),
('Frytki z piekarnika', 'https://cdn.aniagotuje.com/pictures/articles/2021/01/11091107-v-1080x1080.jpg', 21),
('Salsa', 'https://cdn.aniagotuje.com/pictures/articles/2021/01/11091107-v-1080x1080.jpg',20);

INSERT INTO category(id, name, description, MAIN_PHOTO_ID, 	RECIPE_ID)
VALUES
(1, 'Ciasta', 'ciasta lorem ipsum ciasta', 1, 1),
(2, 'Pieczywo', 'pieczywo lorem ipsum loru', 2, 2),
(3, 'Soki owocowe', 'soki z owoców lorem ipsum', 3, 1),
(4, 'Soki warzywne', 'soki z warzyw lorem ipsum', 2, 3),
(5, 'Dania mięsne', 'dania mięsne lorem ipsum loti', 1, 1);

INSERT INTO RECIPE_AUTHORS(RECIPES_ID, AUTHORS_ID)
VALUES
(1, 1),
(1, 2),
(2, 3),
(3, 5);



