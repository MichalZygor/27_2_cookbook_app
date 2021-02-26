INSERT INTO author(id, first_name, last_name)
VALUES
(1, 'Michał', 'Ciopek'),
(2, 'Anna', 'Nowak'),
(3, 'Paweł', 'Staszewski'),
(4, 'Tomasz', 'Juzik'),
(5, 'Marek', 'Fiołek'),
(6, 'Aleksandra', 'Czupała'),
(7, 'Katarzyna', 'Mączka');

INSERT INTO recipe(id, TITLE, DESCRIPTION, TOTAL_TIME_MIN, TIME_DEFINITION, LIKE_COUNT, DISLIKE_COUNT, CREATE_DATE, UPDATE_DATE, MAIN_PHOTO_ID)
VALUES
(1, 'Krążki cebulowe', 'lorem ipsum wspaniała sprawa z tymi przepsiadcz', 40, '30min + 20min', 10, 5, '2021-02-24', null, 3),
(2, 'Podpłomyk','lorem ipsum wspaniała sprawa z tymi przepsiadcz', 50, '30min + 20min', 10, 5, '2021-02-24', null, 3),
(3, 'Frytki z piekarnika','lorem ipsum wspaniała sprawa z tymi przepsiadcz', 52, '30min + 20min', 10, 5, '2021-02-24', null, 3);

INSERT INTO photo(id, title,  file_name, RECIPE_ID )
VALUES
(1, 'Krążki cebulowe', 'https://cdn.aniagotuje.com/pictures/articles/2021/02/12452553-v-1080x1080.jpg', 1),
(2, 'Podpłomyk', 'https://cdn.aniagotuje.com/pictures/articles/2021/02/12435210-v-1080x1080.jpg', 1),
(3, 'Frytki z piekarnika', 'https://aniagotuje.pl/przepis/frytki-z-piekarnika', 2),
(4, 'Kotlety z ciecierzycy', 'https://cdn.aniagotuje.com/pictures/articles/2021/01/11321336-v-1080x1080.jpg', 2),
(5, 'Fasola w sosie pomidorowym', 'https://cdn.aniagotuje.com/pictures/articles/2021/01/11511368-v-1080x1080.jpg', 2),
(6, 'Salsa', 'https://cdn.aniagotuje.com/pictures/articles/2021/01/11091107-v-1080x1080.jpg',1);

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



