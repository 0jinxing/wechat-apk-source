package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

public class MMADFlipper extends ViewGroup
{
  private View abB;
  private View kZq;
  private Context mContext;
  private float mLastMotionX;
  private float mLastMotionY;
  private Scroller mScroller;
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  private int yto;
  private Interpolator ytp;
  private int ytq;
  private int ytr;
  private boolean yts;
  private boolean ytt;
  private MMADFlipper.a ytu;

  public MMADFlipper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMADFlipper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106388);
    this.yto = 0;
    this.yts = false;
    this.ytt = true;
    this.mContext = paramContext;
    this.ytp = getInterpolator();
    this.mScroller = new Scroller(this.mContext, this.ytp);
    this.mTouchSlop = ViewConfiguration.get(this.mContext).getScaledDoubleTapSlop();
    AppMethodBeat.o(106388);
  }

  private void NB(int paramInt)
  {
    AppMethodBeat.i(106398);
    NC(paramInt);
    ab.d("MicroMsg.MMFlipper", "mCurScreen:%d, mLastScreen:%d, whichScreen:%d", new Object[] { Integer.valueOf(this.ytq), Integer.valueOf(this.ytr), Integer.valueOf(paramInt) });
    this.ytr = paramInt;
    AppMethodBeat.o(106398);
  }

  private void NC(int paramInt)
  {
    AppMethodBeat.i(106399);
    paramInt = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    if (getScrollX() != getWidth() * paramInt)
    {
      paramInt = paramInt * getWidth() - getScrollX();
      this.mScroller.startScroll(getScrollX(), 0, paramInt, 0, a.ao(getContext(), Math.abs(paramInt) * 2));
      invalidate();
    }
    AppMethodBeat.o(106399);
  }

  private boolean dzC()
  {
    boolean bool = true;
    AppMethodBeat.i(106395);
    if (getChildCount() > 1)
      AppMethodBeat.o(106395);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106395);
    }
  }

  private Interpolator getInterpolator()
  {
    AppMethodBeat.i(106394);
    LinearInterpolator localLinearInterpolator = new LinearInterpolator();
    AppMethodBeat.o(106394);
    return localLinearInterpolator;
  }

  public void computeScroll()
  {
    AppMethodBeat.i(106400);
    if (this.mScroller.computeScrollOffset())
    {
      scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
      postInvalidate();
      AppMethodBeat.o(106400);
    }
    while (true)
    {
      return;
      if (this.yts)
      {
        this.yts = false;
        if (this.ytq <= 0)
        {
          this.ytq = getRealChildCount();
          setScrollXOffest(this.ytq * getWidth());
          AppMethodBeat.o(106400);
        }
        else if (this.ytq >= getChildCount() - 1)
        {
          this.ytq = 1;
          setScrollXOffest(this.ytq * getWidth());
        }
      }
      else
      {
        AppMethodBeat.o(106400);
      }
    }
  }

  public int getCurScreen()
  {
    return this.ytq;
  }

  public int getRealChildCount()
  {
    AppMethodBeat.i(106396);
    int i;
    if (getChildCount() > 1)
    {
      i = getChildCount() - 2;
      AppMethodBeat.o(106396);
    }
    while (true)
    {
      return i;
      i = getChildCount();
      AppMethodBeat.o(106396);
    }
  }

  public int getRealCurScreen()
  {
    AppMethodBeat.i(106397);
    int i;
    if (getChildCount() > 1)
    {
      i = this.ytq - 1;
      AppMethodBeat.o(106397);
    }
    while (true)
    {
      return i;
      i = this.ytq;
      AppMethodBeat.o(106397);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(106389);
    super.onFinishInflate();
    AppMethodBeat.o(106389);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(106392);
    if (!this.ytt)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(106392);
    }
    while (true)
    {
      return bool;
      if (getChildCount() == 1)
      {
        bool = super.onInterceptTouchEvent(paramMotionEvent);
        AppMethodBeat.o(106392);
      }
      else
      {
        int i = paramMotionEvent.getAction();
        if ((i == 2) && (this.yto != 0))
        {
          AppMethodBeat.o(106392);
        }
        else
        {
          float f1 = paramMotionEvent.getX();
          float f2 = paramMotionEvent.getY();
          switch (i)
          {
          default:
          case 2:
          case 0:
          case 1:
          case 3:
          }
          while (true)
          {
            if (this.yto == 0)
              break label245;
            AppMethodBeat.o(106392);
            break;
            int j = (int)Math.abs(this.mLastMotionX - f1);
            i = (int)Math.abs(this.mLastMotionY - f2);
            if ((j > this.mTouchSlop) && (i < this.mTouchSlop));
            for (i = 1; ; i = 0)
            {
              if (i == 0)
                break label192;
              this.yto = 1;
              break;
            }
            label192: this.yto = 0;
            continue;
            this.mLastMotionX = f1;
            this.mLastMotionY = f2;
            if (this.mScroller.isFinished());
            for (i = 0; ; i = 1)
            {
              this.yto = i;
              break;
            }
            this.yto = 0;
          }
          label245: AppMethodBeat.o(106392);
          bool = false;
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106390);
    paramInt4 = getChildCount();
    paramInt1 = 0;
    for (paramInt2 = 0; paramInt1 < paramInt4; paramInt2 = paramInt3)
    {
      View localView = getChildAt(paramInt1);
      paramInt3 = paramInt2;
      if (localView.getVisibility() != 8)
      {
        paramInt3 = localView.getMeasuredWidth();
        localView.layout(paramInt2, 0, paramInt2 + paramInt3, localView.getMeasuredHeight());
        paramInt3 = paramInt2 + paramInt3;
      }
      paramInt1++;
    }
    AppMethodBeat.o(106390);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106391);
    super.onMeasure(paramInt1, paramInt2);
    View.MeasureSpec.getSize(paramInt1);
    View.MeasureSpec.getSize(paramInt2);
    int i = getChildCount();
    for (int j = 0; j < i; j++)
      getChildAt(j).measure(paramInt1, paramInt2);
    AppMethodBeat.o(106391);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(106393);
    if (getChildCount() == 1)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(106393);
      return bool;
    }
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    int i = paramMotionEvent.getAction();
    float f = paramMotionEvent.getX();
    switch (i)
    {
    default:
    case 0:
    case 2:
      while (true)
      {
        AppMethodBeat.o(106393);
        break;
        if (!this.mScroller.isFinished())
          this.mScroller.abortAnimation();
        this.mLastMotionX = f;
        continue;
        i = (int)(this.mLastMotionX - f);
        this.mLastMotionX = f;
        scrollBy(i, 0);
      }
    case 1:
    case 3:
    }
    paramMotionEvent = this.mVelocityTracker;
    paramMotionEvent.computeCurrentVelocity(1000);
    i = (int)paramMotionEvent.getXVelocity();
    if (i > 600)
    {
      if (dzC())
      {
        this.ytq -= 1;
        NB(this.ytq);
      }
      this.yts = true;
    }
    while (true)
    {
      if (this.mVelocityTracker != null)
      {
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
      }
      this.yto = 0;
      this.mLastMotionX = 0.0F;
      this.mLastMotionY = 0.0F;
      break;
      if (i < -600)
      {
        if (dzC())
        {
          this.ytq += 1;
          NB(this.ytq);
        }
        this.yts = true;
      }
      else
      {
        i = getWidth();
        NB((getScrollX() + i / 2) / i);
      }
    }
  }

  public void setFooterView(View paramView)
  {
    this.kZq = paramView;
  }

  public void setHeaderView(View paramView)
  {
    this.abB = paramView;
  }

  public void setOnScreenChangedListener(MMADFlipper.a parama)
  {
    this.ytu = parama;
  }

  public void setScrollEnable(boolean paramBoolean)
  {
    this.ytt = paramBoolean;
  }

  @TargetApi(14)
  public void setScrollXOffest(int paramInt)
  {
    AppMethodBeat.i(106401);
    if (Build.VERSION.SDK_INT >= 14)
    {
      setScrollX(paramInt);
      AppMethodBeat.o(106401);
    }
    while (true)
    {
      return;
      if (this.mScroller != null)
        this.mScroller.setFinalX(paramInt);
      AppMethodBeat.o(106401);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMADFlipper
 * JD-Core Version:    0.6.2
 */