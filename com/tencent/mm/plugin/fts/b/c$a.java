package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class c$a extends com.tencent.mm.plugin.fts.a.a.a
{
  private long hjw = 9223372036854775807L;
  private int mFailedCount = 0;
  private ArrayList<Long> mGA = null;
  private int mGB = 0;
  private HashSet<Pair<Long, Long>> mGz = null;
  private int mgK = 0;
  private int mgL = 0;

  private c$a(c paramc)
  {
  }

  public final String aAo()
  {
    AppMethodBeat.i(136747);
    String str = String.format("{new: %d removed: %d failed: %d}", new Object[] { Integer.valueOf(this.mgK), Integer.valueOf(this.mgL), Integer.valueOf(this.mFailedCount) });
    AppMethodBeat.o(136747);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136746);
    this.hjw = this.mGx.mGp.mBT.J(-200L, 9223372036854775807L);
    ab.i("MicroMsg.FTS.FTS5SearchMessageLogic", "Start building message index, last createTime: " + this.hjw);
    long l2;
    long l3;
    if (this.mGz == null)
    {
      this.mGz = new HashSet();
      this.mGA = new ArrayList();
      localObject1 = this.mGx.mGp.a(com.tencent.mm.plugin.fts.a.c.mCc, true, true, false, true, true);
      while (((Cursor)localObject1).moveToNext())
      {
        long l1 = ((Cursor)localObject1).getLong(0);
        l2 = ((Cursor)localObject1).getLong(1);
        l3 = ((Cursor)localObject1).getLong(2);
        if (((Cursor)localObject1).getInt(3) == -1)
          this.mGA.add(Long.valueOf(l1));
        else if (l3 <= this.hjw)
          this.mGz.add(new Pair(Long.valueOf(l2), Long.valueOf(l3)));
      }
      ((Cursor)localObject1).close();
    }
    if (Thread.interrupted())
    {
      localObject1 = new InterruptedException();
      AppMethodBeat.o(136746);
      throw ((Throwable)localObject1);
    }
    int i = 2147483647;
    Object localObject2 = new String[2];
    Object localObject1 = new ArrayList();
    while (i >= 50)
    {
      localObject2[0] = Long.toString(this.hjw);
      localObject2[1] = Integer.toString(this.mGB);
      Object localObject3 = this.mGx.mgD.rawQuery("SELECT msgId, talker, createTime, content, type, isSend FROM message WHERE createTime<=? AND createTime!=0 AND type in (1, 49) ORDER BY createTime DESC, msgId DESC LIMIT 50 OFFSET ?;", (String[])localObject2);
      c.d locald;
      for (i = 0; ((Cursor)localObject3).moveToNext(); i++)
      {
        locald = new c.d(this.mGx, (byte)0);
        locald.cvx = ((Cursor)localObject3).getLong(0);
        locald.talker = ((Cursor)localObject3).getString(1);
        locald.createTime = ((Cursor)localObject3).getLong(2);
        locald.content = ((Cursor)localObject3).getString(3);
        locald.msgType = ((Cursor)localObject3).getInt(4);
        locald.mGF = ((Cursor)localObject3).getInt(5);
        locald.mGE = 41;
        if (c.a(locald))
        {
          locald.bAD();
          if (locald.isAvailable())
            ((List)localObject1).add(locald);
        }
      }
      ((Cursor)localObject3).close();
      if (Thread.interrupted())
      {
        localObject1 = new InterruptedException();
        AppMethodBeat.o(136746);
        throw ((Throwable)localObject1);
      }
      int j = ((List)localObject1).size();
      if (j == 0)
      {
        ab.i("MicroMsg.FTS.FTS5SearchMessageLogic", "build msgRecList size %d", new Object[] { Integer.valueOf(j) });
        if (j <= 0)
          break label800;
        this.mGx.mGp.beginTransaction();
        localObject3 = ((List)localObject1).iterator();
        label524: if (!((Iterator)localObject3).hasNext())
          break label773;
        locald = (c.d)((Iterator)localObject3).next();
        l2 = locald.cvx;
        l3 = locald.createTime;
        if (l3 != this.hjw)
          break label759;
      }
      for (this.mGB += 1; ; this.mGB = 0)
      {
        while (true)
        {
          Pair localPair = new Pair(Long.valueOf(l2), Long.valueOf(l3));
          if (this.mGz.remove(localPair))
            break;
          try
          {
            this.mGx.mGp.a(locald.mGE, l2, locald.talker, l3, locald.mGG, locald.mGH);
            this.mgK += 1;
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.FTS.FTS5SearchMessageLogic", localException, "Build message index failed with exception. \n%s", new Object[] { locald.mGG });
            this.mFailedCount += 1;
          }
        }
        break label524;
        ab.i("MicroMsg.FTS.FTS5SearchMessageLogic", "build msgRecList size %d FROM %d to %d", new Object[] { Integer.valueOf(j), Long.valueOf(((c.d)((List)localObject1).get(0)).cvx), Long.valueOf(((c.d)((List)localObject1).get(j - 1)).cvx) });
        break;
        label759: this.hjw = l3;
      }
      label773: this.mGx.mGp.commit();
      this.mGx.mGp.K(-200L, this.hjw);
      label800: ((List)localObject1).clear();
      if (Thread.interrupted())
      {
        localObject1 = new InterruptedException();
        AppMethodBeat.o(136746);
        throw ((Throwable)localObject1);
      }
    }
    i = 50;
    localObject1 = this.mGz.iterator();
    if (((Iterator)localObject1).hasNext())
    {
      if (Thread.interrupted())
      {
        this.mGx.mGp.commit();
        localObject1 = new InterruptedException();
        AppMethodBeat.o(136746);
        throw ((Throwable)localObject1);
      }
      if (i < 50)
        break label1174;
      this.mGx.mGp.commit();
      this.mGx.mGp.beginTransaction();
      i = 0;
    }
    label1171: label1174: 
    while (true)
    {
      localObject2 = (Pair)((Iterator)localObject1).next();
      this.mGx.mGp.a(com.tencent.mm.plugin.fts.a.c.mCc, ((Long)((Pair)localObject2).first).longValue(), ((Long)((Pair)localObject2).second).longValue());
      i++;
      this.mgL += 1;
      ((Iterator)localObject1).remove();
      break;
      this.mGx.mGp.commit();
      i = 50;
      localObject1 = this.mGA.listIterator(this.mGA.size());
      if (((ListIterator)localObject1).hasPrevious())
      {
        if (Thread.interrupted())
        {
          this.mGx.mGp.commit();
          localObject1 = new InterruptedException();
          AppMethodBeat.o(136746);
          throw ((Throwable)localObject1);
        }
        if (i < 50)
          break label1171;
        this.mGx.mGp.commit();
        this.mGx.mGp.beginTransaction();
        i = 0;
      }
      while (true)
      {
        l3 = ((Long)((ListIterator)localObject1).previous()).longValue();
        this.mGx.mGp.g(Long.valueOf(l3));
        i++;
        this.mgL += 1;
        ((ListIterator)localObject1).remove();
        break;
        this.mGx.mGp.K(-200L, this.hjw - 1L);
        this.mGx.mGp.commit();
        this.mGx.mGq = false;
        AppMethodBeat.o(136746);
        return true;
      }
    }
  }

  public final int getId()
  {
    return 4;
  }

  public final String getName()
  {
    return "BuildMessageIndexTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.c.a
 * JD-Core Version:    0.6.2
 */