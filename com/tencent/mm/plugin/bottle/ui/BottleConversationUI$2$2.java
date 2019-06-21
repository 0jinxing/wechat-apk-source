package com.tencent.mm.plugin.bottle.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf.a;
import com.tencent.mm.ui.base.p;

final class BottleConversationUI$2$2
  implements bf.a
{
  BottleConversationUI$2$2(BottleConversationUI.2 param2)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(18555);
    boolean bool = BottleConversationUI.f(this.jKc.jKb);
    AppMethodBeat.o(18555);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(18556);
    if (BottleConversationUI.g(this.jKc.jKb) != null)
    {
      BottleConversationUI.g(this.jKc.jKb).dismiss();
      BottleConversationUI.a(this.jKc.jKb, null);
    }
    AppMethodBeat.o(18556);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.BottleConversationUI.2.2
 * JD-Core Version:    0.6.2
 */