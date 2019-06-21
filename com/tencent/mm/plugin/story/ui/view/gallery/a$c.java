package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class a$c
  implements View.OnClickListener
{
  a$c(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110699);
    paramView = this.snz.snu;
    if (paramView != null)
      paramView.invoke();
    this.snz.dismiss();
    AppMethodBeat.o(110699);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.a.c
 * JD-Core Version:    0.6.2
 */