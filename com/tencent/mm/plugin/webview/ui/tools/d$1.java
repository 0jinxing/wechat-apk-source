package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class d$1
  implements DialogInterface.OnClickListener
{
  d$1(d paramd, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7406);
    paramDialogInterface = (List)this.urM.urK.get(this.uez);
    if (paramDialogInterface == null)
    {
      ab.e("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, continue selected, list should not be null");
      AppMethodBeat.o(7406);
    }
    while (true)
    {
      return;
      this.urM.urL.put(this.uez, Boolean.FALSE);
      ab.i("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, continue selected, list size = %d", new Object[] { Integer.valueOf(paramDialogInterface.size()) });
      Iterator localIterator = paramDialogInterface.iterator();
      while (localIterator.hasNext())
        ((j)localIterator.next()).cancel();
      paramDialogInterface.clear();
      this.urM.urJ.clearSslPreferences();
      new a();
      a.e((Activity)this.urM.context, this.uez);
      AppMethodBeat.o(7406);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.d.1
 * JD-Core Version:    0.6.2
 */