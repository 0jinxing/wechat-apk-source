package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.ipc.c;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.plugin.webview.modeltools.g;

public class LuggageUploadMediaFileManager$c
  implements c
{
  private LuggageUploadMediaFileManager.a ukK;
  private com.tencent.mm.plugin.webview.luggage.ipc.a ukL;

  public LuggageUploadMediaFileManager$c()
  {
    AppMethodBeat.i(6403);
    this.ukK = new LuggageUploadMediaFileManager.c.1(this);
    AppMethodBeat.o(6403);
  }

  public final void a(Context paramContext, Bundle paramBundle, com.tencent.mm.plugin.webview.luggage.ipc.a parama)
  {
    AppMethodBeat.i(6404);
    this.ukL = parama;
    String str1 = paramBundle.getString("local_id");
    String str2 = paramBundle.getString("app_id");
    boolean bool = paramBundle.getBoolean("show_progress_tips");
    paramBundle = g.cYF().aex(str1);
    if (paramBundle == null)
    {
      parama.l(null);
      AppMethodBeat.o(6404);
    }
    while (true)
    {
      return;
      switch (paramBundle.cyQ)
      {
      case 2:
      case 3:
      default:
        LuggageUploadMediaFileManager.a(paramContext, str2, str1, com.tencent.mm.i.a.efK, bool, this.ukK);
        AppMethodBeat.o(6404);
        break;
      case 1:
        LuggageUploadMediaFileManager.a(paramContext, paramBundle, str2, str1, com.tencent.mm.i.a.efJ, bool, this.ukK);
        AppMethodBeat.o(6404);
        break;
      case 4:
        LuggageUploadMediaFileManager.a(paramContext, str2, str1, com.tencent.mm.i.a.efK, bool, this.ukK);
        AppMethodBeat.o(6404);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager.c
 * JD-Core Version:    0.6.2
 */