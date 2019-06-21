package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class LuggageUploadMediaFileManager$UploadMediaFileTask$1
  implements LuggageUploadMediaFileManager.a
{
  LuggageUploadMediaFileManager$UploadMediaFileTask$1(LuggageUploadMediaFileManager.UploadMediaFileTask paramUploadMediaFileTask)
  {
  }

  public final void d(boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(6405);
    ab.i("MicroMsg.UploadMediaTask", "success = %b, mediaId = %s, mediaUrl = %s", new Object[] { Boolean.valueOf(paramBoolean), paramString1, paramString2 });
    this.ukP.success = paramBoolean;
    this.ukP.cHr = paramString1;
    this.ukP.ukO = paramString2;
    LuggageUploadMediaFileManager.UploadMediaFileTask.a(this.ukP);
    AppMethodBeat.o(6405);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager.UploadMediaFileTask.1
 * JD-Core Version:    0.6.2
 */