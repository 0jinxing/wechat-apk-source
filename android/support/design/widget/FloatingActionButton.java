package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.a.a;
import android.support.v4.view.s;
import android.support.v7.widget.k;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;

@CoordinatorLayout.b(FloatingActionButton.Behavior.class)
public class FloatingActionButton extends VisibilityAwareImageButton
{
  private int mSize;
  private ColorStateList qa;
  private PorterDuff.Mode qb;
  private int qc;
  private int qd;
  private int qe;
  int qf;
  private int qg;
  boolean qh;
  final Rect qi = new Rect();
  private final Rect qj = new Rect();
  private k qk;
  private h ql;

  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    o.G(paramContext);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.FloatingActionButton, paramInt, 2131493826);
    this.qa = paramContext.getColorStateList(7);
    this.qb = q.al(paramContext.getInt(8, -1));
    this.qd = paramContext.getColor(1, 0);
    this.mSize = paramContext.getInt(2, -1);
    this.qe = paramContext.getDimensionPixelSize(3, 0);
    this.qc = paramContext.getDimensionPixelSize(5, 0);
    float f1 = paramContext.getDimension(0, 0.0F);
    float f2 = paramContext.getDimension(4, 0.0F);
    this.qh = paramContext.getBoolean(6, false);
    paramContext.recycle();
    this.qk = new k(this);
    this.qk.a(paramAttributeSet, paramInt);
    this.qg = ((int)getResources().getDimension(2131428284));
    getImpl().a(this.qa, this.qb, this.qd, this.qc);
    getImpl().setElevation(f1);
    paramContext = getImpl();
    if (paramContext.qA != f2)
    {
      paramContext.qA = f2;
      paramContext.o(paramContext.qz, f2);
    }
  }

  private h.c c(FloatingActionButton.a parama)
  {
    if (parama == null);
    for (parama = null; ; parama = new FloatingActionButton.1(this, parama))
      return parama;
  }

  private h getImpl()
  {
    if (this.ql == null)
      if (Build.VERSION.SDK_INT < 21)
        break label42;
    label42: for (Object localObject = new i(this, new FloatingActionButton.b(this)); ; localObject = new h(this, new FloatingActionButton.b(this)))
    {
      this.ql = ((h)localObject);
      return this.ql;
    }
  }

  private static int resolveAdjustedSize(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    paramInt2 = paramInt1;
    switch (i)
    {
    default:
      paramInt2 = paramInt1;
    case 0:
    case -2147483648:
    case 1073741824:
    }
    while (true)
    {
      return paramInt2;
      paramInt2 = Math.min(paramInt1, j);
      continue;
      paramInt2 = j;
    }
  }

  final void a(FloatingActionButton.a parama)
  {
    int i = 1;
    h localh = getImpl();
    parama = c(parama);
    if (localh.qC.getVisibility() != 0)
      if (localh.qs == 2)
        if (i == 0)
        {
          localh.qC.animate().cancel();
          if (!localh.cl())
            break label154;
          localh.qs = 2;
          if (localh.qC.getVisibility() != 0)
          {
            localh.qC.setAlpha(0.0F);
            localh.qC.setScaleY(0.0F);
            localh.qC.setScaleX(0.0F);
          }
          localh.qC.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(a.mi).setListener(new h.2(localh, parama));
        }
    while (true)
    {
      return;
      i = 0;
      break;
      if (localh.qs != 1)
        break;
      i = 0;
      break;
      label154: localh.qC.j(0, false);
      localh.qC.setAlpha(1.0F);
      localh.qC.setScaleY(1.0F);
      localh.qC.setScaleX(1.0F);
    }
  }

  final void b(FloatingActionButton.a parama)
  {
    h localh = getImpl();
    parama = c(parama);
    int i;
    if (localh.qC.getVisibility() == 0)
      if (localh.qs == 1)
      {
        i = 1;
        if (i == 0)
        {
          localh.qC.animate().cancel();
          if (!localh.cl())
            break label125;
          localh.qs = 1;
          localh.qC.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(a.mh).setListener(new h.1(localh, parama));
        }
      }
    while (true)
    {
      return;
      i = 0;
      break;
      if (localh.qs != 2)
      {
        i = 1;
        break;
      }
      i = 0;
      break;
      label125: localh.qC.j(4, false);
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    getImpl().c(getDrawableState());
  }

  public ColorStateList getBackgroundTintList()
  {
    return this.qa;
  }

  public PorterDuff.Mode getBackgroundTintMode()
  {
    return this.qb;
  }

  public float getCompatElevation()
  {
    return getImpl().getElevation();
  }

  public Drawable getContentBackground()
  {
    return getImpl().qy;
  }

  public int getCustomSize()
  {
    return this.qe;
  }

  public int getRippleColor()
  {
    return this.qd;
  }

  public int getSize()
  {
    return this.mSize;
  }

  int getSizeDimension()
  {
    int i = this.mSize;
    Resources localResources = getResources();
    if (this.qe != 0)
      i = this.qe;
    while (true)
    {
      return i;
      switch (i)
      {
      case 0:
      default:
        i = localResources.getDimensionPixelSize(2131428286);
        break;
      case -1:
        if (Math.max(localResources.getConfiguration().screenWidthDp, localResources.getConfiguration().screenHeightDp) < 470)
        {
          i = 1;
          break;
        }
        i = 0;
        break;
      case 1:
        i = localResources.getDimensionPixelSize(2131428285);
      }
    }
  }

  public boolean getUseCompatPadding()
  {
    return this.qh;
  }

  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    getImpl().ce();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    h localh = getImpl();
    if (localh.ch())
    {
      if (localh.qE == null)
        localh.qE = new h.3(localh);
      localh.qC.getViewTreeObserver().addOnPreDrawListener(localh.qE);
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    h localh = getImpl();
    if (localh.qE != null)
    {
      localh.qC.getViewTreeObserver().removeOnPreDrawListener(localh.qE);
      localh.qE = null;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getSizeDimension();
    this.qf = ((i - this.qg) / 2);
    getImpl().cg();
    paramInt1 = Math.min(resolveAdjustedSize(i, paramInt1), resolveAdjustedSize(i, paramInt2));
    setMeasuredDimension(this.qi.left + paramInt1 + this.qi.right, paramInt1 + this.qi.top + this.qi.bottom);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    label157: 
    while (true)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      return bool;
      Rect localRect = this.qj;
      if (s.as(this))
      {
        localRect.set(0, 0, getWidth(), getHeight());
        localRect.left += this.qi.left;
        localRect.top += this.qi.top;
        localRect.right -= this.qi.right;
        localRect.bottom -= this.qi.bottom;
      }
      for (int i = 1; ; i = 0)
      {
        if ((i == 0) || (this.qj.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())))
          break label157;
        break;
      }
    }
  }

  public void setBackgroundColor(int paramInt)
  {
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
  }

  public void setBackgroundResource(int paramInt)
  {
  }

  public void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.qa != paramColorStateList)
    {
      this.qa = paramColorStateList;
      h localh = getImpl();
      if (localh.qv != null)
        android.support.v4.a.a.a.a(localh.qv, paramColorStateList);
      if (localh.qx != null)
        localh.qx.a(paramColorStateList);
    }
  }

  public void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.qb != paramMode)
    {
      this.qb = paramMode;
      h localh = getImpl();
      if (localh.qv != null)
        android.support.v4.a.a.a.a(localh.qv, paramMode);
    }
  }

  public void setCompatElevation(float paramFloat)
  {
    getImpl().setElevation(paramFloat);
  }

  public void setCustomSize(int paramInt)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException("Custom size should be non-negative.");
    this.qe = paramInt;
  }

  public void setImageResource(int paramInt)
  {
    this.qk.setImageResource(paramInt);
  }

  public void setRippleColor(int paramInt)
  {
    if (this.qd != paramInt)
    {
      this.qd = paramInt;
      getImpl().setRippleColor(paramInt);
    }
  }

  public void setSize(int paramInt)
  {
    if (paramInt != this.mSize)
    {
      this.mSize = paramInt;
      requestLayout();
    }
  }

  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (this.qh != paramBoolean)
    {
      this.qh = paramBoolean;
      getImpl().cf();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.FloatingActionButton
 * JD-Core Version:    0.6.2
 */