package com.tencent.mm.plugin.story.ui.view;

import a.f.a.a;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class g$2
  implements View.OnClickListener
{
  g$2(g paramg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110470);
    paramView = this.skp.getClickListener();
    if (paramView != null)
    {
      paramView.invoke();
      AppMethodBeat.o(110470);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110470);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.g.2
 * JD-Core Version:    0.6.2
 */