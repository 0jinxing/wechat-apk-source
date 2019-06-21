package com.tencent.mm.ui.mogic;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.view.ViewPager.d;
import android.support.v4.view.p;
import android.support.v4.view.s;
import android.support.v4.view.t;
import android.support.v4.widget.i;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import junit.framework.Assert;

public class WxViewPager extends ViewGroup
{
  private static final int CLOSE_ENOUGH = 2;
  private static final Comparator<WxViewPager.b> COMPARATOR;
  private static final boolean DEBUG = false;
  private static final int DEFAULT_GUTTER_SIZE = 16;
  private static final int DEFAULT_OFFSCREEN_PAGES = 1;
  private static final int DRAW_ORDER_DEFAULT = 0;
  private static final int DRAW_ORDER_FORWARD = 1;
  private static final int DRAW_ORDER_REVERSE = 2;
  private static final int INVALID_POINTER = -1;
  private static final int[] LAYOUT_ATTRS;
  private static final int MAX_SETTLE_DURATION = 600;
  private static final int MIN_DISTANCE_FOR_FLING = 25;
  private static final int MIN_FLING_VELOCITY = 400;
  public static final int SCROLL_STATE_DRAGGING = 1;
  public static final int SCROLL_STATE_IDLE = 0;
  public static final int SCROLL_STATE_SETTLING = 2;
  private static final String TAG = "WxViewPager";
  private static final boolean USE_CACHE = false;
  private static final Interpolator sInterpolator;
  private static final WxViewPager.f sPositionComparator;
  private int mActivePointerId;
  private p mAdapter;
  private WxViewPager.d mAdapterChangeListener;
  private int mBottomPageBounds;
  private boolean mCalledSuper;
  private int mChildHeightMeasureSpec;
  private int mChildWidthMeasureSpec;
  private int mCloseEnough;
  private int mCurItem;
  private int mDecorChildCount;
  private int mDefaultGutterSize;
  private int mDrawingOrder;
  private ArrayList<View> mDrawingOrderedChildren;
  private final Runnable mEndScrollRunnable;
  private int mExpectedAdapterCount;
  private long mFakeDragBeginTime;
  private boolean mFakeDragging;
  private boolean mFirstLayout;
  private float mFirstOffset;
  private int mFlingDistance;
  private int mGutterSize;
  private boolean mIgnoreGutter;
  private boolean mInLayout;
  private float mInitialMotionX;
  private float mInitialMotionY;
  private ViewPager.OnPageChangeListener mInternalPageChangeListener;
  private boolean mIsBeingDragged;
  private boolean mIsUnableToDrag;
  private final ArrayList<WxViewPager.b> mItems;
  private float mLastMotionX;
  private float mLastMotionY;
  private float mLastOffset;
  private i mLeftEdge;
  private Drawable mMarginDrawable;
  private int mMaximumVelocity;
  private int mMinimumVelocity;
  private boolean mNeedCalculatePageOffsets;
  private e mObserver;
  private int mOffscreenPageLimit;
  private ViewPager.OnPageChangeListener mOnPageChangeListener;
  private int mPageMargin;
  private ViewPager.d mPageTransformer;
  private boolean mPopulatePending;
  private Parcelable mRestoredAdapterState;
  private ClassLoader mRestoredClassLoader;
  private int mRestoredCurItem;
  private i mRightEdge;
  private int mScrollState;
  private Scroller mScroller;
  private boolean mScrollingCacheEnabled;
  private Method mSetChildrenDrawingOrderEnabled;
  private final WxViewPager.b mTempItem;
  private final Rect mTempRect;
  private int mTopPageBounds;
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;

  static
  {
    AppMethodBeat.i(107547);
    LAYOUT_ATTRS = new int[] { 16842931 };
    COMPARATOR = new WxViewPager.1();
    sInterpolator = new WxViewPager.2();
    sPositionComparator = new WxViewPager.f();
    AppMethodBeat.o(107547);
  }

  public WxViewPager(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(107467);
    this.mItems = new ArrayList();
    this.mTempItem = new WxViewPager.b();
    this.mTempRect = new Rect();
    this.mRestoredCurItem = -1;
    this.mRestoredAdapterState = null;
    this.mRestoredClassLoader = null;
    this.mFirstOffset = -3.402824E+038F;
    this.mLastOffset = 3.4028235E+38F;
    this.mOffscreenPageLimit = 1;
    this.mActivePointerId = -1;
    this.mFirstLayout = true;
    this.mNeedCalculatePageOffsets = false;
    this.mEndScrollRunnable = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(107453);
        WxViewPager.access$000(WxViewPager.this, 0);
        WxViewPager.this.populate();
        AppMethodBeat.o(107453);
      }
    };
    this.mScrollState = 0;
    initViewPager();
    AppMethodBeat.o(107467);
  }

  public WxViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107468);
    this.mItems = new ArrayList();
    this.mTempItem = new WxViewPager.b();
    this.mTempRect = new Rect();
    this.mRestoredCurItem = -1;
    this.mRestoredAdapterState = null;
    this.mRestoredClassLoader = null;
    this.mFirstOffset = -3.402824E+038F;
    this.mLastOffset = 3.4028235E+38F;
    this.mOffscreenPageLimit = 1;
    this.mActivePointerId = -1;
    this.mFirstLayout = true;
    this.mNeedCalculatePageOffsets = false;
    this.mEndScrollRunnable = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(107453);
        WxViewPager.access$000(WxViewPager.this, 0);
        WxViewPager.this.populate();
        AppMethodBeat.o(107453);
      }
    };
    this.mScrollState = 0;
    initViewPager();
    AppMethodBeat.o(107468);
  }

  private void calculatePageOffsets(WxViewPager.b paramb1, int paramInt, WxViewPager.b paramb2)
  {
    AppMethodBeat.i(107497);
    int i = this.mAdapter.getCount();
    int j = getClientWidth();
    float f1;
    if (j > 0)
    {
      f1 = this.mPageMargin / j;
      if (paramb2 == null)
        break label396;
      j = paramb2.position;
      if (j < paramb1.position)
      {
        f2 = paramb2.offset + paramb2.widthFactor + f1;
        j++;
        k = 0;
      }
    }
    else
    {
      while (true)
      {
        if ((j > paramb1.position) || (k >= this.mItems.size()))
          break label396;
        for (paramb2 = (WxViewPager.b)this.mItems.get(k); ; paramb2 = (WxViewPager.b)this.mItems.get(k))
        {
          m = j;
          f3 = f2;
          if (j <= paramb2.position)
            break;
          m = j;
          f3 = f2;
          if (k >= this.mItems.size() - 1)
            break;
          k++;
        }
        f1 = 0.0F;
        break;
        while (m < paramb2.position)
        {
          f3 += this.mAdapter.getPageWidth(m) + f1;
          m++;
        }
        paramb2.offset = f3;
        f2 = f3 + (paramb2.widthFactor + f1);
        j = m + 1;
      }
    }
    if (j > paramb1.position)
    {
      k = this.mItems.size() - 1;
      f2 = paramb2.offset;
      j--;
      while ((j >= paramb1.position) && (k >= 0))
      {
        for (paramb2 = (WxViewPager.b)this.mItems.get(k); ; paramb2 = (WxViewPager.b)this.mItems.get(k))
        {
          m = j;
          f3 = f2;
          if (j >= paramb2.position)
            break;
          m = j;
          f3 = f2;
          if (k <= 0)
            break;
          k--;
        }
        while (m > paramb2.position)
        {
          f3 -= this.mAdapter.getPageWidth(m) + f1;
          m--;
        }
        f2 = f3 - (paramb2.widthFactor + f1);
        paramb2.offset = f2;
        j = m - 1;
      }
    }
    label396: int m = this.mItems.size();
    float f3 = paramb1.offset;
    j = paramb1.position - 1;
    if (paramb1.position == 0)
    {
      f2 = paramb1.offset;
      this.mFirstOffset = f2;
      if (paramb1.position != i - 1)
        break label534;
      f2 = paramb1.offset + paramb1.widthFactor - 1.0F;
      label462: this.mLastOffset = f2;
      k = paramInt - 1;
      f2 = f3;
    }
    while (true)
    {
      if (k < 0)
        break label581;
      paramb2 = (WxViewPager.b)this.mItems.get(k);
      while (true)
        if (j > paramb2.position)
        {
          f2 -= this.mAdapter.getPageWidth(j) + f1;
          j--;
          continue;
          f2 = -3.402824E+038F;
          break;
          label534: f2 = 3.4028235E+38F;
          break label462;
        }
      f2 -= paramb2.widthFactor + f1;
      paramb2.offset = f2;
      if (paramb2.position == 0)
        this.mFirstOffset = f2;
      j--;
      k--;
    }
    label581: float f2 = paramb1.offset + paramb1.widthFactor + f1;
    int k = paramb1.position + 1;
    j = paramInt + 1;
    paramInt = k;
    while (j < m)
    {
      paramb1 = (WxViewPager.b)this.mItems.get(j);
      while (paramInt < paramb1.position)
      {
        f2 += this.mAdapter.getPageWidth(paramInt) + f1;
        paramInt++;
      }
      if (paramb1.position == i - 1)
        this.mLastOffset = (paramb1.widthFactor + f2 - 1.0F);
      paramb1.offset = f2;
      f2 += paramb1.widthFactor + f1;
      paramInt++;
      j++;
    }
    this.mNeedCalculatePageOffsets = false;
    AppMethodBeat.o(107497);
  }

  private void completeScroll(boolean paramBoolean)
  {
    AppMethodBeat.i(107513);
    if (this.mScrollState == 2);
    int k;
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        setScrollingCacheEnabled(false);
        this.mScroller.abortAnimation();
        int j = getScrollX();
        k = getScrollY();
        int m = this.mScroller.getCurrX();
        n = this.mScroller.getCurrY();
        if ((j != m) || (k != n))
          scrollTo(m, n);
      }
      this.mPopulatePending = false;
      int n = 0;
      k = i;
      for (i = n; i < this.mItems.size(); i++)
      {
        WxViewPager.b localb = (WxViewPager.b)this.mItems.get(i);
        if (localb.scrolling)
        {
          localb.scrolling = false;
          k = 1;
        }
      }
    }
    if (k != 0)
      if (paramBoolean)
      {
        s.b(this, this.mEndScrollRunnable);
        AppMethodBeat.o(107513);
      }
    while (true)
    {
      return;
      this.mEndScrollRunnable.run();
      AppMethodBeat.o(107513);
    }
  }

  private int determineTargetPage(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(107520);
    if ((Math.abs(paramInt3) > this.mFlingDistance) && (Math.abs(paramInt2) > this.mMinimumVelocity))
    {
      if (paramInt2 > 0);
      while (true)
      {
        paramInt2 = paramInt1;
        if (this.mItems.size() > 0)
          paramInt2 = Math.max(firstItemPosForDetermine(), Math.min(paramInt1, lastItemPosForDetermine()));
        AppMethodBeat.o(107520);
        return paramInt2;
        paramInt1++;
      }
    }
    if (paramInt1 >= this.mCurItem);
    for (float f = 0.6F; ; f = 0.4F)
    {
      paramInt1 = (int)(f + (paramInt1 + paramFloat));
      break;
    }
  }

  private void enableLayers(boolean paramBoolean)
  {
    AppMethodBeat.i(107515);
    int i = getChildCount();
    int j = 0;
    if (j < i)
    {
      if (paramBoolean);
      for (int k = 2; ; k = 0)
      {
        s.p(getChildAt(j), k);
        j++;
        break;
      }
    }
    AppMethodBeat.o(107515);
  }

  private void endDrag()
  {
    AppMethodBeat.i(107529);
    this.mIsBeingDragged = false;
    this.mIsUnableToDrag = false;
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
    AppMethodBeat.o(107529);
  }

  private Rect getChildRectInPagerCoordinates(Rect paramRect, View paramView)
  {
    AppMethodBeat.i(107535);
    if (paramRect == null)
      paramRect = new Rect();
    while (true)
    {
      if (paramView == null)
      {
        paramRect.set(0, 0, 0, 0);
        AppMethodBeat.o(107535);
      }
      while (true)
      {
        return paramRect;
        paramRect.left = paramView.getLeft();
        paramRect.right = paramView.getRight();
        paramRect.top = paramView.getTop();
        paramRect.bottom = paramView.getBottom();
        for (paramView = paramView.getParent(); ((paramView instanceof ViewGroup)) && (paramView != this); paramView = paramView.getParent())
        {
          paramView = (ViewGroup)paramView;
          paramRect.left += paramView.getLeft();
          paramRect.right += paramView.getRight();
          paramRect.top += paramView.getTop();
          paramRect.bottom += paramView.getBottom();
        }
        AppMethodBeat.o(107535);
      }
    }
  }

  private int getClientWidth()
  {
    AppMethodBeat.i(107474);
    int i = getMeasuredWidth();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    AppMethodBeat.o(107474);
    return i - j - k;
  }

  private WxViewPager.b infoForCurrentScrollPosition()
  {
    AppMethodBeat.i(107519);
    int i = getClientWidth();
    float f1;
    float f2;
    label37: int j;
    int k;
    Object localObject1;
    float f3;
    float f4;
    label54: Object localObject2;
    if (i > 0)
    {
      f1 = getScrollX() / i;
      if (i <= 0)
        break label207;
      f2 = this.mPageMargin / i;
      j = -1;
      k = 1;
      i = 0;
      localObject1 = null;
      f3 = 0.0F;
      f4 = 0.0F;
      if (i >= this.mItems.size())
        break label252;
      localObject2 = (WxViewPager.b)this.mItems.get(i);
      if ((k != 0) || (((WxViewPager.b)localObject2).position == j + 1))
        break label265;
      localObject2 = this.mTempItem;
      ((WxViewPager.b)localObject2).offset = (f4 + f3 + f2);
      ((WxViewPager.b)localObject2).position = (j + 1);
      ((WxViewPager.b)localObject2).widthFactor = this.mAdapter.getPageWidth(((WxViewPager.b)localObject2).position);
      i--;
    }
    label265: 
    while (true)
    {
      f4 = ((WxViewPager.b)localObject2).offset;
      f3 = ((WxViewPager.b)localObject2).widthFactor;
      if ((k != 0) || (f1 >= f4))
      {
        if ((f1 >= f3 + f4 + f2) && (i != this.mItems.size() - 1))
          break label225;
        AppMethodBeat.o(107519);
      }
      while (true)
      {
        return localObject2;
        f1 = 0.0F;
        break;
        label207: f2 = 0.0F;
        break label37;
        AppMethodBeat.o(107519);
        localObject2 = localObject1;
        continue;
        label225: j = ((WxViewPager.b)localObject2).position;
        f3 = ((WxViewPager.b)localObject2).widthFactor;
        i++;
        k = 0;
        localObject1 = localObject2;
        break label54;
        label252: AppMethodBeat.o(107519);
        localObject2 = localObject1;
      }
    }
  }

  private void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107528);
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.mActivePointerId)
      if (i != 0)
        break label68;
    label68: for (i = 1; ; i = 0)
    {
      this.mLastMotionX = paramMotionEvent.getX(i);
      this.mActivePointerId = paramMotionEvent.getPointerId(i);
      if (this.mVelocityTracker != null)
        this.mVelocityTracker.clear();
      AppMethodBeat.o(107528);
      return;
    }
  }

  private boolean pageScrolled(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(107511);
    Object localObject;
    if (this.mItems.size() == 0)
    {
      this.mCalledSuper = false;
      onPageScrolled(0, 0.0F, 0);
      if (!this.mCalledSuper)
      {
        localObject = new IllegalStateException("onPageScrolled did not call superclass implementation");
        AppMethodBeat.o(107511);
        throw ((Throwable)localObject);
      }
      AppMethodBeat.o(107511);
    }
    while (true)
    {
      return bool;
      localObject = infoForCurrentScrollPosition();
      if (localObject == null)
      {
        AppMethodBeat.o(107511);
      }
      else
      {
        int i = getClientWidth();
        int j = this.mPageMargin;
        float f = this.mPageMargin / i;
        int k = ((WxViewPager.b)localObject).position;
        f = (paramInt / i - ((WxViewPager.b)localObject).offset) / (((WxViewPager.b)localObject).widthFactor + f);
        paramInt = (int)((j + i) * f);
        this.mCalledSuper = false;
        onPageScrolled(k, f, paramInt);
        if (!this.mCalledSuper)
        {
          localObject = new IllegalStateException("onPageScrolled did not call superclass implementation");
          AppMethodBeat.o(107511);
          throw ((Throwable)localObject);
        }
        bool = true;
        AppMethodBeat.o(107511);
      }
    }
  }

  private boolean performDrag(float paramFloat)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(107518);
    float f1 = this.mLastMotionX;
    this.mLastMotionX = paramFloat;
    float f2 = getScrollX() + (f1 - paramFloat);
    int j = getClientWidth();
    paramFloat = j * this.mFirstOffset;
    f1 = j;
    float f3 = this.mLastOffset;
    WxViewPager.b localb1 = (WxViewPager.b)this.mItems.get(0);
    WxViewPager.b localb2 = (WxViewPager.b)this.mItems.get(this.mItems.size() - 1);
    if (localb1.position != 0)
    {
      paramFloat = localb1.offset;
      paramFloat = j * paramFloat;
    }
    for (int k = 0; ; k = 1)
    {
      if (localb2.position != this.mAdapter.getCount() - 1)
      {
        f1 = localb2.offset * j;
        i = 0;
      }
      while (true)
      {
        if (f2 < paramFloat)
        {
          f1 = paramFloat;
          if (k != 0)
          {
            bool2 = this.mLeftEdge.F(Math.abs(paramFloat - f2) / j);
            f1 = paramFloat;
          }
        }
        while (true)
        {
          this.mLastMotionX += f1 - (int)f1;
          scrollTo((int)f1, getScrollY());
          pageScrolled((int)f1);
          AppMethodBeat.o(107518);
          return bool2;
          if (f2 > f1)
          {
            bool2 = bool1;
            if (i != 0)
              bool2 = this.mRightEdge.F(Math.abs(f2 - f1) / j);
          }
          else
          {
            f1 = f2;
          }
        }
        f1 *= f3;
      }
    }
  }

  private void recomputeScrollPosition(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107508);
    if ((paramInt2 > 0) && (!this.mItems.isEmpty()))
    {
      int i = getPaddingLeft();
      int j = getPaddingRight();
      int k = getPaddingLeft();
      int m = getPaddingRight();
      f = getScrollX() / (paramInt2 - k - m + paramInt4);
      paramInt4 = (int)((paramInt1 - i - j + paramInt3) * f);
      scrollTo(paramInt4, getScrollY());
      if (!this.mScroller.isFinished())
      {
        paramInt3 = this.mScroller.getDuration();
        paramInt2 = this.mScroller.timePassed();
        localb = infoForPosition(this.mCurItem);
        if (localb != null)
          this.mScroller.startScroll(paramInt4, 0, (int)(localb.offset * paramInt1), 0, paramInt3 - paramInt2);
      }
      AppMethodBeat.o(107508);
      return;
    }
    WxViewPager.b localb = infoForPosition(this.mCurItem);
    if (localb != null);
    for (float f = Math.min(localb.offset, this.mLastOffset); ; f = 0.0F)
    {
      paramInt1 = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 != getScrollX())
      {
        completeScroll(false);
        scrollTo(paramInt1, getScrollY());
      }
      AppMethodBeat.o(107508);
      break;
    }
  }

  private void removeNonDecorViews()
  {
    AppMethodBeat.i(107473);
    int j;
    for (int i = 0; i < getChildCount(); i = j + 1)
    {
      j = i;
      if (!((WxViewPager.LayoutParams)getChildAt(i).getLayoutParams()).Nq)
      {
        removeViewAt(i);
        j = i - 1;
      }
    }
    AppMethodBeat.o(107473);
  }

  private void scrollToItem(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    AppMethodBeat.i(107479);
    WxViewPager.b localb = infoForPosition(paramInt1);
    float f;
    if (localb != null)
      f = getClientWidth();
    for (int i = (int)(Math.max(this.mFirstOffset, Math.min(localb.offset, this.mLastOffset)) * f); ; i = 0)
    {
      if (paramBoolean1)
      {
        smoothScrollTo(i, 0, paramInt2);
        if ((paramBoolean2) && (this.mOnPageChangeListener != null))
          this.mOnPageChangeListener.onPageSelected(paramInt1);
        if ((!paramBoolean2) || (this.mInternalPageChangeListener == null))
          break label176;
        this.mInternalPageChangeListener.onPageSelected(paramInt1);
        AppMethodBeat.o(107479);
      }
      while (true)
      {
        return;
        if ((paramBoolean2) && (this.mOnPageChangeListener != null))
          this.mOnPageChangeListener.onPageSelected(paramInt1);
        if ((paramBoolean2) && (this.mInternalPageChangeListener != null))
          this.mInternalPageChangeListener.onPageSelected(paramInt1);
        completeScroll(false);
        scrollTo(i, 0);
        pageScrolled(i);
        label176: AppMethodBeat.o(107479);
      }
    }
  }

  private void setScrollState(int paramInt)
  {
    AppMethodBeat.i(107471);
    if (this.mScrollState == paramInt)
    {
      AppMethodBeat.o(107471);
      return;
    }
    this.mScrollState = paramInt;
    if (this.mPageTransformer != null)
      if (paramInt == 0)
        break label70;
    label70: for (boolean bool = true; ; bool = false)
    {
      enableLayers(bool);
      if (this.mOnPageChangeListener != null)
        this.mOnPageChangeListener.onPageScrollStateChanged(paramInt);
      AppMethodBeat.o(107471);
      break;
    }
  }

  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.mScrollingCacheEnabled != paramBoolean)
      this.mScrollingCacheEnabled = paramBoolean;
  }

  private void sortChildDrawingOrder()
  {
    AppMethodBeat.i(107496);
    if (this.mDrawingOrder != 0)
    {
      if (this.mDrawingOrderedChildren == null)
        this.mDrawingOrderedChildren = new ArrayList();
      while (true)
      {
        int i = getChildCount();
        for (int j = 0; j < i; j++)
        {
          View localView = getChildAt(j);
          this.mDrawingOrderedChildren.add(localView);
        }
        this.mDrawingOrderedChildren.clear();
      }
      Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
    }
    AppMethodBeat.o(107496);
  }

  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107538);
    Assert.assertNotNull(paramArrayList);
    int i = paramArrayList.size();
    int j = getDescendantFocusability();
    if (j != 393216)
      for (int k = 0; k < getChildCount(); k++)
      {
        View localView = getChildAt(k);
        if (localView.getVisibility() == 0)
        {
          WxViewPager.b localb = infoForChild(localView);
          if ((localb != null) && (localb.position == this.mCurItem))
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
    if ((j != 262144) || (i == paramArrayList.size()))
      if (!isFocusable())
        AppMethodBeat.o(107538);
    while (true)
    {
      return;
      if (((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode()))
      {
        AppMethodBeat.o(107538);
      }
      else
      {
        paramArrayList.add(this);
        AppMethodBeat.o(107538);
      }
    }
  }

  WxViewPager.b addNewItem(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107492);
    WxViewPager.b localb = new WxViewPager.b();
    localb.position = paramInt1;
    localb.object = this.mAdapter.instantiateItem(this, paramInt1);
    localb.widthFactor = this.mAdapter.getPageWidth(paramInt1);
    if ((paramInt2 < 0) || (paramInt2 >= this.mItems.size()))
      this.mItems.add(localb);
    while (true)
    {
      AppMethodBeat.o(107492);
      return localb;
      this.mItems.add(paramInt2, localb);
    }
  }

  public void addTouchables(ArrayList<View> paramArrayList)
  {
    AppMethodBeat.i(107539);
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        WxViewPager.b localb = infoForChild(localView);
        if ((localb != null) && (localb.position == this.mCurItem))
          localView.addTouchables(paramArrayList);
      }
    }
    AppMethodBeat.o(107539);
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(107500);
    if (!checkLayoutParams(paramLayoutParams))
      paramLayoutParams = generateLayoutParams(paramLayoutParams);
    while (true)
    {
      Assert.assertNotNull(paramLayoutParams);
      WxViewPager.LayoutParams localLayoutParams = (WxViewPager.LayoutParams)paramLayoutParams;
      localLayoutParams.Nq |= paramView instanceof WxViewPager.a;
      if (this.mInLayout)
      {
        if (localLayoutParams.Nq)
        {
          paramView = new IllegalStateException("Cannot add pager decor view during layout");
          AppMethodBeat.o(107500);
          throw paramView;
        }
        localLayoutParams.Nr = true;
        addViewInLayout(paramView, paramInt, paramLayoutParams);
        AppMethodBeat.o(107500);
      }
      while (true)
      {
        return;
        super.addView(paramView, paramInt, paramLayoutParams);
        AppMethodBeat.o(107500);
      }
    }
  }

  public boolean arrowScroll(int paramInt)
  {
    AppMethodBeat.i(107534);
    View localView = findFocus();
    Object localObject;
    int j;
    boolean bool;
    if (localView == this)
    {
      localObject = null;
      localView = FocusFinder.getInstance().findNextFocus(this, (View)localObject, paramInt);
      if ((localView == null) || (localView == localObject))
        break label299;
      if (paramInt != 17)
        break label245;
      i = getChildRectInPagerCoordinates(this.mTempRect, localView).left;
      j = getChildRectInPagerCoordinates(this.mTempRect, (View)localObject).left;
      if ((localObject != null) && (i >= j))
      {
        bool = pageLeft();
        label88: if (bool)
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        AppMethodBeat.o(107534);
        return bool;
      }
    }
    else
    {
      if (localView == null)
        break label345;
      localObject = localView.getParent();
      if (!(localObject instanceof ViewGroup))
        break label350;
      if (localObject != this);
    }
    label299: label339: label345: label350: for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView.getClass().getSimpleName());
        localObject = localView.getParent();
        while (true)
          if ((localObject instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localObject.getClass().getSimpleName());
            localObject = ((ViewParent)localObject).getParent();
            continue;
            localObject = ((ViewParent)localObject).getParent();
            break;
          }
        new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ").append(localStringBuilder.toString());
        localObject = null;
        break;
        bool = localView.requestFocus();
        break label88;
        label245: if (paramInt == 66)
        {
          j = getChildRectInPagerCoordinates(this.mTempRect, localView).left;
          i = getChildRectInPagerCoordinates(this.mTempRect, (View)localObject).left;
          if ((localObject == null) || (j > i))
          {
            bool = localView.requestFocus();
            break label88;
            if ((paramInt == 17) || (paramInt == 1))
            {
              bool = pageLeft();
              break label88;
            }
            if ((paramInt != 66) && (paramInt != 2))
              break label339;
          }
          bool = pageRight();
          break label88;
        }
        bool = false;
        break label88;
      }
      localObject = localView;
      break;
    }
  }

  public boolean beginFakeDrag()
  {
    boolean bool = false;
    AppMethodBeat.i(107525);
    if (this.mIsBeingDragged)
    {
      AppMethodBeat.o(107525);
      return bool;
    }
    this.mFakeDragging = true;
    setScrollState(1);
    this.mLastMotionX = 0.0F;
    this.mInitialMotionX = 0.0F;
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    while (true)
    {
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
      this.mVelocityTracker.addMovement(localMotionEvent);
      localMotionEvent.recycle();
      this.mFakeDragBeginTime = l;
      AppMethodBeat.o(107525);
      bool = true;
      break;
      this.mVelocityTracker.clear();
    }
  }

  protected boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(107531);
    int k;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = paramView.getScrollX();
      int j = paramView.getScrollY();
      k = localViewGroup.getChildCount() - 1;
      if (k >= 0)
      {
        View localView = localViewGroup.getChildAt(k);
        if ((paramInt2 + i >= localView.getLeft()) && (paramInt2 + i < localView.getRight()) && (paramInt3 + j >= localView.getTop()) && (paramInt3 + j < localView.getBottom()) && (canScroll(localView, true, paramInt1, paramInt2 + i - localView.getLeft(), paramInt3 + j - localView.getTop())) && (localView.isEnabled()))
        {
          paramBoolean = true;
          AppMethodBeat.o(107531);
        }
      }
    }
    while (true)
    {
      return paramBoolean;
      k--;
      break;
      if ((paramBoolean) && (s.m(paramView, -paramInt1)))
      {
        paramBoolean = true;
        AppMethodBeat.o(107531);
      }
      else
      {
        paramBoolean = false;
        AppMethodBeat.o(107531);
      }
    }
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(107530);
    if (this.mAdapter == null)
      AppMethodBeat.o(107530);
    while (true)
    {
      return bool;
      int i = getClientWidth();
      int j = getScrollX();
      if (paramInt < 0)
      {
        if (j > (int)(i * this.mFirstOffset))
        {
          AppMethodBeat.o(107530);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(107530);
        }
      }
      else if (paramInt > 0)
      {
        if (j < (int)(i * this.mLastOffset))
        {
          AppMethodBeat.o(107530);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(107530);
        }
      }
      else
        AppMethodBeat.o(107530);
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(107544);
    boolean bool;
    if (((paramLayoutParams instanceof WxViewPager.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams)))
    {
      bool = true;
      AppMethodBeat.o(107544);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107544);
    }
  }

  public void computeScroll()
  {
    AppMethodBeat.i(107510);
    if ((!this.mScroller.isFinished()) && (this.mScroller.computeScrollOffset()))
    {
      int i = getScrollX();
      int j = getScrollY();
      int k = this.mScroller.getCurrX();
      int m = this.mScroller.getCurrY();
      if ((i != k) || (j != m))
      {
        scrollTo(k, m);
        if (!pageScrolled(k))
        {
          this.mScroller.abortAnimation();
          scrollTo(0, m);
        }
      }
      s.R(this);
      AppMethodBeat.o(107510);
    }
    while (true)
    {
      return;
      completeScroll(true);
      AppMethodBeat.o(107510);
    }
  }

  void dataSetChanged()
  {
    AppMethodBeat.i(107493);
    int i = this.mAdapter.getCount();
    this.mExpectedAdapterCount = i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    label64: Object localObject;
    int i2;
    int i3;
    int i4;
    int i5;
    if ((this.mItems.size() < this.mOffscreenPageLimit * 2 + 1) && (this.mItems.size() < i))
    {
      j = 1;
      k = this.mCurItem;
      m = 0;
      n = 0;
      i1 = j;
      if (m >= this.mItems.size())
        break label305;
      localObject = (WxViewPager.b)this.mItems.get(m);
      i2 = this.mAdapter.getItemPosition(((WxViewPager.b)localObject).object);
      i3 = m;
      i4 = n;
      i5 = k;
      j = i1;
      if (i2 != -1)
      {
        if (i2 != -2)
          break label243;
        this.mItems.remove(m);
        i3 = m - 1;
        m = n;
        if (n == 0)
        {
          this.mAdapter.startUpdate(this);
          m = 1;
        }
        this.mAdapter.destroyItem(this, ((WxViewPager.b)localObject).position, ((WxViewPager.b)localObject).object);
        if (this.mCurItem != ((WxViewPager.b)localObject).position)
          break label398;
        i5 = Math.max(0, Math.min(this.mCurItem, i - 1));
        j = 1;
        i4 = m;
      }
    }
    while (true)
    {
      m = i3 + 1;
      n = i4;
      k = i5;
      i1 = j;
      break label64;
      j = 0;
      break;
      label243: i3 = m;
      i4 = n;
      i5 = k;
      j = i1;
      if (((WxViewPager.b)localObject).position != i2)
      {
        if (((WxViewPager.b)localObject).position == this.mCurItem)
          k = i2;
        ((WxViewPager.b)localObject).position = i2;
        j = 1;
        i3 = m;
        i4 = n;
        i5 = k;
        continue;
        label305: if (n != 0)
          this.mAdapter.finishUpdate(this);
        Collections.sort(this.mItems, COMPARATOR);
        if (i1 != 0)
        {
          n = getChildCount();
          for (j = 0; j < n; j++)
          {
            localObject = (WxViewPager.LayoutParams)getChildAt(j).getLayoutParams();
            if (!((WxViewPager.LayoutParams)localObject).Nq)
              ((WxViewPager.LayoutParams)localObject).widthFactor = 0.0F;
          }
          setCurrentItemInternal(k, false, true);
          requestLayout();
        }
        AppMethodBeat.o(107493);
        return;
        label398: j = 1;
        i4 = m;
        i5 = k;
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(107532);
    boolean bool;
    if ((super.dispatchKeyEvent(paramKeyEvent)) || (executeKeyEvent(paramKeyEvent)))
    {
      bool = true;
      AppMethodBeat.o(107532);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107532);
    }
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(107541);
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      AppMethodBeat.o(107541);
    }
    while (true)
    {
      return bool;
      int i = getChildCount();
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label113;
        View localView = getChildAt(j);
        if (localView.getVisibility() == 0)
        {
          WxViewPager.b localb = infoForChild(localView);
          if ((localb != null) && (localb.position == this.mCurItem) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent)))
          {
            bool = true;
            AppMethodBeat.o(107541);
            break;
          }
        }
      }
      label113: AppMethodBeat.o(107541);
    }
  }

  float distanceInfluenceForSnapDuration(float paramFloat)
  {
    AppMethodBeat.i(107489);
    paramFloat = (float)Math.sin((float)((paramFloat - 0.5F) * 0.47123891676382D));
    AppMethodBeat.o(107489);
    return paramFloat;
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107523);
    super.draw(paramCanvas);
    int i = 0;
    int j = 0;
    int m = s.O(this);
    boolean bool;
    if ((m == 0) || ((m == 1) && (this.mAdapter != null) && (this.mAdapter.getCount() > 1)))
    {
      int k;
      if (!this.mLeftEdge.QM.isFinished())
      {
        i = paramCanvas.save();
        j = getHeight() - getPaddingTop() - getPaddingBottom();
        m = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-j + getPaddingTop(), this.mFirstOffset * m);
        this.mLeftEdge.setSize(j, m);
        k = this.mLeftEdge.draw(paramCanvas) | false;
        paramCanvas.restoreToCount(i);
      }
      i = k;
      if (!this.mRightEdge.QM.isFinished())
      {
        m = paramCanvas.save();
        int n = getWidth();
        int i1 = getHeight();
        i = getPaddingTop();
        int i2 = getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(this.mLastOffset + 1.0F) * n);
        this.mRightEdge.setSize(i1 - i - i2, n);
        bool = k | this.mRightEdge.draw(paramCanvas);
        paramCanvas.restoreToCount(m);
      }
    }
    while (true)
    {
      if (bool)
        s.R(this);
      AppMethodBeat.o(107523);
      return;
      this.mLeftEdge.QM.finish();
      this.mRightEdge.QM.finish();
    }
  }

  protected void drawableStateChanged()
  {
    AppMethodBeat.i(107488);
    super.drawableStateChanged();
    Drawable localDrawable = this.mMarginDrawable;
    if ((localDrawable != null) && (localDrawable.isStateful()))
      localDrawable.setState(getDrawableState());
    AppMethodBeat.o(107488);
  }

  public void endFakeDrag()
  {
    AppMethodBeat.i(107526);
    if (!this.mFakeDragging)
    {
      localObject = new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
      AppMethodBeat.o(107526);
      throw ((Throwable)localObject);
    }
    Object localObject = this.mVelocityTracker;
    ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.mMaximumVelocity);
    int i = (int)((VelocityTracker)localObject).getXVelocity(this.mActivePointerId);
    this.mPopulatePending = true;
    int j = getClientWidth();
    int k = getScrollX();
    localObject = infoForCurrentScrollPosition();
    if (localObject != null)
      setCurrentItemInternal(determineTargetPage(((WxViewPager.b)localObject).position, (k / j - ((WxViewPager.b)localObject).offset) / ((WxViewPager.b)localObject).widthFactor, i, (int)(this.mLastMotionX - this.mInitialMotionX)), true, true, i);
    endDrag();
    this.mFakeDragging = false;
    AppMethodBeat.o(107526);
  }

  public boolean executeKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(107533);
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramKeyEvent.getAction() == 0)
      switch (paramKeyEvent.getKeyCode())
      {
      default:
        bool2 = bool1;
      case 21:
      case 22:
      case 61:
      }
    while (true)
    {
      AppMethodBeat.o(107533);
      return bool2;
      bool2 = arrowScroll(17);
      continue;
      bool2 = arrowScroll(66);
      continue;
      bool2 = bool1;
      if (Build.VERSION.SDK_INT >= 11)
        if (paramKeyEvent.hasNoModifiers())
        {
          bool2 = arrowScroll(2);
        }
        else
        {
          bool2 = bool1;
          if (paramKeyEvent.hasModifiers(1))
            bool2 = arrowScroll(1);
        }
    }
  }

  public void fakeDragBy(float paramFloat)
  {
    AppMethodBeat.i(107527);
    if (!this.mFakeDragging)
    {
      localObject = new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
      AppMethodBeat.o(107527);
      throw ((Throwable)localObject);
    }
    this.mLastMotionX += paramFloat;
    float f1 = getScrollX() - paramFloat;
    int i = getClientWidth();
    paramFloat = i;
    float f2 = this.mFirstOffset;
    float f3 = i;
    float f4 = this.mLastOffset;
    WxViewPager.b localb = (WxViewPager.b)this.mItems.get(0);
    Object localObject = (WxViewPager.b)this.mItems.get(this.mItems.size() - 1);
    if (localb.position != 0);
    for (paramFloat = localb.offset * i; ; paramFloat *= f2)
    {
      if (((WxViewPager.b)localObject).position != this.mAdapter.getCount() - 1);
      for (f4 = ((WxViewPager.b)localObject).offset * i; ; f4 = f3 * f4)
      {
        if (f1 < paramFloat);
        while (true)
        {
          this.mLastMotionX += paramFloat - (int)paramFloat;
          scrollTo((int)paramFloat, getScrollY());
          pageScrolled((int)paramFloat);
          long l = SystemClock.uptimeMillis();
          localObject = MotionEvent.obtain(this.mFakeDragBeginTime, l, 2, this.mLastMotionX, 0.0F, 0);
          this.mVelocityTracker.addMovement((MotionEvent)localObject);
          ((MotionEvent)localObject).recycle();
          AppMethodBeat.o(107527);
          return;
          if (f1 > f4)
            paramFloat = f4;
          else
            paramFloat = f1;
        }
      }
    }
  }

  public int firstItemPosForDetermine()
  {
    AppMethodBeat.i(107521);
    int i = ((WxViewPager.b)this.mItems.get(0)).position;
    AppMethodBeat.o(107521);
    return i;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    AppMethodBeat.i(107542);
    WxViewPager.LayoutParams localLayoutParams = new WxViewPager.LayoutParams();
    AppMethodBeat.o(107542);
    return localLayoutParams;
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(107545);
    paramAttributeSet = new WxViewPager.LayoutParams(getContext(), paramAttributeSet);
    AppMethodBeat.o(107545);
    return paramAttributeSet;
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(107543);
    paramLayoutParams = generateDefaultLayoutParams();
    AppMethodBeat.o(107543);
    return paramLayoutParams;
  }

  public p getAdapter()
  {
    return this.mAdapter;
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107482);
    int i = paramInt2;
    if (this.mDrawingOrder == 2)
      i = paramInt1 - 1 - paramInt2;
    paramInt1 = ((WxViewPager.LayoutParams)((View)this.mDrawingOrderedChildren.get(i)).getLayoutParams()).Ns;
    AppMethodBeat.o(107482);
    return paramInt1;
  }

  public int getCurrentItem()
  {
    return this.mCurItem;
  }

  public int getOffscreenPageLimit()
  {
    return this.mOffscreenPageLimit;
  }

  public int getPageMargin()
  {
    return this.mPageMargin;
  }

  WxViewPager.b infoForAnyChild(View paramView)
  {
    AppMethodBeat.i(107503);
    ViewParent localViewParent = paramView.getParent();
    if (localViewParent != this)
      if ((localViewParent == null) || (!(localViewParent instanceof View)))
      {
        paramView = null;
        AppMethodBeat.o(107503);
      }
    while (true)
    {
      return paramView;
      paramView = (View)localViewParent;
      break;
      paramView = infoForChild(paramView);
      AppMethodBeat.o(107503);
    }
  }

  WxViewPager.b infoForChild(View paramView)
  {
    AppMethodBeat.i(107502);
    int i = 0;
    if (i < this.mItems.size())
    {
      WxViewPager.b localb = (WxViewPager.b)this.mItems.get(i);
      if (this.mAdapter.isViewFromObject(paramView, localb.object))
      {
        AppMethodBeat.o(107502);
        paramView = localb;
      }
    }
    while (true)
    {
      return paramView;
      i++;
      break;
      paramView = null;
      AppMethodBeat.o(107502);
    }
  }

  WxViewPager.b infoForPosition(int paramInt)
  {
    AppMethodBeat.i(107504);
    int i = 0;
    WxViewPager.b localb;
    if (i < this.mItems.size())
    {
      localb = (WxViewPager.b)this.mItems.get(i);
      if (localb.position == paramInt)
        AppMethodBeat.o(107504);
    }
    while (true)
    {
      return localb;
      i++;
      break;
      localb = null;
      AppMethodBeat.o(107504);
    }
  }

  void initViewPager()
  {
    AppMethodBeat.i(107469);
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.mScroller = new Scroller(localContext, sInterpolator);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f = localContext.getResources().getDisplayMetrics().density;
    this.mTouchSlop = t.a(localViewConfiguration);
    this.mMinimumVelocity = ((int)(400.0F * f));
    this.mMaximumVelocity = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.mLeftEdge = new i(localContext);
    this.mRightEdge = new i(localContext);
    this.mFlingDistance = ((int)(25.0F * f));
    this.mCloseEnough = ((int)(2.0F * f));
    this.mDefaultGutterSize = ((int)(16.0F * f));
    s.a(this, new WxViewPager.c(this));
    if (s.S(this) == 0)
      s.o(this, 1);
    AppMethodBeat.o(107469);
  }

  public boolean isFakeDragging()
  {
    return this.mFakeDragging;
  }

  protected boolean isGutterDrag(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(107514);
    boolean bool;
    if (((paramFloat1 < this.mGutterSize) && (paramFloat2 > 0.0F)) || ((paramFloat1 > getWidth() - this.mGutterSize) && (paramFloat2 < 0.0F)))
    {
      bool = true;
      AppMethodBeat.o(107514);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107514);
    }
  }

  public int lastItemPosForDetermine()
  {
    AppMethodBeat.i(107522);
    int i = ((WxViewPager.b)this.mItems.get(this.mItems.size() - 1)).position;
    AppMethodBeat.o(107522);
    return i;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(107505);
    super.onAttachedToWindow();
    this.mFirstLayout = true;
    AppMethodBeat.o(107505);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(107470);
    removeCallbacks(this.mEndScrollRunnable);
    super.onDetachedFromWindow();
    AppMethodBeat.o(107470);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107524);
    super.onDraw(paramCanvas);
    if ((this.mPageMargin > 0) && (this.mMarginDrawable != null) && (this.mItems.size() > 0) && (this.mAdapter != null))
    {
      int i = getScrollX();
      int j = getWidth();
      float f1 = this.mPageMargin / j;
      Object localObject = (WxViewPager.b)this.mItems.get(0);
      float f2 = ((WxViewPager.b)localObject).offset;
      int k = this.mItems.size();
      int m = ((WxViewPager.b)localObject).position;
      int n = ((WxViewPager.b)this.mItems.get(k - 1)).position;
      int i1 = 0;
      if (m < n)
      {
        while ((m > ((WxViewPager.b)localObject).position) && (i1 < k))
        {
          localObject = this.mItems;
          i1++;
          localObject = (WxViewPager.b)((ArrayList)localObject).get(i1);
        }
        float f3;
        if (m == ((WxViewPager.b)localObject).position)
          f3 = (((WxViewPager.b)localObject).offset + ((WxViewPager.b)localObject).widthFactor) * j;
        float f4;
        for (f2 = ((WxViewPager.b)localObject).offset + ((WxViewPager.b)localObject).widthFactor + f1; ; f2 += f4 + f1)
        {
          if (this.mPageMargin + f3 > i)
          {
            this.mMarginDrawable.setBounds((int)f3, this.mTopPageBounds, (int)(this.mPageMargin + f3 + 0.5F), this.mBottomPageBounds);
            this.mMarginDrawable.draw(paramCanvas);
          }
          if (f3 > i + j)
            break label313;
          m++;
          break;
          f4 = this.mAdapter.getPageWidth(m);
          f3 = (f2 + f4) * j;
        }
      }
    }
    label313: AppMethodBeat.o(107524);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(107516);
    int i = paramMotionEvent.getAction() & 0xFF;
    if ((i == 3) || (i == 1))
    {
      this.mIsBeingDragged = false;
      this.mIsUnableToDrag = false;
      this.mActivePointerId = -1;
      if (this.mVelocityTracker != null)
      {
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
      }
      AppMethodBeat.o(107516);
    }
    while (true)
    {
      return bool;
      if (i == 0)
        break;
      if (this.mIsBeingDragged)
      {
        AppMethodBeat.o(107516);
        bool = true;
      }
      else
      {
        if (!this.mIsUnableToDrag)
          break;
        AppMethodBeat.o(107516);
      }
    }
    switch (i)
    {
    default:
    case 2:
    case 0:
    case 6:
    }
    while (true)
    {
      if (this.mVelocityTracker == null)
        this.mVelocityTracker = VelocityTracker.obtain();
      this.mVelocityTracker.addMovement(paramMotionEvent);
      bool = this.mIsBeingDragged;
      AppMethodBeat.o(107516);
      break;
      i = this.mActivePointerId;
      if (i != -1)
      {
        i = paramMotionEvent.findPointerIndex(i);
        float f1 = paramMotionEvent.getX(i);
        float f2 = f1 - this.mLastMotionX;
        float f3 = Math.abs(f2);
        float f4 = paramMotionEvent.getY(i);
        float f5 = Math.abs(f4 - this.mInitialMotionY);
        if ((f2 != 0.0F) && (!isGutterDrag(this.mLastMotionX, f2)) && (canScroll(this, false, (int)f2, (int)f1, (int)f4)))
        {
          this.mLastMotionX = f1;
          this.mLastMotionY = f4;
          this.mIsUnableToDrag = true;
          AppMethodBeat.o(107516);
          break;
        }
        if ((f3 > this.mTouchSlop) && (0.5F * f3 > f5))
        {
          this.mIsBeingDragged = true;
          setScrollState(1);
          if (f2 > 0.0F)
          {
            f5 = this.mInitialMotionX + this.mTouchSlop;
            label354: this.mLastMotionX = f5;
            this.mLastMotionY = f4;
            setScrollingCacheEnabled(true);
          }
        }
        while ((this.mIsBeingDragged) && (performDrag(f1)))
        {
          s.R(this);
          break;
          f5 = this.mInitialMotionX - this.mTouchSlop;
          break label354;
          if (f5 > this.mTouchSlop)
            this.mIsUnableToDrag = true;
        }
        f5 = paramMotionEvent.getX();
        this.mInitialMotionX = f5;
        this.mLastMotionX = f5;
        f5 = paramMotionEvent.getY();
        this.mInitialMotionY = f5;
        this.mLastMotionY = f5;
        this.mActivePointerId = paramMotionEvent.getPointerId(0);
        this.mIsUnableToDrag = false;
        this.mScroller.computeScrollOffset();
        if ((this.mScrollState == 2) && (Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough))
        {
          this.mScroller.abortAnimation();
          this.mPopulatePending = false;
          populate();
          this.mIsBeingDragged = true;
          setScrollState(1);
        }
        else
        {
          completeScroll(false);
          this.mIsBeingDragged = false;
          continue;
          onSecondaryPointerUp(paramMotionEvent);
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107509);
    int i = getChildCount();
    int j = paramInt3 - paramInt1;
    int k = paramInt4 - paramInt2;
    paramInt1 = getPaddingLeft();
    paramInt2 = getPaddingTop();
    paramInt3 = getPaddingRight();
    int m = getPaddingBottom();
    int n = getScrollX();
    int i1 = 0;
    int i2 = 0;
    Object localObject1;
    Object localObject2;
    int i3;
    int i4;
    if (i2 < i)
    {
      localObject1 = getChildAt(i2);
      if (((View)localObject1).getVisibility() == 8)
        break label644;
      localObject2 = (WxViewPager.LayoutParams)((View)localObject1).getLayoutParams();
      if (!((WxViewPager.LayoutParams)localObject2).Nq)
        break label644;
      paramInt4 = ((WxViewPager.LayoutParams)localObject2).gravity;
      i3 = ((WxViewPager.LayoutParams)localObject2).gravity;
      switch (paramInt4 & 0x7)
      {
      case 2:
      case 4:
      default:
        paramInt4 = paramInt1;
        i4 = paramInt3;
        paramInt3 = paramInt1;
        paramInt1 = i4;
        label169: switch (i3 & 0x70)
        {
        default:
          i4 = paramInt2;
          label211: paramInt4 += n;
          ((View)localObject1).layout(paramInt4, i4, ((View)localObject1).getMeasuredWidth() + paramInt4, ((View)localObject1).getMeasuredHeight() + i4);
          paramInt4 = i1 + 1;
        case 48:
        case 16:
        case 80:
        }
        break;
      case 3:
      case 1:
      case 5:
      }
    }
    while (true)
    {
      i2++;
      i4 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = i4;
      i1 = paramInt4;
      break;
      i4 = paramInt1 + ((View)localObject1).getMeasuredWidth();
      paramInt4 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = i4;
      break label169;
      i4 = Math.max((j - ((View)localObject1).getMeasuredWidth()) / 2, paramInt1);
      paramInt4 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = paramInt4;
      paramInt4 = i4;
      break label169;
      paramInt4 = ((View)localObject1).getMeasuredWidth();
      i4 = ((View)localObject1).getMeasuredWidth();
      paramInt4 = j - paramInt3 - paramInt4;
      i4 = paramInt3 + i4;
      paramInt3 = paramInt1;
      paramInt1 = i4;
      break label169;
      i3 = paramInt2 + ((View)localObject1).getMeasuredHeight();
      i4 = paramInt2;
      paramInt2 = i3;
      break label211;
      i4 = Math.max((k - ((View)localObject1).getMeasuredHeight()) / 2, paramInt2);
      break label211;
      i4 = k - m - ((View)localObject1).getMeasuredHeight();
      m += ((View)localObject1).getMeasuredHeight();
      break label211;
      paramInt4 = j - paramInt1 - paramInt3;
      for (paramInt3 = 0; paramInt3 < i; paramInt3++)
      {
        localObject2 = getChildAt(paramInt3);
        if (((View)localObject2).getVisibility() != 8)
        {
          localObject1 = (WxViewPager.LayoutParams)((View)localObject2).getLayoutParams();
          if (!((WxViewPager.LayoutParams)localObject1).Nq)
          {
            WxViewPager.b localb = infoForChild((View)localObject2);
            if (localb != null)
            {
              float f = paramInt4;
              i4 = (int)(localb.offset * f) + paramInt1;
              if (((WxViewPager.LayoutParams)localObject1).Nr)
              {
                ((WxViewPager.LayoutParams)localObject1).Nr = false;
                f = paramInt4;
                ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec((int)(((WxViewPager.LayoutParams)localObject1).widthFactor * f), 1073741824), View.MeasureSpec.makeMeasureSpec(k - paramInt2 - m, 1073741824));
              }
              ((View)localObject2).layout(i4, paramInt2, ((View)localObject2).getMeasuredWidth() + i4, ((View)localObject2).getMeasuredHeight() + paramInt2);
            }
          }
        }
      }
      this.mTopPageBounds = paramInt2;
      this.mBottomPageBounds = (k - m);
      this.mDecorChildCount = i1;
      if (this.mFirstLayout)
        scrollToItem(this.mCurItem, false, 0, false);
      this.mFirstLayout = false;
      AppMethodBeat.o(107509);
      return;
      label644: paramInt4 = i1;
      i4 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = i4;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107506);
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    paramInt1 = getMeasuredWidth();
    this.mGutterSize = Math.min(paramInt1 / 10, this.mDefaultGutterSize);
    paramInt1 = paramInt1 - getPaddingLeft() - getPaddingRight();
    paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i = getChildCount();
    int j = 0;
    Object localObject1;
    int k;
    int m;
    Object localObject2;
    int n;
    int i1;
    label187: int i2;
    if (j < i)
    {
      localObject1 = getChildAt(j);
      k = paramInt1;
      m = paramInt2;
      if (((View)localObject1).getVisibility() != 8)
      {
        localObject2 = (WxViewPager.LayoutParams)((View)localObject1).getLayoutParams();
        k = paramInt1;
        m = paramInt2;
        if (localObject2 != null)
        {
          k = paramInt1;
          m = paramInt2;
          if (((WxViewPager.LayoutParams)localObject2).Nq)
          {
            m = ((WxViewPager.LayoutParams)localObject2).gravity & 0x7;
            n = ((WxViewPager.LayoutParams)localObject2).gravity & 0x70;
            i1 = -2147483648;
            k = -2147483648;
            if ((n != 48) && (n != 80))
              break label334;
            n = 1;
            if ((m != 3) && (m != 5))
              break label340;
            i2 = 1;
            label202: if (n == 0)
              break label346;
            m = 1073741824;
            label212: if (((WxViewPager.LayoutParams)localObject2).width == -2)
              break label541;
            i1 = 1073741824;
            if (((WxViewPager.LayoutParams)localObject2).width == -1)
              break label535;
            m = ((WxViewPager.LayoutParams)localObject2).width;
          }
        }
      }
    }
    while (true)
    {
      int i4;
      if (((WxViewPager.LayoutParams)localObject2).height != -2)
      {
        i3 = 1073741824;
        k = i3;
        if (((WxViewPager.LayoutParams)localObject2).height != -1)
        {
          i4 = ((WxViewPager.LayoutParams)localObject2).height;
          k = i3;
        }
      }
      for (int i3 = i4; ; i3 = paramInt2)
      {
        ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(m, i1), View.MeasureSpec.makeMeasureSpec(i3, k));
        if (n != 0)
        {
          m = paramInt2 - ((View)localObject1).getMeasuredHeight();
          k = paramInt1;
        }
        while (true)
        {
          j++;
          paramInt1 = k;
          paramInt2 = m;
          break;
          label334: n = 0;
          break label187;
          label340: i2 = 0;
          break label202;
          label346: m = i1;
          if (i2 == 0)
            break label212;
          k = 1073741824;
          m = i1;
          break label212;
          k = paramInt1;
          m = paramInt2;
          if (i2 != 0)
          {
            k = paramInt1 - ((View)localObject1).getMeasuredWidth();
            m = paramInt2;
          }
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        m = getChildCount();
        for (paramInt2 = 0; paramInt2 < m; paramInt2++)
        {
          localObject2 = getChildAt(paramInt2);
          if (((View)localObject2).getVisibility() != 8)
          {
            localObject1 = (WxViewPager.LayoutParams)((View)localObject2).getLayoutParams();
            if (((localObject1 == null) || (!((WxViewPager.LayoutParams)localObject1).Nq)) && (localObject1 != null))
            {
              float f = paramInt1;
              ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec((int)(((WxViewPager.LayoutParams)localObject1).widthFactor * f), 1073741824), this.mChildHeightMeasureSpec);
            }
          }
        }
        AppMethodBeat.o(107506);
        return;
      }
      label535: m = paramInt1;
      continue;
      label541: i3 = paramInt1;
      i1 = m;
      m = i3;
    }
  }

  protected void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    AppMethodBeat.i(107512);
    int j;
    int k;
    int m;
    int i1;
    View localView;
    Object localObject;
    int i2;
    label124: int i4;
    if (this.mDecorChildCount > 0)
    {
      int i = getScrollX();
      j = getPaddingLeft();
      k = getPaddingRight();
      m = getWidth();
      int n = getChildCount();
      i1 = 0;
      if (i1 < n)
      {
        localView = getChildAt(i1);
        localObject = (WxViewPager.LayoutParams)localView.getLayoutParams();
        if (!((WxViewPager.LayoutParams)localObject).Nq)
          break label376;
        switch (((WxViewPager.LayoutParams)localObject).gravity & 0x7)
        {
        case 2:
        case 4:
        default:
          i2 = j;
          int i3 = i2 + i - localView.getLeft();
          i4 = k;
          i2 = j;
          if (i3 != 0)
          {
            localView.offsetLeftAndRight(i3);
            i2 = j;
            i4 = k;
          }
          break;
        case 3:
        case 1:
        case 5:
        }
      }
    }
    while (true)
    {
      i1++;
      j = i2;
      k = i4;
      break;
      i4 = j + localView.getWidth();
      i2 = j;
      j = i4;
      break label124;
      i2 = Math.max((m - localView.getMeasuredWidth()) / 2, j);
      break label124;
      i2 = m - k - localView.getMeasuredWidth();
      k += localView.getMeasuredWidth();
      break label124;
      if (this.mOnPageChangeListener != null)
        this.mOnPageChangeListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
      if (this.mInternalPageChangeListener != null)
        this.mInternalPageChangeListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
      if (this.mPageTransformer != null)
      {
        j = getScrollX();
        paramInt2 = getChildCount();
        for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
        {
          localObject = getChildAt(paramInt1);
          if (!((WxViewPager.LayoutParams)((View)localObject).getLayoutParams()).Nq)
          {
            paramFloat = (((View)localObject).getLeft() - j) / getClientWidth();
            this.mPageTransformer.j((View)localObject, paramFloat);
          }
        }
      }
      this.mCalledSuper = true;
      AppMethodBeat.o(107512);
      return;
      label376: i4 = k;
      i2 = j;
    }
  }

  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    boolean bool = true;
    AppMethodBeat.i(107540);
    int i = getChildCount();
    int j;
    int k;
    if ((paramInt & 0x2) != 0)
    {
      j = 1;
      k = 0;
      if (k == i)
        break label117;
      View localView = getChildAt(k);
      if (localView.getVisibility() != 0)
        break label107;
      WxViewPager.b localb = infoForChild(localView);
      if ((localb == null) || (localb.position != this.mCurItem) || (!localView.requestFocus(paramInt, paramRect)))
        break label107;
      AppMethodBeat.o(107540);
    }
    while (true)
    {
      return bool;
      k = i - 1;
      j = -1;
      i = -1;
      break;
      label107: k += j;
      break;
      label117: AppMethodBeat.o(107540);
      bool = false;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(107499);
    if (!(paramParcelable instanceof WxViewPager.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      AppMethodBeat.o(107499);
    }
    while (true)
    {
      return;
      paramParcelable = (WxViewPager.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      if (this.mAdapter != null)
      {
        this.mAdapter.restoreState(paramParcelable.Nt, paramParcelable.Nu);
        setCurrentItemInternal(paramParcelable.position, false, true);
        AppMethodBeat.o(107499);
      }
      else
      {
        this.mRestoredCurItem = paramParcelable.position;
        this.mRestoredAdapterState = paramParcelable.Nt;
        this.mRestoredClassLoader = paramParcelable.Nu;
        AppMethodBeat.o(107499);
      }
    }
  }

  public Parcelable onSaveInstanceState()
  {
    AppMethodBeat.i(107498);
    WxViewPager.SavedState localSavedState = new WxViewPager.SavedState(super.onSaveInstanceState());
    localSavedState.position = this.mCurItem;
    if (this.mAdapter != null)
      localSavedState.Nt = this.mAdapter.saveState();
    AppMethodBeat.o(107498);
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107507);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      recomputeScrollPosition(paramInt1, paramInt3, this.mPageMargin, this.mPageMargin);
    AppMethodBeat.o(107507);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    boolean bool1 = false;
    AppMethodBeat.i(107517);
    if (this.mFakeDragging)
    {
      AppMethodBeat.o(107517);
      bool1 = true;
    }
    while (true)
    {
      return bool1;
      if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      {
        AppMethodBeat.o(107517);
      }
      else
      {
        if ((this.mAdapter != null) && (this.mAdapter.getCount() != 0))
          break;
        AppMethodBeat.o(107517);
      }
    }
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    int j = i;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default:
      j = i;
    case 4:
    case 0:
    case 2:
    case 1:
    case 3:
    case 5:
    case 6:
    }
    while (true)
    {
      if (j != 0)
        s.R(this);
      AppMethodBeat.o(107517);
      bool1 = true;
      break;
      this.mScroller.abortAnimation();
      this.mPopulatePending = false;
      populate();
      this.mIsBeingDragged = true;
      setScrollState(1);
      float f1 = paramMotionEvent.getX();
      this.mInitialMotionX = f1;
      this.mLastMotionX = f1;
      f1 = paramMotionEvent.getY();
      this.mInitialMotionY = f1;
      this.mLastMotionY = f1;
      this.mActivePointerId = paramMotionEvent.getPointerId(0);
      j = i;
      continue;
      float f3;
      if (!this.mIsBeingDragged)
      {
        j = paramMotionEvent.findPointerIndex(this.mActivePointerId);
        float f2 = paramMotionEvent.getX(j);
        f1 = Math.abs(f2 - this.mLastMotionX);
        f3 = paramMotionEvent.getY(j);
        float f4 = Math.abs(f3 - this.mLastMotionY);
        if ((f1 > this.mTouchSlop) && (f1 > f4))
        {
          this.mIsBeingDragged = true;
          if (f2 - this.mInitialMotionX <= 0.0F)
            break label412;
        }
      }
      label412: for (f1 = this.mInitialMotionX + this.mTouchSlop; ; f1 = this.mInitialMotionX - this.mTouchSlop)
      {
        this.mLastMotionX = f1;
        this.mLastMotionY = f3;
        setScrollState(1);
        setScrollingCacheEnabled(true);
        j = i;
        if (!this.mIsBeingDragged)
          break;
        bool2 = performDrag(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.mActivePointerId))) | false;
        break;
      }
      boolean bool2 = i;
      if (this.mIsBeingDragged)
      {
        Object localObject = this.mVelocityTracker;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.mMaximumVelocity);
        int n = (int)((VelocityTracker)localObject).getXVelocity(this.mActivePointerId);
        this.mPopulatePending = true;
        int k = getClientWidth();
        i = getScrollX();
        localObject = infoForCurrentScrollPosition();
        if (localObject != null)
        {
          int i1 = ((WxViewPager.b)localObject).position;
          f1 = (i / k - ((WxViewPager.b)localObject).offset) / ((WxViewPager.b)localObject).widthFactor;
          i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
          k = i;
          if (i < 0)
            k = 0;
          setCurrentItemInternal(determineTargetPage(i1, f1, n, (int)(paramMotionEvent.getX(k) - this.mInitialMotionX)), true, true, n);
        }
        this.mActivePointerId = -1;
        endDrag();
        bool1 = this.mLeftEdge.eL();
        boolean bool3 = this.mRightEdge.eL() | bool1;
        continue;
        bool3 = i;
        if (this.mIsBeingDragged)
        {
          scrollToItem(this.mCurItem, true, 0, false);
          this.mActivePointerId = -1;
          endDrag();
          bool1 = this.mLeftEdge.eL();
          bool3 = this.mRightEdge.eL() | bool1;
          continue;
          int m = paramMotionEvent.getActionIndex();
          this.mLastMotionX = paramMotionEvent.getX(m);
          this.mActivePointerId = paramMotionEvent.getPointerId(m);
          m = i;
          continue;
          onSecondaryPointerUp(paramMotionEvent);
          this.mLastMotionX = paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.mActivePointerId));
          m = i;
        }
      }
    }
  }

  boolean pageLeft()
  {
    boolean bool = true;
    AppMethodBeat.i(107536);
    if (this.mCurItem > 0)
    {
      setCurrentItem(this.mCurItem - 1, true);
      AppMethodBeat.o(107536);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107536);
    }
  }

  boolean pageRight()
  {
    boolean bool = true;
    AppMethodBeat.i(107537);
    if ((this.mAdapter != null) && (this.mCurItem < this.mAdapter.getCount() - 1))
    {
      setCurrentItem(this.mCurItem + 1, true);
      AppMethodBeat.o(107537);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107537);
    }
  }

  void populate()
  {
    AppMethodBeat.i(107494);
    populate(this.mCurItem);
    AppMethodBeat.o(107494);
  }

  void populate(int paramInt)
  {
    AppMethodBeat.i(107495);
    Object localObject1 = null;
    int i = 2;
    int j;
    if (this.mCurItem != paramInt)
    {
      if (this.mCurItem < paramInt)
      {
        j = 66;
        localObject1 = infoForPosition(this.mCurItem);
        this.mCurItem = paramInt;
        i = j;
      }
    }
    else
    {
      if (this.mAdapter != null)
        break label72;
      sortChildDrawingOrder();
      AppMethodBeat.o(107495);
    }
    while (true)
    {
      return;
      j = 17;
      break;
      label72: if (this.mPopulatePending)
      {
        sortChildDrawingOrder();
        AppMethodBeat.o(107495);
      }
      else
      {
        if (getWindowToken() != null)
          break label108;
        AppMethodBeat.o(107495);
      }
    }
    label108: this.mAdapter.startUpdate(this);
    paramInt = this.mOffscreenPageLimit;
    int k = Math.max(0, this.mCurItem - paramInt);
    int m = this.mAdapter.getCount();
    int n = Math.min(m - 1, paramInt + this.mCurItem);
    Object localObject3;
    if (m != this.mExpectedAdapterCount)
      try
      {
        Object localObject2 = getResources().getResourceName(getId());
        localObject2 = new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + m + " Pager id: " + (String)localObject2 + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
        AppMethodBeat.o(107495);
        throw ((Throwable)localObject2);
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        while (true)
          localObject3 = Integer.toHexString(getId());
      }
    paramInt = 0;
    label284: if (paramInt < this.mItems.size())
    {
      localObject3 = (WxViewPager.b)this.mItems.get(paramInt);
      if (((WxViewPager.b)localObject3).position >= this.mCurItem)
        if (((WxViewPager.b)localObject3).position != this.mCurItem)
          break label1279;
    }
    while (true)
    {
      if ((localObject3 == null) && (m > 0));
      label385: label649: for (Object localObject4 = addNewItem(this.mCurItem, paramInt); ; localObject4 = localObject3)
      {
        float f1;
        int i1;
        int i2;
        float f2;
        label399: int i3;
        if (localObject4 != null)
        {
          f1 = 0.0F;
          i1 = paramInt - 1;
          if (i1 >= 0)
          {
            localObject3 = (WxViewPager.b)this.mItems.get(i1);
            i2 = getClientWidth();
            if (i2 > 0)
              break label521;
            f2 = 0.0F;
            i3 = this.mCurItem - 1;
            j = paramInt;
            paramInt = i1;
            label413: if (i3 < 0)
              break label649;
            if ((f1 < f2) || (i3 >= k))
              break label549;
            if (localObject3 == null)
              break label649;
            if ((i3 != ((WxViewPager.b)localObject3).position) || (((WxViewPager.b)localObject3).scrolling))
              break label1269;
            this.mItems.remove(paramInt);
            this.mAdapter.destroyItem(this, i3, ((WxViewPager.b)localObject3).object);
            paramInt--;
            if (paramInt < 0)
              break label543;
            localObject3 = (WxViewPager.b)this.mItems.get(paramInt);
            label500: j--;
          }
        }
        label521: label543: label549: label703: label715: label863: label879: label1269: 
        while (true)
        {
          i3--;
          break label413;
          paramInt++;
          break label284;
          localObject3 = null;
          break label385;
          f2 = 2.0F - ((WxViewPager.b)localObject4).widthFactor + getPaddingLeft() / i2;
          break label399;
          localObject3 = null;
          break label500;
          if ((localObject3 != null) && (i3 == ((WxViewPager.b)localObject3).position))
          {
            f1 += ((WxViewPager.b)localObject3).widthFactor;
            paramInt--;
            if (paramInt >= 0)
              localObject3 = (WxViewPager.b)this.mItems.get(paramInt);
            else
              localObject3 = null;
          }
          else
          {
            f1 += addNewItem(i3, paramInt + 1).widthFactor;
            j++;
            if (paramInt >= 0);
            for (localObject3 = (WxViewPager.b)this.mItems.get(paramInt); ; localObject3 = null)
              break;
            float f3 = ((WxViewPager.b)localObject4).widthFactor;
            i1 = j + 1;
            if (f3 < 2.0F)
            {
              Object localObject5;
              if (i1 < this.mItems.size())
              {
                localObject3 = (WxViewPager.b)this.mItems.get(i1);
                if (i2 > 0)
                  break label863;
                f2 = 0.0F;
                i3 = this.mCurItem + 1;
                localObject5 = localObject3;
                if (i3 >= m)
                  break label1013;
                if ((f3 < f2) || (i3 <= n))
                  break label892;
                if (localObject5 == null)
                  break label1013;
                localObject3 = localObject5;
                f1 = f3;
                paramInt = i1;
                if (i3 == localObject5.position)
                {
                  localObject3 = localObject5;
                  f1 = f3;
                  paramInt = i1;
                  if (!localObject5.scrolling)
                  {
                    this.mItems.remove(i1);
                    this.mAdapter.destroyItem(this, i3, localObject5.object);
                    if (i1 >= this.mItems.size())
                      break label879;
                    localObject3 = (WxViewPager.b)this.mItems.get(i1);
                    paramInt = i1;
                    f1 = f3;
                  }
                }
              }
              while (true)
              {
                i3++;
                localObject5 = localObject3;
                f3 = f1;
                i1 = paramInt;
                break label715;
                localObject3 = null;
                break;
                f2 = getPaddingRight() / i2 + 2.0F;
                break label703;
                localObject3 = null;
                f1 = f3;
                paramInt = i1;
                continue;
                label892: if ((localObject5 != null) && (i3 == localObject5.position))
                {
                  f1 = f3 + localObject5.widthFactor;
                  paramInt = i1 + 1;
                  if (paramInt < this.mItems.size())
                    localObject3 = (WxViewPager.b)this.mItems.get(paramInt);
                  else
                    localObject3 = null;
                }
                else
                {
                  localObject3 = addNewItem(i3, i1);
                  paramInt = i1 + 1;
                  f1 = f3 + ((WxViewPager.b)localObject3).widthFactor;
                  if (paramInt < this.mItems.size())
                    localObject3 = (WxViewPager.b)this.mItems.get(paramInt);
                  else
                    localObject3 = null;
                }
              }
            }
            label1013: calculatePageOffsets((WxViewPager.b)localObject4, j, (WxViewPager.b)localObject1);
            localObject1 = this.mAdapter;
            paramInt = this.mCurItem;
            if (localObject4 != null);
            for (localObject3 = ((WxViewPager.b)localObject4).object; ; localObject3 = null)
            {
              ((p)localObject1).setPrimaryItem(this, paramInt, localObject3);
              this.mAdapter.finishUpdate(this);
              j = getChildCount();
              for (paramInt = 0; paramInt < j; paramInt++)
              {
                localObject1 = getChildAt(paramInt);
                localObject3 = (WxViewPager.LayoutParams)((View)localObject1).getLayoutParams();
                ((WxViewPager.LayoutParams)localObject3).Ns = paramInt;
                if ((!((WxViewPager.LayoutParams)localObject3).Nq) && (((WxViewPager.LayoutParams)localObject3).widthFactor == 0.0F))
                {
                  localObject1 = infoForChild((View)localObject1);
                  if (localObject1 != null)
                  {
                    ((WxViewPager.LayoutParams)localObject3).widthFactor = ((WxViewPager.b)localObject1).widthFactor;
                    ((WxViewPager.LayoutParams)localObject3).position = ((WxViewPager.b)localObject1).position;
                  }
                }
              }
            }
            sortChildDrawingOrder();
            if (hasFocus())
            {
              localObject3 = findFocus();
              if (localObject3 != null);
              for (localObject3 = infoForAnyChild((View)localObject3); (localObject3 == null) || (((WxViewPager.b)localObject3).position != this.mCurItem); localObject3 = null)
                for (paramInt = 0; paramInt < getChildCount(); paramInt++)
                {
                  localObject1 = getChildAt(paramInt);
                  localObject3 = infoForChild((View)localObject1);
                  if ((localObject3 != null) && (((WxViewPager.b)localObject3).position == this.mCurItem) && (((View)localObject1).requestFocus(i)))
                    break;
                }
            }
            AppMethodBeat.o(107495);
            break;
          }
        }
      }
      label1279: localObject3 = null;
    }
  }

  public void removeView(View paramView)
  {
    AppMethodBeat.i(107501);
    if (this.mInLayout)
    {
      removeViewInLayout(paramView);
      AppMethodBeat.o(107501);
    }
    while (true)
    {
      return;
      super.removeView(paramView);
      AppMethodBeat.o(107501);
    }
  }

  public void setAdapter(p paramp)
  {
    AppMethodBeat.i(107472);
    if (this.mAdapter != null)
    {
      this.mAdapter.unregisterDataSetObserver(this.mObserver);
      this.mAdapter.startUpdate(this);
      for (int i = 0; i < this.mItems.size(); i++)
      {
        WxViewPager.b localb = (WxViewPager.b)this.mItems.get(i);
        this.mAdapter.destroyItem(this, localb.position, localb.object);
      }
      this.mAdapter.finishUpdate(this);
      this.mItems.clear();
      removeNonDecorViews();
      this.mCurItem = 0;
      scrollTo(0, 0);
    }
    this.mAdapter = paramp;
    this.mExpectedAdapterCount = 0;
    boolean bool;
    if (this.mAdapter != null)
    {
      if (this.mObserver == null)
        this.mObserver = new e((byte)0);
      this.mAdapter.registerDataSetObserver(this.mObserver);
      this.mPopulatePending = false;
      bool = this.mFirstLayout;
      this.mFirstLayout = true;
      this.mExpectedAdapterCount = this.mAdapter.getCount();
      if (this.mRestoredCurItem >= 0)
      {
        this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
        setCurrentItemInternal(this.mRestoredCurItem, false, true);
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        AppMethodBeat.o(107472);
      }
    }
    while (true)
    {
      return;
      if (!bool)
      {
        populate();
        AppMethodBeat.o(107472);
      }
      else
      {
        requestLayout();
        AppMethodBeat.o(107472);
      }
    }
  }

  void setChildrenDrawingOrderEnabledCompat(boolean paramBoolean)
  {
    AppMethodBeat.i(107481);
    if ((Build.VERSION.SDK_INT < 7) || (this.mSetChildrenDrawingOrderEnabled == null));
    try
    {
      this.mSetChildrenDrawingOrderEnabled = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] { Boolean.TYPE });
      while (true)
      {
        try
        {
          label43: if (this.mSetChildrenDrawingOrderEnabled != null)
            this.mSetChildrenDrawingOrderEnabled.invoke(this, new Object[] { Boolean.valueOf(paramBoolean) });
          AppMethodBeat.o(107481);
          return;
        }
        catch (Exception localException)
        {
        }
        AppMethodBeat.o(107481);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label43;
    }
  }

  public void setCurrentItem(int paramInt)
  {
    AppMethodBeat.i(107475);
    this.mPopulatePending = false;
    if (!this.mFirstLayout);
    for (boolean bool = true; ; bool = false)
    {
      setCurrentItemInternal(paramInt, bool, false);
      AppMethodBeat.o(107475);
      return;
    }
  }

  public void setCurrentItem(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(107476);
    this.mPopulatePending = false;
    setCurrentItemInternal(paramInt, paramBoolean, false);
    AppMethodBeat.o(107476);
  }

  void setCurrentItemInternal(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(107477);
    setCurrentItemInternal(paramInt, paramBoolean1, paramBoolean2, 0);
    AppMethodBeat.o(107477);
  }

  void setCurrentItemInternal(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(107478);
    if ((this.mAdapter == null) || (this.mAdapter.getCount() <= 0))
    {
      setScrollingCacheEnabled(false);
      AppMethodBeat.o(107478);
    }
    while (true)
    {
      return;
      if ((!paramBoolean2) && (this.mCurItem == paramInt1) && (this.mItems.size() != 0))
      {
        setScrollingCacheEnabled(false);
        AppMethodBeat.o(107478);
      }
      else
      {
        int i;
        if (paramInt1 < 0)
          i = 0;
        while (true)
        {
          paramInt1 = this.mOffscreenPageLimit;
          if ((i <= this.mCurItem + paramInt1) && (i >= this.mCurItem - paramInt1))
            break;
          for (paramInt1 = 0; paramInt1 < this.mItems.size(); paramInt1++)
            ((WxViewPager.b)this.mItems.get(paramInt1)).scrolling = true;
          i = paramInt1;
          if (paramInt1 >= this.mAdapter.getCount())
            i = this.mAdapter.getCount() - 1;
        }
        paramBoolean2 = bool;
        if (this.mCurItem != i)
          paramBoolean2 = true;
        if (this.mFirstLayout)
        {
          this.mCurItem = i;
          if ((paramBoolean2) && (this.mOnPageChangeListener != null))
            this.mOnPageChangeListener.onPageSelected(i);
          if ((paramBoolean2) && (this.mInternalPageChangeListener != null))
            this.mInternalPageChangeListener.onPageSelected(i);
          requestLayout();
          AppMethodBeat.o(107478);
        }
        else
        {
          populate(i);
          scrollToItem(i, paramBoolean1, paramInt2, paramBoolean2);
          AppMethodBeat.o(107478);
        }
      }
    }
  }

  ViewPager.OnPageChangeListener setInternalPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    ViewPager.OnPageChangeListener localOnPageChangeListener = this.mInternalPageChangeListener;
    this.mInternalPageChangeListener = paramOnPageChangeListener;
    return localOnPageChangeListener;
  }

  public void setLastMotion(float paramFloat1, float paramFloat2)
  {
    this.mLastMotionX = paramFloat1;
    this.mLastMotionY = paramFloat2;
  }

  public void setOffscreenPageLimit(int paramInt)
  {
    AppMethodBeat.i(107483);
    int i = paramInt;
    if (paramInt <= 0)
    {
      new StringBuilder("Requested offscreen page limit ").append(paramInt).append(" too small; defaulting to 1");
      i = 1;
    }
    if (i != this.mOffscreenPageLimit)
    {
      this.mOffscreenPageLimit = i;
      populate();
    }
    AppMethodBeat.o(107483);
  }

  void setOnAdapterChangeListener(WxViewPager.d paramd)
  {
    this.mAdapterChangeListener = paramd;
  }

  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.mOnPageChangeListener = paramOnPageChangeListener;
  }

  public void setPageMargin(int paramInt)
  {
    AppMethodBeat.i(107484);
    int i = this.mPageMargin;
    this.mPageMargin = paramInt;
    int j = getWidth();
    recomputeScrollPosition(j, j, paramInt, i);
    requestLayout();
    AppMethodBeat.o(107484);
  }

  public void setPageMarginDrawable(int paramInt)
  {
    AppMethodBeat.i(107486);
    setPageMarginDrawable(getContext().getResources().getDrawable(paramInt));
    AppMethodBeat.o(107486);
  }

  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(107485);
    this.mMarginDrawable = paramDrawable;
    if (paramDrawable != null)
      refreshDrawableState();
    if (paramDrawable == null);
    for (boolean bool = true; ; bool = false)
    {
      setWillNotDraw(bool);
      invalidate();
      AppMethodBeat.o(107485);
      return;
    }
  }

  public void setPageTransformer(boolean paramBoolean, ViewPager.d paramd)
  {
    int i = 1;
    AppMethodBeat.i(107480);
    boolean bool1;
    boolean bool2;
    label33: int j;
    if (Build.VERSION.SDK_INT >= 11)
    {
      if (paramd == null)
        break label86;
      bool1 = true;
      if (this.mPageTransformer == null)
        break label92;
      bool2 = true;
      if (bool1 == bool2)
        break label98;
      j = 1;
      label43: this.mPageTransformer = paramd;
      setChildrenDrawingOrderEnabledCompat(bool1);
      if (!bool1)
        break label104;
      if (paramBoolean)
        i = 2;
    }
    label86: label92: label98: label104: for (this.mDrawingOrder = i; ; this.mDrawingOrder = 0)
    {
      if (j != 0)
        populate();
      AppMethodBeat.o(107480);
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label33;
      j = 0;
      break label43;
    }
  }

  public void setScroller(Scroller paramScroller)
  {
    this.mScroller = paramScroller;
  }

  void smoothScrollTo(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107490);
    smoothScrollTo(paramInt1, paramInt2, 0);
    AppMethodBeat.o(107490);
  }

  void smoothScrollTo(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(107491);
    if (getChildCount() == 0)
    {
      setScrollingCacheEnabled(false);
      AppMethodBeat.o(107491);
    }
    int i;
    int j;
    int k;
    while (true)
    {
      return;
      i = getScrollX();
      j = getScrollY();
      k = paramInt1 - i;
      paramInt2 -= j;
      if ((k != 0) || (paramInt2 != 0))
        break;
      completeScroll(false);
      populate();
      setScrollState(0);
      AppMethodBeat.o(107491);
    }
    setScrollingCacheEnabled(true);
    setScrollState(2);
    paramInt1 = getClientWidth();
    int m = paramInt1 / 2;
    float f1 = Math.min(1.0F, Math.abs(k) * 1.0F / paramInt1);
    float f2 = m;
    float f3 = m;
    f1 = distanceInfluenceForSnapDuration(f1);
    paramInt3 = Math.abs(paramInt3);
    if (paramInt3 > 0);
    for (paramInt1 = Math.round(1000.0F * Math.abs((f3 * f1 + f2) / paramInt3)) * 4; ; paramInt1 = (int)((Math.abs(k) / (f3 * f2 + this.mPageMargin) + 3.0F) * 100.0F))
    {
      paramInt1 = Math.min(paramInt1, 600);
      this.mScroller.startScroll(i, j, k, paramInt2, paramInt1);
      s.R(this);
      AppMethodBeat.o(107491);
      break;
      f3 = paramInt1;
      f2 = this.mAdapter.getPageWidth(this.mCurItem);
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(107487);
    boolean bool;
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.mMarginDrawable))
    {
      bool = true;
      AppMethodBeat.o(107487);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107487);
    }
  }

  final class e extends DataSetObserver
  {
    private e()
    {
    }

    public final void onChanged()
    {
      AppMethodBeat.i(107459);
      WxViewPager.this.dataSetChanged();
      AppMethodBeat.o(107459);
    }

    public final void onInvalidated()
    {
      AppMethodBeat.i(107460);
      WxViewPager.this.dataSetChanged();
      AppMethodBeat.o(107460);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.mogic.WxViewPager
 * JD-Core Version:    0.6.2
 */