package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

final class d$2
  implements Runnable
{
  d$2(d paramd, MMActivity paramMMActivity, Intent paramIntent, MMActivity.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131445);
    com.tencent.mm.bp.d.a(this.cgq, ".ui.transmit.SelectConversationUI", this.val$intent, 1, this.hWt);
    AppMethodBeat.o(131445);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.d.2
 * JD-Core Version:    0.6.2
 */