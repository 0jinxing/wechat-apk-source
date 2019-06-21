package com.tencent.tinker.loader;

import android.content.Intent;
import com.tencent.tinker.loader.shareutil.ShareBsDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TinkerSoLoader
{
  public static boolean a(String paramString, ShareSecurityCheck paramShareSecurityCheck, Intent paramIntent)
  {
    paramShareSecurityCheck = (String)paramShareSecurityCheck.AFg.get("assets/so_meta.txt");
    boolean bool;
    if (paramShareSecurityCheck == null)
      bool = true;
    while (true)
    {
      return bool;
      Object localObject1 = new ArrayList();
      ShareBsDiffPatchInfo.n(paramShareSecurityCheck, (ArrayList)localObject1);
      if (((ArrayList)localObject1).isEmpty())
      {
        bool = true;
      }
      else
      {
        paramString = paramString + "/lib/";
        paramShareSecurityCheck = new HashMap();
        Object localObject2 = ((ArrayList)localObject1).iterator();
        while (true)
        {
          if (!((Iterator)localObject2).hasNext())
            break label178;
          localObject1 = (ShareBsDiffPatchInfo)((Iterator)localObject2).next();
          if (!ShareBsDiffPatchInfo.a((ShareBsDiffPatchInfo)localObject1))
          {
            paramIntent.putExtra("intent_patch_package_patch_check", -4);
            ShareIntentUtil.b(paramIntent, -8);
            bool = false;
            break;
          }
          paramShareSecurityCheck.put(((ShareBsDiffPatchInfo)localObject1).path + "/" + ((ShareBsDiffPatchInfo)localObject1).name, ((ShareBsDiffPatchInfo)localObject1).cvZ);
        }
        label178: localObject1 = new File(paramString);
        if ((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory()))
        {
          ShareIntentUtil.b(paramIntent, -17);
          bool = false;
        }
        else
        {
          localObject1 = paramShareSecurityCheck.keySet().iterator();
          while (true)
            if (((Iterator)localObject1).hasNext())
            {
              localObject2 = (String)((Iterator)localObject1).next();
              localObject2 = new File(paramString + (String)localObject2);
              if (!SharePatchFileUtil.ap((File)localObject2))
              {
                ShareIntentUtil.b(paramIntent, -18);
                paramIntent.putExtra("intent_patch_missing_lib_path", ((File)localObject2).getAbsolutePath());
                bool = false;
                break;
              }
            }
          paramIntent.putExtra("intent_patch_libs_path", paramShareSecurityCheck);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.TinkerSoLoader
 * JD-Core Version:    0.6.2
 */