package me.imid.swipebacklayout.lib;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.support.v4.widget.p;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SwipeBackLayout extends FrameLayout
{
  private static final int[] BTh = { 1, 2, 8, 11 };
  private int BTi;
  private a BTj;
  private CopyOnWriteArrayList<SwipeBackLayout.a> BTk;
  private Drawable BTl;
  private int BTm;
  private int Qa;
  private float Qb;
  private Drawable Qw;
  private Drawable Qx;
  private View WL;
  private boolean mEnable;
  private boolean mInLayout;
  private Rect oT;
  private float zOf;
  private int zOg;
  private int zOh;
  private float zOj;

  public SwipeBackLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public SwipeBackLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771968);
  }

  public SwipeBackLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(91208);
    this.zOf = 0.3F;
    this.mEnable = true;
    this.Qa = -1728053248;
    this.oT = new Rect();
    this.BTj = a.a(this, new SwipeBackLayout.c(this, (byte)0));
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, com.tencent.luggage.a.a.SwipeBackLayout, paramInt, 2131493569);
    paramInt = paramContext.getDimensionPixelSize(0, -1);
    if (paramInt > 0)
      setEdgeSize(paramInt);
    setEdgeTrackingEnabled(BTh[paramContext.getInt(1, 0)]);
    int i = paramContext.getResourceId(2, 2130840128);
    int j = paramContext.getResourceId(3, 2130840129);
    paramInt = paramContext.getResourceId(4, 2130840126);
    is(i, 1);
    is(j, 2);
    is(paramInt, 8);
    paramContext.recycle();
    float f = getResources().getDisplayMetrics().density * 400.0F;
    this.BTj.SQ = f;
    this.BTj.SP = (f * 2.0F);
    AppMethodBeat.o(91208);
  }

  private void f(Drawable paramDrawable, int paramInt)
  {
    AppMethodBeat.i(91213);
    if ((paramInt & 0x1) != 0)
      this.Qw = paramDrawable;
    while (true)
    {
      invalidate();
      AppMethodBeat.o(91213);
      return;
      if ((paramInt & 0x2) != 0)
        this.Qx = paramDrawable;
      else if ((paramInt & 0x8) != 0)
        this.BTl = paramDrawable;
    }
  }

  private void is(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91214);
    f(getResources().getDrawable(paramInt1), paramInt2);
    AppMethodBeat.o(91214);
  }

  public final void a(SwipeBackLayout.a parama)
  {
    AppMethodBeat.i(91211);
    if (this.BTk == null)
      this.BTk = new CopyOnWriteArrayList();
    this.BTk.add(parama);
    AppMethodBeat.o(91211);
  }

  public void computeScroll()
  {
    AppMethodBeat.i(91220);
    this.Qb = (1.0F - this.zOj);
    a locala = this.BTj;
    boolean bool;
    int i;
    if (locala.SG == 2)
    {
      bool = locala.jlU.qN.computeScrollOffset();
      i = locala.jlU.qN.getCurrX();
      int j = locala.jlU.qN.getCurrY();
      int k = i - locala.SU.getLeft();
      int m = j - locala.SU.getTop();
      if (k != 0)
        locala.SU.offsetLeftAndRight(k);
      if (m != 0)
        locala.SU.offsetTopAndBottom(m);
      if ((k != 0) || (m != 0))
        locala.BTq.o(locala.SU, i, j, k, m);
      if ((!bool) || (i != locala.jlU.qN.getFinalX()) || (j != locala.jlU.qN.getFinalY()))
        break label240;
      locala.jlU.qN.abortAnimation();
      bool = locala.jlU.qN.isFinished();
    }
    label240: 
    while (true)
    {
      if (!bool)
        locala.SW.post(locala.SX);
      if (locala.SG == 2);
      for (i = 1; ; i = 0)
      {
        if (i != 0)
          s.R(this);
        AppMethodBeat.o(91220);
        return;
      }
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(91215);
    boolean bool;
    if (!this.mEnable)
    {
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(91215);
    }
    while (true)
    {
      return bool;
      Object localObject;
      if ((this.BTk != null) && (!this.BTk.isEmpty()))
      {
        localObject = this.BTk.iterator();
        while (((Iterator)localObject).hasNext())
          ((SwipeBackLayout.a)((Iterator)localObject).next()).l(paramMotionEvent);
      }
      if (this.BTj.SG == 1)
      {
        this.BTj.g(paramMotionEvent);
        AppMethodBeat.o(91215);
        bool = true;
      }
      else
      {
        while (true)
        {
          try
          {
            localObject = this.BTj;
            i = paramMotionEvent.getActionMasked();
            j = paramMotionEvent.getActionIndex();
            if (i == 0)
              ((a)localObject).cancel();
            if (((a)localObject).mVelocityTracker == null)
              ((a)localObject).mVelocityTracker = VelocityTracker.obtain();
            ((a)localObject).mVelocityTracker.addMovement(paramMotionEvent);
            switch (i)
            {
            case 4:
            default:
              if (((a)localObject).SG != 1)
                break label598;
              j = 1;
              if (j == 0)
                break label604;
              paramMotionEvent.setAction(3);
              super.dispatchTouchEvent(paramMotionEvent);
              AppMethodBeat.o(91215);
              bool = true;
              break;
            case 0:
              f1 = paramMotionEvent.getX();
              f2 = paramMotionEvent.getY();
              j = paramMotionEvent.getPointerId(0);
              ((a)localObject).a(f1, f2, j);
              localView = ((a)localObject).F((int)f1, (int)f2);
              if ((localView == ((a)localObject).SU) && (((a)localObject).SG == 2))
                ((a)localObject).v(localView, j);
              if ((localObject.BTp[j] & ((a)localObject).SS) == 0)
                continue;
              break;
            case 5:
              i = paramMotionEvent.getPointerId(j);
              f1 = paramMotionEvent.getX(j);
              f2 = paramMotionEvent.getY(j);
              ((a)localObject).a(f1, f2, i);
              if ((((a)localObject).SG == 0) || (((a)localObject).SG != 2))
                continue;
              localView = ((a)localObject).F((int)f1, (int)f2);
              if (localView != ((a)localObject).SU)
                continue;
              ((a)localObject).v(localView, i);
              continue;
            case 2:
            case 6:
            case 1:
            case 3:
            }
          }
          catch (NullPointerException paramMotionEvent)
          {
            float f1;
            float f2;
            View localView;
            AppMethodBeat.o(91215);
            bool = false;
            break;
            int i = paramMotionEvent.getPointerCount();
            j = 0;
            if (j < i)
            {
              int k = paramMotionEvent.getPointerId(j);
              float f3 = paramMotionEvent.getX(j);
              float f4 = paramMotionEvent.getY(j);
              f2 = f3 - localObject.SH[k];
              f1 = f4 - localObject.SI[k];
              ((a)localObject).b(f2, f1, k);
              if (((a)localObject).SG != 1)
              {
                localView = ((a)localObject).F((int)f3, (int)f4);
                if ((localView == null) || (!((a)localObject).c(localView, f2, f1)) || (!((a)localObject).v(localView, k)))
                {
                  j++;
                  continue;
                }
              }
            }
            ((a)localObject).e(paramMotionEvent);
            continue;
          }
          catch (IllegalArgumentException paramMotionEvent)
          {
            AppMethodBeat.o(91215);
            bool = false;
            break;
            ((a)localObject).aY(paramMotionEvent.getPointerId(j));
            continue;
          }
          catch (ArrayIndexOutOfBoundsException paramMotionEvent)
          {
            AppMethodBeat.o(91215);
            bool = false;
          }
          break;
          ((a)localObject).cancel();
          continue;
          label598: int j = 0;
        }
        label604: super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(91215);
        bool = true;
      }
    }
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    AppMethodBeat.i(91219);
    int i;
    boolean bool;
    int j;
    if (paramView == this.WL)
    {
      i = 1;
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      if ((this.Qb > 0.0F) && (i != 0) && (this.BTj.SG != 0))
      {
        Rect localRect = this.oT;
        paramView.getHitRect(localRect);
        if ((this.BTi & 0x1) != 0)
        {
          this.Qw.setBounds(localRect.left - this.Qw.getIntrinsicWidth(), localRect.top, localRect.left, localRect.bottom);
          this.Qw.setAlpha((int)(this.Qb * 255.0F));
          this.Qw.draw(paramCanvas);
        }
        if ((this.BTi & 0x2) != 0)
        {
          this.Qx.setBounds(localRect.right, localRect.top, localRect.right + this.Qx.getIntrinsicWidth(), localRect.bottom);
          this.Qx.setAlpha((int)(this.Qb * 255.0F));
          this.Qx.draw(paramCanvas);
        }
        if ((this.BTi & 0x8) != 0)
        {
          this.BTl.setBounds(localRect.left, localRect.bottom, localRect.right, localRect.bottom + this.BTl.getIntrinsicHeight());
          this.BTl.setAlpha((int)(this.Qb * 255.0F));
          this.BTl.draw(paramCanvas);
        }
        j = (int)(((this.Qa & 0xFF000000) >>> 24) * this.Qb);
        i = this.Qa;
        if ((this.BTm & 0x1) == 0)
          break label348;
        paramCanvas.clipRect(0, 0, paramView.getLeft(), getHeight());
      }
    }
    while (true)
    {
      paramCanvas.drawColor(j << 24 | i & 0xFFFFFF);
      AppMethodBeat.o(91219);
      return bool;
      i = 0;
      break;
      label348: if ((this.BTm & 0x2) != 0)
        paramCanvas.clipRect(paramView.getRight(), 0, getRight(), getHeight());
      else if ((this.BTm & 0x8) != 0)
        paramCanvas.clipRect(paramView.getLeft(), paramView.getBottom(), getRight(), getHeight());
    }
  }

  public View getTargetView()
  {
    return this.WL;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(91217);
    this.mInLayout = true;
    if (this.WL != null)
      this.WL.layout(this.zOg, this.zOh, this.zOg + this.WL.getMeasuredWidth(), this.zOh + this.WL.getMeasuredHeight());
    this.mInLayout = false;
    AppMethodBeat.o(91217);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(91216);
    boolean bool;
    if (!this.mEnable)
    {
      bool = false;
      AppMethodBeat.o(91216);
    }
    while (true)
    {
      return bool;
      this.BTj.g(paramMotionEvent);
      bool = true;
      AppMethodBeat.o(91216);
    }
  }

  public void requestLayout()
  {
    AppMethodBeat.i(91218);
    if (!this.mInLayout)
      super.requestLayout();
    AppMethodBeat.o(91218);
  }

  public void setContentView(View paramView)
  {
    this.WL = paramView;
  }

  public void setEdgeSize(int paramInt)
  {
    this.BTj.SR = paramInt;
  }

  public void setEdgeTrackingEnabled(int paramInt)
  {
    this.BTi = paramInt;
    this.BTj.SS = this.BTi;
  }

  public void setEnableGesture(boolean paramBoolean)
  {
    this.mEnable = paramBoolean;
  }

  public void setMaxVelocity(float paramFloat)
  {
    this.BTj.SP = paramFloat;
  }

  public void setMinVelocity(float paramFloat)
  {
    this.BTj.SQ = paramFloat;
  }

  public void setScrimColor(int paramInt)
  {
    AppMethodBeat.i(91209);
    this.Qa = paramInt;
    invalidate();
    AppMethodBeat.o(91209);
  }

  public void setScrollThresHold(float paramFloat)
  {
    AppMethodBeat.i(91212);
    if ((paramFloat >= 1.0F) || (paramFloat <= 0.0F))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Threshold value should be between 0 and 1.0");
      AppMethodBeat.o(91212);
      throw localIllegalArgumentException;
    }
    this.zOf = paramFloat;
    AppMethodBeat.o(91212);
  }

  @Deprecated
  public void setSwipeListener(SwipeBackLayout.a parama)
  {
    AppMethodBeat.i(91210);
    a(parama);
    AppMethodBeat.o(91210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     me.imid.swipebacklayout.lib.SwipeBackLayout
 * JD-Core Version:    0.6.2
 */