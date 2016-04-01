package search;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class AStar {

	private final static int MAX_DEPTH = 6;
	
	public LinkedList<Friend> findFriendChain(Friend start, Friend goal){
		if(start == null || goal == null)
			return null;
		LinkedList<Friend> path = new LinkedList<Friend>();
		HashMap<Long, Friend> closed = new HashMap<Long, Friend>();
		TreeSet<Friend> open = new TreeSet<Friend>();
		start.fscore = start.gscore + heuristicDistance(start, goal);
		open.add(start);
		Friend current = start;
		while(!open.isEmpty()){
			current = open.pollFirst();
			if(current.id == goal.id)
				return reconstructPath(current);
			closed.put(current.id, current);
			for(Friend f : current.friends){
				if(!closed.containsKey(f.id) && current.level < MAX_DEPTH){
					Integer tentative = current.gscore + heuristicDistance(current, f);
					boolean isContained = open.contains(f);
					if(!isContained || tentative < f.gscore){
						f.source = current;
						f.level = current.level + 1;
						f.gscore = tentative;
						f.fscore = f.gscore + heuristicDistance(f, goal);
						if(!isContained)
							open.add(f);
					}
				}
			}
			
		}
		return null;
	}
	
	private Integer heuristicDistance(Friend start, Friend goal) {
		Integer distance = new Random().nextInt(100);
		//Implementation of Euclidean or Manhattan Distance.
		return distance;
	}

	private LinkedList<Friend> reconstructPath(Friend target){
		LinkedList<Friend> path = new LinkedList<Friend>();
		Friend current = target;
		while(current != null){
			path.add(current);
			current = current.source;
		}
		Collections.reverse(path);
		return path;
	}
	
	public static void main(String args[]){
		Long id = new Random().nextLong();
		Friend me = new Friend(id, "me");
		id = new Random().nextLong();
		Friend target = new Friend(id, "1");
		id = new Random().nextLong();
		Friend target2 = new Friend(id, "2");
		id = new Random().nextLong();
		Friend target3 = new Friend(id, "3");
		id = new Random().nextLong();
		Friend target4 = new Friend(id, "4");
		id = new Random().nextLong();
		Friend target5 = new Friend(id, "5");
		id = new Random().nextLong();
		Friend target6 = new Friend(id, "6");
		id = new Random().nextLong();
		Friend target7 = new Friend(id, "7");
		id = new Random().nextLong();
		Friend target8 = new Friend(id, "8");
		id = new Random().nextLong();
		Friend target9 = new Friend(id, "9");
		id = new Random().nextLong();
		Friend target11 = new Friend(id, "11");
		id = new Random().nextLong();
		Friend target12 = new Friend(id, "12");
		me.friends.add(target2);
		me.friends.add(target5);
		me.friends.add(target4);
		target4.friends.add(target3);
		target5.friends.add(target4);
		target5.friends.add(target3);
		target5.friends.add(target7);
		target4.friends.add(target7);
		target7.friends.add(target8);
		target7.friends.add(target11);
		target5.friends.add(target9);
		target5.friends.add(target6);
		target9.friends.add(target11);
		target11.friends.add(target12);
		target9.friends.add(target12);
		target12.friends.add(target);
		AStar as = new AStar();
		LinkedList<Friend> ll = as.findFriendChain(me, target);
		System.out.println(ll);
	}
}

class User{
}

class Friend implements Comparable<Friend>{
	Long id;
	String name;
	Integer gscore;
	Integer fscore;
	User u;
	Integer level;
	LinkedList<Friend> friends;
	Friend source;
	
	public Friend(Long id, String name){
		this.id = id;
		this.name = name;
		gscore = 0;
		fscore = 0;
		level = 0 ;
		friends = new LinkedList<Friend>();
	}
	
	public int compareTo(Friend f){
		return this.fscore.compareTo(f.fscore);
	}
	
	public String toString(){
		return name;
	}
	
}