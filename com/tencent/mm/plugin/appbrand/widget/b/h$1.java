package com.tencent.mm.plugin.appbrand.widget.b;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class h$1
  implements View.OnClickListener
{
  h$1(h paramh)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(102481);
    paramView = h.a(this.jcE, true);
    h.a(this.jcE).a(1, paramView);
    paramView = h.b(this.jcE);
    if (paramView != null)
    {
      paramView.c((j)this.jcE);
      AppMethodBeat.o(102481);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(102481);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.h.1
 * JD-Core Version:    0.6.2
 */