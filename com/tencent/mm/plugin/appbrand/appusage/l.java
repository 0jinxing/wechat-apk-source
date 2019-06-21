package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.arh;
import com.tencent.mm.protocal.protobuf.ari;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class l
{
  private static volatile l gZk;
  public final Set<l.b> gZl;
  public volatile ari gZm;
  public final Object mLock;

  public l()
  {
    AppMethodBeat.i(129566);
    this.mLock = new Object();
    this.gZl = new HashSet();
    this.gZm = null;
    AppMethodBeat.o(129566);
  }

  public static l axj()
  {
    AppMethodBeat.i(129567);
    if (gZk == null);
    try
    {
      if (gZk == null)
      {
        locall = new com/tencent/mm/plugin/appbrand/appusage/l;
        locall.<init>();
        gZk = locall;
      }
      l locall = gZk;
      AppMethodBeat.o(129567);
      return locall;
    }
    finally
    {
      AppMethodBeat.o(129567);
    }
  }

  public static boolean enabled()
  {
    AppMethodBeat.i(129569);
    boolean bool;
    if (g.RK())
    {
      Object localObject = com.tencent.mm.model.c.c.abi().ll("100328");
      if (((com.tencent.mm.storage.c)localObject).isValid())
      {
        localObject = l.a.ny(bo.getInt((String)((com.tencent.mm.storage.c)localObject).dru().get("isOpenGameEntry"), 0));
        if ((localObject != null) && (localObject == l.a.gZp))
        {
          bool = true;
          AppMethodBeat.o(129569);
        }
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(129569);
      bool = false;
    }
  }

  public final void refresh()
  {
    AppMethodBeat.i(129568);
    this.gZm = null;
    b.a locala = new b.a();
    locala.fsI = 1841;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxagame";
    locala.fsJ = new arh();
    locala.fsK = new ari();
    w.a(locala.acD(), new l.1(this));
    AppMethodBeat.o(129568);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.l
 * JD-Core Version:    0.6.2
 */