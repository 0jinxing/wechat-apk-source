package com.tencent.mm.plugin.downloader_app.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.plugin.downloader.c.a.a.b;
import java.util.LinkedList;

public final class g
{
  public static g.a kOX;
  static f kOY;

  public static void a(LinkedList<String> paramLinkedList, g.a parama)
  {
    AppMethodBeat.i(136143);
    b.a locala = new b.a();
    com.tencent.mm.plugin.downloader.c.a.a.a locala1 = new com.tencent.mm.plugin.downloader.c.a.a.a();
    locala1.kKk = paramLinkedList;
    locala1.kKm = true;
    locala.fsJ = locala1;
    locala.fsK = new b();
    locala.uri = "/cgi-bin/mmgame-bin/batchgetappdownloadinfo";
    locala.fsI = 7797;
    kOX = parama;
    w.a(locala.acD(), new g.1());
    AppMethodBeat.o(136143);
  }

  public static f biM()
  {
    AppMethodBeat.i(136142);
    if (kOY == null)
    {
      localObject = ((com.tencent.mm.plugin.game.commlib.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.commlib.a.a.class)).NK("pb_appinfo");
      if (localObject != null)
        kOY = new f((byte[])localObject);
    }
    Object localObject = kOY;
    AppMethodBeat.o(136142);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.g
 * JD-Core Version:    0.6.2
 */