package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ah;

final class FreeWifiManufacturerLoadingUI$7
  implements Runnable
{
  FreeWifiManufacturerLoadingUI$7(FreeWifiManufacturerLoadingUI paramFreeWifiManufacturerLoadingUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21017);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.mzK);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("allow_wx_schema_url", true);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.putExtra("stastic_scene", 7);
    localIntent.putExtra("neverBlockLocalRequest", true);
    if (FreeWifiManufacturerLoadingUI.g(this.mzG))
      d.b(ah.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(21017);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiManufacturerLoadingUI.7
 * JD-Core Version:    0.6.2
 */