package com.tencent.tinker.lib.util;

import android.content.Context;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;
import java.io.IOException;

public final class c
{
  private static c ACm;
  public boolean ACn = true;
  public File ACo = null;
  public File ACp = null;
  public int ACq = 5;
  private Context context = null;

  private c(Context paramContext)
  {
    this.context = paramContext;
    this.ACo = new File(SharePatchFileUtil.ji(paramContext), "patch.retry");
    this.ACp = new File(SharePatchFileUtil.ji(paramContext), "temp.apk");
  }

  public static c jc(Context paramContext)
  {
    if (ACm == null)
      ACm = new c(paramContext);
    return ACm;
  }

  public final void al(File paramFile)
  {
    if (paramFile.getAbsolutePath().equals(this.ACp.getAbsolutePath()));
    while (true)
    {
      return;
      a.w("Tinker.UpgradePatchRetry", "try copy file: %s to %s", new Object[] { paramFile.getAbsolutePath(), this.ACp.getAbsolutePath() });
      try
      {
        SharePatchFileUtil.j(paramFile, this.ACp);
      }
      catch (IOException localIOException)
      {
        a.e("Tinker.UpgradePatchRetry", "fail to copy file: %s to %s", new Object[] { paramFile.getAbsolutePath(), this.ACp.getAbsolutePath() });
      }
    }
  }

  public final boolean auk(String paramString)
  {
    boolean bool1 = true;
    boolean bool2;
    if (!this.ACn)
    {
      a.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck retry disabled, just return", new Object[0]);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (!this.ACo.exists())
      {
        a.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck retry file is not exist, just return", new Object[0]);
        bool2 = bool1;
      }
      else if (paramString == null)
      {
        a.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck md5 is null, just return", new Object[0]);
        bool2 = bool1;
      }
      else
      {
        c.a locala = c.a.am(this.ACo);
        bool2 = bool1;
        if (paramString.equals(locala.cvZ))
        {
          int i = Integer.parseInt(locala.ACr);
          bool2 = bool1;
          if (i >= this.ACq)
          {
            a.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck, retry count %d must exceed than max retry count", new Object[] { Integer.valueOf(i) });
            SharePatchFileUtil.as(this.ACp);
            bool2 = false;
          }
        }
      }
    }
  }

  public final boolean dSj()
  {
    boolean bool = false;
    if (!this.ACn)
      a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry disabled, just return", new Object[0]);
    while (true)
    {
      return bool;
      if (!com.tencent.tinker.lib.e.a.iX(this.context).rNw)
      {
        a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry is not main process, just return", new Object[0]);
      }
      else if (!this.ACo.exists())
      {
        a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry info not exist, just return", new Object[0]);
      }
      else if (b.iZ(this.context))
      {
        a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad tinker service is running, just return", new Object[0]);
      }
      else
      {
        String str = this.ACp.getAbsolutePath();
        if ((str == null) || (!new File(str).exists()))
        {
          a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad patch file: %s is not exist, just return", new Object[] { str });
        }
        else
        {
          a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad patch file: %s is exist, retry to patch", new Object[] { str });
          com.tencent.tinker.lib.e.c.cf(this.context, str);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.util.c
 * JD-Core Version:    0.6.2
 */