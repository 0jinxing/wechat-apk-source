package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.k;
import java.io.File;
import java.io.FileFilter;

class ar extends Thread
{
  ar(an paraman, Context paramContext1, Context paramContext2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(64401);
    TbsLog.i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp thread start");
    try
    {
      File localFile1;
      if (this.a == null)
      {
        localFile1 = new java/io/File;
        localFile1.<init>(TbsShareManager.getHostCorePathAppDefined());
      }
      while (true)
      {
        File localFile2 = this.c.r(this.b);
        int i = Build.VERSION.SDK_INT;
        if ((i != 19) && (i < 21))
        {
          localObject = new com/tencent/smtt/sdk/as;
          ((as)localObject).<init>(this);
          k.a(localFile1, localFile2, (FileFilter)localObject);
        }
        Object localObject = new com/tencent/smtt/sdk/at;
        ((at)localObject).<init>(this);
        k.a(localFile1, localFile2, (FileFilter)localObject);
        TbsLog.i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp thread done");
        AppMethodBeat.o(64401);
        return;
        if (TbsShareManager.isThirdPartyApp(this.b))
        {
          if ((TbsShareManager.c(this.b) != null) && (TbsShareManager.c(this.b).contains("decouple")))
            localFile1 = this.c.q(this.a);
          else
            localFile1 = this.c.r(this.a);
        }
        else
          localFile1 = this.c.r(this.a);
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(64401);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ar
 * JD-Core Version:    0.6.2
 */