package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.d.a;
import com.tencent.mm.protocal.protobuf.bsv;

final class d$2
  implements d.a
{
  d$2(d paramd)
  {
  }

  public final void d(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(42090);
    paramIntent = new Intent().putExtra("sendId", this.nTA.nTx.wKw);
    if (paramInt == -1)
      paramIntent.putExtra("result_share_msg", true);
    while (true)
    {
      d locald = this.nTA;
      locald.nTy = false;
      if (locald.nTw != null)
        locald.nTw.c(-1, paramIntent);
      AppMethodBeat.o(42090);
      return;
      paramIntent.putExtra("result_share_msg", false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.d.2
 * JD-Core Version:    0.6.2
 */