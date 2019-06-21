package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.stub.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public class k$c
  implements ServiceConnection
{
  protected k$c(k paramk)
  {
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(9967);
    ab.i("MicroMsg.MMWebViewClient", "onServiceConnected");
    if (this.uJE.fow == null)
    {
      ab.e("MicroMsg.MMWebViewClient", "onServiceConnected, activity destroyed");
      AppMethodBeat.o(9967);
    }
    while (true)
    {
      return;
      try
      {
        this.uJE.uzS = d.a.G(paramIBinder);
        paramIBinder = this.uJE.uzS;
        paramComponentName = new com/tencent/mm/plugin/webview/ui/tools/widget/k$d;
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(this.uJE.uJD);
        paramComponentName.<init>(localWeakReference);
        paramIBinder.a(paramComponentName, this.uJE.fow.hashCode());
        if (this.uJE.uJm != null)
          this.uJE.uzS.a(this.uJE.uJm, this.uJE.fow.hashCode());
        this.uJE.dcU();
        this.uJE.dbU();
        this.uJE.a(this.uJE.uzS, this.uJE.uFu);
        AppMethodBeat.o(9967);
      }
      catch (Exception paramComponentName)
      {
        ab.e("MicroMsg.MMWebViewClient", "addCallback fail, ex = %s", new Object[] { paramComponentName.getMessage() });
        AppMethodBeat.o(9967);
      }
    }
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(9968);
    ab.i("MicroMsg.MMWebViewClient", "edw onServiceDisconnected");
    if (!this.uJE.gNy.isFinishing())
    {
      ab.i("MicroMsg.MMWebViewClient", "maybe mm process crash, try rebind service");
      k.a(this.uJE);
      AppMethodBeat.o(9968);
    }
    while (true)
    {
      return;
      this.uJE.uzS = null;
      AppMethodBeat.o(9968);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.k.c
 * JD-Core Version:    0.6.2
 */