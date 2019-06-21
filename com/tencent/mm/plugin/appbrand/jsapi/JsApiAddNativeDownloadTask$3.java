package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class JsApiAddNativeDownloadTask$3
  implements Runnable
{
  JsApiAddNativeDownloadTask$3(JsApiAddNativeDownloadTask paramJsApiAddNativeDownloadTask, Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130377);
    Toast.makeText(this.val$context, this.val$context.getString(2131300252), 0).show();
    AppMethodBeat.o(130377);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask.3
 * JD-Core Version:    0.6.2
 */