package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.e.a;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;
import java.io.File;

final class g$b extends a
{
  private g$b(g paramg)
  {
  }

  private static long bAE()
  {
    AppMethodBeat.i(136797);
    Object localObject1 = String.format("SELECT count(docid) FROM %s WHERE subtype = %d", new Object[] { "FTS5MetaFavorite", Integer.valueOf(9) });
    localObject1 = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB().rawQuery((String)localObject1, null);
    try
    {
      if (((Cursor)localObject1).moveToNext())
      {
        l = ((Cursor)localObject1).getLong(0);
        return l;
      }
      ((Cursor)localObject1).close();
      long l = 0L;
      AppMethodBeat.o(136797);
    }
    finally
    {
      ((Cursor)localObject1).close();
      AppMethodBeat.o(136797);
    }
  }

  private static long bAF()
  {
    AppMethodBeat.i(136798);
    String str = String.format("SELECT count(docid) FROM %s", new Object[] { "FTS5MetaMessage" });
    Cursor localCursor = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB().rawQuery(str, null);
    try
    {
      if (localCursor.moveToNext())
      {
        l = localCursor.getLong(0);
        return l;
      }
      localCursor.close();
      long l = 0L;
      AppMethodBeat.o(136798);
    }
    finally
    {
      localCursor.close();
      AppMethodBeat.o(136798);
    }
  }

  private static long bAG()
  {
    AppMethodBeat.i(136799);
    Object localObject1 = String.format("SELECT count(docid) FROM %s WHERE type = %d AND subtype = %d", new Object[] { "FTS5MetaContact", Integer.valueOf(131072), Integer.valueOf(1) });
    localObject1 = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB().rawQuery((String)localObject1, null);
    try
    {
      if (((Cursor)localObject1).moveToNext())
      {
        l = ((Cursor)localObject1).getLong(0);
        return l;
      }
      ((Cursor)localObject1).close();
      long l = 0L;
      AppMethodBeat.o(136799);
    }
    finally
    {
      ((Cursor)localObject1).close();
      AppMethodBeat.o(136799);
    }
  }

  private static long bAH()
  {
    AppMethodBeat.i(136800);
    String str = String.format("SELECT count(docid) FROM %s WHERE type = %d AND subtype = %d", new Object[] { "FTS5MetaContact", Integer.valueOf(131075), Integer.valueOf(38) });
    Cursor localCursor = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB().rawQuery(str, null);
    try
    {
      if (localCursor.moveToNext())
      {
        l = localCursor.getLong(0);
        return l;
      }
      localCursor.close();
      long l = 0L;
      AppMethodBeat.o(136800);
    }
    finally
    {
      localCursor.close();
      AppMethodBeat.o(136800);
    }
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136796);
    Object localObject1 = new StringBuffer();
    long l = d.bAc().length();
    com.tencent.mm.plugin.fts.a.e.mCL.mCN = (l / 1048576L);
    ((StringBuffer)localObject1).append("[DBSize]=" + bo.my(l));
    ((StringBuffer)localObject1).append("\n");
    com.tencent.mm.plugin.fts.a.e.mCL.mCO = bAG();
    com.tencent.mm.plugin.fts.a.e.mCL.mCP = bAH();
    com.tencent.mm.plugin.fts.a.e.mCL.mCR = bAE();
    com.tencent.mm.plugin.fts.a.e.mCL.mCQ = bAF();
    ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB().K(-301L, com.tencent.mm.plugin.fts.a.e.mCL.mCO);
    ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB().K(-302L, com.tencent.mm.plugin.fts.a.e.mCL.mCP);
    ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB().K(-303L, com.tencent.mm.plugin.fts.a.e.mCL.mCR);
    ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexDB().K(-304L, com.tencent.mm.plugin.fts.a.e.mCL.mCQ);
    ((StringBuffer)localObject1).append("[WXContact]=" + com.tencent.mm.plugin.fts.a.e.mCL.mCO);
    ((StringBuffer)localObject1).append("\n");
    ((StringBuffer)localObject1).append("[WXChatroom]=" + com.tencent.mm.plugin.fts.a.e.mCL.mCP);
    ((StringBuffer)localObject1).append("\n");
    ((StringBuffer)localObject1).append("[Favorite]=" + com.tencent.mm.plugin.fts.a.e.mCL.mCR);
    ((StringBuffer)localObject1).append("\n");
    ((StringBuffer)localObject1).append("[Message]=" + com.tencent.mm.plugin.fts.a.e.mCL.mCQ);
    Object localObject2 = ((StringBuffer)localObject1).toString();
    ab.i("MicroMsg.FTS.FTSSearchTestLogic", (String)localObject2);
    localObject1 = new b(c.mCx, "FTS5IndexMicroMsgInfo.txt");
    if (((b)localObject1).exists())
      ((b)localObject1).delete();
    if (!((b)localObject1).dMC().exists())
      ((b)localObject1).dMC().mkdirs();
    String str = j.w(((b)localObject1).dMD());
    localObject2 = ((String)localObject2).getBytes();
    ab.i("MicroMsg.FTS.FTSSearchTestLogic", "write fts info %d %s", new Object[] { Integer.valueOf(com.tencent.mm.vfs.e.b(str, (byte[])localObject2, localObject2.length)), j.w(((b)localObject1).dMD()) });
    AppMethodBeat.o(136796);
    return true;
  }

  public final String getName()
  {
    return "FTS5DBInfoTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.g.b
 * JD-Core Version:    0.6.2
 */