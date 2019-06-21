package com.tencent.mm.plugin.story.ui.sns;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class b$c
  implements View.OnClickListener
{
  b$c(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110238);
    if (this.shl.isShowing())
      this.shl.cancel();
    AppMethodBeat.o(110238);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.b.c
 * JD-Core Version:    0.6.2
 */