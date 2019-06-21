package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.support.v4.f.k.a;
import android.support.v4.f.k.b;
import android.support.v4.f.k.c;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.a;
import android.support.v4.view.p;
import android.support.v4.view.s;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.a
public class TabLayout extends HorizontalScrollView
{
  private static final k.a<TabLayout.e> rR = new k.c(16);
  int mMode;
  private final ArrayList<TabLayout.e> rS = new ArrayList();
  private TabLayout.e rT;
  private final TabLayout.d rU;
  int rV;
  int rW;
  int rX;
  int rY;
  int rZ;
  ColorStateList sa;
  float sc;
  float sd;
  final int se;
  int sf = 2147483647;
  private final int sg;
  private final int si;
  private final int sj;
  private int sk;
  int sl;
  private TabLayout.b sm;
  private final ArrayList<TabLayout.b> sn = new ArrayList();
  private TabLayout.b so;
  private ValueAnimator sp;
  ViewPager sq;
  private p sr;
  private DataSetObserver ss;
  private TabLayout.f st;
  private TabLayout.a su;
  private boolean sv;
  private final k.a<TabLayout.g> sx = new k.b(12);

  public TabLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public TabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    o.G(paramContext);
    setHorizontalScrollBarEnabled(false);
    this.rU = new TabLayout.d(this, paramContext);
    super.addView(this.rU, 0, new FrameLayout.LayoutParams(-2, -1));
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, android.support.design.a.a.TabLayout, paramInt, 2131492869);
    this.rU.ai(paramAttributeSet.getDimensionPixelSize(1, 0));
    this.rU.ah(paramAttributeSet.getColor(0, 0));
    paramInt = paramAttributeSet.getDimensionPixelSize(15, 0);
    this.rY = paramInt;
    this.rX = paramInt;
    this.rW = paramInt;
    this.rV = paramInt;
    this.rV = paramAttributeSet.getDimensionPixelSize(11, this.rV);
    this.rW = paramAttributeSet.getDimensionPixelSize(12, this.rW);
    this.rX = paramAttributeSet.getDimensionPixelSize(13, this.rX);
    this.rY = paramAttributeSet.getDimensionPixelSize(14, this.rY);
    this.rZ = paramAttributeSet.getResourceId(8, 2131493646);
    paramContext = paramContext.obtainStyledAttributes(this.rZ, android.support.v7.a.a.a.TextAppearance);
    try
    {
      this.sc = paramContext.getDimensionPixelSize(0, 0);
      this.sa = paramContext.getColorStateList(3);
      paramContext.recycle();
      if (paramAttributeSet.hasValue(9))
        this.sa = paramAttributeSet.getColorStateList(9);
      if (paramAttributeSet.hasValue(10))
      {
        int i = paramAttributeSet.getColor(10, 0);
        paramInt = this.sa.getDefaultColor();
        this.sa = new ColorStateList(new int[][] { SELECTED_STATE_SET, EMPTY_STATE_SET }, new int[] { i, paramInt });
      }
      this.sg = paramAttributeSet.getDimensionPixelSize(6, -1);
      this.si = paramAttributeSet.getDimensionPixelSize(7, -1);
      this.se = paramAttributeSet.getResourceId(3, 0);
      this.sk = paramAttributeSet.getDimensionPixelSize(2, 0);
      this.mMode = paramAttributeSet.getInt(4, 1);
      this.sl = paramAttributeSet.getInt(5, 0);
      paramAttributeSet.recycle();
      paramContext = getResources();
      this.sd = paramContext.getDimensionPixelSize(2131428299);
      this.sj = paramContext.getDimensionPixelSize(2131427394);
      cs();
      return;
    }
    finally
    {
      paramContext.recycle();
    }
    throw paramAttributeSet;
  }

  private TabLayout.g a(TabLayout.e parame)
  {
    if (this.sx != null);
    for (TabLayout.g localg1 = (TabLayout.g)this.sx.aA(); ; localg1 = null)
    {
      TabLayout.g localg2 = localg1;
      if (localg1 == null)
        localg2 = new TabLayout.g(this, getContext());
      localg2.i(parame);
      localg2.setFocusable(true);
      localg2.setMinimumWidth(getTabMinWidth());
      return localg2;
    }
  }

  private void a(TabItem paramTabItem)
  {
    TabLayout.e locale = cp();
    if (paramTabItem.mText != null)
      locale.b(paramTabItem.mText);
    if (paramTabItem.rP != null)
    {
      locale.rP = paramTabItem.rP;
      locale.cu();
    }
    if (paramTabItem.rQ != 0)
      locale.aj(paramTabItem.rQ);
    if (!TextUtils.isEmpty(paramTabItem.getContentDescription()))
    {
      locale.sP = paramTabItem.getContentDescription();
      locale.cu();
    }
    a(locale, this.rS.isEmpty());
  }

  private void a(TabLayout.e parame, int paramInt)
  {
    parame.mPosition = paramInt;
    this.rS.add(paramInt, parame);
    int i = this.rS.size();
    paramInt++;
    while (paramInt < i)
    {
      ((TabLayout.e)this.rS.get(paramInt)).mPosition = paramInt;
      paramInt++;
    }
  }

  private void a(ViewPager paramViewPager, boolean paramBoolean)
  {
    if (this.sq != null)
    {
      if (this.st != null)
        this.sq.removeOnPageChangeListener(this.st);
      if (this.su != null)
        this.sq.removeOnAdapterChangeListener(this.su);
    }
    if (this.so != null)
    {
      b(this.so);
      this.so = null;
    }
    if (paramViewPager != null)
    {
      this.sq = paramViewPager;
      if (this.st == null)
        this.st = new TabLayout.f(this);
      this.st.reset();
      paramViewPager.addOnPageChangeListener(this.st);
      this.so = new TabLayout.h(paramViewPager);
      a(this.so);
      p localp = paramViewPager.getAdapter();
      if (localp != null)
        a(localp, true);
      if (this.su == null)
        this.su = new TabLayout.a(this);
      this.su.sz = true;
      paramViewPager.addOnAdapterChangeListener(this.su);
      setScrollPosition$4867b5c2(paramViewPager.getCurrentItem());
    }
    while (true)
    {
      this.sv = paramBoolean;
      return;
      this.sq = null;
      a(null, false);
    }
  }

  private void a(LinearLayout.LayoutParams paramLayoutParams)
  {
    if ((this.mMode == 1) && (this.sl == 0))
      paramLayoutParams.width = 0;
    for (paramLayoutParams.weight = 1.0F; ; paramLayoutParams.weight = 0.0F)
    {
      return;
      paramLayoutParams.width = -2;
    }
  }

  private void ae(int paramInt)
  {
    if (paramInt == -1);
    while (true)
    {
      return;
      if ((getWindowToken() != null) && (s.as(this)))
      {
        TabLayout.d locald = this.rU;
        i = locald.getChildCount();
        j = 0;
        label33: if (j >= i)
          break label73;
        if (locald.getChildAt(j).getWidth() > 0)
          break label67;
      }
      label67: label73: for (int j = 1; ; j = 0)
      {
        if (j == 0)
          break label79;
        setScrollPosition$4867b5c2(paramInt);
        break;
        j++;
        break label33;
      }
      label79: int i = getScrollX();
      j = b(paramInt, 0.0F);
      if (i != j)
      {
        cr();
        this.sp.setIntValues(new int[] { i, j });
        this.sp.start();
      }
      this.rU.o(paramInt, 300);
    }
  }

  private int b(int paramInt, float paramFloat)
  {
    int i = 0;
    int j = 0;
    View localView2;
    if (this.mMode == 0)
    {
      View localView1 = this.rU.getChildAt(paramInt);
      if (paramInt + 1 >= this.rU.getChildCount())
        break label116;
      localView2 = this.rU.getChildAt(paramInt + 1);
      if (localView1 == null)
        break label122;
      paramInt = localView1.getWidth();
      label58: i = j;
      if (localView2 != null)
        i = localView2.getWidth();
      j = localView1.getLeft() + paramInt / 2 - getWidth() / 2;
      paramInt = (int)((i + paramInt) * 0.5F * paramFloat);
      if (s.T(this) != 0)
        break label127;
    }
    label116: label122: label127: for (i = paramInt + j; ; i = j - paramInt)
    {
      return i;
      localView2 = null;
      break;
      paramInt = 0;
      break label58;
    }
  }

  private void b(TabLayout.b paramb)
  {
    this.sn.remove(paramb);
  }

  private void c(TabLayout.e parame)
  {
    for (int i = this.sn.size() - 1; i >= 0; i--)
      ((TabLayout.b)this.sn.get(i)).f(parame);
  }

  private void cr()
  {
    if (this.sp == null)
    {
      this.sp = new ValueAnimator();
      this.sp.setInterpolator(a.mg);
      this.sp.setDuration(300L);
      this.sp.addUpdateListener(new TabLayout.1(this));
    }
  }

  private void cs()
  {
    if (this.mMode == 0);
    for (int i = Math.max(0, this.sk - this.rV); ; i = 0)
    {
      s.d(this.rU, i, 0, 0, 0);
      switch (this.mMode)
      {
      default:
      case 1:
      case 0:
      }
      while (true)
      {
        r(true);
        return;
        this.rU.setGravity(1);
        continue;
        this.rU.setGravity(8388611);
      }
    }
  }

  private void d(TabLayout.e parame)
  {
    for (int i = this.sn.size() - 1; i >= 0; i--)
      ((TabLayout.b)this.sn.get(i)).g(parame);
  }

  private void e(TabLayout.e parame)
  {
    for (int i = this.sn.size() - 1; i >= 0; i--)
      ((TabLayout.b)this.sn.get(i)).h(parame);
  }

  private int getDefaultHeight()
  {
    int i = this.rS.size();
    int j = 0;
    if (j < i)
    {
      TabLayout.e locale = (TabLayout.e)this.rS.get(j);
      if ((locale == null) || (locale.rP == null) || (TextUtils.isEmpty(locale.mText)));
    }
    for (j = 1; ; j = 0)
    {
      if (j != 0);
      for (j = 72; ; j = 48)
      {
        return j;
        j++;
        break;
      }
    }
  }

  private float getScrollPosition()
  {
    TabLayout.d locald = this.rU;
    float f = locald.sC;
    return locald.sD + f;
  }

  private int getTabMinWidth()
  {
    int i;
    if (this.sg != -1)
      i = this.sg;
    while (true)
    {
      return i;
      if (this.mMode == 0)
        i = this.sj;
      else
        i = 0;
    }
  }

  private int getTabScrollRange()
  {
    return Math.max(0, this.rU.getWidth() - getWidth() - getPaddingLeft() - getPaddingRight());
  }

  private void removeAllTabs()
  {
    Object localObject;
    for (int i = this.rU.getChildCount() - 1; i >= 0; i--)
    {
      localObject = (TabLayout.g)this.rU.getChildAt(i);
      this.rU.removeViewAt(i);
      if (localObject != null)
      {
        ((TabLayout.g)localObject).i(null);
        ((TabLayout.g)localObject).setSelected(false);
        this.sx.release(localObject);
      }
      requestLayout();
    }
    Iterator localIterator = this.rS.iterator();
    while (localIterator.hasNext())
    {
      localObject = (TabLayout.e)localIterator.next();
      localIterator.remove();
      ((TabLayout.e)localObject).sR = null;
      ((TabLayout.e)localObject).sS = null;
      ((TabLayout.e)localObject).sO = null;
      ((TabLayout.e)localObject).rP = null;
      ((TabLayout.e)localObject).mText = null;
      ((TabLayout.e)localObject).sP = null;
      ((TabLayout.e)localObject).mPosition = -1;
      ((TabLayout.e)localObject).sQ = null;
      rR.release(localObject);
    }
    this.rT = null;
  }

  private void setScrollPosition$4867b5c2(int paramInt)
  {
    a(paramInt, 0.0F, true, true);
  }

  private void setSelectedTabView(int paramInt)
  {
    int i = this.rU.getChildCount();
    if (paramInt < i)
    {
      int j = 0;
      if (j < i)
      {
        View localView = this.rU.getChildAt(j);
        if (j == paramInt);
        for (boolean bool = true; ; bool = false)
        {
          localView.setSelected(bool);
          j++;
          break;
        }
      }
    }
  }

  private void t(View paramView)
  {
    if ((paramView instanceof TabItem))
    {
      a((TabItem)paramView);
      return;
    }
    throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
  }

  final void a(int paramInt, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Math.round(paramInt + paramFloat);
    if ((i < 0) || (i >= this.rU.getChildCount()));
    while (true)
    {
      return;
      if (paramBoolean2)
        this.rU.c(paramInt, paramFloat);
      if ((this.sp != null) && (this.sp.isRunning()))
        this.sp.cancel();
      scrollTo(b(paramInt, paramFloat), 0);
      if (paramBoolean1)
        setSelectedTabView(i);
    }
  }

  public final void a(TabLayout.b paramb)
  {
    if (!this.sn.contains(paramb))
      this.sn.add(paramb);
  }

  public final void a(TabLayout.e parame, boolean paramBoolean)
  {
    int i = this.rS.size();
    if (parame.sR != this)
      throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    a(parame, i);
    TabLayout.g localg = parame.sS;
    TabLayout.d locald = this.rU;
    i = parame.mPosition;
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    a(localLayoutParams);
    locald.addView(localg, i, localLayoutParams);
    if (paramBoolean)
      parame.select();
  }

  final void a(p paramp, boolean paramBoolean)
  {
    if ((this.sr != null) && (this.ss != null))
      this.sr.unregisterDataSetObserver(this.ss);
    this.sr = paramp;
    if ((paramBoolean) && (paramp != null))
    {
      if (this.ss == null)
        this.ss = new TabLayout.c(this);
      paramp.registerDataSetObserver(this.ss);
    }
    cq();
  }

  public final TabLayout.e ac(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= getTabCount()));
    for (TabLayout.e locale = null; ; locale = (TabLayout.e)this.rS.get(paramInt))
      return locale;
  }

  final int ad(int paramInt)
  {
    return Math.round(getResources().getDisplayMetrics().density * paramInt);
  }

  public void addView(View paramView)
  {
    t(paramView);
  }

  public void addView(View paramView, int paramInt)
  {
    t(paramView);
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    t(paramView);
  }

  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    t(paramView);
  }

  final void b(TabLayout.e parame)
  {
    b(parame, true);
  }

  final void b(TabLayout.e parame, boolean paramBoolean)
  {
    TabLayout.e locale = this.rT;
    if (locale == parame)
    {
      if (locale != null)
      {
        e(parame);
        ae(parame.mPosition);
      }
      return;
    }
    int i;
    if (parame != null)
    {
      i = parame.mPosition;
      label38: if (paramBoolean)
      {
        if (((locale != null) && (locale.mPosition != -1)) || (i == -1))
          break label110;
        setScrollPosition$4867b5c2(i);
      }
    }
    while (true)
    {
      if (i != -1)
        setSelectedTabView(i);
      if (locale != null)
        d(locale);
      this.rT = parame;
      if (parame == null)
        break;
      c(parame);
      break;
      i = -1;
      break label38;
      label110: ae(i);
    }
  }

  public final TabLayout.e cp()
  {
    TabLayout.e locale1 = (TabLayout.e)rR.aA();
    TabLayout.e locale2 = locale1;
    if (locale1 == null)
      locale2 = new TabLayout.e();
    locale2.sR = this;
    locale2.sS = a(locale2);
    return locale2;
  }

  final void cq()
  {
    removeAllTabs();
    if (this.sr != null)
    {
      int i = this.sr.getCount();
      for (int j = 0; j < i; j++)
        a(cp().b(this.sr.getPageTitle(j)), false);
      if ((this.sq != null) && (i > 0))
      {
        j = this.sq.getCurrentItem();
        if ((j != getSelectedTabPosition()) && (j < getTabCount()))
          b(ac(j), true);
      }
    }
  }

  public FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return generateDefaultLayoutParams();
  }

  public int getSelectedTabPosition()
  {
    if (this.rT != null);
    for (int i = this.rT.mPosition; ; i = -1)
      return i;
  }

  public int getTabCount()
  {
    return this.rS.size();
  }

  public int getTabGravity()
  {
    return this.sl;
  }

  int getTabMaxWidth()
  {
    return this.sf;
  }

  public int getTabMode()
  {
    return this.mMode;
  }

  public ColorStateList getTabTextColors()
  {
    return this.sa;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.sq == null)
    {
      ViewParent localViewParent = getParent();
      if ((localViewParent instanceof ViewPager))
        a((ViewPager)localViewParent, true);
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.sv)
    {
      setupWithViewPager(null);
      this.sv = false;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = ad(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
    label78: View localView;
    switch (View.MeasureSpec.getMode(paramInt2))
    {
    default:
      j = View.MeasureSpec.getSize(paramInt1);
      if (View.MeasureSpec.getMode(paramInt1) != 0)
      {
        if (this.si > 0)
        {
          j = this.si;
          this.sf = j;
        }
      }
      else
      {
        super.onMeasure(paramInt1, paramInt2);
        if (getChildCount() == 1)
        {
          localView = getChildAt(0);
          switch (this.mMode)
          {
          default:
            paramInt1 = 0;
          case 0:
          case 1:
          }
        }
      }
      break;
    case -2147483648:
    case 0:
    }
    while (true)
    {
      if (paramInt1 != 0)
      {
        paramInt1 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom(), localView.getLayoutParams().height);
        localView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), paramInt1);
      }
      return;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(j, View.MeasureSpec.getSize(paramInt2)), 1073741824);
      break;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
      break;
      j -= ad(56);
      break label78;
      if (localView.getMeasuredWidth() < getMeasuredWidth())
        paramInt1 = 1;
      else
        paramInt1 = 0;
    }
    if (localView.getMeasuredWidth() != getMeasuredWidth());
    for (paramInt1 = i; ; paramInt1 = 0)
      break;
  }

  final void r(boolean paramBoolean)
  {
    for (int i = 0; i < this.rU.getChildCount(); i++)
    {
      View localView = this.rU.getChildAt(i);
      localView.setMinimumWidth(getTabMinWidth());
      a((LinearLayout.LayoutParams)localView.getLayoutParams());
      if (paramBoolean)
        localView.requestLayout();
    }
  }

  @Deprecated
  public void setOnTabSelectedListener(TabLayout.b paramb)
  {
    if (this.sm != null)
      b(this.sm);
    this.sm = paramb;
    if (paramb != null)
      a(paramb);
  }

  void setScrollAnimatorListener(Animator.AnimatorListener paramAnimatorListener)
  {
    cr();
    this.sp.addListener(paramAnimatorListener);
  }

  public void setSelectedTabIndicatorColor(int paramInt)
  {
    this.rU.ah(paramInt);
  }

  public void setSelectedTabIndicatorHeight(int paramInt)
  {
    this.rU.ai(paramInt);
  }

  public void setTabGravity(int paramInt)
  {
    if (this.sl != paramInt)
    {
      this.sl = paramInt;
      cs();
    }
  }

  public void setTabMode(int paramInt)
  {
    if (paramInt != this.mMode)
    {
      this.mMode = paramInt;
      cs();
    }
  }

  public void setTabTextColors(ColorStateList paramColorStateList)
  {
    if (this.sa != paramColorStateList)
    {
      this.sa = paramColorStateList;
      int i = this.rS.size();
      for (int j = 0; j < i; j++)
        ((TabLayout.e)this.rS.get(j)).cu();
    }
  }

  @Deprecated
  public void setTabsFromPagerAdapter(p paramp)
  {
    a(paramp, false);
  }

  public void setupWithViewPager(ViewPager paramViewPager)
  {
    a(paramViewPager, false);
  }

  public boolean shouldDelayChildPressedState()
  {
    if (getTabScrollRange() > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TabLayout
 * JD-Core Version:    0.6.2
 */