package se.hh.aoop.test.assignment2.exercise12;

import se.hh.aoop.src.assignment2.exercise12.*;

import java.util.ArrayList;
import java.util.List;

public class TestVisitors {
	public static void main(String[] args) {
		args = new String[] { "one", "two", "three" };
		List<Tree<String>> leaves = new ArrayList<>();
		for (int i = 0; i < args.length; i++)
			leaves.add(new Leaf<>(args[i]));
		Tree<String> t1 = new Node<>(leaves);
		Tree<String> t2 = new Node<>(leaves);
		Tree<String> t3 = new Node<>(leaves);
		List<Tree<String>> lst = new ArrayList<Tree<String>>();
		lst.add(t1);
		lst.add(t2);
		//lst.add(t3);
		Tree<String> t = new Node<String>(lst);
//		TreeVisitor<String,Integer> thv = new TreeHeightVisitor<String>();
//		TreeVisitor<String,List<String>> llv = new ListLeavesVisitor<String>();
//		TreeVisitor<String,Integer> lcv = new LeavesCountVisitor<String>();
//		System.out.println("Tree height: "+t.accept(thv));
//		System.out.println("Leaves: "+t.accept(llv));
//		System.out.println("Leaves count: "+t.accept(lcv));
		TreeVisitor<String,String,Integer> handsome = new PrettyPrintVisitor<>();
		System.out.println(t.accept(handsome,0));
	}
}
