package com.tencent.mrs;

import android.app.Application;
import android.database.Cursor;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.d.c.a;
import com.tencent.matrix.mrs.core.IReportCallback;
import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.matrix.mrs.core.MatrixReport.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.f.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mrs.b.b.1;
import com.tencent.mrs.util.MatrixReportBroadcast;
import com.tencent.sqlitelint.ISQLiteExecutionDelegate;
import com.tencent.sqlitelint.SQLiteLint.InstallEnv;
import com.tencent.sqlitelint.SQLiteLint.Options.Builder;
import com.tencent.sqlitelint.SQLiteLint.SqlExecutionCallbackMode;
import com.tencent.sqlitelint.SQLiteLintPlugin;
import com.tencent.sqlitelint.config.SQLiteLintConfig;
import com.tencent.sqlitelint.config.SQLiteLintConfig.ConcernDb;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a
{
  private static com.tencent.mrs.b.b AiV;
  private static b AiW = new b();

  private static boolean atG(String paramString)
  {
    if ((isDebug()) || (d.vxs) || (MatrixReport.with().isNeedReport(paramString)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static SQLiteLintConfig dPb()
  {
    try
    {
      SQLiteLintConfig localSQLiteLintConfig1 = new com/tencent/sqlitelint/config/SQLiteLintConfig;
      localSQLiteLintConfig1.<init>(SQLiteLint.SqlExecutionCallbackMode.CUSTOM_NOTIFY);
      return localSQLiteLintConfig1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        SQLiteLintConfig localSQLiteLintConfig2 = new SQLiteLintConfig(SQLiteLint.SqlExecutionCallbackMode.CUSTOM_NOTIFY);
    }
  }

  public static void dPc()
  {
    if (!MatrixReport.isInstalled())
      com.tencent.matrix.d.c.e("Matrix.Manager", "setUin, matrix report is not installed, just return", new Object[0]);
    while (true)
    {
      return;
      com.tencent.matrix.d.c.i("Matrix.Manager", "matrix report set the uin", new Object[0]);
      Object localObject = MatrixReport.with();
      g.RN();
      ((MatrixReport)localObject).setUin(com.tencent.mm.kernel.a.QF());
      localObject = AiV;
      Looper.getMainLooper();
      Looper.myQueue().addIdleHandler(new b.1((com.tencent.mrs.b.b)localObject));
      MatrixReportBroadcast.dPd();
    }
  }

  private static boolean isDebug()
  {
    if (bp.dpL());
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void j(Application paramApplication)
  {
    com.tencent.matrix.a.a(new c.a()
    {
      public final void d(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        ab.d(paramAnonymousString1, paramAnonymousString2, paramAnonymousArrayOfObject);
      }

      public final void e(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        ab.e(paramAnonymousString1, paramAnonymousString2, paramAnonymousArrayOfObject);
      }

      public final void i(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        ab.i(paramAnonymousString1, paramAnonymousString2, paramAnonymousArrayOfObject);
      }

      public final void printErrStackTrace(String paramAnonymousString1, Throwable paramAnonymousThrowable, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        ab.printErrStackTrace(paramAnonymousString1, paramAnonymousThrowable, paramAnonymousString2, paramAnonymousArrayOfObject);
      }

      public final void v(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        ab.v(paramAnonymousString1, paramAnonymousString2, paramAnonymousArrayOfObject);
      }

      public final void w(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        ab.w(paramAnonymousString1, paramAnonymousString2, paramAnonymousArrayOfObject);
      }
    });
    com.tencent.mrs.b.c localc = new com.tencent.mrs.b.c();
    com.tencent.matrix.d.c.i("Matrix.Manager", "Process:" + ah.getProcessName() + ", IS_RC_VERSION:" + d.vxp + ", isMonkeyEnv:" + bp.dnM(), new Object[0]);
    com.tencent.matrix.d.c.i("Matrix.Manager", "BuildInfo.ENABLE_MATRIX:" + f.ENABLE_MATRIX + ", ENABLE_MATRIX_TRACE:" + f.ENABLE_MATRIX_TRACE + ", BuildInfo.ENABLE_FPS_ANALYSE:" + f.ENABLE_FPS_ANALYSE, new Object[0]);
    boolean bool1 = f.ENABLE_MATRIX;
    boolean bool2;
    if ((bool1) && (f.ENABLE_MATRIX_TRACE))
    {
      bool2 = true;
      if ((!bool1) || (!f.ENABLE_FPS_ANALYSE))
        break label199;
    }
    label199: for (boolean bool3 = true; ; bool3 = false)
    {
      com.tencent.matrix.d.c.i("Matrix.Manager", "matrixEnable:" + bool1 + ", traceEnable:" + bool2 + ", fpsEnable:" + bool3, new Object[0]);
      if (bool1)
        break label205;
      return;
      bool2 = false;
      break;
    }
    label205: com.tencent.matrix.d.c.i("Matrix.Manager", "try to init matrix report", new Object[0]);
    Object localObject1 = new MatrixReport.Builder(ah.getContext()).clientVersion(d.vxo).isDebug(bp.dnM()).revision(f.REV).processName(ah.getProcessName()).isReportProcess(ah.bqo());
    long l;
    if (d.vxs)
      l = 1L;
    while (true)
    {
      Object localObject2 = ((MatrixReport.Builder)localObject1).publishType(l).build();
      MatrixReport.init((MatrixReport)localObject2, AiW);
      localObject1 = new com.tencent.matrix.a.a(paramApplication);
      if ((bool1) && (localObject2 != null) && (ah.bqo()))
      {
        localObject2 = new com.tencent.matrix.trace.a.a.a();
        ((com.tencent.matrix.trace.a.a.a)localObject2).bYH.bWX = localc;
        bool2 = atG("Trace_FPS");
        ((com.tencent.matrix.trace.a.a.a)localObject2).bYH.bYA = bool2;
        bool2 = atG("Trace_EvilMethod");
        ((com.tencent.matrix.trace.a.a.a)localObject2).bYH.bYB = bool2;
        bool2 = atG("Trace_StartUp");
        ((com.tencent.matrix.trace.a.a.a)localObject2).bYH.bYC = bool2;
        ((com.tencent.matrix.trace.a.a.a)localObject2).bYH.bYD = true;
        ((com.tencent.matrix.trace.a.a.a)localObject2).bYH.bYF = "com.tencent.mm.app.WeChatSplashActivity;";
        ((com.tencent.matrix.trace.a.a.a)localObject2).bYH.isDebug = true;
        ((com.tencent.matrix.trace.a.a.a)localObject2).bYH.bYE = false;
        ((com.tencent.matrix.a.a)localObject1).a(new com.tencent.matrix.trace.a(((com.tencent.matrix.trace.a.a.a)localObject2).bYH));
      }
      if (bool1)
      {
        localObject2 = new com.tencent.matrix.resource.b.a.a();
        ((com.tencent.matrix.resource.b.a.a)localObject2).bWX = localc;
        ((com.tencent.matrix.resource.b.a.a)localObject2).bWV = bp.dnM();
        ((com.tencent.matrix.a.a)localObject1).a(new com.tencent.matrix.resource.b(new com.tencent.matrix.resource.b.a(((com.tencent.matrix.resource.b.a.a)localObject2).bWX, ((com.tencent.matrix.resource.b.a.a)localObject2).bWV, ((com.tencent.matrix.resource.b.a.a)localObject2).bWW, (byte)0)));
        com.tencent.matrix.resource.b.a(paramApplication);
        localObject2 = new com.tencent.matrix.iocanary.a.a.a();
        ((com.tencent.matrix.iocanary.a.a.a)localObject2).bUG = localc;
        ((com.tencent.matrix.a.a)localObject1).a(new com.tencent.matrix.iocanary.a(new com.tencent.matrix.iocanary.a.a(((com.tencent.matrix.iocanary.a.a.a)localObject2).bUG, (byte)0)));
        ((com.tencent.matrix.a.a)localObject1).a(new SQLiteLintPlugin(dPb()));
      }
      AiV = new com.tencent.mrs.b.b(paramApplication);
      ((com.tencent.matrix.a.a)localObject1).pluginListener = AiV;
      if (((com.tencent.matrix.a.a)localObject1).pluginListener == null)
        ((com.tencent.matrix.a.a)localObject1).pluginListener = new com.tencent.matrix.b.a(((com.tencent.matrix.a.a)localObject1).application);
      com.tencent.matrix.a.a(new com.tencent.matrix.a(((com.tencent.matrix.a.a)localObject1).application, ((com.tencent.matrix.a.a)localObject1).pluginListener, ((com.tencent.matrix.a.a)localObject1).bUC, (byte)0));
      paramApplication = com.tencent.matrix.a.yK().bUC.iterator();
      while (paramApplication.hasNext())
        ((com.tencent.matrix.b.b)paramApplication.next()).start();
      break;
      if (d.vxr)
      {
        l = 2L;
      }
      else if (d.vxp)
      {
        l = 3L;
      }
      else if (d.vxq)
      {
        l = 4L;
      }
      else
      {
        com.tencent.matrix.d.c.e("Matrix.Manager", "Error ClientVersion, ver:" + d.vxo, new Object[0]);
        l = -1L;
      }
    }
  }

  public static void onDestroy()
  {
    if (!MatrixReport.isInstalled())
      com.tencent.matrix.d.c.e("Matrix.Manager", "onDestroy, matrix report is not installed, just return", new Object[0]);
    while (true)
    {
      return;
      MatrixReport.with().onDestroy();
    }
  }

  public static void onForeground(boolean paramBoolean)
  {
    if (!MatrixReport.isInstalled())
      com.tencent.matrix.d.c.e("Matrix.Manager", "onForeground, matrix report is not installed, just return", new Object[0]);
    while (true)
    {
      return;
      MatrixReport.with().onForeground(paramBoolean);
      Iterator localIterator = com.tencent.matrix.a.yK().bUC.iterator();
      while (localIterator.hasNext())
        ((com.tencent.matrix.b.b)localIterator.next()).onForeground(paramBoolean);
    }
  }

  static final class a
    implements ISQLiteExecutionDelegate
  {
    private final SQLiteDatabase mDb;

    a(SQLiteDatabase paramSQLiteDatabase)
    {
      this.mDb = paramSQLiteDatabase;
    }

    public final void execSQL(String paramString)
    {
      if (!this.mDb.isOpen())
        ab.w("Matrix.Manager", "rawQuery db close", new Object[0]);
      while (true)
      {
        return;
        this.mDb.execSQL(paramString);
      }
    }

    public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
    {
      if (!this.mDb.isOpen())
        ab.w("Matrix.Manager", "rawQuery db close", new Object[0]);
      for (paramString = null; ; paramString = this.mDb.rawQuery(paramString, paramArrayOfString))
        return paramString;
    }
  }

  static final class b
    implements IReportCallback
  {
    public final void onStatusChanged(Map<String, Boolean> paramMap)
    {
      Iterator localIterator1 = paramMap.keySet().iterator();
      while (localIterator1.hasNext())
      {
        String str = (String)localIterator1.next();
        boolean bool = ((Boolean)paramMap.get(str)).booleanValue();
        Iterator localIterator2 = com.tencent.matrix.a.yK().bUC.iterator();
        while (localIterator2.hasNext())
        {
          com.tencent.matrix.b.b localb = (com.tencent.matrix.b.b)localIterator2.next();
          if (localb == null)
          {
            ab.e("Matrix.Manager", "plugin is null");
          }
          else
          {
            Object localObject;
            if ((localb.getTag().equals("Trace")) && (str.startsWith("Trace")))
            {
              localObject = (com.tencent.matrix.trace.a)localb;
              if (localObject == null)
              {
                ab.e("Matrix.Manager", "change plugin to tracePlugin fail");
              }
              else
              {
                int i = -1;
                switch (str.hashCode())
                {
                default:
                  switch (i)
                  {
                  default:
                    label180: localObject = null;
                  case 0:
                  case 1:
                  case 2:
                  }
                  break;
                case -1864660637:
                case -935762161:
                case -1566431569:
                }
                while (localObject != null)
                {
                  if (bool)
                    break label333;
                  ab.i("Matrix.Manager", "%s#onCloseTrace", new Object[] { str });
                  ((e)localObject).zF();
                  if (!(localObject instanceof com.tencent.matrix.trace.f.b))
                    break;
                  com.tencent.matrix.trace.a.zv().onStop();
                  break;
                  if (!str.equals("Trace_StartUp"))
                    break label180;
                  i = 0;
                  break label180;
                  if (!str.equals("Trace_EvilMethod"))
                    break label180;
                  i = 1;
                  break label180;
                  if (!str.equals("Trace_FPS"))
                    break label180;
                  i = 2;
                  break label180;
                  localObject = ((com.tencent.matrix.trace.a)localObject).bYw;
                  continue;
                  localObject = ((com.tencent.matrix.trace.a)localObject).bYv;
                  continue;
                  localObject = ((com.tencent.matrix.trace.a)localObject).bYx;
                }
                label333: ab.i("Matrix.Manager", "%s#onStartTrace", new Object[] { str });
                if ((localObject instanceof com.tencent.matrix.trace.f.b))
                  com.tencent.matrix.trace.a.zv().onStart();
                ((e)localObject).zE();
              }
            }
            else
            {
              localObject = localb.getTag();
              if (((String)localObject).equals(str))
                if ((localb.isPluginStarted()) && (!bool))
                {
                  ab.i("Matrix.Manager", "%sPlugin#onStop", new Object[] { localObject });
                  localb.stop();
                }
                else if ((localb.isPluginStoped()) && (bool))
                {
                  ab.i("Matrix.Manager", "%sPlugin#onStart", new Object[] { localObject });
                  localb.start();
                }
            }
          }
        }
      }
    }
  }

  public static final class c
  {
    private static Map<String, Boolean> AiX = new HashMap();
    private static SQLiteLintPlugin AiY;

    public static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong)
    {
      if (!com.tencent.matrix.a.isInstalled());
      do
        do
        {
          return;
          if (AiY != null)
            break;
          localObject1 = (SQLiteLintPlugin)com.tencent.matrix.a.yK().F(SQLiteLintPlugin.class);
          AiY = (SQLiteLintPlugin)localObject1;
        }
        while (localObject1 == null);
      while (!AiY.isPluginStarted());
      ab.v("Matrix.Manager", "onSQLExecuted  String sql:%s,  timeCost:%d", new Object[] { paramString, Long.valueOf(paramLong) });
      Object localObject1 = paramSQLiteDatabase.getPath();
      Object localObject2;
      if (!AiX.containsKey(localObject1))
      {
        localObject2 = new SQLiteLint.InstallEnv((String)localObject1, new a.a(paramSQLiteDatabase));
        paramSQLiteDatabase = new SQLiteLint.Options.Builder();
        paramSQLiteDatabase.setReportBehaviour(true);
        paramSQLiteDatabase.setAlertBehaviour(false);
        localObject2 = new SQLiteLintConfig.ConcernDb((SQLiteLint.InstallEnv)localObject2, paramSQLiteDatabase.build());
        ((SQLiteLintConfig.ConcernDb)localObject2).enableAvoidAutoIncrementChecker();
        ((SQLiteLintConfig.ConcernDb)localObject2).enableAvoidSelectAllChecker();
        ((SQLiteLintConfig.ConcernDb)localObject2).enableExplainQueryPlanChecker();
        ((SQLiteLintConfig.ConcernDb)localObject2).enableRedundantIndexChecker();
        ((SQLiteLintConfig.ConcernDb)localObject2).enableWithoutRowIdBetterChecker();
        ((SQLiteLintConfig.ConcernDb)localObject2).enablePreparedStatementBetterChecker();
        paramSQLiteDatabase = ((SQLiteLintConfig.ConcernDb)localObject2).getInstallEnv().getConcernedDbPath();
        if (!paramSQLiteDatabase.endsWith("EnMicroMsg.db"))
          break label238;
        ((SQLiteLintConfig.ConcernDb)localObject2).setWhiteListXml(2131165233);
      }
      while (true)
      {
        AiY.addConcernedDB((SQLiteLintConfig.ConcernDb)localObject2);
        AiX.put(localObject1, Boolean.TRUE);
        AiY.notifySqlExecution((String)localObject1, paramString, (int)paramLong);
        break;
        label238: if (paramSQLiteDatabase.endsWith("AppBrandComm.db"))
          ((SQLiteLintConfig.ConcernDb)localObject2).setWhiteListXml(2131165192);
        else if (paramSQLiteDatabase.endsWith("SnsMicroMsg.db"))
          ((SQLiteLintConfig.ConcernDb)localObject2).setWhiteListXml(2131165300);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mrs.a
 * JD-Core Version:    0.6.2
 */