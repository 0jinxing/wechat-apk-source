package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class g$45
  implements e.a
{
  g$45(g paramg, String paramString, i parami)
  {
  }

  public final void BD(String paramString)
  {
    AppMethodBeat.i(9100);
    if (!bo.nullAsNil(paramString).equals(this.uHG))
      AppMethodBeat.o(9100);
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap(1);
      localHashMap.put("cardType", paramString);
      g.a(this.uHd, this.uHe, "scanLicence:fail", localHashMap);
      AppMethodBeat.o(9100);
    }
  }

  public final void a(String paramString, JSONObject paramJSONObject, Bitmap paramBitmap)
  {
    AppMethodBeat.i(9098);
    if (!bo.nullAsNil(paramString).equalsIgnoreCase(this.uHG))
    {
      ab.i("MicroMsg.MsgHandler", "msg.params.cardType = %s, callback type = %s, mismatch!!!", new Object[] { this.uHG, paramString });
      AppMethodBeat.o(9098);
    }
    while (true)
    {
      return;
      if (paramJSONObject == null)
      {
        ab.e("MicroMsg.MsgHandler", "doScanLicence, type = %s, callback onSuccess but result is null", new Object[] { paramString });
        BD(paramString);
        AppMethodBeat.o(9098);
      }
      else
      {
        paramBitmap = new HashMap(2);
        paramBitmap.put("cardType", paramString);
        paramBitmap.put("cardInfo", paramJSONObject);
        g.a(this.uHd, this.uHe, "scanLicence:ok", paramBitmap);
        AppMethodBeat.o(9098);
      }
    }
  }

  public final void aeT(String paramString)
  {
    AppMethodBeat.i(9099);
    if (!bo.nullAsNil(paramString).equals(this.uHG))
      AppMethodBeat.o(9099);
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap(1);
      localHashMap.put("cardType", paramString);
      g.a(this.uHd, this.uHe, "scanLicence:cancel", localHashMap);
      AppMethodBeat.o(9099);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.45
 * JD-Core Version:    0.6.2
 */