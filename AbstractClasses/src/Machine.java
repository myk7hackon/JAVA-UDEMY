
public abstract class Machine {
int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public abstract void start();
public void run()
{
	start();
}

}
