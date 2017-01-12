package checkpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FindPathInTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  in=new Scanner(System.in);
		String input=in.nextLine();
		String[] res=processing(input);
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
		}		
		in.close();
	}

	private static String[] processing(String input) {
		String [] str1=input.split(" ");
		int sum=Integer.parseInt(str1[0]);
		String[] str2=str1[1].split(",");
		int len=str2.length;
		int[] treesNum=new int[len];
		for(int i=0;i<len;i++){
			treesNum[i]=Integer.parseInt(str2[i]);
		}
		
		// 构造二叉树，并生成所有的路径列表
		List<List<Integer>> llist=build(treesNum);
		// 路径个数
		int pathNum=llist.size();
		// 计算每个路径上的和
		int[] nums=new int[pathNum];
		for(int i=0;i<pathNum;i++){
			int tempSum=0;
			List<Integer> tempList=llist.get(i);
			for(int a:tempList){
				tempSum+=a;
			}
			nums[i]=tempSum;
		}
		// 计算路径列表
		List<List<Integer>> pathLists=caculatePath(nums,llist,sum);
		String[] result=findResult(pathLists);
		return result;
	}

	private static String[] findResult(List<List<Integer>> pathLists) {
		int size=pathLists.size();
		String[] result=new String[size];	
		for(int i=0;i<size;i++){
			int lastindex=0;
			result[0]=pathLists.get(i).get(0)+",";
			for(int a=1;a<(pathLists.get(i).size()-1);a++){
				result[i]=result[i]+pathLists.get(i).get(a)+",";
				lastindex++;
			}
			result[i]=result[i]+pathLists.get(i).get(lastindex)+"$";
		}
		return result;
	}

	private static List<List<Integer>> caculatePath(int[] nums, List<List<Integer>> llist, int sum) {
		List<List<Integer>> pathLists=new ArrayList<List<Integer>>();
		int len=nums.length;
		for(int i=0;i<len;i++){
			if(sum==nums[i]){
				pathLists.add(llist.get(i));
			}
		}
		return pathLists;
	}

	private static List<List<Integer>> build(int[] nums) {
		List<List<Integer>> treeList=new ArrayList<List<Integer>>();
		int len=nums.length;      // 树种总的节点个数
		int censhu=0;             // 树的层数
		while(Math.pow(2, censhu)<len){
			censhu++;
		}
		
		List<Integer> temp=new ArrayList<>();
		// 初始化
		temp.add(nums[0]);
		int start=1;
		int nodeNum=1;
		treeList.add(temp);
		// 按层给treeList赋值
		for(int i=2;i<censhu;i++){

			for(int j=0;j<nodeNum;j++){
				int index=2*j;				
				treeList.add(index+1, (treeList.get(index)));				
			}			
			nodeNum=nodeNum*2;
			
			for(int m=0;m<nodeNum;m++){
				List<Integer> l=new ArrayList<>();
				l.addAll(treeList.get(m));
				l.add(nums[start]);
				treeList.remove(m);
				treeList.add(m, l);
				start++;
			}
		}
		// 给最后的半层赋值
		int finished=(int)(Math.pow(2, censhu-1)-1);
		List<Integer> l=new ArrayList<>();
		int surplus=(int)(len-finished);    // 最后一层的个数
		for(int p=0;p<(surplus/2);p++){
			l.clear();
			l.addAll(treeList.get(2*p));			
			treeList.add(2*p+1, l);
		}
		int h=finished;
		for(int p=0;p<surplus;p++){			
			treeList.get(p).add(nums[h++]);			
		}
		
		return treeList;
	}

}
