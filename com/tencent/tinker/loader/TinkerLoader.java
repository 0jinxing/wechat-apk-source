package com.tencent.tinker.loader;

import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.hotplug.ComponentHotplug;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public class TinkerLoader extends AbstractTinkerLoader
{
  private static final String TAG = "Tinker.TinkerLoader";
  private SharePatchInfo patchInfo;

  private boolean checkSafeModeCount(TinkerApplication paramTinkerApplication)
  {
    boolean bool = false;
    int i = ShareTinkerInternals.jo(paramTinkerApplication);
    if (i >= 2)
      ShareTinkerInternals.aD(paramTinkerApplication, 0);
    while (true)
    {
      return bool;
      paramTinkerApplication.setUseSafeMode(true);
      ShareTinkerInternals.aD(paramTinkerApplication, i + 1);
      bool = true;
    }
  }

  private void tryLoadPatchFilesInternal(TinkerApplication paramTinkerApplication, Intent paramIntent)
  {
    int i = paramTinkerApplication.getTinkerFlags();
    if (!ShareTinkerInternals.Se(i))
      ShareIntentUtil.b(paramIntent, -1);
    Object localObject1;
    Object localObject2;
    File localFile1;
    File localFile2;
    Object localObject4;
    String str;
    while (true)
    {
      return;
      if (ShareTinkerInternals.jq(paramTinkerApplication))
      {
        ShareIntentUtil.b(paramIntent, -1);
      }
      else
      {
        localObject1 = SharePatchFileUtil.jh(paramTinkerApplication);
        if (localObject1 == null)
        {
          ShareIntentUtil.b(paramIntent, -2);
        }
        else
        {
          localObject2 = ((File)localObject1).getAbsolutePath();
          if (!((File)localObject1).exists())
          {
            ShareIntentUtil.b(paramIntent, -2);
          }
          else
          {
            localFile1 = SharePatchFileUtil.auo((String)localObject2);
            if (!localFile1.exists())
            {
              new StringBuilder("tryLoadPatchFiles:patch info not exist:").append(localFile1.getAbsolutePath());
              ShareIntentUtil.b(paramIntent, -3);
            }
            else
            {
              localFile2 = SharePatchFileUtil.aup((String)localObject2);
              this.patchInfo = SharePatchInfo.l(localFile1, localFile2);
              if (this.patchInfo == null)
              {
                ShareIntentUtil.b(paramIntent, -4);
              }
              else
              {
                localObject3 = this.patchInfo.uWO;
                localObject4 = this.patchInfo.AES;
                str = this.patchInfo.ABP;
                if ((localObject3 != null) && (localObject4 != null) && (str != null))
                  break;
                ShareIntentUtil.b(paramIntent, -4);
              }
            }
          }
        }
      }
    }
    boolean bool1 = ShareTinkerInternals.jp(paramTinkerApplication);
    boolean bool2 = this.patchInfo.AET;
    if ((bool1) && (bool2))
    {
      localObject1 = SharePatchFileUtil.auq((String)localObject4);
      if (localObject1 != null)
      {
        SharePatchFileUtil.cu((String)localObject2 + "/" + (String)localObject1);
        localObject1 = localObject3;
        if (((String)localObject3).equals(localObject4))
          localObject1 = "";
        this.patchInfo.uWO = ((String)localObject1);
        this.patchInfo.AES = ((String)localObject1);
        SharePatchInfo.a(localFile1, this.patchInfo, localFile2);
        ShareTinkerInternals.js(paramTinkerApplication);
      }
    }
    for (Object localObject3 = localObject1; ; localObject3 = localObject4)
    {
      paramIntent.putExtra("intent_patch_old_version", (String)localObject1);
      paramIntent.putExtra("intent_patch_new_version", (String)localObject3);
      if (!((String)localObject1).equals(localObject3));
      boolean bool3;
      for (int j = 1; ; j = 0)
      {
        bool3 = str.equals("changing");
        str = ShareTinkerInternals.ch(paramTinkerApplication, str);
        paramIntent.putExtra("intent_patch_oat_dir", str);
        localObject4 = localObject1;
        if (j != 0)
        {
          localObject4 = localObject1;
          if (bool1)
            localObject4 = localObject3;
        }
        if (!ShareTinkerInternals.isNullOrNil((String)localObject4))
          break label428;
        ShareIntentUtil.b(paramIntent, -5);
        break;
      }
      label428: localObject1 = SharePatchFileUtil.auq((String)localObject4);
      if (localObject1 == null)
      {
        ShareIntentUtil.b(paramIntent, -6);
        break;
      }
      localObject3 = (String)localObject2 + "/" + (String)localObject1;
      localObject1 = new File((String)localObject3);
      if (!((File)localObject1).exists())
      {
        ShareIntentUtil.b(paramIntent, -6);
        break;
      }
      localObject2 = SharePatchFileUtil.aur((String)localObject4);
      if (localObject2 != null);
      for (localObject1 = new File(((File)localObject1).getAbsolutePath(), (String)localObject2); ; localObject1 = null)
      {
        if (SharePatchFileUtil.ap((File)localObject1))
          break label555;
        ShareIntentUtil.b(paramIntent, -7);
        break;
      }
      label555: localObject2 = new ShareSecurityCheck(paramTinkerApplication);
      int k = ShareTinkerInternals.a(paramTinkerApplication, i, (File)localObject1, (ShareSecurityCheck)localObject2);
      if (k != 0)
      {
        paramIntent.putExtra("intent_patch_package_patch_check", k);
        ShareIntentUtil.b(paramIntent, -8);
        break;
      }
      paramIntent.putExtra("intent_patch_package_config", ((ShareSecurityCheck)localObject2).dSo());
      boolean bool4 = ShareTinkerInternals.Sa(i);
      if (((bool4) && (!TinkerDexLoader.a((String)localObject3, (ShareSecurityCheck)localObject2, str, paramIntent))) || ((ShareTinkerInternals.Sb(i)) && (!TinkerSoLoader.a((String)localObject3, (ShareSecurityCheck)localObject2, paramIntent))))
        break;
      boolean bool5 = ShareTinkerInternals.Sc(i);
      if ((bool5) && (!TinkerResourceLoader.a(paramTinkerApplication, (String)localObject3, (ShareSecurityCheck)localObject2, paramIntent)))
        break;
      if ((ShareTinkerInternals.dSp()) && (ShareTinkerInternals.auu(this.patchInfo.AEU)) && (Build.VERSION.SDK_INT >= 21) && (!ShareTinkerInternals.dSr()));
      for (bool2 = true; ; bool2 = false)
      {
        paramIntent.putExtra("intent_patch_system_ota", bool2);
        if ((!bool1) || ((j == 0) && (!bool3)))
          break label816;
        this.patchInfo.uWO = ((String)localObject4);
        this.patchInfo.ABP = str;
        if (SharePatchInfo.a(localFile1, this.patchInfo, localFile2))
          break label783;
        ShareIntentUtil.b(paramIntent, -19);
        break;
      }
      label783: ShareTinkerInternals.js(paramTinkerApplication);
      if (bool3)
        SharePatchFileUtil.cu((String)localObject3 + "/interpet");
      label816: if (!checkSafeModeCount(paramTinkerApplication))
      {
        paramIntent.putExtra("intent_patch_exception", new TinkerRuntimeException("checkSafeModeCount fail"));
        ShareIntentUtil.b(paramIntent, -25);
        break;
      }
      if (bool4)
      {
        bool1 = TinkerDexLoader.a(paramTinkerApplication, (String)localObject3, str, paramIntent, bool2);
        if (bool2)
        {
          this.patchInfo.AEU = Build.FINGERPRINT;
          localObject4 = this.patchInfo;
          if (bool1);
          for (localObject1 = "interpet"; ; localObject1 = "odex")
          {
            ((SharePatchInfo)localObject4).ABP = ((String)localObject1);
            if (SharePatchInfo.a(localFile1, this.patchInfo, localFile2))
              break label936;
            ShareIntentUtil.b(paramIntent, -19);
            break;
          }
          label936: paramIntent.putExtra("intent_patch_oat_dir", this.patchInfo.ABP);
        }
        if (!bool1)
          break;
      }
      if ((bool5) && (!TinkerResourceLoader.a(paramTinkerApplication, (String)localObject3, paramIntent)))
        break;
      if ((bool4) && (bool5))
        ComponentHotplug.a(paramTinkerApplication, (ShareSecurityCheck)localObject2);
      ShareIntentUtil.b(paramIntent, 0);
      break;
      localObject1 = localObject3;
    }
  }

  public Intent tryLoad(TinkerApplication paramTinkerApplication)
  {
    Intent localIntent = new Intent();
    long l = SystemClock.elapsedRealtime();
    tryLoadPatchFilesInternal(paramTinkerApplication, localIntent);
    ShareIntentUtil.a(localIntent, SystemClock.elapsedRealtime() - l);
    return localIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.TinkerLoader
 * JD-Core Version:    0.6.2
 */