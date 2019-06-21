package com.tencent.tinker.lib.d;

import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.lib.util.c;
import com.tencent.tinker.lib.util.c.a;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class b
  implements d
{
  private static boolean ABu = false;
  protected final Context context;

  public b(Context paramContext)
  {
    this.context = paramContext;
  }

  public void a(File paramFile, SharePatchInfo paramSharePatchInfo, String paramString)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultPatchReporter", "patchReporter onPatchVersionCheckFail: patch version exist. path: %s, version: %s", new Object[] { paramFile.getAbsolutePath(), paramString });
  }

  public void a(File paramFile1, File paramFile2, String paramString, int paramInt)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultPatchReporter", "patchReporter onPatchTypeExtractFail: file extract fail type: %s, path: %s, extractTo: %s, filename: %s", new Object[] { ShareTinkerInternals.Sd(paramInt), paramFile1.getPath(), paramFile2.getPath(), paramString });
    com.tencent.tinker.lib.e.a.iX(this.context).ak(paramFile1);
  }

  public void a(File paramFile, String paramString1, String paramString2)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultPatchReporter", "patchReporter onPatchInfoCorrupted: patch info is corrupted. old: %s, new: %s", new Object[] { paramString1, paramString2 });
    com.tencent.tinker.lib.e.a.iX(this.context).bGr();
  }

  public void a(File paramFile, Throwable paramThrowable)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultPatchReporter", "patchReporter onPatchException: patch exception path: %s, throwable: %s", new Object[] { paramFile.getAbsolutePath(), paramThrowable.getMessage() });
    com.tencent.tinker.lib.util.a.e("Tinker.DefaultPatchReporter", "tinker patch exception, welcome to submit issue to us: https://github.com/Tencent/tinker/issues", new Object[0]);
    com.tencent.tinker.lib.util.a.printErrStackTrace("Tinker.DefaultPatchReporter", paramThrowable, "tinker patch exception", new Object[0]);
    com.tencent.tinker.lib.e.a.iX(this.context).tinkerFlags = 0;
    com.tencent.tinker.lib.e.a.iX(this.context).ak(paramFile);
  }

  public void a(File paramFile, List<File> paramList, Throwable paramThrowable)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultPatchReporter", "patchReporter onPatchDexOptFail: dex opt fail path: %s, dex size: %d", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(paramList.size()) });
    com.tencent.tinker.lib.util.a.printErrStackTrace("Tinker.DefaultPatchReporter", paramThrowable, "onPatchDexOptFail:", new Object[0]);
    if ((paramThrowable.getMessage().contains("checkDexOptExist failed")) || (paramThrowable.getMessage().contains("checkDexOptFormat failed")))
    {
      ABu = true;
      paramFile = paramList.iterator();
    }
    while (paramFile.hasNext())
    {
      SharePatchFileUtil.as((File)paramFile.next());
      continue;
      com.tencent.tinker.lib.e.a.iX(this.context).ak(paramFile);
    }
  }

  public void a(File paramFile, boolean paramBoolean, long paramLong)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultPatchReporter", "patchReporter onPatchResult: patch all result path: %s, success: %b, cost: %d", new Object[] { paramFile.getAbsolutePath(), Boolean.valueOf(paramBoolean), Long.valueOf(paramLong) });
    if (!ABu)
    {
      paramFile = c.jc(this.context);
      if (paramFile.ACn)
        break label65;
      com.tencent.tinker.lib.util.a.w("Tinker.UpgradePatchRetry", "onPatchServiceResult retry disabled, just return", new Object[0]);
    }
    while (true)
    {
      return;
      label65: if (paramFile.ACp.exists())
        SharePatchFileUtil.as(paramFile.ACp);
    }
  }

  public void ad(Intent paramIntent)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultPatchReporter", "patchReporter onPatchServiceStart: patch service start", new Object[0]);
    ABu = false;
    c localc = c.jc(this.context);
    if (!localc.ACn)
      com.tencent.tinker.lib.util.a.w("Tinker.UpgradePatchRetry", "onPatchServiceStart retry disabled, just return", new Object[0]);
    File localFile;
    String str;
    while (true)
    {
      return;
      if (paramIntent == null)
      {
        com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatchRetry", "onPatchServiceStart intent is null, just return", new Object[0]);
      }
      else
      {
        paramIntent = TinkerPatchService.bb(paramIntent);
        if (paramIntent == null)
        {
          com.tencent.tinker.lib.util.a.w("Tinker.UpgradePatchRetry", "onPatchServiceStart patch path is null, just return", new Object[0]);
        }
        else
        {
          localFile = new File(paramIntent);
          str = SharePatchFileUtil.at(localFile);
          if (str != null)
            break;
          com.tencent.tinker.lib.util.a.w("Tinker.UpgradePatchRetry", "onPatchServiceStart patch md5 is null, just return", new Object[0]);
        }
      }
    }
    if (localc.ACo.exists())
    {
      paramIntent = c.a.am(localc.ACo);
      if ((paramIntent.cvZ == null) || (paramIntent.ACr == null) || (!str.equals(paramIntent.cvZ)))
      {
        localc.al(localFile);
        paramIntent.cvZ = str;
        paramIntent.ACr = "1";
      }
    }
    while (true)
    {
      c.a.a(localc.ACo, paramIntent);
      break;
      int i = Integer.parseInt(paramIntent.ACr);
      if (i >= localc.ACq)
      {
        SharePatchFileUtil.as(localc.ACp);
        com.tencent.tinker.lib.util.a.w("Tinker.UpgradePatchRetry", "onPatchServiceStart retry more than max count, delete retry info file!", new Object[0]);
        break;
      }
      paramIntent.ACr = String.valueOf(i + 1);
      continue;
      localc.al(localFile);
      paramIntent = new c.a(str, "1");
    }
  }

  public void e(File paramFile, int paramInt)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultPatchReporter", "patchReporter onPatchPackageCheckFail: package check failed. path: %s, code: %d", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(paramInt) });
    if ((paramInt == -3) || (paramInt == -4) || (paramInt == -8))
      com.tencent.tinker.lib.e.a.iX(this.context).ak(paramFile);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.d.b
 * JD-Core Version:    0.6.2
 */