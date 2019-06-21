package com.tencent.mm.pluginsdk.g.a.c;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public final class i
  implements c
{
  private final ak vfc;
  public final SparseArray<List<d>> vfd;
  public final Object vfe;

  i(ak paramak)
  {
    AppMethodBeat.i(79574);
    this.vfc = paramak;
    this.vfd = new SparseArray();
    this.vfe = new Object();
    AppMethodBeat.o(79574);
  }

  private List<d> aje(String arg1)
  {
    AppMethodBeat.i(79579);
    int i = ???.hashCode();
    synchronized (this.vfe)
    {
      List localList = (List)this.vfd.get(i);
      AppMethodBeat.o(79579);
      return localList;
    }
  }

  public final void a(e parame, m paramm)
  {
    AppMethodBeat.i(79575);
    ab.i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchResponse, response = ".concat(String.valueOf(paramm)));
    switch (paramm.status)
    {
    default:
    case 4:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(79575);
      while (true)
      {
        return;
        localObject = q.a.diy().ajg(paramm.vdC);
        if (localObject != null)
        {
          ((s)localObject).field_status = 4;
          q.a.diy().h((s)localObject);
        }
        localObject = aje(parame.awa());
        if (!bo.ek((List)localObject))
        {
          parame = parame.dib();
          this.vfc.post(new i.3(this, (List)localObject, paramm, parame));
        }
        AppMethodBeat.o(79575);
        continue;
        localObject = q.a.diy().ajg(paramm.vdC);
        if (localObject != null)
        {
          ((s)localObject).field_status = 2;
          q.a.diy().h((s)localObject);
        }
        ab.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, groupId = " + parame.awa());
        localObject = aje(parame.awa());
        if (bo.ek((List)localObject))
        {
          ab.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, listeners.size = null");
          AppMethodBeat.o(79575);
        }
        else
        {
          ab.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, listeners.size = " + ((List)localObject).size());
          parame = parame.dib();
          this.vfc.post(new i.2(this, (List)localObject, paramm, parame));
          AppMethodBeat.o(79575);
        }
      }
      Object localObject = q.a.diy().ajg(paramm.vdC);
      if (localObject != null)
      {
        ((s)localObject).field_status = 3;
        q.a.diy().h((s)localObject);
      }
      localObject = aje(parame.awa());
      if (!bo.ek((List)localObject))
      {
        parame = parame.dib();
        this.vfc.post(new i.1(this, (List)localObject, paramm, parame));
      }
    }
  }

  final void a(String paramString, d paramd)
  {
    AppMethodBeat.i(79578);
    ab.d("MicroMsg.ResDownloader.NetworkEventDispatcher", "addNetworkEventListener, listener = ".concat(String.valueOf(paramd)));
    if (paramd == null)
      AppMethodBeat.o(79578);
    while (true)
    {
      return;
      int i = paramString.hashCode();
      synchronized (this.vfe)
      {
        List localList = (List)this.vfd.get(i);
        paramString = localList;
        if (localList == null)
        {
          paramString = new java/util/LinkedList;
          paramString.<init>();
        }
        paramString.add(paramd);
        this.vfd.put(i, paramString);
        AppMethodBeat.o(79578);
      }
    }
  }

  public final void a(String paramString, k paramk)
  {
  }

  public final void u(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79576);
    ab.i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchRetry, urlKey = %s, max = %d, count = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramString = q.a.diy().ajg(paramString);
    if (paramString != null)
    {
      paramString.field_maxRetryTimes = paramInt1;
      paramString.field_retryTimes = paramInt2;
      q.a.diy().h(paramString);
    }
    AppMethodBeat.o(79576);
  }

  public final void w(String paramString, long paramLong)
  {
    AppMethodBeat.i(79577);
    paramString = q.a.diy().ajg(paramString);
    if (paramString != null)
    {
      paramString.field_contentLength = paramLong;
      q.a.diy().h(paramString);
    }
    AppMethodBeat.o(79577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.i
 * JD-Core Version:    0.6.2
 */