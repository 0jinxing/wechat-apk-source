package com.tencent.mm.plugin.topstory.ui.webview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.PluginTopStoryUI;
import com.tencent.mm.plugin.topstory.ui.home.d;
import com.tencent.mm.protocal.protobuf.bpw;
import com.tencent.mm.protocal.protobuf.cho;
import com.tencent.mm.protocal.protobuf.cve;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

final class c$4
  implements Runnable
{
  c$4(c paramc, cve paramcve, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2151);
    cho localcho = new cho();
    localcho.Category = this.sHC.xrh.Category;
    localcho.xgq = System.currentTimeMillis();
    localcho.wSb = this.sHC.xrh.wSb;
    localcho.xgr = this.sHC.xrh.wSc;
    localcho.ncM = this.icN;
    localcho.wSd = this.sHC.xrh.wSd;
    ((PluginTopStoryUI)com.tencent.mm.kernel.g.M(PluginTopStoryUI.class)).getWebViewMgr().sDg.put(Integer.valueOf(localcho.Category), localcho);
    try
    {
      byte[] arrayOfByte = localcho.toByteArray();
      Object localObject = new java/io/File;
      ((File)localObject).<init>(com.tencent.mm.plugin.topstory.a.g.cFn());
      if (!((File)localObject).exists())
        ((File)localObject).mkdirs();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      e.b(com.tencent.mm.plugin.topstory.a.g.cFn() + localcho.Category, arrayOfByte, arrayOfByte.length);
      ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "putHomeDataCache write data key: %d length: %d", new Object[] { Integer.valueOf(localcho.Category), Integer.valueOf(arrayOfByte.length) });
      ((PluginTopStoryUI)com.tencent.mm.kernel.g.M(PluginTopStoryUI.class)).getWebViewMgr().bp(localcho.Category, "");
      AppMethodBeat.o(2151);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", localIOException, "putHomeDataCache ", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.c.4
 * JD-Core Version:    0.6.2
 */