package com.tencent.tinker.lib.d;

import android.content.Context;
import com.tencent.tinker.lib.e.d;
import com.tencent.tinker.lib.util.c.a;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public class a
  implements c
{
  public final Context context;

  public a(Context paramContext)
  {
    this.context = paramContext;
  }

  public void a(File paramFile, int paramInt, long paramLong)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadResult: patch load result, path:%s, code: %d, cost: %dms", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(paramInt), Long.valueOf(paramLong) });
  }

  public void a(File paramFile, int paramInt, boolean paramBoolean)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadFileNotFound: patch file not found: %s, fileType: %d, isDirectory: %b", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramInt == 4)
      dSg();
    while (true)
    {
      return;
      dSf();
    }
  }

  public void a(String paramString1, String paramString2, File paramFile)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPatchInfoCorrupted: patch info file damage: %s, from version: %s to version: %s", new Object[] { paramFile.getAbsolutePath(), paramString1, paramString2 });
    dSf();
  }

  public void a(String paramString1, String paramString2, File paramFile, String paramString3)
  {
    int i = 0;
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPatchVersionChanged: patch version change from " + paramString1 + " to " + paramString2, new Object[0]);
    if ((paramString1 == null) || (paramString2 == null))
      break label45;
    label45: 
    while ((paramString1.equals(paramString2)) || (!com.tencent.tinker.lib.e.a.iX(this.context).rNw))
      return;
    com.tencent.tinker.lib.util.c localc = com.tencent.tinker.lib.util.c.jc(this.context);
    if (!localc.ACn)
      com.tencent.tinker.lib.util.a.w("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck retry disabled, just return", new Object[0]);
    while (true)
    {
      paramFile = paramFile.listFiles();
      if (paramFile == null)
        break;
      int j = paramFile.length;
      while (i < j)
      {
        paramString1 = paramFile[i];
        paramString2 = paramString1.getName();
        if ((paramString1.isDirectory()) && (!paramString2.equals(paramString3)))
          SharePatchFileUtil.t(paramString1);
        i++;
      }
      break label45;
      if (!localc.ACo.exists())
      {
        com.tencent.tinker.lib.util.a.w("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck retry file is not exist, just return", new Object[0]);
      }
      else if (paramString2 == null)
      {
        com.tencent.tinker.lib.util.a.w("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck md5 is null, just return", new Object[0]);
      }
      else
      {
        paramString1 = c.a.am(localc.ACo);
        if (paramString2.equals(paramString1.cvZ))
        {
          com.tencent.tinker.lib.util.a.i("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck, reset max check to 1", new Object[0]);
          paramString1.ACr = "1";
          c.a.a(localc.ACo, paramString1);
        }
      }
    }
  }

  public void a(Throwable paramThrowable, int paramInt)
  {
    switch (paramInt)
    {
    default:
    case -2:
    case -3:
    case -4:
    case -1:
    }
    while (true)
    {
      com.tencent.tinker.lib.util.a.e("Tinker.DefaultLoadReporter", "tinker load exception, welcome to submit issue to us: https://github.com/Tencent/tinker/issues", new Object[0]);
      com.tencent.tinker.lib.util.a.printErrStackTrace("Tinker.DefaultLoadReporter", paramThrowable, "tinker load exception", new Object[0]);
      com.tencent.tinker.lib.e.a.iX(this.context).tinkerFlags = 0;
      dSf();
      return;
      if (paramThrowable.getMessage().contains("checkDexInstall failed"))
        com.tencent.tinker.lib.util.a.e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: tinker dex check fail:" + paramThrowable.getMessage(), new Object[0]);
      while (true)
      {
        ShareTinkerInternals.jm(this.context);
        com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "dex exception disable tinker forever with sp", new Object[0]);
        break;
        com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load dex exception: %s", new Object[] { paramThrowable });
      }
      if (paramThrowable.getMessage().contains("checkResInstall failed"))
        com.tencent.tinker.lib.util.a.e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: tinker res check fail:" + paramThrowable.getMessage(), new Object[0]);
      while (true)
      {
        ShareTinkerInternals.jm(this.context);
        com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "res exception disable tinker forever with sp", new Object[0]);
        break;
        com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load resource exception: %s", new Object[] { paramThrowable });
      }
      com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load unCatch exception: %s", new Object[] { paramThrowable });
      ShareTinkerInternals.jm(this.context);
      com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "unCaught exception disable tinker forever with sp", new Object[0]);
      String str = SharePatchFileUtil.jk(this.context);
      if (!ShareTinkerInternals.isNullOrNil(str))
      {
        SharePatchFileUtil.as(SharePatchFileUtil.jj(this.context));
        com.tencent.tinker.lib.util.a.e("Tinker.DefaultLoadReporter", "tinker uncaught real exception:".concat(String.valueOf(str)), new Object[0]);
        continue;
        com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load unknown exception: %s", new Object[] { paramThrowable });
      }
    }
  }

  public void b(int paramInt, Throwable paramThrowable)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret: type: %d, throwable: %s", new Object[] { Integer.valueOf(paramInt), paramThrowable });
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 0:
    }
    while (true)
    {
      dSg();
      return;
      com.tencent.tinker.lib.util.a.e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret fail, can get instruction set from existed oat file", new Object[0]);
      continue;
      com.tencent.tinker.lib.util.a.e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret fail, command line to interpret return error", new Object[0]);
      continue;
      com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret ok", new Object[0]);
    }
  }

  public void b(File paramFile, int paramInt)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch load Reporter onLoadFileMd5Mismatch: patch file md5 mismatch file: %s, fileType: %d", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(paramInt) });
    dSf();
  }

  public void c(File paramFile, int paramInt)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPackageCheckFail: load patch package check fail file path: %s, errorCode: %d", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(paramInt) });
    dSf();
  }

  public void d(File paramFile, int paramInt)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPatchListenerReceiveFail: patch receive fail: %s, code: %d", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(paramInt) });
  }

  public final void dSf()
  {
    com.tencent.tinker.lib.e.a locala = com.tencent.tinker.lib.e.a.iX(this.context);
    if (locala.rNw)
    {
      Object localObject = locala.ABJ;
      if (((d)localObject).ABQ)
      {
        localObject = ((d)localObject).patchInfo;
        if ((localObject != null) && (!ShareTinkerInternals.isNullOrNil(((SharePatchInfo)localObject).uWO)))
        {
          com.tencent.tinker.lib.util.a.w("Tinker.DefaultLoadReporter", "checkAndCleanPatch, oldVersion %s is not null, try kill all other process", new Object[] { ((SharePatchInfo)localObject).uWO });
          ShareTinkerInternals.jr(this.context);
        }
      }
    }
    locala.bGr();
  }

  public final boolean dSg()
  {
    boolean bool1 = false;
    Object localObject = com.tencent.tinker.lib.e.a.iX(this.context);
    boolean bool2;
    if (!((com.tencent.tinker.lib.e.a)localObject).rNw)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      localObject = ((com.tencent.tinker.lib.e.a)localObject).ABJ.ABU;
      bool2 = bool1;
      if (localObject != null)
      {
        bool2 = bool1;
        if (com.tencent.tinker.lib.util.c.jc(this.context).auk(SharePatchFileUtil.at((File)localObject)))
        {
          com.tencent.tinker.lib.util.a.i("Tinker.DefaultLoadReporter", "try to repair oat file on patch process", new Object[0]);
          com.tencent.tinker.lib.e.c.cf(this.context, ((File)localObject).getAbsolutePath());
          bool2 = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.d.a
 * JD-Core Version:    0.6.2
 */