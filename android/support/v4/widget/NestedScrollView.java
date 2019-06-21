package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.j;
import android.support.v4.view.k;
import android.support.v4.view.l;
import android.support.v4.view.n;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.List;

public class NestedScrollView extends FrameLayout
  implements j, l
{
  private static final a Ri = new a();
  private static final int[] Rj = { 16843130 };
  private long QV;
  private EdgeEffect QW;
  private EdgeEffect QX;
  private boolean QY = true;
  private boolean QZ = false;
  private View Ra = null;
  private boolean Rb;
  private boolean Rc = true;
  private final int[] Rd = new int[2];
  private final int[] Re = new int[2];
  private int Rf;
  private int Rg;
  private SavedState Rh;
  private final n Rk;
  private final k Rl;
  private float Rm;
  private b Rn;
  private int mActivePointerId = -1;
  private boolean mIsBeingDragged = false;
  private int mMaximumVelocity;
  private int mMinimumVelocity;
  private final Rect mTempRect = new Rect();
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  private OverScroller qN = new OverScroller(getContext());
  private int qO;

  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.mTouchSlop = localViewConfiguration.getScaledTouchSlop();
    this.mMinimumVelocity = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.mMaximumVelocity = localViewConfiguration.getScaledMaximumFlingVelocity();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Rj, paramInt, 0);
    setFillViewport(paramContext.getBoolean(0, false));
    paramContext.recycle();
    this.Rk = new n(this);
    this.Rl = new k(this);
    setNestedScrollingEnabled(true);
    s.a(this, Ri);
  }

  private View a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = getFocusables(2);
    Object localObject = null;
    int i = localArrayList.size();
    int j = 0;
    int k = 0;
    View localView;
    int m;
    int n;
    int i1;
    if (j < i)
    {
      localView = (View)localArrayList.get(j);
      m = localView.getTop();
      n = localView.getBottom();
      if ((paramInt1 >= n) || (m >= paramInt2))
        break label201;
      if ((paramInt1 < m) && (n < paramInt2))
      {
        i1 = 1;
        label87: if (localObject != null)
          break label112;
        k = i1;
        localObject = localView;
      }
    }
    label171: label201: 
    while (true)
    {
      j++;
      break;
      i1 = 0;
      break label87;
      label112: if (((paramBoolean) && (m < localObject.getTop())) || ((!paramBoolean) && (n > localObject.getBottom())));
      for (n = 1; ; n = 0)
      {
        if (k == 0)
          break label171;
        if ((i1 == 0) || (n == 0))
          break label201;
        localObject = localView;
        break;
      }
      if (i1 != 0)
      {
        k = 1;
        localObject = localView;
      }
      else if (n != 0)
      {
        localObject = localView;
        continue;
        return localObject;
      }
    }
  }

  private boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    return this.Rl.a(0, paramInt1, 0, paramInt2, paramArrayOfInt, paramInt3);
  }

  private boolean a(int paramInt1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt2)
  {
    return this.Rl.a(0, paramInt1, paramArrayOfInt1, paramArrayOfInt2, paramInt2);
  }

  private boolean aI(int paramInt)
  {
    return this.Rl.aI(paramInt);
  }

  private void aJ(int paramInt)
  {
    this.Rl.aJ(paramInt);
  }

  private boolean aK(View paramView)
  {
    boolean bool = false;
    if (!g(paramView, 0, getHeight()))
      bool = true;
    return bool;
  }

  private void aL(View paramView)
  {
    paramView.getDrawingRect(this.mTempRect);
    offsetDescendantRectToMyCoords(paramView, this.mTempRect);
    int i = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
    if (i != 0)
      scrollBy(0, i);
  }

  private boolean aU(int paramInt)
  {
    return this.Rl.w(2, paramInt);
  }

  private void aV(int paramInt)
  {
    if (paramInt != 0)
    {
      if (!this.Rc)
        break label18;
      smoothScrollBy(0, paramInt);
    }
    while (true)
    {
      return;
      label18: scrollBy(0, paramInt);
    }
  }

  private void aX(int paramInt)
  {
    int i = getScrollY();
    if (((i > 0) || (paramInt > 0)) && ((i < getScrollRange()) || (paramInt < 0)));
    for (boolean bool = true; ; bool = false)
    {
      if (!dispatchNestedPreFling(0.0F, paramInt))
      {
        dispatchNestedFling(0.0F, paramInt, bool);
        fling(paramInt);
      }
      return;
    }
  }

  private boolean arrowScroll(int paramInt)
  {
    View localView1 = findFocus();
    View localView2 = localView1;
    if (localView1 == this)
      localView2 = null;
    localView1 = FocusFinder.getInstance().findNextFocus(this, localView2, paramInt);
    int i = getMaxScrollAmount();
    boolean bool;
    if ((localView1 != null) && (g(localView1, i, getHeight())))
    {
      localView1.getDrawingRect(this.mTempRect);
      offsetDescendantRectToMyCoords(localView1, this.mTempRect);
      aV(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
      localView1.requestFocus(paramInt);
      if ((localView2 != null) && (localView2.isFocused()) && (aK(localView2)))
      {
        paramInt = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(paramInt);
      }
      bool = true;
      return bool;
    }
    int j;
    if ((paramInt == 33) && (getScrollY() < i))
      j = getScrollY();
    while (true)
    {
      if (j != 0)
        break label234;
      bool = false;
      break;
      j = i;
      if (paramInt == 130)
      {
        j = i;
        if (getChildCount() > 0)
        {
          int k = getChildAt(0).getBottom();
          int m = getScrollY() + getHeight() - getPaddingBottom();
          j = i;
          if (k - m < i)
            j = k - m;
        }
      }
    }
    label234: if (paramInt == 130);
    while (true)
    {
      aV(j);
      break;
      j = -j;
    }
  }

  private static boolean b(View paramView1, View paramView2)
  {
    boolean bool;
    if (paramView1 == paramView2)
      bool = true;
    while (true)
    {
      return bool;
      paramView1 = paramView1.getParent();
      if (((paramView1 instanceof ViewGroup)) && (b((View)paramView1, paramView2)))
        bool = true;
      else
        bool = false;
    }
  }

  private static int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if ((paramInt2 >= paramInt3) || (paramInt1 < 0))
      i = 0;
    while (true)
    {
      return i;
      i = paramInt1;
      if (paramInt2 + paramInt1 > paramInt3)
        i = paramInt3 - paramInt2;
    }
  }

  private int computeScrollDeltaToGetChildRectOnScreen(Rect paramRect)
  {
    int i = 0;
    if (getChildCount() == 0)
      return i;
    int j = getHeight();
    i = getScrollY();
    int k = i + j;
    int m = getVerticalFadingEdgeLength();
    int n = i;
    if (paramRect.top > 0)
      n = i + m;
    i = k;
    if (paramRect.bottom < getChildAt(0).getHeight())
      i = k - m;
    if ((paramRect.bottom > i) && (paramRect.top > n))
      if (paramRect.height() > j)
      {
        n = paramRect.top - n + 0;
        label108: i = Math.min(n, getChildAt(0).getBottom() - i);
      }
    while (true)
    {
      break;
      n = paramRect.bottom - i + 0;
      break label108;
      if ((paramRect.top < n) && (paramRect.bottom < i))
      {
        if (paramRect.height() > j);
        for (i = 0 - (i - paramRect.bottom); ; i = 0 - (n - paramRect.top))
        {
          i = Math.max(i, -getScrollY());
          break;
        }
      }
      i = 0;
    }
  }

  private void eM()
  {
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
  }

  private void eN()
  {
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }

  private void eO()
  {
    Context localContext;
    if (getOverScrollMode() != 2)
      if (this.QW == null)
      {
        localContext = getContext();
        this.QW = new EdgeEffect(localContext);
      }
    for (this.QX = new EdgeEffect(localContext); ; this.QX = null)
    {
      return;
      this.QW = null;
    }
  }

  private void endDrag()
  {
    this.mIsBeingDragged = false;
    eN();
    aJ(0);
    if (this.QW != null)
    {
      this.QW.onRelease();
      this.QX.onRelease();
    }
  }

  private boolean er()
  {
    boolean bool1 = false;
    View localView = getChildAt(0);
    boolean bool2 = bool1;
    if (localView != null)
    {
      int i = localView.getHeight();
      bool2 = bool1;
      if (getHeight() < i + getPaddingTop() + getPaddingBottom())
        bool2 = true;
    }
    return bool2;
  }

  private boolean fullScroll(int paramInt)
  {
    if (paramInt == 130);
    for (int i = 1; ; i = 0)
    {
      int j = getHeight();
      this.mTempRect.top = 0;
      this.mTempRect.bottom = j;
      if (i != 0)
      {
        i = getChildCount();
        if (i > 0)
        {
          View localView = getChildAt(i - 1);
          this.mTempRect.bottom = (localView.getBottom() + getPaddingBottom());
          this.mTempRect.top = (this.mTempRect.bottom - j);
        }
      }
      return g(paramInt, this.mTempRect.top, this.mTempRect.bottom);
    }
  }

  private boolean g(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = false;
    int i = getHeight();
    int j = getScrollY();
    i = j + i;
    if (paramInt1 == 33);
    for (boolean bool2 = true; ; bool2 = false)
    {
      View localView = a(bool2, paramInt2, paramInt3);
      Object localObject = localView;
      if (localView == null)
        localObject = this;
      if ((paramInt2 < j) || (paramInt3 > i))
        break;
      bool2 = bool1;
      if (localObject != findFocus())
        ((View)localObject).requestFocus(paramInt1);
      return bool2;
    }
    if (bool2)
      paramInt2 -= j;
    while (true)
    {
      aV(paramInt2);
      bool2 = true;
      break;
      paramInt2 = paramInt3 - i;
    }
  }

  private boolean g(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = false;
    getOverScrollMode();
    computeHorizontalScrollRange();
    computeHorizontalScrollExtent();
    computeVerticalScrollRange();
    computeVerticalScrollExtent();
    int i = paramInt2 + 0;
    paramInt2 = paramInt3 + paramInt1;
    paramInt3 = paramInt4 + 0;
    boolean bool2;
    if (i > 0)
    {
      paramInt1 = 0;
      bool2 = true;
    }
    while (true)
    {
      boolean bool3;
      if (paramInt2 > paramInt3)
      {
        bool3 = true;
        paramInt2 = paramInt3;
      }
      while (true)
      {
        if ((bool3) && (!aI(1)))
          this.qN.springBack(paramInt1, paramInt2, 0, 0, 0, getScrollRange());
        onOverScrolled(paramInt1, paramInt2, bool2, bool3);
        if (!bool2)
        {
          bool2 = bool1;
          if (!bool3);
        }
        else
        {
          bool2 = true;
        }
        return bool2;
        if (i >= 0)
          break label153;
        paramInt1 = 0;
        bool2 = true;
        break;
        if (paramInt2 < 0)
        {
          bool3 = true;
          paramInt2 = 0;
        }
        else
        {
          bool3 = false;
        }
      }
      label153: bool2 = false;
      paramInt1 = i;
    }
  }

  private boolean g(View paramView, int paramInt1, int paramInt2)
  {
    paramView.getDrawingRect(this.mTempRect);
    offsetDescendantRectToMyCoords(paramView, this.mTempRect);
    if ((this.mTempRect.bottom + paramInt1 >= getScrollY()) && (this.mTempRect.top - paramInt1 <= getScrollY() + paramInt2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private float getVerticalScrollFactorCompat()
  {
    if (this.Rm == 0.0F)
    {
      TypedValue localTypedValue = new TypedValue();
      Context localContext = getContext();
      if (!localContext.getTheme().resolveAttribute(16842829, localTypedValue, true))
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      this.Rm = localTypedValue.getDimension(localContext.getResources().getDisplayMetrics());
    }
    return this.Rm;
  }

  private void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.mActivePointerId)
      if (i != 0)
        break label57;
    label57: for (i = 1; ; i = 0)
    {
      this.qO = ((int)paramMotionEvent.getY(i));
      this.mActivePointerId = paramMotionEvent.getPointerId(i);
      if (this.mVelocityTracker != null)
        this.mVelocityTracker.clear();
      return;
    }
  }

  private boolean pageScroll(int paramInt)
  {
    int i;
    int j;
    if (paramInt == 130)
    {
      i = 1;
      j = getHeight();
      if (i == 0)
        break label121;
      this.mTempRect.top = (getScrollY() + j);
      i = getChildCount();
      if (i > 0)
      {
        View localView = getChildAt(i - 1);
        if (this.mTempRect.top + j > localView.getBottom())
          this.mTempRect.top = (localView.getBottom() - j);
      }
    }
    while (true)
    {
      this.mTempRect.bottom = (this.mTempRect.top + j);
      return g(paramInt, this.mTempRect.top, this.mTempRect.bottom);
      i = 0;
      break;
      label121: this.mTempRect.top = (getScrollY() - j);
      if (this.mTempRect.top < 0)
        this.mTempRect.top = 0;
    }
  }

  private void smoothScrollBy(int paramInt1, int paramInt2)
  {
    if (getChildCount() == 0)
      return;
    if (AnimationUtils.currentAnimationTimeMillis() - this.QV > 250L)
    {
      int i = getHeight();
      paramInt1 = getPaddingBottom();
      int j = getPaddingTop();
      i = Math.max(0, getChildAt(0).getHeight() - (i - paramInt1 - j));
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt1 + paramInt2, i));
      this.qN.startScroll(getScrollX(), paramInt1, 0, paramInt2 - paramInt1);
      s.R(this);
    }
    while (true)
    {
      this.QV = AnimationUtils.currentAnimationTimeMillis();
      break;
      if (!this.qN.isFinished())
        this.qN.abortAnimation();
      scrollBy(paramInt1, paramInt2);
    }
  }

  public final void aW(int paramInt)
  {
    smoothScrollBy(0 - getScrollX(), paramInt - getScrollY());
  }

  public void addView(View paramView)
  {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child");
    super.addView(paramView);
  }

  public void addView(View paramView, int paramInt)
  {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child");
    super.addView(paramView, paramInt);
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child");
    super.addView(paramView, paramInt, paramLayoutParams);
  }

  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child");
    super.addView(paramView, paramLayoutParams);
  }

  public int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }

  public int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }

  public int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }

  public void computeScroll()
  {
    int i = 0;
    int j;
    int k;
    int n;
    if (this.qN.computeScrollOffset())
    {
      this.qN.getCurrX();
      j = this.qN.getCurrY();
      k = j - this.Rg;
      int m = k;
      if (a(k, this.Re, null, 1))
        m = k - this.Re[1];
      if (m != 0)
      {
        n = getScrollRange();
        k = getScrollY();
        g(m, getScrollX(), k, n);
        int i1 = getScrollY() - k;
        if (!a(i1, m - i1, null, 1))
        {
          i1 = getOverScrollMode();
          if (i1 != 0)
          {
            m = i;
            if (i1 == 1)
            {
              m = i;
              if (n <= 0);
            }
          }
          else
          {
            m = 1;
          }
          if (m != 0)
          {
            eO();
            if ((j > 0) || (k <= 0))
              break label189;
            this.QW.onAbsorb((int)this.qN.getCurrVelocity());
          }
        }
      }
    }
    label189: label238: 
    while (true)
    {
      this.Rg = j;
      s.R(this);
      while (true)
      {
        return;
        if ((j < n) || (k >= n))
          break label238;
        this.QX.onAbsorb((int)this.qN.getCurrVelocity());
        break;
        if (aI(1))
          aJ(1);
        this.Rg = 0;
      }
    }
  }

  public int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }

  public int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }

  public int computeVerticalScrollRange()
  {
    int i = getChildCount();
    int j = getHeight() - getPaddingBottom() - getPaddingTop();
    if (i == 0);
    while (true)
    {
      return j;
      i = getChildAt(0).getBottom();
      int k = getScrollY();
      int m = Math.max(0, i - j);
      if (k < 0)
      {
        j = i - k;
      }
      else
      {
        j = i;
        if (k > m)
          j = i + (k - m);
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((super.dispatchKeyEvent(paramKeyEvent)) || (executeKeyEvent(paramKeyEvent)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.Rl.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }

  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.Rl.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }

  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.Rl.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }

  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.Rl.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }

  public void draw(Canvas paramCanvas)
  {
    int i = 0;
    super.draw(paramCanvas);
    int j;
    int k;
    int m;
    int n;
    int i1;
    if (this.QW != null)
    {
      j = getScrollY();
      if (!this.QW.isFinished())
      {
        k = paramCanvas.save();
        m = getWidth();
        n = getHeight();
        i1 = Math.min(0, j);
        if ((Build.VERSION.SDK_INT >= 21) && (!getClipToPadding()))
          break label383;
        m -= getPaddingLeft() + getPaddingRight();
      }
    }
    label383: for (int i2 = getPaddingLeft() + 0; ; i2 = 0)
    {
      int i3 = i1;
      int i4 = n;
      if (Build.VERSION.SDK_INT >= 21)
      {
        i3 = i1;
        i4 = n;
        if (getClipToPadding())
        {
          i4 = n - (getPaddingTop() + getPaddingBottom());
          i3 = i1 + getPaddingTop();
        }
      }
      paramCanvas.translate(i2, i3);
      this.QW.setSize(m, i4);
      if (this.QW.draw(paramCanvas))
        s.R(this);
      paramCanvas.restoreToCount(k);
      if (!this.QX.isFinished())
      {
        k = paramCanvas.save();
        i4 = getWidth();
        i1 = getHeight();
        n = Math.max(getScrollRange(), j) + i1;
        if (Build.VERSION.SDK_INT >= 21)
        {
          i2 = i4;
          m = i;
          if (!getClipToPadding());
        }
        else
        {
          i2 = i4 - (getPaddingLeft() + getPaddingRight());
          m = getPaddingLeft() + 0;
        }
        i3 = n;
        i4 = i1;
        if (Build.VERSION.SDK_INT >= 21)
        {
          i3 = n;
          i4 = i1;
          if (getClipToPadding())
          {
            i4 = i1 - (getPaddingTop() + getPaddingBottom());
            i3 = n - getPaddingBottom();
          }
        }
        paramCanvas.translate(m - i2, i3);
        paramCanvas.rotate(180.0F, i2, 0.0F);
        this.QX.setSize(i2, i4);
        if (this.QX.draw(paramCanvas))
          s.R(this);
        paramCanvas.restoreToCount(k);
      }
      return;
    }
  }

  public final boolean executeKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = 33;
    boolean bool1 = false;
    this.mTempRect.setEmpty();
    boolean bool2;
    if (!er())
    {
      bool2 = bool1;
      if (isFocused())
      {
        bool2 = bool1;
        if (paramKeyEvent.getKeyCode() != 4)
        {
          View localView = findFocus();
          paramKeyEvent = localView;
          if (localView == this)
            paramKeyEvent = null;
          paramKeyEvent = FocusFinder.getInstance().findNextFocus(this, paramKeyEvent, 130);
          bool2 = bool1;
          if (paramKeyEvent != null)
          {
            bool2 = bool1;
            if (paramKeyEvent != this)
            {
              bool2 = bool1;
              if (paramKeyEvent.requestFocus(130))
                bool2 = true;
            }
          }
        }
      }
      return bool2;
    }
    if (paramKeyEvent.getAction() == 0);
    switch (paramKeyEvent.getKeyCode())
    {
    default:
      bool2 = false;
    case 19:
    case 20:
      while (true)
      {
        break;
        if (!paramKeyEvent.isAltPressed())
        {
          bool2 = arrowScroll(33);
        }
        else
        {
          bool2 = fullScroll(33);
          continue;
          if (!paramKeyEvent.isAltPressed())
            bool2 = arrowScroll(130);
          else
            bool2 = fullScroll(130);
        }
      }
    case 62:
    }
    if (paramKeyEvent.isShiftPressed());
    while (true)
    {
      pageScroll(i);
      break;
      i = 130;
    }
  }

  public void fling(int paramInt)
  {
    if (getChildCount() > 0)
    {
      aU(1);
      this.qN.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, -2147483648, 2147483647, 0, 0);
      this.Rg = getScrollY();
      s.R(this);
    }
  }

  protected float getBottomFadingEdgeStrength()
  {
    float f;
    if (getChildCount() == 0)
      f = 0.0F;
    while (true)
    {
      return f;
      int i = getVerticalFadingEdgeLength();
      int j = getHeight();
      int k = getPaddingBottom();
      k = getChildAt(0).getBottom() - getScrollY() - (j - k);
      if (k < i)
        f = k / i;
      else
        f = 1.0F;
    }
  }

  public int getMaxScrollAmount()
  {
    return (int)(0.5F * getHeight());
  }

  public int getNestedScrollAxes()
  {
    return this.Rk.Ms;
  }

  int getScrollRange()
  {
    int i = 0;
    if (getChildCount() > 0)
      i = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
    return i;
  }

  protected float getTopFadingEdgeStrength()
  {
    float f;
    if (getChildCount() == 0)
      f = 0.0F;
    while (true)
    {
      return f;
      int i = getVerticalFadingEdgeLength();
      int j = getScrollY();
      if (j < i)
        f = j / i;
      else
        f = 1.0F;
    }
  }

  public boolean hasNestedScrollingParent()
  {
    return this.Rl.aI(0);
  }

  public boolean isNestedScrollingEnabled()
  {
    return this.Rl.Mp;
  }

  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }

  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramInt1 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width);
    paramInt2 = localMarginLayoutParams.topMargin;
    paramView.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(localMarginLayoutParams.bottomMargin + paramInt2, 0));
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.QZ = false;
  }

  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramMotionEvent.getSource() & 0x2) != 0)
      switch (paramMotionEvent.getAction())
      {
      default:
        bool2 = bool1;
      case 8:
      }
    float f;
    do
    {
      do
      {
        return bool2;
        bool2 = bool1;
      }
      while (this.mIsBeingDragged);
      f = paramMotionEvent.getAxisValue(9);
      bool2 = bool1;
    }
    while (f == 0.0F);
    int i = (int)(f * getVerticalScrollFactorCompat());
    int j = getScrollRange();
    int k = getScrollY();
    int m = k - i;
    if (m < 0)
      i = 0;
    while (true)
    {
      bool2 = bool1;
      if (i == k)
        break;
      super.scrollTo(getScrollX(), i);
      bool2 = true;
      break;
      i = j;
      if (m <= j)
        i = m;
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    int i = paramMotionEvent.getAction();
    if ((i == 2) && (this.mIsBeingDragged))
      return bool2;
    switch (i & 0xFF)
    {
    case 4:
    case 5:
    default:
    case 2:
    case 0:
    case 1:
    case 3:
    case 6:
    }
    while (true)
    {
      bool2 = this.mIsBeingDragged;
      break;
      i = this.mActivePointerId;
      if (i != -1)
      {
        int j = paramMotionEvent.findPointerIndex(i);
        if (j == -1)
        {
          new StringBuilder("Invalid pointerId=").append(i).append(" in onInterceptTouchEvent");
        }
        else
        {
          i = (int)paramMotionEvent.getY(j);
          if ((Math.abs(i - this.qO) > this.mTouchSlop) && ((getNestedScrollAxes() & 0x2) == 0))
          {
            this.mIsBeingDragged = true;
            this.qO = i;
            eM();
            this.mVelocityTracker.addMovement(paramMotionEvent);
            this.Rf = 0;
            paramMotionEvent = getParent();
            if (paramMotionEvent != null)
            {
              paramMotionEvent.requestDisallowInterceptTouchEvent(true);
              continue;
              j = (int)paramMotionEvent.getY();
              i = (int)paramMotionEvent.getX();
              if (getChildCount() > 0)
              {
                int k = getScrollY();
                View localView = getChildAt(0);
                if ((j >= localView.getTop() - k) && (j < localView.getBottom() - k) && (i >= localView.getLeft()) && (i < localView.getRight()))
                  i = 1;
              }
              while (true)
              {
                if (i != 0)
                  break label325;
                this.mIsBeingDragged = false;
                eN();
                break;
                i = 0;
                continue;
                i = 0;
              }
              label325: this.qO = j;
              this.mActivePointerId = paramMotionEvent.getPointerId(0);
              if (this.mVelocityTracker == null)
              {
                this.mVelocityTracker = VelocityTracker.obtain();
                label354: this.mVelocityTracker.addMovement(paramMotionEvent);
                this.qN.computeScrollOffset();
                if (this.qN.isFinished())
                  break label406;
              }
              label406: for (bool2 = bool1; ; bool2 = false)
              {
                this.mIsBeingDragged = bool2;
                aU(0);
                break;
                this.mVelocityTracker.clear();
                break label354;
              }
              this.mIsBeingDragged = false;
              this.mActivePointerId = -1;
              eN();
              if (this.qN.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
                s.R(this);
              aJ(0);
              continue;
              onSecondaryPointerUp(paramMotionEvent);
            }
          }
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.QY = false;
    if ((this.Ra != null) && (b(this.Ra, this)))
      aL(this.Ra);
    this.Ra = null;
    if (!this.QZ)
    {
      if (this.Rh != null)
      {
        scrollTo(getScrollX(), this.Rh.Ro);
        this.Rh = null;
      }
      if (getChildCount() <= 0)
        break label153;
      paramInt1 = getChildAt(0).getMeasuredHeight();
      paramInt1 = Math.max(0, paramInt1 - (paramInt4 - paramInt2 - getPaddingBottom() - getPaddingTop()));
      if (getScrollY() <= paramInt1)
        break label158;
      scrollTo(getScrollX(), paramInt1);
    }
    while (true)
    {
      scrollTo(getScrollX(), getScrollY());
      this.QZ = true;
      return;
      label153: paramInt1 = 0;
      break;
      label158: if (getScrollY() < 0)
        scrollTo(getScrollX(), 0);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.Rb);
    while (true)
    {
      return;
      if ((View.MeasureSpec.getMode(paramInt2) != 0) && (getChildCount() > 0))
      {
        View localView = getChildAt(0);
        paramInt2 = getMeasuredHeight();
        if (localView.getMeasuredHeight() < paramInt2)
        {
          FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
          localView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(paramInt2 - getPaddingTop() - getPaddingBottom(), 1073741824));
        }
      }
    }
  }

  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
      aX((int)paramFloat2);
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }

  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt, null);
  }

  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getScrollY();
    scrollBy(0, paramInt4);
    paramInt1 = getScrollY() - paramInt1;
    dispatchNestedScroll(0, paramInt1, 0, paramInt4 - paramInt1, null);
  }

  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.Rk.Ms = paramInt;
    startNestedScroll(2);
  }

  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }

  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    boolean bool = false;
    int i;
    View localView;
    if (paramInt == 2)
    {
      i = 130;
      if (paramRect != null)
        break label50;
      localView = FocusFinder.getInstance().findNextFocus(this, null, i);
      label28: if (localView != null)
        break label65;
    }
    while (true)
    {
      return bool;
      i = paramInt;
      if (paramInt != 1)
        break;
      i = 33;
      break;
      label50: localView = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, i);
      break label28;
      label65: if (!aK(localView))
        bool = localView.requestFocus(i, paramRect);
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      paramParcelable = (SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      this.Rh = paramParcelable;
      requestLayout();
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.Ro = getScrollY();
    return localSavedState;
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.Rn != null)
      this.Rn.a(this);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if ((localView == null) || (this == localView));
    while (true)
    {
      return;
      if (g(localView, 0, paramInt4))
      {
        localView.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(localView, this.mTempRect);
        aV(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
      }
    }
  }

  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if ((paramInt & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void onStopNestedScroll(View paramView)
  {
    this.Rk.Ms = 0;
    stopNestedScroll();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    eM();
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.Rf = 0;
    localMotionEvent.offsetLocation(0.0F, this.Rf);
    switch (i)
    {
    case 4:
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    case 5:
    case 6:
    }
    while (true)
    {
      if (this.mVelocityTracker != null)
        this.mVelocityTracker.addMovement(localMotionEvent);
      localMotionEvent.recycle();
      bool = true;
      do
        return bool;
      while (getChildCount() == 0);
      if (!this.qN.isFinished());
      ViewParent localViewParent;
      for (bool = true; ; bool = false)
      {
        this.mIsBeingDragged = bool;
        if (bool)
        {
          localViewParent = getParent();
          if (localViewParent != null)
            localViewParent.requestDisallowInterceptTouchEvent(true);
        }
        if (!this.qN.isFinished())
          this.qN.abortAnimation();
        this.qO = ((int)paramMotionEvent.getY());
        this.mActivePointerId = paramMotionEvent.getPointerId(0);
        aU(0);
        break;
      }
      int j = paramMotionEvent.findPointerIndex(this.mActivePointerId);
      if (j == -1)
      {
        new StringBuilder("Invalid pointerId=").append(this.mActivePointerId).append(" in onTouchEvent");
      }
      else
      {
        int k = (int)paramMotionEvent.getY(j);
        i = this.qO - k;
        int m = i;
        if (a(i, this.Re, this.Rd, 0))
        {
          m = i - this.Re[1];
          localMotionEvent.offsetLocation(0.0F, this.Rd[1]);
          this.Rf += this.Rd[1];
        }
        i = m;
        if (!this.mIsBeingDragged)
        {
          i = m;
          if (Math.abs(m) > this.mTouchSlop)
          {
            localViewParent = getParent();
            if (localViewParent != null)
              localViewParent.requestDisallowInterceptTouchEvent(true);
            this.mIsBeingDragged = true;
            if (m <= 0)
              break label546;
            i = m - this.mTouchSlop;
          }
        }
        label385: if (this.mIsBeingDragged)
        {
          this.qO = (k - this.Rd[1]);
          int n = getScrollY();
          k = getScrollRange();
          m = getOverScrollMode();
          if ((m == 0) || ((m == 1) && (k > 0)));
          for (m = 1; ; m = 0)
          {
            if ((g(i, 0, getScrollY(), k)) && (!aI(0)))
              this.mVelocityTracker.clear();
            int i1 = getScrollY() - n;
            if (!a(i1, i - i1, this.Rd, 0))
              break label564;
            this.qO -= this.Rd[1];
            localMotionEvent.offsetLocation(0.0F, this.Rd[1]);
            this.Rf += this.Rd[1];
            break;
            label546: i = m + this.mTouchSlop;
            break label385;
          }
          label564: if (m != 0)
          {
            eO();
            m = n + i;
            if (m < 0)
            {
              i.a(this.QW, i / getHeight(), paramMotionEvent.getX(j) / getWidth());
              if (!this.QX.isFinished())
                this.QX.onRelease();
            }
            while ((this.QW != null) && ((!this.QW.isFinished()) || (!this.QX.isFinished())))
            {
              s.R(this);
              break;
              if (m > k)
              {
                i.a(this.QX, i / getHeight(), 1.0F - paramMotionEvent.getX(j) / getWidth());
                if (!this.QW.isFinished())
                  this.QW.onRelease();
              }
            }
            paramMotionEvent = this.mVelocityTracker;
            paramMotionEvent.computeCurrentVelocity(1000, this.mMaximumVelocity);
            i = (int)paramMotionEvent.getYVelocity(this.mActivePointerId);
            if (Math.abs(i) > this.mMinimumVelocity)
              aX(-i);
            while (true)
            {
              this.mActivePointerId = -1;
              endDrag();
              break;
              if (this.qN.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
                s.R(this);
            }
            if ((this.mIsBeingDragged) && (getChildCount() > 0) && (this.qN.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())))
              s.R(this);
            this.mActivePointerId = -1;
            endDrag();
            continue;
            i = paramMotionEvent.getActionIndex();
            this.qO = ((int)paramMotionEvent.getY(i));
            this.mActivePointerId = paramMotionEvent.getPointerId(i);
            continue;
            onSecondaryPointerUp(paramMotionEvent);
            this.qO = ((int)paramMotionEvent.getY(paramMotionEvent.findPointerIndex(this.mActivePointerId)));
          }
        }
      }
    }
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    if (!this.QY)
      aL(paramView2);
    while (true)
    {
      super.requestChildFocus(paramView1, paramView2);
      return;
      this.Ra = paramView2;
    }
  }

  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    int i = computeScrollDeltaToGetChildRectOnScreen(paramRect);
    boolean bool;
    if (i != 0)
    {
      bool = true;
      if (bool)
      {
        if (!paramBoolean)
          break label62;
        scrollBy(0, i);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      break;
      label62: smoothScrollBy(0, i);
    }
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean)
      eN();
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  public void requestLayout()
  {
    this.QY = true;
    super.requestLayout();
  }

  public void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      paramInt1 = clamp(paramInt1, getWidth() - getPaddingRight() - getPaddingLeft(), localView.getWidth());
      paramInt2 = clamp(paramInt2, getHeight() - getPaddingBottom() - getPaddingTop(), localView.getHeight());
      if ((paramInt1 != getScrollX()) || (paramInt2 != getScrollY()))
        super.scrollTo(paramInt1, paramInt2);
    }
  }

  public void setFillViewport(boolean paramBoolean)
  {
    if (paramBoolean != this.Rb)
    {
      this.Rb = paramBoolean;
      requestLayout();
    }
  }

  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.Rl.setNestedScrollingEnabled(paramBoolean);
  }

  public void setOnScrollChangeListener(b paramb)
  {
    this.Rn = paramb;
  }

  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    this.Rc = paramBoolean;
  }

  public boolean shouldDelayChildPressedState()
  {
    return true;
  }

  public boolean startNestedScroll(int paramInt)
  {
    return this.Rl.w(paramInt, 0);
  }

  public void stopNestedScroll()
  {
    this.Rl.aJ(0);
  }

  static class SavedState extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
    };
    public int Ro;

    SavedState(Parcel paramParcel)
    {
      super();
      this.Ro = paramParcel.readInt();
    }

    SavedState(Parcelable paramParcelable)
    {
      super();
    }

    public String toString()
    {
      return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.Ro + "}";
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.Ro);
    }
  }

  static final class a extends a
  {
    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramView = (NestedScrollView)paramView;
      paramAccessibilityEvent.setClassName(ScrollView.class.getName());
      if (paramView.getScrollRange() > 0);
      for (boolean bool = true; ; bool = false)
      {
        paramAccessibilityEvent.setScrollable(bool);
        paramAccessibilityEvent.setScrollX(paramView.getScrollX());
        paramAccessibilityEvent.setScrollY(paramView.getScrollY());
        int i = paramView.getScrollX();
        if (Build.VERSION.SDK_INT >= 15)
          paramAccessibilityEvent.setMaxScrollX(i);
        i = paramView.getScrollRange();
        if (Build.VERSION.SDK_INT >= 15)
          paramAccessibilityEvent.setMaxScrollY(i);
        return;
      }
    }

    public final void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramb);
      paramView = (NestedScrollView)paramView;
      paramb.setClassName(ScrollView.class.getName());
      if (paramView.isEnabled())
      {
        int i = paramView.getScrollRange();
        if (i > 0)
        {
          paramb.setScrollable(true);
          if (paramView.getScrollY() > 0)
            paramb.addAction(8192);
          if (paramView.getScrollY() < i)
            paramb.addAction(4096);
        }
      }
    }

    public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      boolean bool = true;
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle));
      while (true)
      {
        return bool;
        paramView = (NestedScrollView)paramView;
        if (!paramView.isEnabled())
          bool = false;
        else
          switch (paramInt)
          {
          default:
            bool = false;
            break;
          case 4096:
            paramInt = Math.min(paramView.getHeight() - paramView.getPaddingBottom() - paramView.getPaddingTop() + paramView.getScrollY(), paramView.getScrollRange());
            if (paramInt != paramView.getScrollY())
              paramView.aW(paramInt);
            else
              bool = false;
            break;
          case 8192:
            int i = paramView.getHeight();
            int j = paramView.getPaddingBottom();
            paramInt = paramView.getPaddingTop();
            paramInt = Math.max(paramView.getScrollY() - (i - j - paramInt), 0);
            if (paramInt != paramView.getScrollY())
              paramView.aW(paramInt);
            else
              bool = false;
            break;
          }
      }
    }
  }

  public static abstract interface b
  {
    public abstract void a(NestedScrollView paramNestedScrollView);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.NestedScrollView
 * JD-Core Version:    0.6.2
 */