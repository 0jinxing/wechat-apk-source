package com.tencent.mm.plugin.location.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class n extends com.tencent.mm.model.e
{
  private static double PP(String paramString)
  {
    double d = 0.0D;
    AppMethodBeat.i(113380);
    if (paramString == null)
      AppMethodBeat.o(113380);
    while (true)
    {
      return d;
      d = bo.getDouble(paramString, 0.0D);
      AppMethodBeat.o(113380);
    }
  }

  private static String cg(List<String> paramList)
  {
    AppMethodBeat.i(113381);
    List localList = l.bJy().bJF();
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    label168: label182: 
    while (true)
    {
      String str;
      if (paramList.hasNext())
      {
        str = (String)paramList.next();
        Iterator localIterator = localList.iterator();
        do
          if (!localIterator.hasNext())
            break;
        while (!((String)localIterator.next()).equals(str));
      }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label182;
        localLinkedList.add(str);
        break;
        if (localLinkedList.isEmpty())
        {
          AppMethodBeat.o(113381);
          paramList = null;
        }
        while (true)
        {
          return paramList;
          for (i = 0; ; i++)
          {
            if (i >= localLinkedList.size())
              break label168;
            paramList = (String)localLinkedList.get(i);
            if (!paramList.equals(r.Yz()))
            {
              AppMethodBeat.o(113381);
              break;
            }
          }
          AppMethodBeat.o(113381);
          paramList = null;
        }
      }
    }
  }

  private static String ch(List<String> paramList)
  {
    AppMethodBeat.i(113382);
    Object localObject = l.bJy().bJF();
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    label168: label182: 
    while (true)
    {
      String str;
      if (((Iterator)localObject).hasNext())
      {
        str = (String)((Iterator)localObject).next();
        Iterator localIterator = paramList.iterator();
        do
          if (!localIterator.hasNext())
            break;
        while (!((String)localIterator.next()).equals(str));
      }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label182;
        localLinkedList.add(str);
        break;
        if (localLinkedList.isEmpty())
        {
          AppMethodBeat.o(113382);
          paramList = null;
        }
        while (true)
        {
          return paramList;
          for (i = 0; ; i++)
          {
            if (i >= localLinkedList.size())
              break label168;
            paramList = (String)localLinkedList.get(i);
            if (!paramList.equals(r.Yz()))
            {
              AppMethodBeat.o(113382);
              break;
            }
          }
          AppMethodBeat.o(113382);
          paramList = null;
        }
      }
    }
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(113379);
    Object localObject1 = parama.eAB;
    if (localObject1 == null)
    {
      ab.e("MicroMsg.TrackMsgExtension", "onPreAddMessage cmdAM is null");
      AppMethodBeat.o(113379);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject2 = aa.a(((cm)localObject1).vEB);
    Object localObject3 = aa.a(((cm)localObject1).vEC);
    label79: Map localMap;
    Object localObject4;
    double d1;
    double d2;
    int i;
    if (((String)g.RP().Ry().get(2, null)).equals(localObject2))
    {
      parama = (e.a)localObject3;
      localObject1 = aa.a(((cm)localObject1).vED);
      ab.d("MicroMsg.TrackMsgExtension", "cmd ".concat(String.valueOf(localObject1)));
      localMap = br.z((String)localObject1, "sysmsg");
      if (localMap != null)
        try
        {
          localObject1 = new java/lang/StringBuffer;
          ((StringBuffer)localObject1).<init>();
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("talk  ");
          ((StringBuffer)localObject1).append(parama + "\r\n");
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("from fromUser ");
          ((StringBuffer)localObject1).append((String)localObject2 + "\r\n");
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("from toUser ");
          ((StringBuffer)localObject1).append((String)localObject3 + "\r\n");
          localObject4 = (String)localMap.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.addr");
          d1 = PP((String)localMap.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.latitude"));
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("lat ");
          ((StringBuffer)localObject1).append(d1 + "\r\n");
          d2 = PP((String)localMap.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.longitude"));
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("lng ");
          ((StringBuffer)localObject1).append(d2 + "\r\n");
          i = bo.getInt((String)localMap.get(".sysmsg.trackmsg.trackroominfo.timestamp"), 0);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("times ");
          ((StringBuffer)localObject1).append(i + "\r\n");
          i = 0;
          while (true)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>(".sysmsg.trackmsg.trackroominfo.trackmemberlist.member");
            if (i != 0)
              break;
            localObject3 = "";
            label403: localObject3 = localObject3;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject3 = (String)localMap.get((String)localObject3 + ".username");
            if (bo.isNullOrNil((String)localObject3))
              break label510;
            i++;
            localLinkedList.add(localObject3);
          }
        }
        catch (Exception parama)
        {
          ab.printErrStackTrace("MicroMsg.TrackMsgExtension", parama, "", new Object[0]);
        }
    }
    while (true)
    {
      AppMethodBeat.o(113379);
      break;
      parama = (e.a)localObject2;
      break label79;
      localObject3 = Integer.valueOf(i);
      break label403;
      label510: localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("userNameList size ");
      ((StringBuffer)localObject1).append(localLinkedList.size() + "\r\n");
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("xml : ");
      ab.i("MicroMsg.TrackMsgExtension", ((StringBuffer)localObject1).toString());
      localObject3 = null;
      localMap = null;
      localObject2 = localMap;
      if (parama.equals(l.bJy().nKN))
      {
        localObject1 = cg(localLinkedList);
        localObject3 = localObject1;
        localObject2 = localMap;
        if (bo.isNullOrNil((String)localObject1))
        {
          localObject2 = ch(localLinkedList);
          localObject3 = localObject1;
        }
      }
      l.bJz().a(parama, localLinkedList, d1, d2, (String)localObject4, (String)localObject3, (String)localObject2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.n
 * JD-Core Version:    0.6.2
 */