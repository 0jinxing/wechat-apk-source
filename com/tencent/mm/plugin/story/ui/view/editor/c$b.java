package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.a.a;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class c$b
  implements View.OnClickListener
{
  c$b(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138924);
    paramView = this.slR.slO;
    if (paramView != null)
      paramView.invoke();
    this.slR.dismiss();
    AppMethodBeat.o(138924);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.c.b
 * JD-Core Version:    0.6.2
 */