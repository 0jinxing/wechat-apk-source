package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class MMFlipper extends ViewGroup
{
  private Interpolator mJ;
  private float mLastMotionX;
  private float mLastMotionY;
  private Scroller mScroller;
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  private int yto;
  protected int ytq;
  protected int ytr;
  private boolean ytt;
  protected int yuc;
  private int yud;
  private boolean yue;
  private MMFlipper.b yuf;
  private MMFlipper.a yug;
  int yuh;
  int yui;

  public MMFlipper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(106543);
    init(paramContext);
    AppMethodBeat.o(106543);
  }

  public MMFlipper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106544);
    this.yud = 0;
    this.yto = 0;
    this.yue = false;
    this.ytt = true;
    this.yuh = -123454321;
    this.yui = -123454321;
    init(paramContext);
    AppMethodBeat.o(106544);
  }

  private void NC(int paramInt)
  {
    AppMethodBeat.i(106549);
    int i = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    if (getScrollX() != getWidth() * i)
    {
      paramInt = getWidth() * i - getScrollX();
      this.mScroller.startScroll(getScrollX(), 0, paramInt, 0, a.ao(getContext(), (int)(Math.abs(paramInt) * 1.3F)));
      if (this.ytq != i)
      {
        this.yue = true;
        this.yuc += i - this.ytq;
      }
      this.ytr = this.ytq;
      this.ytq = i;
      invalidate();
    }
    AppMethodBeat.o(106549);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(106546);
    this.mJ = getInterpolator();
    this.mScroller = new Scroller(paramContext, this.mJ);
    this.ytr = -1;
    int i = this.yud;
    this.ytq = i;
    this.yuc = i;
    this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    AppMethodBeat.o(106546);
  }

  public final void NF(int paramInt)
  {
    AppMethodBeat.i(106550);
    paramInt = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    this.yue = false;
    if (!this.mScroller.isFinished())
      this.mScroller.abortAnimation();
    this.ytr = this.ytq;
    this.ytq = paramInt;
    scrollTo(paramInt * getWidth(), 0);
    AppMethodBeat.o(106550);
  }

  public final void NG(int paramInt)
  {
    this.yuc = paramInt;
  }

  public void computeScroll()
  {
    AppMethodBeat.i(106553);
    this.mScroller.getCurrX();
    if (this.mScroller.computeScrollOffset())
    {
      scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
      postInvalidate();
      AppMethodBeat.o(106553);
    }
    while (true)
    {
      return;
      if (this.yue)
      {
        this.yue = false;
        if (this.yuf != null)
          this.yuf.BZ(this.yuc);
      }
      AppMethodBeat.o(106553);
    }
  }

  public int getCurScreen()
  {
    AppMethodBeat.i(106552);
    ab.d("MicroMsg.MMFlipper", "cur screen is %d", new Object[] { Integer.valueOf(this.ytq) });
    int i = this.ytq;
    AppMethodBeat.o(106552);
    return i;
  }

  protected Interpolator getInterpolator()
  {
    AppMethodBeat.i(106545);
    MMFlipper.c localc = new MMFlipper.c();
    AppMethodBeat.o(106545);
    return localc;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(106555);
    if (!this.ytt)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(106555);
    }
    while (true)
    {
      return bool;
      if (getChildCount() == 1)
      {
        bool = super.onInterceptTouchEvent(paramMotionEvent);
        AppMethodBeat.o(106555);
      }
      else
      {
        int i = paramMotionEvent.getAction();
        if ((i == 2) && (this.yto != 0))
        {
          AppMethodBeat.o(106555);
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
              break label276;
            AppMethodBeat.o(106555);
            break;
            i = (int)Math.abs(this.mLastMotionX - f1);
            int j = (int)Math.abs(this.mLastMotionY - f2);
            ab.v("MicroMsg.MMFlipper", "xDif = " + i + ", yDif = " + j);
            if ((i > this.mTouchSlop) && (j < this.mTouchSlop));
            for (i = 1; ; i = 0)
            {
              if (i == 0)
                break label223;
              this.yto = 1;
              break;
            }
            label223: this.yto = 0;
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
          label276: AppMethodBeat.o(106555);
          bool = false;
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106547);
    long l = bo.yz();
    int i = 0;
    int j = getChildCount();
    int k = 0;
    while (k < j)
    {
      View localView = getChildAt(k);
      int m = i;
      if (localView.getVisibility() != 8)
      {
        m = localView.getMeasuredWidth();
        ab.v("MicroMsg.MMFlipper", "flipper onLayout childWidth:".concat(String.valueOf(m)));
        localView.layout(i, 0, i + m, localView.getMeasuredHeight());
        m = i + m;
      }
      k++;
      i = m;
    }
    ab.v("MicroMsg.MMFlipper", "use " + bo.az(l) + " ms, flipper onLayout changed:" + paramBoolean + " Left,Top,Right,Bottom:" + paramInt1 + "," + paramInt2 + "," + paramInt3 + "," + paramInt4);
    AppMethodBeat.o(106547);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106548);
    long l = bo.yz();
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    if (this.yug != null)
      this.yug.fe(i, j);
    this.yuh = i;
    this.yui = j;
    int k = getChildCount();
    for (j = 0; j < k; j++)
      getChildAt(j).measure(paramInt1, paramInt2);
    scrollTo(this.ytq * i, 0);
    ab.i("MicroMsg.MMFlipper", "flipper onMeasure:" + i + "," + View.MeasureSpec.getSize(paramInt2) + " childCount:" + k + ", use " + bo.az(l));
    AppMethodBeat.o(106548);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(106554);
    if (getChildCount() == 1)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(106554);
      return bool;
    }
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    int i = paramMotionEvent.getAction();
    float f = paramMotionEvent.getX();
    paramMotionEvent.getY();
    switch (i)
    {
    default:
    case 0:
    case 2:
      while (true)
      {
        AppMethodBeat.o(106554);
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
    if ((i > 600) && (this.ytq > 0))
      NC(this.ytq - 1);
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
      if ((i < -600) && (this.ytq < getChildCount() - 1))
      {
        NC(this.ytq + 1);
      }
      else
      {
        i = getWidth();
        NC((getScrollX() + i / 2) / i);
      }
    }
  }

  public void setOnMeasureListener(MMFlipper.a parama)
  {
    this.yug = parama;
  }

  public void setOnScreenChangedListener(MMFlipper.b paramb)
  {
    this.yuf = paramb;
  }

  public void setScrollEnable(boolean paramBoolean)
  {
    this.ytt = paramBoolean;
  }

  public void setToScreen(int paramInt)
  {
    AppMethodBeat.i(106551);
    paramInt = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    this.yue = false;
    if (!this.mScroller.isFinished())
      this.mScroller.abortAnimation();
    if (this.yuf != null)
      this.yuf.BZ(paramInt);
    this.ytr = this.ytq;
    this.ytq = paramInt;
    this.yuc = paramInt;
    scrollTo(paramInt * getWidth(), 0);
    AppMethodBeat.o(106551);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFlipper
 * JD-Core Version:    0.6.2
 */