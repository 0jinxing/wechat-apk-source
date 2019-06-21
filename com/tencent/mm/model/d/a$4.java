package com.tencent.mm.model.d;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.os.Process;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.lang.reflect.Method;

public final class a$4
  implements Runnable
{
  public a$4(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16376);
    File localFile = new File(a.abp());
    if (!localFile.exists())
    {
      ab.w("MicroMsg.HandlerTraceManager", "summer handler trace file is not exists");
      AppMethodBeat.o(16376);
    }
    while (true)
    {
      return;
      if (!g.RN().QY())
      {
        ab.w("MicroMsg.HandlerTraceManager", "summer acc not ready ");
        AppMethodBeat.o(16376);
      }
      else
      {
        long l1 = a.l(this.fph).getLong("handler_report_lastUploadTime", 0L);
        long l2 = System.currentTimeMillis();
        int i;
        Object localObject1;
        Object localObject2;
        Object localObject3;
        if ((l2 - l1 > a.m(this.fph)) || (l1 > l2))
        {
          i = 1;
          if ((a.j(this.fph)) && (i != 0))
          {
            ab.i("MicroMsg.HandlerTraceManager", "summer check need upload ,file size is %d,time out %b", new Object[] { Long.valueOf(localFile.length()), Boolean.TRUE });
            localObject1 = this.fph;
            localObject2 = ah.getContext();
            localObject3 = ah.getContext().getPackageName();
          }
        }
        else
        {
          try
          {
            Method localMethod = PackageManager.class.getMethod("getPackageSizeInfo", new Class[] { String.class, IPackageStatsObserver.class });
            localObject2 = ((Context)localObject2).getPackageManager();
            localObject4 = new com/tencent/mm/model/d/a$5;
            ((a.5)localObject4).<init>((a)localObject1);
            localMethod.invoke(localObject2, new Object[] { localObject3, localObject4 });
            if ((a.n(this.fph)[1] != 0L) || (a.o(this.fph) > 1L))
              if (localFile.length() > a.p(this.fph))
              {
                ab.e("MicroMsg.HandlerTraceManager", "summer log file invaild format");
                a.a(this.fph, localFile);
                a.q(this.fph);
                a.r(this.fph);
                a.l(this.fph).edit().putLong("handler_report_lastUploadTime", System.currentTimeMillis()).commit();
                AppMethodBeat.o(16376);
                continue;
                i = 0;
              }
          }
          catch (Exception localException)
          {
            while (true)
            {
              ((a)localObject1).ceM[0] = -1L;
              ((a)localObject1).ceM[1] = -1L;
              ((a)localObject1).ceM[2] = -1L;
              continue;
              localObject2 = a.pf(a.abp());
              Object localObject4 = this.fph;
              localObject3 = new Intent();
              ((Intent)localObject3).setClassName(ah.getPackageName(), "com.tencent.mm.sandbox.monitor.ExceptionMonitorBroadcastReceiver");
              ((Intent)localObject3).setAction("uncatch_exception");
              ((Intent)localObject3).putExtra("exceptionPid", Process.myPid());
              String str = av.fly.T("login_weixin_username", "");
              localObject1 = str;
              if (bo.isNullOrNil(str))
                localObject1 = av.fly.T("login_user_name", "never_login_crash");
              ((Intent)localObject3).putExtra("userName", (String)localObject1);
              ((Intent)localObject3).putExtra("tag", "handler");
              ((Intent)localObject3).putExtra("exceptionMsg", Base64.encodeToString((((a)localObject4).abm() + (String)localObject2).getBytes(), 2));
              ah.getContext().sendBroadcast((Intent)localObject3);
            }
            a.s(this.fph);
          }
        }
        AppMethodBeat.o(16376);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(16377);
    String str = super.toString() + "|checkAndUpload";
    AppMethodBeat.o(16377);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d.a.4
 * JD-Core Version:    0.6.2
 */