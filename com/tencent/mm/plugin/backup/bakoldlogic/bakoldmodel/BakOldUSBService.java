package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import android.content.Intent;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.c;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.protocal.protobuf.ahq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.service.MMService;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class BakOldUSBService extends MMService
  implements com.tencent.mm.ai.f
{
  private boolean jwC = false;
  private int jyS = -1;

  private boolean aUz()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (this.jyS != 0)
      if (this.jyS != 1)
        break label23;
    label23: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public final IBinder Iu()
  {
    AppMethodBeat.i(17755);
    ab.i("MicroMsg.BakOldUSBService", "onBind()");
    AppMethodBeat.o(17755);
    return null;
  }

  public final String getTag()
  {
    return "MicroMsg.BakOldUSBService";
  }

  public final void onCreate()
  {
    AppMethodBeat.i(17756);
    ab.i("MicroMsg.BakOldUSBService", "onCreate()");
    super.onCreate();
    aw.Rg().a(595, this);
    com.tencent.mm.plugin.backup.g.b.a(1, this);
    AppMethodBeat.o(17756);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(17758);
    aw.Rg().b(595, this);
    com.tencent.mm.plugin.backup.g.b.b(1, this);
    super.onDestroy();
    ab.i("MicroMsg.BakOldUSBService", "onDestroy thread:" + Thread.currentThread().getName());
    AppMethodBeat.o(17758);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17759);
    String str;
    boolean bool;
    if (paramm == null)
    {
      str = "";
      ab.i("MicroMsg.BakOldUSBService", "summerbak onSceneEnd [%d, %d, %s] [%s] backupScene[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, str, Integer.valueOf(this.jyS) });
      if (!(paramm instanceof com.tencent.mm.plugin.backup.g.b))
        break label202;
      ab.d("MicroMsg.BakOldUSBService", "summerback BackupBaseScene type[%d], backupScene[%d]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(this.jyS) });
      if ((paramm.getType() == 1) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = new Intent().setClassName(ah.getContext(), "com.tencent.mm.ui.LauncherUI");
        paramString.addFlags(335544320);
        paramString.putExtra("nofification_type", "back_to_pcmgr_notification");
        if (aUz())
          break label196;
        bool = true;
        label158: paramString.putExtra("newPCBackup", bool);
        startActivity(paramString);
      }
      stopSelf();
      AppMethodBeat.o(17759);
    }
    while (true)
    {
      return;
      str = paramm.getClass().getSimpleName();
      break;
      label196: bool = false;
      break label158;
      label202: if (!(paramm instanceof com.tencent.mm.plugin.backup.bakoldlogic.c.f))
        break label497;
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label444;
      paramString = ((com.tencent.mm.plugin.backup.bakoldlogic.c.f)paramm).aUU();
      a.aUB().jqO = paramString.ID;
      a.aUB().jqP = paramString.vIW;
      a.aUB().jqQ = paramString.vIX;
      this.jyS = paramString.Scene;
      ab.d("MicroMsg.BakOldUSBService", "summerbak getconnetinfo type: %d, scene: %d isFromWifi:%b", new Object[] { Integer.valueOf(paramString.jCt), Integer.valueOf(paramString.Scene), Boolean.valueOf(this.jwC) });
      if ((!this.jwC) && (paramString.jCt == 1))
      {
        ab.e("MicroMsg.BakOldUSBService", "broast from usb but type is wifi, url may be fake!!!!");
        stopSelf();
        AppMethodBeat.o(17759);
      }
      else if (aUz())
      {
        a.aUB().aUC().cZ(paramString.vIP, paramString.vIQ);
        com.tencent.mm.plugin.backup.g.b.a(a.aUB().aUC());
        com.tencent.mm.plugin.backup.g.b.a(a.aUB().aUE());
        com.tencent.mm.plugin.backup.g.b.rk(1);
        a.aUB().aUE().e(paramString.jCt, paramString.vIO);
        AppMethodBeat.o(17759);
      }
      else
      {
        ab.d("MicroMsg.BakOldUSBService", "summerbak onSceneEnd need todo for new scene:% ", new Object[] { Integer.valueOf(this.jyS) });
        AppMethodBeat.o(17759);
      }
    }
    label444: a.aUB().aUD().jzk = 2;
    a.aUB().aUD().aar();
    if ((paramInt1 == 4) && (paramInt2 == -2011))
      ab.i("MicroMsg.BakOldUSBService", "getConnect info: INVALID URL");
    while (true)
    {
      a.aUB().aUC();
      e.aUL();
      stopSelf();
      label497: AppMethodBeat.o(17759);
      break;
      ab.i("MicroMsg.BakOldUSBService", "getConnect info other error");
    }
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    paramInt1 = 1;
    AppMethodBeat.i(17757);
    ab.i("MicroMsg.BakOldUSBService", "onStartCommand() scene：%d", new Object[] { Integer.valueOf(this.jyS) });
    if (paramIntent == null)
    {
      ab.w("MicroMsg.BakOldUSBService", "onStartCommand intent is null");
      AppMethodBeat.o(17757);
    }
    while (true)
    {
      return 2;
      String str = paramIntent.getStringExtra("url");
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.BakOldUSBService", "onStartCommand url is null");
        stopSelf();
        AppMethodBeat.o(17757);
      }
      else
      {
        this.jwC = paramIntent.getBooleanExtra("isFromWifi", false);
        ab.i("MicroMsg.BakOldUSBService", "Broadcast url:%s, isFromWifi:%b", new Object[] { str, Boolean.valueOf(this.jwC) });
        a.aUB().aUD().aar();
        paramIntent = a.aUB().aUD();
        if (this.jwC)
          paramInt1 = 2;
        paramIntent.jzj = paramInt1;
        if (!aw.ZM())
        {
          ab.e("MicroMsg.BakOldUSBService", "onStartCommand not in Login state");
          paramIntent = new Intent().setClassName(ah.getContext(), "com.tencent.mm.ui.LauncherUI");
          paramIntent.addFlags(335544320);
          paramIntent.putExtra("nofification_type", "back_to_pcmgr_notification");
          startActivity(paramIntent);
          AppMethodBeat.o(17757);
        }
        else
        {
          paramIntent = new com.tencent.mm.plugin.backup.bakoldlogic.c.f(str);
          aw.Rg().a(paramIntent, 0);
          AppMethodBeat.o(17757);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService
 * JD-Core Version:    0.6.2
 */