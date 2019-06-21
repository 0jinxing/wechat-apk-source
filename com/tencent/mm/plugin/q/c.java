package com.tencent.mm.plugin.q;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.protobuf.gv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  boolean oFo = false;
  a.a oFp;

  public static LinkedList<c.a> RR(String paramString)
  {
    AppMethodBeat.i(22895);
    LinkedList localLinkedList = new LinkedList();
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(22895);
    while (true)
    {
      return localLinkedList;
      int i = com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO().Rp(paramString);
      ab.i("MicroMsg.MsgSynchronizePack", "addConversationList user:%s convMsgCount:%d", new Object[] { paramString, Integer.valueOf(i) });
      if (i <= 0)
      {
        AppMethodBeat.o(22895);
      }
      else
      {
        localLinkedList.add(new c.a(paramString));
        AppMethodBeat.o(22895);
      }
    }
  }

  public final void a(d paramd, LinkedList<c.a> paramLinkedList, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(22896);
    com.tencent.mm.sdk.g.d.a(new c.1(this, paramLinkedList, paramd, paramLong1, paramLong2, paramInt), "msgSynchronizePackThread", 10).start();
    AppMethodBeat.o(22896);
  }

  public final boolean a(d paramd, c.a parama, long paramLong1, long paramLong2, String paramString, int paramInt1, PInt paramPInt, PLong paramPLong, int paramInt2)
  {
    AppMethodBeat.i(22897);
    boolean bool = paramd.action.equals(b.oFd);
    aw.ZK();
    if (ad.Mn(com.tencent.mm.model.c.XM().aoO(parama.jrd).field_verifyFlag))
    {
      bool = true;
      AppMethodBeat.o(22897);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.MsgSynchronizePack", "synchronizeSessionPack convName:%s, unReadCount:%d", new Object[] { parama.jrd, Integer.valueOf(paramInt1) });
      LinkedList localLinkedList = new LinkedList();
      Object localObject1 = new ArrayList(paramInt2);
      int i = com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO().u(parama.jrd, paramLong1, paramLong2);
      if (i <= 0)
      {
        ab.i("MicroMsg.MsgSynchronizePack", "synchronizeSessionPack session no message to sync");
        bool = false;
        AppMethodBeat.o(22897);
        continue;
      }
      Object localObject2 = com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO().b(parama.jrd, paramLong1, paramLong2, paramInt2);
      if (bool)
      {
        if (i <= paramInt2)
          break label233;
        paramd.oFz = 0;
      }
      while (true)
      {
        if (!((Cursor)localObject2).moveToNext())
          break label284;
        if (this.oFo)
        {
          ab.e("MicroMsg.MsgSynchronizePack", "synchronizeSessionPack is cancel!");
          ((Cursor)localObject2).close();
          bool = false;
          AppMethodBeat.o(22897);
          break;
          label233: paramd.oFz = 1;
          continue;
        }
        paramd = new bi();
        paramd.d((Cursor)localObject2);
        if ((paramd.field_createTime >= paramLong1) && (paramd.field_createTime <= paramLong2))
          ((ArrayList)localObject1).add(paramd);
      }
      label284: ((Cursor)localObject2).close();
      if (((ArrayList)localObject1).size() <= 0)
      {
        ab.i("MicroMsg.MsgSynchronizePack", "synchronizeSessionPack session no message to sync");
        bool = false;
        AppMethodBeat.o(22897);
        continue;
      }
      localObject2 = ((ArrayList)localObject1).iterator();
      while (true)
        if (((Iterator)localObject2).hasNext())
        {
          localObject1 = (bi)((Iterator)localObject2).next();
          if (this.oFo)
          {
            ab.e("MicroMsg.MsgSynchronizePack", "synchronizeSessionPack is cancel!");
            bool = false;
            AppMethodBeat.o(22897);
            break;
          }
          PLong localPLong = new PLong();
          paramd = new LinkedList();
          if (paramInt1 > 0)
            bool = true;
          try
          {
            while (true)
            {
              paramd = com.tencent.mm.plugin.backup.f.h.a((bi)localObject1, false, paramString, localPLong, paramd, null, bool, true, 0L);
              if (paramd == null)
                break;
              localLinkedList.add(paramd);
              paramPLong.value += 1L;
              paramInt1--;
              break;
              bool = false;
            }
          }
          catch (Exception paramd)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.MsgSynchronizePack", paramd, "packMsg", new Object[0]);
              paramd = null;
            }
          }
        }
      ab.d("MicroMsg.MsgSynchronizePack", "synchronizeSessionPack bakChatMsgList size:%d", new Object[] { Integer.valueOf(localLinkedList.size()) });
      paramd = new gv();
      paramd.jBw = localLinkedList;
      paramd.jBv = localLinkedList.size();
      try
      {
        paramString = paramd.toByteArray();
        paramPLong = new java/lang/StringBuilder;
        paramPLong.<init>("MSG_");
        parama = localLinkedList.size() + "_" + parama.jrd + "_" + bo.anU();
        g.f(g.bQX(), parama, paramString);
        ab.i("MicroMsg.MsgSynchronizePack", "synchronizeSessionPack add MsgSynchronize, tagTextClientId:%s", new Object[] { parama });
        paramPInt.value += 1;
        bool = true;
        AppMethodBeat.o(22897);
      }
      catch (Exception parama)
      {
        while (true)
          ab.e("MicroMsg.MsgSynchronizePack", "ERROR: synchronizeSessionPack BakChatMsgList to Buffer list:%d :%s", new Object[] { Integer.valueOf(paramd.jBv), parama.getMessage() });
      }
    }
  }

  public final LinkedList<c.a> bQW()
  {
    AppMethodBeat.i(22894);
    long l = bo.anU();
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = com.tencent.mm.plugin.backup.h.d.aUr().aUs().XR().c(t.fkP, com.tencent.mm.plugin.backup.b.g.Ko(), "*");
    if (localCursor.getCount() == 0)
    {
      ab.e("MicroMsg.MsgSynchronizePack", "calculateConversationList empty conversation!");
      localCursor.close();
      AppMethodBeat.o(22894);
      return localLinkedList;
    }
    ab.i("MicroMsg.MsgSynchronizePack", "calculateConversationList count[%d]", new Object[] { Integer.valueOf(localCursor.getCount()) });
    int i = 0;
    while (true)
    {
      if (localCursor.moveToNext())
      {
        if (this.oFo)
        {
          localCursor.close();
          ab.e("MicroMsg.MsgSynchronizePack", "calculateConversationList is cancel!");
          AppMethodBeat.o(22894);
          break;
        }
        if (i < b.oFj)
          break label214;
        ab.i("MicroMsg.MsgSynchronizePack", "calculateConversationList convCount has reach the max, finish. convCount:%d", new Object[] { Integer.valueOf(i) });
      }
      localCursor.close();
      ab.i("MicroMsg.MsgSynchronizePack", "calculateConversationList loading time:" + bo.gb(l));
      AppMethodBeat.o(22894);
      break;
      label214: ak localak = new ak();
      localak.d(localCursor);
      if (!bo.isNullOrNil(localak.field_username))
      {
        int j = com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO().Rp(localak.field_username);
        ab.i("MicroMsg.MsgSynchronizePack", "calculateConversationList user:%s convMsgCount:%d, convCount:%d", new Object[] { localak.field_username, Integer.valueOf(j), Integer.valueOf(i) });
        if (j > 0)
        {
          localLinkedList.add(new c.a(localak.field_username));
          i++;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.q.c
 * JD-Core Version:    0.6.2
 */