package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.c.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class AppUpdaterUI$10
  implements DialogInterface.OnClickListener
{
  AppUpdaterUI$10(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(28825);
    ab.d("MicroMsg.AppUpdaterUI", "getBtn (ok button) is click");
    if (AppUpdaterUI.e(this.xvL).rlf == 1)
      i.aq(this.xvL, 6);
    if (!com.tencent.mm.compatible.util.h.getExternalStorageState().equals("mounted"))
    {
      ab.e("MicroMsg.AppUpdaterUI", "no sdcard.");
      AppUpdaterUI.b(this.xvL).dismiss();
      AppUpdaterUI.c(this.xvL);
      AppMethodBeat.o(28825);
    }
    while (true)
    {
      return;
      if ((AppUpdaterUI.e(this.xvL).cdh & 0x1) != 0)
      {
        ab.e("MicroMsg.AppUpdaterUI", "package has set external update mode");
        paramDialogInterface = Uri.parse(AppUpdaterUI.e(this.xvL).cdj);
        localObject = new Intent("android.intent.action.VIEW", paramDialogInterface).addFlags(268435456);
        if ((paramDialogInterface == null) || (localObject == null) || (!bo.k(this.xvL, (Intent)localObject)))
        {
          ab.e("MicroMsg.AppUpdaterUI", "parse market uri failed, jump to weixin.qq.com");
          paramDialogInterface = new Intent("android.intent.action.VIEW", Uri.parse("http://weixin.qq.com")).addFlags(268435456);
          this.xvL.startActivity(paramDialogInterface);
        }
        while (true)
        {
          AppUpdaterUI.f(this.xvL);
          AppMethodBeat.o(28825);
          break;
          ab.i("MicroMsg.AppUpdaterUI", "parse market uri ok");
          this.xvL.startActivity((Intent)localObject);
        }
      }
      Object localObject = com.tencent.mm.sandbox.monitor.c.bY(AppUpdaterUI.e(this.xvL).cvZ, AppUpdaterUI.e(this.xvL).xwY);
      paramDialogInterface = (DialogInterface)localObject;
      if (bo.isNullOrNil((String)localObject))
      {
        paramDialogInterface = (DialogInterface)localObject;
        if (AppUpdaterUI.e(this.xvL).xwT != null)
          paramDialogInterface = com.tencent.mm.sandbox.monitor.c.ama(AppUpdaterUI.e(this.xvL).xwT.cdx);
      }
      ab.d("MicroMsg.AppUpdaterUI", paramDialogInterface);
      if (paramDialogInterface != null)
      {
        ab.i("MicroMsg.AppUpdaterUI", "update package already exist.");
        AppUpdaterUI.a(this.xvL, 8);
        if (AppUpdaterUI.e(this.xvL).xwU)
          AppUpdaterUI.a(this.xvL, 0);
        while (true)
        {
          AppUpdaterUI.e(this.xvL).aB(1, true);
          AppUpdaterUI.h(this.xvL).YJ(paramDialogInterface);
          AppMethodBeat.o(28825);
          break;
          AppUpdaterUI.a(this.xvL, 9);
        }
      }
      ab.d("MicroMsg.AppUpdaterUI", "current downloadMode : %s", new Object[] { Integer.valueOf(AppUpdaterUI.e(this.xvL).rlf) });
      ab.d("MicroMsg.AppUpdaterUI", "current updateType : %s", new Object[] { Integer.valueOf(AppUpdaterUI.e(this.xvL).xvw) });
      if (AppUpdaterUI.e(this.xvL).rlf == 0)
      {
        AppUpdaterUI.e(this.xvL).dnC();
        AppMethodBeat.o(28825);
      }
      else if (AppUpdaterUI.e(this.xvL).rlf == 1)
      {
        ab.d("MicroMsg.AppUpdaterUI", "gonna start UpdaterService");
        AppUpdaterUI.f(this.xvL);
        paramDialogInterface = new Intent(this.xvL.getIntent());
        paramDialogInterface.setClass(this.xvL, UpdaterService.class);
        paramDialogInterface.putExtra("intent_extra_run_in_foreground", true);
        d.j(paramDialogInterface, "sandbox");
        if (AppUpdaterUI.e(this.xvL).xwY)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 56L, 1L, false);
          ab.d("MicroMsg.AppUpdaterUI", "boots download start.");
        }
        AppMethodBeat.o(28825);
      }
      else
      {
        ab.e("MicroMsg.AppUpdaterUI", "silence download never go here!");
        AppMethodBeat.o(28825);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI.10
 * JD-Core Version:    0.6.2
 */