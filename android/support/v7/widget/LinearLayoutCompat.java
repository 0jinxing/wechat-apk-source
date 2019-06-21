package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat extends ViewGroup
{
  private int Hu = 8388659;
  private Drawable ahS;
  private boolean aln = true;
  private int alo = -1;
  private int alp = 0;
  private int alq;
  private float alr;
  private boolean als;
  private int[] alt;
  private int[] alu;
  private int alv;
  private int alw;
  private int alx;
  private int aly;
  private int mOrientation;

  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = bc.a(paramContext, paramAttributeSet, a.a.LinearLayoutCompat, paramInt, 0);
    paramInt = paramContext.getInt(1, -1);
    if (paramInt >= 0)
      setOrientation(paramInt);
    paramInt = paramContext.getInt(0, -1);
    if (paramInt >= 0)
      setGravity(paramInt);
    boolean bool = paramContext.getBoolean(2, true);
    if (!bool)
      setBaselineAligned(bool);
    this.alr = paramContext.getFloat(4, -1.0F);
    this.alo = paramContext.getInt(3, -1);
    this.als = paramContext.getBoolean(6, false);
    setDividerDrawable(paramContext.getDrawable(5));
    this.alx = paramContext.getInt(7, 0);
    this.aly = paramContext.getDimensionPixelSize(8, 0);
    paramContext.atG.recycle();
  }

  private void ad(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (int j = 0; j < paramInt1; j++)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (localLayoutParams.width == -1)
        {
          int k = localLayoutParams.height;
          localLayoutParams.height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, i, 0, paramInt2, 0);
          localLayoutParams.height = k;
        }
      }
    }
  }

  private void ae(int paramInt1, int paramInt2)
  {
    this.alq = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 1;
    float f1 = 0.0F;
    int i1 = getVirtualChildCount();
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = 0;
    int i5 = 0;
    if ((this.alt == null) || (this.alu == null))
    {
      this.alt = new int[4];
      this.alu = new int[4];
    }
    Object localObject1 = this.alt;
    Object localObject2 = this.alu;
    localObject1[3] = -1;
    localObject1[2] = -1;
    localObject1[1] = -1;
    localObject1[0] = -1;
    localObject2[3] = -1;
    localObject2[2] = -1;
    localObject2[1] = -1;
    localObject2[0] = -1;
    boolean bool1 = this.aln;
    boolean bool2 = this.als;
    if (i2 == 1073741824);
    int i7;
    int i8;
    Object localObject3;
    int i9;
    for (int i6 = 1; ; i6 = 0)
    {
      i7 = 0;
      for (i8 = 0; ; i8 = i9)
      {
        if (i8 >= i1)
          break label845;
        localObject3 = getChildAt(i8);
        if (localObject3 != null)
          break;
        this.alq += 0;
        i9 = i8;
        i8 = m;
        i9++;
        m = i8;
      }
    }
    LayoutParams localLayoutParams;
    label314: label335: int i10;
    label360: int i11;
    int i13;
    if (((View)localObject3).getVisibility() != 8)
    {
      if (bV(i8))
        this.alq += this.alv;
      localLayoutParams = (LayoutParams)((View)localObject3).getLayoutParams();
      f1 += localLayoutParams.weight;
      if ((i2 == 1073741824) && (localLayoutParams.width == 0) && (localLayoutParams.weight > 0.0F))
        if (i6 != 0)
        {
          this.alq += localLayoutParams.leftMargin + localLayoutParams.rightMargin;
          if (!bool1)
            break label603;
          i9 = View.MeasureSpec.makeMeasureSpec(0, 0);
          ((View)localObject3).measure(i9, i9);
          i10 = 0;
          if ((i3 == 1073741824) || (localLayoutParams.height != -1))
            break label2206;
          i9 = 1;
          i4 = 1;
          i11 = localLayoutParams.topMargin + localLayoutParams.bottomMargin;
          i10 = ((View)localObject3).getMeasuredHeight() + i11;
          j = View.combineMeasuredStates(j, ((View)localObject3).getMeasuredState());
          if (bool1)
          {
            int i12 = ((View)localObject3).getBaseline();
            if (i12 != -1)
            {
              if (localLayoutParams.gravity >= 0)
                break label784;
              i13 = this.Hu;
              label427: i13 = ((i13 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              localObject1[i13] = Math.max(localObject1[i13], i12);
              localObject2[i13] = Math.max(localObject2[i13], i10 - i12);
            }
          }
          i13 = Math.max(i, i10);
          if ((n == 0) || (localLayoutParams.height != -1))
            break label794;
          i = 1;
          label498: if (localLayoutParams.weight <= 0.0F)
            break label806;
          if (i4 == 0)
            break label799;
          label513: n = Math.max(m, i11);
          i4 = i5;
          m = i13;
          i5 = i;
        }
    }
    while (true)
    {
      i11 = i8 + 0;
      i = i4;
      i4 = i9;
      i10 = i5;
      i8 = n;
      i9 = i11;
      i5 = i;
      n = i10;
      i = m;
      break;
      i9 = this.alq;
      this.alq = Math.max(i9, localLayoutParams.leftMargin + i9 + localLayoutParams.rightMargin);
      break label314;
      label603: i5 = 1;
      break label335;
      i10 = -2147483648;
      i9 = i10;
      if (localLayoutParams.width == 0)
      {
        i9 = i10;
        if (localLayoutParams.weight > 0.0F)
        {
          i9 = 0;
          localLayoutParams.width = -2;
        }
      }
      if (f1 == 0.0F)
      {
        i10 = this.alq;
        label662: h((View)localObject3, paramInt1, i10, paramInt2, 0);
        if (i9 != -2147483648)
          localLayoutParams.width = i9;
        i9 = ((View)localObject3).getMeasuredWidth();
        if (i6 == 0)
          break label747;
        this.alq += localLayoutParams.leftMargin + i9 + localLayoutParams.rightMargin + 0;
      }
      while (true)
        if (bool2)
        {
          i7 = Math.max(i9, i7);
          break;
          i10 = 0;
          break label662;
          label747: i10 = this.alq;
          this.alq = Math.max(i10, i10 + i9 + localLayoutParams.leftMargin + localLayoutParams.rightMargin + 0);
          continue;
          label784: i13 = localLayoutParams.gravity;
          break label427;
          label794: i = 0;
          break label498;
          label799: i11 = i10;
          break label513;
          label806: if (i4 != 0)
            i10 = i11;
          while (true)
          {
            k = Math.max(k, i10);
            i4 = i5;
            n = m;
            i5 = i;
            m = i13;
            break;
          }
          label845: if ((this.alq > 0) && (bV(i1)))
            this.alq += this.alv;
          if ((localObject1[1] != -1) || (localObject1[0] != -1) || (localObject1[2] != -1) || (localObject1[3] != -1));
          for (i8 = Math.max(i, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + Math.max(localObject2[3], Math.max(localObject2[0], Math.max(localObject2[1], localObject2[2])))); ; i8 = i)
          {
            if ((bool2) && ((i2 == -2147483648) || (i2 == 0)))
            {
              this.alq = 0;
              i = 0;
              if (i < i1)
              {
                localObject3 = getChildAt(i);
                if (localObject3 == null)
                  this.alq += 0;
                while (true)
                {
                  i++;
                  break;
                  if (((View)localObject3).getVisibility() == 8)
                  {
                    i += 0;
                  }
                  else
                  {
                    localObject3 = (LayoutParams)((View)localObject3).getLayoutParams();
                    if (i6 != 0)
                    {
                      i10 = this.alq;
                      i9 = ((LayoutParams)localObject3).leftMargin;
                      this.alq = (((LayoutParams)localObject3).rightMargin + (i9 + i7) + 0 + i10);
                    }
                    else
                    {
                      i9 = this.alq;
                      i10 = ((LayoutParams)localObject3).leftMargin;
                      this.alq = Math.max(i9, ((LayoutParams)localObject3).rightMargin + (i9 + i7 + i10) + 0);
                    }
                  }
                }
              }
            }
            this.alq += getPaddingLeft() + getPaddingRight();
            i11 = View.resolveSizeAndState(Math.max(this.alq, getSuggestedMinimumWidth()), paramInt1, 0);
            i9 = (0xFFFFFF & i11) - this.alq;
            if ((i5 != 0) || ((i9 != 0) && (f1 > 0.0F)))
            {
              if (this.alr > 0.0F)
                f1 = this.alr;
              localObject1[3] = -1;
              localObject1[2] = -1;
              localObject1[1] = -1;
              localObject1[0] = -1;
              localObject2[3] = -1;
              localObject2[2] = -1;
              localObject2[1] = -1;
              localObject2[0] = -1;
              i = -1;
              this.alq = 0;
              m = 0;
              i5 = n;
              i7 = k;
              n = i;
              i = j;
              j = i5;
              k = i9;
              if (m < i1)
              {
                localObject3 = getChildAt(m);
                if ((localObject3 == null) || (((View)localObject3).getVisibility() == 8))
                  break label2181;
                localLayoutParams = (LayoutParams)((View)localObject3).getLayoutParams();
                float f2 = localLayoutParams.weight;
                if (f2 <= 0.0F)
                  break label2178;
                i8 = (int)(k * f2 / f1);
                f1 -= f2;
                i5 = k - i8;
                i9 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom() + localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height);
                if ((localLayoutParams.width != 0) || (i2 != 1073741824))
                {
                  i8 += ((View)localObject3).getMeasuredWidth();
                  k = i8;
                  if (i8 < 0)
                    k = 0;
                  label1430: ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(k, 1073741824), i9);
                  i = View.combineMeasuredStates(i, ((View)localObject3).getMeasuredState() & 0xFF000000);
                  k = i5;
                  label1461: if (i6 == 0)
                    break label1722;
                  this.alq += ((View)localObject3).getMeasuredWidth() + localLayoutParams.leftMargin + localLayoutParams.rightMargin + 0;
                  label1494: if ((i3 == 1073741824) || (localLayoutParams.height != -1))
                    break label1762;
                  i5 = 1;
                  label1513: i10 = localLayoutParams.topMargin + localLayoutParams.bottomMargin;
                  i9 = ((View)localObject3).getMeasuredHeight() + i10;
                  i8 = Math.max(n, i9);
                  if (i5 == 0)
                    break label1768;
                  n = i10;
                  label1554: i5 = Math.max(i7, n);
                  if ((j == 0) || (localLayoutParams.height != -1))
                    break label1775;
                  i7 = 1;
                  label1580: if (bool1)
                  {
                    n = ((View)localObject3).getBaseline();
                    if (n != -1)
                    {
                      if (localLayoutParams.gravity >= 0)
                        break label1781;
                      j = this.Hu;
                      label1612: j = ((j & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                      localObject1[j] = Math.max(localObject1[j], n);
                      localObject2[j] = Math.max(localObject2[j], i9 - n);
                    }
                  }
                  n = i7;
                  j = i5;
                  i7 = i8;
                }
              }
            }
            while (true)
            {
              i8 = m + 1;
              i5 = n;
              m = j;
              n = i7;
              j = i5;
              i7 = m;
              m = i8;
              break;
              if (i8 > 0)
              {
                k = i8;
                break label1430;
              }
              k = 0;
              break label1430;
              label1722: i5 = this.alq;
              this.alq = Math.max(i5, ((View)localObject3).getMeasuredWidth() + i5 + localLayoutParams.leftMargin + localLayoutParams.rightMargin + 0);
              break label1494;
              label1762: i5 = 0;
              break label1513;
              label1768: n = i9;
              break label1554;
              label1775: i7 = 0;
              break label1580;
              label1781: j = localLayoutParams.gravity;
              break label1612;
              this.alq += getPaddingLeft() + getPaddingRight();
              if ((localObject1[1] == -1) && (localObject1[0] == -1) && (localObject1[2] == -1))
              {
                k = n;
                if (localObject1[3] == -1);
              }
              else
              {
                k = Math.max(n, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + Math.max(localObject2[3], Math.max(localObject2[0], Math.max(localObject2[1], localObject2[2]))));
              }
              n = j;
              j = i;
              for (i = k; ; i = i8)
              {
                if ((n == 0) && (i3 != 1073741824));
                while (true)
                {
                  setMeasuredDimension(0xFF000000 & j | i11, View.resolveSizeAndState(Math.max(i7 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), paramInt2, j << 16));
                  if (i4 != 0)
                  {
                    i7 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    paramInt2 = 0;
                    while (paramInt2 < i1)
                    {
                      localObject2 = getChildAt(paramInt2);
                      if (((View)localObject2).getVisibility() != 8)
                      {
                        localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
                        if (((LayoutParams)localObject1).height == -1)
                        {
                          j = ((LayoutParams)localObject1).width;
                          ((LayoutParams)localObject1).width = ((View)localObject2).getMeasuredWidth();
                          measureChildWithMargins((View)localObject2, paramInt1, 0, i7, 0);
                          ((LayoutParams)localObject1).width = j;
                        }
                      }
                      paramInt2++;
                      continue;
                      k = Math.max(k, m);
                      if ((!bool2) || (i2 == 1073741824))
                        break label2168;
                      for (i = 0; i < i1; i++)
                      {
                        localObject2 = getChildAt(i);
                        if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8) && (((LayoutParams)((View)localObject2).getLayoutParams()).weight > 0.0F))
                          ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject2).getMeasuredHeight(), 1073741824));
                      }
                    }
                  }
                  return;
                  i7 = i;
                }
                label2168: i7 = k;
              }
              label2178: break label1461;
              label2181: i5 = i7;
              i7 = n;
              n = j;
              j = i5;
            }
          }
          label2206: i9 = i4;
          i4 = i10;
          break label360;
        }
      break label335;
      i10 = i5;
      i5 = n;
      n = m;
      i9 = i4;
      i4 = i10;
      m = i;
    }
  }

  private void b(Canvas paramCanvas, int paramInt)
  {
    this.ahS.setBounds(getPaddingLeft() + this.aly, paramInt, getWidth() - getPaddingRight() - this.aly, this.alw + paramInt);
    this.ahS.draw(paramCanvas);
  }

  private void c(Canvas paramCanvas, int paramInt)
  {
    this.ahS.setBounds(paramInt, getPaddingTop() + this.aly, this.alv + paramInt, getHeight() - getPaddingBottom() - this.aly);
    this.ahS.draw(paramCanvas);
  }

  private static int getChildrenSkipCount$5359dca7()
  {
    return 0;
  }

  private static int getLocationOffset$3c7ec8d0()
  {
    return 0;
  }

  private static int getNextLocationOffset$3c7ec8d0()
  {
    return 0;
  }

  private void h(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  private static void i(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }

  protected final boolean bV(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt == 0)
      if ((this.alx & 0x1) != 0)
        bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = false;
      continue;
      if (paramInt == getChildCount())
      {
        bool2 = bool1;
        if ((this.alx & 0x4) == 0)
          bool2 = false;
      }
      else
      {
        if ((this.alx & 0x2) != 0)
        {
          paramInt--;
          while (true)
          {
            if (paramInt < 0)
              break label90;
            bool2 = bool1;
            if (getChildAt(paramInt).getVisibility() != 8)
              break;
            paramInt--;
          }
        }
        bool2 = false;
        continue;
        label90: bool2 = false;
      }
    }
  }

  protected LayoutParams c(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LayoutParams(paramLayoutParams);
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }

  public LayoutParams g(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }

  public int getBaseline()
  {
    int i = -1;
    if (this.alo < 0)
      i = super.getBaseline();
    View localView;
    int j;
    do
    {
      return i;
      if (getChildCount() <= this.alo)
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
      localView = getChildAt(this.alo);
      j = localView.getBaseline();
      if (j != -1)
        break;
    }
    while (this.alo == 0);
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    i = this.alp;
    if (this.mOrientation == 1)
    {
      int k = this.Hu & 0x70;
      if (k != 48)
        switch (k)
        {
        default:
        case 80:
        case 16:
        }
    }
    while (true)
    {
      i = ((LayoutParams)localView.getLayoutParams()).topMargin + i + j;
      break;
      i = getBottom() - getTop() - getPaddingBottom() - this.alq;
      continue;
      i += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.alq) / 2;
    }
  }

  public int getBaselineAlignedChildIndex()
  {
    return this.alo;
  }

  public Drawable getDividerDrawable()
  {
    return this.ahS;
  }

  public int getDividerPadding()
  {
    return this.aly;
  }

  public int getDividerWidth()
  {
    return this.alv;
  }

  public int getGravity()
  {
    return this.Hu;
  }

  public int getOrientation()
  {
    return this.mOrientation;
  }

  public int getShowDividers()
  {
    return this.alx;
  }

  int getVirtualChildCount()
  {
    return getChildCount();
  }

  public float getWeightSum()
  {
    return this.alr;
  }

  protected LayoutParams hf()
  {
    LayoutParams localLayoutParams;
    if (this.mOrientation == 0)
      localLayoutParams = new LayoutParams(-2, -2);
    while (true)
    {
      return localLayoutParams;
      if (this.mOrientation == 1)
        localLayoutParams = new LayoutParams(-1, -2);
      else
        localLayoutParams = null;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.ahS == null);
    int j;
    Object localObject2;
    int k;
    boolean bool;
    label259: 
    do
    {
      int i;
      do
      {
        return;
        if (this.mOrientation != 1)
          break;
        i = getVirtualChildCount();
        for (j = 0; j < i; j++)
        {
          localObject1 = getChildAt(j);
          if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (bV(j)))
          {
            localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
            b(paramCanvas, ((View)localObject1).getTop() - ((LayoutParams)localObject2).topMargin - this.alw);
          }
        }
      }
      while (!bV(i));
      localObject2 = getChildAt(i - 1);
      if (localObject2 == null);
      for (j = getHeight() - getPaddingBottom() - this.alw; ; j = ((LayoutParams)localObject1).bottomMargin + j)
      {
        b(paramCanvas, j);
        break;
        localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
        j = ((View)localObject2).getBottom();
      }
      k = getVirtualChildCount();
      bool = bk.bW(this);
      j = 0;
      if (j < k)
      {
        localObject2 = getChildAt(j);
        if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8) && (bV(j)))
        {
          localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
          if (!bool)
            break label259;
          i = ((View)localObject2).getRight();
        }
        for (i = ((LayoutParams)localObject1).rightMargin + i; ; i = ((View)localObject2).getLeft() - ((LayoutParams)localObject1).leftMargin - this.alv)
        {
          c(paramCanvas, i);
          j++;
          break;
        }
      }
    }
    while (!bV(k));
    Object localObject1 = getChildAt(k - 1);
    if (localObject1 == null)
      if (bool)
        j = getPaddingLeft();
    while (true)
    {
      c(paramCanvas, j);
      break;
      j = getWidth() - getPaddingRight() - this.alv;
      continue;
      localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
      if (bool)
      {
        j = ((View)localObject1).getLeft() - ((LayoutParams)localObject2).leftMargin - this.alv;
      }
      else
      {
        j = ((View)localObject1).getRight();
        j = ((LayoutParams)localObject2).rightMargin + j;
      }
    }
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
  }

  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    label93: Object localObject;
    if (this.mOrientation == 1)
    {
      i = getPaddingLeft();
      j = paramInt3 - paramInt1;
      k = getPaddingRight();
      m = getPaddingRight();
      n = getVirtualChildCount();
      paramInt1 = this.Hu;
      i1 = this.Hu;
      switch (paramInt1 & 0x70)
      {
      default:
        paramInt1 = getPaddingTop();
        paramInt3 = 0;
        paramInt2 = paramInt1;
        paramInt1 = paramInt3;
        if (paramInt1 < n)
        {
          localObject = getChildAt(paramInt1);
          if (localObject == null)
            paramInt2 += 0;
        }
        break;
      case 80:
      case 16:
      }
    }
    while (true)
    {
      paramInt1++;
      break label93;
      paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - this.alq;
      break;
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - this.alq) / 2;
      break;
      if (((View)localObject).getVisibility() != 8)
      {
        int i2 = ((View)localObject).getMeasuredWidth();
        int i3 = ((View)localObject).getMeasuredHeight();
        LayoutParams localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
        paramInt4 = localLayoutParams.gravity;
        paramInt3 = paramInt4;
        if (paramInt4 < 0)
          paramInt3 = 0x800007 & i1;
        switch (d.getAbsoluteGravity(paramInt3, s.T(this)) & 0x7)
        {
        default:
          paramInt3 = localLayoutParams.leftMargin + i;
        case 1:
        case 5:
        }
        while (true)
        {
          paramInt4 = paramInt2;
          if (bV(paramInt1))
            paramInt4 = paramInt2 + this.alw;
          paramInt2 = paramInt4 + localLayoutParams.topMargin;
          i((View)localObject, paramInt3, paramInt2 + 0, i2, i3);
          paramInt2 += localLayoutParams.bottomMargin + i3 + 0;
          paramInt1 += 0;
          break;
          paramInt3 = (j - i - m - i2) / 2 + i + localLayoutParams.leftMargin - localLayoutParams.rightMargin;
          continue;
          paramInt3 = j - k - i2 - localLayoutParams.rightMargin;
        }
        paramBoolean = bk.bW(this);
        n = getPaddingTop();
        int i4 = paramInt4 - paramInt2;
        i2 = getPaddingBottom();
        i3 = getPaddingBottom();
        m = getVirtualChildCount();
        paramInt2 = this.Hu;
        i1 = this.Hu;
        boolean bool = this.aln;
        int[] arrayOfInt = this.alt;
        localObject = this.alu;
        switch (d.getAbsoluteGravity(paramInt2 & 0x800007, s.T(this)))
        {
        default:
          paramInt1 = getPaddingLeft();
          paramInt4 = 0;
          if (paramBoolean)
            paramInt4 = m - 1;
          break;
        case 5:
        case 1:
        }
        for (i = -1; ; i = 1)
        {
          paramInt2 = 0;
          paramInt3 = paramInt1;
          label506: int i5;
          View localView;
          if (paramInt2 < m)
          {
            i5 = paramInt4 + i * paramInt2;
            localView = getChildAt(i5);
            if (localView == null)
            {
              paramInt3 += 0;
              paramInt1 = paramInt2;
            }
          }
          while (true)
          {
            paramInt2 = paramInt1 + 1;
            break label506;
            paramInt1 = getPaddingLeft() + paramInt3 - paramInt1 - this.alq;
            break;
            paramInt1 = getPaddingLeft() + (paramInt3 - paramInt1 - this.alq) / 2;
            break;
            if (localView.getVisibility() != 8)
            {
              int i6 = localView.getMeasuredWidth();
              int i7 = localView.getMeasuredHeight();
              paramInt1 = -1;
              localLayoutParams = (LayoutParams)localView.getLayoutParams();
              k = paramInt1;
              if (bool)
              {
                k = paramInt1;
                if (localLayoutParams.height != -1)
                  k = localView.getBaseline();
              }
              j = localLayoutParams.gravity;
              paramInt1 = j;
              if (j < 0)
                paramInt1 = i1 & 0x70;
              switch (paramInt1 & 0x70)
              {
              default:
                paramInt1 = n;
              case 48:
              case 16:
              case 80:
              }
              label711: label891: 
              while (true)
              {
                if (bV(i5))
                  paramInt3 = this.alv + paramInt3;
                while (true)
                {
                  paramInt3 += localLayoutParams.leftMargin;
                  i(localView, paramInt3 + 0, paramInt1, i6, i7);
                  paramInt3 += localLayoutParams.rightMargin + i6 + 0;
                  paramInt1 = paramInt2 + 0;
                  break;
                  j = localLayoutParams.topMargin + n;
                  paramInt1 = j;
                  if (k == -1)
                    break label891;
                  paramInt1 = arrayOfInt[1] - k + j;
                  break label711;
                  paramInt1 = (i4 - n - i3 - i7) / 2 + n + localLayoutParams.topMargin - localLayoutParams.bottomMargin;
                  break label711;
                  j = i4 - i2 - i7 - localLayoutParams.bottomMargin;
                  paramInt1 = j;
                  if (k == -1)
                    break label891;
                  paramInt1 = localView.getMeasuredHeight();
                  paramInt1 = j - (localObject[2] - (paramInt1 - k));
                  break label711;
                  return;
                }
              }
            }
            paramInt1 = paramInt2;
          }
        }
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    int k;
    int m;
    int n;
    float f1;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    boolean bool;
    int i7;
    int i8;
    Object localObject1;
    int i9;
    Object localObject2;
    label233: int i10;
    label450: int i11;
    int i12;
    if (this.mOrientation == 1)
    {
      this.alq = 0;
      i = 0;
      j = 0;
      k = 0;
      m = 0;
      n = 1;
      f1 = 0.0F;
      i1 = getVirtualChildCount();
      i2 = View.MeasureSpec.getMode(paramInt1);
      i3 = View.MeasureSpec.getMode(paramInt2);
      i4 = 0;
      i5 = 0;
      int i6 = this.alo;
      bool = this.als;
      i7 = 0;
      i8 = 0;
      while (true)
        if (i8 < i1)
        {
          localObject1 = getChildAt(i8);
          if (localObject1 == null)
          {
            this.alq += 0;
            i9 = i8;
            i8 = m;
            i9++;
            m = i8;
            i8 = i9;
          }
          else
          {
            if (((View)localObject1).getVisibility() == 8)
              break label1562;
            if (bV(i8))
              this.alq += this.alw;
            localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
            f1 += ((LayoutParams)localObject2).weight;
            if ((i3 == 1073741824) && (((LayoutParams)localObject2).height == 0) && (((LayoutParams)localObject2).weight > 0.0F))
            {
              i5 = this.alq;
              this.alq = Math.max(i5, ((LayoutParams)localObject2).topMargin + i5 + ((LayoutParams)localObject2).bottomMargin);
              i5 = 1;
              if ((i6 >= 0) && (i6 == i8 + 1))
                this.alp = this.alq;
              if ((i8 < i6) && (((LayoutParams)localObject2).weight > 0.0F))
                throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
            }
            else
            {
              i10 = -2147483648;
              i9 = i10;
              if (((LayoutParams)localObject2).height == 0)
              {
                i9 = i10;
                if (((LayoutParams)localObject2).weight > 0.0F)
                {
                  i9 = 0;
                  ((LayoutParams)localObject2).height = -2;
                }
              }
              if (f1 == 0.0F);
              for (i10 = this.alq; ; i10 = 0)
              {
                h((View)localObject1, paramInt1, 0, paramInt2, i10);
                if (i9 != -2147483648)
                  ((LayoutParams)localObject2).height = i9;
                i9 = ((View)localObject1).getMeasuredHeight();
                i10 = this.alq;
                this.alq = Math.max(i10, i10 + i9 + ((LayoutParams)localObject2).topMargin + ((LayoutParams)localObject2).bottomMargin + 0);
                if (!bool)
                  break label1559;
                i7 = Math.max(i9, i7);
                break;
              }
            }
            i10 = 0;
            if ((i2 == 1073741824) || (((LayoutParams)localObject2).width != -1))
              break label1548;
            i9 = 1;
            i4 = 1;
            i11 = ((LayoutParams)localObject2).leftMargin + ((LayoutParams)localObject2).rightMargin;
            i10 = ((View)localObject1).getMeasuredWidth() + i11;
            i12 = Math.max(i, i10);
            j = View.combineMeasuredStates(j, ((View)localObject1).getMeasuredState());
            if ((n != 0) && (((LayoutParams)localObject2).width == -1))
            {
              i = 1;
              label509: if (((LayoutParams)localObject2).weight <= 0.0F)
                break label598;
              if (i4 == 0)
                break label595;
              i10 = i11;
              label528: n = Math.max(m, i10);
              i4 = i5;
              m = i12;
              i5 = i;
            }
          }
        }
    }
    while (true)
    {
      i11 = i8 + 0;
      i = i4;
      i4 = i9;
      i8 = i5;
      i10 = n;
      i9 = i11;
      i5 = i;
      n = i8;
      i8 = i10;
      i = m;
      break;
      i = 0;
      break label509;
      label595: break label528;
      label598: if (i4 != 0);
      while (true)
      {
        k = Math.max(k, i11);
        i4 = i5;
        n = m;
        i5 = i;
        m = i12;
        break;
        i11 = i10;
      }
      if ((this.alq > 0) && (bV(i1)))
        this.alq += this.alw;
      if ((bool) && ((i3 == -2147483648) || (i3 == 0)))
      {
        this.alq = 0;
        i8 = 0;
        if (i8 < i1)
        {
          localObject1 = getChildAt(i8);
          if (localObject1 == null)
            this.alq += 0;
          while (true)
          {
            i8++;
            break;
            if (((View)localObject1).getVisibility() == 8)
            {
              i8 += 0;
            }
            else
            {
              localObject1 = (LayoutParams)((View)localObject1).getLayoutParams();
              i9 = this.alq;
              i10 = ((LayoutParams)localObject1).topMargin;
              this.alq = Math.max(i9, ((LayoutParams)localObject1).bottomMargin + (i9 + i7 + i10) + 0);
            }
          }
        }
      }
      this.alq += getPaddingTop() + getPaddingBottom();
      i10 = View.resolveSizeAndState(Math.max(this.alq, getSuggestedMinimumHeight()), paramInt2, 0);
      i8 = (0xFFFFFF & i10) - this.alq;
      if ((i5 != 0) || ((i8 != 0) && (f1 > 0.0F)))
      {
        if (this.alr > 0.0F)
          f1 = this.alr;
        this.alq = 0;
        i5 = 0;
        i7 = n;
        m = k;
        k = j;
        n = i;
        j = m;
        i = i7;
        i7 = k;
        m = i8;
        if (i5 < i1)
        {
          localObject2 = getChildAt(i5);
          if (((View)localObject2).getVisibility() == 8)
            break label1527;
          localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
          float f2 = ((LayoutParams)localObject1).weight;
          if (f2 <= 0.0F)
            break label1520;
          i8 = (int)(m * f2 / f1);
          i11 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + ((LayoutParams)localObject1).leftMargin + ((LayoutParams)localObject1).rightMargin, ((LayoutParams)localObject1).width);
          if ((((LayoutParams)localObject1).height != 0) || (i3 != 1073741824))
          {
            i9 = i8 + ((View)localObject2).getMeasuredHeight();
            k = i9;
            if (i9 < 0)
              k = 0;
            label1042: ((View)localObject2).measure(i11, View.MeasureSpec.makeMeasureSpec(k, 1073741824));
            i7 = View.combineMeasuredStates(i7, ((View)localObject2).getMeasuredState() & 0xFFFFFF00);
            f1 -= f2;
            k = m - i8;
            label1086: i8 = ((LayoutParams)localObject1).leftMargin + ((LayoutParams)localObject1).rightMargin;
            i9 = ((View)localObject2).getMeasuredWidth() + i8;
            m = Math.max(n, i9);
            if ((i2 == 1073741824) || (((LayoutParams)localObject1).width != -1))
              break label1278;
            n = 1;
            label1137: if (n == 0)
              break label1284;
            n = i8;
            label1146: i8 = Math.max(j, n);
            if ((i == 0) || (((LayoutParams)localObject1).width != -1))
              break label1291;
            j = 1;
            label1171: i9 = this.alq;
            n = ((View)localObject2).getMeasuredHeight();
            i = ((LayoutParams)localObject1).topMargin;
            this.alq = Math.max(i9, ((LayoutParams)localObject1).bottomMargin + (n + i9 + i) + 0);
            n = j;
            i = i8;
          }
        }
      }
      for (j = m; ; j = i8)
      {
        i9 = i5 + 1;
        i8 = i;
        i5 = j;
        m = k;
        i = n;
        j = i8;
        n = i5;
        i5 = i9;
        break;
        if (i8 > 0)
        {
          k = i8;
          break label1042;
        }
        k = 0;
        break label1042;
        label1278: n = 0;
        break label1137;
        label1284: n = i9;
        break label1146;
        label1291: j = 0;
        break label1171;
        this.alq += getPaddingTop() + getPaddingBottom();
        k = i7;
        i7 = n;
        n = k;
        k = i;
        i = i7;
        i7 = j;
        while (true)
        {
          if ((k == 0) && (i2 != 1073741824))
            i = i7;
          while (true)
          {
            setMeasuredDimension(View.resolveSizeAndState(Math.max(i + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), paramInt1, n), i10);
            if (i4 != 0)
              ad(i1, paramInt2);
            while (true)
            {
              return;
              m = Math.max(k, m);
              if ((!bool) || (i3 == 1073741824))
                break;
              for (k = 0; k < i1; k++)
              {
                localObject1 = getChildAt(k);
                if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (((LayoutParams)((View)localObject1).getLayoutParams()).weight > 0.0F))
                  ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
              }
              ae(paramInt1, paramInt2);
            }
          }
          i7 = m;
          k = n;
          n = j;
        }
        label1520: k = m;
        break label1086;
        label1527: i8 = n;
        n = i;
        k = m;
        i = j;
      }
      label1548: i9 = i4;
      i4 = i10;
      break label450;
      label1559: break label233;
      label1562: i10 = i5;
      i5 = n;
      n = m;
      i9 = i4;
      i4 = i10;
      m = i;
    }
  }

  public void setBaselineAligned(boolean paramBoolean)
  {
    this.aln = paramBoolean;
  }

  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= getChildCount()))
      throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    this.alo = paramInt;
  }

  public void setDividerDrawable(Drawable paramDrawable)
  {
    boolean bool = false;
    if (paramDrawable == this.ahS)
      return;
    this.ahS = paramDrawable;
    if (paramDrawable != null)
      this.alv = paramDrawable.getIntrinsicWidth();
    for (this.alw = paramDrawable.getIntrinsicHeight(); ; this.alw = 0)
    {
      if (paramDrawable == null)
        bool = true;
      setWillNotDraw(bool);
      requestLayout();
      break;
      this.alv = 0;
    }
  }

  public void setDividerPadding(int paramInt)
  {
    this.aly = paramInt;
  }

  public void setGravity(int paramInt)
  {
    if (this.Hu != paramInt)
    {
      if ((0x800007 & paramInt) != 0)
        break label46;
      paramInt = 0x800003 | paramInt;
    }
    label46: 
    while (true)
    {
      int i = paramInt;
      if ((paramInt & 0x70) == 0)
        i = paramInt | 0x30;
      this.Hu = i;
      requestLayout();
      return;
    }
  }

  public void setHorizontalGravity(int paramInt)
  {
    paramInt &= 8388615;
    if ((this.Hu & 0x800007) != paramInt)
    {
      this.Hu = (paramInt | this.Hu & 0xFF7FFFF8);
      requestLayout();
    }
  }

  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    this.als = paramBoolean;
  }

  public void setOrientation(int paramInt)
  {
    if (this.mOrientation != paramInt)
    {
      this.mOrientation = paramInt;
      requestLayout();
    }
  }

  public void setShowDividers(int paramInt)
  {
    if (paramInt != this.alx)
      requestLayout();
    this.alx = paramInt;
  }

  public void setVerticalGravity(int paramInt)
  {
    paramInt &= 112;
    if ((this.Hu & 0x70) != paramInt)
    {
      this.Hu = (paramInt | this.Hu & 0xFFFFFF8F);
      requestLayout();
    }
  }

  public void setWeightSum(float paramFloat)
  {
    this.alr = Math.max(0.0F, paramFloat);
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }

  public static class LayoutParams extends ViewGroup.MarginLayoutParams
  {
    public int gravity = -1;
    public float weight;

    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      this.weight = 0.0F;
    }

    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.LinearLayoutCompat_Layout);
      this.weight = paramContext.getFloat(3, 0.0F);
      this.gravity = paramContext.getInt(0, -1);
      paramContext.recycle();
    }

    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutCompat
 * JD-Core Version:    0.6.2
 */