package com.tencent.mm.plugin.story.ui.sns;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110266);
    paramView = this.shL;
    boolean bool;
    if (!c.a(this.shL))
    {
      bool = true;
      c.a(paramView, bool);
      if (!c.a(this.shL))
        break label55;
      c.b(this.shL);
      AppMethodBeat.o(110266);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label55: c.c(this.shL);
      AppMethodBeat.o(110266);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.c.1
 * JD-Core Version:    0.6.2
 */