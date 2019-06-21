package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.b;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

public class PagerTabStrip extends PagerTitleStrip
{
  private int MA = 255;
  private boolean MC = false;
  private boolean MD = false;
  private int MF;
  private boolean MG;
  private int Mt = this.MW;
  private int Mu;
  private int Mv;
  private int Mw;
  private int Mx;
  private int My;
  private final Paint Mz = new Paint();
  private float mInitialMotionX;
  private float mInitialMotionY;
  private final Rect mTempRect = new Rect();
  private int mTouchSlop;

  public PagerTabStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.Mz.setColor(this.Mt);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.Mu = ((int)(3.0F * f + 0.5F));
    this.Mv = ((int)(6.0F * f + 0.5F));
    this.Mw = ((int)(64.0F * f));
    this.My = ((int)(16.0F * f + 0.5F));
    this.MF = ((int)(1.0F * f + 0.5F));
    this.Mx = ((int)(f * 32.0F + 0.5F));
    this.mTouchSlop = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    setTextSpacing(getTextSpacing());
    setWillNotDraw(false);
    this.MJ.setFocusable(true);
    this.MJ.setOnClickListener(new PagerTabStrip.1(this));
    this.ML.setFocusable(true);
    this.ML.setOnClickListener(new PagerTabStrip.2(this));
    if (getBackground() == null)
      this.MC = true;
  }

  final void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    Rect localRect = this.mTempRect;
    int i = getHeight();
    int j = this.MK.getLeft();
    int k = this.My;
    int m = this.MK.getRight();
    int n = this.My;
    int i1 = i - this.Mu;
    localRect.set(j - k, i1, m + n, i);
    super.a(paramInt, paramFloat, paramBoolean);
    this.MA = ((int)(Math.abs(paramFloat - 0.5F) * 2.0F * 255.0F));
    localRect.union(this.MK.getLeft() - this.My, i1, this.MK.getRight() + this.My, i);
    invalidate(localRect);
  }

  public boolean getDrawFullUnderline()
  {
    return this.MC;
  }

  int getMinHeight()
  {
    return Math.max(super.getMinHeight(), this.Mx);
  }

  public int getTabIndicatorColor()
  {
    return this.Mt;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = this.MK.getLeft();
    int k = this.My;
    int m = this.MK.getRight();
    int n = this.My;
    int i1 = this.Mu;
    this.Mz.setColor(this.MA << 24 | this.Mt & 0xFFFFFF);
    paramCanvas.drawRect(j - k, i - i1, m + n, i, this.Mz);
    if (this.MC)
    {
      this.Mz.setColor(0xFF000000 | this.Mt & 0xFFFFFF);
      paramCanvas.drawRect(getPaddingLeft(), i - this.MF, getWidth() - getPaddingRight(), i, this.Mz);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    int i = paramMotionEvent.getAction();
    if ((i != 0) && (this.MG))
      return bool;
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i)
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      bool = true;
      break;
      this.mInitialMotionX = f1;
      this.mInitialMotionY = f2;
      this.MG = false;
      continue;
      if ((Math.abs(f1 - this.mInitialMotionX) > this.mTouchSlop) || (Math.abs(f2 - this.mInitialMotionY) > this.mTouchSlop))
      {
        this.MG = true;
        continue;
        if (f1 < this.MK.getLeft() - this.My)
          this.MI.setCurrentItem(this.MI.getCurrentItem() - 1);
        else if (f1 > this.MK.getRight() + this.My)
          this.MI.setCurrentItem(this.MI.getCurrentItem() + 1);
      }
    }
  }

  public void setBackgroundColor(int paramInt)
  {
    super.setBackgroundColor(paramInt);
    if (!this.MD)
      if ((0xFF000000 & paramInt) != 0)
        break label27;
    label27: for (boolean bool = true; ; bool = false)
    {
      this.MC = bool;
      return;
    }
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (!this.MD)
      if (paramDrawable != null)
        break label24;
    label24: for (boolean bool = true; ; bool = false)
    {
      this.MC = bool;
      return;
    }
  }

  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (!this.MD)
      if (paramInt != 0)
        break label24;
    label24: for (boolean bool = true; ; bool = false)
    {
      this.MC = bool;
      return;
    }
  }

  public void setDrawFullUnderline(boolean paramBoolean)
  {
    this.MC = paramBoolean;
    this.MD = true;
    invalidate();
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt4;
    if (paramInt4 < this.Mv)
      i = this.Mv;
    super.setPadding(paramInt1, paramInt2, paramInt3, i);
  }

  public void setTabIndicatorColor(int paramInt)
  {
    this.Mt = paramInt;
    this.Mz.setColor(this.Mt);
    invalidate();
  }

  public void setTabIndicatorColorResource(int paramInt)
  {
    setTabIndicatorColor(b.i(getContext(), paramInt));
  }

  public void setTextSpacing(int paramInt)
  {
    int i = paramInt;
    if (paramInt < this.Mw)
      i = this.Mw;
    super.setTextSpacing(i);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.view.PagerTabStrip
 * JD-Core Version:    0.6.2
 */