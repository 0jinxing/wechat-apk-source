package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

public class an extends aw
{
  private am amf;
  private am amg;

  private static int a(RecyclerView.i parami, View paramView, am paramam)
  {
    int i = paramam.bf(paramView);
    int j = paramam.bj(paramView) / 2;
    if (parami.getClipToPadding());
    for (int k = paramam.je() + paramam.jg() / 2; ; k = paramam.getEnd() / 2)
      return j + i - k;
  }

  private static View a(RecyclerView.i parami, am paramam)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = parami.getChildCount();
    if (i == 0);
    int j;
    int k;
    int m;
    label44: 
    do
    {
      return localObject2;
      if (!parami.getClipToPadding())
        break;
      j = paramam.je() + paramam.jg() / 2;
      k = 2147483647;
      m = 0;
      localObject2 = localObject1;
    }
    while (m >= i);
    localObject2 = parami.getChildAt(m);
    int n = Math.abs(paramam.bf((View)localObject2) + paramam.bj((View)localObject2) / 2 - j);
    if (n < k)
    {
      localObject1 = localObject2;
      k = n;
    }
    while (true)
    {
      m++;
      break label44;
      j = paramam.getEnd() / 2;
      break;
    }
  }

  private am b(RecyclerView.i parami)
  {
    if ((this.amf == null) || (this.amf.amP != parami))
      this.amf = am.e(parami);
    return this.amf;
  }

  private am c(RecyclerView.i parami)
  {
    if ((this.amg == null) || (this.amg.amP != parami))
      this.amg = am.d(parami);
    return this.amg;
  }

  private static View c(RecyclerView.i parami, am paramam)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = parami.getChildCount();
    if (i == 0);
    int j;
    int k;
    do
    {
      return localObject2;
      j = 2147483647;
      k = 0;
      localObject2 = localObject1;
    }
    while (k >= i);
    localObject2 = parami.getChildAt(k);
    int m = paramam.bf((View)localObject2);
    if (m < j)
    {
      localObject1 = localObject2;
      j = m;
    }
    while (true)
    {
      k++;
      break;
    }
  }

  public int a(RecyclerView.i parami, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = -1;
    int k = parami.getItemCount();
    int m;
    if (k == 0)
      m = j;
    while (true)
    {
      return m;
      View localView = null;
      label45: int n;
      if (parami.iH())
      {
        localView = c(parami, b(parami));
        m = j;
        if (localView != null)
        {
          n = RecyclerView.i.bt(localView);
          m = j;
          if (n != -1)
            if (parami.iG())
              if (paramInt1 > 0)
                paramInt1 = 1;
        }
      }
      else
      {
        while (true)
        {
          paramInt2 = i;
          if ((parami instanceof RecyclerView.r.b))
          {
            parami = ((RecyclerView.r.b)parami).bX(k - 1);
            paramInt2 = i;
            if (parami != null)
              if (parami.x >= 0.0F)
              {
                paramInt2 = i;
                if (parami.y >= 0.0F);
              }
              else
              {
                paramInt2 = 1;
              }
          }
          if (paramInt2 == 0)
            break label202;
          if (paramInt1 == 0)
            break label195;
          m = n - 1;
          break;
          if (!parami.iG())
            break label45;
          localView = c(parami, c(parami));
          break label45;
          paramInt1 = 0;
          continue;
          if (paramInt2 > 0)
            paramInt1 = 1;
          else
            paramInt1 = 0;
        }
        label195: m = n;
        continue;
        label202: if (paramInt1 != 0)
          m = n + 1;
        else
          m = n;
      }
    }
  }

  public View a(RecyclerView.i parami)
  {
    if (parami.iH())
      parami = a(parami, b(parami));
    while (true)
    {
      return parami;
      if (parami.iG())
        parami = a(parami, c(parami));
      else
        parami = null;
    }
  }

  public int[] a(RecyclerView.i parami, View paramView)
  {
    int[] arrayOfInt = new int[2];
    if (parami.iG())
    {
      arrayOfInt[0] = a(parami, paramView, c(parami));
      if (!parami.iH())
        break label53;
      arrayOfInt[1] = a(parami, paramView, b(parami));
    }
    while (true)
    {
      return arrayOfInt;
      arrayOfInt[0] = 0;
      break;
      label53: arrayOfInt[1] = 0;
    }
  }

  protected final ah f(RecyclerView.i parami)
  {
    if (!(parami instanceof RecyclerView.r.b));
    for (parami = null; ; parami = new ah(this.aiB.getContext())
    {
      protected final void a(View paramAnonymousView, RecyclerView.r.a paramAnonymousa)
      {
        paramAnonymousView = an.this.a(an.this.aiB.getLayoutManager(), paramAnonymousView);
        int i = paramAnonymousView[0];
        int j = paramAnonymousView[1];
        int k = ca(Math.max(Math.abs(i), Math.abs(j)));
        if (k > 0)
          paramAnonymousa.a(i, j, k, this.Sf);
      }

      protected final float c(DisplayMetrics paramAnonymousDisplayMetrics)
      {
        return 100.0F / paramAnonymousDisplayMetrics.densityDpi;
      }

      protected final int cb(int paramAnonymousInt)
      {
        return Math.min(100, super.cb(paramAnonymousInt));
      }
    })
      return parami;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.an
 * JD-Core Version:    0.6.2
 */