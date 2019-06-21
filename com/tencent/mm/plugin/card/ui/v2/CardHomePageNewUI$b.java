package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.h;
import com.tencent.mm.pluginsdk.ui.e.n;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardSpan;", "Lcom/tencent/mm/pluginsdk/ui/span/PressableClickSpan;", "linkColor", "", "bgColor", "listener", "Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickListener;", "(Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI;IILcom/tencent/mm/pluginsdk/ui/span/MMSpanClickListener;)V", "onClick", "", "widget", "Landroid/view/View;", "plugin-card_release"})
public final class CardHomePageNewUI$b extends n
{
  public CardHomePageNewUI$b(int paramInt, h paramh)
  {
    super(-16777216, paramh);
    AppMethodBeat.i(89181);
    this.vsv = localObject;
    AppMethodBeat.o(89181);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(89180);
    j.p(paramView, "widget");
    if (this.vsv != null)
      this.vsv.a(paramView, null);
    AppMethodBeat.o(89180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.b
 * JD-Core Version:    0.6.2
 */