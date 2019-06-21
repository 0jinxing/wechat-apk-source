package com.tencent.tinker.loader;

import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareResPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;
import java.util.HashMap;

public class TinkerResourceLoader
{
  private static ShareResPatchInfo ACI = new ShareResPatchInfo();

  public static boolean a(Context paramContext, String paramString, ShareSecurityCheck paramShareSecurityCheck, Intent paramIntent)
  {
    paramShareSecurityCheck = (String)paramShareSecurityCheck.AFg.get("assets/res_meta.txt");
    boolean bool;
    if (paramShareSecurityCheck == null)
      bool = true;
    while (true)
    {
      return bool;
      ShareResPatchInfo.b(paramShareSecurityCheck, ACI);
      if (ACI.AEW == null)
      {
        bool = true;
      }
      else if (!ShareResPatchInfo.a(ACI))
      {
        paramIntent.putExtra("intent_patch_package_patch_check", -8);
        ShareIntentUtil.b(paramIntent, -8);
        bool = false;
      }
      else
      {
        paramString = paramString + "/res/";
        paramShareSecurityCheck = new File(paramString);
        if ((!paramShareSecurityCheck.exists()) || (!paramShareSecurityCheck.isDirectory()))
        {
          ShareIntentUtil.b(paramIntent, -21);
          bool = false;
        }
        else if (!SharePatchFileUtil.ap(new File(paramString + "resources.apk")))
        {
          ShareIntentUtil.b(paramIntent, -22);
          bool = false;
        }
        else
        {
          try
          {
            TinkerResourcePatcher.jd(paramContext);
            bool = true;
          }
          catch (Throwable paramContext)
          {
            paramIntent.putExtra("intent_patch_exception", paramContext);
            ShareIntentUtil.b(paramIntent, -23);
            bool = false;
          }
        }
      }
    }
  }

  public static boolean a(TinkerApplication paramTinkerApplication, String paramString, Intent paramIntent)
  {
    boolean bool = false;
    if ((ACI == null) || (ACI.AEW == null))
      bool = true;
    while (true)
    {
      return bool;
      paramString = paramString + "/res/resources.apk";
      Object localObject = new File(paramString);
      long l = System.currentTimeMillis();
      if (paramTinkerApplication.isTinkerLoadVerifyFlag())
      {
        if (!SharePatchFileUtil.i((File)localObject, ACI.AEW))
        {
          new StringBuilder("Failed to load resource file, path: ").append(((File)localObject).getPath()).append(", expect md5: ").append(ACI.AEW);
          ShareIntentUtil.b(paramIntent, -24);
          continue;
        }
        new StringBuilder("verify resource file:").append(((File)localObject).getPath()).append(" md5, use time: ").append(System.currentTimeMillis() - l);
      }
      try
      {
        TinkerResourcePatcher.cg(paramTinkerApplication, paramString);
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("monkeyPatchExistingResources resource file:");
        ((StringBuilder)localObject).append(paramString).append(", use time: ").append(System.currentTimeMillis() - l);
        bool = true;
      }
      catch (Throwable paramString)
      {
      }
      try
      {
        SystemClassLoaderAdder.a(paramTinkerApplication.getClassLoader());
        label201: paramIntent.putExtra("intent_patch_exception", paramString);
        ShareIntentUtil.b(paramIntent, -23);
      }
      catch (Throwable paramTinkerApplication)
      {
        break label201;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.TinkerResourceLoader
 * JD-Core Version:    0.6.2
 */