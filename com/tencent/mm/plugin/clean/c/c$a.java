package com.tencent.mm.plugin.clean.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class c$a extends com.tencent.mm.plugin.clean.c.a.a
{
  private String username;

  public c$a(c paramc, String paramString)
  {
    super(paramc);
    this.username = paramString;
  }

  private int a(Cursor paramCursor, b paramb)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(18671);
    if (!paramCursor.moveToFirst())
    {
      ab.d("MicroMsg.CleanController", "Message count of user:%s is empty", new Object[] { this.username });
      paramCursor.close();
      AppMethodBeat.o(18671);
      return j;
    }
    Object localObject1 = null;
    label56: j = i;
    int k;
    Object localObject2;
    if (!paramCursor.isAfterLast())
    {
      k = i + 1;
      localObject2 = new bi();
      ((bi)localObject2).d(paramCursor);
      switch (l.Kx(((bi)localObject2).getType()))
      {
      default:
      case 49:
      case 3:
      case 43:
      case 44:
      case 62:
      }
    }
    while (true)
    {
      localObject2 = localObject1;
      if (localObject1 != null)
      {
        paramb.kwf.add(localObject1);
        paramb.jrb += ((a)localObject1).size;
        localObject2 = null;
      }
      j = k;
      if (paramCursor.moveToNext())
      {
        localObject1 = localObject2;
        i = k;
        if (!c.i(this.kwt))
          break label56;
        j = k;
      }
      paramCursor.close();
      AppMethodBeat.o(18671);
      break;
      localObject1 = c.a((bi)localObject2, this.username);
      continue;
      localObject1 = c.b((bi)localObject2, this.username);
      continue;
      localObject1 = c.c((bi)localObject2, this.username);
    }
  }

  public final String alb()
  {
    AppMethodBeat.i(18669);
    String str = "username[" + this.username + "]" + super.alb();
    AppMethodBeat.o(18669);
    return str;
  }

  public final void execute()
  {
    AppMethodBeat.i(18670);
    aw.ZK();
    int i = com.tencent.mm.model.c.XO().Rq(this.username);
    if (i <= 0)
    {
      ab.i("MicroMsg.CleanController", "Finish user:%s allMsgCount[%d]", new Object[] { this.username, Integer.valueOf(i) });
      AppMethodBeat.o(18670);
    }
    while (true)
    {
      return;
      b localb = new b();
      localb.username = this.username;
      localb.kwf = new ArrayList();
      localb.jrb = 0L;
      Object localObject1 = null;
      int j = 0;
      label96: int k = j;
      Object localObject3 = localObject1;
      Object localObject4;
      if (j < i)
      {
        k = j;
        localObject4 = localObject1;
        localObject3 = localObject1;
      }
      try
      {
        aw.ZK();
        k = j;
        localObject4 = localObject1;
        localObject3 = localObject1;
        Cursor localCursor = com.tencent.mm.model.c.XO().ab(this.username, j, 50);
        k = j;
        localObject3 = localCursor;
        if (localCursor != null)
        {
          k = j;
          localObject4 = localCursor;
          localObject3 = localCursor;
          int m = a(localCursor, localb);
          if (localCursor != null)
          {
            k = j;
            localObject4 = localCursor;
            localObject3 = localCursor;
            if (!localCursor.isClosed())
            {
              k = j;
              localObject4 = localCursor;
              localObject3 = localCursor;
              localCursor.close();
            }
          }
          k = j;
          localObject3 = localCursor;
          if (m > 0)
          {
            m = j + m;
            k = m;
            localObject4 = localCursor;
            localObject3 = localCursor;
            boolean bool = c.i(this.kwt);
            j = m;
            localObject1 = localCursor;
            if (!bool)
              break label96;
            localObject3 = localCursor;
            k = m;
          }
        }
        j = k;
        if (localObject3 != null)
        {
          localObject3.close();
          j = k;
        }
        if (localb.kwf.size() > 0)
          c.j(this.kwt).put(this.username, localb);
        ab.i("MicroMsg.CleanController", "Finish user:%s allMsgCount[%d] alreadyHandleCount[%d] isStop[%b] ", new Object[] { this.username, Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(c.i(this.kwt)) });
        AppMethodBeat.o(18670);
      }
      catch (Exception localException)
      {
        while (true)
        {
          localObject3 = localObject4;
          ab.printErrStackTrace("MicroMsg.CleanController", localException, "execute analyse Task error.", new Object[0]);
          j = k;
          if (localObject4 != null)
          {
            localObject4.close();
            j = k;
          }
        }
      }
      finally
      {
        if (localObject3 != null)
          localObject3.close();
        AppMethodBeat.o(18670);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.c.a
 * JD-Core Version:    0.6.2
 */