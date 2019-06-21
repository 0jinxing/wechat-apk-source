package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.a.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.aa;
import android.support.v4.view.s;
import android.support.v4.widget.h;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

@CoordinatorLayout.b(Behavior.class)
public class AppBarLayout extends LinearLayout
{
  private int mk = -1;
  private int ml = -1;
  private int mm = -1;
  boolean mn;
  int mo = 0;
  aa mp;
  List<AppBarLayout.a> mq;
  private boolean mr;
  boolean ms;
  private int[] mt;

  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
    o.G(paramContext);
    if (Build.VERSION.SDK_INT >= 21)
    {
      r.v(this);
      r.a(this, paramAttributeSet);
    }
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.AppBarLayout, 0, 2131493821);
    s.a(this, paramContext.getDrawable(0));
    if (paramContext.hasValue(4))
      d(paramContext.getBoolean(4, false), false, false);
    if ((Build.VERSION.SDK_INT >= 21) && (paramContext.hasValue(3)))
      r.b(this, paramContext.getDimensionPixelSize(3, 0));
    if (Build.VERSION.SDK_INT >= 26)
    {
      if (paramContext.hasValue(2))
        setKeyboardNavigationCluster(paramContext.getBoolean(2, false));
      if (paramContext.hasValue(1))
        setTouchscreenBlocksFocus(paramContext.getBoolean(1, false));
    }
    paramContext.recycle();
    s.a(this, new AppBarLayout.1(this));
  }

  private static LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((Build.VERSION.SDK_INT >= 19) && ((paramLayoutParams instanceof LinearLayout.LayoutParams)))
      paramLayoutParams = new LayoutParams((LinearLayout.LayoutParams)paramLayoutParams);
    while (true)
    {
      return paramLayoutParams;
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
        paramLayoutParams = new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
      else
        paramLayoutParams = new LayoutParams(paramLayoutParams);
    }
  }

  private LayoutParams c(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }

  final void F(int paramInt)
  {
    if (this.mq != null)
    {
      int i = this.mq.size();
      for (int j = 0; j < i; j++)
      {
        AppBarLayout.a locala = (AppBarLayout.a)this.mq.get(j);
        if (locala != null)
          locala.H(paramInt);
      }
    }
  }

  final void by()
  {
    this.mk = -1;
    this.ml = -1;
    this.mm = -1;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }

  final void d(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = 0;
    int j;
    if (paramBoolean1)
    {
      j = 1;
      if (!paramBoolean2)
        break label48;
    }
    label48: for (int k = 4; ; k = 0)
    {
      if (paramBoolean3)
        i = 8;
      this.mo = (i | (k | j));
      requestLayout();
      return;
      j = 2;
      break;
    }
  }

  int getDownNestedPreScrollRange()
  {
    int i;
    if (this.ml != -1)
      i = this.ml;
    while (true)
    {
      return i;
      int j = getChildCount() - 1;
      i = 0;
      if (j >= 0)
      {
        View localView = getChildAt(j);
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        int k = localView.getMeasuredHeight();
        int m = localLayoutParams.mI;
        if ((m & 0x5) == 5)
        {
          n = localLayoutParams.topMargin;
          i = localLayoutParams.bottomMargin + n + i;
          if ((m & 0x8) != 0)
            i += s.aa(localView);
        }
        while (i <= 0)
          while (true)
          {
            int n;
            j--;
            break;
            if ((m & 0x2) != 0)
              i += k - s.aa(localView);
            else
              i += k - getTopInset();
          }
      }
      i = Math.max(0, i);
      this.ml = i;
    }
  }

  int getDownNestedScrollRange()
  {
    if (this.mm != -1)
    {
      i = this.mm;
      return i;
    }
    int j = getChildCount();
    int k = 0;
    int i = 0;
    label24: if (k < j)
    {
      View localView = getChildAt(k);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      int m = localView.getMeasuredHeight();
      int n = localLayoutParams.topMargin;
      int i1 = localLayoutParams.bottomMargin;
      int i2 = localLayoutParams.mI;
      if ((i2 & 0x1) != 0)
      {
        i += m + (n + i1);
        if ((i2 & 0x2) != 0)
          i -= s.aa(localView) + getTopInset();
      }
    }
    while (true)
    {
      i = Math.max(0, i);
      this.mm = i;
      break;
      k++;
      break label24;
    }
  }

  final int getMinimumHeightForVisibleOverlappingContent()
  {
    int i = getTopInset();
    int j = s.aa(this);
    if (j != 0)
      j = j * 2 + i;
    while (true)
    {
      return j;
      j = getChildCount();
      if (j > 0);
      for (j = s.aa(getChildAt(j - 1)); ; j = 0)
      {
        if (j == 0)
          break label60;
        j = j * 2 + i;
        break;
      }
      label60: j = getHeight() / 3;
    }
  }

  int getPendingAction()
  {
    return this.mo;
  }

  @Deprecated
  public float getTargetElevation()
  {
    return 0.0F;
  }

  final int getTopInset()
  {
    if (this.mp != null);
    for (int i = this.mp.getSystemWindowInsetTop(); ; i = 0)
      return i;
  }

  public final int getTotalScrollRange()
  {
    if (this.mk != -1)
    {
      i = this.mk;
      return i;
    }
    int j = getChildCount();
    int k = 0;
    int i = 0;
    label24: if (k < j)
    {
      View localView = getChildAt(k);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      int m = localView.getMeasuredHeight();
      int n = localLayoutParams.mI;
      if ((n & 0x1) != 0)
      {
        int i1 = localLayoutParams.topMargin;
        i += localLayoutParams.bottomMargin + (m + i1);
        if ((n & 0x2) != 0)
          i -= s.aa(localView);
      }
    }
    while (true)
    {
      i = Math.max(0, i - getTopInset());
      this.mk = i;
      break;
      k++;
      break label24;
    }
  }

  int getUpNestedPreScrollRange()
  {
    return getTotalScrollRange();
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    if (this.mt == null)
      this.mt = new int[2];
    int[] arrayOfInt1 = this.mt;
    int[] arrayOfInt2 = super.onCreateDrawableState(arrayOfInt1.length + paramInt);
    if (this.mr)
    {
      paramInt = 2130772103;
      arrayOfInt1[0] = paramInt;
      if ((!this.mr) || (!this.ms))
        break label78;
    }
    label78: for (paramInt = 2130772102; ; paramInt = -2130772102)
    {
      arrayOfInt1[1] = paramInt;
      return mergeDrawableStates(arrayOfInt2, arrayOfInt1);
      paramInt = -2130772103;
      break;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    by();
    this.mn = false;
    paramInt2 = getChildCount();
    paramInt1 = 0;
    if (paramInt1 < paramInt2)
    {
      if (((LayoutParams)getChildAt(paramInt1).getLayoutParams()).mJ != null)
        this.mn = true;
    }
    else
    {
      paramInt3 = getChildCount();
      paramInt1 = 0;
      label62: if (paramInt1 >= paramInt3)
        break label146;
      LayoutParams localLayoutParams = (LayoutParams)getChildAt(paramInt1).getLayoutParams();
      if (((localLayoutParams.mI & 0x1) != 1) || ((localLayoutParams.mI & 0xA) == 0))
        break label135;
      paramInt2 = 1;
      label105: if (paramInt2 == 0)
        break label140;
    }
    label135: label140: label146: for (paramBoolean = true; ; paramBoolean = false)
    {
      if (this.mr != paramBoolean)
      {
        this.mr = paramBoolean;
        refreshDrawableState();
      }
      return;
      paramInt1++;
      break;
      paramInt2 = 0;
      break label105;
      paramInt1++;
      break label62;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    by();
  }

  public void setExpanded(boolean paramBoolean)
  {
    d(paramBoolean, s.as(this), true);
  }

  public void setOrientation(int paramInt)
  {
    if (paramInt != 1)
      throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    super.setOrientation(paramInt);
  }

  @Deprecated
  public void setTargetElevation(float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 21)
      r.b(this, paramFloat);
  }

  public static class Behavior extends HeaderBehavior<AppBarLayout>
  {
    private WeakReference<View> mA;
    private AppBarLayout.Behavior.a mB;
    private int mv;
    private ValueAnimator mw;
    private int mx = -1;
    private boolean my;
    private float mz;

    public Behavior()
    {
    }

    public Behavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }

    private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
    {
      int i = bz();
      int j = paramAppBarLayout.getChildCount();
      int k = 0;
      View localView;
      label49: int m;
      int n;
      int i1;
      if (k < j)
      {
        localView = paramAppBarLayout.getChildAt(k);
        if ((localView.getTop() <= -i) && (localView.getBottom() >= -i))
          if (k >= 0)
          {
            localView = paramAppBarLayout.getChildAt(k);
            m = ((AppBarLayout.LayoutParams)localView.getLayoutParams()).mI;
            if ((m & 0x11) == 17)
            {
              n = -localView.getTop();
              i1 = -localView.getBottom();
              j = i1;
              if (k == paramAppBarLayout.getChildCount() - 1)
                j = i1 + paramAppBarLayout.getTopInset();
              if (!l(m, 2))
                break label189;
              k = j + s.aa(localView);
              i1 = n;
              label148: if (i >= (k + i1) / 2)
                break label240;
            }
          }
      }
      while (true)
      {
        a(paramCoordinatorLayout, paramAppBarLayout, android.support.v4.c.a.clamp(k, -paramAppBarLayout.getTotalScrollRange(), 0));
        return;
        k++;
        break;
        k = -1;
        break label49;
        label189: k = j;
        i1 = n;
        if (!l(m, 5))
          break label148;
        k = s.aa(localView) + j;
        if (i < k)
        {
          i1 = k;
          k = j;
          break label148;
        }
        i1 = n;
        break label148;
        label240: k = i1;
      }
    }

    private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt)
    {
      int i = Math.abs(bz() - paramInt);
      float f = Math.abs(0.0F);
      if (f > 0.0F);
      int j;
      for (i = Math.round(i / f * 1000.0F) * 3; ; i = (int)((i / paramAppBarLayout.getHeight() + 1.0F) * 150.0F))
      {
        j = bz();
        if (j != paramInt)
          break;
        if ((this.mw != null) && (this.mw.isRunning()))
          this.mw.cancel();
        return;
      }
      if (this.mw == null)
      {
        this.mw = new ValueAnimator();
        this.mw.setInterpolator(a.mj);
        this.mw.addUpdateListener(new AppBarLayout.Behavior.1(this, paramCoordinatorLayout, paramAppBarLayout));
      }
      while (true)
      {
        this.mw.setDuration(Math.min(i, 600));
        this.mw.setIntValues(new int[] { j, paramInt });
        this.mw.start();
        break;
        this.mw.cancel();
      }
    }

    private static void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      int i = 0;
      int j = Math.abs(paramInt1);
      int k = paramAppBarLayout.getChildCount();
      int m = 0;
      Object localObject;
      label53: boolean bool;
      if (m < k)
      {
        localObject = paramAppBarLayout.getChildAt(m);
        if ((j >= ((View)localObject).getTop()) && (j <= ((View)localObject).getBottom()))
          if (localObject != null)
          {
            m = ((AppBarLayout.LayoutParams)((View)localObject).getLayoutParams()).mI;
            if ((m & 0x1) == 0)
              break label336;
            k = s.aa((View)localObject);
            if ((paramInt2 <= 0) || ((m & 0xC) == 0))
              break label288;
            if (-paramInt1 < ((View)localObject).getBottom() - k - paramAppBarLayout.getTopInset())
              break label282;
            bool = true;
          }
      }
      while (true)
      {
        label118: if (paramAppBarLayout.ms != bool)
        {
          paramAppBarLayout.ms = bool;
          paramAppBarLayout.refreshDrawableState();
          paramInt1 = 1;
          if (Build.VERSION.SDK_INT >= 11)
            if (!paramBoolean)
            {
              if (paramInt1 == 0)
                break label269;
              localObject = paramCoordinatorLayout.pq.J(paramAppBarLayout);
              paramCoordinatorLayout.ps.clear();
              if (localObject != null)
                paramCoordinatorLayout.ps.addAll((Collection)localObject);
              localObject = paramCoordinatorLayout.ps;
              m = ((List)localObject).size();
            }
        }
        label139: for (paramInt2 = 0; ; paramInt2++)
        {
          paramInt1 = i;
          if (paramInt2 < m)
          {
            paramCoordinatorLayout = ((CoordinatorLayout.d)((View)((List)localObject).get(paramInt2)).getLayoutParams()).pH;
            if (!(paramCoordinatorLayout instanceof AppBarLayout.ScrollingViewBehavior))
              continue;
            paramInt1 = i;
            if (((AppBarLayout.ScrollingViewBehavior)paramCoordinatorLayout).qV != 0)
              paramInt1 = 1;
          }
          if (paramInt1 != 0)
            paramAppBarLayout.jumpDrawablesToCurrentState();
          label269: return;
          m++;
          break;
          localObject = null;
          break label53;
          label282: bool = false;
          break label118;
          label288: if ((m & 0x2) == 0)
            break label336;
          if (-paramInt1 >= ((View)localObject).getBottom() - k - paramAppBarLayout.getTopInset())
          {
            bool = true;
            break label118;
          }
          bool = false;
          break label118;
          paramInt1 = 0;
          break label139;
        }
        label336: bool = false;
      }
    }

    private static boolean l(int paramInt1, int paramInt2)
    {
      if ((paramInt1 & paramInt2) == paramInt2);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    final int bz()
    {
      return super.bB() + this.mv;
    }

    protected static class SavedState extends AbsSavedState
    {
      public static final Parcelable.Creator<SavedState> CREATOR = new AppBarLayout.Behavior.SavedState.1();
      int mF;
      float mG;
      boolean mH;

      public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        super(paramClassLoader);
        this.mF = paramParcel.readInt();
        this.mG = paramParcel.readFloat();
        if (paramParcel.readByte() != 0);
        for (boolean bool = true; ; bool = false)
        {
          this.mH = bool;
          return;
        }
      }

      public SavedState(Parcelable paramParcelable)
      {
        super();
      }

      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        super.writeToParcel(paramParcel, paramInt);
        paramParcel.writeInt(this.mF);
        paramParcel.writeFloat(this.mG);
        if (this.mH);
        for (paramInt = 1; ; paramInt = 0)
        {
          paramParcel.writeByte((byte)paramInt);
          return;
        }
      }
    }
  }

  public static class LayoutParams extends LinearLayout.LayoutParams
  {
    int mI = 1;
    Interpolator mJ;

    public LayoutParams()
    {
      super(-2);
    }

    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.AppBarLayout_Layout);
      this.mI = paramAttributeSet.getInt(0, 0);
      if (paramAttributeSet.hasValue(1))
        this.mJ = AnimationUtils.loadInterpolator(paramContext, paramAttributeSet.getResourceId(1, 0));
      paramAttributeSet.recycle();
    }

    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }

    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }

    public LayoutParams(LinearLayout.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.AppBarLayout
 * JD-Core Version:    0.6.2
 */