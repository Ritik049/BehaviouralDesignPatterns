package MediatorDesignPattern;
import java.util.*;
public class AirPortHeadOfficeMediator implements MediatorInterface{

        Component pilot;
        Component staff;

        public AirPortHeadOfficeMediator(Component pilot, Component staff)
        {
             this.pilot = pilot;
             this.staff = staff;

             pilot.setMediator(this);
             staff.setMediator(this);

        }

        public void notify( String message)
        {
            pilot.receive(message);
            staff.receive(message);
        }
}
