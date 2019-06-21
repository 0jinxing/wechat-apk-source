package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class bb$1
  implements LuggageUploadMediaFileManager.b
{
  bb$1(bb parambb, a.a parama, LuggageUploadMediaFileManager paramLuggageUploadMediaFileManager)
  {
  }

  public final void a(boolean paramBoolean, HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(6387);
    ab.i("MicroMsg.JsApiUploadMediaFile", "sucess = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
      this.mUf.c("", paramHashMap);
    while (true)
    {
      paramHashMap = this.uky;
      paramHashMap.knn = null;
      paramHashMap.uiI = null;
      paramHashMap.mAppId = null;
      paramHashMap.ukB = null;
      paramHashMap.ukD = null;
      AppMethodBeat.o(6387);
      return;
      this.mUf.a("fail", null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.bb.1
 * JD-Core Version:    0.6.2
 */