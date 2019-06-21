package com.tencent.mm.plugin.appbrand;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.q;

final class i$9
  implements ViewGroup.OnHierarchyChangeListener
{
  i$9(i parami, View paramView)
  {
  }

  public final void onChildViewAdded(View paramView1, View paramView2)
  {
  }

  public final void onChildViewRemoved(View paramView1, View paramView2)
  {
    AppMethodBeat.i(86660);
    if ((paramView2 == this.gOl) && (!this.gOb.mFinished))
      this.gOb.asV().setActuallyVisible(true);
    AppMethodBeat.o(86660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.9
 * JD-Core Version:    0.6.2
 */