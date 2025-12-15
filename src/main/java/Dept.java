import java.util.*;

public class Dept {
   private int deptno;
   private String deptname;
   private String loc;
   private List<Emp> empList;
   
   public Dept() {
	   super();
	// TODO Auto-generated constructor stub
   }

   public Dept(int deptno, String deptname, String loc, List<Emp> empList) {
	super();
	this.deptno = deptno;
	this.deptname = deptname;
	this.loc = loc;
	this.empList = empList;
   }

   public int getDeptno() {
	return deptno;
   }

   public void setDeptno(int deptno) {
	this.deptno = deptno;
   }

   public String getDeptname() {
	   return deptname;
   }

   public void setDeptname(String deptname) {
	   this.deptname = deptname;
   }

   public String getLoc() {
	   return loc;
   }

   public void setLoc(String loc) {
	   this.loc = loc;
   }

   public List<Emp> getEmpList() {
	   return empList;
   }

   public void setEmpList(List<Emp> empList) {
	   this.empList = empList;
   }

   @Override
   public int hashCode() {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + ((deptname == null) ? 0 : deptname.hashCode());
	   result = prime * result + deptno;
	   result = prime * result + ((loc == null) ? 0 : loc.hashCode());
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
	   Dept other = (Dept) obj;
	   if (deptname == null) {
		   if (other.deptname != null)
			   return false;
	   } else if (!deptname.equals(other.deptname))
		   return false;
	   if (deptno != other.deptno)
		   return false;
	   if (loc == null) {
		   if (other.loc != null)
			   return false;
	   } else if (!loc.equals(other.loc))
		   return false;
	   return true;
   }

   @Override
   public String toString() {
	   return "Dept [deptno=" + deptno + ", deptname=" + deptname + ", loc=" + loc + ", getDeptno()=" + getDeptno()
			+ ", getDeptname()=" + getDeptname() + ", getLoc()=" + getLoc() + ", hashCode()=" + hashCode()
			+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
   }
}