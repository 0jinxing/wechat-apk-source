package com.tencent.mm.ui.widget.a;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n.d;
import java.util.List;

final class d$1
  implements AdapterView.OnItemClickListener
{
  d$1(d paramd)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112647);
    paramAdapterView = (m)d.b(this.zQE).yvT.get(paramInt);
    if ((paramAdapterView != null) && (paramAdapterView.xeS))
    {
      AppMethodBeat.o(112647);
      return;
    }
    if (paramInt < d.b(this.zQE).size())
      if (d.c(this.zQE) != null)
        d.c(this.zQE).onMMMenuItemSelected(d.b(this.zQE).getItem(paramInt), paramInt);
    while (true)
    {
      if (!d.f(this.zQE))
        this.zQE.cpE();
      d.g(this.zQE);
      d.a(this.zQE, paramInt);
      d.h(this.zQE).aop.notifyChanged();
      AppMethodBeat.o(112647);
      break;
      if ((d.d(this.zQE).size() > 0) && (paramInt < d.b(this.zQE).size() + d.d(this.zQE).size()))
      {
        if (d.e(this.zQE) != null)
          d.e(this.zQE).onMMMenuItemSelected(d.d(this.zQE).getItem(paramInt - d.b(this.zQE).size()), paramInt);
      }
      else
        d.dKZ();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.d.1
 * JD-Core Version:    0.6.2
 */