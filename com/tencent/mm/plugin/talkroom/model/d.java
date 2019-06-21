package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.n.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cgm;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class d
  implements com.tencent.mm.ai.e
{
  private static int abu(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(25775);
    int j = i;
    if (!bo.isNullOrNil(paramString));
    try
    {
      j = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(25775);
      return j;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomExtension", paramString, "", new Object[0]);
        j = i;
      }
    }
  }

  private static String cg(List<cgm> paramList)
  {
    AppMethodBeat.i(25776);
    List localList = b.cEh().bJF();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    label180: label195: 
    while (true)
    {
      cgm localcgm;
      if (localIterator.hasNext())
      {
        localcgm = (cgm)localIterator.next();
        paramList = localList.iterator();
        do
          if (!paramList.hasNext())
            break;
        while (!((cgm)paramList.next()).jBB.equals(localcgm.jBB));
      }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label195;
        localLinkedList.add(localcgm.jBB);
        break;
        if (localLinkedList.isEmpty())
        {
          AppMethodBeat.o(25776);
          paramList = null;
        }
        while (true)
        {
          return paramList;
          for (i = 0; ; i++)
          {
            if (i >= localLinkedList.size())
              break label180;
            paramList = (String)localLinkedList.get(i);
            if (!paramList.equals(r.Yz()))
            {
              AppMethodBeat.o(25776);
              break;
            }
          }
          AppMethodBeat.o(25776);
          paramList = null;
        }
      }
    }
  }

  private static String ch(List<cgm> paramList)
  {
    AppMethodBeat.i(25777);
    Object localObject = b.cEh().bJF();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = ((List)localObject).iterator();
    label180: label195: 
    while (true)
    {
      cgm localcgm;
      if (localIterator.hasNext())
      {
        localcgm = (cgm)localIterator.next();
        localObject = paramList.iterator();
        do
          if (!((Iterator)localObject).hasNext())
            break;
        while (!((cgm)((Iterator)localObject).next()).jBB.equals(localcgm.jBB));
      }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label195;
        localLinkedList.add(localcgm.jBB);
        break;
        if (localLinkedList.isEmpty())
        {
          AppMethodBeat.o(25777);
          paramList = null;
        }
        while (true)
        {
          return paramList;
          for (i = 0; ; i++)
          {
            if (i >= localLinkedList.size())
              break label180;
            paramList = (String)localLinkedList.get(i);
            if (!paramList.equals(r.Yz()))
            {
              AppMethodBeat.o(25777);
              break;
            }
          }
          AppMethodBeat.o(25777);
          paramList = null;
        }
      }
    }
  }

  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    int i = 1;
    AppMethodBeat.i(25774);
    Object localObject1 = parama.eAB;
    if (localObject1 == null)
    {
      ab.e("MicroMsg.TalkRoomExtension", "onPreAddMessage cmdAM is null");
      AppMethodBeat.o(25774);
    }
    while (true)
    {
      return null;
      if (((cm)localObject1).nao == 56)
        break;
      ab.e("MicroMsg.TalkRoomExtension", "onPreAddMessage cmdAM.type:%d", new Object[] { Integer.valueOf(((cm)localObject1).nao) });
      AppMethodBeat.o(25774);
    }
    parama = aa.a(((cm)localObject1).vEB);
    Object localObject2 = aa.a(((cm)localObject1).vEC);
    aw.ZK();
    if (((String)c.Ry().get(2, null)).equals(parama))
    {
      label110: aw.ZK();
      parama = c.XM().aoO((String)localObject2);
      if ((parama == null) || ((int)parama.ewQ == 0))
      {
        aw.ZK();
        c.XM().Z(new ad((String)localObject2));
      }
      parama = aa.a(((cm)localObject1).vED);
      ab.d("MicroMsg.TalkRoomExtension", "talkroom xml:".concat(String.valueOf(parama)));
      localObject1 = br.z(parama, "talkroominfo");
      if (localObject1 == null)
        break label509;
    }
    while (true)
    {
      try
      {
        if (abu((String)((Map)localObject1).get(".talkroominfo.tracksysmsgtype")) != 0)
          break label530;
        abu((String)((Map)localObject1).get(".talkroominfo.sysmsgtype"));
        j = 1;
        LinkedList localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        abu((String)((Map)localObject1).get(".talkroominfo.membersize"));
        int k = 0;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(".talkroominfo.memberlist.member");
        if (k == 0)
        {
          parama = "";
          localObject3 = parama;
          parama = new java/lang/StringBuilder;
          parama.<init>();
          parama = (String)((Map)localObject1).get((String)localObject3 + ".username");
          if (bo.isNullOrNil(parama))
            continue;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          int m = abu((String)((Map)localObject1).get((String)localObject3 + ".memberid"));
          localObject3 = new com/tencent/mm/protocal/protobuf/cgm;
          ((cgm)localObject3).<init>();
          ((cgm)localObject3).jBB = parama;
          ((cgm)localObject3).xft = m;
          localLinkedList.add(localObject3);
          k++;
          continue;
          localObject2 = parama;
          break label110;
        }
        parama = Integer.valueOf(k);
        continue;
        if (!((String)localObject2).equals(b.cEh().syD))
          break label523;
        localObject1 = cg(localLinkedList);
        if (!bo.isNullOrNil((String)localObject1))
          break label518;
        parama = ch(localLinkedList);
        localObject3 = b.cEi();
        k = i;
        if (j != 0)
          k = 0;
        ((e)localObject3).a((String)localObject2, localLinkedList, (String)localObject1, parama, k);
        AppMethodBeat.o(25774);
      }
      catch (Exception parama)
      {
        ab.e("MicroMsg.TalkRoomExtension", "parsing memList xml failed");
        ab.printErrStackTrace("MicroMsg.TalkRoomExtension", parama, "", new Object[0]);
      }
      label509: AppMethodBeat.o(25774);
      break;
      label518: parama = null;
      continue;
      label523: parama = null;
      localObject1 = null;
      continue;
      label530: int j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.d
 * JD-Core Version:    0.6.2
 */