package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.service.t.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class e$41 extends t.a
{
  e$41(e parame)
  {
  }

  public final void b(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(19200);
    ??? = paramString;
    if (paramString == null)
      ??? = "null";
    ab.d("MicroMsg.exdevice.ExdeviceEventManager", "onSendEnd. mac=%d, errType=%d, errCode=%d, errMsg=%s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), ??? });
    e locale = this.lsq;
    paramString = b.ie(paramLong);
    boolean bool;
    if (paramInt2 == 0)
      bool = true;
    LinkedList localLinkedList;
    while (true)
    {
      ab.d("MicroMsg.exdevice.ExdeviceEventManager", "notifySimpleBTOnSend, mac : %s, isSucc : %s", new Object[] { paramString, Boolean.valueOf(bool) });
      if (bool)
        break label251;
      synchronized (locale.lrw)
      {
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>(locale.lrw);
        ??? = localLinkedList.iterator();
        while (((Iterator)???).hasNext())
        {
          ((e.b)((Iterator)???).next()).b(paramString, null, false);
          continue;
          bool = false;
        }
      }
    }
    localLinkedList.clear();
    ??? = locale.lrx.values().iterator();
    while (((Iterator)???).hasNext())
      ((e.b)((Iterator)???).next()).b(paramString, null, false);
    label251: AppMethodBeat.o(19200);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.e.41
 * JD-Core Version:    0.6.2
 */