package daopoxy;

import java.sql.SQLException;
import java.util.List;

import daoimpl.SeatImp;
import daovo.Seat;

public class SeatPoxy implements SeatImp {

	@Override
	public List<Seat> findAllPerson(int movieid) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllPerson(int movieid) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
