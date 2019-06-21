package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class t
{
  public static boolean a(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(65302);
    try
    {
      int i = Build.VERSION.SDK_INT;
      if (i < 21)
        AppMethodBeat.o(65302);
      Object localObject;
      while (true)
      {
        return bool;
        localObject = b(paramContext);
        if (localObject != null)
          break;
        AppMethodBeat.o(65302);
      }
      paramContext = new com/tencent/smtt/utils/u;
      paramContext.<init>();
      File[] arrayOfFile = ((File)localObject).listFiles(paramContext);
      int j = arrayOfFile.length;
      for (i = 0; ; i++)
      {
        if (i >= j)
          break label169;
        paramContext = arrayOfFile[i];
        if ((paramContext.isFile()) && (paramContext.exists()))
        {
          if (a(paramContext))
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            TbsLog.w("TbsCheckUtils", paramContext + " is invalid --> check failed!");
            paramContext.delete();
            AppMethodBeat.o(65302);
            bool = false;
            break;
          }
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          TbsLog.i("TbsCheckUtils", paramContext + " #4 check success!");
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        label169: TbsLog.i("TbsCheckUtils", "checkTbsValidity -->#5 check ok!");
        AppMethodBeat.o(65302);
      }
    }
  }

  private static boolean a(File paramFile)
  {
    AppMethodBeat.i(65303);
    try
    {
      bool = j.b(paramFile);
      if (!bool)
      {
        bool = true;
        AppMethodBeat.o(65303);
        return bool;
      }
    }
    catch (Throwable paramFile)
    {
      while (true)
      {
        new StringBuilder("isOatFileBroken exception: ").append(paramFile);
        boolean bool = false;
        AppMethodBeat.o(65303);
      }
    }
  }

  private static File b(Context paramContext)
  {
    AppMethodBeat.i(65301);
    paramContext = new File(paramContext.getDir("tbs", 0), "core_share");
    if ((!paramContext.isDirectory()) || (!paramContext.exists()))
    {
      paramContext = null;
      AppMethodBeat.o(65301);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(65301);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.t
 * JD-Core Version:    0.6.2
 */