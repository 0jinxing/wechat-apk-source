package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.g;

public final class b
{
  public static void bm(Context paramContext)
  {
    AppMethodBeat.i(57745);
    if (c.Ij())
    {
      com.tencent.mm.app.e.Bc();
      AppMethodBeat.o(57745);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent(paramContext, CoreService.class);
      try
      {
        paramContext.stopService(localIntent);
        AppMethodBeat.o(57745);
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.CoreServiceHelper", "stopServiceInstance() Exception:%s", new Object[] { paramContext.getMessage() });
        AppMethodBeat.o(57745);
      }
    }
  }

  public static boolean c(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(57744);
    if (((!paramString.equals("noop")) || ((g.xyf) && (g.xye))) && (l.bL(paramContext)))
    {
      ab.i("MicroMsg.CoreServiceHelper", "fully exited, no need to start service");
      paramBoolean = false;
      AppMethodBeat.o(57744);
      label47: return paramBoolean;
    }
    ab.i("MicroMsg.CoreServiceHelper", "ensure service running, type=%s ifRepeat=%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    Object localObject = new Intent(paramContext, CoreService.class);
    ((Intent)localObject).setFlags(268435456);
    ((Intent)localObject).putExtra("START_TYPE", paramString);
    if (c.Ij())
    {
      ab.i("MicroMsg.CoreServiceHelper", "ensureServiceInstance() bindService");
      ah.getContext().bindService((Intent)localObject, new com.tencent.mm.app.e(), 1);
      label126: ab.i("MicroMsg.CoreServiceUtil", "if_26_num=%s  if_ignore_false=%s  ignore_true=%s", new Object[] { Boolean.valueOf(as.amF("service_launch_way").getBoolean("if_26_num", true)), Boolean.valueOf(as.amF("service_launch_way").getBoolean("if_ignore_false", true)), Boolean.valueOf(as.amF("service_launch_way").getBoolean("ignore_true", false)) });
      if ((d.iW(26)) && (as.amF("service_launch_way").getBoolean("if_26_num", true)))
      {
        as.amF("service_launch_way").edit().putBoolean("if_26_num", false).commit();
        com.tencent.mm.plugin.report.e.pXa.a(954L, 92L, 1L, false);
      }
      if (d.iW(26))
      {
        if (c.bn(paramContext))
          break label974;
        if (as.amF("service_launch_way").getBoolean("if_ignore_false", true))
        {
          as.amF("service_launch_way").edit().putBoolean("if_ignore_false", false).commit();
          com.tencent.mm.plugin.report.e.pXa.a(954L, 90L, 1L, false);
          if (as.amF("service_launch_way").getBoolean("ignore_true", false))
            com.tencent.mm.plugin.report.e.pXa.a(954L, 91L, 1L, false);
        }
      }
    }
    while (true)
    {
      while (true)
      {
        paramBoolean = true;
        AppMethodBeat.o(57744);
        break;
        ab.i("MicroMsg.CoreServiceHelper", "ensureServiceInstance() startService");
        int i = 0;
        int j = 0;
        int k = 0;
        try
        {
          paramContext.startService((Intent)localObject);
          if (!d.iW(26))
            break label126;
          if (d.iW(26))
          {
            ab.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService crash_not_ignore=%s service_IllegalStateException=%s", new Object[] { Boolean.valueOf(as.amF("service_launch_way").getBoolean("crash_not_ignore", false)), Boolean.valueOf(c.bn(paramContext)) });
            if ((as.amF("service_launch_way").getBoolean("crash_not_ignore", false)) && (c.bn(paramContext)) && (i == 0))
            {
              as.amF("service_launch_way").edit().putBoolean("crash_not_ignore", false);
              com.tencent.mm.plugin.report.e.pXa.a(954L, 85L, 1L, false);
            }
          }
          if (k == 0)
            break label126;
          if (paramBoolean)
            paramBoolean = false;
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.CoreServiceHelper", "ensureServiceInstance() Exception = %s, Detail = %s SDK_INT = %s", new Object[] { localException.getClass().toString(), localException.getMessage(), Integer.valueOf(Build.VERSION.SDK_INT) });
            i = j;
            if ((localException instanceof IllegalStateException))
              i = 1;
            if (d.iW(26))
            {
              localObject = as.amF("service_launch_way");
              boolean bool = c.bn(paramContext);
              if (((as)localObject).getBoolean("service_first_crash", true))
              {
                ab.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=true result=%s", new Object[] { Boolean.valueOf(bool) });
                ((as)localObject).edit().putBoolean("service_first_crash", false).commit();
                com.tencent.mm.plugin.report.e.pXa.a(954L, 80L, 1L, false);
                if ((localException instanceof IllegalStateException))
                {
                  c.bu(false);
                  ((as)localObject).edit().putBoolean("service_IllegalStateException", true).commit();
                  com.tencent.mm.plugin.report.e.pXa.a(954L, 81L, 1L, false);
                  if (bool)
                  {
                    com.tencent.mm.plugin.report.e.pXa.a(954L, 82L, 1L, false);
                    j = 1;
                    k = i;
                    i = j;
                  }
                  else
                  {
                    ((as)localObject).edit().putBoolean("crash_not_ignore", true).commit();
                    com.tencent.mm.plugin.report.e.pXa.a(954L, 83L, 1L, false);
                    j = 1;
                    k = i;
                    i = j;
                  }
                }
                else
                {
                  com.tencent.mm.plugin.report.e.pXa.a(954L, 86L, 1L, false);
                  j = 1;
                  k = i;
                  i = j;
                }
              }
              else
              {
                ab.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false result=%s", new Object[] { Boolean.valueOf(bool) });
                if ((localException instanceof IllegalStateException))
                {
                  c.bu(false);
                  if (!((as)localObject).getBoolean("service_IllegalStateException", false))
                  {
                    ab.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false service_IllegalStateException=false");
                    ((as)localObject).edit().putBoolean("service_IllegalStateException", true).commit();
                    com.tencent.mm.plugin.report.e.pXa.a(954L, 87L, 1L, false);
                    if (bool)
                    {
                      com.tencent.mm.plugin.report.e.pXa.a(954L, 82L, 1L, false);
                      j = 1;
                      k = i;
                      i = j;
                      continue;
                    }
                    ((as)localObject).edit().putBoolean("crash_not_ignore", true).commit();
                    com.tencent.mm.plugin.report.e.pXa.a(954L, 83L, 1L, false);
                    j = 1;
                    k = i;
                    i = j;
                    continue;
                  }
                  ab.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false service_IllegalStateException=true");
                }
              }
            }
            else
            {
              j = 1;
              k = i;
              i = j;
            }
          }
          paramBoolean = false;
          AppMethodBeat.o(57744);
        }
      }
      break label47;
      label974: as.amF("service_launch_way").edit().putBoolean("ignore_true", true).commit();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.b
 * JD-Core Version:    0.6.2
 */