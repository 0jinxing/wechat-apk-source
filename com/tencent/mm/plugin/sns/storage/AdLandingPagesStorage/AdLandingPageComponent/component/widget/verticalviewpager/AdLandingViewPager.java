package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.os.d;
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
import android.view.View.BaseSavedState;
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

public class AdLandingViewPager extends ViewGroup
{
  private static final Comparator<AdLandingViewPager.b> COMPARATOR;
  private static final int[] LAYOUT_ATTRS;
  private static final f rcO;
  private static final Interpolator sInterpolator;
  int mActivePointerId;
  private p mAdapter;
  private int mBottomPageBounds;
  private boolean mCalledSuper;
  private int mChildHeightMeasureSpec;
  private int mChildWidthMeasureSpec;
  private int mCloseEnough;
  private int mCurItem;
  private int mDecorChildCount;
  private int mDefaultGutterSize;
  int mDrawingOrder;
  private ArrayList<View> mDrawingOrderedChildren;
  private final Runnable mEndScrollRunnable;
  private int mExpectedAdapterCount;
  long mFakeDragBeginTime;
  boolean mFakeDragging;
  private boolean mFirstLayout;
  private float mFirstOffset;
  private int mFlingDistance;
  private int mGutterSize;
  private boolean mInLayout;
  float mInitialMotionX;
  private float mInitialMotionY;
  private ViewPager.OnPageChangeListener mInternalPageChangeListener;
  boolean mIsBeingDragged;
  private boolean mIsUnableToDrag;
  private final ArrayList<AdLandingViewPager.b> mItems;
  float mLastMotionX;
  private float mLastMotionY;
  private float mLastOffset;
  private i mLeftEdge;
  private Drawable mMarginDrawable;
  int mMaximumVelocity;
  private int mMinimumVelocity;
  private boolean mNeedCalculatePageOffsets;
  private int mOffscreenPageLimit;
  private ViewPager.OnPageChangeListener mOnPageChangeListener;
  private int mPageMargin;
  ViewPager.d mPageTransformer;
  boolean mPopulatePending;
  private Parcelable mRestoredAdapterState;
  private ClassLoader mRestoredClassLoader;
  private int mRestoredCurItem;
  private i mRightEdge;
  private int mScrollState;
  private Scroller mScroller;
  private boolean mScrollingCacheEnabled;
  private Method mSetChildrenDrawingOrderEnabled;
  private final Rect mTempRect;
  private int mTopPageBounds;
  private int mTouchSlop;
  VelocityTracker mVelocityTracker;
  private final AdLandingViewPager.b rcL;
  private AdLandingViewPager.e rcM;
  private AdLandingViewPager.d rcN;

  static
  {
    AppMethodBeat.i(37588);
    LAYOUT_ATTRS = new int[] { 16842931 };
    COMPARATOR = new AdLandingViewPager.1();
    sInterpolator = new Interpolator()
    {
      public final float getInterpolation(float paramAnonymousFloat)
      {
        paramAnonymousFloat -= 1.0F;
        return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
      }
    };
    rcO = new f();
    AppMethodBeat.o(37588);
  }

  public AdLandingViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(37518);
    this.mItems = new ArrayList();
    this.rcL = new AdLandingViewPager.b();
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
    this.mEndScrollRunnable = new AdLandingViewPager.3(this);
    this.mScrollState = 0;
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    paramAttributeSet = getContext();
    this.mScroller = new Scroller(paramAttributeSet, sInterpolator);
    paramContext = ViewConfiguration.get(paramAttributeSet);
    float f = paramAttributeSet.getResources().getDisplayMetrics().density;
    this.mTouchSlop = t.a(paramContext);
    this.mMinimumVelocity = ((int)(400.0F * f));
    this.mMaximumVelocity = paramContext.getScaledMaximumFlingVelocity();
    this.mLeftEdge = new i(paramAttributeSet);
    this.mRightEdge = new i(paramAttributeSet);
    this.mFlingDistance = ((int)(25.0F * f));
    this.mCloseEnough = ((int)(2.0F * f));
    this.mDefaultGutterSize = ((int)(16.0F * f));
    s.a(this, new AdLandingViewPager.c(this));
    if (s.S(this) == 0)
      s.o(this, 1);
    AppMethodBeat.o(37518);
  }

  private AdLandingViewPager.b Dx(int paramInt)
  {
    AppMethodBeat.i(37550);
    int i = 0;
    AdLandingViewPager.b localb;
    if (i < this.mItems.size())
    {
      localb = (AdLandingViewPager.b)this.mItems.get(i);
      if (localb.position == paramInt)
        AppMethodBeat.o(37550);
    }
    while (true)
    {
      return localb;
      i++;
      break;
      localb = null;
      AppMethodBeat.o(37550);
    }
  }

  private void a(AdLandingViewPager.b paramb1, int paramInt, AdLandingViewPager.b paramb2)
  {
    AppMethodBeat.i(37543);
    int i = this.mAdapter.getCount();
    int j = getClientWidth();
    float f1;
    if (j > 0)
    {
      f1 = this.mPageMargin / j;
      if (paramb2 == null)
        break label397;
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
          break label397;
        for (paramb2 = (AdLandingViewPager.b)this.mItems.get(k); ; paramb2 = (AdLandingViewPager.b)this.mItems.get(k))
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
        for (paramb2 = (AdLandingViewPager.b)this.mItems.get(k); ; paramb2 = (AdLandingViewPager.b)this.mItems.get(k))
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
    label397: int m = this.mItems.size();
    float f3 = paramb1.offset;
    j = paramb1.position - 1;
    if (paramb1.position == 0)
    {
      f2 = paramb1.offset;
      this.mFirstOffset = f2;
      if (paramb1.position != i - 1)
        break label535;
      f2 = paramb1.offset + paramb1.widthFactor - 1.0F;
      label463: this.mLastOffset = f2;
      k = paramInt - 1;
      f2 = f3;
    }
    while (true)
    {
      if (k < 0)
        break label582;
      paramb2 = (AdLandingViewPager.b)this.mItems.get(k);
      while (true)
        if (j > paramb2.position)
        {
          f2 -= this.mAdapter.getPageWidth(j) + f1;
          j--;
          continue;
          f2 = -3.402824E+038F;
          break;
          label535: f2 = 3.4028235E+38F;
          break label463;
        }
      f2 -= paramb2.widthFactor + f1;
      paramb2.offset = f2;
      if (paramb2.position == 0)
        this.mFirstOffset = f2;
      j--;
      k--;
    }
    label582: float f2 = paramb1.offset + paramb1.widthFactor + f1;
    int k = paramb1.position + 1;
    j = paramInt + 1;
    paramInt = k;
    while (j < m)
    {
      paramb1 = (AdLandingViewPager.b)this.mItems.get(j);
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
    AppMethodBeat.o(37543);
  }

  private boolean arrowScroll(int paramInt)
  {
    AppMethodBeat.i(37575);
    View localView = findFocus();
    Object localObject;
    int i;
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
        AppMethodBeat.o(37575);
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
    label299: label339: label345: label350: for (int j = 1; ; j = 0)
    {
      if (j == 0)
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

  private boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(37573);
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
        if ((paramInt2 + i >= localView.getLeft()) && (paramInt2 + i < localView.getRight()) && (paramInt3 + j >= localView.getTop()) && (paramInt3 + j < localView.getBottom()) && (canScroll(localView, true, paramInt1, paramInt2 + i - localView.getLeft(), paramInt3 + j - localView.getTop())))
        {
          paramBoolean = true;
          AppMethodBeat.o(37573);
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
        AppMethodBeat.o(37573);
      }
      else
      {
        paramBoolean = false;
        AppMethodBeat.o(37573);
      }
    }
  }

  private void completeScroll(boolean paramBoolean)
  {
    AppMethodBeat.i(37559);
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
        m = this.mScroller.getCurrX();
        int n = this.mScroller.getCurrY();
        if ((j != m) || (k != n))
          scrollTo(m, n);
      }
      this.mPopulatePending = false;
      int m = 0;
      k = i;
      for (i = m; i < this.mItems.size(); i++)
      {
        AdLandingViewPager.b localb = (AdLandingViewPager.b)this.mItems.get(i);
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
        AppMethodBeat.o(37559);
      }
    while (true)
    {
      return;
      this.mEndScrollRunnable.run();
      AppMethodBeat.o(37559);
    }
  }

  private AdLandingViewPager.b dD(View paramView)
  {
    AppMethodBeat.i(37548);
    int i = 0;
    if (i < this.mItems.size())
    {
      AdLandingViewPager.b localb = (AdLandingViewPager.b)this.mItems.get(i);
      if (this.mAdapter.isViewFromObject(paramView, localb.object))
      {
        AppMethodBeat.o(37548);
        paramView = localb;
      }
    }
    while (true)
    {
      return paramView;
      i++;
      break;
      paramView = null;
      AppMethodBeat.o(37548);
    }
  }

  private AdLandingViewPager.b dE(View paramView)
  {
    AppMethodBeat.i(37549);
    ViewParent localViewParent = paramView.getParent();
    if (localViewParent != this)
      if ((localViewParent == null) || (!(localViewParent instanceof View)))
      {
        paramView = null;
        AppMethodBeat.o(37549);
      }
    while (true)
    {
      return paramView;
      paramView = (View)localViewParent;
      break;
      paramView = dD(paramView);
      AppMethodBeat.o(37549);
    }
  }

  private static float distanceInfluenceForSnapDuration(float paramFloat)
  {
    AppMethodBeat.i(37536);
    paramFloat = (float)Math.sin((float)((paramFloat - 0.5F) * 0.47123891676382D));
    AppMethodBeat.o(37536);
    return paramFloat;
  }

  private int firstItemPosForDetermine()
  {
    AppMethodBeat.i(37565);
    int i = ((AdLandingViewPager.b)this.mItems.get(0)).position;
    AppMethodBeat.o(37565);
    return i;
  }

  private void fo(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37537);
    if (getChildCount() == 0)
    {
      setScrollingCacheEnabled(false);
      AppMethodBeat.o(37537);
    }
    int i;
    int j;
    int k;
    int m;
    while (true)
    {
      return;
      i = getScrollX();
      j = getScrollY();
      k = paramInt1 - i;
      m = 0 - j;
      if ((k != 0) || (m != 0))
        break;
      completeScroll(false);
      populate();
      setScrollState(0);
      AppMethodBeat.o(37537);
    }
    setScrollingCacheEnabled(true);
    setScrollState(2);
    paramInt1 = getClientWidth();
    int n = paramInt1 / 2;
    float f1 = Math.min(1.0F, Math.abs(k) * 1.0F / paramInt1);
    float f2 = n;
    float f3 = n;
    f1 = distanceInfluenceForSnapDuration(f1);
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0);
    for (paramInt1 = Math.round(1000.0F * Math.abs((f3 * f1 + f2) / paramInt2)) * 4; ; paramInt1 = (int)((Math.abs(k) / (f2 * f3 + this.mPageMargin) + 3.0F) * 100.0F))
    {
      paramInt1 = Math.min(paramInt1, 600);
      this.mScroller.startScroll(i, j, k, m, paramInt1);
      s.R(this);
      AppMethodBeat.o(37537);
      break;
      f2 = paramInt1;
      f3 = this.mAdapter.getPageWidth(this.mCurItem);
    }
  }

  private AdLandingViewPager.b fp(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37538);
    AdLandingViewPager.b localb = new AdLandingViewPager.b();
    localb.position = paramInt1;
    localb.object = this.mAdapter.instantiateItem(this, paramInt1);
    localb.widthFactor = this.mAdapter.getPageWidth(paramInt1);
    if ((paramInt2 < 0) || (paramInt2 >= this.mItems.size()))
      this.mItems.add(localb);
    while (true)
    {
      AppMethodBeat.o(37538);
      return localb;
      this.mItems.add(paramInt2, localb);
    }
  }

  private Rect getChildRectInPagerCoordinates(Rect paramRect, View paramView)
  {
    AppMethodBeat.i(37576);
    if (paramRect == null)
      paramRect = new Rect();
    while (true)
    {
      if (paramView == null)
      {
        paramRect.set(0, 0, 0, 0);
        AppMethodBeat.o(37576);
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
        AppMethodBeat.o(37576);
      }
    }
  }

  private int lastItemPosForDetermine()
  {
    AppMethodBeat.i(37566);
    int i = ((AdLandingViewPager.b)this.mItems.get(this.mItems.size() - 1)).position;
    AppMethodBeat.o(37566);
    return i;
  }

  private void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    AppMethodBeat.i(37558);
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
        localObject = (AdLandingViewPager.LayoutParams)localView.getLayoutParams();
        if (!((AdLandingViewPager.LayoutParams)localObject).Nq)
          break label376;
        switch (((AdLandingViewPager.LayoutParams)localObject).gravity & 0x7)
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
        paramInt2 = getScrollX();
        j = getChildCount();
        for (paramInt1 = 0; paramInt1 < j; paramInt1++)
        {
          localObject = getChildAt(paramInt1);
          if (!((AdLandingViewPager.LayoutParams)((View)localObject).getLayoutParams()).Nq)
          {
            paramFloat = (((View)localObject).getLeft() - paramInt2) / getClientWidth();
            this.mPageTransformer.j((View)localObject, paramFloat);
          }
        }
      }
      this.mCalledSuper = true;
      AppMethodBeat.o(37558);
      return;
      label376: i4 = k;
      i2 = j;
    }
  }

  private void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(37570);
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
      AppMethodBeat.o(37570);
      return;
    }
  }

  private boolean pageLeft()
  {
    AppMethodBeat.i(37577);
    boolean bool;
    if (this.mCurItem > 0)
    {
      setCurrentItem$2563266(this.mCurItem - 1);
      bool = true;
      AppMethodBeat.o(37577);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37577);
    }
  }

  private boolean pageRight()
  {
    AppMethodBeat.i(37578);
    boolean bool;
    if ((this.mAdapter != null) && (this.mCurItem < this.mAdapter.getCount() - 1))
    {
      setCurrentItem$2563266(this.mCurItem + 1);
      bool = true;
      AppMethodBeat.o(37578);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37578);
    }
  }

  private boolean pageScrolled(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(37557);
    Object localObject;
    if (this.mItems.size() == 0)
    {
      this.mCalledSuper = false;
      onPageScrolled(0, 0.0F, 0);
      if (!this.mCalledSuper)
      {
        localObject = new IllegalStateException("onPageScrolled did not call superclass implementation");
        AppMethodBeat.o(37557);
        throw ((Throwable)localObject);
      }
      AppMethodBeat.o(37557);
    }
    while (true)
    {
      return bool;
      localObject = cpZ();
      int i = getClientWidth();
      int j = this.mPageMargin;
      float f = this.mPageMargin / i;
      int k = ((AdLandingViewPager.b)localObject).position;
      f = (paramInt / i - ((AdLandingViewPager.b)localObject).offset) / (((AdLandingViewPager.b)localObject).widthFactor + f);
      paramInt = (int)((j + i) * f);
      this.mCalledSuper = false;
      onPageScrolled(k, f, paramInt);
      if (!this.mCalledSuper)
      {
        localObject = new IllegalStateException("onPageScrolled did not call superclass implementation");
        AppMethodBeat.o(37557);
        throw ((Throwable)localObject);
      }
      bool = true;
      AppMethodBeat.o(37557);
    }
  }

  private boolean performDrag(float paramFloat)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(37562);
    float f1 = this.mLastMotionX;
    this.mLastMotionX = paramFloat;
    float f2 = getScrollX() + (f1 - paramFloat);
    int j = getClientWidth();
    paramFloat = j * this.mFirstOffset;
    float f3 = j;
    f1 = this.mLastOffset;
    AdLandingViewPager.b localb1 = (AdLandingViewPager.b)this.mItems.get(0);
    AdLandingViewPager.b localb2 = (AdLandingViewPager.b)this.mItems.get(this.mItems.size() - 1);
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
          AppMethodBeat.o(37562);
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
        f1 = f3 * f1;
      }
    }
  }

  private void populate(int paramInt)
  {
    AppMethodBeat.i(37541);
    Object localObject1 = null;
    int i = 2;
    int j;
    if (this.mCurItem != paramInt)
    {
      if (this.mCurItem < paramInt)
      {
        j = 66;
        localObject1 = Dx(this.mCurItem);
        this.mCurItem = paramInt;
        i = j;
      }
    }
    else
    {
      if (this.mAdapter != null)
        break label72;
      sortChildDrawingOrder();
      AppMethodBeat.o(37541);
    }
    while (true)
    {
      return;
      j = 17;
      break;
      label72: if (this.mPopulatePending)
      {
        sortChildDrawingOrder();
        AppMethodBeat.o(37541);
      }
      else
      {
        if (getWindowToken() != null)
          break label108;
        AppMethodBeat.o(37541);
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
        AppMethodBeat.o(37541);
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
      localObject3 = (AdLandingViewPager.b)this.mItems.get(paramInt);
      if (((AdLandingViewPager.b)localObject3).position >= this.mCurItem)
        if (((AdLandingViewPager.b)localObject3).position != this.mCurItem)
          break label1279;
    }
    while (true)
    {
      if ((localObject3 == null) && (m > 0));
      label385: label649: for (Object localObject4 = fp(this.mCurItem, paramInt); ; localObject4 = localObject3)
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
            localObject3 = (AdLandingViewPager.b)this.mItems.get(i1);
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
            if ((i3 != ((AdLandingViewPager.b)localObject3).position) || (((AdLandingViewPager.b)localObject3).scrolling))
              break label1269;
            this.mItems.remove(paramInt);
            this.mAdapter.destroyItem(this, i3, ((AdLandingViewPager.b)localObject3).object);
            paramInt--;
            if (paramInt < 0)
              break label543;
            localObject3 = (AdLandingViewPager.b)this.mItems.get(paramInt);
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
          f2 = 2.0F - ((AdLandingViewPager.b)localObject4).widthFactor + getPaddingLeft() / i2;
          break label399;
          localObject3 = null;
          break label500;
          if ((localObject3 != null) && (i3 == ((AdLandingViewPager.b)localObject3).position))
          {
            f1 += ((AdLandingViewPager.b)localObject3).widthFactor;
            paramInt--;
            if (paramInt >= 0)
              localObject3 = (AdLandingViewPager.b)this.mItems.get(paramInt);
            else
              localObject3 = null;
          }
          else
          {
            f1 += fp(i3, paramInt + 1).widthFactor;
            j++;
            if (paramInt >= 0);
            for (localObject3 = (AdLandingViewPager.b)this.mItems.get(paramInt); ; localObject3 = null)
              break;
            float f3 = ((AdLandingViewPager.b)localObject4).widthFactor;
            i1 = j + 1;
            if (f3 < 2.0F)
            {
              Object localObject5;
              if (i1 < this.mItems.size())
              {
                localObject3 = (AdLandingViewPager.b)this.mItems.get(i1);
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
                    localObject3 = (AdLandingViewPager.b)this.mItems.get(i1);
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
                    localObject3 = (AdLandingViewPager.b)this.mItems.get(paramInt);
                  else
                    localObject3 = null;
                }
                else
                {
                  localObject3 = fp(i3, i1);
                  paramInt = i1 + 1;
                  f1 = f3 + ((AdLandingViewPager.b)localObject3).widthFactor;
                  if (paramInt < this.mItems.size())
                    localObject3 = (AdLandingViewPager.b)this.mItems.get(paramInt);
                  else
                    localObject3 = null;
                }
              }
            }
            label1013: a((AdLandingViewPager.b)localObject4, j, (AdLandingViewPager.b)localObject1);
            localObject1 = this.mAdapter;
            paramInt = this.mCurItem;
            if (localObject4 != null);
            for (localObject3 = ((AdLandingViewPager.b)localObject4).object; ; localObject3 = null)
            {
              ((p)localObject1).setPrimaryItem(this, paramInt, localObject3);
              this.mAdapter.finishUpdate(this);
              j = getChildCount();
              for (paramInt = 0; paramInt < j; paramInt++)
              {
                localObject1 = getChildAt(paramInt);
                localObject3 = (AdLandingViewPager.LayoutParams)((View)localObject1).getLayoutParams();
                ((AdLandingViewPager.LayoutParams)localObject3).Ns = paramInt;
                if ((!((AdLandingViewPager.LayoutParams)localObject3).Nq) && (((AdLandingViewPager.LayoutParams)localObject3).widthFactor == 0.0F))
                {
                  localObject1 = dD((View)localObject1);
                  if (localObject1 != null)
                  {
                    ((AdLandingViewPager.LayoutParams)localObject3).widthFactor = ((AdLandingViewPager.b)localObject1).widthFactor;
                    ((AdLandingViewPager.LayoutParams)localObject3).position = ((AdLandingViewPager.b)localObject1).position;
                  }
                }
              }
            }
            sortChildDrawingOrder();
            if (hasFocus())
            {
              localObject3 = findFocus();
              if (localObject3 != null);
              for (localObject3 = dE((View)localObject3); (localObject3 == null) || (((AdLandingViewPager.b)localObject3).position != this.mCurItem); localObject3 = null)
                for (paramInt = 0; paramInt < getChildCount(); paramInt++)
                {
                  localObject3 = getChildAt(paramInt);
                  localObject1 = dD((View)localObject3);
                  if ((localObject1 != null) && (((AdLandingViewPager.b)localObject1).position == this.mCurItem) && (((View)localObject3).requestFocus(i)))
                    break;
                }
            }
            AppMethodBeat.o(37541);
            break;
          }
        }
      }
      label1279: localObject3 = null;
    }
  }

  private void recomputeScrollPosition(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(37554);
    if ((paramInt2 > 0) && (!this.mItems.isEmpty()))
    {
      int i = getPaddingLeft();
      int j = getPaddingRight();
      int k = getPaddingLeft();
      int m = getPaddingRight();
      f = getScrollX() / (paramInt2 - k - m + paramInt4);
      paramInt2 = (int)((paramInt1 - i - j + paramInt3) * f);
      scrollTo(paramInt2, getScrollY());
      if (!this.mScroller.isFinished())
      {
        paramInt3 = this.mScroller.getDuration();
        paramInt4 = this.mScroller.timePassed();
        localb = Dx(this.mCurItem);
        this.mScroller.startScroll(paramInt2, 0, (int)(localb.offset * paramInt1), 0, paramInt3 - paramInt4);
      }
      AppMethodBeat.o(37554);
      return;
    }
    AdLandingViewPager.b localb = Dx(this.mCurItem);
    if (localb != null);
    for (float f = Math.min(localb.offset, this.mLastOffset); ; f = 0.0F)
    {
      paramInt1 = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 != getScrollX())
      {
        completeScroll(false);
        scrollTo(paramInt1, getScrollY());
      }
      AppMethodBeat.o(37554);
      break;
    }
  }

  private void scrollToItem(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    AppMethodBeat.i(37527);
    AdLandingViewPager.b localb = Dx(paramInt1);
    float f;
    if (localb != null)
      f = getClientWidth();
    for (int i = (int)(Math.max(this.mFirstOffset, Math.min(localb.offset, this.mLastOffset)) * f); ; i = 0)
    {
      if (paramBoolean1)
      {
        fo(i, paramInt2);
        if ((paramBoolean2) && (this.mOnPageChangeListener != null))
          this.mOnPageChangeListener.onPageSelected(paramInt1);
        if ((!paramBoolean2) || (this.mInternalPageChangeListener == null))
          break label175;
        this.mInternalPageChangeListener.onPageSelected(paramInt1);
        AppMethodBeat.o(37527);
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
        label175: AppMethodBeat.o(37527);
      }
    }
  }

  private void setCurrentItem$2563266(int paramInt)
  {
    AppMethodBeat.i(37524);
    this.mPopulatePending = false;
    setCurrentItemInternal(paramInt, true, false);
    AppMethodBeat.o(37524);
  }

  private void setCurrentItemInternal(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(37525);
    setCurrentItemInternal(paramInt, paramBoolean1, paramBoolean2, 0);
    AppMethodBeat.o(37525);
  }

  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.mScrollingCacheEnabled != paramBoolean)
      this.mScrollingCacheEnabled = paramBoolean;
  }

  private void sortChildDrawingOrder()
  {
    AppMethodBeat.i(37542);
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
      Collections.sort(this.mDrawingOrderedChildren, rcO);
    }
    AppMethodBeat.o(37542);
  }

  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37579);
    Assert.assertNotNull(paramArrayList);
    int i = paramArrayList.size();
    int j = getDescendantFocusability();
    if (j != 393216)
      for (int k = 0; k < getChildCount(); k++)
      {
        View localView = getChildAt(k);
        if (localView.getVisibility() == 0)
        {
          AdLandingViewPager.b localb = dD(localView);
          if ((localb != null) && (localb.position == this.mCurItem))
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
    if ((j != 262144) || (i == paramArrayList.size()))
      if (!isFocusable())
        AppMethodBeat.o(37579);
    while (true)
    {
      return;
      if (((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode()))
      {
        AppMethodBeat.o(37579);
      }
      else
      {
        paramArrayList.add(this);
        AppMethodBeat.o(37579);
      }
    }
  }

  public void addTouchables(ArrayList<View> paramArrayList)
  {
    AppMethodBeat.i(37580);
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        AdLandingViewPager.b localb = dD(localView);
        if ((localb != null) && (localb.position == this.mCurItem))
          localView.addTouchables(paramArrayList);
      }
    }
    AppMethodBeat.o(37580);
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(37546);
    if (!checkLayoutParams(paramLayoutParams))
      paramLayoutParams = generateLayoutParams(paramLayoutParams);
    while (true)
    {
      Assert.assertNotNull(paramLayoutParams);
      AdLandingViewPager.LayoutParams localLayoutParams = (AdLandingViewPager.LayoutParams)paramLayoutParams;
      localLayoutParams.Nq |= paramView instanceof AdLandingViewPager.a;
      if (this.mInLayout)
      {
        if ((localLayoutParams != null) && (localLayoutParams.Nq))
        {
          paramView = new IllegalStateException("Cannot add pager decor view during layout");
          AppMethodBeat.o(37546);
          throw paramView;
        }
        localLayoutParams.Nr = true;
        addViewInLayout(paramView, paramInt, paramLayoutParams);
        AppMethodBeat.o(37546);
      }
      while (true)
      {
        return;
        super.addView(paramView, paramInt, paramLayoutParams);
        AppMethodBeat.o(37546);
      }
    }
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(37572);
    if (this.mAdapter == null)
      AppMethodBeat.o(37572);
    while (true)
    {
      return bool;
      int i = getClientWidth();
      int j = getScrollX();
      if (paramInt < 0)
      {
        if (j > (int)(i * this.mFirstOffset))
        {
          AppMethodBeat.o(37572);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(37572);
        }
      }
      else if (paramInt > 0)
      {
        if (j < (int)(i * this.mLastOffset))
        {
          AppMethodBeat.o(37572);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(37572);
        }
      }
      else
        AppMethodBeat.o(37572);
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(37585);
    boolean bool;
    if (((paramLayoutParams instanceof AdLandingViewPager.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams)))
    {
      bool = true;
      AppMethodBeat.o(37585);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37585);
    }
  }

  public void computeScroll()
  {
    AppMethodBeat.i(37556);
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
      AppMethodBeat.o(37556);
    }
    while (true)
    {
      return;
      completeScroll(true);
      AppMethodBeat.o(37556);
    }
  }

  final AdLandingViewPager.b cpZ()
  {
    AppMethodBeat.i(37563);
    int i = getClientWidth();
    float f1;
    float f2;
    label37: int j;
    int k;
    Object localObject;
    float f3;
    float f4;
    label54: AdLandingViewPager.b localb;
    if (i > 0)
    {
      f1 = getScrollX() / i;
      if (i <= 0)
        break label211;
      f2 = this.mPageMargin / i;
      j = -1;
      k = 1;
      i = 0;
      localObject = null;
      f3 = 0.0F;
      f4 = 0.0F;
      if (i >= this.mItems.size())
        break label252;
      localb = (AdLandingViewPager.b)this.mItems.get(i);
      if ((k != 0) || (localb.position == j + 1))
        break label261;
      localb = this.rcL;
      localb.offset = (f4 + f3 + f2);
      localb.position = (j + 1);
      localb.widthFactor = this.mAdapter.getPageWidth(localb.position);
      i--;
    }
    label261: 
    while (true)
    {
      f4 = localb.offset;
      f3 = localb.widthFactor;
      if ((k != 0) || (f1 >= f4))
      {
        if ((f1 >= f3 + f4 + f2) && (i != this.mItems.size() - 1))
          break label225;
        AppMethodBeat.o(37563);
        localObject = localb;
      }
      while (true)
      {
        return localObject;
        f1 = 0.0F;
        break;
        label211: f2 = 0.0F;
        break label37;
        AppMethodBeat.o(37563);
        continue;
        label225: j = localb.position;
        f3 = localb.widthFactor;
        i++;
        k = 0;
        localObject = localb;
        break label54;
        label252: AppMethodBeat.o(37563);
      }
    }
  }

  final void dataSetChanged()
  {
    AppMethodBeat.i(37539);
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
      localObject = (AdLandingViewPager.b)this.mItems.get(m);
      i2 = this.mAdapter.getItemPosition(((AdLandingViewPager.b)localObject).object);
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
        this.mAdapter.destroyItem(this, ((AdLandingViewPager.b)localObject).position, ((AdLandingViewPager.b)localObject).object);
        if (this.mCurItem != ((AdLandingViewPager.b)localObject).position)
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
      if (((AdLandingViewPager.b)localObject).position != i2)
      {
        if (((AdLandingViewPager.b)localObject).position == this.mCurItem)
          k = i2;
        ((AdLandingViewPager.b)localObject).position = i2;
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
            localObject = (AdLandingViewPager.LayoutParams)getChildAt(j).getLayoutParams();
            if (!((AdLandingViewPager.LayoutParams)localObject).Nq)
              ((AdLandingViewPager.LayoutParams)localObject).widthFactor = 0.0F;
          }
          setCurrentItemInternal(k, false, true);
          requestLayout();
        }
        AppMethodBeat.o(37539);
        return;
        label398: j = 1;
        i4 = m;
        i5 = k;
      }
    }
  }

  final int determineTargetPage(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(37564);
    if ((Math.abs(paramInt3) > this.mFlingDistance) && (Math.abs(paramInt2) > this.mMinimumVelocity))
    {
      if (paramInt2 > 0);
      while (true)
      {
        paramInt2 = paramInt1;
        if (this.mItems.size() > 0)
          paramInt2 = Math.max(firstItemPosForDetermine(), Math.min(paramInt1, lastItemPosForDetermine()));
        AppMethodBeat.o(37564);
        return paramInt2;
        paramInt1++;
      }
    }
    if (paramInt1 >= this.mCurItem);
    for (float f = 0.85F; ; f = 0.15F)
    {
      paramInt1 = (int)(f + (paramInt1 + paramFloat));
      break;
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(37574);
    if (!super.dispatchKeyEvent(paramKeyEvent))
      if (paramKeyEvent.getAction() != 0);
    switch (paramKeyEvent.getKeyCode())
    {
    default:
      bool2 = false;
      label62: if (bool2)
        AppMethodBeat.o(37574);
      break;
    case 21:
    case 22:
    case 61:
    }
    for (boolean bool2 = true; ; bool2 = bool1)
    {
      return bool2;
      bool2 = arrowScroll(17);
      break label62;
      bool2 = arrowScroll(66);
      break label62;
      if (Build.VERSION.SDK_INT < 11)
        break;
      if (paramKeyEvent.hasNoModifiers())
      {
        bool2 = arrowScroll(2);
        break label62;
      }
      if (!paramKeyEvent.hasModifiers(1))
        break;
      bool2 = arrowScroll(1);
      break label62;
      AppMethodBeat.o(37574);
    }
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(37582);
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      AppMethodBeat.o(37582);
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
          AdLandingViewPager.b localb = dD(localView);
          if ((localb != null) && (localb.position == this.mCurItem) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent)))
          {
            bool = true;
            AppMethodBeat.o(37582);
            break;
          }
        }
      }
      label113: AppMethodBeat.o(37582);
    }
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(37567);
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
        m = getHeight() - getPaddingTop() - getPaddingBottom();
        j = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-m + getPaddingTop(), this.mFirstOffset * j);
        this.mLeftEdge.setSize(m, j);
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
      AppMethodBeat.o(37567);
      return;
      this.mLeftEdge.QM.finish();
      this.mRightEdge.QM.finish();
    }
  }

  protected void drawableStateChanged()
  {
    AppMethodBeat.i(37535);
    super.drawableStateChanged();
    Drawable localDrawable = this.mMarginDrawable;
    if ((localDrawable != null) && (localDrawable.isStateful()))
      localDrawable.setState(getDrawableState());
    AppMethodBeat.o(37535);
  }

  final void endDrag()
  {
    AppMethodBeat.i(37571);
    this.mIsBeingDragged = false;
    this.mIsUnableToDrag = false;
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
    AppMethodBeat.o(37571);
  }

  public final void fakeDragBy(float paramFloat)
  {
    AppMethodBeat.i(37569);
    if (!this.mFakeDragging)
    {
      localObject = new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
      AppMethodBeat.o(37569);
      throw ((Throwable)localObject);
    }
    this.mLastMotionX += paramFloat;
    float f1 = getScrollX() - paramFloat;
    int i = getClientWidth();
    float f2 = i;
    paramFloat = this.mFirstOffset;
    float f3 = i;
    float f4 = this.mLastOffset;
    Object localObject = (AdLandingViewPager.b)this.mItems.get(0);
    AdLandingViewPager.b localb = (AdLandingViewPager.b)this.mItems.get(this.mItems.size() - 1);
    if (((AdLandingViewPager.b)localObject).position != 0);
    for (paramFloat = ((AdLandingViewPager.b)localObject).offset * i; ; paramFloat = f2 * paramFloat)
    {
      if (localb.position != this.mAdapter.getCount() - 1);
      for (f3 = localb.offset * i; ; f3 *= f4)
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
          AppMethodBeat.o(37569);
          return;
          if (f1 > f3)
            paramFloat = f3;
          else
            paramFloat = f1;
        }
      }
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    AppMethodBeat.i(37583);
    AdLandingViewPager.LayoutParams localLayoutParams = new AdLandingViewPager.LayoutParams();
    AppMethodBeat.o(37583);
    return localLayoutParams;
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(37586);
    paramAttributeSet = new AdLandingViewPager.LayoutParams(getContext(), paramAttributeSet);
    AppMethodBeat.o(37586);
    return paramAttributeSet;
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(37584);
    paramLayoutParams = generateDefaultLayoutParams();
    AppMethodBeat.o(37584);
    return paramLayoutParams;
  }

  public p getAdapter()
  {
    return this.mAdapter;
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37529);
    int i = paramInt2;
    if (this.mDrawingOrder == 2)
      i = paramInt1 - 1 - paramInt2;
    paramInt1 = ((AdLandingViewPager.LayoutParams)((View)this.mDrawingOrderedChildren.get(i)).getLayoutParams()).Ns;
    AppMethodBeat.o(37529);
    return paramInt1;
  }

  int getClientWidth()
  {
    AppMethodBeat.i(37522);
    int i = getMeasuredWidth();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    AppMethodBeat.o(37522);
    return i - j - k;
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

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(37551);
    super.onAttachedToWindow();
    this.mFirstLayout = true;
    AppMethodBeat.o(37551);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(37519);
    removeCallbacks(this.mEndScrollRunnable);
    super.onDetachedFromWindow();
    AppMethodBeat.o(37519);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(37568);
    super.onDraw(paramCanvas);
    if ((this.mPageMargin > 0) && (this.mMarginDrawable != null) && (this.mItems.size() > 0) && (this.mAdapter != null))
    {
      int i = getScrollX();
      int j = getWidth();
      float f1 = this.mPageMargin / j;
      Object localObject = (AdLandingViewPager.b)this.mItems.get(0);
      float f2 = ((AdLandingViewPager.b)localObject).offset;
      int k = this.mItems.size();
      int m = ((AdLandingViewPager.b)localObject).position;
      int n = ((AdLandingViewPager.b)this.mItems.get(k - 1)).position;
      int i1 = 0;
      if (m < n)
      {
        while ((m > ((AdLandingViewPager.b)localObject).position) && (i1 < k))
        {
          localObject = this.mItems;
          i1++;
          localObject = (AdLandingViewPager.b)((ArrayList)localObject).get(i1);
        }
        float f3;
        if (m == ((AdLandingViewPager.b)localObject).position)
          f3 = (((AdLandingViewPager.b)localObject).offset + ((AdLandingViewPager.b)localObject).widthFactor) * j;
        float f4;
        for (f2 = ((AdLandingViewPager.b)localObject).offset + ((AdLandingViewPager.b)localObject).widthFactor + f1; ; f2 += f4 + f1)
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
    label313: AppMethodBeat.o(37568);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(37560);
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
      AppMethodBeat.o(37560);
    }
    while (true)
    {
      return bool;
      if (i == 0)
        break;
      if (this.mIsBeingDragged)
      {
        AppMethodBeat.o(37560);
        bool = true;
      }
      else
      {
        if (!this.mIsUnableToDrag)
          break;
        AppMethodBeat.o(37560);
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
      AppMethodBeat.o(37560);
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
        if (f2 != 0.0F)
        {
          float f6 = this.mLastMotionX;
          if (((f6 < this.mGutterSize) && (f2 > 0.0F)) || ((f6 > getWidth() - this.mGutterSize) && (f2 < 0.0F)));
          for (i = 1; ; i = 0)
          {
            if ((i != 0) || (!canScroll(this, false, (int)f2, (int)f1, (int)f4)))
              break label347;
            this.mLastMotionX = f1;
            this.mLastMotionY = f4;
            this.mIsUnableToDrag = true;
            AppMethodBeat.o(37560);
            break;
          }
        }
        label347: if ((f3 > this.mTouchSlop) && (0.5F * f3 > f5))
        {
          this.mIsBeingDragged = true;
          setScrollState(1);
          if (f2 > 0.0F)
          {
            f5 = this.mInitialMotionX + this.mTouchSlop;
            this.mLastMotionX = f5;
            this.mLastMotionY = f4;
            setScrollingCacheEnabled(true);
          }
        }
        label399: 
        while ((this.mIsBeingDragged) && (performDrag(f1)))
        {
          s.R(this);
          break;
          f5 = this.mInitialMotionX - this.mTouchSlop;
          break label399;
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
    AppMethodBeat.i(37555);
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
    Object localObject;
    AdLandingViewPager.LayoutParams localLayoutParams;
    int i3;
    int i4;
    if (i2 < i)
    {
      localObject = getChildAt(i2);
      if (((View)localObject).getVisibility() == 8)
        break label644;
      localLayoutParams = (AdLandingViewPager.LayoutParams)((View)localObject).getLayoutParams();
      if (!localLayoutParams.Nq)
        break label644;
      paramInt4 = localLayoutParams.gravity;
      i3 = localLayoutParams.gravity;
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
          ((View)localObject).layout(paramInt4, i4, ((View)localObject).getMeasuredWidth() + paramInt4, ((View)localObject).getMeasuredHeight() + i4);
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
      i4 = paramInt1 + ((View)localObject).getMeasuredWidth();
      paramInt4 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = i4;
      break label169;
      i4 = Math.max((j - ((View)localObject).getMeasuredWidth()) / 2, paramInt1);
      paramInt4 = paramInt3;
      paramInt3 = paramInt1;
      paramInt1 = paramInt4;
      paramInt4 = i4;
      break label169;
      paramInt4 = ((View)localObject).getMeasuredWidth();
      i4 = ((View)localObject).getMeasuredWidth();
      paramInt4 = j - paramInt3 - paramInt4;
      i4 = paramInt3 + i4;
      paramInt3 = paramInt1;
      paramInt1 = i4;
      break label169;
      i3 = paramInt2 + ((View)localObject).getMeasuredHeight();
      i4 = paramInt2;
      paramInt2 = i3;
      break label211;
      i4 = Math.max((k - ((View)localObject).getMeasuredHeight()) / 2, paramInt2);
      break label211;
      i4 = k - m - ((View)localObject).getMeasuredHeight();
      m += ((View)localObject).getMeasuredHeight();
      break label211;
      paramInt4 = j - paramInt1 - paramInt3;
      for (paramInt3 = 0; paramInt3 < i; paramInt3++)
      {
        View localView = getChildAt(paramInt3);
        if (localView.getVisibility() != 8)
        {
          localLayoutParams = (AdLandingViewPager.LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.Nq)
          {
            localObject = dD(localView);
            if (localObject != null)
            {
              float f = paramInt4;
              i4 = (int)(((AdLandingViewPager.b)localObject).offset * f) + paramInt1;
              if (localLayoutParams.Nr)
              {
                localLayoutParams.Nr = false;
                f = paramInt4;
                localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.widthFactor * f), 1073741824), View.MeasureSpec.makeMeasureSpec(k - paramInt2 - m, 1073741824));
              }
              localView.layout(i4, paramInt2, localView.getMeasuredWidth() + i4, localView.getMeasuredHeight() + paramInt2);
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
      AppMethodBeat.o(37555);
      return;
      label644: paramInt4 = i1;
      i4 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = i4;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37552);
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
        localObject2 = (AdLandingViewPager.LayoutParams)((View)localObject1).getLayoutParams();
        k = paramInt1;
        m = paramInt2;
        if (localObject2 != null)
        {
          k = paramInt1;
          m = paramInt2;
          if (((AdLandingViewPager.LayoutParams)localObject2).Nq)
          {
            m = ((AdLandingViewPager.LayoutParams)localObject2).gravity & 0x7;
            n = ((AdLandingViewPager.LayoutParams)localObject2).gravity & 0x70;
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
            label212: if (((AdLandingViewPager.LayoutParams)localObject2).width == -2)
              break label541;
            i1 = 1073741824;
            if (((AdLandingViewPager.LayoutParams)localObject2).width == -1)
              break label535;
            m = ((AdLandingViewPager.LayoutParams)localObject2).width;
          }
        }
      }
    }
    while (true)
    {
      int i4;
      if (((AdLandingViewPager.LayoutParams)localObject2).height != -2)
      {
        i3 = 1073741824;
        k = i3;
        if (((AdLandingViewPager.LayoutParams)localObject2).height != -1)
        {
          i4 = ((AdLandingViewPager.LayoutParams)localObject2).height;
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
            localObject1 = (AdLandingViewPager.LayoutParams)((View)localObject2).getLayoutParams();
            if (((localObject1 == null) || (!((AdLandingViewPager.LayoutParams)localObject1).Nq)) && (localObject1 != null))
            {
              float f = paramInt1;
              ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec((int)(((AdLandingViewPager.LayoutParams)localObject1).widthFactor * f), 1073741824), this.mChildHeightMeasureSpec);
            }
          }
        }
        AppMethodBeat.o(37552);
        return;
      }
      label535: m = paramInt1;
      continue;
      label541: i3 = paramInt1;
      i1 = m;
      m = i3;
    }
  }

  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    boolean bool = true;
    AppMethodBeat.i(37581);
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
      AdLandingViewPager.b localb = dD(localView);
      if ((localb == null) || (localb.position != this.mCurItem) || (!localView.requestFocus(paramInt, paramRect)))
        break label107;
      AppMethodBeat.o(37581);
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
      label117: AppMethodBeat.o(37581);
      bool = false;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(37545);
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      AppMethodBeat.o(37545);
    }
    while (true)
    {
      return;
      paramParcelable = (SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      if (this.mAdapter != null)
      {
        this.mAdapter.restoreState(paramParcelable.Nt, paramParcelable.Nu);
        setCurrentItemInternal(paramParcelable.position, false, true);
        AppMethodBeat.o(37545);
      }
      else
      {
        this.mRestoredCurItem = paramParcelable.position;
        this.mRestoredAdapterState = paramParcelable.Nt;
        this.mRestoredClassLoader = paramParcelable.Nu;
        AppMethodBeat.o(37545);
      }
    }
  }

  public Parcelable onSaveInstanceState()
  {
    AppMethodBeat.i(37544);
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.position = this.mCurItem;
    if (this.mAdapter != null)
      localSavedState.Nt = this.mAdapter.saveState();
    AppMethodBeat.o(37544);
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(37553);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      recomputeScrollPosition(paramInt1, paramInt3, this.mPageMargin, this.mPageMargin);
    AppMethodBeat.o(37553);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    boolean bool1 = false;
    AppMethodBeat.i(37561);
    if (this.mFakeDragging)
    {
      AppMethodBeat.o(37561);
      bool1 = true;
    }
    while (true)
    {
      return bool1;
      if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      {
        AppMethodBeat.o(37561);
      }
      else
      {
        if ((this.mAdapter != null) && (this.mAdapter.getCount() != 0))
          break;
        AppMethodBeat.o(37561);
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
      AppMethodBeat.o(37561);
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
        localObject = cpZ();
        int i1 = ((AdLandingViewPager.b)localObject).position;
        f1 = (i / k - ((AdLandingViewPager.b)localObject).offset) / ((AdLandingViewPager.b)localObject).widthFactor;
        i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
        k = i;
        if (i < 0)
          k = 0;
        setCurrentItemInternal(determineTargetPage(i1, f1, n, (int)(paramMotionEvent.getX(k) - this.mInitialMotionX)), true, true, n);
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

  final void populate()
  {
    AppMethodBeat.i(37540);
    populate(this.mCurItem);
    AppMethodBeat.o(37540);
  }

  public void removeView(View paramView)
  {
    AppMethodBeat.i(37547);
    if (this.mInLayout)
    {
      removeViewInLayout(paramView);
      AppMethodBeat.o(37547);
    }
    while (true)
    {
      return;
      super.removeView(paramView);
      AppMethodBeat.o(37547);
    }
  }

  public void setAdapter(p paramp)
  {
    AppMethodBeat.i(37521);
    if (this.mAdapter != null)
    {
      this.mAdapter.unregisterDataSetObserver(this.rcM);
      this.mAdapter.startUpdate(this);
      for (int i = 0; i < this.mItems.size(); i++)
      {
        AdLandingViewPager.b localb = (AdLandingViewPager.b)this.mItems.get(i);
        this.mAdapter.destroyItem(this, localb.position, localb.object);
      }
      this.mAdapter.finishUpdate(this);
      this.mItems.clear();
      int j;
      for (i = 0; i < getChildCount(); i = j + 1)
      {
        j = i;
        if (!((AdLandingViewPager.LayoutParams)getChildAt(i).getLayoutParams()).Nq)
        {
          removeViewAt(i);
          j = i - 1;
        }
      }
      this.mCurItem = 0;
      scrollTo(0, 0);
    }
    this.mAdapter = paramp;
    this.mExpectedAdapterCount = 0;
    boolean bool;
    if (this.mAdapter != null)
    {
      if (this.rcM == null)
        this.rcM = new AdLandingViewPager.e(this, (byte)0);
      this.mAdapter.registerDataSetObserver(this.rcM);
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
        AppMethodBeat.o(37521);
      }
    }
    while (true)
    {
      return;
      if (!bool)
      {
        populate();
        AppMethodBeat.o(37521);
      }
      else
      {
        requestLayout();
        AppMethodBeat.o(37521);
      }
    }
  }

  void setChildrenDrawingOrderEnabledCompat(boolean paramBoolean)
  {
    AppMethodBeat.i(37528);
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
          AppMethodBeat.o(37528);
          return;
        }
        catch (Exception localException)
        {
        }
        AppMethodBeat.o(37528);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label43;
    }
  }

  public void setCurrentItem(int paramInt)
  {
    AppMethodBeat.i(37523);
    this.mPopulatePending = false;
    if (!this.mFirstLayout);
    for (boolean bool = true; ; bool = false)
    {
      setCurrentItemInternal(paramInt, bool, false);
      AppMethodBeat.o(37523);
      return;
    }
  }

  final void setCurrentItemInternal(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(37526);
    if ((this.mAdapter == null) || (this.mAdapter.getCount() <= 0))
    {
      setScrollingCacheEnabled(false);
      AppMethodBeat.o(37526);
    }
    while (true)
    {
      return;
      if ((!paramBoolean2) && (this.mCurItem == paramInt1) && (this.mItems.size() != 0))
      {
        setScrollingCacheEnabled(false);
        AppMethodBeat.o(37526);
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
            ((AdLandingViewPager.b)this.mItems.get(paramInt1)).scrolling = true;
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
          AppMethodBeat.o(37526);
        }
        else
        {
          populate(i);
          scrollToItem(i, paramBoolean1, paramInt2, paramBoolean2);
          AppMethodBeat.o(37526);
        }
      }
    }
  }

  public void setOffscreenPageLimit(int paramInt)
  {
    AppMethodBeat.i(37530);
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
    AppMethodBeat.o(37530);
  }

  void setOnAdapterChangeListener(AdLandingViewPager.d paramd)
  {
    this.rcN = paramd;
  }

  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.mOnPageChangeListener = paramOnPageChangeListener;
  }

  public void setPageMargin(int paramInt)
  {
    AppMethodBeat.i(37531);
    int i = this.mPageMargin;
    this.mPageMargin = paramInt;
    int j = getWidth();
    recomputeScrollPosition(j, j, paramInt, i);
    requestLayout();
    AppMethodBeat.o(37531);
  }

  public void setPageMarginDrawable(int paramInt)
  {
    AppMethodBeat.i(37533);
    setPageMarginDrawable(getContext().getResources().getDrawable(paramInt));
    AppMethodBeat.o(37533);
  }

  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(37532);
    this.mMarginDrawable = paramDrawable;
    if (paramDrawable != null)
      refreshDrawableState();
    if (paramDrawable == null);
    for (boolean bool = true; ; bool = false)
    {
      setWillNotDraw(bool);
      invalidate();
      AppMethodBeat.o(37532);
      return;
    }
  }

  void setScrollState(int paramInt)
  {
    AppMethodBeat.i(37520);
    if (this.mScrollState == paramInt)
      AppMethodBeat.o(37520);
    while (true)
    {
      return;
      this.mScrollState = paramInt;
      if (this.mPageTransformer != null)
      {
        int i;
        int k;
        if (paramInt != 0)
        {
          i = 1;
          int j = getChildCount();
          k = 0;
          label47: if (k >= j)
            break label88;
          if (i == 0)
            break label82;
        }
        label82: for (int m = 2; ; m = 0)
        {
          s.p(getChildAt(k), m);
          k++;
          break label47;
          i = 0;
          break;
        }
      }
      label88: if (this.mOnPageChangeListener != null)
        this.mOnPageChangeListener.onPageScrollStateChanged(paramInt);
      AppMethodBeat.o(37520);
    }
  }

  public void setScroller(Scroller paramScroller)
  {
    this.mScroller = paramScroller;
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(37534);
    boolean bool;
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.mMarginDrawable))
    {
      bool = true;
      AppMethodBeat.o(37534);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37534);
    }
  }

  public static class SavedState extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    Parcelable Nt;
    ClassLoader Nu;
    int position;

    static
    {
      AppMethodBeat.i(37516);
      CREATOR = d.a(new AdLandingViewPager.SavedState.1());
      AppMethodBeat.o(37516);
    }

    SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super();
      AppMethodBeat.i(37515);
      ClassLoader localClassLoader = paramClassLoader;
      if (paramClassLoader == null)
        localClassLoader = getClass().getClassLoader();
      this.position = paramParcel.readInt();
      this.Nt = paramParcel.readParcelable(localClassLoader);
      this.Nu = localClassLoader;
      AppMethodBeat.o(37515);
    }

    public SavedState(Parcelable paramParcelable)
    {
      super();
    }

    public String toString()
    {
      AppMethodBeat.i(37514);
      String str = "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
      AppMethodBeat.o(37514);
      return str;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(37513);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.position);
      paramParcel.writeParcelable(this.Nt, paramInt);
      AppMethodBeat.o(37513);
    }
  }

  static final class f
    implements Comparator<View>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager
 * JD-Core Version:    0.6.2
 */