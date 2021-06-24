package za.co.dubedivine.groceryapp.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import za.co.dubedivine.groceryapp.model.GroceryItem

@Repository
interface GroceryItemRepository: CrudRepository<GroceryItem, Long>{


    //@Query("select g from GroceryItem g where g.isAvailable = ?1")
    //fun findItemsByAvailability(availability: Boolean): List<GroceryItem>;
}

