package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class a$b
  implements View.OnClickListener
{
  a$b(a parama, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(102940);
    RadarSpecialGridView.a locala = this.pCb.pBZ.getOnItemClickListener();
    if (locala != null)
    {
      int i = this.exi;
      j.o(paramView, "v");
      locala.f(i, paramView);
      AppMethodBeat.o(102940);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(102940);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.a.b
 * JD-Core Version:    0.6.2
 */