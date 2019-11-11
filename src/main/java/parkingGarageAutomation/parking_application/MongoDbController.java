package parkingGarageAutomation.parking_application;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDbController extends MongoRepository<CustReg,String> 
{

}