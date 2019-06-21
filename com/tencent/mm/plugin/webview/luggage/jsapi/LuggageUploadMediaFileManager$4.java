package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class LuggageUploadMediaFileManager$4
  implements Runnable
{
  LuggageUploadMediaFileManager$4(LuggageUploadMediaFileManager paramLuggageUploadMediaFileManager, LuggageUploadMediaFileManager.UploadMediaFileTask paramUploadMediaFileTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6395);
    this.ukF.aBW();
    LuggageUploadMediaFileManager.b(this.ukE);
    if (this.ukF.success)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("serverId", bo.nullAsNil(this.ukF.cHr));
      localHashMap.put("mediaUrl", bo.nullAsNil(this.ukF.ukO));
      this.ukE.ukD.a(true, localHashMap);
      AppMethodBeat.o(6395);
    }
    while (true)
    {
      return;
      this.ukE.ukD.a(false, null);
      AppMethodBeat.o(6395);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager.4
 * JD-Core Version:    0.6.2
 */