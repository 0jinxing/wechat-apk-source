package com.tencent.mm.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.c;
import com.tencent.mm.api.g;
import com.tencent.mm.api.r;
import com.tencent.mm.api.s;
import com.tencent.mm.api.s.a.a;
import com.tencent.mm.api.s.b;
import com.tencent.mm.api.s.c;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.tools.j;

@com.tencent.mm.ui.base.a(19)
public class MMNewPhotoEditUI extends MMActivity
  implements g
{
  private p ejZ;
  private int emC;
  private s oDy;
  private Dialog ttv;
  private String ynr;
  private long yns;
  private String ynt;
  private String ynu;
  private boolean ynv;
  private boolean ynw;
  private final d ynx;
  private PhotoEditProxy yny;

  public MMNewPhotoEditUI()
  {
    AppMethodBeat.i(11927);
    this.ynx = new d(this);
    this.ejZ = null;
    AppMethodBeat.o(11927);
  }

  private void Nh(int paramInt)
  {
    AppMethodBeat.i(11935);
    fE(true);
    this.oDy.a(new MMNewPhotoEditUI.5(this, paramInt));
    AppMethodBeat.o(11935);
  }

  private void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(11936);
    ab.i("MicroMsg.MMNewPhotoEditUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.ejZ = p.b(this, getString(2131305944), true, null);
      AppMethodBeat.o(11936);
    }
    while (true)
    {
      return;
      if ((this.ejZ != null) && (this.ejZ.isShowing()))
      {
        this.ejZ.dismiss();
        this.ejZ = null;
      }
      AppMethodBeat.o(11936);
    }
  }

  protected final int getForceOrientation()
  {
    return 1;
  }

  protected final int getLayoutId()
  {
    return 2130970304;
  }

  protected final void initView()
  {
    AppMethodBeat.i(11929);
    FrameLayout localFrameLayout = (FrameLayout)findViewById(2131821019);
    this.oDy = s.ccQ.Ae();
    Object localObject = this.oDy;
    s.a.a locala = new s.a.a();
    if ((this.emC != 291) && (this.emC != 293));
    for (boolean bool = true; ; bool = false)
    {
      locala.ccS = bool;
      locala.ccU = true;
      locala.ccR = s.c.ccX;
      locala.path = this.ynr;
      ((s)localObject).a(locala.AB());
      localObject = this.oDy.aQ(this.mController.ylL);
      ((c)localObject).setActionBarCallback(this);
      localFrameLayout.addView((View)localObject, new FrameLayout.LayoutParams(-1, -1));
      ((c)localObject).setSelectedFeatureListener(new r()
      {
        public final void a(com.tencent.mm.api.e paramAnonymouse)
        {
          AppMethodBeat.i(11920);
          ab.i("MicroMsg.MMNewPhotoEditUI", "[onSelectedFeature] features:%s", new Object[] { paramAnonymouse.name() });
          AppMethodBeat.o(11920);
        }

        public final void a(com.tencent.mm.api.e paramAnonymouse, int paramAnonymousInt)
        {
          AppMethodBeat.i(11921);
          ab.i("MicroMsg.MMNewPhotoEditUI", "[onSelectedDetailFeature] features:%s index:%s", new Object[] { paramAnonymouse.name(), Integer.valueOf(paramAnonymousInt) });
          AppMethodBeat.o(11921);
        }

        public final void bd(boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(11922);
          if (paramAnonymousBoolean)
          {
            MMNewPhotoEditUI.this.showVKB();
            AppMethodBeat.o(11922);
          }
          while (true)
          {
            return;
            MMNewPhotoEditUI.this.hideVKB(MMNewPhotoEditUI.this.mController.contentView);
            AppMethodBeat.o(11922);
          }
        }
      });
      AppMethodBeat.o(11929);
      return;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(11934);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt2 == -1) && (paramInt1 == 1) && (paramIntent != null))
    {
      String str = paramIntent.getStringExtra("Select_Conv_User");
      ab.d("MicroMsg.MMNewPhotoEditUI", "select %s for sending imagePath:%s", new Object[] { str, this.ynu });
      this.ttv = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131305943), false, null);
      paramIntent = paramIntent.getStringExtra("custom_send_text");
      this.yny.sendImage(paramIntent, this.ynu, this.yny.getSelfUsername(), str);
      this.ttv.dismiss();
      if (!this.ynv)
      {
        com.tencent.mm.vfs.e.deleteFile(this.ynu);
        finish();
        AppMethodBeat.o(11934);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.f.a.a(this.ynu, this);
      break;
      if ((paramIntent == null) && (!bo.isNullOrNil(this.ynu)) && (this.emC == 291))
        com.tencent.mm.vfs.e.deleteFile(this.ynu);
      AppMethodBeat.o(11934);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(11931);
    if (!this.oDy.Ab())
    {
      if ((this.emC != 290) && (this.emC != 291))
        break label74;
      com.tencent.mm.plugin.report.service.h.pYm.e(13859, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(11931);
      return;
      label74: if ((this.emC == 4) || (this.emC == 293))
        com.tencent.mm.plugin.report.service.h.pYm.e(13859, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
      else
        com.tencent.mm.plugin.report.service.h.pYm.e(13859, new Object[] { Integer.valueOf(0), Integer.valueOf(2) });
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(11928);
    super.onCreate(paramBundle);
    this.mController.dyl();
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().setFlags(1024, 1024);
      getWindow().addFlags(67108864);
    }
    this.yny = new PhotoEditProxy(this.ynx);
    this.ynx.connect(new MMNewPhotoEditUI.1(this));
    AppMethodBeat.o(11928);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(11930);
    super.onDestroy();
    this.oDy.onDestroy();
    this.ynx.release();
    AppMethodBeat.o(11930);
  }

  public final void onExit()
  {
    AppMethodBeat.i(11933);
    onBackPressed();
    AppMethodBeat.o(11933);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(11932);
    if ((this.emC == 290) || (this.emC == 291))
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(13859, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
      if ((this.emC != 291) && (this.emC != 293))
        break label211;
      j localj = new j(this.mController.ylL);
      localj.rBl = new MMNewPhotoEditUI.3(this);
      localj.rBm = new MMNewPhotoEditUI.4(this);
      com.tencent.mm.ui.base.h.a(this.mController.ylL, localj.cuu());
      AppMethodBeat.o(11932);
    }
    while (true)
    {
      return;
      if ((this.emC == 4) || (this.emC == 293))
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(13859, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
        break;
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(13859, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
      break;
      label211: Nh(-1);
      AppMethodBeat.o(11932);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMNewPhotoEditUI
 * JD-Core Version:    0.6.2
 */