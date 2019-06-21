package com.tencent.mm.plugin.webview.fts;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class b$2
  implements Runnable
{
  b$2(b paramb, String paramString, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5674);
    g localg = h.JR(this.ufq.ufj.fpL.cIv);
    String str1 = this.ufq.ufj.fpL.ctj;
    String str2 = this.ufu;
    ArrayList localArrayList = this.ufv;
    ab.i("MicroMsg.MsgHandler", "onSearchSuggestCallback: %s", new Object[] { localArrayList.toString() });
    Bundle localBundle = new Bundle();
    localBundle.putString("query", str1);
    localBundle.putString("suggestionId", str2);
    localBundle.putStringArrayList("result", localArrayList);
    try
    {
      if (localg.umI != null)
        localg.umI.c(127, localBundle);
      AppMethodBeat.o(5674);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.w("MicroMsg.MsgHandler", "onSearchSuggestCallback exception" + localRemoteException.getMessage());
        AppMethodBeat.o(5674);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.b.2
 * JD-Core Version:    0.6.2
 */