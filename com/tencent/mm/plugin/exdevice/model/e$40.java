package com.tencent.mm.plugin.exdevice.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ep;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class e$40
  implements h.a
{
  e$40(e parame)
  {
  }

  public final void a(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2)
  {
    AppMethodBeat.i(19199);
    ab.d("MicroMsg.exdevice.ExdeviceEventManager", "mac=%d, oldState=%d, newState=%d, errCode=%d, profileType=%d", new Object[] { Long.valueOf(paramLong1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(paramLong2) });
    e locale = this.lsq;
    String str1 = com.tencent.mm.plugin.exdevice.j.b.ie(paramLong1);
    LinkedList localLinkedList;
    synchronized (locale.lrw)
    {
      localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>(locale.lrw);
      ??? = localLinkedList.iterator();
      if (((Iterator)???).hasNext())
        ((e.b)((Iterator)???).next()).c(str1, paramInt2, paramLong2);
    }
    localLinkedList.clear();
    ??? = locale.lrx.values().iterator();
    while (((Iterator)???).hasNext())
      ((e.b)((Iterator)???).next()).c(str2, paramInt2, paramLong2);
    ??? = new ep();
    ((ep)???).cyg.mac = str2;
    ((ep)???).cyg.cxs = paramInt2;
    ((ep)???).cyg.cyd = paramLong2;
    a.xxA.a((com.tencent.mm.sdk.b.b)???, Looper.getMainLooper());
    AppMethodBeat.o(19199);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.e.40
 * JD-Core Version:    0.6.2
 */