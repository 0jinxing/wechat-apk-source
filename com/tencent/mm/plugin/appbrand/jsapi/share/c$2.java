package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

final class c$2
  implements Runnable
{
  c$2(c paramc, MMActivity paramMMActivity, Intent paramIntent, MMActivity.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131440);
    d.a(this.cgq, ".ui.transmit.SelectConversationUI", this.val$intent, 1, this.hWt);
    AppMethodBeat.o(131440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.c.2
 * JD-Core Version:    0.6.2
 */