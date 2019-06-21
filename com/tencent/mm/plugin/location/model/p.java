package com.tencent.mm.plugin.location.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bh.c;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p
  implements com.tencent.mm.bh.a
{
  private List<c> bkF;
  private ak handler;
  private com.tencent.mm.plugin.location.a.b nKW;
  private final String path;

  public p()
  {
    AppMethodBeat.i(113397);
    this.bkF = new LinkedList();
    Object localObject = new com.tencent.mm.vfs.b(l.bJB());
    if (!((com.tencent.mm.vfs.b)localObject).exists())
      ((com.tencent.mm.vfs.b)localObject).mkdirs();
    this.path = (l.bJB() + "trackroominfolist.info");
    this.handler = new ak(Looper.getMainLooper());
    if (this.nKW == null)
      if (!e.ct(this.path))
      {
        this.nKW = new com.tencent.mm.plugin.location.a.b();
        AppMethodBeat.o(113397);
      }
    while (true)
    {
      return;
      try
      {
        localObject = e.e(this.path, 0, -1);
        com.tencent.mm.plugin.location.a.b localb = new com/tencent/mm/plugin/location/a/b;
        localb.<init>();
        this.nKW = ((com.tencent.mm.plugin.location.a.b)localb.parseFrom((byte[])localObject));
        AppMethodBeat.o(113397);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.TrackRoomListMgr", localException, "", new Object[0]);
        this.nKW = new com.tencent.mm.plugin.location.a.b();
      }
      AppMethodBeat.o(113397);
    }
  }

  private void W(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(113403);
    Iterator localIterator = this.bkF.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      this.handler.post(new p.1(this, localc, paramString1, paramString2, paramString3));
    }
    AppMethodBeat.o(113403);
  }

  private boolean bJL()
  {
    boolean bool = true;
    AppMethodBeat.i(113404);
    ab.d("MicroMsg.TrackRoomListMgr", "infoFile infolist size %d", new Object[] { Integer.valueOf(this.nKW.nJr.size()) });
    if (this.nKW.nJr.isEmpty())
    {
      e.deleteFile(this.path);
      AppMethodBeat.o(113404);
    }
    while (true)
    {
      return bool;
      try
      {
        byte[] arrayOfByte = this.nKW.toByteArray();
        e.b(this.path, arrayOfByte, arrayOfByte.length);
        AppMethodBeat.o(113404);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.TrackRoomListMgr", localException, "", new Object[0]);
        AppMethodBeat.o(113404);
        bool = false;
      }
    }
  }

  public final com.tencent.mm.plugin.location.a.a PQ(String paramString)
  {
    try
    {
      AppMethodBeat.i(113401);
      Iterator localIterator = this.nKW.nJr.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.location.a.a locala = (com.tencent.mm.plugin.location.a.a)localIterator.next();
        if (locala.username.equals(paramString))
        {
          AppMethodBeat.o(113401);
          paramString = locala;
        }
      }
      while (true)
      {
        return paramString;
        paramString = null;
        AppMethodBeat.o(113401);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final void PR(String paramString)
  {
    AppMethodBeat.i(113408);
    if (this.nKW != null)
      this.nKW.nJs = paramString;
    bJL();
    AppMethodBeat.o(113408);
  }

  public final void a(c paramc)
  {
    try
    {
      AppMethodBeat.i(113398);
      this.bkF.add(paramc);
      AppMethodBeat.o(113398);
      return;
    }
    finally
    {
      paramc = finally;
    }
    throw paramc;
  }

  public final void a(String paramString1, LinkedList<String> paramLinkedList, double paramDouble1, double paramDouble2, String paramString2, String paramString3, String paramString4)
  {
    while (true)
    {
      Object localObject;
      boolean bool;
      try
      {
        AppMethodBeat.i(113402);
        localObject = paramLinkedList;
        if (paramLinkedList == null)
        {
          localObject = new java/util/LinkedList;
          ((LinkedList)localObject).<init>();
        }
        ab.i("MicroMsg.TrackRoomListMgr", "updateList talk: %s,  size: %d %f %f", new Object[] { paramString1, Integer.valueOf(((LinkedList)localObject).size()), Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
        paramLinkedList = (LinkedList)((LinkedList)localObject).clone();
        bool = paramLinkedList.isEmpty();
        Iterator localIterator = this.nKW.nJr.iterator();
        if (localIterator.hasNext())
        {
          localObject = (com.tencent.mm.plugin.location.a.a)localIterator.next();
          if (!((com.tencent.mm.plugin.location.a.a)localObject).username.equals(paramString1))
            continue;
          if (bool)
          {
            this.nKW.nJr.remove(localObject);
            bJL();
            W(paramString1, paramString3, paramString4);
            AppMethodBeat.o(113402);
            return;
          }
          ((com.tencent.mm.plugin.location.a.a)localObject).cGh = paramLinkedList;
          ((com.tencent.mm.plugin.location.a.a)localObject).nJq = paramString2;
          ((com.tencent.mm.plugin.location.a.a)localObject).latitude = paramDouble1;
          ((com.tencent.mm.plugin.location.a.a)localObject).longitude = paramDouble2;
          continue;
        }
      }
      finally
      {
      }
      if (!bool)
      {
        localObject = new com/tencent/mm/plugin/location/a/a;
        ((com.tencent.mm.plugin.location.a.a)localObject).<init>();
        ((com.tencent.mm.plugin.location.a.a)localObject).username = paramString1;
        ((com.tencent.mm.plugin.location.a.a)localObject).cGh = paramLinkedList;
        ((com.tencent.mm.plugin.location.a.a)localObject).nJq = paramString2;
        ((com.tencent.mm.plugin.location.a.a)localObject).latitude = paramDouble1;
        ((com.tencent.mm.plugin.location.a.a)localObject).longitude = paramDouble2;
        this.nKW.nJr.add(localObject);
      }
      bJL();
      W(paramString1, paramString3, paramString4);
      AppMethodBeat.o(113402);
    }
  }

  public final boolean aV(String paramString1, String paramString2)
  {
    AppMethodBeat.i(113407);
    boolean bool = tP(paramString1).contains(paramString2);
    AppMethodBeat.o(113407);
    return bool;
  }

  public final boolean akL()
  {
    AppMethodBeat.i(113406);
    String str;
    do
    {
      Iterator localIterator = this.nKW.nJr.iterator();
      Object localObject;
      while (!((Iterator)localObject).hasNext())
      {
        if (!localIterator.hasNext())
          break;
        localObject = (com.tencent.mm.plugin.location.a.a)localIterator.next();
        ab.d("MicroMsg.TrackRoomListMgr", "info :" + ((com.tencent.mm.plugin.location.a.a)localObject).cGh.size());
        localObject = ((com.tencent.mm.plugin.location.a.a)localObject).cGh.iterator();
      }
      str = (String)((Iterator)localObject).next();
      ab.d("MicroMsg.TrackRoomListMgr", "member :".concat(String.valueOf(str)));
    }
    while (!str.equals(r.Yz()));
    ab.i("MicroMsg.TrackRoomListMgr", "now is sharing location..");
    boolean bool = true;
    AppMethodBeat.o(113406);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(113406);
    }
  }

  public final String akM()
  {
    if (this.nKW != null);
    for (String str = this.nKW.nJs; ; str = "")
      return str;
  }

  public final void b(c paramc)
  {
    try
    {
      AppMethodBeat.i(113399);
      this.bkF.remove(paramc);
      AppMethodBeat.o(113399);
      return;
    }
    finally
    {
      paramc = finally;
    }
    throw paramc;
  }

  public final LinkedList<String> tP(String paramString)
  {
    try
    {
      AppMethodBeat.i(113400);
      Iterator localIterator = this.nKW.nJr.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.location.a.a locala = (com.tencent.mm.plugin.location.a.a)localIterator.next();
        if (locala.username.equals(paramString))
        {
          paramString = (LinkedList)locala.cGh.clone();
          AppMethodBeat.o(113400);
        }
      }
      while (true)
      {
        return paramString;
        paramString = new java/util/LinkedList;
        paramString.<init>();
        AppMethodBeat.o(113400);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final boolean tQ(String paramString)
  {
    AppMethodBeat.i(113405);
    boolean bool;
    if (tP(paramString).size() > 0)
    {
      bool = true;
      AppMethodBeat.o(113405);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(113405);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.p
 * JD-Core Version:    0.6.2
 */