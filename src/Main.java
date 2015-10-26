
public class Main {
	
	public static void main(String args[])
	{
		ListNode l1=null;
		ListNode l2=null;
		
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);
		ListNode n7=new ListNode(7);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		
		l1=n1;
		
		n1=new ListNode(4);
		n2=new ListNode(7);
		n3=new ListNode(9);
		n4=new ListNode(10);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		l2=n1;
		ListNode result=null;
		Main obj=new Main();
		result=obj.mergeTwoLists(l1, l2);
		obj.traverseList(result);
		
	}
	
	public void traverseList(ListNode node)
	{
		while(node!=null)
		{
			System.out.print(node.val+"-");
			node=node.next;
		}
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
		{
        
        ListNode st1=l1;
        ListNode st2=l2;
        ListNode result=null;
        
        if(st1==null)
            return st2;
        if(st2==null)
            return st1;
        if(st1==null && st2==null)
            return null;
        
        
        while(st1!=null && st2!=null)
        {
            if(st1.val<st2.val)
            {
                if(result==null)
                {
                    ListNode nNode=new ListNode(st1.val);
                    nNode.next=null;
                    result=nNode;
                }
                else
                {
                    ListNode temp=result;
                    while(temp.next!=null)
                    {
                        temp=temp.next;
                    }
                    ListNode nNode=new ListNode(st1.val);
                    nNode.next=null;
                    temp.next=nNode;
                }
                
                st1=st1.next;
            }
            else if(st1.val>st2.val)
            {
                if(result==null)
                {
                    ListNode nNode=new ListNode(st2.val);
                    nNode.next=null;
                    result=nNode;
                }
                else
                {
                    ListNode temp=result;
                    while(temp.next!=null)
                    {
                        temp=temp.next;
                    }
                    ListNode nNode=new ListNode(st2.val);
                    nNode.next=null;
                    temp.next=nNode;
                }
                st2=st2.next;
            }
            else
            {
                if(result==null)
                {
                    ListNode nNode2=new ListNode(st2.val);
                    nNode2.next=null;
                    ListNode nNode1=new ListNode(st1.val);
                    nNode1.next=nNode2;
                    result=nNode1;
                }
                else
                {
                    ListNode temp=result;
                    while(temp.next!=null)
                    {
                        temp=temp.next;
                    }
                    ListNode nNode2=new ListNode(st2.val);
                    nNode2.next=null;
                    ListNode nNode1=new ListNode(st1.val);
                    nNode1.next=nNode2;
                    temp.next=nNode1;
                }
                
                st1=st1.next;
                st2=st2.next;
            }
        }
        
        while(st1!=null)
        {
            if(result==null)
            {
                    ListNode nNode=new ListNode(st1.val);
                    nNode.next=null;
                    result=nNode;
            }
            else
            {
                ListNode temp=result;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                ListNode nNode=new ListNode(st1.val);
                nNode.next=null;
                temp.next=nNode;
            }
            st1=st1.next;
        }
        
        while(st2!=null)
        {
            if(result==null)
            {
                    ListNode nNode=new ListNode(st2.val);
                    nNode.next=null;
                    result=nNode;
            }
            else
            {
                ListNode temp=result;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                ListNode nNode=new ListNode(st2.val);
                nNode.next=null;
                temp.next=nNode;
            }
            st2=st2.next;
        }
        
        return result;
        
        
        
	}
}
