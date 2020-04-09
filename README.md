# Spring-dependency-injection

Objective: Less dependency between objects.

Injection using constructor.
We can delete "set" methods, because we are using the constructor instead.

    @Component
    public class Person {

      private int id;
      private String name;
      private String nickName;

      public Person(int id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        System.out.println("Constructor with all parameteres called...");
      }

      public Person(int id) {
      this.id = id;
      System.out.println("Constructor with Id parameter called...");
      }

      public int getId() {
      return id;
      }

      public String getName() {
      return name;
      }

      public String getNickName() {
      return nickName;
      }

    }

<bean> (instead of <property> tag, we are using <constructor-arg> tag). 

	<bean id="myPerson" class="com.eflu.dependency.injection.Person">
		<constructor-arg index="0" value="1"></constructor-arg>
		<constructor-arg index="2" value="chano"></constructor-arg>
		<constructor-arg index="1" value="Edgar"></constructor-arg>
	</bean>
 
 This bean means that Spring internally does:
 Person myPerson = new Person(1,"Edgar","chano");
