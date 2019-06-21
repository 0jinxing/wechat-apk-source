package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.sortlist.DragSortListView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class c$a
  implements View.OnClickListener
{
  c$a(c paramc, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(135088);
    paramView = c.a(this.iLH);
    if (paramView != null)
    {
      paramView.removeItem(this.exi);
      AppMethodBeat.o(135088);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135088);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.c.a
 * JD-Core Version:    0.6.2
 */