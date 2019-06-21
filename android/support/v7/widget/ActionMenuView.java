package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.h.b;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.p;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends LinearLayoutCompat
  implements h.b, p
{
  private Context acv;
  private int adH;
  private int adW;
  ActionMenuPresenter adX;
  private o.a adY;
  h.a adZ;
  boolean ady;
  private boolean aea;
  private int aeb;
  private int aec;
  d aed;
  h lo;

  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.adH = ((int)(56.0F * f));
    this.aec = ((int)(f * 4.0F));
    this.acv = paramContext;
    this.adW = 0;
  }

  protected static LayoutParams b(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
      if ((paramLayoutParams instanceof LayoutParams))
      {
        paramLayoutParams = new LayoutParams((LayoutParams)paramLayoutParams);
        localObject = paramLayoutParams;
        if (paramLayoutParams.gravity <= 0)
          paramLayoutParams.gravity = 16;
      }
    for (Object localObject = paramLayoutParams; ; localObject = hd())
    {
      return localObject;
      paramLayoutParams = new LayoutParams(paramLayoutParams);
      break;
    }
  }

  private boolean bt(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramInt == 0)
      bool2 = false;
    while (true)
    {
      return bool2;
      View localView1 = getChildAt(paramInt - 1);
      View localView2 = getChildAt(paramInt);
      bool2 = bool1;
      if (paramInt < getChildCount())
      {
        bool2 = bool1;
        if ((localView1 instanceof a))
          bool2 = ((a)localView1).gl() | false;
      }
      if ((paramInt > 0) && ((localView2 instanceof a)))
        bool2 = ((a)localView2).gk() | bool2;
    }
  }

  static int f(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = false;
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    ActionMenuItemView localActionMenuItemView;
    if ((paramView instanceof ActionMenuItemView))
    {
      localActionMenuItemView = (ActionMenuItemView)paramView;
      if ((localActionMenuItemView == null) || (!localActionMenuItemView.hasText()))
        break label184;
      paramInt4 = 1;
      label57: if ((paramInt2 <= 0) || ((paramInt4 != 0) && (paramInt2 < 2)))
        break label190;
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, -2147483648), i);
      int j = paramView.getMeasuredWidth();
      paramInt3 = j / paramInt1;
      paramInt2 = paramInt3;
      if (j % paramInt1 != 0)
        paramInt2 = paramInt3 + 1;
      paramInt3 = paramInt2;
      if (paramInt4 != 0)
      {
        paramInt3 = paramInt2;
        if (paramInt2 >= 2);
      }
    }
    label184: label190: for (paramInt3 = 2; ; paramInt3 = 0)
    {
      boolean bool2 = bool1;
      if (!localLayoutParams.aee)
      {
        bool2 = bool1;
        if (paramInt4 != 0)
          bool2 = true;
      }
      localLayoutParams.aeh = bool2;
      localLayoutParams.aef = paramInt3;
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt3 * paramInt1, 1073741824), i);
      return paramInt3;
      localActionMenuItemView = null;
      break;
      paramInt4 = 0;
      break label57;
    }
  }

  private LayoutParams f(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }

  private static LayoutParams hd()
  {
    LayoutParams localLayoutParams = new LayoutParams();
    localLayoutParams.gravity = 16;
    return localLayoutParams;
  }

  public static LayoutParams he()
  {
    LayoutParams localLayoutParams = hd();
    localLayoutParams.aee = true;
    return localLayoutParams;
  }

  public final void a(h paramh)
  {
    this.lo = paramh;
  }

  public final void a(o.a parama, h.a parama1)
  {
    this.adY = parama;
    this.adZ = parama1;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams != null) && ((paramLayoutParams instanceof LayoutParams)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void dismissPopupMenus()
  {
    if (this.adX != null)
      this.adX.ha();
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }

  public final boolean f(j paramj)
  {
    return this.lo.a(paramj, null, 0);
  }

  public Menu getMenu()
  {
    ActionMenuPresenter localActionMenuPresenter;
    if (this.lo == null)
    {
      localObject = getContext();
      this.lo = new h((Context)localObject);
      this.lo.a(new c());
      this.adX = new ActionMenuPresenter((Context)localObject);
      this.adX.gZ();
      localActionMenuPresenter = this.adX;
      if (this.adY == null)
        break label108;
    }
    label108: for (Object localObject = this.adY; ; localObject = new b())
    {
      localActionMenuPresenter.lL = ((o.a)localObject);
      this.lo.a(this.adX, this.acv);
      this.adX.a(this);
      return this.lo;
    }
  }

  public Drawable getOverflowIcon()
  {
    getMenu();
    Object localObject = this.adX;
    if (((ActionMenuPresenter)localObject).adv != null)
      localObject = ((ActionMenuPresenter)localObject).adv.getDrawable();
    while (true)
    {
      return localObject;
      if (((ActionMenuPresenter)localObject).adx)
        localObject = ((ActionMenuPresenter)localObject).adw;
      else
        localObject = null;
    }
  }

  public int getPopupTheme()
  {
    return this.adW;
  }

  public int getWindowAnimations()
  {
    return 0;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.adX != null)
    {
      this.adX.n(false);
      if (this.adX.isOverflowMenuShowing())
      {
        this.adX.hideOverflowMenu();
        this.adX.showOverflowMenu();
      }
    }
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    dismissPopupMenus();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.aea)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i = getChildCount();
    int j = (paramInt4 - paramInt2) / 2;
    int k = getDividerWidth();
    int m = 0;
    paramInt4 = paramInt3 - paramInt1 - getPaddingRight() - getPaddingLeft();
    paramInt2 = 0;
    paramBoolean = bk.bW(this);
    int n = 0;
    label68: Object localObject1;
    Object localObject2;
    int i1;
    int i3;
    if (n < i)
    {
      localObject1 = getChildAt(n);
      if (((View)localObject1).getVisibility() == 8)
        break label655;
      localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
      if (((LayoutParams)localObject2).aee)
      {
        i1 = ((View)localObject1).getMeasuredWidth();
        paramInt2 = i1;
        if (bt(n))
          paramInt2 = i1 + k;
        int i2 = ((View)localObject1).getMeasuredHeight();
        if (paramBoolean)
        {
          i1 = getPaddingLeft() + ((LayoutParams)localObject2).leftMargin;
          i3 = i1 + paramInt2;
          label165: int i4 = j - i2 / 2;
          ((View)localObject1).layout(i1, i4, i3, i2 + i4);
          i1 = 1;
          paramInt2 = paramInt4 - paramInt2;
          paramInt4 = i1;
        }
      }
    }
    while (true)
    {
      i1 = n + 1;
      n = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = n;
      n = i1;
      break label68;
      i3 = getWidth() - getPaddingRight() - ((LayoutParams)localObject2).rightMargin;
      i1 = i3 - paramInt2;
      break label165;
      i1 = ((View)localObject1).getMeasuredWidth();
      i3 = ((LayoutParams)localObject2).leftMargin;
      i1 = paramInt4 - (((LayoutParams)localObject2).rightMargin + (i1 + i3));
      bt(n);
      m++;
      paramInt4 = paramInt2;
      paramInt2 = i1;
      continue;
      if ((i == 1) && (paramInt2 == 0))
      {
        localObject2 = getChildAt(0);
        paramInt4 = ((View)localObject2).getMeasuredWidth();
        paramInt2 = ((View)localObject2).getMeasuredHeight();
        paramInt1 = (paramInt3 - paramInt1) / 2 - paramInt4 / 2;
        paramInt3 = j - paramInt2 / 2;
        ((View)localObject2).layout(paramInt1, paramInt3, paramInt4 + paramInt1, paramInt2 + paramInt3);
        break;
      }
      if (paramInt2 != 0)
      {
        paramInt1 = 0;
        label375: paramInt1 = m - paramInt1;
        if (paramInt1 <= 0)
          break label527;
        paramInt1 = paramInt4 / paramInt1;
        label389: paramInt3 = Math.max(0, paramInt1);
        if (!paramBoolean)
          break label532;
        paramInt1 = getWidth() - getPaddingRight();
        paramInt2 = 0;
        label412: if (paramInt2 < i)
        {
          localObject2 = getChildAt(paramInt2);
          localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
          if ((((View)localObject2).getVisibility() == 8) || (((LayoutParams)localObject1).aee))
            break label652;
          n = paramInt1 - ((LayoutParams)localObject1).rightMargin;
          paramInt1 = ((View)localObject2).getMeasuredWidth();
          m = ((View)localObject2).getMeasuredHeight();
          paramInt4 = j - m / 2;
          ((View)localObject2).layout(n - paramInt1, paramInt4, n, m + paramInt4);
          paramInt1 = n - (((LayoutParams)localObject1).leftMargin + paramInt1 + paramInt3);
        }
      }
      label649: label652: 
      while (true)
      {
        paramInt2++;
        break label412;
        break;
        paramInt1 = 1;
        break label375;
        label527: paramInt1 = 0;
        break label389;
        label532: paramInt1 = getPaddingLeft();
        paramInt2 = 0;
        label539: if (paramInt2 < i)
        {
          localObject2 = getChildAt(paramInt2);
          localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
          if ((((View)localObject2).getVisibility() == 8) || (((LayoutParams)localObject1).aee))
            break label649;
          n = paramInt1 + ((LayoutParams)localObject1).leftMargin;
          m = ((View)localObject2).getMeasuredWidth();
          paramInt1 = ((View)localObject2).getMeasuredHeight();
          paramInt4 = j - paramInt1 / 2;
          ((View)localObject2).layout(n, paramInt4, n + m, paramInt1 + paramInt4);
          paramInt1 = ((LayoutParams)localObject1).rightMargin + m + paramInt3 + n;
        }
        while (true)
        {
          paramInt2++;
          break label539;
          break;
        }
      }
      label655: i1 = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = i1;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = this.aea;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824);
    int i;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    for (boolean bool2 = true; ; bool2 = false)
    {
      this.aea = bool2;
      if (bool1 != this.aea)
        this.aeb = 0;
      i = View.MeasureSpec.getSize(paramInt1);
      if ((this.aea) && (this.lo != null) && (i != this.aeb))
      {
        this.aeb = i;
        this.lo.p(true);
      }
      j = getChildCount();
      if ((!this.aea) || (j <= 0))
        break label1225;
      k = View.MeasureSpec.getMode(paramInt2);
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      m = View.MeasureSpec.getSize(paramInt2);
      j = getPaddingLeft();
      i = getPaddingRight();
      n = getPaddingTop() + getPaddingBottom();
      i1 = getChildMeasureSpec(paramInt2, n, -2);
      i2 = paramInt1 - (j + i);
      paramInt1 = i2 / this.adH;
      paramInt2 = this.adH;
      if (paramInt1 != 0)
        break;
      setMeasuredDimension(i2, 0);
      return;
    }
    int i3 = this.adH + i2 % paramInt2 / paramInt1;
    int j = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    paramInt2 = 0;
    long l1 = 0L;
    int i7 = getChildCount();
    int i8 = 0;
    label226: Object localObject1;
    Object localObject2;
    label346: label364: int i9;
    label402: label412: int i10;
    if (i8 < i7)
    {
      localObject1 = getChildAt(i8);
      if (((View)localObject1).getVisibility() == 8)
        break label1315;
      bool2 = localObject1 instanceof ActionMenuItemView;
      i6++;
      if (bool2)
        ((View)localObject1).setPadding(this.aec, 0, this.aec, 0);
      localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
      ((LayoutParams)localObject2).aej = false;
      ((LayoutParams)localObject2).aeg = 0;
      ((LayoutParams)localObject2).aef = 0;
      ((LayoutParams)localObject2).aeh = false;
      ((LayoutParams)localObject2).leftMargin = 0;
      ((LayoutParams)localObject2).rightMargin = 0;
      if ((bool2) && (((ActionMenuItemView)localObject1).hasText()))
      {
        bool2 = true;
        ((LayoutParams)localObject2).aei = bool2;
        if (!((LayoutParams)localObject2).aee)
          break label475;
        i = 1;
        i9 = f((View)localObject1, i3, i, i1, n);
        i4 = Math.max(i4, i9);
        if (!((LayoutParams)localObject2).aeh)
          break label1308;
        i = i5 + 1;
        if (!((LayoutParams)localObject2).aee)
          break label1305;
        paramInt2 = 1;
        i10 = paramInt1 - i9;
        j = Math.max(j, ((View)localObject1).getMeasuredHeight());
        if (i9 != 1)
          break label1291;
        l1 = 1 << i8 | l1;
        i5 = i;
        i = i10;
        paramInt1 = i6;
      }
    }
    while (true)
    {
      i8++;
      i6 = paramInt1;
      paramInt1 = i;
      break label226;
      bool2 = false;
      break label346;
      label475: i = paramInt1;
      break label364;
      label494: label503: long l2;
      long l3;
      if ((paramInt2 != 0) && (i6 == 2))
      {
        i10 = 1;
        i = 0;
        i8 = paramInt1;
        paramInt1 = i;
        l2 = l1;
        if (i5 <= 0)
          break label789;
        l2 = l1;
        if (i8 <= 0)
          break label789;
        n = 2147483647;
        l3 = 0L;
        i = 0;
        i9 = 0;
        label535: if (i9 >= i7)
          break label627;
        localObject2 = (LayoutParams)getChildAt(i9).getLayoutParams();
        if (!((LayoutParams)localObject2).aeh)
          break label1288;
        if (((LayoutParams)localObject2).aef >= n)
          break label602;
        n = ((LayoutParams)localObject2).aef;
        l3 = 1L << i9;
        i = 1;
      }
      label651: label789: label959: label962: label1225: 
      while (true)
      {
        i9++;
        break label535;
        i10 = 0;
        break label494;
        label602: if (((LayoutParams)localObject2).aef == n)
        {
          l3 |= 1L << i9;
          i++;
          continue;
          label627: l1 |= l3;
          l2 = l1;
          if (i <= i8)
          {
            i = 0;
            paramInt1 = i8;
            if (i < i7)
            {
              localObject1 = getChildAt(i);
              localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
              if ((1 << i & l3) == 0L)
              {
                if (((LayoutParams)localObject2).aef != n + 1)
                  break label1285;
                l1 |= 1 << i;
              }
            }
          }
          while (true)
          {
            i++;
            break label651;
            if ((i10 != 0) && (((LayoutParams)localObject2).aei) && (paramInt1 == 1))
              ((View)localObject1).setPadding(this.aec + i3, 0, this.aec, 0);
            ((LayoutParams)localObject2).aef += 1;
            ((LayoutParams)localObject2).aej = true;
            paramInt1--;
            continue;
            i = 1;
            i8 = paramInt1;
            paramInt1 = i;
            break label503;
            float f2;
            if ((paramInt2 == 0) && (i6 == 1))
            {
              paramInt2 = 1;
              if ((i8 <= 0) || (l2 == 0L) || ((i8 >= i6 - 1) && (paramInt2 == 0) && (i4 <= 1)))
                break label1130;
              float f1 = Long.bitCount(l2);
              f2 = f1;
              if (paramInt2 != 0)
                break label1282;
              float f3 = f1;
              if ((1L & l2) != 0L)
              {
                f3 = f1;
                if (!((LayoutParams)getChildAt(0).getLayoutParams()).aei)
                  f3 = f1 - 0.5F;
              }
              f2 = f3;
              if ((1 << i7 - 1 & l2) == 0L)
                break label1282;
              f2 = f3;
              if (((LayoutParams)getChildAt(i7 - 1).getLayoutParams()).aei)
                break label1282;
              f2 = f3 - 0.5F;
            }
            while (true)
            {
              if (f2 > 0.0F)
              {
                paramInt2 = (int)(i8 * i3 / f2);
                i = 0;
                i5 = paramInt1;
                if (i >= i7)
                  break label1133;
                if ((1 << i & l2) == 0L)
                  break label1127;
                localObject1 = getChildAt(i);
                localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
                if (!(localObject1 instanceof ActionMenuItemView))
                  break label1063;
                ((LayoutParams)localObject2).aeg = paramInt2;
                ((LayoutParams)localObject2).aej = true;
                if ((i == 0) && (!((LayoutParams)localObject2).aei))
                  ((LayoutParams)localObject2).leftMargin = (-paramInt2 / 2);
                paramInt1 = 1;
              }
              label1127: 
              while (true)
              {
                i++;
                break label962;
                paramInt2 = 0;
                break;
                paramInt2 = 0;
                break label959;
                if (((LayoutParams)localObject2).aee)
                {
                  ((LayoutParams)localObject2).aeg = paramInt2;
                  ((LayoutParams)localObject2).aej = true;
                  ((LayoutParams)localObject2).rightMargin = (-paramInt2 / 2);
                  paramInt1 = 1;
                }
                else
                {
                  if (i != 0)
                    ((LayoutParams)localObject2).leftMargin = (paramInt2 / 2);
                  if (i != i7 - 1)
                    ((LayoutParams)localObject2).rightMargin = (paramInt2 / 2);
                }
              }
              label1130: i5 = paramInt1;
              label1133: if (i5 != 0)
                for (paramInt1 = 0; paramInt1 < i7; paramInt1++)
                {
                  localObject2 = getChildAt(paramInt1);
                  localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
                  if (((LayoutParams)localObject1).aej)
                  {
                    paramInt2 = ((LayoutParams)localObject1).aef;
                    ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(((LayoutParams)localObject1).aeg + paramInt2 * i3, 1073741824), i1);
                  }
                }
              if (k != 1073741824);
              for (paramInt1 = j; ; paramInt1 = m)
              {
                setMeasuredDimension(i2, paramInt1);
                break;
                for (i = 0; i < j; i++)
                {
                  localObject2 = (LayoutParams)getChildAt(i).getLayoutParams();
                  ((LayoutParams)localObject2).rightMargin = 0;
                  ((LayoutParams)localObject2).leftMargin = 0;
                }
                super.onMeasure(paramInt1, paramInt2);
                break;
              }
            }
          }
        }
      }
      label1063: i5 = i;
      label1282: label1285: label1288: label1291: paramInt1 = i6;
      i = i10;
      continue;
      label1305: break label412;
      label1308: i = i5;
      break label402;
      label1315: i = paramInt1;
      paramInt1 = i6;
    }
  }

  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    this.adX.adG = paramBoolean;
  }

  public void setOnMenuItemClickListener(d paramd)
  {
    this.aed = paramd;
  }

  public void setOverflowIcon(Drawable paramDrawable)
  {
    getMenu();
    ActionMenuPresenter localActionMenuPresenter = this.adX;
    if (localActionMenuPresenter.adv != null)
      localActionMenuPresenter.adv.setImageDrawable(paramDrawable);
    while (true)
    {
      return;
      localActionMenuPresenter.adx = true;
      localActionMenuPresenter.adw = paramDrawable;
    }
  }

  public void setOverflowReserved(boolean paramBoolean)
  {
    this.ady = paramBoolean;
  }

  public void setPopupTheme(int paramInt)
  {
    if (this.adW != paramInt)
    {
      this.adW = paramInt;
      if (paramInt != 0)
        break label26;
    }
    label26: for (this.acv = getContext(); ; this.acv = new ContextThemeWrapper(getContext(), paramInt))
      return;
  }

  public void setPresenter(ActionMenuPresenter paramActionMenuPresenter)
  {
    this.adX = paramActionMenuPresenter;
    this.adX.a(this);
  }

  public static class LayoutParams extends LinearLayoutCompat.LayoutParams
  {

    @ViewDebug.ExportedProperty
    public boolean aee;

    @ViewDebug.ExportedProperty
    public int aef;

    @ViewDebug.ExportedProperty
    public int aeg;

    @ViewDebug.ExportedProperty
    public boolean aeh;

    @ViewDebug.ExportedProperty
    public boolean aei;
    boolean aej;

    public LayoutParams()
    {
      super(-2);
      this.aee = false;
    }

    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }

    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      this.aee = paramLayoutParams.aee;
    }

    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }

  public static abstract interface a
  {
    public abstract boolean gk();

    public abstract boolean gl();
  }

  static final class b
    implements o.a
  {
    public final void a(h paramh, boolean paramBoolean)
    {
    }

    public final boolean d(h paramh)
    {
      return false;
    }
  }

  final class c
    implements h.a
  {
    c()
    {
    }

    public final boolean a(h paramh, MenuItem paramMenuItem)
    {
      if ((ActionMenuView.this.aed != null) && (ActionMenuView.this.aed.onMenuItemClick(paramMenuItem)));
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final void b(h paramh)
    {
      if (ActionMenuView.this.adZ != null)
        ActionMenuView.this.adZ.b(paramh);
    }
  }

  public static abstract interface d
  {
    public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActionMenuView
 * JD-Core Version:    0.6.2
 */