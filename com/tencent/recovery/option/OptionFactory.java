package com.tencent.recovery.option;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.tencent.recovery.ConstantsRecovery.DefaultProcessOptions;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.util.Util;

public class OptionFactory
{
  private static IOptionsCreator Art;

  public static ProcessOptions eN(String paramString, int paramInt)
  {
    ProcessOptions localProcessOptions = null;
    if (Art != null)
      localProcessOptions = Art.createProcessOptions(paramString, paramInt);
    paramString = localProcessOptions;
    if (localProcessOptions == null)
    {
      RecoveryLog.i("Recovery.OptionFactory", "not found custom process options, use default %d", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt != 1)
        break label54;
    }
    label54: for (paramString = ConstantsRecovery.DefaultProcessOptions.AqP; ; paramString = ConstantsRecovery.DefaultProcessOptions.AqN)
      return paramString;
  }

  public static CommonOptions iz(Context paramContext)
  {
    Object localObject1 = null;
    if (Art != null)
      localObject1 = Art.createCommonOptions(paramContext);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      RecoveryLog.i("Recovery.OptionFactory", "not found custom custom options, use default", new Object[0]);
      localObject1 = new CommonOptions.Builder();
      ((CommonOptions.Builder)localObject1).Arl = "";
      ((CommonOptions.Builder)localObject1).Arq = false;
      ((CommonOptions.Builder)localObject1).eCq = String.valueOf(Util.iB(paramContext));
    }
    try
    {
      ((CommonOptions.Builder)localObject1).clientVersion = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      label84: ((CommonOptions.Builder)localObject1).Arr = 600000L;
      ((CommonOptions.Builder)localObject1).Ars = 600000L;
      localObject2 = ((CommonOptions.Builder)localObject1).dQg();
      return localObject2;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      break label84;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.option.OptionFactory
 * JD-Core Version:    0.6.2
 */