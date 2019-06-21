package com.tencent.mm.plugin.webview.luggage;

import android.webkit.WebResourceResponse;
import com.tencent.luggage.webview.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public final class LuggageMMLocalResourceProvider
  implements c
{
  public final WebResourceResponse bG(String paramString)
  {
    AppMethodBeat.i(5987);
    PipedOutputStream localPipedOutputStream = new PipedOutputStream();
    try
    {
      PipedInputStream localPipedInputStream = new java/io/PipedInputStream;
      localPipedInputStream.<init>(localPipedOutputStream);
      LuggageMMLocalResourceProvider.GetLocalResourceInfoTask localGetLocalResourceInfoTask = new LuggageMMLocalResourceProvider.GetLocalResourceInfoTask((byte)0);
      localGetLocalResourceInfoTask.czD = paramString;
      localGetLocalResourceInfoTask.infoType = 1;
      localGetLocalResourceInfoTask.hyN = new LuggageMMLocalResourceProvider.1(this, localGetLocalResourceInfoTask, localPipedOutputStream);
      AppBrandMainProcessService.a(localGetLocalResourceInfoTask);
      paramString = new WebResourceResponse("image/*", "utf-8", localPipedInputStream);
      AppMethodBeat.o(5987);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(5987);
      }
    }
  }

  public final String yk()
  {
    return "weixin://resourceid/.*";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider
 * JD-Core Version:    0.6.2
 */