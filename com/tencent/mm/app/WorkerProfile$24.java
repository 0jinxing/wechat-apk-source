package com.tencent.mm.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.pw;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.c;

final class WorkerProfile$24 extends com.tencent.mm.sdk.b.c<pw>
{
  WorkerProfile$24(WorkerProfile paramWorkerProfile)
  {
    AppMethodBeat.i(15514);
    this.xxI = pw.class.getName().hashCode();
    AppMethodBeat.o(15514);
  }

  private boolean Cg()
  {
    AppMethodBeat.i(15515);
    Object localObject;
    int i;
    int j;
    long l1;
    int k;
    int m;
    if (d.iW(23))
    {
      localObject = ah.getContext();
      i = ((a)g.K(a.class)).a(a.a.lJa, 0);
      j = as.amF("sdcard_usable_report").getInt("ignore_battery_dialog_time", 0);
      ab.i("MicroMsg.BatteryUtil", "getIgnoreBatteryOptimizationsDialogTime() time=%s", new Object[] { Integer.valueOf(j) });
      if ((bo.gW(i, 1)) && (j < 3) && (!com.tencent.mm.booter.c.bn((Context)localObject)))
      {
        ab.i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations()");
        localObject = as.amF("sdcard_usable_report").edit();
        l1 = System.currentTimeMillis();
        k = 0;
        m = 0;
        i = 0;
        if (j != 0)
          break label245;
      }
    }
    while (true)
    {
      try
      {
        com.tencent.mm.booter.c.Ih();
        if (i == 0)
        {
          ((SharedPreferences.Editor)localObject).putLong("last_ignore_battery_dialog_time", l1);
          ((SharedPreferences.Editor)localObject).putInt("ignore_battery_dialog_time", 1);
        }
        ((SharedPreferences.Editor)localObject).commit();
        if ((com.tencent.mm.pluginsdk.i.c.diH()) || (WorkerProfile.d(this.cfZ)))
          break label670;
        WorkerProfile.Cd();
        ab.i("MicroMsg.WorkerProfile", "tipCountAboutSdcarDisable:%d", new Object[] { Integer.valueOf(WorkerProfile.access$400()) });
        if (WorkerProfile.access$400() > 0)
          break label463;
        AppMethodBeat.o(15515);
        return false;
      }
      catch (Exception localException1)
      {
        i = 1;
        ab.i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() Exception:%s %s", new Object[] { localException1.getClass().toString(), localException1.getMessage() });
        continue;
      }
      label245: long l2 = as.amF("sdcard_usable_report").getLong("last_ignore_battery_dialog_time", l1);
      long l3 = l1 - l2;
      ab.i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() last:%s diff:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l3) });
      if (j == 1)
      {
        if (l3 >= 86400000L)
          try
          {
            com.tencent.mm.booter.c.Ih();
            i = k;
            if (i != 0)
              continue;
            ((SharedPreferences.Editor)localObject).putLong("last_ignore_battery_dialog_time", l1);
            ((SharedPreferences.Editor)localObject).putInt("ignore_battery_dialog_time", 2);
          }
          catch (Exception localException2)
          {
            while (true)
            {
              i = 1;
              ab.i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() Exception:%s %s", new Object[] { localException2.getClass().toString(), localException2.getMessage() });
            }
          }
      }
      else if ((j == 2) && (l3 >= 604800000L))
      {
        try
        {
          com.tencent.mm.booter.c.Ih();
          i = m;
          if (i != 0)
            continue;
          ((SharedPreferences.Editor)localObject).putLong("last_ignore_battery_dialog_time", l1);
          ((SharedPreferences.Editor)localObject).putInt("ignore_battery_dialog_time", 3);
        }
        catch (Exception localException3)
        {
          while (true)
          {
            i = 1;
            ab.i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() Exception:%s %s", new Object[] { localException3.getClass().toString(), localException3.getMessage() });
          }
        }
        label463: WorkerProfile.a(this.cfZ, true);
        switch (WorkerProfile.access$400())
        {
        default:
        case 1:
        case 3:
        case 5:
        case 10:
        }
        while (true)
        {
          new e.a(ah.getContext()).asL(ah.getContext().getString(2131302793)).al(ah.getContext().getString(2131297061)).re(false).b(new e.c()
          {
            public final void d(boolean paramAnonymousBoolean, String paramAnonymousString)
            {
              AppMethodBeat.i(15513);
              com.tencent.mm.ui.MMAppMgr.ymL = false;
              WorkerProfile.a(WorkerProfile.24.this.cfZ, false);
              AppMethodBeat.o(15513);
            }
          }).show();
          AppMethodBeat.o(15515);
          break;
          h.pYm.k(951L, 0L, 1L);
          localObject = ah.getContext().getSharedPreferences("sdcard_usable_report", 4).edit();
          ((SharedPreferences.Editor)localObject).putInt("mm_process_pid", Process.myPid());
          ((SharedPreferences.Editor)localObject).commit();
          continue;
          h.pYm.k(951L, 1L, 1L);
          continue;
          h.pYm.k(951L, 2L, 1L);
          continue;
          h.pYm.k(951L, 3L, 1L);
        }
        label670: ab.i("MicroMsg.WorkerProfile", "SdcardUsableDetectionEvent pass tipCountAboutSdcarDisable=%s ifSdcardDialogShow=%s", new Object[] { Integer.valueOf(WorkerProfile.access$400()), Boolean.valueOf(WorkerProfile.d(this.cfZ)) });
        WorkerProfile.Ce();
        if (WorkerProfile.d(this.cfZ))
        {
          AppMethodBeat.o(15515);
        }
        else
        {
          localObject = ah.getContext().getSharedPreferences("sdcard_usable_report", 4);
          i = ((SharedPreferences)localObject).getInt("mm_process_pid", -1);
          k = Process.myPid();
          ab.i("MicroMsg.WorkerProfile", "SdcardUsableDetectionEvent pass mmPid=%s mmCurPid=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
          if (!bo.gW(i, -1))
            break;
          AppMethodBeat.o(15515);
        }
      }
    }
    if (bo.gW(i, k))
      h.pYm.k(951L, 22L, 1L);
    while (true)
    {
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putInt("mm_process_pid", -1);
      ((SharedPreferences.Editor)localObject).commit();
      AppMethodBeat.o(15515);
      break;
      if (!bo.gW(i, k))
        h.pYm.k(951L, 21L, 1L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WorkerProfile.24
 * JD-Core Version:    0.6.2
 */