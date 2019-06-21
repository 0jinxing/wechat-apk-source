package com.tencent.mm.plugin.story.ui.a;

import a.f.a.m;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.j;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class f$d$a
  implements View.OnClickListener
{
  f$d$a(f.d paramd, com.tencent.mm.plugin.story.model.b.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138855);
    if (com.tencent.mm.plugin.story.c.a.a.rQZ.cxi())
    {
      paramView = j.rST;
      if (!bo.isEqual(j.a.cnk(), this.sfO.cEV))
      {
        paramView = this.sfP.sfM.sfI;
        if (paramView != null)
        {
          paramView.m(this.sfO, Boolean.TRUE);
          AppMethodBeat.o(138855);
        }
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(138855);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.f.d.a
 * JD-Core Version:    0.6.2
 */