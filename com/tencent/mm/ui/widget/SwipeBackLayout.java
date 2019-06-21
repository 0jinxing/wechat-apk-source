package com.tencent.mm.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
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
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.base.b.a;
import com.tencent.mm.ui.mogic.a;
import com.tencent.mm.ui.mogic.a.a;
import com.tencent.mm.ui.tools.h.a;

public class SwipeBackLayout extends FrameLayout
{
  private float Qb;
  public View WL;
  private boolean mEnable;
  private boolean mInLayout;
  private Rect oT;
  private float zOf;
  private int zOg;
  private int zOh;
  public a zOi;
  private float zOj;
  public Drawable zOk;
  private boolean zOl;
  private boolean zOm;
  public boolean zOn;
  public boolean zOo;
  public boolean zOp;
  private boolean zOq;
  private b zOr;
  private Drawable zOs;
  private boolean zOt;
  private boolean zOu;
  public a zOv;

  public SwipeBackLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SwipeBackLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107991);
    this.zOf = 0.3F;
    this.mEnable = true;
    this.oT = new Rect();
    this.zOl = true;
    this.zOm = false;
    this.zOn = false;
    this.zOo = false;
    this.zOp = false;
    this.zOq = false;
    this.zOu = true;
    this.zOv = null;
    this.zOk = getResources().getDrawable(2130840128);
    setFocusable(true);
    setDescendantFocusability(262144);
    init();
    AppMethodBeat.o(107991);
  }

  public void computeScroll()
  {
    AppMethodBeat.i(108001);
    this.Qb = Math.max(0.0F, 1.0F - this.zOj);
    a locala = this.zOi;
    if (locala.SG == 2)
    {
      boolean bool1 = locala.jlU.qN.computeScrollOffset();
      int i = locala.jlU.qN.getCurrX();
      j = locala.jlU.qN.getCurrY();
      int k = i - locala.SU.getLeft();
      int m = j - locala.SU.getTop();
      if (k != 0)
        locala.SU.offsetLeftAndRight(k);
      if (m != 0)
        locala.SU.offsetTopAndBottom(m);
      if ((k != 0) || (m != 0))
        locala.zzE.ht(i, j);
      boolean bool2 = bool1;
      if (bool1)
      {
        bool2 = bool1;
        if (i == locala.jlU.qN.getFinalX())
        {
          bool2 = bool1;
          if (j == locala.jlU.qN.getFinalY())
          {
            locala.jlU.qN.abortAnimation();
            bool2 = locala.jlU.qN.isFinished();
          }
        }
      }
      if (!bool2)
        locala.SW.post(locala.SX);
    }
    if (locala.SG == 2);
    for (int j = 1; ; j = 0)
    {
      if (j != 0)
        s.R(this);
      AppMethodBeat.o(108001);
      return;
    }
  }

  public final boolean dKR()
  {
    boolean bool = false;
    AppMethodBeat.i(107996);
    if (!this.zOp)
      AppMethodBeat.o(107996);
    while (true)
    {
      return bool;
      if (Float.compare(this.WL.getLeft(), 0.01F) <= 0)
      {
        this.zOp = false;
        AppMethodBeat.o(107996);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(107996);
      }
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(107997);
    if (!this.mEnable)
    {
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(107997);
    }
    while (true)
    {
      return bool;
      if (this.zOr != null)
        this.zOr.l(paramMotionEvent);
      if (paramMotionEvent.getAction() == 0)
        this.zOt = false;
      if (this.zOt)
      {
        bool = super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(107997);
      }
      else
      {
        if (!dKR())
          break;
        bool = super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(107997);
      }
    }
    a locala;
    label204: float f1;
    float f2;
    int k;
    int m;
    label695: float f3;
    View localView;
    while (true)
    {
      try
      {
        if (this.zOi.SG != 1)
          break label996;
        locala = this.zOi;
        i = paramMotionEvent.getActionMasked();
        j = paramMotionEvent.getActionIndex();
        if (i == 0)
          locala.cancel();
        if (locala.mVelocityTracker == null)
          locala.mVelocityTracker = VelocityTracker.obtain();
        locala.mVelocityTracker.addMovement(paramMotionEvent);
        switch (i)
        {
        case 4:
        default:
          AppMethodBeat.o(107997);
          break;
        case 0:
          f1 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          j = paramMotionEvent.getPointerId(0);
          paramMotionEvent = locala.F((int)f1, (int)f2);
          locala.a(f1, f2, j);
          locala.v(paramMotionEvent, j);
          j = locala.SL[j];
          if ((locala.SS & j) == 0)
            continue;
          break;
        case 5:
          i = paramMotionEvent.getPointerId(j);
          f2 = paramMotionEvent.getX(j);
          f1 = paramMotionEvent.getY(j);
          locala.a(f2, f1, i);
          if (locala.SG == 0)
          {
            locala.v(locala.F((int)f2, (int)f1), i);
            continue;
          }
          break;
        case 2:
        case 6:
        case 1:
        case 3:
        }
      }
      catch (NullPointerException paramMotionEvent)
      {
        ab.printErrStackTrace("MicroMsg.SwipeBackLayout", paramMotionEvent, "got an NullPointerException", new Object[0]);
        AppMethodBeat.o(107997);
        bool = false;
        break;
        j = (int)f2;
        k = (int)f1;
        paramMotionEvent = locala.SU;
        if ((paramMotionEvent != null) && (j >= paramMotionEvent.getLeft()) && (j < paramMotionEvent.getRight()) && (k >= paramMotionEvent.getTop()) && (k < paramMotionEvent.getBottom()))
        {
          j = 1;
          if (j == 0)
            continue;
          locala.v(locala.SU, i);
          continue;
        }
      }
      catch (IllegalArgumentException paramMotionEvent)
      {
        ab.printErrStackTrace("MicroMsg.SwipeBackLayout", paramMotionEvent, "got an IllegalArgumentException", new Object[0]);
        AppMethodBeat.o(107997);
        bool = false;
        break;
        j = 0;
        continue;
        if (locala.SG != 1)
          break label695;
        j = paramMotionEvent.findPointerIndex(locala.mActivePointerId);
        f1 = paramMotionEvent.getX(j);
        f2 = paramMotionEvent.getY(j);
        m = (int)(f1 - locala.SJ[locala.mActivePointerId]);
        int n = (int)(f2 - locala.SK[locala.mActivePointerId]);
        k = locala.SU.getLeft() + m;
        i = locala.SU.getTop() + n;
        int i1 = locala.SU.getLeft();
        int i2 = locala.SU.getTop();
        j = k;
        if (m != 0)
        {
          j = locala.zzE.d(locala.SU, k);
          locala.SU.offsetLeftAndRight(j - i1);
        }
        if (n != 0)
        {
          locala.SU.offsetTopAndBottom(0 - i2);
          i = 0;
        }
        if ((m != 0) || (n != 0))
          locala.zzE.ht(j, i);
        locala.e(paramMotionEvent);
        continue;
      }
      catch (ArrayIndexOutOfBoundsException paramMotionEvent)
      {
        ab.printErrStackTrace("MicroMsg.SwipeBackLayout", paramMotionEvent, "got an ArrayIndexOutOfBoundsException", new Object[0]);
        AppMethodBeat.o(107997);
        bool = false;
      }
      break;
      i = paramMotionEvent.getPointerCount();
      for (j = 0; j < i; j++)
      {
        k = paramMotionEvent.getPointerId(j);
        f3 = paramMotionEvent.getX(j);
        f2 = paramMotionEvent.getY(j);
        f1 = f3 - locala.SH[k];
        locala.b(f1, f2 - locala.SI[k], k);
        if (locala.SG == 1)
          break;
        localView = locala.F((int)f3, (int)f2);
        if ((locala.q(localView, f1)) && (locala.v(localView, k)))
          break;
      }
      locala.e(paramMotionEvent);
    }
    int i = paramMotionEvent.getPointerId(j);
    if ((locala.SG == 1) && (i == locala.mActivePointerId))
    {
      k = paramMotionEvent.getPointerCount();
      j = 0;
      label855: if (j >= k)
        break label1480;
      m = paramMotionEvent.getPointerId(j);
      if (m == locala.mActivePointerId)
        break label950;
      f2 = paramMotionEvent.getX(j);
      f1 = paramMotionEvent.getY(j);
      if ((locala.F((int)f2, (int)f1) != locala.SU) || (!locala.v(locala.SU, m)))
        break label950;
    }
    label950: label1088: label1480: for (int j = locala.mActivePointerId; ; j = -1)
    {
      if (j == -1)
        locala.eZ();
      locala.aY(i);
      break label204;
      j++;
      break label855;
      if (locala.SG == 1)
        locala.eZ();
      locala.cancel();
      break label204;
      if (locala.SG == 1)
        locala.u(0.0F, 0.0F);
      locala.cancel();
      break label204;
      label996: locala = this.zOi;
      i = paramMotionEvent.getActionMasked();
      j = paramMotionEvent.getActionIndex();
      if (i == 0)
        locala.cancel();
      if (locala.mVelocityTracker == null)
        locala.mVelocityTracker = VelocityTracker.obtain();
      locala.mVelocityTracker.addMovement(paramMotionEvent);
      switch (i)
      {
      case 4:
      default:
        if (locala.SG != 1)
          break;
      case 0:
      case 5:
      case 2:
      case 6:
      case 1:
      case 3:
      }
      for (j = 1; ; j = 0)
      {
        if (j == 0)
          break label1465;
        ab.i("changelcai", "shouldInterceptTouchEvent %s", new Object[] { paramMotionEvent });
        paramMotionEvent.setAction(3);
        super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(107997);
        break;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        j = paramMotionEvent.getPointerId(0);
        locala.a(f1, f2, j);
        localView = locala.F((int)f1, (int)f2);
        if ((localView == locala.SU) && (locala.SG == 2))
          locala.v(localView, j);
        if ((locala.SL[j] & locala.SS) == 0)
          break label1088;
        break label1088;
        i = paramMotionEvent.getPointerId(j);
        f2 = paramMotionEvent.getX(j);
        f1 = paramMotionEvent.getY(j);
        locala.a(f2, f1, i);
        if ((locala.SG == 0) || (locala.SG != 2))
          break label1088;
        localView = locala.F((int)f2, (int)f1);
        if (localView != locala.SU)
          break label1088;
        locala.v(localView, i);
        break label1088;
        i = paramMotionEvent.getPointerCount();
        for (j = 0; j < i; j++)
        {
          k = paramMotionEvent.getPointerId(j);
          f2 = paramMotionEvent.getX(j);
          f3 = paramMotionEvent.getY(j);
          f1 = f2 - locala.SH[k];
          locala.b(f1, f3 - locala.SI[k], k);
          if (locala.SG == 1)
            break;
          localView = locala.F((int)f2, (int)f3);
          if ((localView != null) && (locala.q(localView, f1)) && (locala.v(localView, k)))
            break;
        }
        locala.e(paramMotionEvent);
        break label1088;
        locala.aY(paramMotionEvent.getPointerId(j));
        break label1088;
        locala.cancel();
        break label1088;
      }
      super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(107997);
      break;
    }
  }

  public final boolean dkx()
  {
    AppMethodBeat.i(107994);
    dKR();
    boolean bool = this.zOp;
    AppMethodBeat.o(107994);
    return bool;
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    AppMethodBeat.i(108000);
    if (paramView == this.WL);
    for (int i = 1; ; i = 0)
    {
      boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
      if ((Float.compare(this.Qb, 0.0F) > 0) && (i != 0) && (this.zOi.SG != 0))
      {
        Rect localRect = this.oT;
        paramView.getHitRect(localRect);
        this.zOk.setBounds(localRect.left - this.zOk.getIntrinsicWidth(), localRect.top, localRect.left, localRect.bottom);
        this.zOk.setAlpha((int)(this.Qb * 255.0F));
        this.zOk.draw(paramCanvas);
      }
      AppMethodBeat.o(108000);
      return bool;
    }
  }

  public View getTargetContentView()
  {
    return this.WL;
  }

  public final void init()
  {
    AppMethodBeat.i(107992);
    Interpolator localInterpolator = AnimationUtils.loadInterpolator(getContext(), 2131034199);
    this.zOi = a.a(this, new c((byte)0), localInterpolator);
    this.zOi.SS = 1;
    float f = getResources().getDisplayMetrics().density;
    this.zOi.SQ = (100.0F * f);
    this.zOi.SP = (f * 300.0F);
    this.zOg = 0;
    this.zOh = 0;
    AppMethodBeat.o(107992);
  }

  public void onFinishInflate()
  {
    this.WL = this;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107998);
    this.mInLayout = true;
    if (this.WL != null)
      this.WL.layout(this.zOg, this.zOh, this.zOg + this.WL.getMeasuredWidth(), this.zOh + this.WL.getMeasuredHeight());
    this.mInLayout = false;
    AppMethodBeat.o(107998);
  }

  public final void qX(boolean paramBoolean)
  {
    AppMethodBeat.i(107993);
    ab.i("MicroMsg.SwipeBackLayout", "ashutest::markTranslucent %B", new Object[] { Boolean.valueOf(paramBoolean) });
    this.zOn = paramBoolean;
    AppMethodBeat.o(107993);
  }

  public void requestLayout()
  {
    AppMethodBeat.i(107999);
    if (!this.mInLayout)
      super.requestLayout();
    AppMethodBeat.o(107999);
  }

  public void setContentView(View paramView)
  {
    this.WL = paramView;
  }

  public void setEnableGesture(boolean paramBoolean)
  {
    this.mEnable = paramBoolean;
  }

  public void setNeedChangeWindowBackground(boolean paramBoolean)
  {
    this.zOu = paramBoolean;
  }

  public void setNeedRequestActivityTranslucent(boolean paramBoolean)
  {
    this.zOl = paramBoolean;
    if (this.zOl)
      this.zOm = false;
  }

  public void setOnceDisEnableGesture(boolean paramBoolean)
  {
    AppMethodBeat.i(107995);
    ab.i("MicroMsg.SwipeBackLayout", "[setOnceDisEnableGesture] enable:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.zOt = paramBoolean;
    AppMethodBeat.o(107995);
  }

  public void setSwipeBackListener(b paramb)
  {
    this.zOr = paramb;
  }

  public void setSwipeGestureDelegate(a parama)
  {
    this.zOv = parama;
  }

  public static abstract interface a
  {
    public abstract void onCancel();

    public abstract void onDrag();

    public abstract void onSwipeBack();
  }

  public static abstract interface b
  {
    public abstract boolean ba(boolean paramBoolean);

    public abstract void bf(float paramFloat);

    public abstract void l(MotionEvent paramMotionEvent);
  }

  final class c extends a.a
    implements b.a
  {
    int zOw = 0;
    int zOx = 0;
    int zOy = 0;

    private c()
    {
    }

    public final void N(int paramInt)
    {
      AppMethodBeat.i(107989);
      ab.i("MicroMsg.SwipeBackLayout", "ashutest::onViewDragStateChanged state %d, requestedTranslucent %B fastRelease %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(SwipeBackLayout.l(SwipeBackLayout.this)), Boolean.valueOf(SwipeBackLayout.m(SwipeBackLayout.this)) });
      if (1 == paramInt)
      {
        ab.i("MicroMsg.SwipeBackLayout", "ashutest:: on drag");
        if (((SwipeBackLayout.this.getContext() instanceof Activity)) && (SwipeBackLayout.i(SwipeBackLayout.this) == null))
        {
          SwipeBackLayout.a(SwipeBackLayout.this, ((Activity)SwipeBackLayout.this.getContext()).getWindow().getDecorView().getBackground());
          if (SwipeBackLayout.j(SwipeBackLayout.this))
            ((Activity)SwipeBackLayout.this.getContext()).getWindow().getDecorView().setBackgroundResource(2131690597);
        }
        if (SwipeBackLayout.h(SwipeBackLayout.this) != null)
          SwipeBackLayout.h(SwipeBackLayout.this).onDrag();
        SwipeBackLayout.a(SwipeBackLayout.this, false);
        if (SwipeBackLayout.b(SwipeBackLayout.this))
          h.bq(0.0F);
      }
      if ((paramInt == 0) && (!SwipeBackLayout.m(SwipeBackLayout.this)))
      {
        ab.i("MicroMsg.SwipeBackLayout", "ashutest:: on cancel");
        if (SwipeBackLayout.h(SwipeBackLayout.this) != null)
        {
          if (((SwipeBackLayout.this.getContext() instanceof Activity)) && (SwipeBackLayout.i(SwipeBackLayout.this) != null))
          {
            if (SwipeBackLayout.j(SwipeBackLayout.this))
              ((Activity)SwipeBackLayout.this.getContext()).getWindow().getDecorView().setBackground(SwipeBackLayout.i(SwipeBackLayout.this));
            SwipeBackLayout.a(SwipeBackLayout.this, null);
          }
          SwipeBackLayout.h(SwipeBackLayout.this).onCancel();
        }
        h.bq(1.0F);
      }
      if ((1 == paramInt) && (SwipeBackLayout.n(SwipeBackLayout.this)) && ((SwipeBackLayout.this.getContext() instanceof Activity)) && (!SwipeBackLayout.b(SwipeBackLayout.this)) && (!SwipeBackLayout.l(SwipeBackLayout.this)))
      {
        ab.i("MicroMsg.SwipeBackLayout", "ashutest:: match dragging");
        SwipeBackLayout.d(SwipeBackLayout.this, true);
        b.a((Activity)SwipeBackLayout.this.getContext(), this);
      }
      if (2 == paramInt)
      {
        ab.i("MicroMsg.SwipeBackLayout", "ashutest:: notify settle, mReleasedLeft %d", new Object[] { Integer.valueOf(this.zOx) });
        if (this.zOx <= 0)
          break label429;
      }
      label429: for (boolean bool = true; ; bool = false)
      {
        h.J(bool, this.zOx);
        AppMethodBeat.o(107989);
        return;
      }
    }

    public final boolean PG(int paramInt)
    {
      boolean bool = true;
      AppMethodBeat.i(107985);
      a locala = SwipeBackLayout.a(SwipeBackLayout.this);
      int i;
      if ((locala.SO & 1 << paramInt) != 0)
      {
        i = 1;
        if ((i == 0) || ((locala.SL[paramInt] & 0x1) == 0))
          break label58;
        AppMethodBeat.o(107985);
      }
      while (true)
      {
        return bool;
        i = 0;
        break;
        label58: AppMethodBeat.o(107985);
        bool = false;
      }
    }

    public final void a(View paramView, float paramFloat1, float paramFloat2)
    {
      boolean bool = false;
      AppMethodBeat.i(107987);
      int i = paramView.getWidth();
      this.zOx = 0;
      this.zOy = 0;
      if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (SwipeBackLayout.f(SwipeBackLayout.this) > SwipeBackLayout.k(SwipeBackLayout.this))))
      {
        i = i + SwipeBackLayout.d(SwipeBackLayout.this).getIntrinsicWidth() + 10;
        this.zOx = i;
        ab.i("MicroMsg.SwipeBackLayout", "ashutest::onViewReleased, xvel:%f yvel:%f, releaseLeft:%d, releaseTop:%d, translucent %B", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(this.zOx), Integer.valueOf(this.zOy), Boolean.valueOf(SwipeBackLayout.b(SwipeBackLayout.this)) });
        SwipeBackLayout.b(SwipeBackLayout.this, true);
        if (SwipeBackLayout.e(SwipeBackLayout.this) == null)
          break label203;
        paramView = SwipeBackLayout.e(SwipeBackLayout.this);
        if (this.zOx != 0)
          bool = true;
        if (!paramView.ba(bool))
          break label203;
        ab.i("MicroMsg.SwipeBackLayout", "intercepted by mSwipeBackListener.onViewReleased");
        AppMethodBeat.o(107987);
      }
      while (true)
      {
        return;
        i = 0;
        break;
        label203: if (SwipeBackLayout.b(SwipeBackLayout.this))
        {
          paramView = SwipeBackLayout.a(SwipeBackLayout.this);
          int j = this.zOx;
          i = this.zOy;
          if (!paramView.SV)
          {
            paramView = new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
            AppMethodBeat.o(107987);
            throw paramView;
          }
          paramView.b(j, i, (int)paramView.mVelocityTracker.getXVelocity(paramView.mActivePointerId), (int)paramView.mVelocityTracker.getYVelocity(paramView.mActivePointerId), 0L);
          SwipeBackLayout.this.invalidate();
          AppMethodBeat.o(107987);
        }
        else
        {
          SwipeBackLayout.c(SwipeBackLayout.this, true);
          AppMethodBeat.o(107987);
        }
      }
    }

    public final int d(View paramView, int paramInt)
    {
      int i = 0;
      AppMethodBeat.i(107988);
      if (SwipeBackLayout.b(SwipeBackLayout.this))
      {
        paramInt = Math.max(this.zOw, paramInt);
        this.zOw = 0;
        paramInt = Math.min(paramView.getWidth(), Math.max(paramInt, 0));
        AppMethodBeat.o(107988);
      }
      while (true)
      {
        return paramInt;
        this.zOw = Math.max(this.zOw, paramInt);
        AppMethodBeat.o(107988);
        paramInt = i;
      }
    }

    public final int dJm()
    {
      return 1;
    }

    public final void ht(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(107986);
      if (!SwipeBackLayout.b(SwipeBackLayout.this))
      {
        ab.w("MicroMsg.SwipeBackLayout", "[onViewPositionChanged] mHasTranslucent is false");
        AppMethodBeat.o(107986);
        return;
      }
      SwipeBackLayout.a(SwipeBackLayout.this, Math.abs(paramInt1 / (SwipeBackLayout.c(SwipeBackLayout.this).getWidth() + SwipeBackLayout.d(SwipeBackLayout.this).getIntrinsicWidth())));
      SwipeBackLayout.a(SwipeBackLayout.this, paramInt1);
      SwipeBackLayout.b(SwipeBackLayout.this, paramInt2);
      SwipeBackLayout.this.invalidate();
      if (SwipeBackLayout.e(SwipeBackLayout.this) != null)
        SwipeBackLayout.e(SwipeBackLayout.this).bf(SwipeBackLayout.f(SwipeBackLayout.this));
      if ((Float.compare(SwipeBackLayout.f(SwipeBackLayout.this), 1.0F) >= 0) && (!SwipeBackLayout.g(SwipeBackLayout.this)))
      {
        SwipeBackLayout.a(SwipeBackLayout.this, true);
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(107978);
            if (SwipeBackLayout.h(SwipeBackLayout.this) != null)
            {
              ab.i("MicroMsg.SwipeBackLayout", "ashutest:: on popOut");
              if (((SwipeBackLayout.this.getContext() instanceof Activity)) && (SwipeBackLayout.i(SwipeBackLayout.this) != null))
              {
                if (SwipeBackLayout.j(SwipeBackLayout.this))
                  ((Activity)SwipeBackLayout.this.getContext()).getWindow().getDecorView().setBackground(SwipeBackLayout.i(SwipeBackLayout.this));
                SwipeBackLayout.a(SwipeBackLayout.this, null);
              }
              SwipeBackLayout.h(SwipeBackLayout.this).onSwipeBack();
            }
            SwipeBackLayout.b(SwipeBackLayout.this, false);
            AppMethodBeat.o(107978);
          }
        });
      }
      while (true)
      {
        if (SwipeBackLayout.a(SwipeBackLayout.this).SG == 1)
          h.bq(SwipeBackLayout.f(SwipeBackLayout.this));
        AppMethodBeat.o(107986);
        break;
        if (Float.compare(SwipeBackLayout.f(SwipeBackLayout.this), 0.01F) <= 0)
        {
          SwipeBackLayout.b(SwipeBackLayout.this, false);
          ab.w("MicroMsg.SwipeBackLayout", "[onViewPositionChanged] mScrollPercent:%s mHasCallPopOut:%s", new Object[] { Float.valueOf(SwipeBackLayout.f(SwipeBackLayout.this)), Boolean.valueOf(SwipeBackLayout.g(SwipeBackLayout.this)) });
        }
      }
    }

    public final void iH(final boolean paramBoolean)
    {
      AppMethodBeat.i(107990);
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(107984);
          ab.i("MicroMsg.SwipeBackLayout", "on Complete, result %B, releaseLeft %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(SwipeBackLayout.c.this.zOx) });
          SwipeBackLayout.d(SwipeBackLayout.this, paramBoolean);
          if (paramBoolean)
            if (SwipeBackLayout.c.this.zOx > 0)
            {
              h.bq(0.0F);
              SwipeBackLayout.this.qX(paramBoolean);
              if ((paramBoolean) && (SwipeBackLayout.m(SwipeBackLayout.this)))
              {
                if (SwipeBackLayout.c.this.zOx != 0)
                  break label184;
                com.tencent.mm.ui.tools.h.a(SwipeBackLayout.c(SwipeBackLayout.this), 200L, 0.0F, new h.a()
                {
                  public final void dbb()
                  {
                    AppMethodBeat.i(107980);
                    onAnimationEnd();
                    AppMethodBeat.o(107980);
                  }

                  public final void onAnimationEnd()
                  {
                    AppMethodBeat.i(107979);
                    SwipeBackLayout.b(SwipeBackLayout.this, false);
                    AppMethodBeat.o(107979);
                  }
                });
              }
            }
          while (true)
          {
            SwipeBackLayout.c(SwipeBackLayout.this, false);
            AppMethodBeat.o(107984);
            return;
            h.bq(1.0F);
            break;
            SwipeBackLayout.b(SwipeBackLayout.this, false);
            break;
            label184: com.tencent.mm.ui.tools.h.a(SwipeBackLayout.c(SwipeBackLayout.this), 200L, SwipeBackLayout.c.this.zOx, new h.a()
            {
              public final void dbb()
              {
                AppMethodBeat.i(107983);
                onAnimationEnd();
                AppMethodBeat.o(107983);
              }

              public final void onAnimationEnd()
              {
                AppMethodBeat.i(107982);
                SwipeBackLayout.a(SwipeBackLayout.this, true);
                al.d(new Runnable()
                {
                  public final void run()
                  {
                    AppMethodBeat.i(107981);
                    if (SwipeBackLayout.h(SwipeBackLayout.this) != null)
                    {
                      if (((SwipeBackLayout.this.getContext() instanceof Activity)) && (SwipeBackLayout.i(SwipeBackLayout.this) != null))
                      {
                        if (SwipeBackLayout.j(SwipeBackLayout.this))
                          ((Activity)SwipeBackLayout.this.getContext()).getWindow().getDecorView().setBackground(SwipeBackLayout.i(SwipeBackLayout.this));
                        SwipeBackLayout.a(SwipeBackLayout.this, null);
                      }
                      SwipeBackLayout.h(SwipeBackLayout.this).onSwipeBack();
                      ab.d("MicroMsg.SwipeBackLayout", "ashutest:: on onSwipeBack");
                    }
                    h.bq(1.0F);
                    SwipeBackLayout.b(SwipeBackLayout.this, false);
                    AppMethodBeat.o(107981);
                  }
                });
                AppMethodBeat.o(107982);
              }
            });
            h.J(true, SwipeBackLayout.c.this.zOx);
          }
        }
      });
      AppMethodBeat.o(107990);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.SwipeBackLayout
 * JD-Core Version:    0.6.2
 */