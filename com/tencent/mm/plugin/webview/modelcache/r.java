package com.tencent.mm.plugin.webview.modelcache;

import android.os.HandlerThread;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Iterator;
import java.util.Set;

public final class r
{
  private volatile al ftB;
  private final Object iRa;
  public final c uoc;
  public final c uod;
  private volatile j uoe;
  final SparseArray<m> uof;
  public final d uog;
  final f uoh;
  public final byte[] uoi;
  public final SparseArray<Set<Object>> uoj;

  private r()
  {
    AppMethodBeat.i(6886);
    this.uoc = new r.1(this);
    this.uod = new r.2(this);
    this.uof = new SparseArray();
    this.uog = new d();
    this.uoh = new f();
    this.iRa = new Object();
    this.uoi = new byte[0];
    this.uoj = new SparseArray();
    AppMethodBeat.o(6886);
  }

  private void IQ(int paramInt)
  {
    AppMethodBeat.i(6890);
    synchronized (this.uoi)
    {
      Object localObject2 = (Set)this.uoj.get(paramInt);
      if ((localObject2 != null) && (((Set)localObject2).size() > 0))
      {
        ??? = ((Set)localObject2).iterator();
        if (((Iterator)???).hasNext())
        {
          ((Iterator)???).next();
          if (this.uoe == null)
            this.uoe = new j();
          localObject2 = this.uoe;
        }
      }
    }
    AppMethodBeat.o(6890);
  }

  public final void IP(int paramInt)
  {
    AppMethodBeat.i(6889);
    if (g.RK());
    while (true)
    {
      try
      {
        r.a.cYq().uoh.IM(paramInt);
        IQ(paramInt);
        AppMethodBeat.o(6889);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.WebViewCacheWorkerManager", "onWebViewUIDestroy, accHasReady, but occurred exception = %s", new Object[] { localException });
      }
      AppMethodBeat.o(6889);
    }
  }

  public final al aNS()
  {
    AppMethodBeat.i(6888);
    if (this.ftB == null);
    synchronized (this.iRa)
    {
      if (this.ftB == null)
      {
        r.3 local3 = new com/tencent/mm/plugin/webview/modelcache/r$3;
        local3.<init>(this, "WebViewCacheWorkerManager#WorkerThread");
        this.ftB = local3;
      }
      ??? = this.ftB;
      AppMethodBeat.o(6888);
      return ???;
    }
  }

  public final void release(boolean paramBoolean)
  {
    AppMethodBeat.i(6887);
    for (int i = 0; i < this.uof.size(); i++)
      this.uof.valueAt(i);
    this.uof.clear();
    a.clearCache();
    if (this.ftB != null);
    while (true)
    {
      synchronized (this.iRa)
      {
        if (this.ftB == null)
        {
          AppMethodBeat.o(6887);
          return;
        }
        if (paramBoolean)
        {
          this.ftB.oAl.quit();
          AppMethodBeat.o(6887);
          continue;
        }
        al localal1 = this.ftB;
        al localal2 = this.ftB;
        r.4 local4 = new com/tencent/mm/plugin/webview/modelcache/r$4;
        local4.<init>(this, localal1);
        localal2.aa(local4);
        this.ftB = null;
        AppMethodBeat.o(6887);
      }
      AppMethodBeat.o(6887);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.r
 * JD-Core Version:    0.6.2
 */