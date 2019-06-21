package com.tencent.mm.model.d;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Process;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ba.m;
import com.tencent.mm.ba.n;
import com.tencent.mm.ba.r;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.av;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class b
  implements c.a
{
  private static final String ceI;
  private static final String ceJ;
  private static b fpj;
  public static final String fpk;
  public static List<String> fpu;
  long[] ceM;
  private SharedPreferences ehZ;
  private long foP;
  public volatile boolean foQ;
  public long fpl;
  public long fpm;
  public long fpn;
  public long fpo;
  long fpp;
  private long fpq;
  private long fpr;
  private long fpt;

  static
  {
    AppMethodBeat.i(16416);
    String str = q.LM();
    ceI = str;
    ceJ = p.getString(str.hashCode());
    fpk = com.tencent.mm.compatible.util.e.eSl + "/tencent/MicroMsg/SQLTrace/";
    fpu = Arrays.asList(new String[] { "FTS5IndexMicroMsg_encrypt.db" });
    AppMethodBeat.o(16416);
  }

  public b()
  {
    AppMethodBeat.i(16395);
    this.foQ = false;
    this.ceM = new long[] { 0L, 0L, 0L };
    this.foP = 0L;
    this.ehZ = ah.doB();
    abs();
    AppMethodBeat.o(16395);
  }

  private static String Bo()
  {
    AppMethodBeat.i(16405);
    String str1 = av.fly.T("login_weixin_username", "");
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = av.fly.T("login_user_name", "never_login_crash");
    AppMethodBeat.o(16405);
    return str2;
  }

  private static long a(String paramString, com.tencent.mm.cd.h paramh)
  {
    AppMethodBeat.i(16400);
    paramString = paramh.a("select count(*) from ".concat(String.valueOf(paramString)), null, 2);
    long l = 0L;
    if (paramString.moveToFirst())
      l = paramString.getLong(0);
    paramString.close();
    AppMethodBeat.o(16400);
    return l;
  }

  private static void a(com.tencent.mm.cd.h paramh, PrintStream paramPrintStream, List<String> paramList)
  {
    AppMethodBeat.i(16402);
    if ((paramh == null) || (!paramh.isOpen()))
    {
      ab.i("MicroMsg.SQLTraceManager", "db is not open!");
      AppMethodBeat.o(16402);
    }
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      if ((paramList != null) && (paramList.size() > 0))
        paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Object localObject = (String)paramList.next();
        paramPrintStream.println("#table : " + (String)localObject + " count=" + a((String)localObject, paramh));
        continue;
        localObject = paramh.a("select name from sqlite_master where type='table' ", null, 2);
        while (((Cursor)localObject).moveToNext())
        {
          paramList = ((Cursor)localObject).getString(0);
          paramPrintStream.println("#table : " + paramList + " count=" + a(paramList, paramh));
        }
        ((Cursor)localObject).close();
      }
      ab.i("MicroMsg.SQLTraceManager", "dump all table count last %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(16402);
    }
  }

  public static void a(String paramString1, String paramString2, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(16403);
    paramStringBuilder.append(paramString1).append(":").append(paramString2).append(" ");
    AppMethodBeat.o(16403);
  }

  private String abm()
  {
    AppMethodBeat.i(16401);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    localPrintStream.println("#client.version=" + d.vxo);
    localPrintStream.println("#accinfo.revision=" + f.REV);
    localPrintStream.println("#accinfo.uin=" + av.fly.T("last_login_uin", ceJ));
    localPrintStream.println("#accinfo.dev=" + ceI);
    localPrintStream.println("#accinfo.build=" + f.TIME + ":" + f.HOSTNAME + ":" + g.cdf);
    try
    {
      Object localObject1 = com.tencent.mm.compatible.util.h.getDataDirectory();
      localObject2 = new android/os/StatFs;
      ((StatFs)localObject2).<init>(((File)localObject1).getPath());
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(com.tencent.mm.compatible.util.e.eSl);
      localObject2 = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[] { Integer.valueOf(((ActivityManager)ah.getContext().getSystemService("activity")).getMemoryClass()), ((File)localObject1).getAbsolutePath(), Integer.valueOf(((StatFs)localObject2).getBlockSize()), Integer.valueOf(((StatFs)localObject2).getBlockCount()), Integer.valueOf(((StatFs)localObject2).getAvailableBlocks()), com.tencent.mm.compatible.util.e.eSl, Integer.valueOf(localStatFs.getBlockSize()), Integer.valueOf(localStatFs.getBlockCount()), Integer.valueOf(localStatFs.getAvailableBlocks()) });
      localPrintStream.println("#accinfo.data=".concat(String.valueOf(localObject2)));
      localObject2 = new Date();
      localObject1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
      localPrintStream.println("#accinfo.uploadTime=" + ((SimpleDateFormat)localObject1).format((Date)localObject2));
      long l1 = bR(ah.getContext());
      if (l1 > 0L)
        localPrintStream.println("#logfile.autoAdapteTime :".concat(String.valueOf(l1)));
      if (bQ(ah.getContext()) != 0L)
      {
        long l2 = bQ(ah.getContext()) - bP(ah.getContext());
        localPrintStream.println("#logfile.fulllast :".concat(String.valueOf(l2)));
        if ((l2 > 0L) && (l2 < 28800000L))
        {
          l1 += 100L;
          PreferenceManager.getDefaultSharedPreferences(ah.getContext()).edit().putLong("sql_trace_log_autoAdaptaTime", l1).commit();
          ab.i("MicroMsg.SQLTraceManager", "auto Adapte Time to %d", new Object[] { Long.valueOf(l1) });
          abs();
        }
        localObject2 = r.aix().lU(21);
        if ((localObject2 != null) && (localObject2.length != 0) && (localObject2[0] != null))
          break label946;
        localPrintStream.println("#traceconfig hardcode");
        if (this.ceM[1] != -1L)
          localPrintStream.println("#wxpackage :cache size=" + this.ceM[0] + " data size= " + this.ceM[1] + " code size =" + this.ceM[2]);
        localObject2 = new StringBuilder("#dbsize : EnMicroMsg.db size=");
        aw.ZK();
        localPrintStream.println(new File(c.Rw()).length());
        localObject1 = new StringBuilder("#dbsize : SnsMicroMsg.db size=");
        localObject2 = new StringBuilder();
        aw.ZK();
        localPrintStream.println(new File(((StringBuilder)localObject2).append(c.Rt()).append("SnsMicroMsg.db").toString()).length());
        aw.ZK();
        a(c.XK(), localPrintStream, Arrays.asList(new String[] { "message", "rconversation", "rcontact", "ImgInfo2", "BizInfo", "img_flag", "fmessage_conversation", "AppInfo", "AppMessage", "EmojiInfo", "EmojiGroupInfo", "bottleconversation", "bottlemessage", "chatroom", "rbottleconversation", "userinfo" }));
        localPrintStream.println("#sql.content:");
        localObject2 = localByteArrayOutputStream.toString();
      }
    }
    catch (Exception localException2)
    {
      try
      {
        label875: String str;
        while (true)
        {
          Object localObject2;
          localByteArrayOutputStream.close();
          AppMethodBeat.o(16401);
          return localObject2;
          localException2 = localException2;
          ab.e("MicroMsg.SQLTraceManager", "check data size failed :%s", new Object[] { localException2.getMessage() });
          str = "";
          continue;
          localPrintStream.println("#logfile.fullTimelast :" + (System.currentTimeMillis() - bP(ah.getContext())));
        }
        label946: localPrintStream.println("#traceconfig id=" + str[0].id + " version=" + str[0].version);
      }
      catch (Exception localException1)
      {
        break label875;
      }
    }
  }

  public static b abr()
  {
    AppMethodBeat.i(16394);
    if (fpj == null)
      fpj = new b();
    b localb = fpj;
    AppMethodBeat.o(16394);
    return localb;
  }

  private void abs()
  {
    AppMethodBeat.i(16396);
    this.fpl = this.ehZ.getLong("sql_trace_main_thread_select_interval_time", 300L);
    this.fpm = this.ehZ.getLong("sql_trace_main_thread_update_interval_time", 500L);
    this.fpn = this.ehZ.getLong("sql_trace_child_thread_interval_time", 1500L);
    long l = bR(ah.getContext());
    if (l > 0L)
    {
      this.fpl += l;
      this.fpm += l;
      this.fpn += l;
      ab.i("MicroMsg.SQLTraceManager", "auto adapte Time %d", new Object[] { Long.valueOf(l) });
    }
    this.fpo = this.ehZ.getLong("sql_trace_child_transaction_interval_time", 5000L);
    this.fpt = this.ehZ.getLong("sql_trace_file_full_size", 30720L);
    this.fpp = this.ehZ.getLong("sql_trace_log_file_max_size", 35840L);
    this.fpq = this.ehZ.getLong("sql_trace_upload_file_min_size", 10240L);
    this.fpr = this.ehZ.getLong("sql_upload_time_interval", 21600000L);
    z(new File(fpk, "MMSQL.trace"));
    ab.i("MicroMsg.SQLTraceManager", "update arg %d %d %d %d %d %d %d %d", new Object[] { Long.valueOf(this.fpl), Long.valueOf(this.fpm), Long.valueOf(this.fpn), Long.valueOf(this.fpo), Long.valueOf(this.fpt), Long.valueOf(this.fpp), Long.valueOf(this.fpq), Long.valueOf(this.fpr) });
    AppMethodBeat.o(16396);
  }

  public static long bO(Context paramContext)
  {
    AppMethodBeat.i(16408);
    long l = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_report_lastUploadTime", 0L);
    AppMethodBeat.o(16408);
    return l;
  }

  private static long bP(Context paramContext)
  {
    AppMethodBeat.i(16409);
    long l = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_trace_log_file_create_time", 0L);
    AppMethodBeat.o(16409);
    return l;
  }

  private static long bQ(Context paramContext)
  {
    AppMethodBeat.i(16411);
    long l = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_trace_log_file_full_time", 0L);
    AppMethodBeat.o(16411);
    return l;
  }

  private static long bR(Context paramContext)
  {
    AppMethodBeat.i(16412);
    long l = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_trace_log_autoAdaptaTime", 0L);
    AppMethodBeat.o(16412);
    return l;
  }

  public static void c(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(16407);
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("sql_report_lastUploadTime", paramLong).commit();
    AppMethodBeat.o(16407);
  }

  private static void d(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(16410);
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("sql_trace_log_file_full_time", paramLong).commit();
    AppMethodBeat.o(16410);
  }

  // ERROR //
  public static String pe(String paramString)
  {
    // Byte code:
    //   0: sipush 16399
    //   3: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 310	java/io/File
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 459	java/io/File:<init>	(Ljava/lang/String;)V
    //   14: astore_1
    //   15: new 620	java/io/FileInputStream
    //   18: astore_0
    //   19: aload_0
    //   20: aload_1
    //   21: invokespecial 622	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   24: aload_0
    //   25: invokevirtual 625	java/io/FileInputStream:available	()I
    //   28: newarray byte
    //   30: astore_1
    //   31: aload_0
    //   32: aload_1
    //   33: invokevirtual 629	java/io/FileInputStream:read	([B)I
    //   36: pop
    //   37: aload_1
    //   38: invokestatic 635	com/tencent/mm/cf/e:ce	([B)[B
    //   41: astore_2
    //   42: new 49	java/lang/String
    //   45: astore_1
    //   46: aload_1
    //   47: aload_2
    //   48: invokespecial 638	java/lang/String:<init>	([B)V
    //   51: aload_0
    //   52: invokevirtual 639	java/io/FileInputStream:close	()V
    //   55: sipush 16399
    //   58: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: aload_1
    //   62: astore_0
    //   63: aload_0
    //   64: areturn
    //   65: astore_0
    //   66: ldc 178
    //   68: aload_0
    //   69: ldc 125
    //   71: iconst_0
    //   72: anewarray 4	java/lang/Object
    //   75: invokestatic 643	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: goto -23 -> 55
    //   81: astore_0
    //   82: aconst_null
    //   83: astore_0
    //   84: aload_0
    //   85: ifnull +7 -> 92
    //   88: aload_0
    //   89: invokevirtual 639	java/io/FileInputStream:close	()V
    //   92: sipush 16399
    //   95: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   98: aconst_null
    //   99: astore_0
    //   100: goto -37 -> 63
    //   103: astore_0
    //   104: ldc 178
    //   106: aload_0
    //   107: ldc 125
    //   109: iconst_0
    //   110: anewarray 4	java/lang/Object
    //   113: invokestatic 643	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: goto -24 -> 92
    //   119: astore_1
    //   120: aconst_null
    //   121: astore_0
    //   122: aload_0
    //   123: ifnull +7 -> 130
    //   126: aload_0
    //   127: invokevirtual 639	java/io/FileInputStream:close	()V
    //   130: sipush 16399
    //   133: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload_1
    //   137: athrow
    //   138: astore_0
    //   139: ldc 178
    //   141: aload_0
    //   142: ldc 125
    //   144: iconst_0
    //   145: anewarray 4	java/lang/Object
    //   148: invokestatic 643	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: goto -21 -> 130
    //   154: astore_1
    //   155: goto -33 -> 122
    //   158: astore_1
    //   159: goto -75 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   51	55	65	java/lang/Exception
    //   15	24	81	java/io/IOException
    //   88	92	103	java/lang/Exception
    //   15	24	119	finally
    //   126	130	138	java/lang/Exception
    //   24	51	154	finally
    //   24	51	158	java/io/IOException
  }

  public static void setup()
  {
    AppMethodBeat.i(16397);
    if (ah.xzd)
      ab.i("MicroMsg.SQLTraceManager", "trace setup delete old file ret: ".concat(String.valueOf(com.tencent.mm.a.e.deleteFile(fpk + "MMSQL.trace"))));
    AppMethodBeat.o(16397);
  }

  public final void abn()
  {
    AppMethodBeat.i(16413);
    ab.i("MicroMsg.SQLTraceManager", "updateIntervalArg ");
    abs();
    AppMethodBeat.o(16413);
  }

  final void b(File paramFile, boolean paramBoolean)
  {
    AppMethodBeat.i(16406);
    ab.i("MicroMsg.SQLTraceManager", "build log file ,needRecreate %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramFile.exists())
    {
      if (!paramBoolean)
        break label87;
      paramFile.delete();
    }
    try
    {
      paramFile.createNewFile();
      Context localContext = ah.getContext();
      long l = System.currentTimeMillis();
      PreferenceManager.getDefaultSharedPreferences(localContext).edit().putLong("sql_trace_log_file_create_time", l).commit();
      d(ah.getContext(), 0L);
      label87: z(paramFile);
      AppMethodBeat.o(16406);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.SQLTraceManager", "recreate log file fail");
    }
  }

  public final void pg(String paramString)
  {
    AppMethodBeat.i(16404);
    String str = paramString;
    if (paramString == null)
      str = "";
    paramString = new Intent();
    paramString.setClassName(ah.getPackageName(), "com.tencent.mm.sandbox.monitor.ExceptionMonitorBroadcastReceiver");
    paramString.setAction("uncatch_exception");
    paramString.putExtra("exceptionPid", Process.myPid());
    paramString.putExtra("userName", Bo());
    paramString.putExtra("tag", "SqlTrace");
    paramString.putExtra("exceptionMsg", Base64.encodeToString((abm() + str).getBytes(), 2));
    ah.getContext().sendBroadcast(paramString);
    AppMethodBeat.o(16404);
  }

  final void z(File paramFile)
  {
    boolean bool1 = true;
    AppMethodBeat.i(16398);
    boolean bool2;
    if (paramFile.exists())
      if (paramFile.length() > this.fpt)
      {
        bool2 = true;
        this.foQ = bool2;
        if (!this.foQ)
          break label115;
        long l = bQ(ah.getContext());
        if (l == 0L)
          break label105;
        bool2 = bool1;
        label58: ab.i("MicroMsg.SQLTraceManager", "has mark lastFullTime %b", new Object[] { Boolean.valueOf(bool2) });
        if (l == 0L)
          d(ah.getContext(), System.currentTimeMillis());
        AppMethodBeat.o(16398);
      }
    while (true)
    {
      return;
      bool2 = false;
      break;
      label105: bool2 = false;
      break label58;
      this.foQ = false;
      label115: AppMethodBeat.o(16398);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d.b
 * JD-Core Version:    0.6.2
 */