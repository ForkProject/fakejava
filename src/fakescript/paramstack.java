package fakescript;

import java.util.ArrayList;

class paramstack
{
	private fake m_f;
	
	private ArrayList<variant> m_variant_list = new ArrayList<variant>();
	
	public paramstack(fake f)
	{
		m_f = f;
	}
	
	public void clear()
	{
		m_variant_list.clear();
	}
	
	public variant push_and_get()
	{
		variant v = new variant();
		m_variant_list.add(v);
		return v;
	}
	
	public variant pop_and_get()
	{
		try
		{
			variant v = m_variant_list.get(m_variant_list.size() - 1);
			m_variant_list.remove(m_variant_list.size() - 1);
			return v;
		}
		catch (Exception e)
		{
			return null;
		}
	}
	
	public variant get(int i)
	{
		try
		{
			return m_variant_list.get(i);
		}
		catch (Exception e)
		{
			return null;
		}
	}
	
	public int size()
	{
		return m_variant_list.size();
	}
}
