package com.tencent.mm.plugin.story.ui.view.gallery;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.g;
import java.util.ArrayList;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class l$2
  implements View.OnClickListener
{
  l$2(l paraml)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138942);
    if ((l.h(this.spK).size() == 1) && (((ArrayList)l.h(this.spK).get(0)).isEmpty()))
    {
      paramView = l.p(this.spK);
      if (paramView != null)
      {
        paramView.caC();
        AppMethodBeat.o(138942);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(138942);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.2
 * JD-Core Version:    0.6.2
 */