import java.util.ArrayList;

public class Machine {
    private ArrayList<Packet> buffer;
    private ArrayList<Packet> memory;

    public Machine(){
        this.buffer = new ArrayList<Packet>();
        this.memory = new ArrayList<Packet>();
    }

    public void enqueue(Packet packet){
        buffer.add(packet);
    }
    public void dequeue(){
        Packet packet = buffer.removeFirst(); //get packet from memory and assign it to variable "packet"
        memory.add(0, packet); //Add packet to the first index in the memory
        for (int i = 1; i < memory.size(); i++) { //For all packets in the memory, **starting at 1**
            Packet current = memory.get(i); //Get packet at current index
            int step = i; //Set step variable to current loop index

            /*
            While loop. While the step is greater than 0 AND the packet to the left of the current packet's position is
            greater than the position of the current packet
            */
            while(step > 0 && memory.get(step - 1).getPosition() > current.getPosition()){
                memory.set(step, memory.get(step - 1)); //Set the value of the packet at location step to the value of
                                                        //the packet with the value greater than the packet at step.

                step--; //Decrement step. This ensures all values are properly shifted.
            }
           memory.set(step, current);   //Once shifting is done and space is open, sets current packet to the location
                                        //of step.
        }
    }

    public boolean isEmpty(){
        return buffer.isEmpty();
    }

    public ArrayList<Packet> getMemory() {
        return this.memory;
    }
}
