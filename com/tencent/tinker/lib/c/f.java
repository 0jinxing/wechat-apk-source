package com.tencent.tinker.lib.c;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public final class f extends a
{
  public final boolean a(Context paramContext, String paramString, com.tencent.tinker.lib.service.a parama)
  {
    com.tencent.tinker.lib.e.a locala = com.tencent.tinker.lib.e.a.iX(paramContext);
    File localFile1 = new File(paramString);
    boolean bool;
    if ((!ShareTinkerInternals.Se(locala.tinkerFlags)) || (!ShareTinkerInternals.jn(paramContext)))
    {
      com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:patch is disabled, just return", new Object[0]);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!SharePatchFileUtil.ap(localFile1))
      {
        com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:patch file is not found, just return", new Object[0]);
        bool = false;
      }
      else
      {
        Object localObject1 = new ShareSecurityCheck(paramContext);
        int i = ShareTinkerInternals.a(paramContext, locala.tinkerFlags, localFile1, (ShareSecurityCheck)localObject1);
        if (i != 0)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:onPatchPackageCheckFail", new Object[0]);
          locala.ABF.e(localFile1, i);
          bool = false;
        }
        else
        {
          String str = SharePatchFileUtil.at(localFile1);
          if (str == null)
          {
            com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:patch md5 is null, just return", new Object[0]);
            bool = false;
          }
          else
          {
            parama.ABw = str;
            com.tencent.tinker.lib.util.a.i("Tinker.UpgradePatch", "UpgradePatch tryPatch:patchMd5:%s", new Object[] { str });
            Object localObject2 = locala.ABC.getAbsolutePath();
            parama = SharePatchFileUtil.aup((String)localObject2);
            File localFile2 = SharePatchFileUtil.auo((String)localObject2);
            Object localObject3 = SharePatchInfo.l(localFile2, parama);
            if (localObject3 != null)
            {
              if ((((SharePatchInfo)localObject3).uWO == null) || (((SharePatchInfo)localObject3).AES == null) || (((SharePatchInfo)localObject3).ABP == null))
              {
                com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:onPatchInfoCorrupted", new Object[0]);
                locala.ABF.a(localFile1, ((SharePatchInfo)localObject3).uWO, ((SharePatchInfo)localObject3).AES);
                bool = false;
              }
              else if (!SharePatchFileUtil.aus(str))
              {
                com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:onPatchVersionCheckFail md5 %s is valid", new Object[] { str });
                locala.ABF.a(localFile1, (SharePatchInfo)localObject3, str);
                bool = false;
              }
              else if (((SharePatchInfo)localObject3).ABP.equals("interpet"))
              {
                paramString = "changing";
                label349: paramString = new SharePatchInfo(((SharePatchInfo)localObject3).uWO, str, false, Build.FINGERPRINT, paramString);
                localObject3 = SharePatchFileUtil.auq(str);
                localObject3 = (String)localObject2 + "/" + (String)localObject3;
                com.tencent.tinker.lib.util.a.i("Tinker.UpgradePatch", "UpgradePatch tryPatch:patchVersionDirectory:%s", new Object[] { localObject3 });
                localObject2 = new File((String)localObject3 + "/" + SharePatchFileUtil.aur(str));
              }
            }
            else
            {
              try
              {
                if (!str.equals(SharePatchFileUtil.at((File)localObject2)))
                {
                  SharePatchFileUtil.j(localFile1, (File)localObject2);
                  com.tencent.tinker.lib.util.a.w("Tinker.UpgradePatch", "UpgradePatch copy patch file, src file: %s size: %d, dest file: %s size:%d", new Object[] { localFile1.getAbsolutePath(), Long.valueOf(localFile1.length()), ((File)localObject2).getAbsolutePath(), Long.valueOf(((File)localObject2).length()) });
                }
                if (d.a(locala, (ShareSecurityCheck)localObject1, paramContext, (String)localObject3, (File)localObject2))
                  break label641;
                com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:new patch recover, try patch dex failed", new Object[0]);
                bool = false;
                continue;
                paramString = ((SharePatchInfo)localObject3).ABP;
                break label349;
                paramString = new SharePatchInfo("", str, false, Build.FINGERPRINT, "odex");
              }
              catch (IOException paramContext)
              {
                com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:copy patch file fail from %s to %s", new Object[] { localFile1.getPath(), ((File)localObject2).getPath() });
                locala.ABF.a(localFile1, (File)localObject2, localFile1.getName(), 1);
                bool = false;
              }
              continue;
              label641: if (!ShareTinkerInternals.Sb(locala.tinkerFlags))
              {
                com.tencent.tinker.lib.util.a.w("Tinker.BsDiffPatchInternal", "patch recover, library is not enabled", new Object[0]);
                bool = true;
              }
              long l;
              while (true)
              {
                if (bool)
                  break label794;
                com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:new patch recover, try patch library failed", new Object[0]);
                bool = false;
                break;
                str = (String)((ShareSecurityCheck)localObject1).AFg.get("assets/so_meta.txt");
                if (str == null)
                {
                  com.tencent.tinker.lib.util.a.w("Tinker.BsDiffPatchInternal", "patch recover, library is not contained", new Object[0]);
                  bool = true;
                }
                else
                {
                  l = SystemClock.elapsedRealtime();
                  bool = c.a(paramContext, (String)localObject3 + "/lib/", str, (File)localObject2);
                  com.tencent.tinker.lib.util.a.i("Tinker.BsDiffPatchInternal", "recover lib result:%b, cost:%d", new Object[] { Boolean.valueOf(bool), Long.valueOf(SystemClock.elapsedRealtime() - l) });
                }
              }
              label794: if (!ShareTinkerInternals.Sc(locala.tinkerFlags))
              {
                com.tencent.tinker.lib.util.a.w("Tinker.ResDiffPatchInternal", "patch recover, resource is not enabled", new Object[0]);
                bool = true;
              }
              while (true)
                if (!bool)
                {
                  com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:new patch recover, try patch resource failed", new Object[0]);
                  bool = false;
                  break;
                  localObject1 = (String)((ShareSecurityCheck)localObject1).AFg.get("assets/res_meta.txt");
                  if ((localObject1 == null) || (((String)localObject1).length() == 0))
                  {
                    com.tencent.tinker.lib.util.a.w("Tinker.ResDiffPatchInternal", "patch recover, resource is not contained", new Object[0]);
                    bool = true;
                  }
                  else
                  {
                    l = SystemClock.elapsedRealtime();
                    if (!e.c(paramContext, (String)localObject3 + "/res/", (String)localObject1, (File)localObject2))
                      com.tencent.tinker.lib.util.a.w("Tinker.ResDiffPatchInternal", "patch recover, extractDiffInternals fail", new Object[0]);
                    for (bool = false; ; bool = true)
                    {
                      com.tencent.tinker.lib.util.a.i("Tinker.ResDiffPatchInternal", "recover resource result:%b, cost:%d", new Object[] { Boolean.valueOf(bool), Long.valueOf(SystemClock.elapsedRealtime() - l) });
                      break;
                    }
                  }
                }
              if (!d.a(localFile1, locala))
              {
                com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:new patch recover, check dex opt file failed", new Object[0]);
                bool = false;
              }
              else if (!SharePatchInfo.a(localFile2, paramString, parama))
              {
                com.tencent.tinker.lib.util.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:new patch recover, rewrite patch info failed", new Object[0]);
                locala.ABF.a(localFile1, paramString.uWO, paramString.AES);
                bool = false;
              }
              else
              {
                com.tencent.tinker.lib.util.a.w("Tinker.UpgradePatch", "UpgradePatch tryPatch: done, it is ok", new Object[0]);
                bool = true;
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.c.f
 * JD-Core Version:    0.6.2
 */