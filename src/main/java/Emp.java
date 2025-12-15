import java.util.Objects;

public class Emp {
	private int eid;
	private String ename;
	private double sal;
	private String desig;
	private Dept dept;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eid, String ename, double sal, String desig, Dept dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.desig = desig;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((desig == null) ? 0 : desig.hashCode());
		result = prime * result + eid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (desig == null) {
			if (other.desig != null)
				return false;
		} else if (!desig.equals(other.desig))
			return false;
		if (eid != other.eid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", desig=" + desig + ", dept=" + dept
				+ ", getEid()=" + getEid() + ", getEname()=" + getEname() + ", getSal()=" + getSal() + ", getDesig()="
				+ getDesig() + ", getDept()=" + getDept() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
