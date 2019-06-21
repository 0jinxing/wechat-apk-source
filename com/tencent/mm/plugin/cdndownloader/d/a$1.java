package com.tencent.mm.plugin.cdndownloader.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.cdndownloader.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Set;

final class a$1
  implements b
{
  a$1(a parama)
  {
  }

  public final void beX()
  {
    AppMethodBeat.i(889);
    ab.i("MicroMsg.CDNDownloadClient", "notify add");
    a.a(this.ktp);
    a.b(this.ktp);
    AppMethodBeat.o(889);
  }

  public final void clear()
  {
    AppMethodBeat.i(891);
    ab.i("MicroMsg.CDNDownloadClient", "notify clear");
    a.d(this.ktp);
    a.e(this.ktp);
    AppMethodBeat.o(891);
  }

  public final void remove()
  {
    AppMethodBeat.i(890);
    ab.i("MicroMsg.CDNDownloadClient", "notify remove");
    if (a.c(this.ktp).size() == 0)
    {
      a.d(this.ktp);
      a.e(this.ktp);
    }
    AppMethodBeat.o(890);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.d.a.1
 * JD-Core Version:    0.6.2
 */