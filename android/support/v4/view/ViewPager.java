package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
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
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup
{
  private static final int CLOSE_ENOUGH = 2;
  private static final Comparator<ItemInfo> COMPARATOR = new ViewPager.1();
  private static final boolean DEBUG = false;
  private static final int DEFAULT_GUTTER_SIZE = 16;
  private static final int DEFAULT_OFFSCREEN_PAGES = 1;
  private static final int DRAW_ORDER_DEFAULT = 0;
  private static final int DRAW_ORDER_FORWARD = 1;
  private static final int DRAW_ORDER_REVERSE = 2;
  private static final int INVALID_POINTER = -1;
  static final int[] LAYOUT_ATTRS = { 16842931 };
  private static final int MAX_SETTLE_DURATION = 600;
  private static final int MIN_DISTANCE_FOR_FLING = 25;
  private static final int MIN_FLING_VELOCITY = 400;
  public static final int SCROLL_STATE_DRAGGING = 1;
  public static final int SCROLL_STATE_IDLE = 0;
  public static final int SCROLL_STATE_SETTLING = 2;
  private static final String TAG = "ViewPager";
  private static final boolean USE_CACHE = false;
  private static final Interpolator sInterpolator = new ViewPager.2();
  private static final ViewPager.g sPositionComparator = new ViewPager.g();
  private int mActivePointerId = -1;
  p mAdapter;
  private List<ViewPager.c> mAdapterChangeListeners;
  private int mBottomPageBounds;
  private boolean mCalledSuper;
  private int mChildHeightMeasureSpec;
  private int mChildWidthMeasureSpec;
  private int mCloseEnough;
  int mCurItem;
  private int mDecorChildCount;
  private int mDefaultGutterSize;
  private int mDrawingOrder;
  private ArrayList<View> mDrawingOrderedChildren;
  private final Runnable mEndScrollRunnable = new ViewPager.3(this);
  private int mExpectedAdapterCount;
  private long mFakeDragBeginTime;
  private boolean mFakeDragging;
  private boolean mFirstLayout = true;
  private float mFirstOffset = -3.402824E+038F;
  private int mFlingDistance;
  private int mGutterSize;
  private boolean mInLayout;
  private float mInitialMotionX;
  private float mInitialMotionY;
  private OnPageChangeListener mInternalPageChangeListener;
  private boolean mIsBeingDragged;
  private boolean mIsScrollStarted;
  private boolean mIsUnableToDrag;
  private final ArrayList<ItemInfo> mItems = new ArrayList();
  private float mLastMotionX;
  private float mLastMotionY;
  private float mLastOffset = 3.4028235E+38F;
  private EdgeEffect mLeftEdge;
  private Drawable mMarginDrawable;
  private int mMaximumVelocity;
  private int mMinimumVelocity;
  private boolean mNeedCalculatePageOffsets = false;
  private ViewPager.e mObserver;
  private int mOffscreenPageLimit = 1;
  private OnPageChangeListener mOnPageChangeListener;
  private List<OnPageChangeListener> mOnPageChangeListeners;
  private int mPageMargin;
  private ViewPager.d mPageTransformer;
  private int mPageTransformerLayerType;
  private boolean mPopulatePending;
  private Parcelable mRestoredAdapterState = null;
  private ClassLoader mRestoredClassLoader = null;
  private int mRestoredCurItem = -1;
  private EdgeEffect mRightEdge;
  private int mScrollState = 0;
  private Scroller mScroller;
  private boolean mScrollingCacheEnabled;
  private final ItemInfo mTempItem = new ItemInfo();
  private final Rect mTempRect = new Rect();
  private int mTopPageBounds;
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;

  public ViewPager(Context paramContext)
  {
    super(paramContext);
    initViewPager();
  }

  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initViewPager();
  }

  private void calculatePageOffsets(ItemInfo paramItemInfo1, int paramInt, ItemInfo paramItemInfo2)
  {
    int i = this.mAdapter.getCount();
    int j = getClientWidth();
    float f1;
    if (j > 0)
    {
      f1 = this.mPageMargin / j;
      if (paramItemInfo2 == null)
        break label391;
      j = paramItemInfo2.position;
      if (j < paramItemInfo1.position)
      {
        f2 = paramItemInfo2.offset + paramItemInfo2.widthFactor + f1;
        j++;
        k = 0;
      }
    }
    else
    {
      while (true)
      {
        if ((j > paramItemInfo1.position) || (k >= this.mItems.size()))
          break label391;
        for (paramItemInfo2 = (ItemInfo)this.mItems.get(k); ; paramItemInfo2 = (ItemInfo)this.mItems.get(k))
        {
          m = j;
          f3 = f2;
          if (j <= paramItemInfo2.position)
            break;
          m = j;
          f3 = f2;
          if (k >= this.mItems.size() - 1)
            break;
          k++;
        }
        f1 = 0.0F;
        break;
        while (m < paramItemInfo2.position)
        {
          f3 += this.mAdapter.getPageWidth(m) + f1;
          m++;
        }
        paramItemInfo2.offset = f3;
        f2 = f3 + (paramItemInfo2.widthFactor + f1);
        j = m + 1;
      }
    }
    if (j > paramItemInfo1.position)
    {
      k = this.mItems.size() - 1;
      f2 = paramItemInfo2.offset;
      j--;
      while ((j >= paramItemInfo1.position) && (k >= 0))
      {
        for (paramItemInfo2 = (ItemInfo)this.mItems.get(k); ; paramItemInfo2 = (ItemInfo)this.mItems.get(k))
        {
          m = j;
          f3 = f2;
          if (j >= paramItemInfo2.position)
            break;
          m = j;
          f3 = f2;
          if (k <= 0)
            break;
          k--;
        }
        while (m > paramItemInfo2.position)
        {
          f3 -= this.mAdapter.getPageWidth(m) + f1;
          m--;
        }
        f2 = f3 - (paramItemInfo2.widthFactor + f1);
        paramItemInfo2.offset = f2;
        j = m - 1;
      }
    }
    label391: int m = this.mItems.size();
    float f3 = paramItemInfo1.offset;
    j = paramItemInfo1.position - 1;
    if (paramItemInfo1.position == 0)
    {
      f2 = paramItemInfo1.offset;
      this.mFirstOffset = f2;
      if (paramItemInfo1.position != i - 1)
        break label529;
      f2 = paramItemInfo1.offset + paramItemInfo1.widthFactor - 1.0F;
      label457: this.mLastOffset = f2;
      k = paramInt - 1;
      f2 = f3;
    }
    while (true)
    {
      if (k < 0)
        break label576;
      paramItemInfo2 = (ItemInfo)this.mItems.get(k);
      while (true)
        if (j > paramItemInfo2.position)
        {
          f2 -= this.mAdapter.getPageWidth(j) + f1;
          j--;
          continue;
          f2 = -3.402824E+038F;
          break;
          label529: f2 = 3.4028235E+38F;
          break label457;
        }
      f2 -= paramItemInfo2.widthFactor + f1;
      paramItemInfo2.offset = f2;
      if (paramItemInfo2.position == 0)
        this.mFirstOffset = f2;
      j--;
      k--;
    }
    label576: float f2 = paramItemInfo1.offset + paramItemInfo1.widthFactor + f1;
    int k = paramItemInfo1.position + 1;
    j = paramInt + 1;
    paramInt = k;
    while (j < m)
    {
      paramItemInfo1 = (ItemInfo)this.mItems.get(j);
      while (paramInt < paramItemInfo1.position)
      {
        f2 += this.mAdapter.getPageWidth(paramInt) + f1;
        paramInt++;
      }
      if (paramItemInfo1.position == i - 1)
        this.mLastOffset = (paramItemInfo1.widthFactor + f2 - 1.0F);
      paramItemInfo1.offset = f2;
      f2 += paramItemInfo1.widthFactor + f1;
      paramInt++;
      j++;
    }
    this.mNeedCalculatePageOffsets = false;
  }

  private void completeScroll(boolean paramBoolean)
  {
    int i;
    if (this.mScrollState == 2)
    {
      i = 1;
      if (i != 0)
      {
        setScrollingCacheEnabled(false);
        if (this.mScroller.isFinished())
          break label169;
      }
    }
    label169: for (int j = 1; ; j = 0)
    {
      if (j != 0)
      {
        this.mScroller.abortAnimation();
        k = getScrollX();
        int m = getScrollY();
        int n = this.mScroller.getCurrX();
        j = this.mScroller.getCurrY();
        if ((k != n) || (m != j))
        {
          scrollTo(n, j);
          if (n != k)
            pageScrolled(n);
        }
      }
      this.mPopulatePending = false;
      int k = 0;
      j = i;
      for (i = k; i < this.mItems.size(); i++)
      {
        ItemInfo localItemInfo = (ItemInfo)this.mItems.get(i);
        if (localItemInfo.scrolling)
        {
          localItemInfo.scrolling = false;
          j = 1;
        }
      }
      i = 0;
      break;
    }
    if (j != 0)
    {
      if (!paramBoolean)
        break label191;
      s.b(this, this.mEndScrollRunnable);
    }
    while (true)
    {
      return;
      label191: this.mEndScrollRunnable.run();
    }
  }

  private int determineTargetPage(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    if ((Math.abs(paramInt3) > this.mFlingDistance) && (Math.abs(paramInt2) > this.mMinimumVelocity))
    {
      if (paramInt2 > 0);
      while (true)
      {
        paramInt2 = paramInt1;
        if (this.mItems.size() > 0)
        {
          ItemInfo localItemInfo1 = (ItemInfo)this.mItems.get(0);
          ItemInfo localItemInfo2 = (ItemInfo)this.mItems.get(this.mItems.size() - 1);
          paramInt2 = Math.max(localItemInfo1.position, Math.min(paramInt1, localItemInfo2.position));
        }
        return paramInt2;
        paramInt1++;
      }
    }
    if (paramInt1 >= this.mCurItem);
    for (float f = 0.4F; ; f = 0.6F)
    {
      paramInt1 += (int)(f + paramFloat);
      break;
    }
  }

  private void dispatchOnPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.mOnPageChangeListener != null)
      this.mOnPageChangeListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
    if (this.mOnPageChangeListeners != null)
    {
      int i = this.mOnPageChangeListeners.size();
      for (int j = 0; j < i; j++)
      {
        OnPageChangeListener localOnPageChangeListener = (OnPageChangeListener)this.mOnPageChangeListeners.get(j);
        if (localOnPageChangeListener != null)
          localOnPageChangeListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
      }
    }
    if (this.mInternalPageChangeListener != null)
      this.mInternalPageChangeListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
  }

  private void dispatchOnPageSelected(int paramInt)
  {
    if (this.mOnPageChangeListener != null)
      this.mOnPageChangeListener.onPageSelected(paramInt);
    if (this.mOnPageChangeListeners != null)
    {
      int i = this.mOnPageChangeListeners.size();
      for (int j = 0; j < i; j++)
      {
        OnPageChangeListener localOnPageChangeListener = (OnPageChangeListener)this.mOnPageChangeListeners.get(j);
        if (localOnPageChangeListener != null)
          localOnPageChangeListener.onPageSelected(paramInt);
      }
    }
    if (this.mInternalPageChangeListener != null)
      this.mInternalPageChangeListener.onPageSelected(paramInt);
  }

  private void dispatchOnScrollStateChanged(int paramInt)
  {
    if (this.mOnPageChangeListener != null)
      this.mOnPageChangeListener.onPageScrollStateChanged(paramInt);
    if (this.mOnPageChangeListeners != null)
    {
      int i = this.mOnPageChangeListeners.size();
      for (int j = 0; j < i; j++)
      {
        OnPageChangeListener localOnPageChangeListener = (OnPageChangeListener)this.mOnPageChangeListeners.get(j);
        if (localOnPageChangeListener != null)
          localOnPageChangeListener.onPageScrollStateChanged(paramInt);
      }
    }
    if (this.mInternalPageChangeListener != null)
      this.mInternalPageChangeListener.onPageScrollStateChanged(paramInt);
  }

  private void enableLayers(boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    if (j < i)
    {
      if (paramBoolean);
      for (int k = this.mPageTransformerLayerType; ; k = 0)
      {
        getChildAt(j).setLayerType(k, null);
        j++;
        break;
      }
    }
  }

  private void endDrag()
  {
    this.mIsBeingDragged = false;
    this.mIsUnableToDrag = false;
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }

  private Rect getChildRectInPagerCoordinates(Rect paramRect, View paramView)
  {
    if (paramRect == null)
      paramRect = new Rect();
    while (true)
    {
      if (paramView == null)
        paramRect.set(0, 0, 0, 0);
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
      }
    }
  }

  private int getClientWidth()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }

  private ItemInfo infoForCurrentScrollPosition()
  {
    int i = getClientWidth();
    float f1;
    float f2;
    label31: int j;
    int k;
    Object localObject1;
    float f3;
    float f4;
    label48: Object localObject2;
    ItemInfo localItemInfo;
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
      localObject2 = localObject1;
      if (i < this.mItems.size())
      {
        localItemInfo = (ItemInfo)this.mItems.get(i);
        if ((k != 0) || (localItemInfo.position == j + 1))
          break label239;
        localItemInfo = this.mTempItem;
        localItemInfo.offset = (f4 + f3 + f2);
        localItemInfo.position = (j + 1);
        localItemInfo.widthFactor = this.mAdapter.getPageWidth(localItemInfo.position);
        i--;
      }
    }
    label207: label212: label239: 
    while (true)
    {
      f4 = localItemInfo.offset;
      f3 = localItemInfo.widthFactor;
      if (k == 0)
      {
        localObject2 = localObject1;
        if (f1 < f4);
      }
      else
      {
        if ((f1 >= f3 + f4 + f2) && (i != this.mItems.size() - 1))
          break label212;
        localObject2 = localItemInfo;
      }
      return localObject2;
      f1 = 0.0F;
      break;
      f2 = 0.0F;
      break label31;
      j = localItemInfo.position;
      f3 = localItemInfo.widthFactor;
      i++;
      k = 0;
      localObject1 = localItemInfo;
      break label48;
    }
  }

  private static boolean isDecorView(View paramView)
  {
    if (paramView.getClass().getAnnotation(a.class) != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean isGutterDrag(float paramFloat1, float paramFloat2)
  {
    if (((paramFloat1 < this.mGutterSize) && (paramFloat2 > 0.0F)) || ((paramFloat1 > getWidth() - this.mGutterSize) && (paramFloat2 < 0.0F)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.mActivePointerId)
      if (i != 0)
        break label56;
    label56: for (i = 1; ; i = 0)
    {
      this.mLastMotionX = paramMotionEvent.getX(i);
      this.mActivePointerId = paramMotionEvent.getPointerId(i);
      if (this.mVelocityTracker != null)
        this.mVelocityTracker.clear();
      return;
    }
  }

  private boolean pageScrolled(int paramInt)
  {
    boolean bool = false;
    if (this.mItems.size() == 0)
      if (!this.mFirstLayout);
    while (true)
    {
      return bool;
      this.mCalledSuper = false;
      onPageScrolled(0, 0.0F, 0);
      if (!this.mCalledSuper)
      {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        ItemInfo localItemInfo = infoForCurrentScrollPosition();
        int i = getClientWidth();
        int j = this.mPageMargin;
        float f = this.mPageMargin / i;
        int k = localItemInfo.position;
        f = (paramInt / i - localItemInfo.offset) / (localItemInfo.widthFactor + f);
        paramInt = (int)((j + i) * f);
        this.mCalledSuper = false;
        onPageScrolled(k, f, paramInt);
        if (!this.mCalledSuper)
          throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        bool = true;
      }
    }
  }

  private boolean performDrag(float paramFloat)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    float f1 = this.mLastMotionX;
    this.mLastMotionX = paramFloat;
    float f2 = getScrollX() + (f1 - paramFloat);
    int i = getClientWidth();
    paramFloat = i * this.mFirstOffset;
    float f3 = i;
    f1 = this.mLastOffset;
    ItemInfo localItemInfo1 = (ItemInfo)this.mItems.get(0);
    ItemInfo localItemInfo2 = (ItemInfo)this.mItems.get(this.mItems.size() - 1);
    if (localItemInfo1.position != 0)
    {
      paramFloat = localItemInfo1.offset;
      paramFloat = i * paramFloat;
    }
    for (int j = 0; ; j = 1)
    {
      int k;
      if (localItemInfo2.position != this.mAdapter.getCount() - 1)
      {
        f1 = localItemInfo2.offset * i;
        k = 0;
      }
      while (true)
      {
        if (f2 < paramFloat)
        {
          if (j == 0)
            break label257;
          this.mLeftEdge.onPull(Math.abs(paramFloat - f2) / i);
        }
        while (true)
        {
          this.mLastMotionX += paramFloat - (int)paramFloat;
          scrollTo((int)paramFloat, getScrollY());
          pageScrolled((int)paramFloat);
          return bool2;
          if (f2 > f1)
          {
            if (k != 0)
              this.mRightEdge.onPull(Math.abs(f2 - f1) / i);
            for (bool2 = bool1; ; bool2 = false)
            {
              paramFloat = f1;
              break;
            }
          }
          bool2 = false;
          paramFloat = f2;
          continue;
          label257: bool2 = false;
        }
        k = 1;
        f1 = f3 * f1;
      }
    }
  }

  private void recomputeScrollPosition(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > 0) && (!this.mItems.isEmpty()))
    {
      if (!this.mScroller.isFinished())
        this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
      while (true)
      {
        return;
        int i = getPaddingLeft();
        int j = getPaddingRight();
        int k = getPaddingLeft();
        int m = getPaddingRight();
        f = getScrollX() / (paramInt2 - k - m + paramInt4);
        scrollTo((int)((paramInt1 - i - j + paramInt3) * f), getScrollY());
      }
    }
    ItemInfo localItemInfo = infoForPosition(this.mCurItem);
    if (localItemInfo != null);
    for (float f = Math.min(localItemInfo.offset, this.mLastOffset); ; f = 0.0F)
    {
      paramInt1 = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 == getScrollX())
        break;
      completeScroll(false);
      scrollTo(paramInt1, getScrollY());
      break;
    }
  }

  private void removeNonDecorViews()
  {
    int j;
    for (int i = 0; i < getChildCount(); i = j + 1)
    {
      j = i;
      if (!((ViewPager.LayoutParams)getChildAt(i).getLayoutParams()).Nq)
      {
        removeViewAt(i);
        j = i - 1;
      }
    }
  }

  private void requestParentDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  private boolean resetTouch()
  {
    this.mActivePointerId = -1;
    endDrag();
    this.mLeftEdge.onRelease();
    this.mRightEdge.onRelease();
    if ((this.mLeftEdge.isFinished()) || (this.mRightEdge.isFinished()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void scrollToItem(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    ItemInfo localItemInfo = infoForPosition(paramInt1);
    float f;
    if (localItemInfo != null)
      f = getClientWidth();
    for (int i = (int)(Math.max(this.mFirstOffset, Math.min(localItemInfo.offset, this.mLastOffset)) * f); ; i = 0)
    {
      if (paramBoolean1)
      {
        smoothScrollTo(i, 0, paramInt2);
        if (paramBoolean2)
          dispatchOnPageSelected(paramInt1);
      }
      while (true)
      {
        return;
        if (paramBoolean2)
          dispatchOnPageSelected(paramInt1);
        completeScroll(false);
        scrollTo(i, 0);
        pageScrolled(i);
      }
    }
  }

  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.mScrollingCacheEnabled != paramBoolean)
      this.mScrollingCacheEnabled = paramBoolean;
  }

  private void sortChildDrawingOrder()
  {
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
  }

  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i = paramArrayList.size();
    int j = getDescendantFocusability();
    if (j != 393216)
      for (int k = 0; k < getChildCount(); k++)
      {
        View localView = getChildAt(k);
        if (localView.getVisibility() == 0)
        {
          ItemInfo localItemInfo = infoForChild(localView);
          if ((localItemInfo != null) && (localItemInfo.position == this.mCurItem))
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
    if (((j == 262144) && (i != paramArrayList.size())) || (!isFocusable()));
    while (true)
    {
      return;
      if ((((paramInt2 & 0x1) != 1) || (!isInTouchMode()) || (isFocusableInTouchMode())) && (paramArrayList != null))
        paramArrayList.add(this);
    }
  }

  ItemInfo addNewItem(int paramInt1, int paramInt2)
  {
    ItemInfo localItemInfo = new ItemInfo();
    localItemInfo.position = paramInt1;
    localItemInfo.object = this.mAdapter.instantiateItem(this, paramInt1);
    localItemInfo.widthFactor = this.mAdapter.getPageWidth(paramInt1);
    if ((paramInt2 < 0) || (paramInt2 >= this.mItems.size()))
      this.mItems.add(localItemInfo);
    while (true)
    {
      return localItemInfo;
      this.mItems.add(paramInt2, localItemInfo);
    }
  }

  public void addOnAdapterChangeListener(ViewPager.c paramc)
  {
    if (this.mAdapterChangeListeners == null)
      this.mAdapterChangeListeners = new ArrayList();
    this.mAdapterChangeListeners.add(paramc);
  }

  public void addOnPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    if (this.mOnPageChangeListeners == null)
      this.mOnPageChangeListeners = new ArrayList();
    this.mOnPageChangeListeners.add(paramOnPageChangeListener);
  }

  public void addTouchables(ArrayList<View> paramArrayList)
  {
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        ItemInfo localItemInfo = infoForChild(localView);
        if ((localItemInfo != null) && (localItemInfo.position == this.mCurItem))
          localView.addTouchables(paramArrayList);
      }
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams))
      paramLayoutParams = generateLayoutParams(paramLayoutParams);
    while (true)
    {
      ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)paramLayoutParams;
      localLayoutParams.Nq |= isDecorView(paramView);
      if (this.mInLayout)
      {
        if ((localLayoutParams != null) && (localLayoutParams.Nq))
          throw new IllegalStateException("Cannot add pager decor view during layout");
        localLayoutParams.Nr = true;
        addViewInLayout(paramView, paramInt, paramLayoutParams);
      }
      while (true)
      {
        return;
        super.addView(paramView, paramInt, paramLayoutParams);
      }
    }
  }

  public boolean arrowScroll(int paramInt)
  {
    View localView = findFocus();
    Object localObject;
    int i;
    boolean bool;
    if (localView == this)
    {
      localObject = null;
      localView = FocusFinder.getInstance().findNextFocus(this, (View)localObject, paramInt);
      if ((localView == null) || (localView == localObject))
        break label287;
      if (paramInt != 17)
        break label233;
      i = getChildRectInPagerCoordinates(this.mTempRect, localView).left;
      j = getChildRectInPagerCoordinates(this.mTempRect, (View)localObject).left;
      if ((localObject != null) && (i >= j))
      {
        bool = pageLeft();
        label82: if (bool)
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        return bool;
      }
    }
    else
    {
      if (localView == null)
        break label333;
      localObject = localView.getParent();
      if (!(localObject instanceof ViewGroup))
        break label338;
      if (localObject != this);
    }
    label287: label327: label333: label338: for (int j = 1; ; j = 0)
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
        break label82;
        label233: if (paramInt == 66)
        {
          j = getChildRectInPagerCoordinates(this.mTempRect, localView).left;
          i = getChildRectInPagerCoordinates(this.mTempRect, (View)localObject).left;
          if ((localObject == null) || (j > i))
          {
            bool = localView.requestFocus();
            break label82;
            if ((paramInt == 17) || (paramInt == 1))
            {
              bool = pageLeft();
              break label82;
            }
            if ((paramInt != 66) && (paramInt != 2))
              break label327;
          }
          bool = pageRight();
          break label82;
        }
        bool = false;
        break label82;
      }
      localObject = localView;
      break;
    }
  }

  public boolean beginFakeDrag()
  {
    boolean bool = false;
    if (this.mIsBeingDragged)
      return bool;
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
      bool = true;
      break;
      this.mVelocityTracker.clear();
    }
  }

  protected boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
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
          paramBoolean = bool;
      }
    }
    while (true)
    {
      return paramBoolean;
      k--;
      break;
      if (paramBoolean)
      {
        paramBoolean = bool;
        if (paramView.canScrollHorizontally(-paramInt1));
      }
      else
      {
        paramBoolean = false;
      }
    }
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.mAdapter == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      int i = getClientWidth();
      int j = getScrollX();
      if (paramInt < 0)
      {
        bool2 = bool1;
        if (j > (int)(i * this.mFirstOffset))
          bool2 = true;
      }
      else
      {
        bool2 = bool1;
        if (paramInt > 0)
        {
          bool2 = bool1;
          if (j < (int)(i * this.mLastOffset))
            bool2 = true;
        }
      }
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (((paramLayoutParams instanceof ViewPager.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void clearOnPageChangeListeners()
  {
    if (this.mOnPageChangeListeners != null)
      this.mOnPageChangeListeners.clear();
  }

  public void computeScroll()
  {
    this.mIsScrollStarted = true;
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
    }
    while (true)
    {
      return;
      completeScroll(true);
    }
  }

  void dataSetChanged()
  {
    int i = this.mAdapter.getCount();
    this.mExpectedAdapterCount = i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    label58: Object localObject;
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
        break label299;
      localObject = (ItemInfo)this.mItems.get(m);
      i2 = this.mAdapter.getItemPosition(((ItemInfo)localObject).object);
      i3 = m;
      i4 = n;
      i5 = k;
      j = i1;
      if (i2 != -1)
      {
        if (i2 != -2)
          break label237;
        this.mItems.remove(m);
        i3 = m - 1;
        m = n;
        if (n == 0)
        {
          this.mAdapter.startUpdate(this);
          m = 1;
        }
        this.mAdapter.destroyItem(this, ((ItemInfo)localObject).position, ((ItemInfo)localObject).object);
        if (this.mCurItem != ((ItemInfo)localObject).position)
          break label386;
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
      break label58;
      j = 0;
      break;
      label237: i3 = m;
      i4 = n;
      i5 = k;
      j = i1;
      if (((ItemInfo)localObject).position != i2)
      {
        if (((ItemInfo)localObject).position == this.mCurItem)
          k = i2;
        ((ItemInfo)localObject).position = i2;
        j = 1;
        i3 = m;
        i4 = n;
        i5 = k;
        continue;
        label299: if (n != 0)
          this.mAdapter.finishUpdate(this);
        Collections.sort(this.mItems, COMPARATOR);
        if (i1 != 0)
        {
          n = getChildCount();
          for (j = 0; j < n; j++)
          {
            localObject = (ViewPager.LayoutParams)getChildAt(j).getLayoutParams();
            if (!((ViewPager.LayoutParams)localObject).Nq)
              ((ViewPager.LayoutParams)localObject).widthFactor = 0.0F;
          }
          setCurrentItemInternal(k, false, true);
          requestLayout();
        }
        return;
        label386: j = 1;
        i4 = m;
        i5 = k;
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((super.dispatchKeyEvent(paramKeyEvent)) || (executeKeyEvent(paramKeyEvent)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool2 = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      return bool2;
    }
    int i = getChildCount();
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (j >= i)
        break;
      View localView = getChildAt(j);
      if (localView.getVisibility() == 0)
      {
        ItemInfo localItemInfo = infoForChild(localView);
        if ((localItemInfo != null) && (localItemInfo.position == this.mCurItem) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent)))
        {
          bool2 = true;
          break;
        }
      }
    }
  }

  float distanceInfluenceForSnapDuration(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.4712389F);
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = 0;
    int j = 0;
    int m = getOverScrollMode();
    boolean bool;
    if ((m == 0) || ((m == 1) && (this.mAdapter != null) && (this.mAdapter.getCount() > 1)))
    {
      int k;
      if (!this.mLeftEdge.isFinished())
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
      if (!this.mRightEdge.isFinished())
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
      return;
      this.mLeftEdge.finish();
      this.mRightEdge.finish();
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.mMarginDrawable;
    if ((localDrawable != null) && (localDrawable.isStateful()))
      localDrawable.setState(getDrawableState());
  }

  public void endFakeDrag()
  {
    if (!this.mFakeDragging)
      throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    if (this.mAdapter != null)
    {
      Object localObject = this.mVelocityTracker;
      ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.mMaximumVelocity);
      int i = (int)((VelocityTracker)localObject).getXVelocity(this.mActivePointerId);
      this.mPopulatePending = true;
      int j = getClientWidth();
      int k = getScrollX();
      localObject = infoForCurrentScrollPosition();
      setCurrentItemInternal(determineTargetPage(((ItemInfo)localObject).position, (k / j - ((ItemInfo)localObject).offset) / ((ItemInfo)localObject).widthFactor, i, (int)(this.mLastMotionX - this.mInitialMotionX)), true, true, i);
    }
    endDrag();
    this.mFakeDragging = false;
  }

  public boolean executeKeyEvent(KeyEvent paramKeyEvent)
  {
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
      return bool2;
      if (paramKeyEvent.hasModifiers(2))
      {
        bool2 = pageLeft();
      }
      else
      {
        bool2 = arrowScroll(17);
        continue;
        if (paramKeyEvent.hasModifiers(2))
        {
          bool2 = pageRight();
        }
        else
        {
          bool2 = arrowScroll(66);
          continue;
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
    }
  }

  public void fakeDragBy(float paramFloat)
  {
    if (!this.mFakeDragging)
      throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    if (this.mAdapter == null)
      return;
    this.mLastMotionX += paramFloat;
    float f1 = getScrollX() - paramFloat;
    int i = getClientWidth();
    paramFloat = i;
    float f2 = this.mFirstOffset;
    float f3 = i;
    float f4 = this.mLastOffset;
    Object localObject = (ItemInfo)this.mItems.get(0);
    ItemInfo localItemInfo = (ItemInfo)this.mItems.get(this.mItems.size() - 1);
    if (((ItemInfo)localObject).position != 0);
    for (paramFloat = ((ItemInfo)localObject).offset * i; ; paramFloat *= f2)
    {
      if (localItemInfo.position != this.mAdapter.getCount() - 1);
      for (f3 = localItemInfo.offset * i; ; f3 *= f4)
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
          break;
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
    return new ViewPager.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewPager.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }

  public p getAdapter()
  {
    return this.mAdapter;
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (this.mDrawingOrder == 2)
      i = paramInt1 - 1 - paramInt2;
    return ((ViewPager.LayoutParams)((View)this.mDrawingOrderedChildren.get(i)).getLayoutParams()).Ns;
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

  ItemInfo infoForAnyChild(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if (localViewParent != this)
      if ((localViewParent != null) && ((localViewParent instanceof View)));
    for (paramView = null; ; paramView = infoForChild(paramView))
    {
      return paramView;
      paramView = (View)localViewParent;
      break;
    }
  }

  ItemInfo infoForChild(View paramView)
  {
    int i = 0;
    ItemInfo localItemInfo;
    if (i < this.mItems.size())
    {
      localItemInfo = (ItemInfo)this.mItems.get(i);
      if (!this.mAdapter.isViewFromObject(paramView, localItemInfo.object));
    }
    for (paramView = localItemInfo; ; paramView = null)
    {
      return paramView;
      i++;
      break;
    }
  }

  ItemInfo infoForPosition(int paramInt)
  {
    int i = 0;
    ItemInfo localItemInfo;
    if (i < this.mItems.size())
    {
      localItemInfo = (ItemInfo)this.mItems.get(i);
      if (localItemInfo.position != paramInt);
    }
    while (true)
    {
      return localItemInfo;
      i++;
      break;
      localItemInfo = null;
    }
  }

  void initViewPager()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.mScroller = new Scroller(localContext, sInterpolator);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f = localContext.getResources().getDisplayMetrics().density;
    this.mTouchSlop = localViewConfiguration.getScaledPagingTouchSlop();
    this.mMinimumVelocity = ((int)(400.0F * f));
    this.mMaximumVelocity = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.mLeftEdge = new EdgeEffect(localContext);
    this.mRightEdge = new EdgeEffect(localContext);
    this.mFlingDistance = ((int)(25.0F * f));
    this.mCloseEnough = ((int)(2.0F * f));
    this.mDefaultGutterSize = ((int)(16.0F * f));
    s.a(this, new b());
    if (s.S(this) == 0)
      s.o(this, 1);
    s.a(this, new ViewPager.4(this));
  }

  public boolean isFakeDragging()
  {
    return this.mFakeDragging;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mFirstLayout = true;
  }

  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.mEndScrollRunnable);
    if ((this.mScroller != null) && (!this.mScroller.isFinished()))
      this.mScroller.abortAnimation();
    super.onDetachedFromWindow();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.mPageMargin > 0) && (this.mMarginDrawable != null) && (this.mItems.size() > 0) && (this.mAdapter != null))
    {
      int i = getScrollX();
      int j = getWidth();
      float f1 = this.mPageMargin / j;
      Object localObject = (ItemInfo)this.mItems.get(0);
      float f2 = ((ItemInfo)localObject).offset;
      int k = this.mItems.size();
      int m = ((ItemInfo)localObject).position;
      int n = ((ItemInfo)this.mItems.get(k - 1)).position;
      int i1 = 0;
      if (m < n)
      {
        while ((m > ((ItemInfo)localObject).position) && (i1 < k))
        {
          localObject = this.mItems;
          i1++;
          localObject = (ItemInfo)((ArrayList)localObject).get(i1);
        }
        float f3;
        if (m == ((ItemInfo)localObject).position)
          f3 = (((ItemInfo)localObject).offset + ((ItemInfo)localObject).widthFactor) * j;
        float f4;
        for (f2 = ((ItemInfo)localObject).offset + ((ItemInfo)localObject).widthFactor + f1; ; f2 += f4 + f1)
        {
          if (this.mPageMargin + f3 > i)
          {
            this.mMarginDrawable.setBounds(Math.round(f3), this.mTopPageBounds, Math.round(this.mPageMargin + f3), this.mBottomPageBounds);
            this.mMarginDrawable.draw(paramCanvas);
          }
          if (f3 > i + j)
            return;
          m++;
          break;
          f4 = this.mAdapter.getPageWidth(m);
          f3 = (f2 + f4) * j;
        }
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i = paramMotionEvent.getAction() & 0xFF;
    boolean bool2;
    if ((i == 3) || (i == 1))
    {
      resetTouch();
      bool2 = bool1;
    }
    do
    {
      while (true)
      {
        return bool2;
        if (i == 0)
          break label59;
        if (!this.mIsBeingDragged)
          break;
        bool2 = true;
      }
      bool2 = bool1;
    }
    while (this.mIsUnableToDrag);
    label59: switch (i)
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
      bool2 = this.mIsBeingDragged;
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
          bool2 = bool1;
          break;
        }
        if ((f3 > this.mTouchSlop) && (0.5F * f3 > f5))
        {
          this.mIsBeingDragged = true;
          requestParentDisallowInterceptTouchEvent(true);
          setScrollState(1);
          if (f2 > 0.0F)
          {
            f5 = this.mInitialMotionX + this.mTouchSlop;
            label303: this.mLastMotionX = f5;
            this.mLastMotionY = f4;
            setScrollingCacheEnabled(true);
          }
        }
        while ((this.mIsBeingDragged) && (performDrag(f1)))
        {
          s.R(this);
          break;
          f5 = this.mInitialMotionX - this.mTouchSlop;
          break label303;
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
        this.mIsScrollStarted = true;
        this.mScroller.computeScrollOffset();
        if ((this.mScrollState == 2) && (Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough))
        {
          this.mScroller.abortAnimation();
          this.mPopulatePending = false;
          populate();
          this.mIsBeingDragged = true;
          requestParentDisallowInterceptTouchEvent(true);
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
    View localView;
    ViewPager.LayoutParams localLayoutParams;
    int i3;
    int i4;
    if (i2 < i)
    {
      localView = getChildAt(i2);
      if (localView.getVisibility() == 8)
        break label630;
      localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
      if (!localLayoutParams.Nq)
        break label630;
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
        label161: switch (i3 & 0x70)
        {
        default:
          i4 = paramInt2;
          label203: paramInt4 += n;
          localView.layout(paramInt4, i4, localView.getMeasuredWidth() + paramInt4, localView.getMeasuredHeight() + i4);
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
      i4 = paramInt1 + localView.getMeasuredWidth();
      paramInt4 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = i4;
      break label161;
      i4 = Math.max((j - localView.getMeasuredWidth()) / 2, paramInt1);
      paramInt4 = paramInt3;
      paramInt3 = paramInt1;
      paramInt1 = paramInt4;
      paramInt4 = i4;
      break label161;
      paramInt4 = localView.getMeasuredWidth();
      i4 = localView.getMeasuredWidth();
      paramInt4 = j - paramInt3 - paramInt4;
      i4 = paramInt3 + i4;
      paramInt3 = paramInt1;
      paramInt1 = i4;
      break label161;
      i3 = paramInt2 + localView.getMeasuredHeight();
      i4 = paramInt2;
      paramInt2 = i3;
      break label203;
      i4 = Math.max((k - localView.getMeasuredHeight()) / 2, paramInt2);
      break label203;
      i4 = k - m - localView.getMeasuredHeight();
      m += localView.getMeasuredHeight();
      break label203;
      paramInt4 = j - paramInt1 - paramInt3;
      for (paramInt3 = 0; paramInt3 < i; paramInt3++)
      {
        localView = getChildAt(paramInt3);
        if (localView.getVisibility() != 8)
        {
          localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.Nq)
          {
            ItemInfo localItemInfo = infoForChild(localView);
            if (localItemInfo != null)
            {
              float f = paramInt4;
              i4 = (int)(localItemInfo.offset * f) + paramInt1;
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
      return;
      label630: paramInt4 = i1;
      i4 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = i4;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    paramInt1 = getMeasuredWidth();
    this.mGutterSize = Math.min(paramInt1 / 10, this.mDefaultGutterSize);
    paramInt1 = paramInt1 - getPaddingLeft() - getPaddingRight();
    paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i = getChildCount();
    int j = 0;
    View localView;
    int k;
    int m;
    ViewPager.LayoutParams localLayoutParams;
    int n;
    int i1;
    label181: int i2;
    if (j < i)
    {
      localView = getChildAt(j);
      k = paramInt1;
      m = paramInt2;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
        k = paramInt1;
        m = paramInt2;
        if (localLayoutParams != null)
        {
          k = paramInt1;
          m = paramInt2;
          if (localLayoutParams.Nq)
          {
            m = localLayoutParams.gravity & 0x7;
            n = localLayoutParams.gravity & 0x70;
            i1 = -2147483648;
            k = -2147483648;
            if ((n != 48) && (n != 80))
              break label328;
            n = 1;
            if ((m != 3) && (m != 5))
              break label334;
            i2 = 1;
            label196: if (n == 0)
              break label340;
            m = 1073741824;
            label206: if (localLayoutParams.width == -2)
              break label524;
            i1 = 1073741824;
            if (localLayoutParams.width == -1)
              break label518;
            m = localLayoutParams.width;
          }
        }
      }
    }
    while (true)
    {
      int i4;
      if (localLayoutParams.height != -2)
      {
        i3 = 1073741824;
        k = i3;
        if (localLayoutParams.height != -1)
        {
          i4 = localLayoutParams.height;
          k = i3;
        }
      }
      for (int i3 = i4; ; i3 = paramInt2)
      {
        localView.measure(View.MeasureSpec.makeMeasureSpec(m, i1), View.MeasureSpec.makeMeasureSpec(i3, k));
        if (n != 0)
        {
          m = paramInt2 - localView.getMeasuredHeight();
          k = paramInt1;
        }
        while (true)
        {
          j++;
          paramInt1 = k;
          paramInt2 = m;
          break;
          label328: n = 0;
          break label181;
          label334: i2 = 0;
          break label196;
          label340: m = i1;
          if (i2 == 0)
            break label206;
          k = 1073741824;
          m = i1;
          break label206;
          k = paramInt1;
          m = paramInt2;
          if (i2 != 0)
          {
            k = paramInt1 - localView.getMeasuredWidth();
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
          localView = getChildAt(paramInt2);
          if (localView.getVisibility() != 8)
          {
            localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
            if ((localLayoutParams == null) || (!localLayoutParams.Nq))
            {
              float f = paramInt1;
              localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.widthFactor * f), 1073741824), this.mChildHeightMeasureSpec);
            }
          }
        }
        return;
      }
      label518: m = paramInt1;
      continue;
      label524: i3 = paramInt1;
      i1 = m;
      m = i3;
    }
  }

  protected void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    int j;
    int k;
    int m;
    int i1;
    View localView;
    Object localObject;
    int i2;
    label120: int i4;
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
        localObject = (ViewPager.LayoutParams)localView.getLayoutParams();
        if (!((ViewPager.LayoutParams)localObject).Nq)
          break label335;
        switch (((ViewPager.LayoutParams)localObject).gravity & 0x7)
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
      break label120;
      i2 = Math.max((m - localView.getMeasuredWidth()) / 2, j);
      break label120;
      i2 = m - k - localView.getMeasuredWidth();
      k += localView.getMeasuredWidth();
      break label120;
      dispatchOnPageScrolled(paramInt1, paramFloat, paramInt2);
      if (this.mPageTransformer != null)
      {
        j = getScrollX();
        paramInt2 = getChildCount();
        for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
        {
          localObject = getChildAt(paramInt1);
          if (!((ViewPager.LayoutParams)((View)localObject).getLayoutParams()).Nq)
          {
            paramFloat = (((View)localObject).getLeft() - j) / getClientWidth();
            this.mPageTransformer.j((View)localObject, paramFloat);
          }
        }
      }
      this.mCalledSuper = true;
      return;
      label335: i4 = k;
      i2 = j;
    }
  }

  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    boolean bool = true;
    int i = getChildCount();
    int j;
    int k;
    if ((paramInt & 0x2) != 0)
    {
      j = 1;
      k = 0;
      if (k == i)
        break label105;
      View localView = getChildAt(k);
      if (localView.getVisibility() != 0)
        break label95;
      ItemInfo localItemInfo = infoForChild(localView);
      if ((localItemInfo == null) || (localItemInfo.position != this.mCurItem) || (!localView.requestFocus(paramInt, paramRect)))
        break label95;
    }
    while (true)
    {
      return bool;
      k = i - 1;
      j = -1;
      i = -1;
      break;
      label95: k += j;
      break;
      label105: bool = false;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof ViewPager.SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      paramParcelable = (ViewPager.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.LC);
      if (this.mAdapter != null)
      {
        this.mAdapter.restoreState(paramParcelable.Nt, paramParcelable.Nu);
        setCurrentItemInternal(paramParcelable.position, false, true);
      }
      else
      {
        this.mRestoredCurItem = paramParcelable.position;
        this.mRestoredAdapterState = paramParcelable.Nt;
        this.mRestoredClassLoader = paramParcelable.Nu;
      }
    }
  }

  public Parcelable onSaveInstanceState()
  {
    ViewPager.SavedState localSavedState = new ViewPager.SavedState(super.onSaveInstanceState());
    localSavedState.position = this.mCurItem;
    if (this.mAdapter != null)
      localSavedState.Nt = this.mAdapter.saveState();
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      recomputeScrollPosition(paramInt1, paramInt3, this.mPageMargin, this.mPageMargin);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    if (this.mFakeDragging)
      bool2 = true;
    while (true)
    {
      return bool2;
      if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      {
        bool2 = false;
      }
      else
      {
        if ((this.mAdapter != null) && (this.mAdapter.getCount() != 0))
          break;
        bool2 = false;
      }
    }
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    boolean bool2 = bool1;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default:
      bool2 = bool1;
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
      if (bool2)
        s.R(this);
      bool2 = true;
      break;
      this.mScroller.abortAnimation();
      this.mPopulatePending = false;
      populate();
      float f1 = paramMotionEvent.getX();
      this.mInitialMotionX = f1;
      this.mLastMotionX = f1;
      f1 = paramMotionEvent.getY();
      this.mInitialMotionY = f1;
      this.mLastMotionY = f1;
      this.mActivePointerId = paramMotionEvent.getPointerId(0);
      bool2 = bool1;
      continue;
      int i;
      float f3;
      if (!this.mIsBeingDragged)
      {
        i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
        if (i == -1)
        {
          bool2 = resetTouch();
        }
        else
        {
          f1 = paramMotionEvent.getX(i);
          float f2 = Math.abs(f1 - this.mLastMotionX);
          f3 = paramMotionEvent.getY(i);
          float f4 = Math.abs(f3 - this.mLastMotionY);
          if ((f2 > this.mTouchSlop) && (f2 > f4))
          {
            this.mIsBeingDragged = true;
            requestParentDisallowInterceptTouchEvent(true);
            if (f1 - this.mInitialMotionX <= 0.0F)
              break label405;
          }
        }
      }
      else
      {
        Object localObject;
        label405: for (f1 = this.mInitialMotionX + this.mTouchSlop; ; f1 = this.mInitialMotionX - this.mTouchSlop)
        {
          this.mLastMotionX = f1;
          this.mLastMotionY = f3;
          setScrollState(1);
          setScrollingCacheEnabled(true);
          localObject = getParent();
          if (localObject != null)
            ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
          bool2 = bool1;
          if (!this.mIsBeingDragged)
            break;
          bool2 = performDrag(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.mActivePointerId))) | false;
          break;
        }
        bool2 = bool1;
        if (this.mIsBeingDragged)
        {
          localObject = this.mVelocityTracker;
          ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.mMaximumVelocity);
          int j = (int)((VelocityTracker)localObject).getXVelocity(this.mActivePointerId);
          this.mPopulatePending = true;
          i = getClientWidth();
          int k = getScrollX();
          localObject = infoForCurrentScrollPosition();
          f1 = this.mPageMargin / i;
          setCurrentItemInternal(determineTargetPage(((ItemInfo)localObject).position, (k / i - ((ItemInfo)localObject).offset) / (((ItemInfo)localObject).widthFactor + f1), j, (int)(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, j);
          bool2 = resetTouch();
          continue;
          bool2 = bool1;
          if (this.mIsBeingDragged)
          {
            scrollToItem(this.mCurItem, true, 0, false);
            bool2 = resetTouch();
            continue;
            i = paramMotionEvent.getActionIndex();
            this.mLastMotionX = paramMotionEvent.getX(i);
            this.mActivePointerId = paramMotionEvent.getPointerId(i);
            bool2 = bool1;
            continue;
            onSecondaryPointerUp(paramMotionEvent);
            this.mLastMotionX = paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.mActivePointerId));
            bool2 = bool1;
          }
        }
      }
    }
  }

  boolean pageLeft()
  {
    boolean bool = true;
    if (this.mCurItem > 0)
      setCurrentItem(this.mCurItem - 1, true);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  boolean pageRight()
  {
    boolean bool = true;
    if ((this.mAdapter != null) && (this.mCurItem < this.mAdapter.getCount() - 1))
      setCurrentItem(this.mCurItem + 1, true);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  void populate()
  {
    populate(this.mCurItem);
  }

  void populate(int paramInt)
  {
    Object localObject1;
    if (this.mCurItem != paramInt)
    {
      localObject1 = infoForPosition(this.mCurItem);
      this.mCurItem = paramInt;
    }
    while (true)
    {
      if (this.mAdapter == null)
        sortChildDrawingOrder();
      do
        while (true)
        {
          return;
          if (!this.mPopulatePending)
            break;
          sortChildDrawingOrder();
        }
      while (getWindowToken() == null);
      this.mAdapter.startUpdate(this);
      paramInt = this.mOffscreenPageLimit;
      int i = Math.max(0, this.mCurItem - paramInt);
      int j = this.mAdapter.getCount();
      int k = Math.min(j - 1, paramInt + this.mCurItem);
      Object localObject2;
      if (j != this.mExpectedAdapterCount)
        try
        {
          String str = getResources().getResourceName(getId());
          throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + j + " Pager id: " + str + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          while (true)
            localObject2 = Integer.toHexString(getId());
        }
      paramInt = 0;
      label220: if (paramInt < this.mItems.size())
      {
        localObject2 = (ItemInfo)this.mItems.get(paramInt);
        if (((ItemInfo)localObject2).position >= this.mCurItem)
          if (((ItemInfo)localObject2).position != this.mCurItem)
            break label1186;
      }
      label650: label798: label1186: 
      while (true)
      {
        if ((localObject2 == null) && (j > 0));
        label435: label827: for (Object localObject3 = addNewItem(this.mCurItem, paramInt); ; localObject3 = localObject2)
        {
          float f1;
          int m;
          label321: int n;
          float f2;
          label335: int i1;
          int i2;
          if (localObject3 != null)
          {
            f1 = 0.0F;
            m = paramInt - 1;
            if (m >= 0)
            {
              localObject2 = (ItemInfo)this.mItems.get(m);
              n = getClientWidth();
              if (n > 0)
                break label456;
              f2 = 0.0F;
              i1 = this.mCurItem - 1;
              i2 = paramInt;
              paramInt = m;
              label349: if (i1 < 0)
                break label584;
              if ((f1 < f2) || (i1 >= i))
                break label484;
              if (localObject2 == null)
                break label584;
              if ((i1 != ((ItemInfo)localObject2).position) || (((ItemInfo)localObject2).scrolling))
                break label1176;
              this.mItems.remove(paramInt);
              this.mAdapter.destroyItem(this, i1, ((ItemInfo)localObject2).object);
              paramInt--;
              if (paramInt < 0)
                break label478;
              localObject2 = (ItemInfo)this.mItems.get(paramInt);
              i2--;
            }
          }
          label584: 
          while (true)
          {
            i1--;
            break label349;
            paramInt++;
            break label220;
            localObject2 = null;
            break label321;
            label456: f2 = 2.0F - ((ItemInfo)localObject3).widthFactor + getPaddingLeft() / n;
            break label335;
            label478: localObject2 = null;
            break label435;
            label484: if ((localObject2 != null) && (i1 == ((ItemInfo)localObject2).position))
            {
              f1 += ((ItemInfo)localObject2).widthFactor;
              paramInt--;
              if (paramInt >= 0)
                localObject2 = (ItemInfo)this.mItems.get(paramInt);
              else
                localObject2 = null;
            }
            else
            {
              f1 += addNewItem(i1, paramInt + 1).widthFactor;
              i2++;
              if (paramInt >= 0);
              for (localObject2 = (ItemInfo)this.mItems.get(paramInt); ; localObject2 = null)
                break;
              float f3 = ((ItemInfo)localObject3).widthFactor;
              m = i2 + 1;
              if (f3 < 2.0F)
              {
                label638: Object localObject4;
                if (m < this.mItems.size())
                {
                  localObject2 = (ItemInfo)this.mItems.get(m);
                  if (n > 0)
                    break label798;
                  f2 = 0.0F;
                  i1 = this.mCurItem + 1;
                  localObject4 = localObject2;
                  if (i1 >= j)
                    break label948;
                  if ((f3 < f2) || (i1 <= k))
                    break label827;
                  if (localObject4 == null)
                    break label948;
                  localObject2 = localObject4;
                  f1 = f3;
                  paramInt = m;
                  if (i1 == localObject4.position)
                  {
                    localObject2 = localObject4;
                    f1 = f3;
                    paramInt = m;
                    if (!localObject4.scrolling)
                    {
                      this.mItems.remove(m);
                      this.mAdapter.destroyItem(this, i1, localObject4.object);
                      if (m >= this.mItems.size())
                        break label814;
                      localObject2 = (ItemInfo)this.mItems.get(m);
                      paramInt = m;
                      f1 = f3;
                    }
                  }
                }
                while (true)
                {
                  i1++;
                  localObject4 = localObject2;
                  f3 = f1;
                  m = paramInt;
                  break label650;
                  localObject2 = null;
                  break;
                  f2 = getPaddingRight() / n + 2.0F;
                  break label638;
                  localObject2 = null;
                  f1 = f3;
                  paramInt = m;
                  continue;
                  if ((localObject4 != null) && (i1 == localObject4.position))
                  {
                    f1 = f3 + localObject4.widthFactor;
                    paramInt = m + 1;
                    if (paramInt < this.mItems.size())
                      localObject2 = (ItemInfo)this.mItems.get(paramInt);
                    else
                      localObject2 = null;
                  }
                  else
                  {
                    localObject2 = addNewItem(i1, m);
                    paramInt = m + 1;
                    f1 = f3 + ((ItemInfo)localObject2).widthFactor;
                    if (paramInt < this.mItems.size())
                      localObject2 = (ItemInfo)this.mItems.get(paramInt);
                    else
                      localObject2 = null;
                  }
                }
              }
              calculatePageOffsets((ItemInfo)localObject3, i2, (ItemInfo)localObject1);
              this.mAdapter.setPrimaryItem(this, this.mCurItem, ((ItemInfo)localObject3).object);
              this.mAdapter.finishUpdate(this);
              i2 = getChildCount();
              for (paramInt = 0; paramInt < i2; paramInt++)
              {
                localObject1 = getChildAt(paramInt);
                localObject2 = (ViewPager.LayoutParams)((View)localObject1).getLayoutParams();
                ((ViewPager.LayoutParams)localObject2).Ns = paramInt;
                if ((!((ViewPager.LayoutParams)localObject2).Nq) && (((ViewPager.LayoutParams)localObject2).widthFactor == 0.0F))
                {
                  localObject1 = infoForChild((View)localObject1);
                  if (localObject1 != null)
                  {
                    ((ViewPager.LayoutParams)localObject2).widthFactor = ((ItemInfo)localObject1).widthFactor;
                    ((ViewPager.LayoutParams)localObject2).position = ((ItemInfo)localObject1).position;
                  }
                }
              }
              sortChildDrawingOrder();
              if (!hasFocus())
                break;
              localObject2 = findFocus();
              if (localObject2 != null);
              for (localObject2 = infoForAnyChild((View)localObject2); ; localObject2 = null)
              {
                if ((localObject2 != null) && (((ItemInfo)localObject2).position == this.mCurItem))
                  break label1174;
                for (paramInt = 0; ; paramInt++)
                {
                  if (paramInt >= getChildCount())
                    break label1168;
                  localObject2 = getChildAt(paramInt);
                  localObject1 = infoForChild((View)localObject2);
                  if ((localObject1 != null) && (((ItemInfo)localObject1).position == this.mCurItem) && (((View)localObject2).requestFocus(2)))
                    break;
                }
                break;
              }
              break;
            }
          }
        }
        label814: label948: localObject2 = null;
      }
      label1168: label1174: label1176: localObject1 = null;
    }
  }

  public void removeOnAdapterChangeListener(ViewPager.c paramc)
  {
    if (this.mAdapterChangeListeners != null)
      this.mAdapterChangeListeners.remove(paramc);
  }

  public void removeOnPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    if (this.mOnPageChangeListeners != null)
      this.mOnPageChangeListeners.remove(paramOnPageChangeListener);
  }

  public void removeView(View paramView)
  {
    if (this.mInLayout)
      removeViewInLayout(paramView);
    while (true)
    {
      return;
      super.removeView(paramView);
    }
  }

  public void setAdapter(p paramp)
  {
    int i = 0;
    int j;
    if (this.mAdapter != null)
    {
      this.mAdapter.setViewPagerObserver(null);
      this.mAdapter.startUpdate(this);
      for (j = 0; j < this.mItems.size(); j++)
      {
        localObject = (ItemInfo)this.mItems.get(j);
        this.mAdapter.destroyItem(this, ((ItemInfo)localObject).position, ((ItemInfo)localObject).object);
      }
      this.mAdapter.finishUpdate(this);
      this.mItems.clear();
      removeNonDecorViews();
      this.mCurItem = 0;
      scrollTo(0, 0);
    }
    Object localObject = this.mAdapter;
    this.mAdapter = paramp;
    this.mExpectedAdapterCount = 0;
    boolean bool;
    if (this.mAdapter != null)
    {
      if (this.mObserver == null)
        this.mObserver = new ViewPager.e(this);
      this.mAdapter.setViewPagerObserver(this.mObserver);
      this.mPopulatePending = false;
      bool = this.mFirstLayout;
      this.mFirstLayout = true;
      this.mExpectedAdapterCount = this.mAdapter.getCount();
      if (this.mRestoredCurItem < 0)
        break label298;
      this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
      setCurrentItemInternal(this.mRestoredCurItem, false, true);
      this.mRestoredCurItem = -1;
      this.mRestoredAdapterState = null;
      this.mRestoredClassLoader = null;
    }
    while ((this.mAdapterChangeListeners != null) && (!this.mAdapterChangeListeners.isEmpty()))
    {
      int k = this.mAdapterChangeListeners.size();
      for (j = i; j < k; j++)
        ((ViewPager.c)this.mAdapterChangeListeners.get(j)).a(this, (p)localObject, paramp);
      label298: if (!bool)
        populate();
      else
        requestLayout();
    }
  }

  public void setCurrentItem(int paramInt)
  {
    this.mPopulatePending = false;
    if (!this.mFirstLayout);
    for (boolean bool = true; ; bool = false)
    {
      setCurrentItemInternal(paramInt, bool, false);
      return;
    }
  }

  public void setCurrentItem(int paramInt, boolean paramBoolean)
  {
    this.mPopulatePending = false;
    setCurrentItemInternal(paramInt, paramBoolean, false);
  }

  void setCurrentItemInternal(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    setCurrentItemInternal(paramInt, paramBoolean1, paramBoolean2, 0);
  }

  void setCurrentItemInternal(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    boolean bool = false;
    if ((this.mAdapter == null) || (this.mAdapter.getCount() <= 0))
      setScrollingCacheEnabled(false);
    while (true)
    {
      return;
      if ((!paramBoolean2) && (this.mCurItem == paramInt1) && (this.mItems.size() != 0))
      {
        setScrollingCacheEnabled(false);
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
            ((ItemInfo)this.mItems.get(paramInt1)).scrolling = true;
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
          if (paramBoolean2)
            dispatchOnPageSelected(i);
          requestLayout();
        }
        else
        {
          populate(i);
          scrollToItem(i, paramBoolean1, paramInt2, paramBoolean2);
        }
      }
    }
  }

  OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    OnPageChangeListener localOnPageChangeListener = this.mInternalPageChangeListener;
    this.mInternalPageChangeListener = paramOnPageChangeListener;
    return localOnPageChangeListener;
  }

  public void setOffscreenPageLimit(int paramInt)
  {
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
  }

  @Deprecated
  public void setOnPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    this.mOnPageChangeListener = paramOnPageChangeListener;
  }

  public void setPageMargin(int paramInt)
  {
    int i = this.mPageMargin;
    this.mPageMargin = paramInt;
    int j = getWidth();
    recomputeScrollPosition(j, j, paramInt, i);
    requestLayout();
  }

  public void setPageMarginDrawable(int paramInt)
  {
    setPageMarginDrawable(android.support.v4.content.b.g(getContext(), paramInt));
  }

  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    this.mMarginDrawable = paramDrawable;
    if (paramDrawable != null)
      refreshDrawableState();
    if (paramDrawable == null);
    for (boolean bool = true; ; bool = false)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
    }
  }

  public void setPageTransformer(boolean paramBoolean, ViewPager.d paramd)
  {
    setPageTransformer(paramBoolean, paramd, 2);
  }

  public void setPageTransformer(boolean paramBoolean, ViewPager.d paramd, int paramInt)
  {
    int i = 1;
    boolean bool1;
    boolean bool2;
    label20: int j;
    if (paramd != null)
    {
      bool1 = true;
      if (this.mPageTransformer == null)
        break label80;
      bool2 = true;
      if (bool1 == bool2)
        break label86;
      j = 1;
      label30: this.mPageTransformer = paramd;
      setChildrenDrawingOrderEnabled(bool1);
      if (!bool1)
        break label92;
      if (paramBoolean)
        i = 2;
      this.mDrawingOrder = i;
      this.mPageTransformerLayerType = paramInt;
    }
    while (true)
    {
      if (j != 0)
        populate();
      return;
      bool1 = false;
      break;
      label80: bool2 = false;
      break label20;
      label86: j = 0;
      break label30;
      label92: this.mDrawingOrder = 0;
    }
  }

  void setScrollState(int paramInt)
  {
    if (this.mScrollState == paramInt)
      return;
    this.mScrollState = paramInt;
    if (this.mPageTransformer != null)
      if (paramInt == 0)
        break label40;
    label40: for (boolean bool = true; ; bool = false)
    {
      enableLayers(bool);
      dispatchOnScrollStateChanged(paramInt);
      break;
    }
  }

  void smoothScrollTo(int paramInt1, int paramInt2)
  {
    smoothScrollTo(paramInt1, paramInt2, 0);
  }

  void smoothScrollTo(int paramInt1, int paramInt2, int paramInt3)
  {
    if (getChildCount() == 0)
    {
      setScrollingCacheEnabled(false);
      return;
    }
    int i;
    if ((this.mScroller != null) && (!this.mScroller.isFinished()))
    {
      i = 1;
      label33: if (i == 0)
        break label127;
      if (!this.mIsScrollStarted)
        break label115;
      i = this.mScroller.getCurrX();
      label54: this.mScroller.abortAnimation();
      setScrollingCacheEnabled(false);
    }
    int j;
    int k;
    while (true)
    {
      j = getScrollY();
      k = paramInt1 - i;
      paramInt2 -= j;
      if ((k != 0) || (paramInt2 != 0))
        break label136;
      completeScroll(false);
      populate();
      setScrollState(0);
      break;
      i = 0;
      break label33;
      label115: i = this.mScroller.getStartX();
      break label54;
      label127: i = getScrollX();
    }
    label136: setScrollingCacheEnabled(true);
    setScrollState(2);
    paramInt1 = getClientWidth();
    int m = paramInt1 / 2;
    float f1 = Math.min(1.0F, Math.abs(k) * 1.0F / paramInt1);
    float f2 = m;
    float f3 = m;
    f1 = distanceInfluenceForSnapDuration(f1);
    paramInt3 = Math.abs(paramInt3);
    if (paramInt3 > 0);
    for (paramInt1 = Math.round(1000.0F * Math.abs((f3 * f1 + f2) / paramInt3)) * 4; ; paramInt1 = (int)((Math.abs(k) / (f2 * f3 + this.mPageMargin) + 1.0F) * 100.0F))
    {
      paramInt1 = Math.min(paramInt1, 600);
      this.mIsScrollStarted = false;
      this.mScroller.startScroll(i, j, k, paramInt2, paramInt1);
      s.R(this);
      break;
      f2 = paramInt1;
      f3 = this.mAdapter.getPageWidth(this.mCurItem);
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.mMarginDrawable));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static class ItemInfo
  {
    Object object;
    float offset;
    int position;
    boolean scrolling;
    float widthFactor;
  }

  public static abstract interface OnPageChangeListener
  {
    public abstract void onPageScrollStateChanged(int paramInt);

    public abstract void onPageScrolled(int paramInt1, float paramFloat, int paramInt2);

    public abstract void onPageSelected(int paramInt);
  }

  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface a
  {
  }

  final class b extends a
  {
    b()
    {
    }

    private boolean er()
    {
      boolean bool = true;
      if ((ViewPager.this.mAdapter != null) && (ViewPager.this.mAdapter.getCount() > 1));
      while (true)
      {
        return bool;
        bool = false;
      }
    }

    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ViewPager.class.getName());
      paramAccessibilityEvent.setScrollable(er());
      if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.this.mAdapter != null))
      {
        paramAccessibilityEvent.setItemCount(ViewPager.this.mAdapter.getCount());
        paramAccessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
        paramAccessibilityEvent.setToIndex(ViewPager.this.mCurItem);
      }
    }

    public final void onInitializeAccessibilityNodeInfo(View paramView, android.support.v4.view.a.b paramb)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramb);
      paramb.setClassName(ViewPager.class.getName());
      paramb.setScrollable(er());
      if (ViewPager.this.canScrollHorizontally(1))
        paramb.addAction(4096);
      if (ViewPager.this.canScrollHorizontally(-1))
        paramb.addAction(8192);
    }

    public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      boolean bool = true;
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle));
      while (true)
      {
        return bool;
        switch (paramInt)
        {
        default:
          bool = false;
          break;
        case 4096:
          if (ViewPager.this.canScrollHorizontally(1))
            ViewPager.this.setCurrentItem(ViewPager.this.mCurItem + 1);
          else
            bool = false;
          break;
        case 8192:
          if (ViewPager.this.canScrollHorizontally(-1))
            ViewPager.this.setCurrentItem(ViewPager.this.mCurItem - 1);
          else
            bool = false;
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager
 * JD-Core Version:    0.6.2
 */