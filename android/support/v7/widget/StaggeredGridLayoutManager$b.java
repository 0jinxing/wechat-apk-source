package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

final class StaggeredGridLayoutManager$b
{
  ArrayList<View> asv;
  int asw;
  int asx;
  int asy;
  final int mIndex;

  private int aP(int paramInt1, int paramInt2)
  {
    int i = -1;
    int j = this.asj.arS.je();
    int k = this.asj.arS.jf();
    int m;
    if (paramInt2 > paramInt1)
      m = 1;
    while (true)
    {
      int n = i;
      View localView;
      int i1;
      int i2;
      if (paramInt1 != paramInt2)
      {
        localView = (View)this.asv.get(paramInt1);
        i1 = this.asj.arS.bf(localView);
        i2 = this.asj.arS.bg(localView);
        if (i1 > k)
          break label143;
        n = 1;
        label93: if (i2 < j)
          break label149;
      }
      label143: label149: for (int i3 = 1; ; i3 = 0)
      {
        if ((n == 0) || (i3 == 0) || ((i1 >= j) && (i2 <= k)))
          break label155;
        n = StaggeredGridLayoutManager.bt(localView);
        return n;
        m = -1;
        break;
        n = 0;
        break label93;
      }
      label155: paramInt1 += m;
    }
  }

  private void kZ()
  {
    Object localObject = (View)this.asv.get(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)((View)localObject).getLayoutParams();
    this.asw = this.asj.arS.bf((View)localObject);
    if (localLayoutParams.asl)
    {
      localObject = this.asj.arX.cQ(localLayoutParams.aoM.ki());
      if ((localObject != null) && (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).asn == -1))
        this.asw -= ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).cR(this.mIndex);
    }
  }

  private void lb()
  {
    Object localObject = (View)this.asv.get(this.asv.size() - 1);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)((View)localObject).getLayoutParams();
    this.asx = this.asj.arS.bg((View)localObject);
    if (localLayoutParams.asl)
    {
      localObject = this.asj.arX.cQ(localLayoutParams.aoM.ki());
      if ((localObject != null) && (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).asn == 1))
      {
        int i = this.asx;
        this.asx = (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).cR(this.mIndex) + i);
      }
    }
  }

  private void ld()
  {
    this.asw = -2147483648;
    this.asx = -2147483648;
  }

  public final View aQ(int paramInt1, int paramInt2)
  {
    View localView1 = null;
    View localView2 = null;
    if (paramInt2 == -1)
    {
      int i = this.asv.size();
      paramInt2 = 0;
      while (paramInt2 < i)
      {
        localView1 = (View)this.asv.get(paramInt2);
        if (((this.asj.alC) && (StaggeredGridLayoutManager.bt(localView1) <= paramInt1)) || ((!this.asj.alC) && (StaggeredGridLayoutManager.bt(localView1) >= paramInt1)) || (!localView1.hasFocusable()))
          break;
        paramInt2++;
        localView2 = localView1;
      }
    }
    while (true)
    {
      return localView2;
      paramInt2 = this.asv.size() - 1;
      for (localView2 = localView1; paramInt2 >= 0; localView2 = localView1)
      {
        localView1 = (View)this.asv.get(paramInt2);
        if (((this.asj.alC) && (StaggeredGridLayoutManager.bt(localView1) >= paramInt1)) || ((!this.asj.alC) && (StaggeredGridLayoutManager.bt(localView1) <= paramInt1)) || (!localView1.hasFocusable()))
          break;
        paramInt2--;
      }
    }
  }

  final void bO(View paramView)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    localLayoutParams.ask = this;
    this.asv.add(0, paramView);
    this.asw = -2147483648;
    if (this.asv.size() == 1)
      this.asx = -2147483648;
    if ((localLayoutParams.aoM.isRemoved()) || (localLayoutParams.aoM.kx()))
      this.asy += this.asj.arS.bj(paramView);
  }

  final void bP(View paramView)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    localLayoutParams.ask = this;
    this.asv.add(paramView);
    this.asx = -2147483648;
    if (this.asv.size() == 1)
      this.asw = -2147483648;
    if ((localLayoutParams.aoM.isRemoved()) || (localLayoutParams.aoM.kx()))
      this.asy += this.asj.arS.bj(paramView);
  }

  final int cS(int paramInt)
  {
    if (this.asw != -2147483648)
      paramInt = this.asw;
    while (true)
    {
      return paramInt;
      if (this.asv.size() != 0)
      {
        kZ();
        paramInt = this.asw;
      }
    }
  }

  final int cT(int paramInt)
  {
    if (this.asx != -2147483648)
      paramInt = this.asx;
    while (true)
    {
      return paramInt;
      if (this.asv.size() != 0)
      {
        lb();
        paramInt = this.asx;
      }
    }
  }

  final void cU(int paramInt)
  {
    this.asw = paramInt;
    this.asx = paramInt;
  }

  final void cV(int paramInt)
  {
    if (this.asw != -2147483648)
      this.asw += paramInt;
    if (this.asx != -2147483648)
      this.asx += paramInt;
  }

  final void clear()
  {
    this.asv.clear();
    ld();
    this.asy = 0;
  }

  final int la()
  {
    if (this.asw != -2147483648);
    for (int i = this.asw; ; i = this.asw)
    {
      return i;
      kZ();
    }
  }

  final int lc()
  {
    if (this.asx != -2147483648);
    for (int i = this.asx; ; i = this.asx)
    {
      return i;
      lb();
    }
  }

  final void le()
  {
    int i = this.asv.size();
    View localView = (View)this.asv.remove(i - 1);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
    localLayoutParams.ask = null;
    if ((localLayoutParams.aoM.isRemoved()) || (localLayoutParams.aoM.kx()))
      this.asy -= this.asj.arS.bj(localView);
    if (i == 1)
      this.asw = -2147483648;
    this.asx = -2147483648;
  }

  final void lf()
  {
    View localView = (View)this.asv.remove(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
    localLayoutParams.ask = null;
    if (this.asv.size() == 0)
      this.asx = -2147483648;
    if ((localLayoutParams.aoM.isRemoved()) || (localLayoutParams.aoM.kx()))
      this.asy -= this.asj.arS.bj(localView);
    this.asw = -2147483648;
  }

  public final int lg()
  {
    if (this.asj.alC);
    for (int i = aP(this.asv.size() - 1, -1); ; i = aP(0, this.asv.size()))
      return i;
  }

  public final int lh()
  {
    if (this.asj.alC);
    for (int i = aP(0, this.asv.size()); ; i = aP(this.asv.size() - 1, -1))
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager.b
 * JD-Core Version:    0.6.2
 */