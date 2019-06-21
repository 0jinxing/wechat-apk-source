package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.al.f;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.vfs.e;
import java.util.concurrent.CountDownLatch;

final class ap$a$1
  implements com.tencent.mm.sdk.platformtools.ap.a
{
  ap$a$1(ap.a parama, String paramString, z.a parama1, a parama2, j paramj, CountDownLatch paramCountDownLatch)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(59483);
    f.afx().rO(this.gUo);
    this.gUp.avq();
    e.deleteFile(this.gUq.getFilePath());
    this.gUr.value = null;
    this.fuC.countDown();
    AppMethodBeat.o(59483);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ap.a.1
 * JD-Core Version:    0.6.2
 */