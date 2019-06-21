package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.d;

final class j$7
  implements h.d
{
  j$7(j paramj)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(7648);
    switch (paramInt2)
    {
    default:
      ab.i("MicroMsg.WebViewMenuHelper", "do del cancel");
      AppMethodBeat.o(7648);
    case -1:
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putLong("fav_local_id", this.utN.cZv().getIntent().getLongExtra("fav_local_id", -1L));
      try
      {
        if (this.utN.cZv().icy.aa(localBundle))
        {
          ab.i("MicroMsg.WebViewMenuHelper", "del fav web url ok, finish webview ui");
          this.utN.cZv().ulI.q("mm_del_fav", Boolean.TRUE);
          this.utN.cZv().finish();
          AppMethodBeat.o(7648);
        }
        else
        {
          ab.w("MicroMsg.WebViewMenuHelper", "try to del web url fail");
          AppMethodBeat.o(7648);
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.WebViewMenuHelper", localException, "", new Object[0]);
        ab.e("MicroMsg.WebViewMenuHelper", "try to del web url crash");
        AppMethodBeat.o(7648);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.7
 * JD-Core Version:    0.6.2
 */