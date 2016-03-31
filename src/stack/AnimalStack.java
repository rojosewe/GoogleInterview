public interface Animal{
		Date getArrivalTime();
}

public class Cat() implements Animal{
		Date arrivalTime;
			
			public Date getArrivalTime(){
						return arrivalTime;
							}
}

public class Dog() implements Animal{
		Date arrivalTime;

		public Date getArrivalTime(){
					return arrivalTime;
						}
}

public class AnimalStack{

	Queue<Cat> cats = new LinkedList<Cat>();
	Queue<Dog> dogs  = new LinkedList<Dog>();

	public void enqueue(Animal animal){
			if(animal instanceof Cat){
						cats.push((Cat)animal);
							}else if(animal instanceof Dog){
										dogs.push((Dog)animal);
											}else {
														return;
											} 
	}

	public Animal dequeueAny(){
			if(cats.isEmpty() && dogs.isEmpty())
						return null;
				if(dogs.isEmpty() || cats.peek().getArrivalTime().compareTo(dogs.peek()){
							return cats.pop();
								}else{
											return dogs.pop();
												}
	}

	public Cat dequeueCat()  {
			if(!cats.isEmpty())
							return cats.pop();
					return null;
	}

	public Dog dequeueDog()  {
			if(!dogs.isEmpty())
							return dogs.pop();
					return null;
	}
}

	}
	}
								}
				})
	}
											}
							}
			}
	}
}
		}
}
			}
}
}
