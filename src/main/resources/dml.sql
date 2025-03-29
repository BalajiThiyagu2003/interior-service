use interiorservice;
INSERT INTO categories (name, description, image_url) VALUES
('Modular Kitchen', 'Modern modular kitchen designs with storage solutions.', '/images/img19.jpg'),
('Bedroom', 'Comfortable bedroom interiors with customized furniture.', '/images/img8.jpg'),
('Living Room', 'Elegant and cozy living room setups.', '/images/img9.jpg'),
('Bathroom', 'Luxurious and functional bathroom designs.', '/images/img10.jpg'),
('Workspace', 'Productive and inspiring workspace interiors.', '/images/img12.jpg'),
('Dining Hall', 'Stylish dining hall setups with elegant decor.', '/images/img22.jpg');


INSERT INTO interiorservice.projects (category_id, name, description, image_url, created_at, updated_at) VALUES 
(3, 'Modern Living Room', 'Sleek and modern living room design with neutral tones.', '/images/img4.jpg', NOW(), NOW()),
(3, 'Cozy Living Room', 'A warm and cozy living space with comfortable seating.', '/images/img9.jpg', NOW(), NOW()),
(3, 'Classic Living Room', 'A warm and cozy living space with comfortable seating.', '/images/img18.jpg', NOW(), NOW()),

(2, 'Cozy Bedroom', 'Warm and inviting bedroom with soft lighting and textures.', '/images/bed2.jpg', NOW(), NOW()),
(2, 'Modern Bedroom', 'Stylish and contemporary bedroom with elegant decor.', '/images/bed1.jpg', NOW(), NOW()),
(2, 'Luxury Bedroom', 'Stylish and contemporary bedroom with elegant decor.', '/images/bed3.jpg', NOW(), NOW()),

(1, 'Minimalist Kitchen', 'Clean lines and smart storage solutions for efficiency.', '/images/img2.jpg', NOW(), NOW()),
(1, 'Spacious Kitchen', 'Large kitchen with an island and modern appliances.', '/images/img19.jpg', NOW(), NOW()),
(1, 'Super Kitchen', 'Large kitchen with an island and modern appliances.', '/images/img20.jpg', NOW(), NOW()),

(4, 'Luxury Bathroom', 'Spa-like bathroom with stylish tiles and spacious bathtub.', '/images/img6.jpg', NOW(), NOW()),
(4, 'Modern Bathroom', 'Minimalist bathroom with sleek fixtures and lighting.', '/images/img10.jpg', NOW(), NOW()),
(4, 'Stylish Bathroom', 'Minimalist bathroom with sleek fixtures and lighting.', '/images/img17.jpg', NOW(), NOW()),

(6, 'Classic Dining Room', 'Traditional dining space with elegant woodwork.', '/images/img3.jpg', NOW(), NOW()),
(6, 'Contemporary Dining', 'Modern dining area with stylish seating.', '/images/img21.jpg', NOW(), NOW()),
(6, 'Elegant Dining', 'Modern dining area with stylish seating.', '/images/img22.jpg', NOW(), NOW()),

(5, 'Elegant Office Space', 'Workspace designed for productivity with natural lighting.', '/images/img5.jpg', NOW(), NOW()),
(5, 'Creative Workspace', 'Inspiring office with artistic decor and ergonomic furniture.', '/images/img23.jpg', NOW(), NOW()),
(5, 'Innovative Workspace', 'Inspiring office with artistic decor and ergonomic furniture.', '/images/img24.jpg', NOW(), NOW());
