package com.tencent.mm.plugin.notification;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aq;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.t;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.bq.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements t
{
  private static List<aq> oVx;
  private List<bi> oVA;
  private boolean oVy;
  private boolean oVz;

  static
  {
    AppMethodBeat.i(125807);
    oVx = new ArrayList();
    AppMethodBeat.o(125807);
  }

  public d()
  {
    this(false);
  }

  public d(boolean paramBoolean)
  {
    AppMethodBeat.i(125803);
    this.oVy = false;
    this.oVz = false;
    this.oVA = new LinkedList();
    this.oVy = paramBoolean;
    this.oVz = false;
    this.oVA = new LinkedList();
    AppMethodBeat.o(125803);
  }

  public static void a(aq paramaq)
  {
    AppMethodBeat.i(125801);
    synchronized (oVx)
    {
      if (!oVx.contains(paramaq))
        oVx.add(paramaq);
      AppMethodBeat.o(125801);
      return;
    }
  }

  public static void b(aq paramaq)
  {
    AppMethodBeat.i(125802);
    synchronized (oVx)
    {
      oVx.remove(paramaq);
      AppMethodBeat.o(125802);
      return;
    }
  }

  public final void a(bi parambi, cm paramcm)
  {
    AppMethodBeat.i(125805);
    if (this.oVy)
    {
      ab.i("MicroMsg.SyncMessageNotifier", "mDummy is true, do nothing and return.");
      AppMethodBeat.o(125805);
    }
    while (true)
    {
      return;
      synchronized (oVx)
      {
        if (oVx.isEmpty())
        {
          ab.i("MicroMsg.SyncMessageNotifier", "no notifiers, ignore");
          AppMethodBeat.o(125805);
          continue;
        }
        if ((parambi.field_isSend != 0) || (parambi.field_status == 4))
        {
          ab.i("MicroMsg.SyncMessageNotifier", "not new msg, ignore");
          AppMethodBeat.o(125805);
        }
      }
      ??? = aa.a(paramcm.vEB);
      ??? = ((j)g.K(j.class)).XU().RA(new bq.a((String)???).apT(""));
      if ((??? != null) && (!((bq)???).dum()))
      {
        ab.d("MicroMsg.SyncMessageNotifier", "account no notification");
        AppMethodBeat.o(125805);
      }
      else if (!this.oVz)
      {
        this.oVz = true;
        Object localObject2 = new ArrayList();
        synchronized (oVx)
        {
          Iterator localIterator = oVx.iterator();
          if (localIterator.hasNext())
            ((List)localObject2).add((aq)localIterator.next());
        }
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ??? = (aq)((Iterator)localObject2).next();
          new ak(((aq)???).getLooper()).post(new d.2(this, paramcm, (aq)???, parambi));
        }
        AppMethodBeat.o(125805);
      }
      else
      {
        this.oVA.add(parambi);
        AppMethodBeat.o(125805);
      }
    }
  }

  public final void bOs()
  {
    AppMethodBeat.i(125804);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.oVA);
    this.oVA.clear();
    if (localLinkedList.size() == 0)
      AppMethodBeat.o(125804);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      Object localObject2;
      synchronized (oVx)
      {
        localObject2 = oVx.iterator();
        if (((Iterator)localObject2).hasNext())
          localArrayList.add((aq)((Iterator)localObject2).next());
      }
      ??? = localArrayList.iterator();
      while (((Iterator)???).hasNext())
      {
        localObject2 = (aq)((Iterator)???).next();
        new ak(((aq)localObject2).getLooper()).post(new d.1(this, (aq)localObject2, localList));
      }
      AppMethodBeat.o(125804);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d
 * JD-Core Version:    0.6.2
 */