package com.tencent.mm.plugin.brandservice.ui.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.o;
import com.tencent.mm.aw.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b.l;
import com.tencent.mm.protocal.protobuf.jy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.q;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
{
  private static Map<Long, Integer> jZe;

  static
  {
    AppMethodBeat.i(14458);
    jZe = new HashMap();
    AppMethodBeat.o(14458);
  }

  public static void aX(List<q> paramList)
  {
    AppMethodBeat.i(14456);
    com.tencent.mm.plugin.brandservice.b.a("BrandServiceWorkerThread", new c.2(paramList), 0L);
    AppMethodBeat.o(14456);
  }

  public static String aYR()
  {
    AppMethodBeat.i(14452);
    Object localObject1 = null;
    e locale = com.tencent.mm.aw.a.aih();
    Object localObject2 = localObject1;
    if (locale != null)
    {
      localObject2 = localObject1;
      if (locale.fJU != null)
      {
        localObject2 = localObject1;
        if (locale.fJS == 0)
        {
          localObject2 = localObject1;
          if (com.tencent.mm.aw.a.aie())
            localObject2 = locale.fJU;
        }
      }
    }
    AppMethodBeat.o(14452);
    return localObject2;
  }

  public static boolean b(com.tencent.mm.bt.a parama1, com.tencent.mm.bt.a parama2)
  {
    boolean bool = true;
    AppMethodBeat.i(14457);
    if ((parama1 == null) && (parama2 == null))
      AppMethodBeat.o(14457);
    while (true)
    {
      return bool;
      if ((parama1 == null) || (parama2 == null))
      {
        AppMethodBeat.o(14457);
        bool = false;
      }
      else
      {
        try
        {
          bool = bo.isEqual(parama1.toByteArray(), parama2.toByteArray());
          AppMethodBeat.o(14457);
        }
        catch (IOException parama1)
        {
          ab.i("MicroMsg.ConversationAdapter", "isMsgStatInfoProtoEqual exp %s", new Object[] { parama1.getMessage() });
          AppMethodBeat.o(14457);
          bool = false;
        }
      }
    }
  }

  public static void bc(List<q> paramList)
  {
    AppMethodBeat.i(14455);
    if (bo.ek(paramList))
      AppMethodBeat.o(14455);
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        q localq = (q)paramList.next();
        if (((!jZe.containsKey(Long.valueOf(localq.field_msgId))) || (sH(((Integer)jZe.get(Long.valueOf(localq.field_msgId))).intValue()))) && (localq.drC()))
        {
          Object localObject = ((com.tencent.mm.plugin.biz.a.a)g.K(com.tencent.mm.plugin.biz.a.a.class)).b(localq.field_msgId, localq.field_content);
          if ((localObject != null) && (!bo.ek(((o)localObject).fjr)))
            try
            {
              Iterator localIterator = ((o)localObject).fjr.iterator();
              while (localIterator.hasNext())
              {
                com.tencent.mm.af.p localp = (com.tencent.mm.af.p)localIterator.next();
                localObject = new com/tencent/mm/protocal/protobuf/jy;
                ((jy)localObject).<init>();
                ((jy)localObject).vGE = localq.field_talker;
                ((jy)localObject).vGH = localq.field_msgId;
                if (!bo.isNullOrNil(localp.url))
                {
                  ((jy)localObject).url = localp.url;
                  localLinkedList.add(localObject);
                  jZe.put(Long.valueOf(localq.field_msgId), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
                }
              }
            }
            catch (UnsupportedOperationException localUnsupportedOperationException)
            {
              ab.w("MicroMsg.ConversationAdapter", "postDoGetCommentReward exp %s", new Object[] { localUnsupportedOperationException.getMessage() });
            }
            catch (Exception localException)
            {
              ab.w("MicroMsg.ConversationAdapter", "postDoGetCommentReward exp %s", new Object[] { localException.getMessage() });
            }
        }
      }
      if (bo.ek(localLinkedList))
      {
        AppMethodBeat.o(14455);
      }
      else
      {
        g.RO().eJo.a(new l(localLinkedList), 0);
        AppMethodBeat.o(14455);
      }
    }
  }

  public static void f(q paramq)
  {
    AppMethodBeat.i(14454);
    if ((paramq == null) || (!paramq.drC()))
      AppMethodBeat.o(14454);
    while (true)
    {
      return;
      com.tencent.mm.plugin.brandservice.b.a("BrandServiceWorkerThread", new c.1(paramq), 0L);
      AppMethodBeat.o(14454);
    }
  }

  public static boolean sH(int paramInt)
  {
    AppMethodBeat.i(14453);
    boolean bool;
    if (System.currentTimeMillis() / 1000L - paramInt > a.jYZ)
    {
      bool = true;
      AppMethodBeat.o(14453);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14453);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.b.c
 * JD-Core Version:    0.6.2
 */