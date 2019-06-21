package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.d.b.3;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mrs.a.c;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.database.SQLiteTrace.TraceInfo;
import java.util.Iterator;
import java.util.List;

final class PluginBigBallOfMud$14
  implements SQLiteTrace
{
  PluginBigBallOfMud$14(PluginBigBallOfMud paramPluginBigBallOfMud)
  {
  }

  public final void onConnectionObtained(SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong, boolean paramBoolean)
  {
  }

  public final void onConnectionPoolBusy(SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong, boolean paramBoolean, List<SQLiteTrace.TraceInfo<String>> paramList, List<SQLiteTrace.TraceInfo<StackTraceElement[]>> paramList1)
  {
    AppMethodBeat.i(18295);
    paramBoolean = WXHardCoderJNI.hcDBEnable;
    int i = WXHardCoderJNI.hcDBDelayWrite;
    int j = WXHardCoderJNI.hcDBCPU;
    int k = WXHardCoderJNI.hcDBIO;
    if (WXHardCoderJNI.hcDBThr);
    for (int m = g.RS().doL(); ; m = 0)
    {
      WXHardCoderJNI.startPerformance(paramBoolean, i, j, k, m, WXHardCoderJNI.hcDBTimeoutBusy, 501, WXHardCoderJNI.hcDBActionWrite, "MicroMsg.PluginBigBallOfMud");
      AppMethodBeat.o(18295);
      return;
    }
  }

  public final void onDatabaseCorrupted(SQLiteDatabase paramSQLiteDatabase)
  {
  }

  public final void onSQLExecuted(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(18294);
    try
    {
      localb = com.tencent.mm.model.d.b.abr();
      boolean bool1 = al.isMainThread();
      String str1 = paramSQLiteDatabase.getPath();
      a.c.a(paramSQLiteDatabase, paramString, paramLong);
      if (((paramLong > localb.fpl) && (bool1)) || ((paramLong > localb.fpn) && (!bool1)))
      {
        paramSQLiteDatabase = com.tencent.mm.model.d.b.fpu.iterator();
        boolean bool2;
        do
        {
          String str2;
          do
          {
            if (!paramSQLiteDatabase.hasNext())
              break;
            str2 = (String)paramSQLiteDatabase.next();
          }
          while (bool1);
          bool2 = str1.contains(str2);
        }
        while (!bool2);
      }
      while (true)
      {
        AppMethodBeat.o(18294);
        while (true)
        {
          return;
          if ((paramInt == 2) && (bool1) && (paramLong < localb.fpm))
            break;
          if (localb.foQ)
            break label521;
          paramString = paramString.trim().toUpperCase();
          if ((paramString.startsWith("INSERT")) || (paramString.startsWith("UPDATE")) || (paramString.startsWith("DELETE")) || (paramString.startsWith("COMMIT")) || (paramString.startsWith("SELECT")))
            break label350;
          paramSQLiteDatabase = null;
          if (!bo.isNullOrNil(paramSQLiteDatabase))
          {
            paramString = new java/lang/StringBuilder;
            paramString.<init>();
            com.tencent.mm.model.d.b.a("tid", String.valueOf(Thread.currentThread().getId()), paramString);
            com.tencent.mm.model.d.b.a("sql", paramSQLiteDatabase, paramString);
            com.tencent.mm.model.d.b.a("lastTime", String.valueOf(paramLong), paramString);
            if (!com.tencent.mm.sdk.a.b.foreground)
              break label514;
            paramSQLiteDatabase = "1";
            com.tencent.mm.model.d.b.a("foreground", paramSQLiteDatabase, paramString);
            com.tencent.mm.model.d.b.a("tname", Thread.currentThread().getName(), paramString);
            str1 = paramString.toString();
            ab.d("MicroMsg.SQLTraceManager", "SQL Trace mark : ".concat(String.valueOf(str1)));
            paramSQLiteDatabase = aw.RS();
            paramString = new com/tencent/mm/model/d/b$3;
            paramString.<init>(localb, str1);
            paramSQLiteDatabase.aa(paramString);
          }
          AppMethodBeat.o(18294);
        }
      }
    }
    catch (Exception paramSQLiteDatabase)
    {
      while (true)
      {
        com.tencent.mm.model.d.b localb;
        ab.printErrStackTrace("MicroMsg.SQLiteTrace", paramSQLiteDatabase, "Failed to send trace.", new Object[0]);
        AppMethodBeat.o(18294);
        continue;
        label350: if (paramString.startsWith("INSERT"))
          paramSQLiteDatabase = paramString.substring(0, paramString.indexOf("(", 0));
        while (true)
        {
          paramString = paramSQLiteDatabase;
          if (paramSQLiteDatabase.length() > 512)
          {
            paramString = new java/lang/StringBuilder;
            paramString.<init>();
            paramString = paramSQLiteDatabase.substring(0, 512) + "...";
          }
          paramSQLiteDatabase = paramString;
          if (paramString.trim().endsWith(";"))
            break;
          paramSQLiteDatabase = new java/lang/StringBuilder;
          paramSQLiteDatabase.<init>();
          paramSQLiteDatabase = paramString + ";";
          break;
          paramSQLiteDatabase = paramString;
          if (paramString.startsWith("COMMIT"))
          {
            if (paramLong <= localb.fpo)
              break label509;
            paramSQLiteDatabase = new java/lang/StringBuilder;
            paramSQLiteDatabase.<init>();
            paramSQLiteDatabase = paramString + "task:" + bo.dpG();
          }
        }
        label509: paramSQLiteDatabase = null;
        continue;
        label514: paramSQLiteDatabase = "0";
        continue;
        label521: ab.i("MicroMsg.SQLTraceManager", "mark stop as file is full !");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.PluginBigBallOfMud.14
 * JD-Core Version:    0.6.2
 */