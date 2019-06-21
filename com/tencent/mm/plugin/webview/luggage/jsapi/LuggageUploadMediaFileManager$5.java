package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.d.b;
import com.tencent.mm.plugin.webview.modeltools.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class LuggageUploadMediaFileManager$5
  implements d.b
{
  LuggageUploadMediaFileManager$5(String paramString, LuggageUploadMediaFileManager.a parama)
  {
  }

  public final void b(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(6396);
    ab.i("MicroMsg.UploadMediaFileHelp", " on cdn finish,  is success : %s, mediaid : %s, local id is : %s, mediaUrl : %s", new Object[] { Boolean.valueOf(paramBoolean), paramString2, paramString1, paramString3 });
    if ((!bo.isNullOrNil(paramString1)) && (paramString1.equals(this.ukG)))
    {
      g.cYE().a(this);
      if (LuggageUploadMediaFileManager.cXr() != null)
      {
        LuggageUploadMediaFileManager.cXr().dismiss();
        LuggageUploadMediaFileManager.cXs();
      }
      this.ukH.d(paramBoolean, paramString2, paramString3);
    }
    AppMethodBeat.o(6396);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager.5
 * JD-Core Version:    0.6.2
 */