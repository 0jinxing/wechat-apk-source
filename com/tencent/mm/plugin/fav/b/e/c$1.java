package com.tencent.mm.plugin.fav.b.e;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.f;
import com.tencent.mm.plugin.fav.a.t;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class c$1
  implements Runnable
{
  c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5362);
    Object localObject = ((ae)g.M(ae.class)).getFavEditInfoStorage().buQ();
    if (localObject == null)
      AppMethodBeat.o(5362);
    while (true)
    {
      return;
      ab.i("MicroMsg.Fav.FavEditService", "infos size %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        localObject = c.x(localf.field_localId, localf.field_type);
        c.a locala = (c.a)this.mhe.mhd.get(localObject);
        if (locala == null)
        {
          ab.i("MicroMsg.Fav.FavEditService", "not match key %s", new Object[] { localObject });
          locala = new c.a((byte)0);
          locala.mgr = localf;
          locala.retryCount = 3;
          locala.time = SystemClock.elapsedRealtime();
          this.mhe.mhd.put(localObject, locala);
          c.a(locala, true);
        }
        else
        {
          ab.i("MicroMsg.Fav.FavEditService", "match key %s, check start", new Object[] { localObject });
          c.a(locala, false);
        }
      }
      AppMethodBeat.o(5362);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5363);
    String str = super.toString() + "|run";
    AppMethodBeat.o(5363);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.c.1
 * JD-Core Version:    0.6.2
 */