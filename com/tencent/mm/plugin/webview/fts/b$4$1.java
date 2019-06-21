package com.tencent.mm.plugin.webview.fts;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class b$4$1
  implements Runnable
{
  b$4$1(b.4 param4, j paramj, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5678);
    g localg;
    Bundle localBundle;
    if ((this.ufw.ufq.mEx != null) && (this.ufw.ufq.mEx.mDs != null))
    {
      localg = h.JR(((Integer)this.ufw.ufq.mEx.mDs).intValue());
      String str = this.mAL.mAJ.query;
      ArrayList localArrayList = this.ufs;
      ab.i("MicroMsg.MsgHandler", "onSearchHistoryCallback: %s", new Object[] { localArrayList.toString() });
      localBundle = new Bundle();
      localBundle.putString("query", str);
      localBundle.putStringArrayList("result", localArrayList);
    }
    while (true)
    {
      try
      {
        if (localg.umI != null)
          localg.umI.c(126, localBundle);
        AppMethodBeat.o(5678);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        ab.w("MicroMsg.MsgHandler", "onSearchHistoryCallback exception" + localRemoteException.getMessage());
      }
      AppMethodBeat.o(5678);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.b.4.1
 * JD-Core Version:    0.6.2
 */