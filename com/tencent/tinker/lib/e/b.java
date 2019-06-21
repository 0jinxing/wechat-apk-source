package com.tencent.tinker.lib.e;

import android.content.Intent;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.util.a;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public final class b
{
  public static boolean c(ApplicationLike paramApplicationLike)
  {
    boolean bool = false;
    if ((paramApplicationLike == null) || (paramApplicationLike.getApplication() == null))
      throw new TinkerRuntimeException("tinkerApplication is null");
    paramApplicationLike = paramApplicationLike.getTinkerResultIntent();
    if (paramApplicationLike == null);
    while (true)
    {
      return bool;
      if (ShareIntentUtil.be(paramApplicationLike) == 0)
        bool = true;
    }
  }

  public static String d(ApplicationLike paramApplicationLike)
  {
    Object localObject1 = null;
    if ((paramApplicationLike == null) || (paramApplicationLike.getApplication() == null))
      throw new TinkerRuntimeException("tinkerApplication is null");
    Object localObject2 = paramApplicationLike.getTinkerResultIntent();
    if (localObject2 == null)
      paramApplicationLike = localObject1;
    while (true)
    {
      return paramApplicationLike;
      String str = ShareIntentUtil.n((Intent)localObject2, "intent_patch_old_version");
      localObject2 = ShareIntentUtil.n((Intent)localObject2, "intent_patch_new_version");
      boolean bool = ShareTinkerInternals.jp(paramApplicationLike.getApplication());
      paramApplicationLike = localObject1;
      if (str != null)
      {
        paramApplicationLike = localObject1;
        if (localObject2 != null)
          if (bool)
            paramApplicationLike = (ApplicationLike)localObject2;
          else
            paramApplicationLike = str;
      }
    }
  }

  public static void e(ApplicationLike paramApplicationLike)
  {
    if ((paramApplicationLike == null) || (paramApplicationLike.getApplication() == null))
      throw new TinkerRuntimeException("tinkerApplication is null");
    Object localObject = SharePatchFileUtil.jh(paramApplicationLike.getApplication());
    if (!((File)localObject).exists())
      a.w("Tinker.TinkerApplicationHelper", "try to clean patch while there're not any applied patches.", new Object[0]);
    while (true)
    {
      return;
      paramApplicationLike = SharePatchFileUtil.auo(((File)localObject).getAbsolutePath());
      if (!paramApplicationLike.exists())
      {
        a.w("Tinker.TinkerApplicationHelper", "try to clean patch while patch info file does not exist.", new Object[0]);
      }
      else
      {
        File localFile = SharePatchFileUtil.aup(((File)localObject).getAbsolutePath());
        localObject = SharePatchInfo.l(paramApplicationLike, localFile);
        if (localObject != null)
        {
          ((SharePatchInfo)localObject).AET = true;
          SharePatchInfo.a(paramApplicationLike, (SharePatchInfo)localObject, localFile);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.e.b
 * JD-Core Version:    0.6.2
 */