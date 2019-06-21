package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ak;
import com.tencent.mm.model.b;
import com.tencent.mm.plugin.fts.PluginFTS;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.io.File;

public final class f
  implements ak
{
  public final void fk(long paramLong)
  {
    AppMethodBeat.i(136788);
    Object localObject1;
    if (!g.RK())
    {
      localObject1 = new b();
      AppMethodBeat.o(136788);
      throw ((Throwable)localObject1);
    }
    try
    {
      Object localObject2 = ((PluginFTS)g.M(PluginFTS.class)).getFTSIndexDB();
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new java/io/File;
        g.RQ();
        ((File)localObject1).<init>(g.RP().cachePath, "FTS5IndexMicroMsg_encrypt.db");
        boolean bool = ((File)localObject1).exists();
        if (!bool)
          AppMethodBeat.o(136788);
      }
      while (true)
      {
        return;
        localObject1 = new com/tencent/mm/plugin/fts/d;
        g.RQ();
        ((com.tencent.mm.plugin.fts.d)localObject1).<init>(g.RP().cachePath);
        com.tencent.luggage.g.d.i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteSingleMsg by create new ftsIndexDB");
        long l = System.currentTimeMillis();
        localObject2 = String.format("UPDATE %s SET status=? WHERE entity_id=?;", new Object[] { "FTS5MetaMessage" });
        ((com.tencent.mm.plugin.fts.d)localObject1).mBd.execSQL((String)localObject2, new String[] { "-1", String.valueOf(paramLong) });
        ((com.tencent.mm.plugin.fts.d)localObject1).execSQL(String.format("DELETE FROM %s WHERE rowid IN (SELECT docid FROM %s WHERE entity_id=?);", new Object[] { "FTS5IndexMessage", "FTS5MetaMessage" }), new String[] { String.valueOf(paramLong) });
        ((com.tencent.mm.plugin.fts.d)localObject1).execSQL(String.format("DELETE FROM %s WHERE entity_id=?", new Object[] { "FTS5MetaMessage" }), new String[] { String.valueOf(paramLong) });
        ab.i("MicroMsg.FTS.FTSIndexDB", "deleteMsgById use time %d msgId %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Long.valueOf(paramLong) });
        AppMethodBeat.o(136788);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.luggage.g.d.printErrStackTrace("MicroMsg.FTS.FTSDeleteMsgLogic", localException, "syncDeleteSingleMsg", new Object[0]);
        AppMethodBeat.o(136788);
      }
    }
  }

  public final void o(String paramString, long paramLong)
  {
    AppMethodBeat.i(136789);
    com.tencent.luggage.g.d.i("MicroMsg.FTS.FTSDeleteMsgLogic", "start to delete fts talker msg %s %s", new Object[] { paramString, h.formatTime("yyyy-MM-dd HH:mm:ss", paramLong / 1000L) });
    if (!g.RK())
    {
      paramString = new b();
      AppMethodBeat.o(136789);
      throw paramString;
    }
    try
    {
      com.tencent.mm.plugin.fts.d locald = ((PluginFTS)g.M(PluginFTS.class)).getFTSIndexDB();
      Object localObject = locald;
      if (locald == null)
      {
        localObject = new java/io/File;
        g.RQ();
        ((File)localObject).<init>(g.RP().cachePath, "FTS5IndexMicroMsg_encrypt.db");
        boolean bool = ((File)localObject).exists();
        if (!bool)
          AppMethodBeat.o(136789);
      }
      while (true)
      {
        return;
        localObject = new com/tencent/mm/plugin/fts/d;
        g.RQ();
        ((com.tencent.mm.plugin.fts.d)localObject).<init>(g.RP().cachePath);
        com.tencent.luggage.g.d.i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteTalkerMsg by create new ftsIndexDB");
        l = System.currentTimeMillis();
        ((com.tencent.mm.plugin.fts.d)localObject).execSQL(String.format("DELETE FROM %s WHERE rowid IN (SELECT docid FROM %s WHERE aux_index=? AND timestamp <= ?);", new Object[] { "FTS5IndexMessage", "FTS5MetaMessage" }), new String[] { paramString, String.valueOf(paramLong) });
        ((com.tencent.mm.plugin.fts.d)localObject).execSQL(String.format("DELETE FROM %s WHERE aux_index=? AND timestamp <= ?", new Object[] { "FTS5MetaMessage" }), new String[] { paramString, String.valueOf(paramLong) });
        l = System.currentTimeMillis() - l;
        ab.i("MicroMsg.FTS.FTSIndexDB", "deleteTalkerMsgByTimestamp use time %d talker %s timestamp %s", new Object[] { Long.valueOf(l), paramString, h.formatTime("yyyy-MM-dd HH:mm:ss", paramLong / 1000L) });
        com.tencent.mm.plugin.report.e.pXa.a(729L, 10L, 1L, false);
        if (l <= 500L)
          break;
        com.tencent.mm.plugin.report.e.pXa.a(79L, 11L, 1L, false);
        AppMethodBeat.o(136789);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        long l;
        com.tencent.luggage.g.d.printErrStackTrace("MicroMsg.FTS.FTSDeleteMsgLogic", paramString, "syncDeleteTalkerMsg", new Object[0]);
        AppMethodBeat.o(136789);
        continue;
        if (l > 1000L)
        {
          com.tencent.mm.plugin.report.e.pXa.a(79L, 12L, 1L, false);
          AppMethodBeat.o(136789);
        }
        else
        {
          if (l > 10000L)
            com.tencent.mm.plugin.report.e.pXa.a(79L, 13L, 1L, false);
          AppMethodBeat.o(136789);
        }
      }
    }
  }

  public final void oq(String paramString)
  {
    AppMethodBeat.i(136790);
    com.tencent.luggage.g.d.i("MicroMsg.FTS.FTSDeleteMsgLogic", "start to delete mark talker msg delete %s", new Object[] { paramString });
    if (!g.RK())
    {
      paramString = new b();
      AppMethodBeat.o(136790);
      throw paramString;
    }
    try
    {
      Object localObject1 = ((PluginFTS)g.M(PluginFTS.class)).getFTSIndexDB();
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new java/io/File;
        g.RQ();
        ((File)localObject2).<init>(g.RP().cachePath, "FTS5IndexMicroMsg_encrypt.db");
        boolean bool = ((File)localObject2).exists();
        if (!bool)
          AppMethodBeat.o(136790);
      }
      while (true)
      {
        return;
        localObject2 = new com/tencent/mm/plugin/fts/d;
        g.RQ();
        ((com.tencent.mm.plugin.fts.d)localObject2).<init>(g.RP().cachePath);
        com.tencent.luggage.g.d.i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncMarkTalkerMsgDelete by create new ftsIndexDB");
        long l = System.currentTimeMillis();
        localObject1 = String.format("UPDATE %s SET status=? WHERE aux_index=?;", new Object[] { "FTS5MetaMessage" });
        ((com.tencent.mm.plugin.fts.d)localObject2).mBd.execSQL((String)localObject1, new String[] { "-1", paramString });
        ab.i("MicroMsg.FTS.FTSIndexDB", "markStatusByTalker use time %d talker %s status %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramString, Integer.valueOf(-1) });
        AppMethodBeat.o(136790);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        com.tencent.luggage.g.d.printErrStackTrace("MicroMsg.FTS.FTSDeleteMsgLogic", paramString, "syncDeleteTalkerMsg", new Object[0]);
        AppMethodBeat.o(136790);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.f
 * JD-Core Version:    0.6.2
 */