package com.tencent.mm.plugin.gallery.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class l$2
  implements Runnable
{
  l$2(l paraml, String paramString, int paramInt, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21321);
    try
    {
      i locali = this.mOv.mOt;
      String str = this.mOw;
      int i = this.bVv;
      l.2.1 local1 = new com/tencent/mm/plugin/gallery/model/l$2$1;
      local1.<init>(this);
      locali.a(str, i, local1, this.gZh);
      AppMethodBeat.o(21321);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MediaQueryService", localSecurityException, "", new Object[0]);
        l.a(this.mOv, new LinkedList(), this.gZh);
        AppMethodBeat.o(21321);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(21322);
    String str = super.toString() + "|queryMediaInAlbums";
    AppMethodBeat.o(21322);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.l.2
 * JD-Core Version:    0.6.2
 */