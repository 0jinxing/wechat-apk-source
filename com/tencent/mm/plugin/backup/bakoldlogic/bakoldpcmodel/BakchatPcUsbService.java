package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.content.Intent;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.ahq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.service.MMService;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class BakchatPcUsbService extends MMService
  implements com.tencent.mm.ai.f
{
  private boolean jwC = false;

  public final IBinder Iu()
  {
    return null;
  }

  public final String getTag()
  {
    return "MicroMsg.BakchatPcUsbService";
  }

  public final void onCreate()
  {
    AppMethodBeat.i(17857);
    ab.i("MicroMsg.BakchatPcUsbService", "onCreate()");
    super.onCreate();
    aw.Rg().a(595, this);
    com.tencent.mm.plugin.backup.g.b.a(1, this);
    AppMethodBeat.o(17857);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(17859);
    aw.Rg().b(595, this);
    com.tencent.mm.plugin.backup.g.b.b(1, this);
    super.onDestroy();
    ab.i("MicroMsg.BakchatPcUsbService", "onDestroy" + Thread.currentThread().getName());
    AppMethodBeat.o(17859);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17860);
    if ((paramm instanceof com.tencent.mm.plugin.backup.g.b))
    {
      if ((paramm.getType() == 1) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = new Intent().setClassName(ah.getContext(), "com.tencent.mm.ui.LauncherUI");
        paramString.addFlags(335544320);
        paramString.putExtra("nofification_type", "back_to_pcmgr_notification");
        startActivity(paramString);
      }
      stopSelf();
      AppMethodBeat.o(17860);
    }
    while (true)
    {
      return;
      if (!(paramm instanceof com.tencent.mm.plugin.backup.bakoldlogic.c.f))
        break label316;
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break;
      paramString = ((com.tencent.mm.plugin.backup.bakoldlogic.c.f)paramm).aUU();
      if (this.jwC)
      {
        ab.i("MicroMsg.BakchatPcUsbService", "from wifi, reconnect");
        a.aUB().aUE().aUF();
      }
      if ((!this.jwC) && (paramString.jCt == 1))
      {
        ab.e("MicroMsg.BakchatPcUsbService", "broast from usb but type is wifi, url may be fake!!!!");
        stopSelf();
        AppMethodBeat.o(17860);
      }
      else
      {
        a.aUB().jqO = paramString.ID;
        a.aUB().jqP = paramString.vIW;
        a.aUB().jqQ = paramString.vIX;
        a.aUB().aUC().cZ(paramString.vIP, paramString.vIQ);
        com.tencent.mm.plugin.backup.g.b.a(a.aUB().aUC());
        com.tencent.mm.plugin.backup.g.b.a(a.aUB().aUE());
        com.tencent.mm.plugin.backup.g.b.rk(1);
        a.aUB().aUE().e(paramString.jCt, paramString.vIO);
        AppMethodBeat.o(17860);
      }
    }
    a.aUB().aUD().jzk = 2;
    a.aUB().aUD().aar();
    if ((paramInt1 == 4) && (paramInt2 == -2011))
    {
      ab.i("MicroMsg.BakchatPcUsbService", "getConnect info: INVALID URL");
      if (!this.jwC);
    }
    while (true)
    {
      a.aUB().aUC();
      e.aUL();
      stopSelf();
      label316: AppMethodBeat.o(17860);
      break;
      ab.i("MicroMsg.BakchatPcUsbService", "getConnect info other error");
    }
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    paramInt1 = 1;
    AppMethodBeat.i(17858);
    ab.i("MicroMsg.BakchatPcUsbService", "onStartCommand()");
    if (paramIntent == null)
    {
      ab.w("MicroMsg.BakchatPcUsbService", "onStartCommand intent is null");
      AppMethodBeat.o(17858);
    }
    while (true)
    {
      return 2;
      String str = paramIntent.getStringExtra("url");
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.BakchatPcUsbService", "onStartCommand url is null");
        stopSelf();
        AppMethodBeat.o(17858);
      }
      else
      {
        this.jwC = paramIntent.getBooleanExtra("isFromWifi", false);
        ab.i("MicroMsg.BakchatPcUsbService", "Broadcast url:%s, isFromWifi:%b", new Object[] { str, Boolean.valueOf(this.jwC) });
        a.aUB().aUD().aar();
        paramIntent = a.aUB().aUD();
        if (this.jwC)
          paramInt1 = 2;
        paramIntent.jzj = paramInt1;
        if (!aw.ZM())
        {
          ab.e("MicroMsg.BakchatPcUsbService", "onStartCommand not in Login state");
          paramIntent = new Intent().setClassName(ah.getContext(), "com.tencent.mm.ui.LauncherUI");
          paramIntent.addFlags(335544320);
          paramIntent.putExtra("nofification_type", "back_to_pcmgr_notification");
          startActivity(paramIntent);
          AppMethodBeat.o(17858);
        }
        else
        {
          paramIntent = new com.tencent.mm.plugin.backup.bakoldlogic.c.f(str);
          aw.Rg().a(paramIntent, 0);
          AppMethodBeat.o(17858);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.BakchatPcUsbService
 * JD-Core Version:    0.6.2
 */