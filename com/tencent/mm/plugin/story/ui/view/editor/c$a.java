package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.a.a;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class c$a
  implements View.OnClickListener
{
  c$a(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138923);
    paramView = this.slR.slP;
    if (paramView != null)
      paramView.invoke();
    this.slR.dismiss();
    AppMethodBeat.o(138923);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.c.a
 * JD-Core Version:    0.6.2
 */