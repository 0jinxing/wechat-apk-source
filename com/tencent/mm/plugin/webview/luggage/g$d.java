package com.tencent.mm.plugin.webview.luggage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.ipc.a;
import com.tencent.mm.plugin.webview.luggage.ipc.c;
import com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity;
import com.tencent.mm.sdk.platformtools.bo;

class g$d
  implements c
{
  public final void a(Context paramContext, Bundle paramBundle, a parama)
  {
    AppMethodBeat.i(6140);
    String str1 = paramBundle.getString("result");
    if (bo.isNullOrNil(str1))
      AppMethodBeat.o(6140);
    while (true)
    {
      return;
      String str2 = paramBundle.getString("url");
      int i = paramBundle.getInt("codeType");
      int j = paramBundle.getInt("codeVersion");
      paramBundle = new Intent();
      paramBundle.setClass(paramContext, WebviewScanImageActivity.class);
      paramBundle.setFlags(603979776);
      paramBundle.putExtra("key_string_for_scan", str1);
      paramBundle.putExtra("key_string_for_url", str2);
      paramBundle.putExtra("key_codetype_for_scan", i);
      paramBundle.putExtra("key_codeversion_for_scan", j);
      paramContext.startActivity(paramBundle);
      parama.l(null);
      AppMethodBeat.o(6140);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.d
 * JD-Core Version:    0.6.2
 */