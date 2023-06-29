package com.PortfolioBackend.Portfolio;

import com.PortfolioBackend.Portfolio.Entidades.*;
import com.PortfolioBackend.Portfolio.Repositorios.*;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class PortfolioApplication {
	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

/*	@Bean
	public CommandLineRunner initData(PersonaRepositorio personaRepositorio, EducacionRepositorio educacionRepositorio, ExperienciaRepositorio experienciaRepositorio, ProyectoRepositorio proyectoRepositorio, HabilidadRepositorio habilidadRepositorio) {
		return (args) -> {
			Persona persona1 = new Persona("Lucila", "Alochis", "lucila@gmail.com", "Fullstack Developer Java", 3516883861L, "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687563017/xq6ryu7xhsey3xl4bvec.png");

			Educacion educacion1 = new Educacion("Desarrollo Web Fullstack Java", "700 horas de cursada en remoto, simulando un entorno real de trabajo bajo las metodologías ágiles (SCRUM)", "Mindhub", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687994719/zyro-image_1_ijocqv.jpg", LocalDate.of(2023, 2, 2), LocalDate.of(2023, 6, 6), "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687997180/Captura_de_pantalla_74_elvczd.png");
			Educacion educacion2 = new Educacion("Desarrollo Web Fullstack", "Programa del gobierno nacional que impulsó el estudio de programación web fullstack gratis, de 7 meses", "Argentina Programa", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687999180/zyro-image_4_b2wfeh.jpg", LocalDate.of(2022, 04, 02), LocalDate.of(2022, 12, 02), "Aún no terminado");
			Educacion educacion3 = new Educacion("Desarrollo web fullstack Python", "Programa de la ciudad de Buenos Aires que impulsó el estudio de programación web fullstack gratis, con duración de 4 meses", "Codo a codo", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687998687/zyro-image_3_lmvijj.jpg", LocalDate.of(2022, 8,02), LocalDate.of(2022, 12, 8), "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687997329/Captura_de_pantalla_76_d8gite.png");

			persona1.añadirEducacion(educacion1);
			persona1.añadirEducacion(educacion2);
			persona1.añadirEducacion(educacion3);

			personaRepositorio.save(persona1);

			educacionRepositorio.save(educacion1);
			educacionRepositorio.save(educacion2);
			educacionRepositorio.save(educacion3);

			Experiencia experiencia1 = new Experiencia("Bootcamp Mindhub", "700 horas de cursada en remoto, simulando un entorno real de trabajo bajo las metodologías ágiles (SCRUM), realizando proyectos 100% reales y desafiantes con sprints semanales para adquirir experiencia", "Mindhub", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687994719/zyro-image_1_ijocqv.jpg", LocalDate.of(2023, 3, 23), LocalDate.of(2023, 5, 22), "https://mindhubweb.com/");
			Experiencia experiencia2 = new Experiencia("Coordinadora Bagués", "Coordinadora de equipo de ventas de más de 30 personas, impulsando al equipo a las ventas y a lograr las mejores ganancias", "Mindhub", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687994691/zyro-image_pdzvua.jpg", LocalDate.of(2019, 5, 23), LocalDate.of(2022, 6, 13), "https://bagues.net/");

			persona1.añadirExperiencia(experiencia1);
			persona1.añadirExperiencia(experiencia2);

			personaRepositorio.save(persona1);

			experienciaRepositorio.save(experiencia1);
			experienciaRepositorio.save(experiencia2);

			Proyecto proyecto1 = new Proyecto("Homebanking Mindhub Brothers","Aplicación que permite hacer operaciones bancarias, inicio de sesión, registro, creación de cuentas, tarjetas transacciones, préstamos, entre otras cosas." ,"https://github.com/LuciFAl99/HomebankingMindhub", "https://homebankingmindhub-production-2b1e.up.railway.app/Web/index.html", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687566830/Captura_de_pantalla_58_kdeiil.png", LocalDate.of(2023, 3, 23), LocalDate.of(2023, 5, 22));
			Proyecto proyecto2 = new Proyecto("E-commerce TripNow", "Aplicación desarrollada en la última etapa del Bootcamp, creando un DER desde cero. Esta aplicación permite comprar paquetes de viajes y agregarlos a un carrito, así como realizar pagos. Trabajo desarrollado en equipo implementando la metodología SCRUM","https://github.com/Flor87Posta/EcommerceTripNow", "https://ecommercetripnow-production.up.railway.app/html/index.html", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687910389/Captura_de_pantalla_63_ssdfgn.png", LocalDate.of(2023, 5, 23), LocalDate.of(2023, 6, 7));
			Proyecto proyecto3 = new Proyecto("Amazing Events","Aplicación que obtiene los datos de todo tipo de eventos desde una API. La interfaz permite buscar y filtrar los eventos a través de una caja de búsqueda y de selección, entre otras cosas","https://github.com/LuciFAl99/Task-4-con-Vue", "Aún no se hizo el deploy", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687567240/Captura_de_pantalla_60_jf5e5d.png", LocalDate.of(2023, 2, 27), LocalDate.of(2023, 3, 17));
			Proyecto proyecto4 = new Proyecto("Pet shop","Proyecto integrador final de la etapa Javascript del Bootcamp. E-commerce que permite comprar productos de farmacia y de juguetería para animales, con un carrito de compras incluído. También permite filtrar por precio y categoría","https://github.com/5ag5/PET-SHOP-FINAL", "Aún no se hizo el deploy", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687910669/Captura_de_pantalla_66_jmd0d3.png",LocalDate.of(2023, 3, 18), LocalDate.of(2023, 3, 22));
			Proyecto proyecto5 = new Proyecto("Checkpoint eliminatoerio", "Desafío de la primera etapa del Bootcamp Mindhub en el cual debíamos replicar exactamente una página en 3 horas de tiempo, aplicando solo HTML y CSS, además que debía ser full-responsive", "https://github.com/LuciFAl99/Checkpoint-Mindhub/tree/master", "Aún no se hizo el deploy", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687911919/Captura_de_pantalla_68_d7lffh.png", LocalDate.of(2023, 2, 17), LocalDate.of(2023, 3, 17));
			Proyecto proyecto6 = new Proyecto("Mi primer sitio web", "Primer desafío del Bootcamp Mindhub, el cual se debía aprobar para poder rendir el checkpoint eliminatorio. Hecho sólo con HTML y CSS, es full-responsive", "https://github.com/LuciFAl99/Proyecto-Web-Mindhub", "Aún no se hizo el deploy", "https://res.cloudinary.com/dgxi75zjp/image/upload/v1687912396/Captura_de_pantalla_70_m3qiop.png", LocalDate.of(2023, 2, 6), LocalDate.of(2023, 2, 16));

			persona1.añadirProyecto(proyecto1);
			persona1.añadirProyecto(proyecto2);
			persona1.añadirProyecto(proyecto3);
			persona1.añadirProyecto(proyecto4);
			persona1.añadirProyecto(proyecto5);
			persona1.añadirProyecto(proyecto6);

			personaRepositorio.save(persona1);

			proyectoRepositorio.save(proyecto1);
			proyectoRepositorio.save(proyecto2);
			proyectoRepositorio.save(proyecto3);
			proyectoRepositorio.save(proyecto4);
			proyectoRepositorio.save(proyecto5);
			proyectoRepositorio.save(proyecto6);

			Habilidad habilidad1 = new Habilidad("Java", 80);
			Habilidad habilidad2 = new Habilidad("JavaScript", 60);
			Habilidad habilidad3 = new Habilidad("HTML", 75);
			Habilidad habilidad4 = new Habilidad("CSS", 75);
			Habilidad habilidad5 = new Habilidad("Bootstrap", 65);
			Habilidad habilidad6 = new Habilidad("Spring", 75);
			Habilidad habilidad7 = new Habilidad("PostgreSQL", 50);
			Habilidad habilidad8 = new Habilidad("Angular", 70);
			Habilidad habilidad9 = new Habilidad("Postman", 82);

			persona1.añadirHabilidad(habilidad1);
			persona1.añadirHabilidad(habilidad2);
			persona1.añadirHabilidad(habilidad3);
			persona1.añadirHabilidad(habilidad4);
			persona1.añadirHabilidad(habilidad5);
			persona1.añadirHabilidad(habilidad6);
			persona1.añadirHabilidad(habilidad7);
			persona1.añadirHabilidad(habilidad8);
			persona1.añadirHabilidad(habilidad9);

			personaRepositorio.save(persona1);

			habilidadRepositorio.save(habilidad1);
			habilidadRepositorio.save(habilidad2);
			habilidadRepositorio.save(habilidad3);
			habilidadRepositorio.save(habilidad4);
			habilidadRepositorio.save(habilidad5);
			habilidadRepositorio.save(habilidad6);
			habilidadRepositorio.save(habilidad7);
			habilidadRepositorio.save(habilidad8);
			habilidadRepositorio.save(habilidad9);



		};
	}*/
}

