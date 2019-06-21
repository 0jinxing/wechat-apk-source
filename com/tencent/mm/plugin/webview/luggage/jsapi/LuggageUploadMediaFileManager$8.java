package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.d.b;
import com.tencent.mm.plugin.webview.modeltools.g;

final class LuggageUploadMediaFileManager$8
  implements DialogInterface.OnCancelListener
{
  LuggageUploadMediaFileManager$8(d.b paramb, String paramString, LuggageUploadMediaFileManager.a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(6399);
    g.cYE().a(this.ukI);
    g.cYE();
    aj.yC(this.ukG);
    this.ukH.d(false, "", "");
    AppMethodBeat.o(6399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager.8
 * JD-Core Version:    0.6.2
 */