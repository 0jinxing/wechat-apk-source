package com.tencent.mm.w;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

final class b$b extends com.tencent.mm.plugin.fts.a.a.a
{
  public boolean eBg;
  private HashSet<Long> eBh;
  private long eBi;
  private int eBj;
  private HashMap<int[], b.e> eBk;

  private b$b(b paramb)
  {
    AppMethodBeat.i(124476);
    this.eBg = false;
    this.eBh = null;
    this.eBi = -9223372036854775808L;
    this.eBj = -1;
    this.eBk = new HashMap();
    AppMethodBeat.o(124476);
  }

  public final boolean execute()
  {
    AppMethodBeat.i(124477);
    ab.i("MicroMsg.FTS.FTS5SearchFriendLogic", "Start building friend index.");
    this.eBg = b.Pr();
    if (this.eBj < 0)
      this.eBj = 0;
    ab.d("MicroMsg.FTS.FTS5SearchFriendLogic", "[BuildFriendIndexTask mBuildMobileIndex : %s, mCurrentTask : %d]", new Object[] { Boolean.valueOf(this.eBg), Integer.valueOf(this.eBj) });
    Object localObject1;
    long l;
    int i;
    Object localObject2;
    if (this.eBj == 0)
      if (this.eBg)
      {
        if (!this.eBk.containsKey(c.mCm))
          this.eBk.put(c.mCm, new b.e((byte)0));
        if (this.eBh == null)
        {
          this.eBh = new HashSet();
          localObject1 = this.eBa.eAY.a(c.mCm, false, true, false, false, false);
          while (((Cursor)localObject1).moveToNext())
          {
            l = ((Cursor)localObject1).getLong(0);
            this.eBh.add(Long.valueOf(l));
          }
          ((Cursor)localObject1).close();
        }
        if (Thread.interrupted())
        {
          localObject1 = new InterruptedException();
          AppMethodBeat.o(124477);
          throw ((Throwable)localObject1);
        }
        localObject1 = ((n)g.M(n.class)).getFTSMainDB().i("SELECT id, realname, realnamequanpin, realnamepyinitial, nickname, nicknamequanpin, nicknamepyinitial, username, status, moblie FROM addr_upload2 WHERE id > ? AND type=0 ORDER BY id;", new String[] { Long.toString(this.eBi) });
        i = 50;
        while (((Cursor)localObject1).moveToNext())
        {
          if (Thread.interrupted())
          {
            ((Cursor)localObject1).close();
            this.eBa.eAY.commit();
            localObject1 = new InterruptedException();
            AppMethodBeat.o(124477);
            throw ((Throwable)localObject1);
          }
          l = ((Cursor)localObject1).getLong(0);
          this.eBi = l;
          localObject2 = new b.a();
          ((b.a)localObject2).id = l;
          ((b.a)localObject2).eBb = ((Cursor)localObject1).getString(1);
          ((b.a)localObject2).eBc = ((Cursor)localObject1).getString(2);
          ((b.a)localObject2).eBd = ((Cursor)localObject1).getString(3);
          ((b.a)localObject2).bCu = ((Cursor)localObject1).getString(4);
          ((b.a)localObject2).eBe = ((Cursor)localObject1).getString(5);
          ((b.a)localObject2).eBf = ((Cursor)localObject1).getString(6);
          ((b.a)localObject2).userName = ((Cursor)localObject1).getString(7);
          ((b.a)localObject2).status = ((Cursor)localObject1).getInt(8);
          ((b.a)localObject2).cFl = ((Cursor)localObject1).getString(9);
          ((b.a)localObject2).type = 0;
          if (((b.a)localObject2).status == 65536)
            ((b.a)localObject2).status = 0;
          if ((b.a((b.a)localObject2)) && (!this.eBh.remove(Long.valueOf(((b.a)localObject2).id))))
          {
            if (i < 50)
              break label782;
            this.eBa.eAY.commit();
            this.eBa.eAY.beginTransaction();
          }
        }
      }
    label779: label782: for (int j = 0; ; j = i)
    {
      b.e locale;
      while (true)
      {
        i = j;
        try
        {
          j += b.a(this.eBa, (b.a)localObject2);
          i = j;
          localObject2 = (b.e)this.eBk.get(c.mCm);
          i = j;
          ((b.e)localObject2).eBn += 1;
          i = j;
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.FTS.FTS5SearchFriendLogic", localException, "Build mobile friend index failed with exception.", new Object[0]);
          locale = (b.e)this.eBk.get(c.mCm);
          locale.mFailedCount += 1;
        }
      }
      break;
      ((Cursor)localObject1).close();
      this.eBa.eAY.commit();
      localObject1 = this.eBh.iterator();
      i = 50;
      if (((Iterator)localObject1).hasNext())
      {
        if (i < 50)
          break label779;
        this.eBa.eAY.commit();
        this.eBa.eAY.beginTransaction();
        i = 0;
      }
      while (true)
      {
        l = ((Long)((Iterator)localObject1).next()).longValue();
        this.eBa.eAY.c(c.mCm, l);
        locale = (b.e)this.eBk.get(c.mCm);
        locale.eBo += 1;
        ((Iterator)localObject1).remove();
        i++;
        break;
        this.eBa.eAY.commit();
        this.eBh = null;
        this.eBi = -9223372036854775808L;
        this.eBj = -1;
        AppMethodBeat.o(124477);
        return true;
      }
    }
  }

  public final int getId()
  {
    return 2;
  }

  public final String getName()
  {
    return "BuildFriendIndexTask";
  }

  public final String toString()
  {
    AppMethodBeat.i(124478);
    String str;
    if (this.eBk.containsKey(c.mCm))
    {
      str = "BuildFriendIndex IDXTYPE_SET_CONTACT_FRIEND [new: " + ((b.e)this.eBk.get(c.mCm)).eBn + ", removed: " + ((b.e)this.eBk.get(c.mCm)).eBo + ", failed: " + ((b.e)this.eBk.get(c.mCm)).mFailedCount + "]";
      AppMethodBeat.o(124478);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(124478);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.b.b
 * JD-Core Version:    0.6.2
 */