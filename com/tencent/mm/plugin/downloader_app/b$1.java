package com.tencent.mm.plugin.downloader_app;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.h.a;

final class b$1
  implements Runnable
{
  b$1(b paramb, Context paramContext, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136013);
    a.a(this.val$context, this.val$appId, null);
    AppMethodBeat.o(136013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.1
 * JD-Core Version:    0.6.2
 */