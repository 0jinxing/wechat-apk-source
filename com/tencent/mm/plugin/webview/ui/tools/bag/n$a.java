package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class n$a
{
  public static Bundle af(Bundle paramBundle)
  {
    AppMethodBeat.i(8253);
    int i = paramBundle.getInt("key_action", -1);
    Bundle localBundle = new Bundle();
    if (!g.RN().QY())
    {
      ab.w("MicroMsg.WebViewUIBagHelper", "MM doBagLogic not ready");
      AppMethodBeat.o(8253);
      return localBundle;
    }
    if (9 != i)
      ab.i("MicroMsg.WebViewUIBagHelper", "MM doBagLogic action:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default:
      v(i, paramBundle);
    case 7:
    case 5:
    case 6:
    case 8:
    }
    while (true)
    {
      AppMethodBeat.o(8253);
      break;
      paramBundle = paramBundle.getString("key_bag_id");
      localBundle.putBoolean("key_has_bag", l.uzq.afZ(paramBundle));
      continue;
      l.uzq.nV(paramBundle.getBoolean("key_in_webviewui_from_bag", false));
      continue;
      localBundle.putParcelable("key_current_bag_pos", l.uzq.dbh());
    }
  }

  private static void v(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(8254);
    al.d(new n.a.1(paramInt, paramBundle));
    AppMethodBeat.o(8254);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.n.a
 * JD-Core Version:    0.6.2
 */