package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.plugin.webview.modeltools.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.util.HashMap;
import org.json.JSONObject;

final class g$4
  implements e.a
{
  g$4(g paramg, i parami)
  {
  }

  public final void BD(String paramString)
  {
    AppMethodBeat.i(9042);
    g.a(this.uHd, this.uHe, "chooseIdCard:fail", null);
    AppMethodBeat.o(9042);
  }

  public final void a(String paramString, JSONObject paramJSONObject, Bitmap paramBitmap)
  {
    AppMethodBeat.i(9040);
    if (paramBitmap == null)
    {
      g.a(this.uHd, this.uHe, "chooseIdCard:fail", null);
      AppMethodBeat.o(9040);
    }
    while (true)
    {
      return;
      try
      {
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        paramJSONObject = com.tencent.mm.compatible.util.e.eSj + "tmpScanLicense/";
        ab.d("MicroMsg.MsgHandler", "tmpSaveCardBitmapDir: %s", new Object[] { paramJSONObject });
        if (com.tencent.mm.vfs.e.ct(paramJSONObject))
          com.tencent.mm.vfs.e.N(paramJSONObject, true);
        com.tencent.mm.vfs.e.tf(paramJSONObject);
        com.tencent.mm.vfs.e.ate(paramJSONObject);
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        paramString = paramJSONObject + System.currentTimeMillis() + ".jpg";
        ab.d("MicroMsg.MsgHandler", "tmpSaveCardBitmapPath: %s", new Object[] { paramString });
        d.a(paramBitmap, 100, Bitmap.CompressFormat.JPEG, paramString, true);
        paramJSONObject = WebViewJSSDKFileItem.aeu(paramString);
        com.tencent.mm.plugin.webview.modeltools.g.cYF().b(paramJSONObject);
        paramString = new java/util/HashMap;
        paramString.<init>();
        paramString.put("sourceType", "scan");
        paramString.put("localId", paramJSONObject.czD);
        g.a(this.uHd, this.uHe, "chooseIdCard:ok", paramString);
        AppMethodBeat.o(9040);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.MsgHandler", "save scan license error: %s", new Object[] { paramString.getMessage() });
        g.a(this.uHd, this.uHe, "chooseIdCard:fail", null);
        AppMethodBeat.o(9040);
      }
    }
  }

  public final void aeT(String paramString)
  {
    AppMethodBeat.i(9041);
    g.a(this.uHd, this.uHe, "chooseIdCard:cancel", null);
    AppMethodBeat.o(9041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.4
 * JD-Core Version:    0.6.2
 */