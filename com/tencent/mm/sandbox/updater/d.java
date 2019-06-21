package com.tencent.mm.sandbox.updater;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.pluginsdk.ui.tools.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.xweb.WebView;
import com.tencent.xweb.x5.sdk.f;

public final class d
  implements a
{
  Intent intent;
  private Notification oHJ;
  private d.a xwl;
  private int xwm;
  private boolean xwn;
  private boolean xwo;
  private boolean xwp;

  static
  {
    AppMethodBeat.i(28893);
    c.iw(ah.getContext());
    com.tencent.xweb.b.d.a(com.tencent.mm.plugin.cdndownloader.i.a.bfd());
    AppMethodBeat.o(28893);
  }

  private d()
  {
    AppMethodBeat.i(28884);
    this.xwl = null;
    this.intent = new Intent();
    this.oHJ = null;
    this.xwm = 999;
    this.xwn = false;
    this.xwo = false;
    this.xwp = false;
    AppMethodBeat.o(28884);
  }

  private void bGl()
  {
    AppMethodBeat.i(28885);
    if (this.xwp)
    {
      ab.i("MicroMsg.TBSDownloadMgr", "TBS already downloaded, ignore duplicated request");
      AppMethodBeat.o(28885);
    }
    while (true)
    {
      return;
      this.xwp = true;
      if (this.xwl == null)
      {
        this.xwl = new d.a(this, (byte)0);
        com.tencent.xweb.x5.sdk.d.a(this.xwl);
        m.kT(2);
      }
      dno();
      m.kT(3);
      AppMethodBeat.o(28885);
    }
  }

  public static d dnn()
  {
    return d.b.xws;
  }

  private void dno()
  {
    AppMethodBeat.i(28887);
    f.startDownload(ah.getContext());
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
    if (localSharedPreferences != null)
    {
      ab.i("MicroMsg.TBSDownloadMgr", "now start download,hasDownloadOverSea over sea = %b, is now oversea = %b", new Object[] { Boolean.valueOf(this.xwo), Boolean.valueOf(this.xwn) });
      if ((this.xwo) || (this.xwn))
        localSharedPreferences.edit().putBoolean("tbs_download_oversea", true).commit();
    }
    AppMethodBeat.o(28887);
  }

  public final boolean aJ(Intent paramIntent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(28888);
    this.intent = paramIntent;
    boolean bool2;
    if (this.intent.getIntExtra("intent_extra_download_type", 1) == 2)
    {
      bool2 = true;
      this.xwn = bool2;
      paramIntent = ah.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
      if (paramIntent != null)
        this.xwo = paramIntent.getBoolean("tbs_download_oversea", false);
      ab.i("MicroMsg.TBSDownloadMgr", "isOverSea = %b, hasDownloadOverSea = %b", new Object[] { Boolean.valueOf(this.xwn), Boolean.valueOf(this.xwo) });
      bool2 = f.isDownloading();
      com.tencent.xweb.x5.sdk.d.setUploadCode(ah.getContext(), 133);
      if (!bool2)
        break label142;
      ab.i("MicroMsg.TBSDownloadMgr", "TBS already downloading, ignore duplicated request");
      com.tencent.xweb.x5.sdk.d.setUploadCode(ah.getContext(), 134);
      AppMethodBeat.o(28888);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label142: this.xwp = false;
      paramIntent = ah.getContext();
      int i = WebView.getInstalledTbsCoreVersion(paramIntent);
      boolean bool3 = f.a(paramIntent, this.xwn | this.xwo, false, new d.1(this));
      boolean bool4 = at.isWifi(paramIntent);
      bool2 = this.intent.getBooleanExtra("intent_extra_download_ignore_network_type", false);
      ab.i("MicroMsg.TBSDownloadMgr", "TBS download, tbsCoreVersion = %d, needDownload = %b, isWifi = %b, ignoreNetworkType = %b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool2) });
      if (((bool4) || (bool2)) && (bool3))
      {
        bGl();
        AppMethodBeat.o(28888);
        bool2 = bool1;
      }
      else if ((bool4) || (bool2))
      {
        AppMethodBeat.o(28888);
        bool2 = bool1;
      }
      else
      {
        AppMethodBeat.o(28888);
        bool2 = false;
      }
    }
  }

  public final boolean isBusy()
  {
    boolean bool1 = false;
    AppMethodBeat.i(28889);
    boolean bool2 = f.isDownloading();
    boolean bool3 = com.tencent.xweb.x5.sdk.d.getTBSInstalling();
    ab.i("MicroMsg.TBSDownloadMgr", "isBusy isDownloading = %b, isInstalling = %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
    if ((bool2) || (bool3))
    {
      AppMethodBeat.o(28889);
      bool1 = true;
    }
    while (true)
    {
      return bool1;
      AppMethodBeat.o(28889);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(28890);
    ab.i("MicroMsg.TBSDownloadMgr", "onDestroy");
    AppMethodBeat.o(28890);
  }

  public final void pc(boolean paramBoolean)
  {
    AppMethodBeat.i(28886);
    if (this.xwl == null)
    {
      ab.w("MicroMsg.TBSDownloadMgr", "TBS download not inited, ignore");
      AppMethodBeat.o(28886);
    }
    while (true)
    {
      return;
      Context localContext = ah.getContext();
      boolean bool1 = f.isDownloading();
      boolean bool2 = f.needDownload(localContext, this.xwn | this.xwo);
      boolean bool3 = this.intent.getBooleanExtra("intent_extra_download_ignore_network_type", false);
      boolean bool4 = f.isDownloadForeground();
      ab.i("MicroMsg.TBSDownloadMgr", "setNetStatChanged, isWifi = %b, downloading = %b, needDownload = %b, ignoreNetworkType = %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      if (((paramBoolean) || (bool3)) && (!bool1) && (bool2))
      {
        dno();
        m.kT(3);
        AppMethodBeat.o(28886);
      }
      else
      {
        if ((!paramBoolean) && (!bool3) && (bool1) && (!bool4))
        {
          f.stopDownload();
          m.kT(4);
        }
        AppMethodBeat.o(28886);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.d
 * JD-Core Version:    0.6.2
 */