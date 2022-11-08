import java.awt.Panel;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;

public class JFrameDemo extends JFrame {
	static JFrame jframe;
	static JList<String[]> jlist;
	
	
	void display(Root root,ArrayList<Datum> list)
	{
		//Root root=new APICaller().getRoot();
		jframe=new JFrame();
		Panel panel=new Panel();
		
		String[] arr1={"page :"+root.page,
				"per page :"+root.per_page,
				"total :"+root.total,
				"total pages :"+root.total_pages};
		panel.add(new JList(arr1));
		jframe.add(panel);
		
		String[] arr2= {"url :"+root.support.getUrl(),
				"text :"+root.support.getText()};
		panel.add(new JList(arr2));
		jframe.add(panel);
		
		
		for(int i=0;i<root.data.size();i++)
		{
			String[] arr= {"id :"+list.get(i).id,
					"email :"+list.get(i).email,
					"first_name :"+list.get(i).first_name,
					"last_name :"+list.get(i).last_name,
					"avatar :"+list.get(i).avatar};
			panel.add(new JList(arr));
			jframe.add(panel);
		}
		
		jframe.setSize(1000,1000);
		jframe.setVisible(true);
	}
}
