package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import java.util.Iterator;
import java.util.Set;

public class MMSlideDelView extends ViewGroup
{
  private MMSlideDelView.g jJO;
  private MMSlideDelView.c jJP;
  private MMSlideDelView.d jJR;
  private boolean jZK;
  private int llU;
  private ak mHandler;
  private float mLastMotionX;
  private float mLastMotionY;
  private final Scroller mScroller;
  private final int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  private boolean nDl;
  long time;
  private boolean yxb;
  private MMSlideDelView.b yxc;
  private Runnable yxd;
  private long yxe;
  private boolean yxf;
  private MMSlideDelView.a yxg;
  private e yxh;

  public MMSlideDelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106778);
    this.jZK = false;
    this.yxb = false;
    this.nDl = true;
    this.yxf = false;
    this.yxg = null;
    this.mHandler = new ak();
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.yxe = ViewConfiguration.getLongPressTimeout();
    AppMethodBeat.o(106778);
  }

  private void dAa()
  {
    AppMethodBeat.i(106791);
    int i = getScrollX();
    int j = getChildAt(1).getWidth();
    if (i > j / 2)
    {
      this.jJR.a(this, true);
      this.yxb = true;
      this.mScroller.startScroll(i, 0, j - i, 0, 100);
    }
    while (true)
    {
      invalidate();
      AppMethodBeat.o(106791);
      return;
      this.yxb = false;
      this.jJR.a(this, false);
      this.mScroller.startScroll(i, 0, -i, 0, 100);
    }
  }

  private void dzV()
  {
    AppMethodBeat.i(106785);
    if (this.mHandler != null)
      this.mHandler.removeCallbacks(this.yxc);
    AppMethodBeat.o(106785);
  }

  private void dzW()
  {
    AppMethodBeat.i(106786);
    setPressed(false);
    if (this.yxb)
    {
      dzZ();
      AppMethodBeat.o(106786);
      return;
    }
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    localVelocityTracker.computeCurrentVelocity(1000);
    int i = (int)localVelocityTracker.getXVelocity();
    if (i < -600)
      dzX();
    while (true)
    {
      if (this.mVelocityTracker != null)
      {
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
      }
      this.jZK = false;
      gq(false);
      AppMethodBeat.o(106786);
      break;
      if (i > 600)
        dzZ();
      else
        dAa();
    }
  }

  private void dzX()
  {
    AppMethodBeat.i(106788);
    int i = getScrollX();
    int j = getChildAt(1).getWidth();
    this.jJR.a(this, true);
    this.yxb = true;
    this.mScroller.startScroll(i, 0, j - i, 0, 100);
    invalidate();
    AppMethodBeat.o(106788);
  }

  public static MMSlideDelView.d getItemStatusCallBack()
  {
    AppMethodBeat.i(106777);
    MMSlideDelView.d local1 = new MMSlideDelView.d()
    {
      public final void a(MMSlideDelView paramAnonymousMMSlideDelView, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(106770);
        if (paramAnonymousBoolean)
        {
          nDv.add(paramAnonymousMMSlideDelView);
          AppMethodBeat.o(106770);
        }
        while (true)
        {
          return;
          nDv.remove(paramAnonymousMMSlideDelView);
          AppMethodBeat.o(106770);
        }
      }

      public final boolean bIo()
      {
        AppMethodBeat.i(106771);
        boolean bool;
        if (nDv.size() > 0)
        {
          bool = true;
          AppMethodBeat.o(106771);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(106771);
        }
      }

      public final void bIp()
      {
        AppMethodBeat.i(106772);
        Iterator localIterator = nDv.iterator();
        while (localIterator.hasNext())
        {
          MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
          if (localMMSlideDelView != null)
            localMMSlideDelView.dzZ();
        }
        nDv.clear();
        AppMethodBeat.o(106772);
      }

      public final void bIq()
      {
        AppMethodBeat.i(106773);
        Iterator localIterator = nDv.iterator();
        while (localIterator.hasNext())
        {
          MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
          if (localMMSlideDelView != null)
            localMMSlideDelView.dzY();
        }
        nDv.clear();
        AppMethodBeat.o(106773);
      }
    };
    AppMethodBeat.o(106777);
    return local1;
  }

  private void gq(boolean paramBoolean)
  {
    AppMethodBeat.i(106787);
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    AppMethodBeat.o(106787);
  }

  private void lA()
  {
    AppMethodBeat.i(106783);
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.clear();
      this.mVelocityTracker = null;
    }
    AppMethodBeat.o(106783);
  }

  public void buildDrawingCache()
  {
  }

  public void buildDrawingCache(boolean paramBoolean)
  {
  }

  public void computeScroll()
  {
    AppMethodBeat.i(106792);
    if (this.mScroller.computeScrollOffset())
    {
      scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
      postInvalidate();
    }
    AppMethodBeat.o(106792);
  }

  public final void dzY()
  {
    AppMethodBeat.i(106789);
    this.jJR.a(this, false);
    this.yxb = false;
    scrollTo(0, 0);
    invalidate();
    AppMethodBeat.o(106789);
  }

  public final void dzZ()
  {
    AppMethodBeat.i(106790);
    int i = getScrollX();
    this.jJR.a(this, false);
    this.yxb = false;
    this.mScroller.startScroll(i, 0, -i, 0, 100);
    invalidate();
    AppMethodBeat.o(106790);
  }

  public Bitmap getDrawingCache()
  {
    return null;
  }

  public Bitmap getDrawingCache(boolean paramBoolean)
  {
    return null;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106779);
    if (getChildCount() < 2)
      AppMethodBeat.o(106779);
    while (true)
    {
      return;
      int i = getChildCount();
      paramInt1 = 0;
      int j;
      for (paramInt3 = 0; paramInt1 < i; paramInt3 = j)
      {
        View localView = getChildAt(paramInt1);
        j = paramInt3;
        if (localView.getVisibility() != 8)
        {
          j = localView.getMeasuredWidth();
          localView.layout(paramInt3, 0, paramInt3 + j, paramInt4 - paramInt2);
          j = paramInt3 + j;
        }
        paramInt1++;
      }
      AppMethodBeat.o(106779);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106780);
    if (getChildCount() < 2)
      AppMethodBeat.o(106780);
    while (true)
    {
      return;
      int i = View.MeasureSpec.getSize(paramInt1);
      try
      {
        getChildAt(0).measure(paramInt1, paramInt2);
        label36: int j = Math.max(0, getChildAt(0).getMeasuredHeight());
        ViewGroup.LayoutParams localLayoutParams = getChildAt(1).getLayoutParams();
        View localView = getChildAt(1);
        int k = j;
        if (localView != null)
        {
          k = j;
          if (localView.getVisibility() == 8);
        }
        try
        {
          localView.measure(View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(j, 1073741824));
          label114: k = Math.max(j, localView.getMeasuredHeight());
          setMeasuredDimension(resolveSize(i, paramInt1), resolveSize(k, paramInt2));
          AppMethodBeat.o(106780);
        }
        catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException1)
        {
          break label114;
        }
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException2)
      {
        break label36;
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(106782);
    if (!this.nDl)
      AppMethodBeat.o(106782);
    int i;
    float f1;
    float f2;
    for (bool = false; ; bool = false)
    {
      return bool;
      i = paramMotionEvent.getAction();
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      if ((this.jJR.bIo()) && (!this.yxb))
      {
        ab.v("MicroMsg.MMSlideDelView", "onTouchEvent a menu has been shown, skip");
        this.yxf = false;
        this.jJR.bIp();
      }
      if (this.mVelocityTracker == null)
        this.mVelocityTracker = VelocityTracker.obtain();
      this.mVelocityTracker.addMovement(paramMotionEvent);
      if (!this.yxf)
        break;
      AppMethodBeat.o(106782);
    }
    int j;
    int m;
    switch (i)
    {
    default:
      if (this.mHandler != null)
        this.mHandler.removeCallbacks(this.yxg);
    case 0:
      while (true)
      {
        AppMethodBeat.o(106782);
        break;
        if ((getContext() instanceof MMActivity))
          ((MMActivity)getContext()).aqX();
        this.jZK = false;
        if (!this.mScroller.isFinished())
          this.mScroller.abortAnimation();
        this.time = System.currentTimeMillis();
        if (this.jJP != null)
          this.llU = this.jJP.cZ(this);
        if (this.yxc == null)
          this.yxc = new MMSlideDelView.b(this);
        this.mHandler.postDelayed(this.yxc, ViewConfiguration.getTapTimeout());
        this.mLastMotionX = f1;
        this.mLastMotionY = f2;
        if (this.yxg == null)
          this.yxg = new MMSlideDelView.a(this, (byte)0);
        paramMotionEvent = this.yxg;
        paramMotionEvent.yxj = paramMotionEvent.yxi.getWindowAttachCount();
        this.mHandler.postDelayed(this.yxg, this.yxe);
      }
    case 2:
      j = (int)(this.mLastMotionX - f1);
      int k = (int)(this.mLastMotionY - f2);
      m = getScrollX();
      if (!this.jZK)
      {
        if ((j < 0) || (Math.abs(j) < this.mTouchSlop / 3))
          break label545;
        i = k;
        if (k == 0)
          i = 1;
        if (Math.abs(j / i) <= 3)
          break label545;
        i = 1;
        label430: if ((i != 0) || (this.yxb))
        {
          this.jZK = true;
          gq(true);
        }
      }
      if (this.jZK)
      {
        paramMotionEvent = getChildAt(1);
        if ((paramMotionEvent != null) && (!paramMotionEvent.isShown()))
          paramMotionEvent.setVisibility(0);
        dzV();
        setPressed(false);
        gq(true);
        if (m + j >= 0)
          break label550;
        i = -m;
      }
      break;
    case 1:
    case 3:
    }
    while (true)
    {
      if (this.mHandler != null)
        this.mHandler.removeCallbacks(this.yxg);
      scrollBy(i, 0);
      this.mLastMotionX = f1;
      this.mLastMotionY = f2;
      break;
      label545: i = 0;
      break label430;
      label550: if (m + j > getChildAt(1).getWidth())
      {
        i = getChildAt(1).getWidth() - m;
        continue;
        dzV();
        if ((!this.jZK) && ((isPressed()) || (System.currentTimeMillis() - this.time < 200L)) && (this.jJO != null) && (!this.yxb))
        {
          setPressed(true);
          if (this.yxd != null)
            removeCallbacks(this.yxd);
          this.yxd = new MMSlideDelView.2(this);
          this.mHandler.postDelayed(this.yxd, ViewConfiguration.getPressedStateDuration());
        }
        while (true)
        {
          if (this.jZK)
            dzW();
          lA();
          if (this.mHandler == null)
            break;
          this.mHandler.removeCallbacks(this.yxg);
          break;
          setPressed(false);
        }
        dzV();
        setPressed(false);
        if (this.jZK)
          dzW();
        lA();
        if (this.mHandler == null)
          break;
        this.mHandler.removeCallbacks(this.yxg);
        break;
      }
      i = j;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(106784);
    ab.v("MicroMsg.MMSlideDelView", "window focus change, reset long press status");
    this.yxf = false;
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.o(106784);
  }

  public void setEnable(boolean paramBoolean)
  {
    this.nDl = paramBoolean;
  }

  public void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public void setItemStatusCallBack(MMSlideDelView.d paramd)
  {
    this.jJR = paramd;
  }

  public void setOnDelViewShowCallback(e parame)
  {
    this.yxh = parame;
  }

  public void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }

  public void setView(View paramView)
  {
    AppMethodBeat.i(106781);
    if (getChildCount() == 2)
      removeViewAt(0);
    addView(paramView, 0, new ViewGroup.LayoutParams(-1, -2));
    AppMethodBeat.o(106781);
  }

  public static abstract interface e
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMSlideDelView
 * JD-Core Version:    0.6.2
 */