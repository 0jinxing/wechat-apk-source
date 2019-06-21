package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuggageUploadMediaFileManager$9$1
  implements DialogInterface.OnClickListener
{
  LuggageUploadMediaFileManager$9$1(LuggageUploadMediaFileManager.9 param9)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(6400);
    LuggageUploadMediaFileManager.cXr().cancel();
    AppMethodBeat.o(6400);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager.9.1
 * JD-Core Version:    0.6.2
 */