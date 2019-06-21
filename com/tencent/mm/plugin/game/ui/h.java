package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.s;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.game.d.bx;
import com.tencent.mm.plugin.game.model.j;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public final class h extends c
{
  public h(Context paramContext)
  {
    super(paramContext);
  }

  private void bFj()
  {
    AppMethodBeat.i(111802);
    if (!at.isNetworkConnected(this.mContext))
    {
      Toast.makeText(this.mContext, this.mContext.getString(2131300251), 0).show();
      AppMethodBeat.o(111802);
    }
    while (true)
    {
      return;
      if (at.isWifi(this.mContext))
      {
        bFk();
        AppMethodBeat.o(111802);
      }
      else
      {
        com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(2131305542), this.mContext.getString(2131305543), this.mContext.getString(2131305537), this.mContext.getString(2131296868), false, new h.1(this), new h.2(this), 2131690683);
        AppMethodBeat.o(111802);
      }
    }
  }

  private void bFk()
  {
    AppMethodBeat.i(111803);
    com.tencent.mm.game.report.api.b.eBF.a(this.mVZ.field_appId, this.mVZ.cKG, 10, this.nei.field_downloadId, "", null);
    com.tencent.mm.modelstat.d.b(10, "GameClickListener_resumeDownloadTask", hashCode());
    if (com.tencent.mm.plugin.downloader.model.d.bij().ho(this.nei.field_downloadId))
    {
      com.tencent.mm.plugin.game.model.e.ar(this.mContext, this.mVZ.field_appId);
      com.tencent.mm.plugin.game.e.b.a(this.mContext, this.mVZ.scene, this.mVZ.cKG, this.mVZ.position, 4, this.mVZ.field_appId, this.mXC, this.mVZ.ctu, this.nek);
      AppMethodBeat.o(111803);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.GameClickListener", "resumeDownloadTask false");
      com.tencent.mm.plugin.downloader.model.d.bij().hl(this.nei.field_downloadId);
      hP(false);
      AppMethodBeat.o(111803);
    }
  }

  private static boolean hn(long paramLong)
  {
    AppMethodBeat.i(111804);
    a locala = com.tencent.mm.plugin.downloader.model.c.hv(paramLong);
    if ((locala != null) && (locala.field_downloadInWifi))
    {
      locala.field_downloadInWifi = false;
      com.tencent.mm.plugin.downloader.model.c.e(locala);
    }
    boolean bool = com.tencent.mm.plugin.downloader.model.d.bij().hn(paramLong);
    AppMethodBeat.o(111804);
    return bool;
  }

  public final void eB(String paramString1, String paramString2)
  {
    this.nek = paramString1;
    this.nel = paramString2;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111801);
    int i;
    int j;
    if ((paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
    {
      this.mVZ = ((com.tencent.mm.plugin.game.model.c)paramView.getTag());
      ab.i("MicroMsg.GameClickListener", "Clicked appid = " + this.mVZ.field_appId);
      bFc();
      if (!g.u(this.mContext, this.mVZ.field_appId))
        break label517;
      if (!(this.mVZ instanceof com.tencent.mm.plugin.game.model.c))
        break label853;
      i = com.tencent.mm.plugin.game.f.c.Or(this.mVZ.field_packageName);
      j = this.mVZ.versionCode;
    }
    while (true)
    {
      if (j > i)
      {
        ab.i("MicroMsg.GameClickListener", "AppId: %s installed, local: %d, server: %d", new Object[] { this.mVZ.field_appId, Integer.valueOf(i), Integer.valueOf(j) });
        j.a(this.mVZ.dna, this.mVZ.dnf, this.mVZ.cKG, this.mVZ.field_appId, this.nej, "app_update");
        if (this.neh.status == 1)
        {
          ab.i("MicroMsg.GameClickListener", "pauseDownloadTask ret = ".concat(String.valueOf(hn(this.neh.id))));
          AppMethodBeat.o(111801);
        }
      }
      while (true)
      {
        return;
        ab.e("MicroMsg.GameClickListener", "No AppInfo");
        AppMethodBeat.o(111801);
        continue;
        if (this.neh.status == 2)
        {
          bFj();
          AppMethodBeat.o(111801);
        }
        else if (this.neh.status == 3)
        {
          if ((com.tencent.mm.a.e.ct(this.neh.path)) && (com.tencent.mm.plugin.game.f.c.Os(this.neh.path) > i))
          {
            paramView = Uri.fromFile(new File(this.neh.path));
            q.a(this.mContext, paramView, null);
            com.tencent.mm.plugin.game.e.b.a(this.mContext, this.mVZ.scene, this.mVZ.cKG, this.mVZ.position, 8, this.mVZ.field_appId, this.mXC, this.mVZ.ctu, this.nek);
            AppMethodBeat.o(111801);
          }
          else
          {
            hP(true);
            AppMethodBeat.o(111801);
          }
        }
        else
        {
          hP(true);
          AppMethodBeat.o(111801);
          continue;
          ab.i("MicroMsg.GameClickListener", "launchFromWX, appId = %s, pkg = %s, openId = %s", new Object[] { this.mVZ.field_appId, this.mVZ.field_packageName, this.mVZ.field_openId });
          com.tencent.mm.plugin.game.e.b.a(this.mContext, this.mVZ.scene, this.mVZ.cKG, this.mVZ.position, 3, this.mVZ.field_appId, this.mXC, this.mVZ.ctu, this.nek);
          bFb();
          AppMethodBeat.o(111801);
          continue;
          label517: if (this.mVZ.bDP())
          {
            com.tencent.mm.plugin.game.f.c.t(this.mContext, this.mVZ.mVF.ncG, "game_center_hv_game");
            com.tencent.mm.plugin.game.e.b.a(this.mContext, this.mVZ.scene, this.mVZ.cKG, this.mVZ.position, 29, this.mVZ.field_appId, this.mXC, this.mVZ.ctu, this.nek);
            AppMethodBeat.o(111801);
          }
          else
          {
            j.a(this.mVZ.dna, this.mVZ.dnf, this.mVZ.cKG, this.mVZ.field_appId, this.nej, this.nel);
            switch (this.mStatus)
            {
            default:
              hP(false);
              AppMethodBeat.o(111801);
              break;
            case 1:
              ab.i("MicroMsg.GameClickListener", "pauseDownloadTask ret = ".concat(String.valueOf(hn(this.neh.id))));
              AppMethodBeat.o(111801);
              break;
            case 2:
              bFj();
              AppMethodBeat.o(111801);
              break;
            case 3:
              if ((!bo.isNullOrNil(this.neg)) && (com.tencent.mm.a.e.ct(this.neg)) && (com.tencent.mm.plugin.game.f.c.eC(this.neg, this.nei.field_md5)))
              {
                com.tencent.mm.plugin.game.f.c.iQ(this.nei.field_downloadId);
                com.tencent.mm.plugin.game.e.b.a(this.mContext, this.mVZ.scene, this.mVZ.cKG, this.mVZ.position, 8, this.mVZ.field_appId, this.mXC, this.mVZ.ctu, this.nek);
                AppMethodBeat.o(111801);
              }
              else
              {
                hP(false);
                AppMethodBeat.o(111801);
              }
              break;
            }
          }
        }
      }
      label853: j = 0;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.h
 * JD-Core Version:    0.6.2
 */