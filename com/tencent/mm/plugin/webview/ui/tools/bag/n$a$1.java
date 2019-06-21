package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.f.b;
import com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class n$a$1
  implements Runnable
{
  n$a$1(int paramInt, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8252);
    switch (this.cgR)
    {
    case 5:
    case 6:
    case 7:
    case 8:
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 9:
    }
    while (true)
    {
      AppMethodBeat.o(8252);
      while (true)
      {
        return;
        String str1 = this.cgJ.getString("key_url");
        String str2 = this.cgJ.getString("key_bag_icon");
        int i = this.cgJ.getInt("key_scene", 0);
        boolean bool = this.cgJ.getBoolean("key_from_bag", false);
        Bundle localBundle = this.cgJ.getBundle("key_extras");
        l locall = l.uzq;
        if (!b.bF(ah.getContext()))
        {
          ab.w("MicroMsg.WebViewBagMgr", "showBag: no float window permission");
          Context localContext = ah.getContext();
          RequestFloatWindowPermissionDialog.a(localContext, localContext.getString(2131305532), new l.1(locall, str1, i, str2, localBundle, bool));
          AppMethodBeat.o(8252);
        }
        else
        {
          locall.a(str1, i, str2, localBundle, bool);
          locall.nW(false);
          AppMethodBeat.o(8252);
          continue;
          l.uzq.cYT();
          AppMethodBeat.o(8252);
          continue;
          l.uzq.nU(false);
          AppMethodBeat.o(8252);
          continue;
          l.uzq.dbg();
          AppMethodBeat.o(8252);
        }
      }
      float f = this.cgJ.getFloat("key_alpha", 1.0F);
      l.uzq.bi(f);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.n.a.1
 * JD-Core Version:    0.6.2
 */