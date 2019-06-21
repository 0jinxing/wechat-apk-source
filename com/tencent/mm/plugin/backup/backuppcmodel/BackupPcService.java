package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService;
import com.tencent.mm.plugin.backup.g.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.service.MMService;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class BackupPcService extends MMService
{
  private boolean hOy = false;
  private boolean jwC = false;

  public final IBinder Iu()
  {
    return null;
  }

  public final String getTag()
  {
    return "MicroMsg.BackupPcService";
  }

  public final void onCreate()
  {
    AppMethodBeat.i(17564);
    ab.i("MicroMsg.BackupPcService", "onCreate.");
    super.onCreate();
    AppMethodBeat.o(17564);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(17566);
    super.onDestroy();
    ab.i("MicroMsg.BackupPcService", "onDestroy thread:" + Thread.currentThread().getName());
    AppMethodBeat.o(17566);
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(17565);
    ab.i("MicroMsg.BackupPcService", "onStartCommand.");
    if (paramIntent == null)
    {
      ab.w("MicroMsg.BackupPcService", "onStartCommand intent is null");
      AppMethodBeat.o(17565);
    }
    while (true)
    {
      return 2;
      final String str = paramIntent.getStringExtra("url");
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.BackupPcService", "onStartCommand url is null");
        stopSelf();
        AppMethodBeat.o(17565);
      }
      else if (str.contains("mm.gj.qq.com"))
      {
        ab.i("MicroMsg.BackupPcService", "onStartCommand url from gj stop and start BakOldUSBService");
        com.tencent.mm.bp.d.aH(new Intent(ah.getContext(), BakOldUSBService.class).putExtra("url", paramIntent.getStringExtra("url")).putExtra("isFromWifi", true));
        stopSelf();
        AppMethodBeat.o(17565);
      }
      else
      {
        this.jwC = paramIntent.getBooleanExtra("isFromWifi", false);
        this.hOy = paramIntent.getBooleanExtra("isMove", false);
        ab.i("MicroMsg.BackupPcService", "onStartCommand Broadcast url:%s, isFromWifi:%b, isMove:%b", new Object[] { str, Boolean.valueOf(this.jwC), Boolean.valueOf(this.hOy) });
        if ((!this.hOy) && (!aw.ZM()))
        {
          ab.e("MicroMsg.BackupPcService", "onStartCommand onStartCommand not in Login state");
          paramIntent = new Intent().setClassName(ah.getContext(), "com.tencent.mm.ui.LauncherUI");
          paramIntent.addFlags(335544320);
          paramIntent.putExtra("nofification_type", "back_to_pcmgr_notification");
          startActivity(paramIntent);
          AppMethodBeat.o(17565);
        }
        else
        {
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(17563);
              c localc = b.aTD().aTE();
              String str = str;
              ab.w("MicroMsg.BackupPcProcessMgr", "~~~~~~~~~~~~  start by url:%s", new Object[] { str });
              com.tencent.mm.plugin.backup.b.d.rk(1);
              com.tencent.mm.plugin.backup.g.b.aTZ();
              aw.ZK();
              localc.jwg = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xPA, Integer.valueOf(0))).intValue();
              b.aTD();
              Object localObject = b.aSz().edit();
              ((SharedPreferences.Editor)localObject).putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
              ((SharedPreferences.Editor)localObject).putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
              ((SharedPreferences.Editor)localObject).putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
              ((SharedPreferences.Editor)localObject).putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
              ((SharedPreferences.Editor)localObject).commit();
              localc.jwh = true;
              aw.Rg().a(595, localc.jtG);
              localObject = new e(str);
              aw.Rg().a((m)localObject, 0);
              AppMethodBeat.o(17563);
            }
          });
          AppMethodBeat.o(17565);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.BackupPcService
 * JD-Core Version:    0.6.2
 */