package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ns;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardListModel;", "", "(Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI;)V", "element", "Lcom/tencent/mm/protocal/protobuf/CardHomePageElement;", "getElement", "()Lcom/tencent/mm/protocal/protobuf/CardHomePageElement;", "setElement", "(Lcom/tencent/mm/protocal/protobuf/CardHomePageElement;)V", "expandState", "", "getExpandState", "()Z", "setExpandState", "(Z)V", "hasRender", "getHasRender", "setHasRender", "sectionTitle", "", "getSectionTitle", "()Ljava/lang/String;", "setSectionTitle", "(Ljava/lang/String;)V", "type", "", "getType", "()I", "setType", "(I)V", "plugin-card_release"})
public final class CardHomePageNewUI$a
{
  ns koU;
  public String koV;
  boolean koW;
  boolean koX;
  int type;

  public final void GV(String paramString)
  {
    AppMethodBeat.i(89179);
    j.p(paramString, "<set-?>");
    this.koV = paramString;
    AppMethodBeat.o(89179);
  }

  public final String bek()
  {
    AppMethodBeat.i(89178);
    String str = this.koV;
    if (str == null)
      j.avw("sectionTitle");
    AppMethodBeat.o(89178);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.a
 * JD-Core Version:    0.6.2
 */