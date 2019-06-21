package com.tencent.mm.plugin.card.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.base.d;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.ak;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.s;
import com.tencent.mm.plugin.card.model.w;
import com.tencent.mm.protocal.protobuf.ok;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
  implements f
{
  public byte[] eMl;
  public List<ak> kaA;
  public List<ak> kaB;
  private s kaC;
  public List<WeakReference<d>> kaD;

  public b()
  {
    AppMethodBeat.i(87630);
    this.eMl = new byte[0];
    this.kaD = new ArrayList();
    this.kaA = am.baX().baU();
    this.kaB = new ArrayList();
    ab.i("MicroMsg.BatchGetCardMgr", "<init>, init pending list size = %d", new Object[] { Integer.valueOf(this.kaA.size()) });
    g.RO().eJo.a(559, this);
    AppMethodBeat.o(87630);
  }

  public static void baj()
  {
    AppMethodBeat.i(87636);
    int i = ((Integer)g.RP().Ry().get(ac.a.xKp, Integer.valueOf(1))).intValue();
    ab.i("MicroMsg.BatchGetCardMgr", "need do getCardsLayoutScene scene is ".concat(String.valueOf(i)));
    ad localad = new ad(am.bbc().ecs, am.bbc().ect, i);
    g.RO().eJo.a(localad, 0);
    AppMethodBeat.o(87636);
  }

  public static void sO(int paramInt)
  {
    AppMethodBeat.i(87635);
    w localw = new w(paramInt);
    g.RO().eJo.a(localw, 0);
    AppMethodBeat.o(87635);
  }

  public final void a(ok arg1)
  {
    AppMethodBeat.i(87632);
    if (??? == null)
    {
      ab.e("MicroMsg.BatchGetCardMgr", "push fail, CardUserItem is null");
      AppMethodBeat.o(87632);
    }
    while (true)
    {
      return;
      CardInfo localCardInfo = am.baW().Gu(???.vUK);
      Object localObject1 = ???.vUK;
      if (localCardInfo == null);
      for (long l = 0L; ; l = localCardInfo.field_updateSeq)
      {
        ab.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, cardUserId = %s, localSeq = %d, svrSeq = %d", new Object[] { localObject1, Long.valueOf(l), Long.valueOf(???.vUL) });
        if ((localCardInfo == null) || (localCardInfo.field_updateSeq != ???.vUL))
          break label131;
        ab.e("MicroMsg.BatchGetCardMgr", "push CardUserItem fail, card.field_updateSeq == item.UpdateSequence");
        AppMethodBeat.o(87632);
        break;
      }
      label131: localObject1 = ak.b(???);
      synchronized (this.eMl)
      {
        if (this.kaA.contains(localObject1))
        {
          AppMethodBeat.o(87632);
          continue;
        }
        if (this.kaB.contains(localObject1))
        {
          AppMethodBeat.o(87632);
          continue;
        }
        this.kaA.add(localObject1);
        ab.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, insertRet = %b", new Object[] { Boolean.valueOf(am.baX().b((com.tencent.mm.sdk.e.c)localObject1)) });
        AppMethodBeat.o(87632);
      }
    }
  }

  public final void bai()
  {
    AppMethodBeat.i(87633);
    if (this.kaA.size() == 0)
    {
      ab.i("MicroMsg.BatchGetCardMgr", "getNow, no pending cardinfo ,no need to get");
      AppMethodBeat.o(87633);
    }
    while (true)
    {
      return;
      if (this.kaC == null)
        break;
      ab.i("MicroMsg.BatchGetCardMgr", "getNow, already doing scene, not trigger now");
      AppMethodBeat.o(87633);
    }
    LinkedList localLinkedList = new LinkedList();
    if (this.kaA.size() <= 10)
      localLinkedList.addAll(this.kaA);
    while (true)
    {
      this.kaC = new s(localLinkedList);
      g.RO().eJo.a(this.kaC, 0);
      AppMethodBeat.o(87633);
      break;
      localLinkedList.addAll(this.kaA.subList(0, 10));
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(87631);
    this.kaA.clear();
    this.kaB.clear();
    if (this.kaC != null)
      g.RO().eJo.c(this.kaC);
    g.RO().eJo.b(559, this);
    AppMethodBeat.o(87631);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m arg4)
  {
    int i = 0;
    AppMethodBeat.i(87634);
    ab.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.kaC = null;
    paramString = ((s)???).kdY;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.BatchGetCardMgr", "onSceneEnd fail, stop batch get, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      ??? = this.eMl;
      if (paramString == null);
    }
    while (true)
    {
      try
      {
        if (paramString.size() > 0)
        {
          this.kaA.removeAll(paramString);
          this.kaB.addAll(paramString);
        }
        ??? = am.baX();
        if ((paramString == null) || (paramString.size() == 0))
        {
          ab.e("MicroMsg.PendingCardIdInfoStorage", "increaseRetryCount fail, list is empty");
          AppMethodBeat.o(87634);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(87634);
      }
      Object localObject = paramString.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramString = (ak)((Iterator)localObject).next();
        if (paramString != null)
        {
          paramString.field_retryCount += 1;
          ???.c(paramString, new String[0]);
        }
      }
      AppMethodBeat.o(87634);
      continue;
      if (paramString == null)
      {
        paramInt1 = 0;
        ab.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, batch get succ, remove succ id list, size = %d", new Object[] { Integer.valueOf(paramInt1) });
        if (paramString == null);
      }
      while (true)
      {
        synchronized (this.eMl)
        {
          this.kaA.removeAll(paramString);
          long l1 = System.currentTimeMillis();
          long l2 = g.RP().eJN.iV(Thread.currentThread().getId());
          ??? = am.baX();
          if ((paramString == null) || (paramString.size() == 0))
          {
            ab.e("MicroMsg.PendingCardIdInfoStorage", "deleteList fail, list is empty");
            g.RP().eJN.mB(l2);
            ab.i("MicroMsg.BatchGetCardMgr", "onSceneEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
            bai();
            if (this.kaD == null)
              break;
            paramInt1 = i;
            if (paramInt1 >= this.kaD.size())
              break;
            paramString = (WeakReference)this.kaD.get(paramInt1);
            if (paramString != null)
            {
              paramString = (d)paramString.get();
              if (paramString != null)
                paramString.bag();
            }
            paramInt1++;
            continue;
            paramInt1 = paramString.size();
          }
        }
        paramString = paramString.iterator();
        while (paramString.hasNext())
        {
          localObject = (ak)paramString.next();
          if (localObject != null)
            ???.a((com.tencent.mm.sdk.e.c)localObject, new String[0]);
        }
      }
      AppMethodBeat.o(87634);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.b
 * JD-Core Version:    0.6.2
 */