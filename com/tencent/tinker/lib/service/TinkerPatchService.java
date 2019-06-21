package com.tencent.tinker.lib.service;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.tencent.tinker.lib.d.d;
import com.tencent.tinker.lib.util.TinkerJobIntentService;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public class TinkerPatchService extends TinkerJobIntentService
{
  private static com.tencent.tinker.lib.c.a ABx = null;
  private static Class<? extends AbstractResultService> ABy = null;
  private static AtomicBoolean ABz = new AtomicBoolean(false);
  private static int eee = -1119860829;

  public static void a(com.tencent.tinker.lib.c.a parama, Class<? extends AbstractResultService> paramClass)
  {
    ABx = parama;
    ABy = paramClass;
    try
    {
      Class.forName(paramClass.getName());
      label16: return;
    }
    catch (ClassNotFoundException parama)
    {
      break label16;
    }
  }

  public static String bb(Intent paramIntent)
  {
    if (paramIntent == null)
      throw new TinkerRuntimeException("getPatchPathExtra, but intent is null");
    return ShareIntentUtil.n(paramIntent, "patch_path_extra");
  }

  public static void ce(Context paramContext, String paramString)
  {
    com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchService", "run patch service...", new Object[0]);
    Intent localIntent = new Intent(paramContext, TinkerPatchService.class);
    localIntent.putExtra("patch_path_extra", paramString);
    localIntent.putExtra("patch_result_class", ABy.getName());
    try
    {
      paramString = new android/content/ComponentName;
      paramString.<init>(paramContext, TinkerPatchService.class);
      TinkerJobIntentService.a(paramContext, paramString, -252579085, localIntent);
      return;
    }
    catch (Throwable paramContext)
    {
      while (true)
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerPatchService", "run patch service fail, exception:".concat(String.valueOf(paramContext)), new Object[0]);
    }
  }

  public final void l(Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchService", "for system version >= Android O, we just ignore increasingPriority job to avoid crash or toasts.", new Object[0]);
      if (ABz.compareAndSet(false, true))
        break label155;
      com.tencent.tinker.lib.util.a.w("Tinker.TinkerPatchService", "TinkerPatchService doApplyPatch is running by another runner.", new Object[0]);
    }
    while (true)
    {
      while (true)
      {
        return;
        if ("ZUK".equals(Build.MANUFACTURER))
        {
          com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchService", "for ZUK device, we just ignore increasingPriority job to avoid crash.", new Object[0]);
          break;
        }
        com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchService", "try to increase patch process priority", new Object[0]);
        try
        {
          Notification localNotification = new android/app/Notification;
          localNotification.<init>();
          if (Build.VERSION.SDK_INT >= 18)
            break label127;
          startForeground(eee, localNotification);
        }
        catch (Throwable localThrowable1)
        {
          com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchService", "try to increase patch process priority error:".concat(String.valueOf(localThrowable1)), new Object[0]);
        }
      }
      break;
      label127: startForeground(eee, localThrowable1);
      Object localObject = new android/content/Intent;
      ((Intent)localObject).<init>(this, TinkerPatchService.InnerService.class);
      startService((Intent)localObject);
      break;
      label155: com.tencent.tinker.lib.e.a locala = com.tencent.tinker.lib.e.a.iX(this);
      locala.ABF.ad(paramIntent);
      if (paramIntent == null)
      {
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerPatchService", "TinkerPatchService received a null intent, ignoring.", new Object[0]);
      }
      else
      {
        String str = bb(paramIntent);
        if (str == null)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerPatchService", "TinkerPatchService can't get the path extra, ignoring.", new Object[0]);
        }
        else
        {
          File localFile = new File(str);
          long l = SystemClock.elapsedRealtime();
          localObject = null;
          a locala1 = new a();
          try
          {
            if (ABx == null)
            {
              localObject = new com/tencent/tinker/loader/TinkerRuntimeException;
              ((TinkerRuntimeException)localObject).<init>("upgradePatchProcessor is null.");
              throw ((Throwable)localObject);
            }
          }
          catch (Throwable localThrowable2)
          {
            locala.ABF.a(localFile, localThrowable2);
            for (boolean bool = false; ; bool = ABx.a(this, str, locala1))
            {
              l = SystemClock.elapsedRealtime() - l;
              locala.ABF.a(localFile, bool, l);
              locala1.cxT = bool;
              locala1.ABv = str;
              locala1.iBv = l;
              locala1.Arh = localThrowable2;
              if (paramIntent != null)
                break;
              throw new TinkerRuntimeException("getPatchResultExtra, but intent is null");
            }
            AbstractResultService.a(this, locala1, ShareIntentUtil.n(paramIntent, "patch_result_class"));
            ABz.set(false);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.service.TinkerPatchService
 * JD-Core Version:    0.6.2
 */