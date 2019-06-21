package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;

final class BakToPcUI$5
  implements Runnable
{
  BakToPcUI$5(BakToPcUI paramBakToPcUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17971);
    ab.d("MicroMsg.BakToPcUI", "BakToPcUI onCloseSocket errType: %d", new Object[] { Integer.valueOf(this.crc) });
    if (this.crc == -1)
    {
      ab.d("MicroMsg.BakToPcUI", "BakToPcUI jump tips");
      Intent localIntent = new Intent();
      localIntent.putExtra("title", this.jAK.getString(2131297313));
      localIntent.putExtra("rawUrl", this.jAK.getString(2131305823, new Object[] { aa.dor() }));
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("neverGetA8Key", true);
      d.b(this.jAK, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(17971);
    }
    while (true)
    {
      return;
      BakToPcUI.e(this.jAK);
      AppMethodBeat.o(17971);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI.5
 * JD-Core Version:    0.6.2
 */