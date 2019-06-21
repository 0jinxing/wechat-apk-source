package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.b.d;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bf;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;

@a(3)
public class IPCallTalkUI extends MMActivity
  implements j.a
{
  private String gHT;
  private String nCh;
  private String nCi;
  private String nCj;
  private String nCk;
  private int nCl;
  private int nCm;
  private j nFX;

  private void init()
  {
    AppMethodBeat.i(22364);
    this.nFX = new j(this);
    this.nFX.nGI = this;
    this.nFX.b(this.gHT, this.nCh, this.nCi, this.nCj, this.nCk, this.nCl, this.nCm);
    AppMethodBeat.o(22364);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969890;
  }

  public final void ix(boolean paramBoolean)
  {
    AppMethodBeat.i(22366);
    if (!paramBoolean)
      AppMethodBeat.o(22366);
    while (true)
    {
      return;
      al.n(new IPCallTalkUI.1(this), 3000L);
      AppMethodBeat.o(22366);
    }
  }

  public void onBackPressed()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22363);
    super.onCreate(paramBundle);
    getSupportActionBar().hide();
    getWindow().addFlags(6946944);
    this.gHT = getIntent().getStringExtra("IPCallTalkUI_nickname");
    this.nCh = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
    this.nCi = getIntent().getStringExtra("IPCallTalkUI_contactId");
    this.nCj = getIntent().getStringExtra("IPCallTalkUI_countryCode");
    this.nCk = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
    this.nCl = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
    this.nCm = getIntent().getIntExtra("IPCallTalkUI_countryType", 0);
    ab.i("MicroMsg.IPCallTalkUI", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername:%s, mDialScene:%d ,mCountryType:%d", new Object[] { this.gHT, this.nCh, this.nCi, this.nCj, this.nCk, Integer.valueOf(this.nCl), Integer.valueOf(this.nCm) });
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.RECORD_AUDIO", 80, null, null);
    ab.i("MicroMsg.IPCallTalkUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
    if (!bool)
      AppMethodBeat.o(22363);
    while (true)
    {
      return;
      init();
      AppMethodBeat.o(22363);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22365);
    super.onDestroy();
    setScreenEnable(true);
    if (this.nFX != null)
    {
      j localj = this.nFX;
      ab.i("MicroMsg.TalkUIController", "onDestroy");
      localj.nGH.nuX = null;
      i.bHt().crP = null;
      i.bHt().nxk = null;
      i.bHt().a(null);
      Object localObject = i.bHt();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).nxh.nxu = null;
      localObject = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).nxh;
      ((d)localObject).mfW.dps();
      ((d)localObject).mfS.dpt();
      localj.nGG = null;
      localj.nGI = null;
    }
    AppMethodBeat.o(22365);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(22367);
    int i;
    if (this.nFX != null)
      if (i.bHu().bHl())
        if (paramInt == 25)
        {
          i = i.bHt().bHJ();
          if (i == -1)
            break label102;
          aw.ZL().iK(i);
          i = 1;
          if (i == 0)
            break label108;
          AppMethodBeat.o(22367);
        }
    while (true)
    {
      return bool;
      if (paramInt == 24)
      {
        i = i.bHt().bHJ();
        if (i != -1)
        {
          aw.ZL().iJ(i);
          i = 1;
          break;
        }
      }
      label102: i = 0;
      break;
      label108: bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(22367);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(22368);
    ab.d("MicroMsg.IPCallTalkUI", "onPause");
    super.onPause();
    if (this.nFX != null)
      ab.d("MicroMsg.TalkUIController", "onPause");
    AppMethodBeat.o(22368);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(22370);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.IPCallTalkUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(22370);
      return;
    }
    ab.i("MicroMsg.IPCallTalkUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 80:
    }
    while (true)
    {
      AppMethodBeat.o(22370);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        init();
        AppMethodBeat.o(22370);
        break;
      }
      h.a(this, getString(2131301928), getString(2131301936), getString(2131300878), getString(2131297773), false, new IPCallTalkUI.2(this), new IPCallTalkUI.3(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(22369);
    ab.d("MicroMsg.IPCallTalkUI", "onResume");
    super.onResume();
    if (this.nFX != null)
    {
      ab.d("MicroMsg.TalkUIController", "onResume");
      aw.getNotification().cancel(42);
    }
    AppMethodBeat.o(22369);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI
 * JD-Core Version:    0.6.2
 */