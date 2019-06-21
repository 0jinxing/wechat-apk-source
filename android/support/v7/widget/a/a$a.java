package android.support.v7.widget.a;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.f;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.List;

public abstract class a$a
{
  private static final b avL;
  private static final Interpolator avM = new a.a.1();
  private static final Interpolator avN = new a.a.2();
  private int avO = -1;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (avL = new c.a(); ; avL = new c.b())
      return;
  }

  public static RecyclerView.v a(RecyclerView.v paramv, List<RecyclerView.v> paramList, int paramInt1, int paramInt2)
  {
    int i = paramv.apJ.getWidth();
    int j = paramv.apJ.getHeight();
    int k = -1;
    int m = paramInt1 - paramv.apJ.getLeft();
    int n = paramInt2 - paramv.apJ.getTop();
    int i1 = paramList.size();
    int i2 = 0;
    Object localObject1 = null;
    Object localObject2;
    int i3;
    if (i2 < i1)
    {
      localObject2 = (RecyclerView.v)paramList.get(i2);
      if (m <= 0)
        break label340;
      i3 = ((RecyclerView.v)localObject2).apJ.getRight() - (paramInt1 + i);
      if ((i3 >= 0) || (((RecyclerView.v)localObject2).apJ.getRight() <= paramv.apJ.getRight()))
        break label340;
      i3 = Math.abs(i3);
      if (i3 <= k)
        break label340;
      localObject1 = localObject2;
      k = i3;
      label142: if (m >= 0)
        break label353;
      i3 = ((RecyclerView.v)localObject2).apJ.getLeft() - paramInt1;
      if ((i3 <= 0) || (((RecyclerView.v)localObject2).apJ.getLeft() >= paramv.apJ.getLeft()))
        break label353;
      i3 = Math.abs(i3);
      if (i3 <= k)
        break label353;
      localObject1 = localObject2;
      k = i3;
    }
    label340: label353: 
    while (true)
    {
      if (n < 0)
      {
        i3 = ((RecyclerView.v)localObject2).apJ.getTop() - paramInt2;
        if ((i3 > 0) && (((RecyclerView.v)localObject2).apJ.getTop() < paramv.apJ.getTop()))
        {
          i3 = Math.abs(i3);
          if (i3 > k)
          {
            localObject1 = localObject2;
            k = i3;
          }
        }
      }
      while (true)
      {
        if (n > 0)
        {
          i3 = ((RecyclerView.v)localObject2).apJ.getBottom() - (paramInt2 + j);
          if ((i3 < 0) && (((RecyclerView.v)localObject2).apJ.getBottom() > paramv.apJ.getBottom()))
          {
            i3 = Math.abs(i3);
            if (i3 > k)
              k = i3;
          }
        }
        while (true)
        {
          i2++;
          localObject1 = localObject2;
          break;
          return localObject1;
          break label142;
          localObject2 = localObject1;
        }
      }
    }
  }

  public static int cZ(int paramInt)
  {
    if (paramInt == 0);
    return 983055;
  }

  public static long d(RecyclerView paramRecyclerView, int paramInt)
  {
    paramRecyclerView = paramRecyclerView.getItemAnimator();
    long l;
    if (paramRecyclerView == null)
      if (paramInt == 8)
        l = 200L;
    while (true)
    {
      return l;
      l = 250L;
      continue;
      if (paramInt == 8)
        l = paramRecyclerView.aov;
      else
        l = paramRecyclerView.aou;
    }
  }

  static int j(RecyclerView paramRecyclerView)
  {
    s.T(paramRecyclerView);
    return 983055;
  }

  private int k(RecyclerView paramRecyclerView)
  {
    if (this.avO == -1)
      this.avO = paramRecyclerView.getResources().getDimensionPixelSize(2131428460);
    return this.avO;
  }

  public final int a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, long paramLong)
  {
    float f1 = 1.0F;
    int i = k(paramRecyclerView);
    int j = Math.abs(paramInt2);
    int k = (int)Math.signum(paramInt2);
    float f2 = Math.min(1.0F, j * 1.0F / paramInt1);
    paramInt1 = (int)(i * k * avN.getInterpolation(f2));
    if (paramLong > 2000L)
    {
      f2 = paramInt1;
      i = (int)(avM.getInterpolation(f1) * f2);
      paramInt1 = i;
      if (i == 0)
        if (paramInt2 <= 0)
          break label113;
    }
    label113: for (paramInt1 = 1; ; paramInt1 = -1)
    {
      return paramInt1;
      f1 = (float)paramLong / 2000.0F;
      break;
    }
  }

  public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.v paramv, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    avL.a(paramCanvas, paramRecyclerView, paramv.apJ, paramFloat1, paramFloat2, paramInt, paramBoolean);
  }

  public void a(RecyclerView paramRecyclerView, RecyclerView.v paramv)
  {
    avL.bZ(paramv.apJ);
  }

  public abstract boolean a(RecyclerView.v paramv1, RecyclerView.v paramv2);

  public void f(RecyclerView.v paramv, int paramInt)
  {
  }

  public boolean lB()
  {
    return true;
  }

  public float lC()
  {
    return 0.5F;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a.a.a
 * JD-Core Version:    0.6.2
 */