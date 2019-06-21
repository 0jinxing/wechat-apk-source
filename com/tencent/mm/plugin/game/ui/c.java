package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.g.c.s;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.game.model.j;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class c
  implements View.OnClickListener
{
  protected long hxO = -1L;
  protected Context mContext;
  protected int mStatus = -1;
  protected com.tencent.mm.plugin.game.model.c mVZ = null;
  protected int mXC;
  protected String neg;
  protected FileDownloadTaskInfo neh;
  protected com.tencent.mm.plugin.downloader.f.a nei;
  protected String nej;
  protected String nek;
  protected String nel;
  private String nem = "xiaomi";

  public c(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private void hQ(boolean paramBoolean)
  {
    e.a locala;
    if (paramBoolean)
    {
      j.a(this.mVZ.dna, this.mVZ.dnf, this.mVZ.cKG, this.mVZ.field_appId, this.nej, "app_update");
      locala = new e.a();
      locala.It(this.mVZ.dna);
      locala.Iu(this.mVZ.mVD);
      locala.hA(this.mVZ.mVE);
      locala.Iv(com.tencent.mm.pluginsdk.model.app.g.b(this.mContext, this.mVZ, null));
      locala.setAppId(this.mVZ.field_appId);
      locala.Iw(this.mVZ.dnf);
      locala.ga(true);
      locala.tN(1);
      locala.cY(this.mVZ.field_packageName);
      locala.setScene(this.mVZ.cKG);
      if (this.mVZ.cBA != 1)
        break label309;
    }
    label309: for (long l = com.tencent.mm.plugin.downloader.model.d.bij().b(locala.kNl); ; l = com.tencent.mm.plugin.downloader.model.d.bij().a(locala.kNl))
    {
      ab.i("MicroMsg.CommonGameClickLinstener", " add download task result:[%d], appid[%s]，downloaerType[%d]", new Object[] { Long.valueOf(l), this.mVZ.field_appId, Integer.valueOf(this.mVZ.cBA) });
      com.tencent.mm.plugin.game.model.e.ar(this.mContext, this.mVZ.field_appId);
      com.tencent.mm.game.report.api.b.eBF.a(this.mVZ.field_appId, this.mVZ.cKG, 9, l, "", null);
      com.tencent.mm.modelstat.d.b(10, "CommonGameClickListener_addDownloadTask", hashCode());
      return;
      j.a(this.mVZ.dna, this.mVZ.dnf, this.mVZ.cKG, this.mVZ.field_appId, this.nej, this.nel);
      break;
    }
  }

  protected final void bFb()
  {
    com.tencent.mm.plugin.game.model.e.ak(this.mContext, this.mVZ.field_appId);
  }

  protected final void bFc()
  {
    this.nei = com.tencent.mm.plugin.downloader.model.c.In(this.mVZ.field_appId);
    this.neh = com.tencent.mm.plugin.downloader.model.d.bij().Ir(this.mVZ.field_appId);
    this.hxO = this.neh.id;
    this.mStatus = this.neh.status;
    this.neg = this.neh.path;
  }

  protected final void hP(final boolean paramBoolean)
  {
    if (!at.isNetworkConnected(this.mContext))
    {
      Toast.makeText(this.mContext, this.mContext.getString(2131300251), 0).show();
      j.bEg();
      j.a(this.mVZ.field_appId, com.tencent.mm.plugin.downloader.a.a.kJX, false, null);
    }
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.RQ();
      if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
      {
        Toast.makeText(this.mContext, this.mContext.getString(2131300255), 0).show();
        j.bEg();
        j.a(this.mVZ.field_appId, com.tencent.mm.plugin.downloader.a.a.kJY, false, null);
      }
      else if (!f.eW(this.mVZ.mVE))
      {
        Toast.makeText(this.mContext, this.mContext.getString(2131300252), 0).show();
        j.bEg();
        j.a(this.mVZ.field_appId, com.tencent.mm.plugin.downloader.a.a.kJY, false, null);
      }
      else
      {
        if (com.tencent.mm.protocal.d.vxi.toLowerCase().contains(this.nem));
        try
        {
          if ((Settings.Secure.getInt(this.mContext.getContentResolver(), "install_non_market_apps") == 0) && (!com.tencent.mm.plugin.game.model.e.dZ(this.mContext)))
          {
            Context localContext = this.mContext;
            c.3 local3 = new com/tencent/mm/plugin/game/ui/c$3;
            local3.<init>(this);
            c.4 local4 = new com/tencent/mm/plugin/game/ui/c$4;
            local4.<init>(this);
            com.tencent.mm.ui.base.h.a(localContext, 2131300352, 2131300353, 2131300269, 2131296868, false, local3, local4);
            com.tencent.mm.plugin.game.model.e.ea(this.mContext);
          }
          if ((bo.isNullOrNil(this.mVZ.dna)) || (bo.isNullOrNil(this.mVZ.dnf)))
          {
            ab.d("MicroMsg.CommonGameClickLinstener", "downloadApk: appdownloadurl is null or appmd5 is null, try gpDownload");
            if (bo.isNullOrNil(this.mVZ.dng))
            {
              ab.e("MicroMsg.CommonGameClickLinstener", "downloadApk fail, gpDownloadUrl is null");
              if (bo.isNullOrNil(this.mVZ.dna))
              {
                j.bEg();
                j.a(this.mVZ.field_appId, com.tencent.mm.plugin.downloader.a.a.DOWNLOAD_ERR_URL_INVALID, false, null);
              }
              if (!bo.isNullOrNil(this.mVZ.dnf))
                continue;
              j.bEg();
              j.a(this.mVZ.field_appId, com.tencent.mm.plugin.downloader.a.a.kJV, false, null);
            }
          }
        }
        catch (Settings.SettingNotFoundException localSettingNotFoundException)
        {
          while (true)
          {
            ab.e("MicroMsg.CommonGameClickLinstener", "SettingNotFoundException ; %S", new Object[] { localSettingNotFoundException.getMessage() });
            continue;
            ab.d("MicroMsg.CommonGameClickLinstener", "downloadApk with gp, ret = %b", new Object[] { Boolean.valueOf(q.by(this.mContext, this.mVZ.dng)) });
          }
          com.tencent.mm.plugin.game.e.b.a(this.mContext, this.mVZ.scene, this.mVZ.cKG, this.mVZ.position, 4, this.mVZ.field_appId, this.mXC, this.mVZ.ctu, this.nek);
          if (at.isWifi(this.mContext))
          {
            hQ(paramBoolean);
          }
          else
          {
            com.tencent.mm.plugin.report.service.h.pYm.e(14217, new Object[] { this.mVZ.field_appId, Integer.valueOf(4), "", this.mVZ.dna, Integer.valueOf(2) });
            com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(2131305542), this.mContext.getString(2131305543), this.mContext.getString(2131305537), this.mContext.getString(2131296868), false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                AppMethodBeat.i(111698);
                com.tencent.mm.plugin.report.service.h.pYm.e(14217, new Object[] { c.this.mVZ.field_appId, Integer.valueOf(5), "", c.this.mVZ.dna, Integer.valueOf(2) });
                c.a(c.this, paramBoolean);
                paramAnonymousDialogInterface.dismiss();
                AppMethodBeat.o(111698);
              }
            }
            , new c.2(this), 2131690683);
          }
        }
      }
    }
  }

  public final void setSourceScene(int paramInt)
  {
    this.mXC = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.c
 * JD-Core Version:    0.6.2
 */