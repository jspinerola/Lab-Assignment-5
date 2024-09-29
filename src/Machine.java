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
        memory.add(0, packet);
        for (int i = 1; i < memory.size(); i++) {
            Packet current = memory.get(i);
            int step = i;
            while(step > 0 && memory.get(step - 1).getPosition() > current.getPosition()){
                memory.set(step, memory.get(step - 1));
                step--;
            }
           memory.set(step, current);
        }
    }

    public boolean isEmpty(){
        return buffer.isEmpty();
    }

    public ArrayList<Packet> getMemory() {
        return this.memory;
    }
}
