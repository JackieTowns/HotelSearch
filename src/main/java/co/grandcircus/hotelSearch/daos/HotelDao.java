package co.grandcircus.hotelSearch.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.grandcircus.hotelSearch.entities.Hotel;

@Repository
@Transactional
public class HotelDao {

	@PersistenceContext
	EntityManager em;

	public List<Hotel> findAll() {

		List<Hotel> theHotels = em.createQuery("FROM Hotel", Hotel.class).getResultList();
		return theHotels;
	}

	public Hotel findById(Long id) {
		return em.find(Hotel.class, id);
	}

	public void create(Hotel hotels) {
		em.persist(hotels);
	}

	public void update(Hotel hotels) {
		em.merge(hotels);
	}

	public void delete(Long id) {
		Hotel hotels = em.getReference(Hotel.class, id);
		em.remove(hotels);
	}

	public List<Hotel> findByCity(String city) {
		return em.createQuery("FROM Hotel WHERE city = :city ORDER BY pricePerNight ", Hotel.class)
				.setParameter("city", city).getResultList();
	}

//	public List<Hotel> findByPrice(Integer pricePerNight) {
//		return em.createQuery("FROM Hotel ORDER BY pricePerNight = :pricePerNight", Hotel.class)
//				.setParameter("pricePerNight", pricePerNight).getResultList();
//	}

}