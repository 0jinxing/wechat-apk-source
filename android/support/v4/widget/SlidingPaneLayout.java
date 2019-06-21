package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.a;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup
{
  static final e RJ;
  View RA;
  float RB;
  private float RC;
  int RD;
  int RE;
  private d RF;
  final t RG;
  boolean RH;
  final ArrayList<b> RI = new ArrayList();
  int Rv = -858993460;
  private int Rw;
  private Drawable Rx;
  private Drawable Ry;
  private final int Rz;
  private boolean mCanSlide;
  private boolean mFirstLayout = true;
  private float mInitialMotionX;
  private float mInitialMotionY;
  boolean mIsUnableToDrag;
  private final Rect oT = new Rect();

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
      RJ = new h();
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 16)
        RJ = new g();
      else
        RJ = new f();
    }
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.Rz = ((int)(32.0F * f + 0.5F));
    setWillNotDraw(false);
    s.a(this, new a());
    s.o(this, 1);
    this.RG = t.a(this, 0.5F, new c());
    this.RG.SQ = (f * 400.0F);
  }

  private boolean G(float paramFloat)
  {
    boolean bool;
    if (!this.mCanSlide)
      bool = false;
    while (true)
    {
      return bool;
      bool = eR();
      LayoutParams localLayoutParams = (LayoutParams)this.RA.getLayoutParams();
      int j;
      int k;
      if (bool)
      {
        i = getPaddingRight();
        j = localLayoutParams.rightMargin;
        k = this.RA.getWidth();
      }
      for (int i = (int)(getWidth() - (j + i + this.RD * paramFloat + k)); ; i = (int)(localLayoutParams.leftMargin + i + this.RD * paramFloat))
      {
        if (!this.RG.h(this.RA, i, this.RA.getTop()))
          break label143;
        eP();
        s.R(this);
        bool = true;
        break;
        i = getPaddingLeft();
      }
      label143: bool = false;
    }
  }

  private boolean eQ()
  {
    boolean bool = false;
    if ((this.mFirstLayout) || (G(0.0F)))
    {
      this.RH = false;
      bool = true;
    }
    return bool;
  }

  final void H(float paramFloat)
  {
    boolean bool = eR();
    Object localObject = (LayoutParams)this.RA.getLayoutParams();
    int i;
    label41: int k;
    if (((LayoutParams)localObject).RN)
      if (bool)
      {
        i = ((LayoutParams)localObject).rightMargin;
        if (i > 0)
          break label169;
        i = 1;
        int j = getChildCount();
        k = 0;
        label50: if (k >= j)
          return;
        localObject = getChildAt(k);
        if (localObject != this.RA)
        {
          int m = (int)((1.0F - this.RC) * this.RE);
          this.RC = paramFloat;
          int n = m - (int)((1.0F - paramFloat) * this.RE);
          m = n;
          if (bool)
            m = -n;
          ((View)localObject).offsetLeftAndRight(m);
          if (i != 0)
            if (!bool)
              break label175;
        }
      }
    label169: label175: for (float f = this.RC - 1.0F; ; f = 1.0F - this.RC)
    {
      a((View)localObject, f, this.Rw);
      k++;
      break label50;
      i = ((LayoutParams)localObject).leftMargin;
      break;
      i = 0;
      break label41;
    }
  }

  final void a(View paramView, float paramFloat, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      int i = (int)(((0xFF000000 & paramInt) >>> 24) * paramFloat);
      if (localLayoutParams.RO == null)
        localLayoutParams.RO = new Paint();
      localLayoutParams.RO.setColorFilter(new PorterDuffColorFilter(i << 24 | 0xFFFFFF & paramInt, PorterDuff.Mode.SRC_OVER));
      if (paramView.getLayerType() != 2)
        paramView.setLayerType(2, localLayoutParams.RO);
      aN(paramView);
    }
    while (true)
    {
      return;
      if (paramView.getLayerType() != 0)
      {
        if (localLayoutParams.RO != null)
          localLayoutParams.RO.setColorFilter(null);
        paramView = new b(paramView);
        this.RI.add(paramView);
        s.b(this, paramView);
      }
    }
  }

  final void aM(View paramView)
  {
    boolean bool = eR();
    int i;
    int j;
    label29: int i1;
    label61: int i2;
    int i3;
    int i4;
    label90: int i6;
    label99: Object localObject;
    if (bool)
    {
      i = getWidth() - getPaddingRight();
      if (!bool)
        break label248;
      j = getPaddingLeft();
      int k = getPaddingTop();
      int m = getHeight();
      int n = getPaddingBottom();
      if (paramView == null)
        break label308;
      if (!paramView.isOpaque())
        break label262;
      i1 = 1;
      if (i1 == 0)
        break label308;
      i2 = paramView.getLeft();
      i3 = paramView.getRight();
      i4 = paramView.getTop();
      i1 = paramView.getBottom();
      int i5 = getChildCount();
      i6 = 0;
      if (i6 >= i5)
        return;
      localObject = getChildAt(i6);
      if (localObject == paramView)
        return;
      if (((View)localObject).getVisibility() != 8)
      {
        if (!bool)
          break label323;
        i7 = j;
        label138: int i8 = Math.max(i7, ((View)localObject).getLeft());
        int i9 = Math.max(k, ((View)localObject).getTop());
        if (!bool)
          break label329;
        i7 = i;
        label169: int i10 = Math.min(i7, ((View)localObject).getRight());
        i7 = Math.min(m - n, ((View)localObject).getBottom());
        if ((i8 < i2) || (i9 < i4) || (i10 > i3) || (i7 > i1))
          break label336;
      }
    }
    label262: label308: label323: label329: label336: for (int i7 = 4; ; i7 = 0)
    {
      ((View)localObject).setVisibility(i7);
      i6++;
      break label99;
      i = getPaddingLeft();
      break;
      label248: j = getWidth() - getPaddingRight();
      break label29;
      if (Build.VERSION.SDK_INT < 18)
      {
        localObject = paramView.getBackground();
        if (localObject != null)
        {
          if (((Drawable)localObject).getOpacity() == -1)
          {
            i1 = 1;
            break label61;
          }
          i1 = 0;
          break label61;
        }
      }
      i1 = 0;
      break label61;
      i1 = 0;
      i4 = 0;
      i3 = 0;
      i2 = 0;
      break label90;
      i7 = i;
      break label138;
      i7 = j;
      break label169;
    }
  }

  final void aN(View paramView)
  {
    RJ.a(this, paramView);
  }

  final boolean aO(View paramView)
  {
    boolean bool;
    if (paramView == null)
      bool = false;
    while (true)
    {
      return bool;
      paramView = (LayoutParams)paramView.getLayoutParams();
      if ((this.mCanSlide) && (paramView.RN) && (this.RB > 0.0F))
        bool = true;
      else
        bool = false;
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void computeScroll()
  {
    if (this.RG.eX())
    {
      if (this.mCanSlide)
        break label25;
      this.RG.abort();
    }
    while (true)
    {
      return;
      label25: s.R(this);
    }
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Drawable localDrawable;
    if (eR())
    {
      localDrawable = this.Ry;
      if (getChildCount() <= 1)
        break label48;
    }
    label48: for (View localView = getChildAt(1); ; localView = null)
    {
      if ((localView != null) && (localDrawable != null))
        break label53;
      return;
      localDrawable = this.Rx;
      break;
    }
    label53: int i = localView.getTop();
    int j = localView.getBottom();
    int k = localDrawable.getIntrinsicWidth();
    int m;
    int n;
    if (eR())
    {
      m = localView.getRight();
      n = m + k;
    }
    while (true)
    {
      localDrawable.setBounds(m, i, n, j);
      localDrawable.draw(paramCanvas);
      break;
      n = localView.getLeft();
      m = n - k;
    }
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = paramCanvas.save();
    if ((this.mCanSlide) && (!localLayoutParams.RM) && (this.RA != null))
    {
      paramCanvas.getClipBounds(this.oT);
      if (!eR())
        break label104;
      this.oT.left = Math.max(this.oT.left, this.RA.getRight());
    }
    while (true)
    {
      paramCanvas.clipRect(this.oT);
      boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i);
      return bool;
      label104: this.oT.right = Math.min(this.oT.right, this.RA.getLeft());
    }
  }

  final void eP()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() == 4)
        localView.setVisibility(0);
    }
  }

  final boolean eR()
  {
    boolean bool = true;
    if (s.T(this) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams));
    for (paramLayoutParams = new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams); ; paramLayoutParams = new LayoutParams(paramLayoutParams))
      return paramLayoutParams;
  }

  public int getCoveredFadeColor()
  {
    return this.Rw;
  }

  public int getParallaxDistance()
  {
    return this.RE;
  }

  public int getSliderFadeColor()
  {
    return this.Rv;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mFirstLayout = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.mFirstLayout = true;
    int i = this.RI.size();
    for (int j = 0; j < i; j++)
      ((b)this.RI.get(j)).run();
    this.RI.clear();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i = paramMotionEvent.getActionMasked();
    boolean bool2;
    if ((!this.mCanSlide) && (i == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null)
      {
        if (t.i(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          break label100;
        bool2 = true;
        this.RH = bool2;
      }
    }
    if ((!this.mCanSlide) || ((this.mIsUnableToDrag) && (i != 0)))
    {
      this.RG.cancel();
      bool2 = super.onInterceptTouchEvent(paramMotionEvent);
    }
    while (true)
    {
      return bool2;
      label100: bool2 = false;
      break;
      if ((i == 3) || (i == 1))
      {
        this.RG.cancel();
        bool2 = bool1;
      }
      else
      {
        switch (i)
        {
        case 1:
        default:
        case 0:
        case 2:
        }
        label156: float f1;
        float f2;
        do
        {
          for (i = 0; ; i = 1)
          {
            if (!this.RG.f(paramMotionEvent))
            {
              bool2 = bool1;
              if (i == 0)
                break;
            }
            bool2 = true;
            break;
            this.mIsUnableToDrag = false;
            f1 = paramMotionEvent.getX();
            f2 = paramMotionEvent.getY();
            this.mInitialMotionX = f1;
            this.mInitialMotionY = f2;
            if ((!t.i(this.RA, (int)f1, (int)f2)) || (!aO(this.RA)))
              break label156;
          }
          f1 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          f1 = Math.abs(f1 - this.mInitialMotionX);
          f2 = Math.abs(f2 - this.mInitialMotionY);
        }
        while ((f1 <= this.RG.mTouchSlop) || (f2 <= f1));
        this.RG.cancel();
        this.mIsUnableToDrag = true;
        bool2 = bool1;
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = eR();
    label35: label46: int k;
    float f;
    label82: int m;
    label99: LayoutParams localLayoutParams;
    int n;
    int i1;
    if (bool)
    {
      this.RG.SS = 2;
      int i = paramInt3 - paramInt1;
      if (!bool)
        break label358;
      paramInt1 = getPaddingRight();
      if (!bool)
        break label366;
      paramInt3 = getPaddingLeft();
      int j = getPaddingTop();
      k = getChildCount();
      if (this.mFirstLayout)
      {
        if ((!this.mCanSlide) || (!this.RH))
          break label375;
        f = 1.0F;
        this.RB = f;
      }
      paramInt4 = 0;
      m = paramInt1;
      paramInt2 = paramInt1;
      paramInt1 = m;
      if (paramInt4 >= k)
        break label448;
      View localView = getChildAt(paramInt4);
      if (localView.getVisibility() == 8)
        break label556;
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      n = localView.getMeasuredWidth();
      i1 = 0;
      if (!localLayoutParams.RM)
        break label396;
      m = localLayoutParams.leftMargin;
      int i2 = localLayoutParams.rightMargin;
      i2 = Math.min(paramInt1, i - paramInt3 - this.Rz) - paramInt2 - (m + i2);
      this.RD = i2;
      if (!bool)
        break label381;
      m = localLayoutParams.rightMargin;
      label208: if (paramInt2 + m + i2 + n / 2 <= i - paramInt3)
        break label391;
      paramBoolean = true;
      label230: localLayoutParams.RN = paramBoolean;
      i2 = (int)(i2 * this.RB);
      paramInt2 += m + i2;
      this.RB = (i2 / this.RD);
      m = i1;
      if (!bool)
        break label432;
      m = i - paramInt2 + m;
      i1 = m - n;
      label293: localView.layout(i1, j, m, localView.getMeasuredHeight() + j);
      m = localView.getWidth() + paramInt1;
      paramInt1 = paramInt2;
    }
    for (paramInt2 = m; ; paramInt2 = m)
    {
      m = paramInt4 + 1;
      paramInt4 = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = paramInt4;
      paramInt4 = m;
      break label99;
      this.RG.SS = 1;
      break;
      label358: paramInt1 = getPaddingLeft();
      break label35;
      label366: paramInt3 = getPaddingRight();
      break label46;
      label375: f = 0.0F;
      break label82;
      label381: m = localLayoutParams.leftMargin;
      break label208;
      label391: paramBoolean = false;
      break label230;
      label396: if ((this.mCanSlide) && (this.RE != 0));
      for (paramInt2 = (int)((1.0F - this.RB) * this.RE); ; paramInt2 = 0)
      {
        m = paramInt2;
        paramInt2 = paramInt1;
        break;
        label432: i1 = paramInt2 - m;
        m = i1 + n;
        break label293;
        label448: if (this.mFirstLayout)
        {
          if (!this.mCanSlide)
            break label523;
          if (this.RE != 0)
            H(this.RB);
          if (((LayoutParams)this.RA.getLayoutParams()).RN)
            a(this.RA, this.RB, this.Rv);
        }
        while (true)
        {
          aM(this.RA);
          this.mFirstLayout = false;
          return;
          label523: for (paramInt1 = 0; paramInt1 < k; paramInt1++)
            a(getChildAt(paramInt1), 0.0F, this.Rv);
        }
      }
      label556: m = paramInt1;
      paramInt1 = paramInt2;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt2);
    if (i != 1073741824)
      if (isInEditMode())
      {
        if ((i == -2147483648) || (i != 0))
          break label1017;
        paramInt2 = j;
        j = 300;
        paramInt1 = k;
      }
    while (true)
    {
      i = 0;
      switch (paramInt2)
      {
      default:
        k = 0;
        paramInt1 = i;
      case 1073741824:
      case -2147483648:
      }
      float f;
      boolean bool1;
      int m;
      int n;
      int i1;
      int i2;
      View localView;
      LayoutParams localLayoutParams;
      while (true)
      {
        f = 0.0F;
        bool1 = false;
        m = j - getPaddingLeft() - getPaddingRight();
        n = getChildCount();
        this.RA = null;
        i1 = 0;
        i2 = m;
        i = paramInt1;
        paramInt1 = i2;
        while (true)
        {
          if (i1 >= n)
            break label542;
          localView = getChildAt(i1);
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (localView.getVisibility() != 8)
            break;
          localLayoutParams.RN = false;
          i1++;
        }
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (j != 0)
          break label1017;
        if (isInEditMode())
        {
          if (j != 0)
            break label1017;
          k = 300;
          paramInt2 = -2147483648;
          j = paramInt1;
          paramInt1 = k;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        paramInt1 = paramInt1 - getPaddingTop() - getPaddingBottom();
        k = paramInt1;
        continue;
        k = paramInt1 - getPaddingTop() - getPaddingBottom();
        paramInt1 = i;
      }
      if (localLayoutParams.weight > 0.0F)
      {
        f = localLayoutParams.weight + f;
        if (localLayoutParams.width == 0);
      }
      while (true)
      {
        i2 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
        label340: int i3;
        label360: int i4;
        if (localLayoutParams.width == -2)
        {
          i2 = View.MeasureSpec.makeMeasureSpec(m - i2, -2147483648);
          if (localLayoutParams.height != -2)
            break label498;
          i3 = View.MeasureSpec.makeMeasureSpec(k, -2147483648);
          localView.measure(i2, i3);
          i3 = localView.getMeasuredWidth();
          i4 = localView.getMeasuredHeight();
          i2 = i;
          if (paramInt2 == -2147483648)
          {
            i2 = i;
            if (i4 > i)
              i2 = Math.min(i4, k);
          }
          paramInt1 -= i3;
          if (paramInt1 >= 0)
            break label536;
        }
        label536: for (boolean bool2 = true; ; bool2 = false)
        {
          localLayoutParams.RM = bool2;
          if (localLayoutParams.RM)
            this.RA = localView;
          bool1 = bool2 | bool1;
          i = i2;
          break;
          if (localLayoutParams.width == -1)
          {
            i2 = View.MeasureSpec.makeMeasureSpec(m - i2, 1073741824);
            break label340;
          }
          i2 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824);
          break label340;
          label498: if (localLayoutParams.height == -1)
          {
            i3 = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
            break label360;
          }
          i3 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
          break label360;
        }
        label542: if ((bool1) || (f > 0.0F))
        {
          i1 = m - this.Rz;
          i2 = 0;
          if (i2 < n)
          {
            localView = getChildAt(i2);
            if (localView.getVisibility() != 8)
            {
              localLayoutParams = (LayoutParams)localView.getLayoutParams();
              if (localView.getVisibility() != 8)
              {
                if ((localLayoutParams.width != 0) || (localLayoutParams.weight <= 0.0F))
                  break label720;
                paramInt2 = 1;
                label631: if (paramInt2 == 0)
                  break label725;
                i3 = 0;
                label638: if ((!bool1) || (localView == this.RA))
                  break label786;
                if ((localLayoutParams.width < 0) && ((i3 > i1) || (localLayoutParams.weight > 0.0F)))
                {
                  if (paramInt2 == 0)
                    break label771;
                  if (localLayoutParams.height != -2)
                    break label735;
                  paramInt2 = View.MeasureSpec.makeMeasureSpec(k, -2147483648);
                  label700: localView.measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), paramInt2);
                }
              }
            }
            while (true)
            {
              i2++;
              break;
              label720: paramInt2 = 0;
              break label631;
              label725: i3 = localView.getMeasuredWidth();
              break label638;
              label735: if (localLayoutParams.height == -1)
              {
                paramInt2 = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
                break label700;
              }
              paramInt2 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
              break label700;
              paramInt2 = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
              break label700;
              if (localLayoutParams.weight > 0.0F)
              {
                if (localLayoutParams.width == 0)
                  if (localLayoutParams.height == -2)
                    paramInt2 = View.MeasureSpec.makeMeasureSpec(k, -2147483648);
                while (true)
                {
                  if (!bool1)
                    break label927;
                  i4 = localLayoutParams.leftMargin;
                  int i5 = m - (localLayoutParams.rightMargin + i4);
                  i4 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                  if (i3 == i5)
                    break;
                  localView.measure(i4, paramInt2);
                  break;
                  if (localLayoutParams.height == -1)
                  {
                    paramInt2 = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
                  }
                  else
                  {
                    paramInt2 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
                    continue;
                    paramInt2 = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
                  }
                }
                label927: i4 = Math.max(0, paramInt1);
                localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.weight * i4 / f) + i3, 1073741824), paramInt2);
              }
            }
          }
        }
        label771: label786: setMeasuredDimension(j, getPaddingTop() + i + getPaddingBottom());
        this.mCanSlide = bool1;
        if ((this.RG.SG != 0) && (!bool1))
          this.RG.abort();
        return;
        break;
      }
      label1017: paramInt2 = j;
      j = paramInt1;
      paramInt1 = k;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.LC);
    if (paramParcelable.RP)
      if ((this.mFirstLayout) || (G(1.0F)))
        this.RH = true;
    while (true)
    {
      this.RH = paramParcelable.RP;
      break;
      eQ();
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    boolean bool;
    if (this.mCanSlide)
      if ((!this.mCanSlide) || (this.RB == 1.0F))
        bool = true;
    while (true)
    {
      localSavedState.RP = bool;
      return localSavedState;
      bool = false;
      continue;
      bool = this.RH;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      this.mFirstLayout = true;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if (!this.mCanSlide)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      return bool;
    }
    this.RG.g(paramMotionEvent);
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      bool = true;
      break;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.mInitialMotionX = f1;
      this.mInitialMotionY = f2;
      continue;
      if (aO(this.RA))
      {
        float f3 = paramMotionEvent.getX();
        f1 = paramMotionEvent.getY();
        f2 = f3 - this.mInitialMotionX;
        float f4 = f1 - this.mInitialMotionY;
        int i = this.RG.mTouchSlop;
        if ((f2 * f2 + f4 * f4 < i * i) && (t.i(this.RA, (int)f3, (int)f1)))
          eQ();
      }
    }
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.mCanSlide))
      if (paramView1 != this.RA)
        break label36;
    label36: for (boolean bool = true; ; bool = false)
    {
      this.RH = bool;
      return;
    }
  }

  public void setCoveredFadeColor(int paramInt)
  {
    this.Rw = paramInt;
  }

  public void setPanelSlideListener(d paramd)
  {
    this.RF = paramd;
  }

  public void setParallaxDistance(int paramInt)
  {
    this.RE = paramInt;
    requestLayout();
  }

  @Deprecated
  public void setShadowDrawable(Drawable paramDrawable)
  {
    setShadowDrawableLeft(paramDrawable);
  }

  public void setShadowDrawableLeft(Drawable paramDrawable)
  {
    this.Rx = paramDrawable;
  }

  public void setShadowDrawableRight(Drawable paramDrawable)
  {
    this.Ry = paramDrawable;
  }

  @Deprecated
  public void setShadowResource(int paramInt)
  {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }

  public void setShadowResourceLeft(int paramInt)
  {
    setShadowDrawableLeft(android.support.v4.content.b.g(getContext(), paramInt));
  }

  public void setShadowResourceRight(int paramInt)
  {
    setShadowDrawableRight(android.support.v4.content.b.g(getContext(), paramInt));
  }

  public void setSliderFadeColor(int paramInt)
  {
    this.Rv = paramInt;
  }

  public static class LayoutParams extends ViewGroup.MarginLayoutParams
  {
    private static final int[] MT = { 16843137 };
    boolean RM;
    boolean RN;
    Paint RO;
    public float weight = 0.0F;

    public LayoutParams()
    {
      super(-1);
    }

    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, MT);
      this.weight = paramContext.getFloat(0, 0.0F);
      paramContext.recycle();
    }

    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }

    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }

  static class SavedState extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
    };
    boolean RP;

    SavedState(Parcel paramParcel)
    {
      super(null);
      if (paramParcel.readInt() != 0);
      for (boolean bool = true; ; bool = false)
      {
        this.RP = bool;
        return;
      }
    }

    SavedState(Parcelable paramParcelable)
    {
      super();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      if (this.RP);
      for (paramInt = 1; ; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        return;
      }
    }
  }

  final class a extends a
  {
    private final Rect oT = new Rect();

    a()
    {
    }

    private boolean aP(View paramView)
    {
      return SlidingPaneLayout.this.aO(paramView);
    }

    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(View paramView, android.support.v4.view.a.b paramb)
    {
      int i = 0;
      android.support.v4.view.a.b localb = android.support.v4.view.a.b.a(paramb);
      super.onInitializeAccessibilityNodeInfo(paramView, localb);
      Rect localRect = this.oT;
      localb.getBoundsInParent(localRect);
      paramb.setBoundsInParent(localRect);
      localb.getBoundsInScreen(localRect);
      paramb.setBoundsInScreen(localRect);
      paramb.setVisibleToUser(localb.isVisibleToUser());
      paramb.setPackageName(localb.NG.getPackageName());
      paramb.setClassName(localb.NG.getClassName());
      paramb.setContentDescription(localb.NG.getContentDescription());
      paramb.setEnabled(localb.NG.isEnabled());
      paramb.setClickable(localb.NG.isClickable());
      paramb.setFocusable(localb.NG.isFocusable());
      paramb.setFocused(localb.NG.isFocused());
      paramb.setAccessibilityFocused(localb.isAccessibilityFocused());
      paramb.setSelected(localb.NG.isSelected());
      paramb.setLongClickable(localb.NG.isLongClickable());
      paramb.addAction(localb.NG.getActions());
      if (Build.VERSION.SDK_INT >= 16);
      for (int j = localb.NG.getMovementGranularities(); ; j = 0)
      {
        if (Build.VERSION.SDK_INT >= 16)
          paramb.NG.setMovementGranularities(j);
        localb.NG.recycle();
        paramb.setClassName(SlidingPaneLayout.class.getName());
        paramb.setSource(paramView);
        paramView = s.U(paramView);
        if ((paramView instanceof View))
          paramb.setParent((View)paramView);
        int k = SlidingPaneLayout.this.getChildCount();
        for (j = i; j < k; j++)
        {
          paramView = SlidingPaneLayout.this.getChildAt(j);
          if ((!aP(paramView)) && (paramView.getVisibility() == 0))
          {
            s.o(paramView, 1);
            paramb.addChild(paramView);
          }
        }
      }
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (!aP(paramView));
      for (boolean bool = super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent); ; bool = false)
        return bool;
    }
  }

  final class b
    implements Runnable
  {
    final View RL;

    b(View arg2)
    {
      Object localObject;
      this.RL = localObject;
    }

    public final void run()
    {
      if (this.RL.getParent() == SlidingPaneLayout.this)
      {
        this.RL.setLayerType(0, null);
        SlidingPaneLayout.this.aN(this.RL);
      }
      SlidingPaneLayout.this.RI.remove(this);
    }
  }

  final class c extends t.a
  {
    c()
    {
    }

    public final void N(int paramInt)
    {
      if (SlidingPaneLayout.this.RG.SG == 0)
      {
        if (SlidingPaneLayout.this.RB != 0.0F)
          break label57;
        SlidingPaneLayout.this.aM(SlidingPaneLayout.this.RA);
        SlidingPaneLayout.this.sendAccessibilityEvent(32);
      }
      for (SlidingPaneLayout.this.RH = false; ; SlidingPaneLayout.this.RH = true)
      {
        return;
        label57: SlidingPaneLayout.this.sendAccessibilityEvent(32);
      }
    }

    public final void a(View paramView, float paramFloat1, float paramFloat2)
    {
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
      int i;
      int j;
      if (SlidingPaneLayout.this.eR())
      {
        i = SlidingPaneLayout.this.getPaddingRight();
        j = localLayoutParams.rightMargin + i;
        if (paramFloat1 >= 0.0F)
        {
          i = j;
          if (paramFloat1 == 0.0F)
          {
            i = j;
            if (SlidingPaneLayout.this.RB <= 0.5F);
          }
        }
        else
        {
          i = j + SlidingPaneLayout.this.RD;
        }
        j = SlidingPaneLayout.this.RA.getWidth();
        i = SlidingPaneLayout.this.getWidth() - i - j;
      }
      while (true)
      {
        SlidingPaneLayout.this.RG.D(i, paramView.getTop());
        SlidingPaneLayout.this.invalidate();
        return;
        i = SlidingPaneLayout.this.getPaddingLeft();
        j = localLayoutParams.leftMargin + i;
        if (paramFloat1 <= 0.0F)
        {
          i = j;
          if (paramFloat1 == 0.0F)
          {
            i = j;
            if (SlidingPaneLayout.this.RB <= 0.5F);
          }
        }
        else
        {
          i = j + SlidingPaneLayout.this.RD;
        }
      }
    }

    public final void b(View paramView, int paramInt1, int paramInt2)
    {
      SlidingPaneLayout localSlidingPaneLayout = SlidingPaneLayout.this;
      if (localSlidingPaneLayout.RA == null)
      {
        localSlidingPaneLayout.RB = 0.0F;
        SlidingPaneLayout.this.invalidate();
        return;
      }
      boolean bool = localSlidingPaneLayout.eR();
      paramView = (SlidingPaneLayout.LayoutParams)localSlidingPaneLayout.RA.getLayoutParams();
      int i = localSlidingPaneLayout.RA.getWidth();
      paramInt2 = paramInt1;
      if (bool)
        paramInt2 = localSlidingPaneLayout.getWidth() - paramInt1 - i;
      if (bool)
      {
        paramInt1 = localSlidingPaneLayout.getPaddingRight();
        label86: if (!bool)
          break label173;
      }
      label173: for (i = paramView.rightMargin; ; i = paramView.leftMargin)
      {
        localSlidingPaneLayout.RB = ((paramInt2 - (i + paramInt1)) / localSlidingPaneLayout.RD);
        if (localSlidingPaneLayout.RE != 0)
          localSlidingPaneLayout.H(localSlidingPaneLayout.RB);
        if (!paramView.RN)
          break;
        localSlidingPaneLayout.a(localSlidingPaneLayout.RA, localSlidingPaneLayout.RB, localSlidingPaneLayout.Rv);
        break;
        paramInt1 = localSlidingPaneLayout.getPaddingLeft();
        break label86;
      }
    }

    public final boolean b(View paramView, int paramInt)
    {
      if (SlidingPaneLayout.this.mIsUnableToDrag);
      for (boolean bool = false; ; bool = ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).RM)
        return bool;
    }

    public final int c(View paramView, int paramInt)
    {
      return paramView.getTop();
    }

    public final int d(View paramView, int paramInt)
    {
      paramView = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.this.RA.getLayoutParams();
      int i;
      int j;
      if (SlidingPaneLayout.this.eR())
      {
        i = SlidingPaneLayout.this.getWidth();
        j = SlidingPaneLayout.this.getPaddingRight();
        i -= paramView.rightMargin + j + SlidingPaneLayout.this.RA.getWidth();
        j = SlidingPaneLayout.this.RD;
      }
      for (paramInt = Math.max(Math.min(paramInt, i), i - j); ; paramInt = Math.min(Math.max(paramInt, j), i + j))
      {
        return paramInt;
        j = SlidingPaneLayout.this.getPaddingLeft();
        j = paramView.leftMargin + j;
        i = SlidingPaneLayout.this.RD;
      }
    }

    public final void k(View paramView, int paramInt)
    {
      SlidingPaneLayout.this.eP();
    }

    public final int s(View paramView)
    {
      return SlidingPaneLayout.this.RD;
    }

    public final void z(int paramInt1, int paramInt2)
    {
      SlidingPaneLayout.this.RG.u(SlidingPaneLayout.this.RA, paramInt2);
    }
  }

  public static abstract interface d
  {
  }

  static abstract interface e
  {
    public abstract void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView);
  }

  static class f
    implements SlidingPaneLayout.e
  {
    public void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      s.c(paramSlidingPaneLayout, paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    }
  }

  static final class g extends SlidingPaneLayout.f
  {
    private Method RQ;
    private Field RR;

    g()
    {
      try
      {
        this.RQ = View.class.getDeclaredMethod("getDisplayList", null);
        try
        {
          label16: this.RR = View.class.getDeclaredField("mRecreateDisplayList");
          this.RR.setAccessible(true);
          label35: return;
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          break label35;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label16;
      }
    }

    public final void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      if ((this.RQ != null) && (this.RR != null));
      try
      {
        this.RR.setBoolean(paramView, true);
        this.RQ.invoke(paramView, null);
        label33: super.a(paramSlidingPaneLayout, paramView);
        while (true)
        {
          return;
          paramView.invalidate();
        }
      }
      catch (Exception localException)
      {
        break label33;
      }
    }
  }

  static final class h extends SlidingPaneLayout.f
  {
    public final void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      s.a(paramView, ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).RO);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout
 * JD-Core Version:    0.6.2
 */