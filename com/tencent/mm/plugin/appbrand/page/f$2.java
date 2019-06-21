package com.tencent.mm.plugin.appbrand.page;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class f$2
  implements View.OnClickListener
{
  f$2(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134763);
    paramView = this.ire.getPositiveButton();
    if (paramView != null)
    {
      paramView.onClick((DialogInterface)this.ire, -1);
      AppMethodBeat.o(134763);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134763);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.f.2
 * JD-Core Version:    0.6.2
 */