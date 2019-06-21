package android.support.v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b
  implements o
{
  protected Context aak;
  protected LayoutInflater aal;
  private int aam;
  private int aan;
  public p aao;
  public o.a lL;
  public h lo;
  protected Context mContext;
  public int mId;
  protected LayoutInflater mInflater;

  public b(Context paramContext)
  {
    this.aak = paramContext;
    this.aal = LayoutInflater.from(paramContext);
    this.aam = 2130968587;
    this.aan = 2130968586;
  }

  public View a(j paramj, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof p.a));
    for (paramView = (p.a)paramView; ; paramView = (p.a)this.aal.inflate(this.aan, paramViewGroup, false))
    {
      a(paramj, paramView);
      return (View)paramView;
    }
  }

  public void a(Context paramContext, h paramh)
  {
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(this.mContext);
    this.lo = paramh;
  }

  public void a(h paramh, boolean paramBoolean)
  {
    if (this.lL != null)
      this.lL.a(paramh, paramBoolean);
  }

  public abstract void a(j paramj, p.a parama);

  public final void a(o.a parama)
  {
    this.lL = parama;
  }

  public boolean a(u paramu)
  {
    if (this.lL != null);
    for (boolean bool = this.lL.d(paramu); ; bool = false)
      return bool;
  }

  public final boolean b(j paramj)
  {
    return false;
  }

  protected boolean b(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }

  public boolean bt()
  {
    return false;
  }

  public final boolean c(j paramj)
  {
    return false;
  }

  public boolean e(j paramj)
  {
    return true;
  }

  public p f(ViewGroup paramViewGroup)
  {
    if (this.aao == null)
    {
      this.aao = ((p)this.aal.inflate(this.aam, paramViewGroup, false));
      this.aao.a(this.lo);
      n(true);
    }
    return this.aao;
  }

  public final int getId()
  {
    return this.mId;
  }

  public void n(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)this.aao;
    if (localViewGroup == null);
    label218: label225: 
    while (true)
    {
      return;
      int m;
      if (this.lo != null)
      {
        this.lo.gC();
        ArrayList localArrayList = this.lo.gB();
        int i = localArrayList.size();
        int j = 0;
        int k = 0;
        m = k;
        if (j < i)
        {
          j localj = (j)localArrayList.get(j);
          if (!e(localj))
            break label218;
          View localView1 = localViewGroup.getChildAt(k);
          if ((localView1 instanceof p.a));
          for (Object localObject = ((p.a)localView1).getItemData(); ; localObject = null)
          {
            View localView2 = a(localj, localView1, localViewGroup);
            if (localj != localObject)
            {
              localView2.setPressed(false);
              localView2.jumpDrawablesToCurrentState();
            }
            if (localView2 != localView1)
            {
              localObject = (ViewGroup)localView2.getParent();
              if (localObject != null)
                ((ViewGroup)localObject).removeView(localView2);
              ((ViewGroup)this.aao).addView(localView2, k);
            }
            k++;
            j++;
            break;
          }
        }
      }
      while (true)
      {
        if (m >= localViewGroup.getChildCount())
          break label225;
        if (!b(localViewGroup, m))
        {
          m++;
          continue;
          break;
          m = 0;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.b
 * JD-Core Version:    0.6.2
 */