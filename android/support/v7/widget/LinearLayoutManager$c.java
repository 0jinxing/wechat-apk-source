package android.support.v7.widget;

import android.view.View;
import java.util.List;

final class LinearLayoutManager$c
{
  int Lp;
  int alS;
  int alT = 0;
  boolean alU = false;
  int alV;
  List<RecyclerView.v> alW = null;
  boolean alf = true;
  int alg;
  int alh;
  int ali;
  boolean alm;
  int sE;

  private View be(View paramView)
  {
    int i = this.alW.size();
    Object localObject = null;
    int j = 2147483647;
    int k = 0;
    if (k < i)
    {
      View localView = ((RecyclerView.v)this.alW.get(k)).apJ;
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
      if ((localView == paramView) || (localLayoutParams.aoM.isRemoved()))
        break label126;
      int m = (localLayoutParams.aoM.ki() - this.alh) * this.ali;
      if ((m < 0) || (m >= j))
        break label126;
      localObject = localView;
      if (m != 0)
      {
        localObject = localView;
        j = m;
      }
    }
    label126: 
    while (true)
    {
      k++;
      break;
      return localObject;
    }
  }

  private View iV()
  {
    int i = this.alW.size();
    int j = 0;
    View localView;
    if (j < i)
    {
      localView = ((RecyclerView.v)this.alW.get(j)).apJ;
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
      if ((!localLayoutParams.aoM.isRemoved()) && (this.alh == localLayoutParams.aoM.ki()))
        bd(localView);
    }
    while (true)
    {
      return localView;
      j++;
      break;
      localView = null;
    }
  }

  final View a(RecyclerView.o paramo)
  {
    if (this.alW != null)
      paramo = iV();
    while (true)
    {
      return paramo;
      paramo = paramo.cr(this.alh);
      this.alh += this.ali;
    }
  }

  final boolean b(RecyclerView.s params)
  {
    if ((this.alh >= 0) && (this.alh < params.getItemCount()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void bd(View paramView)
  {
    paramView = be(paramView);
    if (paramView == null);
    for (this.alh = -1; ; this.alh = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).aoM.ki())
      return;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutManager.c
 * JD-Core Version:    0.6.2
 */