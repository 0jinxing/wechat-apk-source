package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class TbsDownloadConfig
{
  public static final int CMD_ID_DOWNLOAD_FILE = 101;
  public static final int CMD_ID_FILE_UPLOAD = 100;
  public static final long DEFAULT_RETRY_INTERVAL_SEC = 86400L;
  public static final int ERROR_DOWNLOAD = 2;
  public static final int ERROR_INSTALL = 5;
  public static final int ERROR_LOAD = 6;
  public static final int ERROR_NONE = 1;
  public static final int ERROR_REPORTED = 0;
  public static final int ERROR_UNZIP = 4;
  public static final int ERROR_VERIFY = 3;
  private static TbsDownloadConfig b;
  Map<String, Object> a;
  private Context c;
  public SharedPreferences mPreferences;

  private TbsDownloadConfig(Context paramContext)
  {
    AppMethodBeat.i(64320);
    this.a = new HashMap();
    this.mPreferences = paramContext.getSharedPreferences("tbs_download_config", 4);
    this.c = paramContext.getApplicationContext();
    if (this.c == null)
      this.c = paramContext;
    AppMethodBeat.o(64320);
  }

  public static TbsDownloadConfig getInstance()
  {
    try
    {
      TbsDownloadConfig localTbsDownloadConfig = b;
      return localTbsDownloadConfig;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static TbsDownloadConfig getInstance(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(64321);
      if (b == null)
      {
        TbsDownloadConfig localTbsDownloadConfig = new com/tencent/smtt/sdk/TbsDownloadConfig;
        localTbsDownloadConfig.<init>(paramContext);
        b = localTbsDownloadConfig;
      }
      paramContext = b;
      AppMethodBeat.o(64321);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public void clear()
  {
    AppMethodBeat.i(64337);
    try
    {
      this.a.clear();
      SharedPreferences.Editor localEditor = this.mPreferences.edit();
      localEditor.clear();
      localEditor.commit();
      AppMethodBeat.o(64337);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(64337);
    }
  }

  public void commit()
  {
    while (true)
    {
      String str;
      Object localObject2;
      try
      {
        AppMethodBeat.i(64336);
        try
        {
          SharedPreferences.Editor localEditor = this.mPreferences.edit();
          Iterator localIterator = this.a.keySet().iterator();
          if (!localIterator.hasNext())
            break label209;
          str = (String)localIterator.next();
          localObject2 = this.a.get(str);
          if (!(localObject2 instanceof String))
            continue;
          localEditor.putString(str, (String)localObject2);
          continue;
        }
        catch (Exception localException)
        {
          AppMethodBeat.o(64336);
        }
        return;
        if ((localObject2 instanceof Boolean))
        {
          localException.putBoolean(str, ((Boolean)localObject2).booleanValue());
          continue;
        }
      }
      finally
      {
      }
      if ((localObject2 instanceof Long))
      {
        localObject1.putLong(str, ((Long)localObject2).longValue());
      }
      else if ((localObject2 instanceof Integer))
      {
        localObject1.putInt(str, ((Integer)localObject2).intValue());
      }
      else if ((localObject2 instanceof Float))
      {
        localObject1.putFloat(str, ((Float)localObject2).floatValue());
        continue;
        label209: localObject1.commit();
        this.a.clear();
        AppMethodBeat.o(64336);
      }
    }
  }

  public int getDownloadFailedMaxRetrytimes()
  {
    try
    {
      AppMethodBeat.i(64326);
      int i = this.mPreferences.getInt("tbs_download_failed_max_retrytimes", 0);
      if (i == 0)
      {
        i = 100;
        AppMethodBeat.o(64326);
      }
      while (true)
      {
        return i;
        AppMethodBeat.o(64326);
      }
    }
    finally
    {
    }
  }

  public int getDownloadInterruptCode()
  {
    try
    {
      AppMethodBeat.i(64333);
      boolean bool = this.mPreferences.contains("tbs_download_interrupt_code");
      if (!bool);
      while (true)
      {
        try
        {
          File localFile1 = new java/io/File;
          File localFile2 = new java/io/File;
          localFile2.<init>(this.c.getFilesDir(), "shared_prefs");
          localFile1.<init>(localFile2, "tbs_download_config");
          bool = localFile1.exists();
          if (!bool)
          {
            i = -97;
            if ((this.c == null) || (!"com.tencent.mobileqq".equals(this.c.getApplicationInfo().packageName)) || ("CN".equals(Locale.getDefault().getCountry())))
              break label241;
            i = -320;
            AppMethodBeat.o(64333);
            return i;
          }
          bool = this.mPreferences.contains("tbs_needdownload");
          if (!bool)
          {
            i = -96;
            continue;
          }
          i = -101;
          continue;
        }
        catch (Throwable localThrowable)
        {
          i = -95;
          continue;
        }
        int i = this.mPreferences.getInt("tbs_download_interrupt_code", -99);
        int j;
        if (i != -119)
        {
          j = i;
          if (i != -121);
        }
        else
        {
          j = this.mPreferences.getInt("tbs_download_interrupt_code_reason", -119);
        }
        i = j;
        if (System.currentTimeMillis() - this.mPreferences.getLong("tbs_download_interrupt_time", 0L) > 86400000L)
        {
          i = j - 98000;
          continue;
          label241: i = i * 1000 + this.mPreferences.getInt("tbs_install_interrupt_code", -1);
          AppMethodBeat.o(64333);
        }
      }
    }
    finally
    {
    }
  }

  public long getDownloadMaxflow()
  {
    try
    {
      AppMethodBeat.i(64322);
      int i = this.mPreferences.getInt("tbs_download_maxflow", 0);
      int j = i;
      if (i == 0)
        j = 20;
      long l = j * 1024;
      AppMethodBeat.o(64322);
      return l * 1024L;
    }
    finally
    {
    }
  }

  public long getDownloadMinFreeSpace()
  {
    int i = 0;
    try
    {
      AppMethodBeat.i(64324);
      int j = this.mPreferences.getInt("tbs_download_min_free_space", 0);
      if (j == 0)
        j = i;
      while (true)
      {
        long l = j * 1024;
        AppMethodBeat.o(64324);
        return l * 1024L;
      }
    }
    finally
    {
    }
  }

  public long getDownloadSingleTimeout()
  {
    try
    {
      AppMethodBeat.i(64334);
      long l = this.mPreferences.getLong("tbs_single_timeout", 0L);
      if (l == 0L)
      {
        l = 1200000L;
        AppMethodBeat.o(64334);
      }
      while (true)
      {
        return l;
        AppMethodBeat.o(64334);
      }
    }
    finally
    {
    }
  }

  public int getDownloadSuccessMaxRetrytimes()
  {
    try
    {
      AppMethodBeat.i(64325);
      int i = this.mPreferences.getInt("tbs_download_success_max_retrytimes", 0);
      if (i == 0)
      {
        i = 3;
        AppMethodBeat.o(64325);
      }
      while (true)
      {
        return i;
        AppMethodBeat.o(64325);
      }
    }
    finally
    {
    }
  }

  public long getRetryInterval()
  {
    try
    {
      AppMethodBeat.i(64323);
      long l;
      if (TbsDownloader.getRetryIntervalInSeconds() >= 0L)
      {
        l = TbsDownloader.getRetryIntervalInSeconds();
        AppMethodBeat.o(64323);
      }
      while (true)
      {
        return l;
        l = this.mPreferences.getLong("retry_interval", 86400L);
        AppMethodBeat.o(64323);
      }
    }
    finally
    {
    }
  }

  // ERROR //
  public boolean getTbsCoreLoadRenameFileLockEnable()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc_w 285
    //   7: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: getfield 65	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   14: ldc_w 287
    //   17: iconst_1
    //   18: invokeinterface 291 3 0
    //   23: istore_2
    //   24: ldc_w 285
    //   27: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: aload_0
    //   31: monitorexit
    //   32: iload_2
    //   33: ireturn
    //   34: astore_3
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_3
    //   38: athrow
    //   39: astore_3
    //   40: iload_1
    //   41: istore_2
    //   42: goto -18 -> 24
    //
    // Exception table:
    //   from	to	target	type
    //   4	10	34	finally
    //   10	24	34	finally
    //   24	30	34	finally
    //   10	24	39	java/lang/Exception
  }

  // ERROR //
  public boolean getTbsCoreLoadRenameFileLockWaitEnable()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc_w 293
    //   7: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: getfield 65	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   14: ldc_w 295
    //   17: iconst_1
    //   18: invokeinterface 291 3 0
    //   23: istore_2
    //   24: ldc_w 293
    //   27: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: aload_0
    //   31: monitorexit
    //   32: iload_2
    //   33: ireturn
    //   34: astore_3
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_3
    //   38: athrow
    //   39: astore_3
    //   40: iload_1
    //   41: istore_2
    //   42: goto -18 -> 24
    //
    // Exception table:
    //   from	to	target	type
    //   4	10	34	finally
    //   10	24	34	finally
    //   24	30	34	finally
    //   10	24	39	java/lang/Exception
  }

  public boolean isOverSea()
  {
    try
    {
      AppMethodBeat.i(64335);
      boolean bool = this.mPreferences.getBoolean("is_oversea", false);
      AppMethodBeat.o(64335);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void setDownloadInterruptCode(int paramInt)
  {
    try
    {
      AppMethodBeat.i(64327);
      try
      {
        SharedPreferences.Editor localEditor = this.mPreferences.edit();
        localEditor.putInt("tbs_download_interrupt_code", paramInt);
        localEditor.putLong("tbs_download_interrupt_time", System.currentTimeMillis());
        localEditor.commit();
        AppMethodBeat.o(64327);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          AppMethodBeat.o(64327);
      }
    }
    finally
    {
    }
  }

  public void setInstallInterruptCode(int paramInt)
  {
    try
    {
      AppMethodBeat.i(64338);
      SharedPreferences.Editor localEditor = this.mPreferences.edit();
      localEditor.putInt("tbs_install_interrupt_code", paramInt);
      localEditor.commit();
      AppMethodBeat.o(64338);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void setTbsCoreLoadRenameFileLockEnable(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(64328);
      try
      {
        SharedPreferences.Editor localEditor = this.mPreferences.edit();
        localEditor.putBoolean("tbs_core_load_rename_file_lock_enable", paramBoolean);
        localEditor.commit();
        AppMethodBeat.o(64328);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          AppMethodBeat.o(64328);
      }
    }
    finally
    {
    }
  }

  public void setTbsCoreLoadRenameFileLockWaitEnable(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(64329);
      try
      {
        SharedPreferences.Editor localEditor = this.mPreferences.edit();
        localEditor.putBoolean("tbs_core_load_rename_file_lock_wait_enable", paramBoolean);
        localEditor.commit();
        AppMethodBeat.o(64329);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          AppMethodBeat.o(64329);
      }
    }
    finally
    {
    }
  }

  public void uploadDownloadInterruptCodeIfNeeded(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(64332);
      if (paramContext != null);
      try
      {
        int i;
        boolean bool;
        if ("com.tencent.mm".equals(paramContext.getApplicationContext().getApplicationInfo().packageName))
        {
          i = 1;
          bool = this.mPreferences.contains("tbs_download_interrupt_code");
          if (bool)
            break label206;
        }
        while (true)
        {
          int j;
          int k;
          try
          {
            Object localObject = new java/io/File;
            File localFile = new java/io/File;
            localFile.<init>(this.c.getFilesDir(), "shared_prefs");
            ((File)localObject).<init>(localFile, "tbs_download_config");
            bool = ((File)localObject).exists();
            if (!bool)
            {
              j = -97;
              k = i;
              if (k != 0)
              {
                localObject = TbsLogReport.getInstance(paramContext).tbsLogInfo();
                ((TbsLogReport.TbsLogInfo)localObject).setErrorCode(128);
                ((TbsLogReport.TbsLogInfo)localObject).setFailDetail(" ".concat(String.valueOf(j)));
                TbsLogReport.getInstance(paramContext).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, (TbsLogReport.TbsLogInfo)localObject);
              }
              AppMethodBeat.o(64332);
              return;
            }
            bool = this.mPreferences.contains("tbs_needdownload");
            if (!bool)
            {
              j = -96;
              k = i;
              continue;
            }
            j = -101;
            k = i;
            continue;
          }
          catch (Throwable localThrowable)
          {
            j = -95;
            k = i;
            continue;
          }
          label206: int m = this.mPreferences.getInt("tbs_download_interrupt_code", -99);
          if (m <= -206)
          {
            j = m;
            k = i;
            if (m >= -219);
          }
          else if (m <= -302)
          {
            j = m;
            k = i;
            if (m >= -316);
          }
          else if (m <= -318)
          {
            j = m;
            k = i;
            if (m >= -322);
          }
          else
          {
            k = 0;
            j = m;
          }
        }
      }
      catch (Throwable paramContext)
      {
        while (true)
          AppMethodBeat.o(64332);
      }
    }
    finally
    {
    }
    throw paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsDownloadConfig
 * JD-Core Version:    0.6.2
 */