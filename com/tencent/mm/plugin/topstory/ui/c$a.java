package com.tencent.mm.plugin.topstory.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.f.h;
import java.io.File;

final class c$a
  implements Runnable
{
  String sBr;

  public c$a(String paramString)
  {
    this.sBr = paramString;
  }

  public final void run()
  {
    AppMethodBeat.i(1532);
    File localFile = new File(com.tencent.mm.compatible.util.e.eSn + "topstory/trace.info");
    if ((localFile.exists()) && (localFile.length() > 2048L))
      localFile.delete();
    if (!localFile.getParentFile().exists())
      localFile.getParentFile().mkdirs();
    this.sBr = ("Trace:\n" + h.formatTime("yyyy-MM-dd HH:mm:ss", System.currentTimeMillis() / 1000L) + "\n" + this.sBr);
    com.tencent.mm.a.e.e(localFile.getAbsolutePath(), this.sBr.getBytes());
    AppMethodBeat.o(1532);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.c.a
 * JD-Core Version:    0.6.2
 */