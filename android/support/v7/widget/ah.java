package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class ah extends RecyclerView.r
{
  protected final DecelerateInterpolator Sf = new DecelerateInterpolator();
  protected final LinearInterpolator ama = new LinearInterpolator();
  protected PointF amb;
  private final float amc = c(paramContext.getResources().getDisplayMetrics());
  protected int amd = 0;
  protected int ame = 0;

  public ah(Context paramContext)
  {
  }

  private static int aj(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - paramInt2;
    paramInt2 = i;
    if (paramInt1 * i <= 0)
      paramInt2 = 0;
    return paramInt2;
  }

  protected final void a(int paramInt1, int paramInt2, RecyclerView.r.a parama)
  {
    if (this.aiB.ank.getChildCount() == 0)
      stop();
    while (true)
    {
      return;
      this.amd = aj(this.amd, paramInt1);
      this.ame = aj(this.ame, paramInt2);
      if ((this.amd == 0) && (this.ame == 0))
      {
        PointF localPointF = bX(this.ape);
        if ((localPointF == null) || ((localPointF.x == 0.0F) && (localPointF.y == 0.0F)))
        {
          parama.apl = this.ape;
          stop();
        }
        else
        {
          float f = (float)Math.sqrt(localPointF.x * localPointF.x + localPointF.y * localPointF.y);
          localPointF.x /= f;
          localPointF.y /= f;
          this.amb = localPointF;
          this.amd = ((int)(localPointF.x * 10000.0F));
          this.ame = ((int)(localPointF.y * 10000.0F));
          paramInt1 = cb(10000);
          parama.a((int)(this.amd * 1.2F), (int)(this.ame * 1.2F), (int)(paramInt1 * 1.2F), this.ama);
        }
      }
    }
  }

  protected void a(View paramView, RecyclerView.r.a parama)
  {
    int i = 0;
    int j = iX();
    Object localObject1 = this.amP;
    int k;
    label52: Object localObject2;
    if ((localObject1 == null) || (!((RecyclerView.i)localObject1).iG()))
    {
      k = 0;
      if ((this.amb != null) && (this.amb.y != 0.0F))
        break label177;
      j = 0;
      localObject2 = this.amP;
      m = i;
      if (localObject2 != null)
        if (((RecyclerView.i)localObject2).iH())
          break label201;
    }
    for (int m = i; ; m = e(RecyclerView.i.by(paramView) - ((RecyclerView.LayoutParams)localObject1).topMargin, RecyclerView.i.bA(paramView) + ((RecyclerView.LayoutParams)localObject1).bottomMargin, ((RecyclerView.i)localObject2).getPaddingTop(), ((RecyclerView.i)localObject2).mHeight - ((RecyclerView.i)localObject2).getPaddingBottom(), j))
    {
      j = ca((int)Math.sqrt(k * k + m * m));
      if (j > 0)
        parama.a(-k, -m, j, this.Sf);
      return;
      localObject2 = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      k = e(RecyclerView.i.bx(paramView) - ((RecyclerView.LayoutParams)localObject2).leftMargin, RecyclerView.i.bz(paramView) + ((RecyclerView.LayoutParams)localObject2).rightMargin, ((RecyclerView.i)localObject1).getPaddingLeft(), ((RecyclerView.i)localObject1).mWidth - ((RecyclerView.i)localObject1).getPaddingRight(), j);
      break;
      label177: if (this.amb.y > 0.0F)
      {
        j = 1;
        break label52;
      }
      j = -1;
      break label52;
      label201: localObject1 = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    }
  }

  public PointF bX(int paramInt)
  {
    Object localObject = this.amP;
    if ((localObject instanceof RecyclerView.r.b));
    for (localObject = ((RecyclerView.r.b)localObject).bX(paramInt); ; localObject = null)
    {
      return localObject;
      new StringBuilder("You should override computeScrollVectorForPosition when the LayoutManager does not implement ").append(RecyclerView.r.b.class.getCanonicalName());
    }
  }

  protected float c(DisplayMetrics paramDisplayMetrics)
  {
    return 25.0F / paramDisplayMetrics.densityDpi;
  }

  protected final int ca(int paramInt)
  {
    return (int)Math.ceil(cb(paramInt) / 0.3356D);
  }

  protected int cb(int paramInt)
  {
    return (int)Math.ceil(Math.abs(paramInt) * this.amc);
  }

  public int e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    switch (paramInt5)
    {
    default:
      throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    case -1:
      paramInt1 = paramInt3 - paramInt1;
    case 1:
    case 0:
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = paramInt4 - paramInt2;
      continue;
      paramInt3 -= paramInt1;
      paramInt1 = paramInt3;
      if (paramInt3 <= 0)
      {
        paramInt2 = paramInt4 - paramInt2;
        paramInt1 = paramInt2;
        if (paramInt2 >= 0)
          paramInt1 = 0;
      }
    }
  }

  protected int iX()
  {
    int i;
    if ((this.amb == null) || (this.amb.x == 0.0F))
      i = 0;
    while (true)
    {
      return i;
      if (this.amb.x > 0.0F)
        i = 1;
      else
        i = -1;
    }
  }

  protected void onStop()
  {
    this.ame = 0;
    this.amd = 0;
    this.amb = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ah
 * JD-Core Version:    0.6.2
 */