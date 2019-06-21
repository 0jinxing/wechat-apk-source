package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.chatting.ChatFooterCustom;
import com.tencent.mm.ui.chatting.c.b.ai;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.d.a;

final class ah$1$1
  implements Runnable
{
  ah$1$1(ah.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31662);
    aw.RS().Bn();
    ah.a(this.yRN.yRM, this.yRN.val$data, this.yRN.yRK);
    ((ai)this.yRN.yRM.cgL.aF(ai.class)).aW(this.yRN.val$data);
    if (this.yRN.yRL.dDY() != null)
      this.yRN.yRL.dDY().r(this.yRN.val$requestCode, this.yRN.val$data);
    aw.RS().doM();
    AppMethodBeat.o(31662);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ah.1.1
 * JD-Core Version:    0.6.2
 */