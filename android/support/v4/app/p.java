package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.view.s;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class p
{
  protected static void a(List<View> paramList, View paramView)
  {
    int i = paramList.size();
    if (a(paramList, paramView, i));
    while (true)
    {
      return;
      paramList.add(paramView);
      for (int j = i; j < paramList.size(); j++)
      {
        paramView = (View)paramList.get(j);
        if ((paramView instanceof ViewGroup))
        {
          paramView = (ViewGroup)paramView;
          int k = paramView.getChildCount();
          for (int m = 0; m < k; m++)
          {
            View localView = paramView.getChildAt(m);
            if (!a(paramList, localView, i))
              paramList.add(localView);
          }
        }
      }
    }
  }

  private static boolean a(List<View> paramList, View paramView, int paramInt)
  {
    boolean bool1 = false;
    for (int i = 0; ; i++)
    {
      boolean bool2 = bool1;
      if (i < paramInt)
      {
        if (paramList.get(i) == paramView)
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  protected static void b(View paramView, Rect paramRect)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    paramRect.set(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + paramView.getWidth(), arrayOfInt[1] + paramView.getHeight());
  }

  static ArrayList<String> c(ArrayList<View> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)paramArrayList.get(j);
      localArrayList.add(s.ai(localView));
      s.b(localView, null);
    }
    return localArrayList;
  }

  public static boolean h(List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public abstract Object a(Object paramObject1, Object paramObject2, Object paramObject3);

  final void a(View paramView, final ArrayList<View> paramArrayList1, final ArrayList<View> paramArrayList2, final ArrayList<String> paramArrayList, Map<String, String> paramMap)
  {
    final int i = paramArrayList2.size();
    final ArrayList localArrayList = new ArrayList();
    int j = 0;
    if (j < i)
    {
      Object localObject = (View)paramArrayList1.get(j);
      String str = s.ai((View)localObject);
      localArrayList.add(str);
      if (str != null)
      {
        s.b((View)localObject, null);
        localObject = (String)paramMap.get(str);
      }
      for (int k = 0; ; k++)
        if (k < i)
        {
          if (((String)localObject).equals(paramArrayList.get(k)))
            s.b((View)paramArrayList2.get(k), str);
        }
        else
        {
          j++;
          break;
        }
    }
    z.a(paramView, new Runnable()
    {
      public final void run()
      {
        for (int i = 0; i < i; i++)
        {
          s.b((View)paramArrayList2.get(i), (String)paramArrayList.get(i));
          s.b((View)paramArrayList1.get(i), (String)localArrayList.get(i));
        }
      }
    });
  }

  public abstract void a(ViewGroup paramViewGroup, Object paramObject);

  public abstract void a(Object paramObject, Rect paramRect);

  public abstract void a(Object paramObject, View paramView);

  public abstract void a(Object paramObject, View paramView, ArrayList<View> paramArrayList);

  public abstract void a(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3);

  public abstract void a(Object paramObject, ArrayList<View> paramArrayList);

  public abstract void a(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);

  final void a(ArrayList<View> paramArrayList, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      if (!(paramView instanceof ViewGroup))
        break label64;
      paramView = (ViewGroup)paramView;
      if (!u.e(paramView))
        break label33;
      paramArrayList.add(paramView);
    }
    while (true)
    {
      return;
      label33: int i = paramView.getChildCount();
      for (int j = 0; j < i; j++)
        a(paramArrayList, paramView.getChildAt(j));
      continue;
      label64: paramArrayList.add(paramView);
    }
  }

  final void a(Map<String, View> paramMap, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      String str = s.ai(paramView);
      if (str != null)
        paramMap.put(str, paramView);
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i = paramView.getChildCount();
        for (int j = 0; j < i; j++)
          a(paramMap, paramView.getChildAt(j));
      }
    }
  }

  public abstract Object b(Object paramObject1, Object paramObject2, Object paramObject3);

  public abstract void b(Object paramObject, View paramView);

  public abstract void b(Object paramObject, View paramView, ArrayList<View> paramArrayList);

  public abstract void b(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);

  public abstract void c(Object paramObject, View paramView);

  public abstract boolean j(Object paramObject);

  public abstract Object k(Object paramObject);

  public abstract Object l(Object paramObject);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.p
 * JD-Core Version:    0.6.2
 */