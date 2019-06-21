package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.b;
import android.support.v4.view.i;
import android.support.v4.view.k;
import android.support.v4.view.l;
import android.support.v4.view.n;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;

public class SwipeRefreshLayout extends ViewGroup
  implements i, l
{
  private static final int[] LAYOUT_ATTRS = { 16842766 };
  private static final String LOG_TAG = SwipeRefreshLayout.class.getSimpleName();
  private View Ov;
  SwipeRefreshLayout.b RS;
  boolean RT = false;
  private float RU = -1.0F;
  private float RV;
  private final k RW;
  private final int[] RX = new int[2];
  private final int[] RY = new int[2];
  private boolean RZ;
  private int Sa;
  int Sb;
  private float Sc;
  boolean Sd;
  private boolean Se;
  private final DecelerateInterpolator Sf;
  c Sg;
  private int Sh = -1;
  float Si;
  protected int Sj;
  int Sk;
  d Sl;
  private Animation Sm;
  private Animation Sn;
  private Animation So;
  private Animation Sp;
  private Animation Sq;
  boolean Sr;
  private int Ss;
  boolean St;
  private SwipeRefreshLayout.a Su;
  private Animation.AnimationListener Sv = new SwipeRefreshLayout.1(this);
  private final Animation Sw = new SwipeRefreshLayout.6(this);
  private final Animation Sx = new SwipeRefreshLayout.7(this);
  private int mActivePointerId = -1;
  protected int mFrom;
  private float mInitialMotionY;
  private boolean mIsBeingDragged;
  private int mTouchSlop;
  private final n pF;

  public SwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mTouchSlop = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.Sa = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.Sf = new DecelerateInterpolator(2.0F);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.Ss = ((int)(40.0F * localDisplayMetrics.density));
    this.Sg = new c(getContext());
    this.Sl = new d(getContext());
    this.Sl.aQ(1);
    this.Sg.setImageDrawable(this.Sl);
    this.Sg.setVisibility(8);
    addView(this.Sg);
    setChildrenDrawingOrderEnabled(true);
    this.Sk = ((int)(localDisplayMetrics.density * 64.0F));
    this.RU = this.Sk;
    this.pF = new n(this);
    this.RW = new k(this);
    setNestedScrollingEnabled(true);
    int i = -this.Ss;
    this.Sb = i;
    this.Sj = i;
    L(1.0F);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, LAYOUT_ATTRS);
    setEnabled(paramContext.getBoolean(0, true));
    paramContext.recycle();
  }

  private Animation C(int paramInt1, int paramInt2)
  {
    SwipeRefreshLayout.4 local4 = new SwipeRefreshLayout.4(this, paramInt1, paramInt2);
    local4.setDuration(300L);
    this.Sg.OW = null;
    this.Sg.clearAnimation();
    this.Sg.startAnimation(local4);
    return local4;
  }

  private void I(float paramFloat)
  {
    this.Sl.H(true);
    float f1 = Math.min(1.0F, Math.abs(paramFloat / this.RU));
    float f2 = Math.max((float)(f1 - 0.4D), 0.0F) * 5.0F / 3.0F;
    float f3 = Math.abs(paramFloat);
    float f4 = this.RU;
    float f5;
    int i;
    int j;
    if (this.St)
    {
      f5 = this.Sk - this.Sj;
      f3 = Math.max(0.0F, Math.min(f3 - f4, f5 * 2.0F) / f5);
      f3 = (float)(f3 / 4.0F - Math.pow(f3 / 4.0F, 2.0D)) * 2.0F;
      i = this.Sj;
      j = (int)(f5 * f1 + f5 * f3 * 2.0F);
      if (this.Sg.getVisibility() != 0)
        this.Sg.setVisibility(0);
      if (!this.Sd)
      {
        this.Sg.setScaleX(1.0F);
        this.Sg.setScaleY(1.0F);
      }
      if (this.Sd)
        setAnimationProgress(Math.min(1.0F, paramFloat / this.RU));
      if (paramFloat >= this.RU)
        break label318;
      if ((this.Sl.getAlpha() > 76) && (!a(this.So)))
        eS();
    }
    while (true)
    {
      this.Sl.C(Math.min(0.8F, f2 * 0.8F));
      this.Sl.B(Math.min(1.0F, f2));
      this.Sl.D((-0.25F + f2 * 0.4F + f3 * 2.0F) * 0.5F);
      setTargetOffsetTopAndBottom(j + i - this.Sb);
      return;
      f5 = this.Sk;
      break;
      label318: if ((this.Sl.getAlpha() < 255) && (!a(this.Sp)))
        eT();
    }
  }

  private void J(float paramFloat)
  {
    if (paramFloat > this.RU)
      f(true, true);
    while (true)
    {
      return;
      this.RT = false;
      this.Sl.C(0.0F);
      SwipeRefreshLayout.5 local5 = null;
      if (!this.Sd)
        local5 = new SwipeRefreshLayout.5(this);
      b(this.Sb, local5);
      this.Sl.H(false);
    }
  }

  private void K(float paramFloat)
  {
    if ((paramFloat - this.Sc > this.mTouchSlop) && (!this.mIsBeingDragged))
    {
      this.mInitialMotionY = (this.Sc + this.mTouchSlop);
      this.mIsBeingDragged = true;
      this.Sl.setAlpha(76);
    }
  }

  private void a(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    this.mFrom = paramInt;
    this.Sw.reset();
    this.Sw.setDuration(200L);
    this.Sw.setInterpolator(this.Sf);
    if (paramAnimationListener != null)
      this.Sg.OW = paramAnimationListener;
    this.Sg.clearAnimation();
    this.Sg.startAnimation(this.Sw);
  }

  private static boolean a(Animation paramAnimation)
  {
    if ((paramAnimation != null) && (paramAnimation.hasStarted()) && (!paramAnimation.hasEnded()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void b(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    if (this.Sd)
      c(paramInt, paramAnimationListener);
    while (true)
    {
      return;
      this.mFrom = paramInt;
      this.Sx.reset();
      this.Sx.setDuration(200L);
      this.Sx.setInterpolator(this.Sf);
      if (paramAnimationListener != null)
        this.Sg.OW = paramAnimationListener;
      this.Sg.clearAnimation();
      this.Sg.startAnimation(this.Sx);
    }
  }

  private void c(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    this.mFrom = paramInt;
    this.Si = this.Sg.getScaleX();
    this.Sq = new SwipeRefreshLayout.8(this);
    this.Sq.setDuration(150L);
    if (paramAnimationListener != null)
      this.Sg.OW = paramAnimationListener;
    this.Sg.clearAnimation();
    this.Sg.startAnimation(this.Sq);
  }

  private void eS()
  {
    this.So = C(this.Sl.getAlpha(), 76);
  }

  private void eT()
  {
    this.Sp = C(this.Sl.getAlpha(), 255);
  }

  private void eU()
  {
    if (this.Ov == null);
    for (int i = 0; ; i++)
      if (i < getChildCount())
      {
        View localView = getChildAt(i);
        if (!localView.equals(this.Sg))
          this.Ov = localView;
      }
      else
      {
        return;
      }
  }

  private boolean eV()
  {
    boolean bool;
    if (this.Su != null)
      bool = this.Su.eW();
    while (true)
    {
      return bool;
      if ((this.Ov instanceof ListView))
      {
        ListView localListView = (ListView)this.Ov;
        if (Build.VERSION.SDK_INT >= 19)
        {
          bool = localListView.canScrollList(-1);
        }
        else if (localListView.getChildCount() != 0)
        {
          int i = localListView.getFirstVisiblePosition();
          int j = localListView.getChildAt(0).getTop();
          if ((i > 0) || (j < localListView.getListPaddingTop()))
            bool = true;
        }
        else
        {
          bool = false;
        }
      }
      else
      {
        bool = this.Ov.canScrollVertically(-1);
      }
    }
  }

  private void f(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.RT != paramBoolean1)
    {
      this.Sr = paramBoolean2;
      eU();
      this.RT = paramBoolean1;
      if (!this.RT)
        break label42;
      a(this.Sb, this.Sv);
    }
    while (true)
    {
      return;
      label42: a(this.Sv);
    }
  }

  private void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.mActivePointerId)
      if (i != 0)
        break label33;
    label33: for (i = 1; ; i = 0)
    {
      this.mActivePointerId = paramMotionEvent.getPointerId(i);
      return;
    }
  }

  private void setColorViewAlpha(int paramInt)
  {
    this.Sg.getBackground().setAlpha(paramInt);
    this.Sl.setAlpha(paramInt);
  }

  final void L(float paramFloat)
  {
    setTargetOffsetTopAndBottom(this.mFrom + (int)((this.Sj - this.mFrom) * paramFloat) - this.Sg.getTop());
  }

  final void a(Animation.AnimationListener paramAnimationListener)
  {
    this.Sn = new SwipeRefreshLayout.3(this);
    this.Sn.setDuration(150L);
    this.Sg.OW = paramAnimationListener;
    this.Sg.clearAnimation();
    this.Sg.startAnimation(this.Sn);
  }

  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.RW.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }

  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.RW.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }

  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.RW.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }

  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.RW.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.Sh < 0)
      paramInt1 = paramInt2;
    while (true)
    {
      return paramInt1;
      if (paramInt2 == paramInt1 - 1)
      {
        paramInt1 = this.Sh;
      }
      else
      {
        paramInt1 = paramInt2;
        if (paramInt2 >= this.Sh)
          paramInt1 = paramInt2 + 1;
      }
    }
  }

  public int getNestedScrollAxes()
  {
    return this.pF.Ms;
  }

  public int getProgressCircleDiameter()
  {
    return this.Ss;
  }

  public int getProgressViewEndOffset()
  {
    return this.Sk;
  }

  public int getProgressViewStartOffset()
  {
    return this.Sj;
  }

  public boolean hasNestedScrollingParent()
  {
    return this.RW.aI(0);
  }

  public boolean isNestedScrollingEnabled()
  {
    return this.RW.Mp;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    reset();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    eU();
    int i = paramMotionEvent.getActionMasked();
    if ((this.Se) && (i == 0))
      this.Se = false;
    boolean bool2 = bool1;
    if (isEnabled())
    {
      bool2 = bool1;
      if (!this.Se)
      {
        bool2 = bool1;
        if (!eV())
        {
          bool2 = bool1;
          if (!this.RT)
          {
            if (!this.RZ)
              break label80;
            bool2 = bool1;
          }
        }
      }
    }
    return bool2;
    label80: switch (i)
    {
    case 4:
    case 5:
    default:
    case 0:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    while (true)
    {
      bool2 = this.mIsBeingDragged;
      break;
      setTargetOffsetTopAndBottom(this.Sj - this.Sg.getTop());
      this.mActivePointerId = paramMotionEvent.getPointerId(0);
      this.mIsBeingDragged = false;
      i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
      bool2 = bool1;
      if (i < 0)
        break;
      this.Sc = paramMotionEvent.getY(i);
      continue;
      bool2 = bool1;
      if (this.mActivePointerId == -1)
        break;
      i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
      bool2 = bool1;
      if (i < 0)
        break;
      K(paramMotionEvent.getY(i));
      continue;
      onSecondaryPointerUp(paramMotionEvent);
      continue;
      this.mIsBeingDragged = false;
      this.mActivePointerId = -1;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getMeasuredWidth();
    paramInt3 = getMeasuredHeight();
    if (getChildCount() == 0);
    while (true)
    {
      return;
      if (this.Ov == null)
        eU();
      if (this.Ov != null)
      {
        View localView = this.Ov;
        paramInt2 = getPaddingLeft();
        paramInt4 = getPaddingTop();
        localView.layout(paramInt2, paramInt4, paramInt1 - getPaddingLeft() - getPaddingRight() + paramInt2, paramInt3 - getPaddingTop() - getPaddingBottom() + paramInt4);
        paramInt2 = this.Sg.getMeasuredWidth();
        paramInt3 = this.Sg.getMeasuredHeight();
        this.Sg.layout(paramInt1 / 2 - paramInt2 / 2, this.Sb, paramInt1 / 2 + paramInt2 / 2, this.Sb + paramInt3);
      }
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.Ov == null)
      eU();
    if (this.Ov == null);
    label138: 
    while (true)
    {
      return;
      this.Ov.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
      this.Sg.measure(View.MeasureSpec.makeMeasureSpec(this.Ss, 1073741824), View.MeasureSpec.makeMeasureSpec(this.Ss, 1073741824));
      this.Sh = -1;
      for (paramInt1 = 0; ; paramInt1++)
      {
        if (paramInt1 >= getChildCount())
          break label138;
        if (getChildAt(paramInt1) == this.Sg)
        {
          this.Sh = paramInt1;
          break;
        }
      }
    }
  }

  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }

  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }

  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((paramInt2 > 0) && (this.RV > 0.0F))
    {
      if (paramInt2 <= this.RV)
        break label141;
      paramArrayOfInt[1] = (paramInt2 - (int)this.RV);
      this.RV = 0.0F;
    }
    while (true)
    {
      I(this.RV);
      if ((this.St) && (paramInt2 > 0) && (this.RV == 0.0F) && (Math.abs(paramInt2 - paramArrayOfInt[1]) > 0))
        this.Sg.setVisibility(8);
      paramView = this.RX;
      if (dispatchNestedPreScroll(paramInt1 - paramArrayOfInt[0], paramInt2 - paramArrayOfInt[1], paramView, null))
      {
        paramArrayOfInt[0] += paramView[0];
        paramInt1 = paramArrayOfInt[1];
        paramView[1] += paramInt1;
      }
      return;
      label141: this.RV -= paramInt2;
      paramArrayOfInt[1] = paramInt2;
    }
  }

  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.RY);
    paramInt1 = this.RY[1] + paramInt4;
    if ((paramInt1 < 0) && (!eV()))
    {
      float f = this.RV;
      this.RV = (Math.abs(paramInt1) + f);
      I(this.RV);
    }
  }

  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.pF.Ms = paramInt;
    startNestedScroll(paramInt & 0x2);
    this.RV = 0.0F;
    this.RZ = true;
  }

  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if ((isEnabled()) && (!this.Se) && (!this.RT) && ((paramInt & 0x2) != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void onStopNestedScroll(View paramView)
  {
    this.pF.Ms = 0;
    this.RZ = false;
    if (this.RV > 0.0F)
    {
      J(this.RV);
      this.RV = 0.0F;
    }
    stopNestedScroll();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i = paramMotionEvent.getActionMasked();
    if ((this.Se) && (i == 0))
      this.Se = false;
    boolean bool2 = bool1;
    if (isEnabled())
    {
      bool2 = bool1;
      if (!this.Se)
      {
        bool2 = bool1;
        if (!eV())
        {
          bool2 = bool1;
          if (!this.RT)
          {
            if (!this.RZ)
              break label76;
            bool2 = bool1;
          }
        }
      }
    }
    while (true)
    {
      return bool2;
      label76: bool2 = bool1;
      float f1;
      switch (i)
      {
      case 3:
      case 4:
      default:
      case 0:
      case 2:
      case 5:
      case 6:
        while (true)
        {
          bool2 = true;
          break;
          this.mActivePointerId = paramMotionEvent.getPointerId(0);
          this.mIsBeingDragged = false;
          continue;
          i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
          bool2 = bool1;
          if (i < 0)
            break;
          f1 = paramMotionEvent.getY(i);
          K(f1);
          if (this.mIsBeingDragged)
          {
            f1 = (f1 - this.mInitialMotionY) * 0.5F;
            bool2 = bool1;
            if (f1 <= 0.0F)
              break;
            I(f1);
            continue;
            i = paramMotionEvent.getActionIndex();
            bool2 = bool1;
            if (i < 0)
              break;
            this.mActivePointerId = paramMotionEvent.getPointerId(i);
            continue;
            onSecondaryPointerUp(paramMotionEvent);
          }
        }
      case 1:
      }
      i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
      bool2 = bool1;
      if (i >= 0)
      {
        if (this.mIsBeingDragged)
        {
          float f2 = paramMotionEvent.getY(i);
          f1 = this.mInitialMotionY;
          this.mIsBeingDragged = false;
          J((f2 - f1) * 0.5F);
        }
        this.mActivePointerId = -1;
        bool2 = bool1;
      }
    }
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (((Build.VERSION.SDK_INT >= 21) || (!(this.Ov instanceof AbsListView))) && ((this.Ov == null) || (s.aq(this.Ov))))
      super.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  final void reset()
  {
    this.Sg.clearAnimation();
    this.Sl.stop();
    this.Sg.setVisibility(8);
    setColorViewAlpha(255);
    if (this.Sd)
      setAnimationProgress(0.0F);
    while (true)
    {
      this.Sb = this.Sg.getTop();
      return;
      setTargetOffsetTopAndBottom(this.Sj - this.Sb);
    }
  }

  void setAnimationProgress(float paramFloat)
  {
    this.Sg.setScaleX(paramFloat);
    this.Sg.setScaleY(paramFloat);
  }

  @Deprecated
  public void setColorScheme(int[] paramArrayOfInt)
  {
    setColorSchemeResources(paramArrayOfInt);
  }

  public void setColorSchemeColors(int[] paramArrayOfInt)
  {
    eU();
    d locald = this.Sl;
    locald.Pd.setColors(paramArrayOfInt);
    locald.Pd.aR(0);
    locald.invalidateSelf();
  }

  public void setColorSchemeResources(int[] paramArrayOfInt)
  {
    Context localContext = getContext();
    int[] arrayOfInt = new int[paramArrayOfInt.length];
    for (int i = 0; i < paramArrayOfInt.length; i++)
      arrayOfInt[i] = b.i(localContext, paramArrayOfInt[i]);
    setColorSchemeColors(arrayOfInt);
  }

  public void setDistanceToTriggerSync(int paramInt)
  {
    this.RU = paramInt;
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (!paramBoolean)
      reset();
  }

  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.RW.setNestedScrollingEnabled(paramBoolean);
  }

  public void setOnChildScrollUpCallback(SwipeRefreshLayout.a parama)
  {
    this.Su = parama;
  }

  public void setOnRefreshListener(SwipeRefreshLayout.b paramb)
  {
    this.RS = paramb;
  }

  @Deprecated
  public void setProgressBackgroundColor(int paramInt)
  {
    setProgressBackgroundColorSchemeResource(paramInt);
  }

  public void setProgressBackgroundColorSchemeColor(int paramInt)
  {
    this.Sg.setBackgroundColor(paramInt);
  }

  public void setProgressBackgroundColorSchemeResource(int paramInt)
  {
    setProgressBackgroundColorSchemeColor(b.i(getContext(), paramInt));
  }

  public void setRefreshing(boolean paramBoolean)
  {
    int i;
    if ((paramBoolean) && (this.RT != paramBoolean))
    {
      this.RT = paramBoolean;
      if (!this.St)
      {
        i = this.Sk + this.Sj;
        setTargetOffsetTopAndBottom(i - this.Sb);
        this.Sr = false;
        Animation.AnimationListener localAnimationListener = this.Sv;
        this.Sg.setVisibility(0);
        this.Sl.setAlpha(255);
        this.Sm = new SwipeRefreshLayout.2(this);
        this.Sm.setDuration(this.Sa);
        if (localAnimationListener != null)
          this.Sg.OW = localAnimationListener;
        this.Sg.clearAnimation();
        this.Sg.startAnimation(this.Sm);
      }
    }
    while (true)
    {
      return;
      i = this.Sk;
      break;
      f(paramBoolean, false);
    }
  }

  public void setSize(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
      return;
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    if (paramInt == 0);
    for (this.Ss = ((int)(localDisplayMetrics.density * 56.0F)); ; this.Ss = ((int)(localDisplayMetrics.density * 40.0F)))
    {
      this.Sg.setImageDrawable(null);
      this.Sl.aQ(paramInt);
      this.Sg.setImageDrawable(this.Sl);
      break;
    }
  }

  void setTargetOffsetTopAndBottom(int paramInt)
  {
    this.Sg.bringToFront();
    s.q(this.Sg, paramInt);
    this.Sb = this.Sg.getTop();
  }

  public boolean startNestedScroll(int paramInt)
  {
    return this.RW.w(paramInt, 0);
  }

  public void stopNestedScroll()
  {
    this.RW.aJ(0);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SwipeRefreshLayout
 * JD-Core Version:    0.6.2
 */