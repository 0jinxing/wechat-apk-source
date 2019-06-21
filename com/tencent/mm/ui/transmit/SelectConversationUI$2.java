package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.i.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class SelectConversationUI$2
  implements i.b
{
  SelectConversationUI$2(SelectConversationUI paramSelectConversationUI, e parame)
  {
  }

  public final void kQ(int paramInt)
  {
    AppMethodBeat.i(35125);
    ab.i("MicroMsg.SelectConversationUI", "onLoadImageResult() result:%d", new Object[] { Integer.valueOf(paramInt) });
    e locale = this.zKk;
    locale.iHk = true;
    if (locale.oC())
    {
      al.af(locale.hEw);
      locale.aMl();
    }
    AppMethodBeat.o(35125);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.2
 * JD-Core Version:    0.6.2
 */