package com.tencent.smtt.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Environment;
import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class y
{
  private static File a = null;

  public static long a()
  {
    AppMethodBeat.i(65344);
    StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
    long l1 = localStatFs.getBlockSize();
    long l2 = localStatFs.getAvailableBlocks();
    AppMethodBeat.o(65344);
    return l2 * l1;
  }

  @TargetApi(9)
  public static boolean a(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(65345);
    if (paramContext == null)
      AppMethodBeat.o(65345);
    while (true)
    {
      return bool1;
      if (a == null)
      {
        try
        {
          boolean bool2 = paramContext.getApplicationInfo().processName.contains("com.tencent.mm");
          if (!bool2)
          {
            AppMethodBeat.o(65345);
            continue;
          }
          File localFile = paramContext.getDir("tbs", 0);
          if (localFile != null)
          {
            bool2 = localFile.isDirectory();
            if (bool2);
          }
          else
          {
            AppMethodBeat.o(65345);
            continue;
          }
          paramContext = new java/io/File;
          paramContext.<init>(localFile, "share");
          if (!paramContext.isDirectory())
          {
            bool2 = paramContext.mkdir();
            if (!bool2)
            {
              AppMethodBeat.o(65345);
              continue;
            }
          }
          a = paramContext;
          paramContext.setExecutable(true, false);
          AppMethodBeat.o(65345);
          bool1 = true;
        }
        catch (Exception paramContext)
        {
          AppMethodBeat.o(65345);
        }
      }
      else
      {
        AppMethodBeat.o(65345);
        bool1 = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.y
 * JD-Core Version:    0.6.2
 */