package android.support.v7.widget;

import android.graphics.PointF;
import android.view.View;

public final class ai extends aw
{
  private am amf;
  private am amg;

  private int a(RecyclerView.i parami, am paramam, int paramInt1, int paramInt2)
  {
    int i = 0;
    int[] arrayOfInt = aJ(paramInt1, paramInt2);
    float f = b(parami, paramam);
    if (f <= 0.0F)
    {
      paramInt1 = i;
      return paramInt1;
    }
    if (Math.abs(arrayOfInt[0]) > Math.abs(arrayOfInt[1]));
    for (paramInt1 = arrayOfInt[0]; ; paramInt1 = arrayOfInt[1])
    {
      paramInt1 = Math.round(paramInt1 / f);
      break;
    }
  }

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

  private static float b(RecyclerView.i parami, am paramam)
  {
    int i = 2147483647;
    int j = -2147483648;
    int k = parami.getChildCount();
    float f;
    if (k == 0)
    {
      f = 1.0F;
      return f;
    }
    int m = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    label32: int i1;
    Object localObject3;
    int i2;
    if (m < k)
    {
      View localView = parami.getChildAt(m);
      int n = RecyclerView.i.bt(localView);
      i1 = i;
      localObject3 = localObject2;
      if (n == -1)
        break label199;
      i2 = i;
      if (n < i)
      {
        i2 = n;
        localObject2 = localView;
      }
      i1 = i2;
      localObject3 = localObject2;
      if (n <= j)
        break label199;
      localObject1 = localView;
      i = i2;
      i2 = n;
    }
    while (true)
    {
      m++;
      j = i2;
      break label32;
      if ((localObject2 == null) || (localObject1 == null))
      {
        f = 1.0F;
        break;
      }
      i2 = Math.min(paramam.bf(localObject2), paramam.bf(localObject1));
      i2 = Math.max(paramam.bg(localObject2), paramam.bg(localObject1)) - i2;
      if (i2 == 0)
      {
        f = 1.0F;
        break;
      }
      f = i2 * 1.0F / (j - i + 1);
      break;
      label199: i2 = j;
      i = i1;
      localObject2 = localObject3;
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

  public final int a(RecyclerView.i parami, int paramInt1, int paramInt2)
  {
    if (!(parami instanceof RecyclerView.r.b))
      paramInt1 = -1;
    while (true)
    {
      return paramInt1;
      int i = parami.getItemCount();
      if (i == 0)
      {
        paramInt1 = -1;
      }
      else
      {
        Object localObject = a(parami);
        if (localObject == null)
        {
          paramInt1 = -1;
        }
        else
        {
          int j = RecyclerView.i.bt((View)localObject);
          if (j == -1)
          {
            paramInt1 = -1;
          }
          else
          {
            localObject = ((RecyclerView.r.b)parami).bX(i - 1);
            if (localObject == null)
            {
              paramInt1 = -1;
            }
            else
            {
              if (parami.iG())
              {
                int k = a(parami, c(parami), paramInt1, 0);
                paramInt1 = k;
                if (((PointF)localObject).x < 0.0F)
                  paramInt1 = -k;
                label125: if (!parami.iH())
                  break label184;
                k = a(parami, b(parami), 0, paramInt2);
                paramInt2 = k;
                if (((PointF)localObject).y < 0.0F)
                  paramInt2 = -k;
                label163: if (!parami.iH())
                  break label189;
              }
              while (true)
              {
                if (paramInt2 != 0)
                  break label194;
                paramInt1 = -1;
                break;
                paramInt1 = 0;
                break label125;
                label184: paramInt2 = 0;
                break label163;
                label189: paramInt2 = paramInt1;
              }
              label194: paramInt1 = j + paramInt2;
              paramInt2 = paramInt1;
              if (paramInt1 < 0)
                paramInt2 = 0;
              paramInt1 = paramInt2;
              if (paramInt2 >= i)
                paramInt1 = i - 1;
            }
          }
        }
      }
    }
  }

  public final View a(RecyclerView.i parami)
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

  public final int[] a(RecyclerView.i parami, View paramView)
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
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ai
 * JD-Core Version:    0.6.2
 */