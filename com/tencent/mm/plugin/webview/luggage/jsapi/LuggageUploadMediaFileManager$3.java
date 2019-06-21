package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.ipc.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class LuggageUploadMediaFileManager$3
  implements a
{
  LuggageUploadMediaFileManager$3(LuggageUploadMediaFileManager paramLuggageUploadMediaFileManager)
  {
  }

  public final void l(Bundle paramBundle)
  {
    AppMethodBeat.i(6394);
    if (paramBundle != null)
    {
      HashMap localHashMap = new HashMap();
      String str = paramBundle.getString("media_id");
      paramBundle = paramBundle.getString("media_url");
      localHashMap.put("serverId", bo.nullAsNil(str));
      localHashMap.put("mediaUrl", bo.nullAsNil(paramBundle));
      this.ukE.ukD.a(true, localHashMap);
      AppMethodBeat.o(6394);
    }
    while (true)
    {
      return;
      this.ukE.ukD.a(false, null);
      AppMethodBeat.o(6394);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager.3
 * JD-Core Version:    0.6.2
 */