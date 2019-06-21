package com.tencent.mm.model.d;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ba.m;
import com.tencent.mm.ba.n;
import com.tencent.mm.ba.r;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.model.av;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;

public class a
  implements c.a
{
  private static final String ceI;
  private static final String ceJ;
  public static String ceK;
  private static a foM;
  private static final String foN;
  public static final String foO;
  private static final long foR;
  private static SimpleDateFormat sDateFormat;
  long[] ceM;
  private SharedPreferences ehZ;
  private long foP;
  private volatile boolean foQ;
  private long foS;
  private long foT;
  private long foU;
  private long foV;
  private long foW;
  private long foX;
  private long foY;
  private int foZ;
  private int fpa;
  private int fpb;
  private Long[] fpc;
  public long fpd;
  private long fpe;
  private String fpf;
  private LinkedList<a.a> fpg;

  static
  {
    AppMethodBeat.i(16390);
    String str = q.LM();
    ceI = str;
    ceJ = p.getString(str.hashCode());
    foN = e.eSl + "/tencent/MicroMsg/Handler/";
    foO = foN + "Handler.trace";
    foR = Looper.getMainLooper().getThread().getId();
    sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
    ceK = "";
    AppMethodBeat.o(16390);
  }

  private a()
  {
    AppMethodBeat.i(16379);
    this.ceM = new long[] { 0L, 0L, 0L };
    this.foP = 0L;
    this.foQ = false;
    this.foS = 8000L;
    this.foT = 800L;
    this.foU = 25600L;
    this.foV = 35840L;
    this.foW = 86400000L;
    this.foX = 180000L;
    this.foY = 5000L;
    this.foZ = 120;
    this.fpa = 50;
    this.fpb = 1800000;
    this.ehZ = ah.doB();
    this.fpc = new Long[18];
    this.fpd = 0L;
    this.fpe = 0L;
    this.fpf = "";
    this.fpg = new LinkedList();
    this.foS = this.ehZ.getLong("handler_debug_log_time", 8000L);
    this.foT = this.ehZ.getLong("handler_debug_log_time_main", 800L);
    this.foU = this.ehZ.getLong("handler_trace_file_full_size", 25600L);
    this.foV = this.ehZ.getLong("handler_log_file_max_size", 35840L);
    this.foW = this.ehZ.getLong("handler_upload_time_interval", 86400000L);
    this.fpe = aw.RS().oAl.getLooper().getThread().getId();
    Arrays.fill(this.fpc, Long.valueOf(0L));
    AppMethodBeat.o(16379);
  }

  public static a abl()
  {
    AppMethodBeat.i(16380);
    if (foM == null);
    try
    {
      if (foM == null)
      {
        locala = new com/tencent/mm/model/d/a;
        locala.<init>();
        foM = locala;
      }
      a locala = foM;
      AppMethodBeat.o(16380);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(16380);
    }
  }

  private void b(File paramFile, boolean paramBoolean)
  {
    AppMethodBeat.i(16384);
    ab.i("MicroMsg.HandlerTraceManager", "build log file ,needRecreate %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramFile.exists())
    {
      if (!paramBoolean)
        break label86;
      paramFile.delete();
    }
    try
    {
      paramFile.createNewFile();
      SharedPreferences.Editor localEditor = this.ehZ.edit();
      localEditor.putLong("handler_trace_log_file_create_time", System.currentTimeMillis());
      localEditor.putLong("handler_trace_log_file_full_time", 0L).commit();
      label86: z(paramFile);
      AppMethodBeat.o(16384);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.HandlerTraceManager", "recreate log file fail");
    }
  }

  // ERROR //
  private static String pe(String paramString)
  {
    // Byte code:
    //   0: sipush 16383
    //   3: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 291	java/io/File
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 292	java/io/File:<init>	(Ljava/lang/String;)V
    //   14: astore_1
    //   15: new 415	java/io/FileInputStream
    //   18: astore_0
    //   19: aload_0
    //   20: aload_1
    //   21: invokespecial 417	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   24: aload_0
    //   25: invokevirtual 420	java/io/FileInputStream:available	()I
    //   28: newarray byte
    //   30: astore_1
    //   31: aload_0
    //   32: aload_1
    //   33: invokevirtual 424	java/io/FileInputStream:read	([B)I
    //   36: pop
    //   37: aload_1
    //   38: invokestatic 328	com/tencent/mm/cf/e:ce	([B)[B
    //   41: astore_2
    //   42: new 64	java/lang/String
    //   45: astore_1
    //   46: aload_1
    //   47: aload_2
    //   48: invokespecial 426	java/lang/String:<init>	([B)V
    //   51: aload_0
    //   52: invokevirtual 427	java/io/FileInputStream:close	()V
    //   55: sipush 16383
    //   58: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: aload_1
    //   62: astore_0
    //   63: aload_0
    //   64: areturn
    //   65: astore_0
    //   66: aconst_null
    //   67: astore_0
    //   68: aload_0
    //   69: ifnull +7 -> 76
    //   72: aload_0
    //   73: invokevirtual 427	java/io/FileInputStream:close	()V
    //   76: sipush 16383
    //   79: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: aconst_null
    //   83: astore_0
    //   84: goto -21 -> 63
    //   87: astore_1
    //   88: aconst_null
    //   89: astore_0
    //   90: aload_0
    //   91: ifnull +7 -> 98
    //   94: aload_0
    //   95: invokevirtual 427	java/io/FileInputStream:close	()V
    //   98: sipush 16383
    //   101: invokestatic 135	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   104: aload_1
    //   105: athrow
    //   106: astore_0
    //   107: goto -52 -> 55
    //   110: astore_0
    //   111: goto -35 -> 76
    //   114: astore_0
    //   115: goto -17 -> 98
    //   118: astore_1
    //   119: goto -29 -> 90
    //   122: astore_1
    //   123: goto -55 -> 68
    //
    // Exception table:
    //   from	to	target	type
    //   15	24	65	java/io/IOException
    //   15	24	87	finally
    //   51	55	106	java/lang/Exception
    //   72	76	110	java/lang/Exception
    //   94	98	114	java/lang/Exception
    //   24	51	118	finally
    //   24	51	122	java/io/IOException
  }

  private void z(File paramFile)
  {
    boolean bool1 = true;
    AppMethodBeat.i(16381);
    boolean bool2;
    if (paramFile.exists())
      if (paramFile.length() > this.foU)
      {
        bool2 = true;
        this.foQ = bool2;
        if (!this.foQ)
          break label140;
        long l = this.ehZ.getLong("handler_trace_log_file_full_time", 0L);
        if (l == 0L)
          break label130;
        bool2 = bool1;
        label65: ab.i("MicroMsg.HandlerTraceManager", "has mark lastFullTime %b", new Object[] { Boolean.valueOf(bool2) });
        if (l == 0L)
          this.ehZ.edit().putLong("handler_trace_log_file_full_time", System.currentTimeMillis()).commit();
        AppMethodBeat.o(16381);
      }
    while (true)
    {
      return;
      bool2 = false;
      break;
      label130: bool2 = false;
      break label65;
      this.foQ = false;
      label140: AppMethodBeat.o(16381);
    }
  }

  final String abm()
  {
    AppMethodBeat.i(16382);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    localPrintStream.println("#client.version=" + d.vxo);
    localPrintStream.println("#accinfo.revision=" + f.REV);
    localPrintStream.println("#accinfo.uin=" + av.fly.T("last_login_uin", ceJ));
    localPrintStream.println("#accinfo.dev=" + ceI);
    localPrintStream.println("#accinfo.build=" + f.TIME + ":" + f.HOSTNAME + ":" + g.cdf);
    try
    {
      File localFile = h.getDataDirectory();
      Object localObject1 = new android/os/StatFs;
      ((StatFs)localObject1).<init>(localFile.getPath());
      localObject2 = new android/os/StatFs;
      ((StatFs)localObject2).<init>(e.eSl);
      localObject2 = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[] { Integer.valueOf(((ActivityManager)ah.getContext().getSystemService("activity")).getMemoryClass()), localFile.getAbsolutePath(), Integer.valueOf(((StatFs)localObject1).getBlockSize()), Integer.valueOf(((StatFs)localObject1).getBlockCount()), Integer.valueOf(((StatFs)localObject1).getAvailableBlocks()), e.eSl, Integer.valueOf(((StatFs)localObject2).getBlockSize()), Integer.valueOf(((StatFs)localObject2).getBlockCount()), Integer.valueOf(((StatFs)localObject2).getAvailableBlocks()) });
      localPrintStream.println("#accinfo.data=".concat(String.valueOf(localObject2)));
      localObject2 = new Date();
      localObject1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
      localPrintStream.println("#accinfo.uploadTime=" + ((SimpleDateFormat)localObject1).format((Date)localObject2));
      localPrintStream.println("#logfile.fulllast :".concat(String.valueOf(this.ehZ.getLong("handler_trace_log_file_full_time", 0L) - this.ehZ.getLong("handler_trace_log_file_create_time", 0L))));
      if (this.ceM[1] != -1L)
        localPrintStream.println("#wxpackage :cache size=" + this.ceM[0] + " data size=" + this.ceM[1] + " code size=" + this.ceM[2]);
      localObject2 = r.aix().lU(21);
      if ((localObject2 == null) || (localObject2.length == 0) || (localObject2[0] == null))
      {
        localPrintStream.println("#traceconfig hardcode");
        localPrintStream.println("#handler.content:");
        localObject2 = localByteArrayOutputStream.toString();
      }
    }
    catch (Exception localException2)
    {
      try
      {
        label544: String str;
        while (true)
        {
          Object localObject2;
          localByteArrayOutputStream.close();
          AppMethodBeat.o(16382);
          return localObject2;
          localException2 = localException2;
          ab.e("MicroMsg.HandlerTraceManager", "summer check data size failed :%s", new Object[] { localException2.getMessage() });
          str = "";
        }
        localPrintStream.println("#traceconfig id=" + str[0].id + " version=" + str[0].version);
      }
      catch (Exception localException1)
      {
        break label544;
      }
    }
  }

  public final void abn()
  {
    AppMethodBeat.i(16385);
    ab.i("MicroMsg.HandlerTraceManager", "summerc onUpdateComplete");
    this.foS = this.ehZ.getLong("handler_debug_log_time", 8000L);
    this.foT = this.ehZ.getLong("handler_debug_log_time_main", 800L);
    this.foU = this.ehZ.getLong("handler_trace_file_full_size", 25600L);
    this.foV = this.ehZ.getLong("handler_log_file_max_size", 35840L);
    this.foW = this.ehZ.getLong("handler_upload_time_interval", 86400000L);
    this.foX = this.ehZ.getLong("handler_worker_assert_time", 180000L);
    this.foY = this.ehZ.getLong("handler_worker_warn_time", 5000L);
    this.foZ = ((int)this.ehZ.getLong("handler_worker_warn_task_max_size", 120L));
    this.fpa = ((int)this.ehZ.getLong("handler_worker_warn_task_keep_size", 50L));
    this.fpb = ((int)this.ehZ.getLong("handler_worker_warn_task_keep_size", 1800000L));
    z(new File(foO));
    AppMethodBeat.o(16385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d.a
 * JD-Core Version:    0.6.2
 */