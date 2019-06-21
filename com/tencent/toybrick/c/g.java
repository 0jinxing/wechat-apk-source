package com.tencent.toybrick.c;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.tencent.toybrick.f.a;

public abstract class g<S extends g, T extends a> extends f<S, T>
  implements Comparable<g>
{
  public boolean AGG;
  private int[] AGH;
  CharSequence IT;
  public int btQ;

  public g.b dSy()
  {
    return g.b.AGN;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramObject == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if ((paramObject instanceof g))
      {
        paramObject = (g)paramObject;
        bool2 = bool1;
        if (paramObject.AGC != null)
        {
          bool2 = bool1;
          if (paramObject.AGC.equals(this.AGC))
          {
            bool2 = bool1;
            if (paramObject.IT != null)
            {
              bool2 = bool1;
              if (paramObject.IT.equals(this.IT))
              {
                bool2 = bool1;
                if (paramObject.AGG == this.AGG)
                {
                  bool2 = bool1;
                  if (paramObject.isVisible == this.isVisible)
                  {
                    bool2 = bool1;
                    if (paramObject.AGD == this.AGD)
                      bool2 = true;
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public final int[] fz(View paramView)
  {
    View localView = paramView.findViewById(16908310);
    paramView = this.AGH;
    if (localView == null);
    for (int i = (int)this.AGA.getResources().getDimension(2131427584); ; i = localView.getLeft())
    {
      paramView[0] = i;
      this.AGH[1] = ((int)this.AGA.getResources().getDimension(2131427584));
      return this.AGH;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.c.g
 * JD-Core Version:    0.6.2
 */