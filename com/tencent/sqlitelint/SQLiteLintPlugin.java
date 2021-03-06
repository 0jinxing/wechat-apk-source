package com.tencent.sqlitelint;

import android.app.Application;
import android.content.Context;
import com.tencent.matrix.b.c;
import com.tencent.matrix.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.behaviour.report.IssueReportBehaviour.IReportDelegate;
import com.tencent.sqlitelint.config.SQLiteLintConfig;
import com.tencent.sqlitelint.config.SQLiteLintConfig.ConcernDb;
import com.tencent.sqlitelint.util.SLog;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class SQLiteLintPlugin extends com.tencent.matrix.b.b
{
  private static final String TAG = "Matrix.SQLiteLintPlugin";
  private final SQLiteLintConfig mConfig;
  private Context mContext;

  public SQLiteLintPlugin(SQLiteLintConfig paramSQLiteLintConfig)
  {
    this.mConfig = paramSQLiteLintConfig;
  }

  private void reportMatrixIssue(SQLiteLintIssue paramSQLiteLintIssue)
  {
    AppMethodBeat.i(94030);
    SLog.i("Matrix.SQLiteLintPlugin", "reportMatrixIssue type:%d, isNew %b", new Object[] { Integer.valueOf(paramSQLiteLintIssue.type), Boolean.valueOf(paramSQLiteLintIssue.isNew) });
    if (!paramSQLiteLintIssue.isNew)
      AppMethodBeat.o(94030);
    while (true)
    {
      return;
      com.tencent.matrix.c.b localb = new com.tencent.matrix.c.b(paramSQLiteLintIssue.type);
      localb.key = paramSQLiteLintIssue.id;
      JSONObject localJSONObject = new JSONObject();
      localb.bWv = localJSONObject;
      try
      {
        localJSONObject.put("machine", a.aC(getApplication()));
        localJSONObject.put("id", paramSQLiteLintIssue.id);
        localJSONObject.put("dbPath", paramSQLiteLintIssue.dbPath);
        localJSONObject.put("level", paramSQLiteLintIssue.level);
        localJSONObject.put("sql", paramSQLiteLintIssue.sql);
        localJSONObject.put("table", paramSQLiteLintIssue.table);
        localJSONObject.put("desc", paramSQLiteLintIssue.desc);
        localJSONObject.put("detail", paramSQLiteLintIssue.detail);
        localJSONObject.put("advice", paramSQLiteLintIssue.advice);
        localJSONObject.put("createTime", paramSQLiteLintIssue.createTime);
        localJSONObject.put("stack", paramSQLiteLintIssue.extInfo);
        localJSONObject.put("sqlTimeCost", paramSQLiteLintIssue.sqlTimeCost);
        localJSONObject.put("isInMainThread", paramSQLiteLintIssue.isInMainThread);
        onDetectIssue(localb);
        AppMethodBeat.o(94030);
      }
      catch (JSONException paramSQLiteLintIssue)
      {
        while (true)
          SLog.i("Matrix.SQLiteLintPlugin", "reportMatrixIssue e:%s", new Object[] { paramSQLiteLintIssue.getLocalizedMessage() });
      }
    }
  }

  public void addConcernedDB(SQLiteLintConfig.ConcernDb paramConcernDb)
  {
    AppMethodBeat.i(94029);
    if (!isPluginStarted())
    {
      SLog.i("Matrix.SQLiteLintPlugin", "addConcernedDB isPluginStarted not", new Object[0]);
      AppMethodBeat.o(94029);
    }
    while (true)
    {
      return;
      if (paramConcernDb == null)
      {
        AppMethodBeat.o(94029);
      }
      else
      {
        this.mConfig.addConcernDB(paramConcernDb);
        String str = paramConcernDb.getInstallEnv().getConcernedDbPath();
        SQLiteLint.install(this.mContext, paramConcernDb.getInstallEnv(), paramConcernDb.getOptions());
        SQLiteLint.setWhiteList(str, paramConcernDb.getWhiteListXmlResId());
        SQLiteLint.enableCheckers(str, paramConcernDb.getEnableCheckerList());
        AppMethodBeat.o(94029);
      }
    }
  }

  public void destroy()
  {
    AppMethodBeat.i(94027);
    super.destroy();
    AppMethodBeat.o(94027);
  }

  public String getTag()
  {
    return "SQLiteLint";
  }

  public void init(Application paramApplication, c paramc)
  {
    AppMethodBeat.i(94024);
    super.init(paramApplication, paramc);
    SQLiteLint.setPackageName(paramApplication);
    this.mContext = paramApplication.getApplicationContext();
    AppMethodBeat.o(94024);
  }

  public void notifySqlExecution(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(94028);
    if (!isPluginStarted())
    {
      SLog.i("Matrix.SQLiteLintPlugin", "notifySqlExecution isPluginStarted not", new Object[0]);
      AppMethodBeat.o(94028);
    }
    while (true)
    {
      return;
      SQLiteLint.notifySqlExecution(paramString1, paramString2, paramInt);
      AppMethodBeat.o(94028);
    }
  }

  public void start()
  {
    AppMethodBeat.i(94025);
    super.start();
    if (!isSupported())
      AppMethodBeat.o(94025);
    while (true)
    {
      return;
      SQLiteLint.setReportDelegate(new IssueReportBehaviour.IReportDelegate()
      {
        public void report(SQLiteLintIssue paramAnonymousSQLiteLintIssue)
        {
          AppMethodBeat.i(94023);
          if (paramAnonymousSQLiteLintIssue == null)
            AppMethodBeat.o(94023);
          while (true)
          {
            return;
            SQLiteLintPlugin.access$000(SQLiteLintPlugin.this, paramAnonymousSQLiteLintIssue);
            AppMethodBeat.o(94023);
          }
        }
      });
      List localList = this.mConfig.getConcernDbList();
      for (int i = 0; i < localList.size(); i++)
      {
        SQLiteLintConfig.ConcernDb localConcernDb = (SQLiteLintConfig.ConcernDb)localList.get(i);
        String str = localConcernDb.getInstallEnv().getConcernedDbPath();
        SQLiteLint.install(this.mContext, localConcernDb.getInstallEnv(), localConcernDb.getOptions());
        SQLiteLint.setWhiteList(str, localConcernDb.getWhiteListXmlResId());
        SQLiteLint.enableCheckers(str, localConcernDb.getEnableCheckerList());
      }
      AppMethodBeat.o(94025);
    }
  }

  public void stop()
  {
    AppMethodBeat.i(94026);
    super.stop();
    if (!isSupported())
      AppMethodBeat.o(94026);
    while (true)
    {
      return;
      List localList = this.mConfig.getConcernDbList();
      for (int i = 0; i < localList.size(); i++)
        SQLiteLint.uninstall(((SQLiteLintConfig.ConcernDb)localList.get(i)).getInstallEnv().getConcernedDbPath());
      SQLiteLint.setReportDelegate(null);
      AppMethodBeat.o(94026);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.SQLiteLintPlugin
 * JD-Core Version:    0.6.2
 */