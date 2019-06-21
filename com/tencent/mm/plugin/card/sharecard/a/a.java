package com.tencent.mm.plugin.card.sharecard.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.base.d;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.sharecard.model.n;
import com.tencent.mm.plugin.card.sharecard.model.o;
import com.tencent.mm.protocal.protobuf.byy;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements f
{
  public byte[] eMl;
  public List<n> kaA;
  public List<n> kaB;
  private List<WeakReference<d>> kaD;
  public com.tencent.mm.plugin.card.sharecard.model.e kfo;
  private int kfp;
  public int kfq;
  public ak mHandler;
  private Runnable mRunnable;

  public a()
  {
    AppMethodBeat.i(87972);
    this.eMl = new byte[0];
    this.kaD = new ArrayList();
    this.kfp = 0;
    this.kfq = 5;
    this.mHandler = new ak(Looper.getMainLooper());
    this.mRunnable = new a.1(this);
    this.kaA = am.bbf().baU();
    this.kaB = new ArrayList();
    ab.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr <init>, init pending list size = %d", new Object[] { Integer.valueOf(this.kaA.size()) });
    g.RO().eJo.a(903, this);
    AppMethodBeat.o(87972);
  }

  private ArrayList<n> K(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(87976);
    ArrayList localArrayList = new ArrayList();
    LinkedList localLinkedList = new LinkedList();
    while (true)
    {
      int i;
      synchronized (this.eMl)
      {
        if (this.kaA.size() == 0)
        {
          ab.e("MicroMsg.ShareCardBatchGetCardMgr", "getSuccessShareCardSyncItem pendingList size is 0");
          AppMethodBeat.o(87976);
          return localArrayList;
        }
        localLinkedList.addAll(this.kaA);
        i = 0;
        if (i >= paramLinkedList.size())
          break label174;
        ??? = (String)paramLinkedList.get(i);
        int j = 0;
        if (j < localLinkedList.size())
        {
          if ((??? != null) && (localLinkedList.get(j) != null) && (((String)???).equals(((n)localLinkedList.get(j)).field_card_id)))
            localArrayList.add(localLinkedList.get(j));
          j++;
        }
      }
      i++;
      continue;
      label174: AppMethodBeat.o(87976);
    }
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(87979);
    if (this.kaD == null)
      this.kaD = new ArrayList();
    this.kaD.add(new WeakReference(paramd));
    AppMethodBeat.o(87979);
  }

  public final void a(byy arg1)
  {
    AppMethodBeat.i(87973);
    if (??? == null)
    {
      ab.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr push fail, ShareCardSyncItem is null");
      AppMethodBeat.o(87973);
    }
    while (true)
    {
      return;
      Object localObject1 = am.bbe().GK(???.cMC);
      String str = ???.cMC;
      if (localObject1 == null);
      for (long l = 0L; ; l = ((ShareCardInfo)localObject1).field_updateSeq)
      {
        ab.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr pushShareCardSyncItem, card_id = %s, localSeq = %d, svrSeq = %d", new Object[] { str, Long.valueOf(l), Long.valueOf(???.wYf) });
        if ((localObject1 == null) || (((ShareCardInfo)localObject1).field_updateSeq != ???.wYf))
          break label131;
        ab.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr push ShareCardSyncItem fail, card.field_updateSeq == item.seq");
        AppMethodBeat.o(87973);
        break;
      }
      label131: localObject1 = n.c(???);
      synchronized (this.eMl)
      {
        if (this.kaA.contains(localObject1))
        {
          AppMethodBeat.o(87973);
          continue;
        }
        if (this.kaB.contains(localObject1))
        {
          AppMethodBeat.o(87973);
          continue;
        }
        this.kaA.add(localObject1);
        ab.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr pushShareCardSyncItem, insertRet = %b", new Object[] { Boolean.valueOf(am.bbf().b((c)localObject1)) });
        AppMethodBeat.o(87973);
      }
    }
  }

  public final void aVU()
  {
    AppMethodBeat.i(87978);
    if (this.kaD == null)
      AppMethodBeat.o(87978);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (d)((WeakReference)localObject).get();
          if (localObject != null)
            ((d)localObject).bag();
        }
      }
      AppMethodBeat.o(87978);
    }
  }

  public final void b(d paramd)
  {
    AppMethodBeat.i(87980);
    if (this.kaD == null)
      AppMethodBeat.o(87980);
    while (true)
    {
      return;
      for (int i = 0; ; i++)
      {
        if (i >= this.kaD.size())
          break label99;
        WeakReference localWeakReference = (WeakReference)this.kaD.get(i);
        if (localWeakReference != null)
        {
          d locald = (d)localWeakReference.get();
          if ((locald != null) && (locald.equals(paramd)))
          {
            this.kaD.remove(localWeakReference);
            AppMethodBeat.o(87980);
            break;
          }
        }
      }
      label99: AppMethodBeat.o(87980);
    }
  }

  public final void bai()
  {
    AppMethodBeat.i(87974);
    LinkedList localLinkedList1 = new LinkedList();
    while (true)
    {
      synchronized (this.eMl)
      {
        if (this.kaA.size() == 0)
        {
          ab.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr getNow, no pending cardinfo ,no need to get");
          AppMethodBeat.o(87974);
          return;
        }
        localLinkedList1.addAll(this.kaA);
        if (this.kfo != null)
        {
          ab.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr getNow, already doing scene, not trigger now");
          AppMethodBeat.o(87974);
        }
      }
      ??? = new LinkedList();
      if (localCollection.size() <= 10)
        ((LinkedList)???).addAll(localCollection);
      LinkedList localLinkedList2;
      while (true)
      {
        localLinkedList2 = new LinkedList();
        for (int i = 0; i < ((LinkedList)???).size(); i++)
          localLinkedList2.add(((n)((LinkedList)???).get(i)).field_card_id);
        ((LinkedList)???).addAll(localLinkedList2.subList(0, 10));
      }
      this.kfo = new com.tencent.mm.plugin.card.sharecard.model.e(localLinkedList2);
      g.RO().eJo.a(this.kfo, 0);
      AppMethodBeat.o(87974);
    }
  }

  public final void bbr()
  {
    AppMethodBeat.i(87977);
    ab.i("MicroMsg.ShareCardBatchGetCardMgr", "doShareCardSyncNetScene");
    int i = (int)(System.currentTimeMillis() / 1000L);
    int j = i - this.kfp;
    int k;
    if (this.kfq <= 0)
    {
      k = 5;
      if (j < k)
        break label86;
      com.tencent.mm.plugin.card.sharecard.model.h localh = new com.tencent.mm.plugin.card.sharecard.model.h();
      g.RO().eJo.a(localh, 0);
    }
    while (true)
    {
      this.kfp = i;
      AppMethodBeat.o(87977);
      return;
      k = this.kfq;
      break;
      label86: ab.i("MicroMsg.ShareCardBatchGetCardMgr", "sync interval is ".concat(String.valueOf(j)));
      this.mHandler.removeCallbacks(this.mRunnable);
      this.mHandler.postDelayed(this.mRunnable, k * 1000);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String arg3, m paramm)
  {
    AppMethodBeat.i(87975);
    ab.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.kfo = null;
    Iterator localIterator;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd fail, stop batch get, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramm = K(((com.tencent.mm.plugin.card.sharecard.model.e)paramm).kdX);
      while (true)
      {
        synchronized (this.eMl)
        {
          if (paramm.size() > 0)
          {
            this.kaA.removeAll(paramm);
            this.kaB.addAll(paramm);
          }
          ??? = am.bbf();
          if (paramm.size() == 0)
          {
            ab.e("MicroMsg.ShareCardSyncItemInfoStorage", "increaseRetryCount fail, share card list is empty");
            AppMethodBeat.o(87975);
            return;
          }
        }
        localIterator = paramm.iterator();
        while (localIterator.hasNext())
        {
          paramm = (n)localIterator.next();
          if (paramm != null)
          {
            paramm.field_retryCount += 1;
            ???.c(paramm, new String[0]);
          }
        }
        AppMethodBeat.o(87975);
      }
    }
    paramm = K(((com.tencent.mm.plugin.card.sharecard.model.e)paramm).kdY);
    ab.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, batch get succ, remove succ id list, size = %d", new Object[] { Integer.valueOf(paramm.size()) });
    while (true)
    {
      synchronized (this.eMl)
      {
        this.kaA.removeAll(paramm);
        long l1 = System.currentTimeMillis();
        long l2 = g.RP().eJN.iV(Thread.currentThread().getId());
        ??? = am.bbf();
        if (paramm.size() == 0)
        {
          ab.e("MicroMsg.ShareCardSyncItemInfoStorage", "deleteList fail, share card list is empty");
          g.RP().eJN.mB(l2);
          ab.i("MicroMsg.ShareCardBatchGetCardMgr", "onSceneEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          bai();
          aVU();
          AppMethodBeat.o(87975);
        }
      }
      localIterator = paramm.iterator();
      while (localIterator.hasNext())
      {
        paramm = (n)localIterator.next();
        if (paramm != null)
          ???.a(paramm, new String[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.a.a
 * JD-Core Version:    0.6.2
 */