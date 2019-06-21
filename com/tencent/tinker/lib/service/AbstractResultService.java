package com.tencent.tinker.lib.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.lib.util.TinkerJobIntentService;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;

public abstract class AbstractResultService extends TinkerJobIntentService
{
  public static void a(Context paramContext, a parama, String paramString)
  {
    if (paramString == null)
      throw new TinkerRuntimeException("resultServiceClass is null.");
    try
    {
      if (!TinkerJobIntentService.class.isAssignableFrom(Class.forName(paramString)))
      {
        paramContext = new com/tencent/tinker/loader/TinkerRuntimeException;
        paramContext.<init>("on tinker version 1.9.10 result service class must inherit from TinkerJobIntentService.");
        throw paramContext;
      }
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new TinkerRuntimeException("cannot find result service class: ".concat(String.valueOf(paramString)), paramContext);
    }
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      localIntent.setClassName(paramContext, paramString);
      localIntent.putExtra("result_extra", parama);
      parama = new android/content/ComponentName;
      parama.<init>(paramContext, paramString);
      a(paramContext, parama, -202050058, localIntent);
      return;
    }
    catch (Throwable paramContext)
    {
      while (true)
        com.tencent.tinker.lib.util.a.e("Tinker.AbstractResultService", "run result service fail, exception:".concat(String.valueOf(paramContext)), new Object[0]);
    }
  }

  public abstract void a(a parama);

  public final void l(Intent paramIntent)
  {
    if (paramIntent == null)
      com.tencent.tinker.lib.util.a.e("Tinker.AbstractResultService", "AbstractResultService received a null intent, ignoring.", new Object[0]);
    while (true)
    {
      return;
      a((a)ShareIntentUtil.u(paramIntent, "result_extra"));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.service.AbstractResultService
 * JD-Core Version:    0.6.2
 */