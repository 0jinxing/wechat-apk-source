package com.tencent.mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.plugin.webview.model.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  implements d.a
{
  public final void a(boolean paramBoolean, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(5972);
    ab.i("MicroMsg.CdnProgressCallback", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, paramString2 });
    if (paramBoolean)
      paramString2 = new JSONObject();
    while (true)
    {
      try
      {
        paramString2.put("localId", paramString1);
        paramString2.put("percent", paramInt2);
        paramString1 = new android/os/Bundle;
        paramString1.<init>();
        paramString1.putString("name", "onMediaFileUploadProgress");
        paramString1.putString("data", paramString2.toString());
        ToolsProcessIPCService.a(paramString1, com.tencent.mm.plugin.webview.luggage.a.a.class);
        AppMethodBeat.o(5972);
        return;
      }
      catch (JSONException paramString1)
      {
      }
      AppMethodBeat.o(5972);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.a
 * JD-Core Version:    0.6.2
 */