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
        Packet packet = buffer.removeFirst();
        for (int i = 0; i < memory.size() - 1; i++) {
            Packet nextPacket = memory.get(i + 1);
            while(packet.getPosition() > nextPacket.getPosition()){


            }
             6 0 1 5 3 4 7
            //while item is greater than the adjacent item, swap.

        }
    }

    public boolean isEmpty(){

    }

    public ArrayList<Packet> getMemory() {
        return this.memory;
    }
}
