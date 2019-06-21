package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.pluginsdk.f.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

final class t$2
  implements View.OnClickListener
{
  t$2(t paramt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(30736);
    switch (t.8.yKh[this.yKf.yJX.ordinal()])
    {
    default:
    case 3:
    case 2:
    case 1:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(30736);
      while (true)
      {
        return;
        com.tencent.mm.plugin.report.service.h.pYm.e(11288, new Object[] { Integer.valueOf(6) });
        paramView = this.yKf;
        if (!at.isConnected(paramView.mContext))
        {
          com.tencent.mm.ui.base.h.a(paramView.mContext, com.tencent.mm.bz.a.an(paramView.mContext, 2131298053), "", com.tencent.mm.bz.a.an(paramView.mContext, 2131298048), null);
          AppMethodBeat.o(30736);
        }
        else if (!at.isWifi(paramView.mContext))
        {
          com.tencent.mm.ui.base.h.a(paramView.mContext, 2131298050, 0, 2131298046, 2131298045, new t.3(paramView), null);
          AppMethodBeat.o(30736);
        }
        else
        {
          com.tencent.mm.ui.base.h.a(paramView.mContext, 2131298051, 0, 2131298046, 2131298045, new t.4(paramView), null);
          AppMethodBeat.o(30736);
          continue;
          paramView = this.yKf;
          ab.i("MicroMsg.ChattingQQMailFooterHandler", "dz[cancelDownload]");
          d.bij().hl(paramView.lwo);
          paramView.dCs();
          AppMethodBeat.o(30736);
          continue;
          com.tencent.mm.plugin.report.service.h.pYm.e(11288, new Object[] { Integer.valueOf(7) });
          paramView = this.yKf;
          ab.i("MicroMsg.ChattingQQMailFooterHandler", "dz[installQQMail]");
          i.aC(paramView.mContext, paramView.yKa);
          AppMethodBeat.o(30736);
        }
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(11288, new Object[] { Integer.valueOf(5) });
      t localt = this.yKf;
      ab.i("MicroMsg.ChattingQQMailFooterHandler", "dz[openQQMail]");
      ab.i("MicroMsg.ChattingQQMailFooterHandler", "mQQMailScheme = %s", new Object[] { localt.yKb });
      if (bo.isNullOrNil(localt.yKb))
        paramView = localt.mContext.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
      while (true)
      {
        ab.i("MicroMsg.ChattingQQMailFooterHandler", "intent = %s", new Object[] { paramView });
        com.tencent.mm.ce.a.post(new t.5(localt, paramView));
        AppMethodBeat.o(30736);
        break;
        Intent localIntent = new Intent();
        localIntent.setData(Uri.parse(localt.yKb));
        localIntent.addFlags(268435456);
        if (Build.VERSION.SDK_INT >= 11)
          localIntent.addFlags(32768);
        paramView = localIntent;
        if (!bo.k(localt.mContext, localIntent))
          paramView = localt.mContext.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
      }
      if (this.yKf.yJZ)
        t.a(this.yKf);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.t.2
 * JD-Core Version:    0.6.2
 */