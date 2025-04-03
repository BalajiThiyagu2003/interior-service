use interiorservice;
INSERT INTO interiorservice.categories (name, description, image_url) VALUES
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




INSERT INTO interiorservice.project_images (project_id, image_url, uploaded_at) VALUES
(1, 'https://super.homelane.com/Kitchens%20and%20Wardrobes/1681281429197c2d5e393d345-HLKT00000832_batch-2-800x600_4-main.jpg', NOW()),
(1, 'https://super.homelane.com/Kitchens%20and%20Wardrobes/1681281087611e01b297c775a-HLKT00000831_batch-2-800x600_3-main.jpg', NOW()),

(2, 'https://super.homelane.com/other%20interiors/168137759799415051d5a305e-HLKT00000839_batch-3-800x600_1-main.jpg', NOW()),
(2, 'https://super.homelane.com/other%20interiors/1681377353678616117aafd75-HLKT00000838_batch-3-800x600_30-main.jpg', NOW()),

(3, 'https://super.homelane.com/Bedroom%20Wardrobes/1680589580503770e1a0c229f-HLKT00000774_Resized-800x600_7-main.jpg', NOW()),
(3, 'https://super.homelane.com/Bedroom%20Wardrobes/16805897129459dd01b1139f1-HLKT00000775_Resized-800x600_8-main.jpg', NOW()),

(4, 'https://super.homelane.com/Nera%20Bathroom/1632300235527e073fde6423e-HLKT00000748_12-main.jpg', NOW()),
(4, 'https://super.homelane.com/Nera%20Bathroom/163230056353048a7bd10d435-HLKT00000749_9-main.jpg', NOW()),

(5, 'https://super.homelane.com/Home%20Office%20Combo/1680592645677ce062a23940a-HLKT00000786_Resized-800x600_18-main.jpg', NOW()),
(5, 'https://super.homelane.com/homeoffice/HLKT00000615_FLUID-HDHMR-1%20(1).jpg', NOW()),

(6, 'https://media.designcafe.com/wp-content/uploads/2020/01/21003949/dining-room-design-for-your-home.jpg', NOW()),
(6, 'https://dynamic-media-cdn.tripadvisor.com/media/photo-o/26/d2/50/92/5-bhk-luxury-villa-anjuna.jpg?w=700&h=-1&s=1', NOW());



update interiorservice.users set is_admin = true where email = 'balaji@gmail.com'