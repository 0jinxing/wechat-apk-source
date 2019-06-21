package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.sdk.platformtools.bo;

final class e$6
  implements MenuItem.OnMenuItemClickListener
{
  e$6(e parame, String paramString1, String paramString2)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(17034);
    e locale = this.icM;
    String str1 = this.icT;
    String str2 = e.c(this.icM);
    paramMenuItem = this.icU;
    int i = this.icM.icC;
    int j = this.icM.icD;
    if (str1 != null)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(locale.icv.getContext(), WebviewScanImageActivity.class);
      localIntent.putExtra("key_string_for_scan", str1);
      localIntent.putExtra("key_string_for_url", str2);
      localIntent.putExtra("key_string_for_image_url", paramMenuItem);
      localIntent.putExtra("key_codetype_for_scan", i);
      localIntent.putExtra("key_codeversion_for_scan", j);
      if ((locale.icI != null) && (!bo.isNullOrNil(locale.icI.getAppId())))
        localIntent.putExtra("key_string_for_wxapp_id", locale.icI.getAppId());
      locale.icv.getContext().startActivity(localIntent);
    }
    AppMethodBeat.o(17034);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.e.6
 * JD-Core Version:    0.6.2
 */