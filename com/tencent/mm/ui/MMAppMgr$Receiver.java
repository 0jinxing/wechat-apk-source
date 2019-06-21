package com.tencent.mm.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Process;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.f.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

@JgClassChecked(author=20, fComment="checked", lastDate="20141015", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class MMAppMgr$Receiver extends BroadcastReceiver
{
  private MMAppMgr appMgr;

  public MMAppMgr$Receiver()
  {
  }

  public MMAppMgr$Receiver(MMAppMgr paramMMAppMgr)
  {
    this.appMgr = paramMMAppMgr;
  }

  private static boolean aT(Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(29567);
    if (!paramIntent.getBooleanExtra("process_is_mm", false))
      AppMethodBeat.o(29567);
    while (true)
    {
      return bool;
      if (paramIntent.getIntExtra("process_id", 0) == Process.myPid())
      {
        AppMethodBeat.o(29567);
      }
      else
      {
        AppMethodBeat.o(29567);
        bool = false;
      }
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(29568);
    if (paramIntent == null)
      AppMethodBeat.o(29568);
    while (true)
    {
      return;
      if ((aw.ZD()) || (aw.ZF()))
      {
        AppMethodBeat.o(29568);
      }
      else
      {
        String str = paramIntent.getAction();
        if ("com.tencent.mm.ui.ACTION_ACTIVE".equals(str))
        {
          if (!aT(paramIntent))
          {
            ab.w("MicroMsg.MMAppMgr", "onreceive active process changed old: %d, new: %d", new Object[] { Integer.valueOf(paramIntent.getIntExtra("process_id", 0)), Integer.valueOf(Process.myPid()) });
            AppMethodBeat.o(29568);
          }
          else
          {
            MMAppMgr.a(this.appMgr, paramIntent, true);
            this.appMgr.c(paramIntent, true);
            AppMethodBeat.o(29568);
          }
        }
        else if ("com.tencent.mm.ui.ACTION_DEACTIVE".equals(str))
        {
          if (!aT(paramIntent))
          {
            ab.w("MicroMsg.MMAppMgr", "onreceive deactive process changed old: %d, new: %d", new Object[] { Integer.valueOf(paramIntent.getIntExtra("process_id", 0)), Integer.valueOf(Process.myPid()) });
            AppMethodBeat.o(29568);
          }
          else
          {
            com.tencent.mm.booter.n.IF();
            MMAppMgr.a(this.appMgr, paramIntent, false);
            this.appMgr.c(paramIntent, false);
            if ((MMAppMgr.dyt() != null) && (MMAppMgr.dyt().length() > 800))
              new ak(Looper.getMainLooper()).post(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(29565);
                  MMAppMgr.BK();
                  AppMethodBeat.o(29565);
                }
              });
            AppMethodBeat.o(29568);
          }
        }
        else if ("com.tencent.mm.ui.ACTION_ABTEST".equals(str))
        {
          MMAppMgr.aS(paramIntent);
          if ((MMAppMgr.dyt() != null) && (MMAppMgr.dyt().length() > 800))
            new ak(Looper.getMainLooper()).post(new MMAppMgr.Receiver.2(this));
          AppMethodBeat.o(29568);
        }
        else if (paramIntent.getAction().equals("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE"))
        {
          int i;
          if (!paramIntent.getBooleanExtra("intent_extra_is_silence_stat", false))
          {
            i = paramIntent.getIntExtra("intent_extra_opcode", 0);
            ab.d("MicroMsg.MMAppMgr", "incremental_update = ".concat(String.valueOf(i)));
            if (aw.RK())
              h.pYm.e(10328, new Object[] { Integer.valueOf(i) });
          }
          long l1;
          long l2;
          label621: 
          while (true)
          {
            l1 = paramIntent.getLongExtra("intent_extra_flow_stat_upstream", 0L);
            l2 = paramIntent.getLongExtra("intent_extra_flow_stat_downstream", 0L);
            boolean bool = paramIntent.getBooleanExtra("intent_extra_flow_stat_is_wifi", false);
            if ((!aw.RK()) || ((l1 == 0L) && (l2 == 0L)))
              break label633;
            ab.d("MicroMsg.MMAppMgr", "silence_update_flow_stat upstream %s downstream %s isWifi %s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Boolean.valueOf(bool) });
            if (!bool)
              break label623;
            com.tencent.mm.modelstat.n.I((int)l2, (int)l1, 0);
            AppMethodBeat.o(29568);
            break;
            i = paramIntent.getIntExtra("intent_extra_opcode", 0);
            ab.d("MicroMsg.MMAppMgr", "silence_update_stat = ".concat(String.valueOf(i)));
            if (aw.RK())
            {
              if (i == 2)
              {
                int j = paramIntent.getIntExtra("intent_extra_install_dialog_times", 0);
                h.pYm.e(11147, new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
              }
              while (true)
              {
                if ((i != 4) || (i.dhV() != 4))
                  break label621;
                paramContext = com.tencent.mm.pluginsdk.model.app.a.dhs();
                if (paramContext == null)
                  break;
                paramContext.dhu();
                break;
                h.pYm.e(11147, new Object[] { Integer.valueOf(i) });
              }
            }
          }
          label623: com.tencent.mm.modelstat.n.J((int)l2, (int)l1, 0);
          label633: AppMethodBeat.o(29568);
        }
        else if (paramIntent.getAction().equals("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP"))
        {
          MMAppMgr.bd(paramContext);
          AppMethodBeat.o(29568);
        }
        else if (paramIntent.getAction().equals("MINIQB_OPEN_RET"))
        {
          com.tencent.mm.pluginsdk.ui.tools.a.aF(paramIntent);
          AppMethodBeat.o(29568);
        }
        else
        {
          ab.e("MicroMsg.MMAppMgr", "unknown broadcast action");
          AppMethodBeat.o(29568);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.Receiver
 * JD-Core Version:    0.6.2
 */