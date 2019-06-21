package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class i<CONTEXT extends c> extends a<CONTEXT>
{
  public static final int CTRL_INDEX = 168;
  public static final String NAME = "setClipboardData";

  public final void a(CONTEXT paramCONTEXT, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126418);
    String str = paramJSONObject.optString("data");
    if (bo.isNullOrNil(str))
    {
      paramCONTEXT.M(paramInt, j("fail", null));
      AppMethodBeat.o(126418);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.JsApiSetClipboardData", "stevyang dataStr %s", new Object[] { str });
      paramJSONObject = (ClipboardManager)paramCONTEXT.getContext().getSystemService("clipboard");
      if (paramJSONObject == null)
      {
        ab.i("MicroMsg.JsApiSetClipboardData", "getSystemService(CLIPBOARD_SERVICE) failed.");
        paramCONTEXT.M(paramInt, j("fail", null));
        AppMethodBeat.o(126418);
      }
      else
      {
        paramJSONObject.setPrimaryClip(ClipData.newPlainText("text", str));
        paramCONTEXT.M(paramInt, j("ok", null));
        c(paramCONTEXT, str);
        AppMethodBeat.o(126418);
      }
    }
  }

  public void c(CONTEXT paramCONTEXT, String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.i
 * JD-Core Version:    0.6.2
 */