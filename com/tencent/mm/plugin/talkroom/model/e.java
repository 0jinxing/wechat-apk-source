package com.tencent.mm.plugin.talkroom.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.cgm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  implements com.tencent.mm.bg.b
{
  private ak handler;
  private HashSet<com.tencent.mm.bg.a> listeners;
  private final String path;
  private com.tencent.mm.plugin.talkroom.a.b sxS;

  public e()
  {
    AppMethodBeat.i(25779);
    this.listeners = new HashSet();
    Object localObject = new com.tencent.mm.vfs.b(b.cEj());
    if (!((com.tencent.mm.vfs.b)localObject).exists())
      ((com.tencent.mm.vfs.b)localObject).mkdirs();
    this.path = (b.cEj() + "talkroomMemberList.info");
    this.handler = new ak(Looper.getMainLooper());
    if (this.sxS == null)
      if (!com.tencent.mm.vfs.e.ct(this.path))
      {
        this.sxS = new com.tencent.mm.plugin.talkroom.a.b();
        AppMethodBeat.o(25779);
      }
    while (true)
    {
      return;
      try
      {
        byte[] arrayOfByte = com.tencent.mm.vfs.e.e(this.path, 0, -1);
        localObject = new com/tencent/mm/plugin/talkroom/a/b;
        ((com.tencent.mm.plugin.talkroom.a.b)localObject).<init>();
        this.sxS = ((com.tencent.mm.plugin.talkroom.a.b)((com.tencent.mm.plugin.talkroom.a.b)localObject).parseFrom(arrayOfByte));
        AppMethodBeat.o(25779);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomInfoListMgr", localException, "", new Object[0]);
        this.sxS = new com.tencent.mm.plugin.talkroom.a.b();
      }
      AppMethodBeat.o(25779);
    }
  }

  private void W(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(25786);
    Iterator localIterator = this.listeners.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.bg.a locala = (com.tencent.mm.bg.a)localIterator.next();
      this.handler.post(new e.1(this, locala, paramString1, paramString2, paramString3));
    }
    AppMethodBeat.o(25786);
  }

  private boolean bJL()
  {
    boolean bool = true;
    AppMethodBeat.i(25787);
    if (this.sxS.sxH.isEmpty())
    {
      com.tencent.mm.vfs.e.deleteFile(this.path);
      AppMethodBeat.o(25787);
    }
    while (true)
    {
      return bool;
      try
      {
        byte[] arrayOfByte = this.sxS.toByteArray();
        com.tencent.mm.vfs.e.b(this.path, arrayOfByte, arrayOfByte.length);
        AppMethodBeat.o(25787);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomInfoListMgr", localException, "", new Object[0]);
        AppMethodBeat.o(25787);
        bool = false;
      }
    }
  }

  public final void a(com.tencent.mm.bg.a parama)
  {
    try
    {
      AppMethodBeat.i(25780);
      this.listeners.add(parama);
      AppMethodBeat.o(25780);
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public final void a(String paramString1, LinkedList<cgm> paramLinkedList, String paramString2, String paramString3, int paramInt)
  {
    while (true)
    {
      Object localObject;
      boolean bool;
      try
      {
        AppMethodBeat.i(25785);
        localObject = paramLinkedList;
        if (paramLinkedList == null)
        {
          localObject = new java/util/LinkedList;
          ((LinkedList)localObject).<init>();
        }
        ab.i("MicroMsg.TalkRoomInfoListMgr", "updateList talk: %s,  size: %d", new Object[] { paramString1, Integer.valueOf(((LinkedList)localObject).size()) });
        paramLinkedList = (LinkedList)((LinkedList)localObject).clone();
        bool = paramLinkedList.isEmpty();
        localObject = this.sxS.sxH.iterator();
        if (((Iterator)localObject).hasNext())
        {
          com.tencent.mm.plugin.talkroom.a.a locala = (com.tencent.mm.plugin.talkroom.a.a)((Iterator)localObject).next();
          if (!locala.username.equals(paramString1))
            continue;
          if (bool)
          {
            this.sxS.sxH.remove(locala);
            bJL();
            W(paramString1, paramString2, paramString3);
            AppMethodBeat.o(25785);
            return;
          }
          locala.cGh = paramLinkedList;
          locala.sceneType = paramInt;
          continue;
        }
      }
      finally
      {
      }
      if (!bool)
      {
        localObject = new com/tencent/mm/plugin/talkroom/a/a;
        ((com.tencent.mm.plugin.talkroom.a.a)localObject).<init>();
        ((com.tencent.mm.plugin.talkroom.a.a)localObject).username = paramString1;
        ((com.tencent.mm.plugin.talkroom.a.a)localObject).cGh = paramLinkedList;
        ((com.tencent.mm.plugin.talkroom.a.a)localObject).sceneType = paramInt;
        this.sxS.sxH.add(localObject);
      }
      bJL();
      W(paramString1, paramString2, paramString3);
      AppMethodBeat.o(25785);
    }
  }

  public final boolean akv()
  {
    try
    {
      AppMethodBeat.i(25783);
      Object localObject2;
      do
      {
        Iterator localIterator1 = this.sxS.sxH.iterator();
        Iterator localIterator2;
        while (!localIterator2.hasNext())
        {
          do
          {
            if (!localIterator1.hasNext())
              break;
            localObject2 = (com.tencent.mm.plugin.talkroom.a.a)localIterator1.next();
          }
          while (((com.tencent.mm.plugin.talkroom.a.a)localObject2).sceneType != 0);
          localIterator2 = ((com.tencent.mm.plugin.talkroom.a.a)localObject2).cGh.iterator();
        }
        localObject2 = (cgm)localIterator2.next();
      }
      while (!r.Yz().equals(((cgm)localObject2).jBB));
      boolean bool = true;
      AppMethodBeat.o(25783);
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(25783);
      }
    }
    finally
    {
    }
  }

  public final void b(com.tencent.mm.bg.a parama)
  {
    try
    {
      AppMethodBeat.i(25781);
      this.listeners.remove(parama);
      AppMethodBeat.o(25781);
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public final LinkedList<cgm> tM(String paramString)
  {
    try
    {
      AppMethodBeat.i(25784);
      Iterator localIterator = this.sxS.sxH.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.talkroom.a.a locala = (com.tencent.mm.plugin.talkroom.a.a)localIterator.next();
        if (locala.username.equals(paramString))
        {
          paramString = (LinkedList)locala.cGh.clone();
          AppMethodBeat.o(25784);
        }
      }
      while (true)
      {
        return paramString;
        paramString = new java/util/LinkedList;
        paramString.<init>();
        AppMethodBeat.o(25784);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final boolean tN(String paramString)
  {
    try
    {
      AppMethodBeat.i(25782);
      Iterator localIterator = this.sxS.sxH.iterator();
      boolean bool;
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.talkroom.a.a locala = (com.tencent.mm.plugin.talkroom.a.a)localIterator.next();
        if ((locala.username.equals(paramString)) && (locala.sceneType == 0))
        {
          bool = true;
          AppMethodBeat.o(25782);
        }
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(25782);
      }
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.e
 * JD-Core Version:    0.6.2
 */