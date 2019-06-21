package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.transition.AutoTransition;
import android.support.transition.TransitionSet;
import android.support.v4.f.k.a;
import android.support.v4.f.k.c;
import android.support.v4.view.b.b;
import android.support.v4.view.s;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.p;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class BottomNavigationMenuView extends ViewGroup
  implements p
{
  private boolean kT = true;
  final TransitionSet la;
  private final int lb;
  private final int lc;
  private final int ld;
  private final int le;
  private final k.a<BottomNavigationItemView> lf = new k.c(5);
  BottomNavigationItemView[] lg;
  int lh = 0;
  int li = 0;
  private ColorStateList lj;
  private ColorStateList lk;
  private int ll;
  private int[] lm;
  BottomNavigationPresenter ln;
  h lo;
  private final View.OnClickListener mOnClickListener;

  public BottomNavigationMenuView(Context paramContext)
  {
    this(paramContext, null);
  }

  public BottomNavigationMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = getResources();
    this.lb = paramContext.getDimensionPixelSize(2131428275);
    this.lc = paramContext.getDimensionPixelSize(2131428276);
    this.ld = paramContext.getDimensionPixelSize(2131428271);
    this.le = paramContext.getDimensionPixelSize(2131428274);
    this.la = new AutoTransition();
    this.la.ao(0);
    this.la.i(115L);
    this.la.b(new b());
    this.la.d(new e());
    this.mOnClickListener = new BottomNavigationMenuView.1(this);
    this.lm = new int[5];
  }

  private BottomNavigationItemView getNewItem()
  {
    BottomNavigationItemView localBottomNavigationItemView1 = (BottomNavigationItemView)this.lf.aA();
    BottomNavigationItemView localBottomNavigationItemView2 = localBottomNavigationItemView1;
    if (localBottomNavigationItemView1 == null)
      localBottomNavigationItemView2 = new BottomNavigationItemView(getContext());
    return localBottomNavigationItemView2;
  }

  public final void a(h paramh)
  {
    this.lo = paramh;
  }

  public final void bs()
  {
    removeAllViews();
    if (this.lg != null)
      for (Object localObject2 : this.lg)
        this.lf.release(localObject2);
    if (this.lo.size() == 0)
    {
      this.lh = 0;
      this.li = 0;
      this.lg = null;
    }
    while (true)
    {
      return;
      this.lg = new BottomNavigationItemView[this.lo.size()];
      if (this.lo.size() > 3);
      for (boolean bool = true; ; bool = false)
      {
        this.kT = bool;
        for (??? = 0; ??? < this.lo.size(); ???++)
        {
          this.ln.lr = true;
          this.lo.getItem(???).setCheckable(true);
          this.ln.lr = false;
          ??? = getNewItem();
          this.lg[???] = ???;
          ((BottomNavigationItemView)???).setIconTintList(this.lj);
          ((BottomNavigationItemView)???).setTextColor(this.lk);
          ((BottomNavigationItemView)???).setItemBackground(this.ll);
          ((BottomNavigationItemView)???).setShiftingMode(this.kT);
          ((BottomNavigationItemView)???).a((j)this.lo.getItem(???));
          ((BottomNavigationItemView)???).setItemPosition(???);
          ((BottomNavigationItemView)???).setOnClickListener(this.mOnClickListener);
          addView((View)???);
        }
      }
      this.li = Math.min(this.lo.size() - 1, this.li);
      this.lo.getItem(this.li).setChecked(true);
    }
  }

  public ColorStateList getIconTintList()
  {
    return this.lj;
  }

  public int getItemBackgroundRes()
  {
    return this.ll;
  }

  public ColorStateList getItemTextColor()
  {
    return this.lk;
  }

  public int getSelectedItemId()
  {
    return this.lh;
  }

  public int getWindowAnimations()
  {
    return 0;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = paramInt3 - paramInt1;
    paramInt4 -= paramInt2;
    paramInt1 = 0;
    paramInt3 = 0;
    if (paramInt1 < i)
    {
      View localView = getChildAt(paramInt1);
      paramInt2 = paramInt3;
      if (localView.getVisibility() != 8)
      {
        if (s.T(this) != 1)
          break label99;
        localView.layout(j - paramInt3 - localView.getMeasuredWidth(), 0, j - paramInt3, paramInt4);
      }
      while (true)
      {
        paramInt2 = paramInt3 + localView.getMeasuredWidth();
        paramInt1++;
        paramInt3 = paramInt2;
        break;
        label99: localView.layout(paramInt3, 0, localView.getMeasuredWidth() + paramInt3, paramInt4);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = View.MeasureSpec.getSize(paramInt1);
    int i = getChildCount();
    int j = View.MeasureSpec.makeMeasureSpec(this.le, 1073741824);
    int m;
    Object localObject;
    int n;
    if (this.kT)
    {
      paramInt1 = i - 1;
      int k = Math.min(paramInt2 - this.lc * paramInt1, this.ld);
      m = Math.min((paramInt2 - k) / paramInt1, this.lb);
      paramInt1 = paramInt2 - k - paramInt1 * m;
      paramInt2 = 0;
      if (paramInt2 >= i)
        break label226;
      localObject = this.lm;
      if (paramInt2 == this.li)
      {
        n = k;
        label100: localObject[paramInt2] = n;
        if (paramInt1 <= 0)
          break label335;
        localObject = this.lm;
        localObject[paramInt2] += 1;
        paramInt1--;
      }
    }
    label335: 
    while (true)
    {
      paramInt2++;
      break;
      n = m;
      break label100;
      if (i == 0);
      for (paramInt1 = 1; ; paramInt1 = i)
      {
        m = Math.min(paramInt2 / paramInt1, this.ld);
        n = paramInt2 - m * i;
        paramInt1 = 0;
        while (paramInt1 < i)
        {
          this.lm[paramInt1] = m;
          paramInt2 = n;
          if (n > 0)
          {
            localObject = this.lm;
            localObject[paramInt1] += 1;
            paramInt2 = n - 1;
          }
          paramInt1++;
          n = paramInt2;
        }
      }
      label226: paramInt1 = 0;
      for (n = 0; paramInt1 < i; n = paramInt2)
      {
        localObject = getChildAt(paramInt1);
        paramInt2 = n;
        if (((View)localObject).getVisibility() != 8)
        {
          ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(this.lm[paramInt1], 1073741824), j);
          ((View)localObject).getLayoutParams().width = ((View)localObject).getMeasuredWidth();
          paramInt2 = n + ((View)localObject).getMeasuredWidth();
        }
        paramInt1++;
      }
      setMeasuredDimension(View.resolveSizeAndState(n, View.MeasureSpec.makeMeasureSpec(n, 1073741824), 0), View.resolveSizeAndState(this.le, j, 0));
      return;
    }
  }

  public void setIconTintList(ColorStateList paramColorStateList)
  {
    this.lj = paramColorStateList;
    if (this.lg == null);
    while (true)
    {
      return;
      BottomNavigationItemView[] arrayOfBottomNavigationItemView = this.lg;
      int i = arrayOfBottomNavigationItemView.length;
      for (int j = 0; j < i; j++)
        arrayOfBottomNavigationItemView[j].setIconTintList(paramColorStateList);
    }
  }

  public void setItemBackgroundRes(int paramInt)
  {
    this.ll = paramInt;
    if (this.lg == null);
    while (true)
    {
      return;
      BottomNavigationItemView[] arrayOfBottomNavigationItemView = this.lg;
      int i = arrayOfBottomNavigationItemView.length;
      for (int j = 0; j < i; j++)
        arrayOfBottomNavigationItemView[j].setItemBackground(paramInt);
    }
  }

  public void setItemTextColor(ColorStateList paramColorStateList)
  {
    this.lk = paramColorStateList;
    if (this.lg == null);
    while (true)
    {
      return;
      BottomNavigationItemView[] arrayOfBottomNavigationItemView = this.lg;
      int i = arrayOfBottomNavigationItemView.length;
      for (int j = 0; j < i; j++)
        arrayOfBottomNavigationItemView[j].setTextColor(paramColorStateList);
    }
  }

  public void setPresenter(BottomNavigationPresenter paramBottomNavigationPresenter)
  {
    this.ln = paramBottomNavigationPresenter;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.design.internal.BottomNavigationMenuView
 * JD-Core Version:    0.6.2
 */