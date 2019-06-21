package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

class TbsLinuxToolsJni
{
  private static boolean a = false;
  private static boolean b = false;

  public TbsLinuxToolsJni(Context paramContext)
  {
    AppMethodBeat.i(64476);
    a(paramContext);
    AppMethodBeat.o(64476);
  }

  private native int ChmodInner(String paramString1, String paramString2);

  private void a(Context paramContext)
  {
    AppMethodBeat.i(64477);
    while (true)
      try
      {
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("TbsLinuxToolsJni init mbIsInited is ");
        TbsLog.i("TbsLinuxToolsJni", b);
        if (b)
          return;
        b = true;
        try
        {
          if (TbsShareManager.isThirdPartyApp(paramContext))
          {
            localObject1 = TbsShareManager.a();
            if (localObject1 == null)
            {
              localObject1 = TbsShareManager.c(paramContext);
              Object localObject2 = new java/io/File;
              ((File)localObject2).<init>((String)localObject1);
              localObject1 = localObject2;
              if (localObject1 != null)
              {
                File localFile = new java/io/File;
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                localFile.<init>(((File)localObject1).getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so");
                localObject2 = localObject1;
                if (!localFile.exists())
                {
                  localObject2 = localObject1;
                  if (!TbsShareManager.isThirdPartyApp(paramContext))
                    localObject2 = an.a().q(paramContext);
                }
                if (localObject2 != null)
                {
                  paramContext = new java/lang/StringBuilder;
                  paramContext.<init>("TbsLinuxToolsJni init tbsSharePath is ");
                  TbsLog.i("TbsLinuxToolsJni", ((File)localObject2).getAbsolutePath());
                  paramContext = new java/lang/StringBuilder;
                  paramContext.<init>();
                  System.load(((File)localObject2).getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so");
                  a = true;
                }
              }
              ChmodInner("/checkChmodeExists", "700");
              AppMethodBeat.o(64477);
            }
          }
          else
          {
            localObject1 = an.a().r(paramContext);
          }
        }
        catch (Throwable localThrowable)
        {
          a = false;
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>("TbsLinuxToolsJni init error !!! ");
          TbsLog.i("TbsLinuxToolsJni", localThrowable.getMessage() + " ## " + localThrowable.getCause());
        }
      }
      finally
      {
        AppMethodBeat.o(64477);
      }
  }

  public int a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(64475);
    int i;
    if (!a)
    {
      TbsLog.e("TbsLinuxToolsJni", "jni not loaded!", true);
      i = -1;
      AppMethodBeat.o(64475);
    }
    while (true)
    {
      return i;
      i = ChmodInner(paramString1, paramString2);
      AppMethodBeat.o(64475);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsLinuxToolsJni
 * JD-Core Version:    0.6.2
 */