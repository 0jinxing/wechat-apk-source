package com.tencent.mm.cd;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.repair.DBDumpUtil;
import com.tencent.wcdb.repair.DBDumpUtil.ExecuteSqlCallback;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public class h
  implements com.tencent.mm.sdk.e.f
{
  String TAG;
  public int field_MARK_CURSOR_CHECK_IGNORE;
  private long jsG;
  private a ybO;
  public a ybP;
  private String ybQ;
  public e ybR;
  public String ybS;
  final LinkedList<b> ybT;
  private ak ybU;
  protected f ybk;

  public h()
  {
    AppMethodBeat.i(59102);
    this.field_MARK_CURSOR_CHECK_IGNORE = 1;
    this.TAG = "MicroMsg.SqliteDB";
    this.ybk = null;
    this.ybO = null;
    this.ybP = new a();
    this.ybQ = "";
    this.ybR = null;
    this.ybS = "";
    this.ybT = new LinkedList();
    this.ybU = null;
    this.jsG = 0L;
    AppMethodBeat.o(59102);
  }

  public h(a parama)
  {
    AppMethodBeat.i(59101);
    this.field_MARK_CURSOR_CHECK_IGNORE = 1;
    this.TAG = "MicroMsg.SqliteDB";
    this.ybk = null;
    this.ybO = null;
    this.ybP = new a();
    this.ybQ = "";
    this.ybR = null;
    this.ybS = "";
    this.ybT = new LinkedList();
    this.ybU = null;
    this.jsG = 0L;
    this.ybO = parama;
    AppMethodBeat.o(59101);
  }

  private void aqw(String paramString)
  {
    AppMethodBeat.i(59107);
    String str1 = ah.getProcessName();
    String str2 = ah.getPackageName();
    ab.i(this.TAG, "check process :[%s] [%s] path[%s]", new Object[] { str1, str2, paramString });
    if ((str1 != null) && (str2 != null) && (!str2.equals(str1)))
      Assert.assertTrue("processName:" + str1 + "  packagename:" + str2, false);
    AppMethodBeat.o(59107);
  }

  public static String escape(String paramString)
  {
    AppMethodBeat.i(59113);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(59113);
    }
    while (true)
    {
      return paramString;
      paramString = DatabaseUtils.sqlEscapeString(paramString);
      AppMethodBeat.o(59113);
    }
  }

  public final long a(String paramString1, String paramString2, ContentValues paramContentValues, boolean paramBoolean)
  {
    AppMethodBeat.i(59122);
    long l;
    if (!isOpen())
    {
      ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
      l = -2L;
      AppMethodBeat.o(59122);
    }
    while (true)
    {
      return l;
      boolean bool = WXHardCoderJNI.hcDBEnable;
      int i = WXHardCoderJNI.hcDBDelayWrite;
      int j = WXHardCoderJNI.hcDBCPU;
      int k = WXHardCoderJNI.hcDBIO;
      int m;
      if (WXHardCoderJNI.hcDBThr)
      {
        m = g.RS().doL();
        label78: m = WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcDBTimeout, 501, WXHardCoderJNI.hcDBActionWrite, this.TAG);
        c.begin();
      }
      try
      {
        l = this.ybk.insert(paramString1, paramString2, paramContentValues);
        c.a(paramString1, null, this.jsG);
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
        AppMethodBeat.o(59122);
        continue;
        m = 0;
        break label78;
      }
      catch (Exception paramString1)
      {
        com.tencent.mm.plugin.report.e.pXa.a(181L, 11L, 1L, false);
        paramContentValues = this.TAG;
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>("insert Error :");
        ab.e(paramContentValues, paramString1.getMessage());
        c.k(paramString1);
        if (paramBoolean)
        {
          AppMethodBeat.o(59122);
          throw paramString1;
        }
      }
      finally
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
        AppMethodBeat.o(59122);
      }
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
      l = -1L;
      AppMethodBeat.o(59122);
    }
  }

  public final Cursor a(String paramString, String[] paramArrayOfString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(59116);
    boolean bool;
    if (!bo.isNullOrNil(paramString))
    {
      bool = true;
      Assert.assertTrue("sql is null ", bool);
      if (isOpen())
        break label71;
      ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
      paramString = d.dvo();
      AppMethodBeat.o(59116);
    }
    while (true)
    {
      return paramString;
      bool = false;
      break;
      label71: bool = WXHardCoderJNI.hcDBEnable;
      int j = WXHardCoderJNI.hcDBDelayQuery;
      int k = WXHardCoderJNI.hcDBCPU;
      int m = WXHardCoderJNI.hcDBIO;
      if (WXHardCoderJNI.hcDBThr)
        i = g.RS().doL();
      i = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcDBTimeout, 501, WXHardCoderJNI.hcDBActionQuery, this.TAG);
      c.begin();
      try
      {
        paramArrayOfString = this.ybk.a(paramString, paramArrayOfString, paramInt);
        if ((b.dnM()) || (b.dnO()))
        {
          if (this.ybU == null)
          {
            localObject1 = com.tencent.mm.sdk.g.d.anM("CheckCursor");
            ((HandlerThread)localObject1).start();
            localObject2 = new com/tencent/mm/sdk/platformtools/ak;
            ((ak)localObject2).<init>(((HandlerThread)localObject1).getLooper());
            this.ybU = ((ak)localObject2);
          }
          localObject2 = new com/tencent/mm/cd/h$c;
          ((c)localObject2).<init>();
          ak localak = this.ybU;
          Object localObject1 = new com/tencent/mm/cd/h$1;
          ((1)localObject1).<init>(this, paramArrayOfString, paramString, (c)localObject2);
          localak.postDelayed((Runnable)localObject1, 500L);
        }
        c.a(paramString, paramArrayOfString, this.jsG);
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, i);
        AppMethodBeat.o(59116);
        paramString = paramArrayOfString;
      }
      catch (Exception paramArrayOfString)
      {
        com.tencent.mm.plugin.report.e.pXa.a(181L, 10L, 1L, false);
        Object localObject2 = this.TAG;
        paramString = new java/lang/StringBuilder;
        paramString.<init>("execSQL Error :");
        ab.e((String)localObject2, paramArrayOfString.getMessage());
        c.k(paramArrayOfString);
        paramString = d.dvo();
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, i);
        AppMethodBeat.o(59116);
      }
      finally
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, i);
        AppMethodBeat.o(59116);
      }
    }
    throw paramString;
  }

  public final Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    AppMethodBeat.i(59115);
    if (!isOpen())
    {
      ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
      paramString1 = d.dvo();
      AppMethodBeat.o(59115);
    }
    while (true)
    {
      return paramString1;
      boolean bool = WXHardCoderJNI.hcDBEnable;
      int i = WXHardCoderJNI.hcDBDelayQuery;
      int j = WXHardCoderJNI.hcDBCPU;
      int k = WXHardCoderJNI.hcDBIO;
      int m;
      if (WXHardCoderJNI.hcDBThr)
      {
        m = g.RS().doL();
        label78: m = WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcDBTimeout, 501, WXHardCoderJNI.hcDBActionQuery, this.TAG);
        c.begin();
      }
      try
      {
        paramArrayOfString1 = this.ybk.a(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramInt);
        c.a(paramString1, paramArrayOfString1, this.jsG);
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
        AppMethodBeat.o(59115);
        paramString1 = paramArrayOfString1;
        continue;
        m = 0;
        break label78;
      }
      catch (Exception paramString1)
      {
        com.tencent.mm.plugin.report.e.pXa.a(181L, 10L, 1L, false);
        paramArrayOfString1 = this.TAG;
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>("execSQL Error :");
        ab.e(paramArrayOfString1, paramString1.getMessage());
        c.k(paramString1);
        paramString1 = d.dvo();
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
        AppMethodBeat.o(59115);
      }
      finally
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
        AppMethodBeat.o(59115);
      }
    }
    throw paramString1;
  }

  public final boolean a(String paramString1, String paramString2, long paramLong, HashMap<Integer, d> paramHashMap)
  {
    AppMethodBeat.i(59110);
    boolean bool = b(paramString1, paramString2, "", paramLong, paramHashMap, true);
    AppMethodBeat.o(59110);
    return bool;
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, List<String> paramList, DBDumpUtil.ExecuteSqlCallback paramExecuteSqlCallback)
  {
    boolean bool = false;
    AppMethodBeat.i(59118);
    if (!isOpen())
    {
      ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
      AppMethodBeat.o(59118);
    }
    while (true)
    {
      return bool;
      bool = DBDumpUtil.doRecoveryDb(this.ybk.ybt, paramString1, paramString2, paramString3, paramList, null, paramExecuteSqlCallback, true);
      AppMethodBeat.o(59118);
    }
  }

  public final boolean aqx(String paramString)
  {
    AppMethodBeat.i(59126);
    if (!isOpen())
    {
      ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
      AppMethodBeat.o(59126);
    }
    while (true)
    {
      return false;
      try
      {
        this.ybk.execSQL("DROP TABLE ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(59126);
      }
      catch (Exception paramString)
      {
        com.tencent.mm.plugin.report.e.pXa.a(181L, 11L, 1L, false);
        ab.e(this.TAG, "drop table Error :" + paramString.getMessage());
        c.k(paramString);
        AppMethodBeat.o(59126);
      }
    }
  }

  public final boolean b(String paramString1, String paramString2, String paramString3, long paramLong, HashMap<Integer, d> paramHashMap, boolean paramBoolean)
  {
    AppMethodBeat.i(59109);
    int i = paramString1.lastIndexOf("/");
    if (i != -1)
      this.TAG = (this.TAG + "." + paramString1.substring(i + 1));
    aqw(paramString2);
    if ((this.ybP.a(paramString1, paramString2, paramString3, paramLong, paramHashMap, paramBoolean)) && (this.ybP.ybk != null))
    {
      this.ybS = this.ybP.getError();
      this.ybk = this.ybP.ybk;
      paramBoolean = true;
      AppMethodBeat.o(59109);
    }
    while (true)
    {
      return paramBoolean;
      this.ybS = this.ybP.getError();
      this.ybk = null;
      this.ybP = null;
      ab.i(this.TAG, "initDB failed. %s", new Object[] { this.ybS });
      paramBoolean = false;
      AppMethodBeat.o(59109);
    }
  }

  public final boolean b(String paramString, HashMap<Integer, d> paramHashMap, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(59108);
    int i = paramString.lastIndexOf("/");
    if (i != -1)
      this.TAG = (this.TAG + "." + paramString.substring(i + 1));
    aqw(paramString);
    if ((this.ybP.a(paramString, paramHashMap, paramBoolean)) && (this.ybP.ybk != null))
    {
      this.ybk = this.ybP.ybk;
      ab.i(this.TAG, "SqliteDB db %s", new Object[] { this.ybk });
      AppMethodBeat.o(59108);
    }
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      return paramBoolean;
      this.ybk = null;
      this.ybP = null;
      ab.e(this.TAG, "initDB failed.");
      AppMethodBeat.o(59108);
    }
  }

  public void closeDB()
  {
    AppMethodBeat.i(59104);
    jC(null);
    AppMethodBeat.o(59104);
  }

  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    int i = 0;
    AppMethodBeat.i(59125);
    if (!isOpen())
    {
      ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
      i = -2;
      AppMethodBeat.o(59125);
    }
    while (true)
    {
      return i;
      boolean bool = WXHardCoderJNI.hcDBEnable;
      int j = WXHardCoderJNI.hcDBDelayWrite;
      int k = WXHardCoderJNI.hcDBCPU;
      int m = WXHardCoderJNI.hcDBIO;
      if (WXHardCoderJNI.hcDBThr)
        i = g.RS().doL();
      j = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcDBTimeout, 501, WXHardCoderJNI.hcDBActionWrite, this.TAG);
      c.begin();
      try
      {
        i = this.ybk.delete(paramString1, paramString2, paramArrayOfString);
        c.a(paramString1, null, this.jsG);
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, j);
        AppMethodBeat.o(59125);
      }
      catch (Exception paramArrayOfString)
      {
        com.tencent.mm.plugin.report.e.pXa.a(181L, 11L, 1L, false);
        paramString1 = this.TAG;
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>("delete Error :");
        ab.e(paramString1, paramArrayOfString.getMessage());
        c.k(paramArrayOfString);
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, j);
        i = -1;
        AppMethodBeat.o(59125);
      }
      finally
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, j);
        AppMethodBeat.o(59125);
      }
    }
    throw paramString1;
  }

  public final boolean dpU()
  {
    AppMethodBeat.i(59106);
    boolean bool;
    if ((this.ybk == null) || (!this.ybk.isOpen()))
    {
      bool = true;
      AppMethodBeat.o(59106);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59106);
    }
  }

  public final f dvw()
  {
    return this.ybk;
  }

  public final SQLiteDatabase dvx()
  {
    Object localObject = this.ybk;
    if (((f)localObject).ybt != null);
    for (localObject = ((f)localObject).ybt; ; localObject = ((f)localObject).ybu)
      return localObject;
  }

  protected void finalize()
  {
    AppMethodBeat.i(59103);
    jC(null);
    AppMethodBeat.o(59103);
  }

  public final String getKey()
  {
    if (this.ybP == null);
    for (String str = null; ; str = this.ybP.key)
      return str;
  }

  public final long getPageSize()
  {
    AppMethodBeat.i(59119);
    long l = this.ybk.ybt.getPageSize();
    AppMethodBeat.o(59119);
    return l;
  }

  public final String getPath()
  {
    AppMethodBeat.i(59112);
    String str;
    if (!isOpen())
    {
      ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
      str = null;
      AppMethodBeat.o(59112);
    }
    while (true)
    {
      return str;
      str = this.ybk.getPath();
      AppMethodBeat.o(59112);
    }
  }

  public final boolean hY(String paramString1, String paramString2)
  {
    AppMethodBeat.i(59120);
    boolean bool;
    if (!bo.isNullOrNil(paramString2))
    {
      bool = true;
      Assert.assertTrue("sql is null ", bool);
      if (isOpen())
        break label63;
      ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
      bool = false;
      AppMethodBeat.o(59120);
    }
    while (true)
    {
      return bool;
      bool = false;
      break;
      label63: bool = WXHardCoderJNI.hcDBEnable;
      int i = WXHardCoderJNI.hcDBDelayWrite;
      int j = WXHardCoderJNI.hcDBCPU;
      int k = WXHardCoderJNI.hcDBIO;
      int m;
      if (WXHardCoderJNI.hcDBThr)
      {
        m = g.RS().doL();
        label96: m = WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcDBTimeout, 501, WXHardCoderJNI.hcDBActionWrite, this.TAG);
        c.begin();
      }
      try
      {
        this.ybk.execSQL(paramString2);
        c.a(paramString2, null, this.jsG);
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
        bool = true;
        AppMethodBeat.o(59120);
        continue;
        m = 0;
        break label96;
      }
      catch (Exception paramString1)
      {
        com.tencent.mm.plugin.report.e.pXa.a(181L, 11L, 1L, false);
        paramString2 = paramString1.getMessage();
        ab.e(this.TAG, "execSQL Error :".concat(String.valueOf(paramString2)));
        if ((paramString2 != null) && (paramString2.contains("no such table")))
        {
          paramString2 = this.ybP;
          ab.d("MicroMsg.DBInit", "resetIniCache iniFilename:%s", new Object[] { paramString2.ybl });
          com.tencent.mm.vfs.e.deleteFile(paramString2.ybl);
          if (this.ybR != null)
            this.ybR.RI();
          AppMethodBeat.o(59120);
          throw paramString1;
        }
      }
      finally
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
        AppMethodBeat.o(59120);
      }
      c.k(paramString1);
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
      bool = false;
      AppMethodBeat.o(59120);
    }
  }

  public final long iV(long paramLong)
  {
    long l1 = -1L;
    while (true)
    {
      long l2;
      Object localObject1;
      try
      {
        AppMethodBeat.i(59127);
        l2 = Thread.currentThread().getId();
        ab.i(this.TAG, "beginTransaction thr:(%d,%d) ticket:%d db:%b", new Object[] { Long.valueOf(paramLong), Long.valueOf(l2), Long.valueOf(this.jsG), Boolean.valueOf(isOpen()) });
        if (!isOpen())
        {
          ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
          paramLong = -4L;
          AppMethodBeat.o(59127);
          return paramLong;
        }
        if (this.jsG > 0L)
        {
          localObject1 = this.TAG;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("ERROR beginTransaction transactionTicket:");
          ab.e((String)localObject1, this.jsG);
          AppMethodBeat.o(59127);
          paramLong = l1;
          continue;
        }
      }
      finally
      {
      }
      if ((!al.isMainThread()) && (paramLong == -1L))
      {
        ab.e(this.TAG, "FORBID: beginTrans UNKNOW_THREAD ParamID:%d nowThr:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(l2) });
        paramLong = -2L;
        AppMethodBeat.o(59127);
      }
      else
      {
        try
        {
          c.begin();
          this.ybk.beginTransaction();
          c.a("beginTrans", null, 0L);
          this.jsG = (bo.anU() & 0x7FFFFFFF);
          this.jsG |= (l2 & 0x7FFFFFFF) << 32;
          if (this.ybO != null)
            this.ybO.RG();
          paramLong = this.jsG;
          AppMethodBeat.o(59127);
        }
        catch (Exception localException)
        {
          com.tencent.mm.plugin.report.e.pXa.a(181L, 8L, 1L, false);
          String str = this.TAG;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("beginTransaction Error :");
          ab.e(str, localException.getMessage());
          c.k(localException);
          paramLong = -3L;
          AppMethodBeat.o(59127);
        }
      }
    }
  }

  public final boolean inTransaction()
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(59129);
      if (!isOpen())
      {
        ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
        AppMethodBeat.o(59129);
      }
      while (true)
      {
        return bool;
        if (this.jsG > 0L)
        {
          AppMethodBeat.o(59129);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(59129);
        }
      }
    }
    finally
    {
    }
  }

  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    AppMethodBeat.i(59121);
    long l = a(paramString1, paramString2, paramContentValues, false);
    AppMethodBeat.o(59121);
    return l;
  }

  public final boolean isOpen()
  {
    AppMethodBeat.i(59111);
    boolean bool;
    if ((this.ybk != null) && (this.ybk.isOpen()))
    {
      bool = true;
      AppMethodBeat.o(59111);
    }
    while (true)
    {
      return bool;
      Assert.assertTrue("DB has been closed :[" + this.ybQ + "]", bo.isNullOrNil(this.ybQ));
      bool = false;
      AppMethodBeat.o(59111);
    }
  }

  public void jC(String paramString)
  {
    AppMethodBeat.i(59105);
    if (this.ybk == null)
      AppMethodBeat.o(59105);
    while (true)
    {
      return;
      if (this.ybO != null)
        this.ybO.RF();
      ab.w(this.TAG, "begin close db, inTrans:%b ticket:%s  thr:%d {%s}", new Object[] { Boolean.valueOf(inTransaction()), Long.toHexString(this.jsG), Long.valueOf(Thread.currentThread().getId()), bo.dpG() });
      g.a locala = new g.a();
      if (paramString != null)
        this.ybQ = paramString;
      this.ybk.close();
      this.ybk = null;
      ab.d(this.TAG, "end close db time:%d", new Object[] { Long.valueOf(locala.Mr()) });
      AppMethodBeat.o(59105);
    }
  }

  public final int mB(long paramLong)
  {
    int i = 0;
    while (true)
    {
      long l1;
      long l2;
      String str;
      try
      {
        AppMethodBeat.i(59128);
        l1 = bo.anU();
        l2 = Thread.currentThread().getId();
        ab.i(this.TAG, "endTransaction thr:%d ticket:(%d,%d) db:%b", new Object[] { Long.valueOf(l2), Long.valueOf(paramLong), Long.valueOf(this.jsG), Boolean.valueOf(isOpen()) });
        if (!isOpen())
        {
          ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
          i = -4;
          AppMethodBeat.o(59128);
          return i;
        }
        if (paramLong != this.jsG)
        {
          str = this.TAG;
          StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>("ERROR endTransaction ticket:");
          ab.e(str, paramLong + " transactionTicket:" + this.jsG);
          i = -1;
          AppMethodBeat.o(59128);
          continue;
        }
      }
      finally
      {
      }
      long l3 = paramLong >> 32 & 0x7FFFFFFF;
      if (l3 != l2)
      {
        ab.e(this.TAG, "FORBID: endTrans UNKNOW_THREAD ticket:%s ParamID:%d nowThr:%d", new Object[] { Long.toHexString(paramLong), Long.valueOf(l3), Long.valueOf(l2) });
        i = -2;
        AppMethodBeat.o(59128);
      }
      else
      {
        try
        {
          c.begin();
          this.ybk.endTransaction();
          ab.i(this.TAG, "endTransaction Succ Time:%d thr:%d ticket:(%d,%d) db:%b", new Object[] { Long.valueOf(bo.gb(l1)), Long.valueOf(l2), Long.valueOf(paramLong), Long.valueOf(this.jsG), Boolean.valueOf(isOpen()) });
          c.a("endTrans", null, 0L);
          this.jsG = 0L;
          if (this.ybO != null)
            this.ybO.RH();
          AppMethodBeat.o(59128);
        }
        catch (Exception localException)
        {
          str = this.TAG;
          StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>("endTransaction Error :");
          ab.e(str, localException.getMessage());
          com.tencent.mm.plugin.report.e.pXa.a(181L, 9L, 1L, false);
          c.k(localException);
          i = -3;
          AppMethodBeat.o(59128);
        }
      }
    }
  }

  public final Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(59114);
    paramString1 = a(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, 0);
    AppMethodBeat.o(59114);
    return paramString1;
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(138435);
    paramString = a(paramString, paramArrayOfString, 0);
    AppMethodBeat.o(138435);
    return paramString;
  }

  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    int i = 0;
    AppMethodBeat.i(59124);
    long l;
    if (!isOpen())
    {
      ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
      l = -2L;
      AppMethodBeat.o(59124);
    }
    while (true)
    {
      return l;
      boolean bool = WXHardCoderJNI.hcDBEnable;
      int j = WXHardCoderJNI.hcDBDelayWrite;
      int k = WXHardCoderJNI.hcDBCPU;
      int m = WXHardCoderJNI.hcDBIO;
      if (WXHardCoderJNI.hcDBThr)
        i = g.RS().doL();
      i = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcDBTimeout, 501, WXHardCoderJNI.hcDBActionWrite, this.TAG);
      c.begin();
      try
      {
        l = this.ybk.replace(paramString1, paramString2, paramContentValues);
        c.a(paramString1, null, this.jsG);
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, i);
        AppMethodBeat.o(59124);
      }
      catch (Exception paramString1)
      {
        com.tencent.mm.plugin.report.e.pXa.a(181L, 11L, 1L, false);
        paramContentValues = this.TAG;
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>("repalce  Error :");
        ab.e(paramContentValues, paramString1.getMessage());
        c.k(paramString1);
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, i);
        l = -1L;
        AppMethodBeat.o(59124);
      }
      finally
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, i);
        AppMethodBeat.o(59124);
      }
    }
    throw paramString1;
  }

  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(59123);
    int i;
    if (!isOpen())
    {
      ab.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bo.dpG() });
      i = -2;
      AppMethodBeat.o(59123);
    }
    while (true)
    {
      return i;
      boolean bool = WXHardCoderJNI.hcDBEnable;
      int j = WXHardCoderJNI.hcDBDelayWrite;
      int k = WXHardCoderJNI.hcDBCPU;
      int m = WXHardCoderJNI.hcDBIO;
      if (WXHardCoderJNI.hcDBThr)
      {
        i = g.RS().doL();
        label79: m = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcDBTimeout, 501, WXHardCoderJNI.hcDBActionWrite, this.TAG);
        c.begin();
      }
      try
      {
        i = this.ybk.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
        c.a(paramString1, null, this.jsG);
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
        AppMethodBeat.o(59123);
        continue;
        i = 0;
        break label79;
      }
      catch (Exception paramString1)
      {
        com.tencent.mm.plugin.report.e.pXa.a(181L, 11L, 1L, false);
        paramString2 = this.TAG;
        paramContentValues = new java/lang/StringBuilder;
        paramContentValues.<init>("update Error :");
        ab.e(paramString2, paramString1.getMessage());
        c.k(paramString1);
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
        i = -1;
        AppMethodBeat.o(59123);
      }
      finally
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcDBEnable, m);
        AppMethodBeat.o(59123);
      }
    }
    throw paramString1;
  }

  public static abstract interface a
  {
    public abstract void RF();

    public abstract void RG();

    public abstract void RH();
  }

  public static final class b
  {
    public long lastReportTime;
    public String table;
    public WeakReference<Cursor> ybY;
    public String ybZ;
    public long yca;
    public boolean ycb;
    public String ycc;
    public h.c ycd;
  }

  static final class c extends AssertionError
  {
    c()
    {
    }

    c(String paramString)
    {
      super();
    }
  }

  public static abstract interface d
  {
    public abstract String[] Af();
  }

  public static abstract interface e
  {
    public abstract void RI();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.h
 * JD-Core Version:    0.6.2
 */