package com.tencent.mm.plugin.voiceprint.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.voiceprint.model.e;
import com.tencent.mm.plugin.voiceprint.model.n;
import com.tencent.mm.plugin.voiceprint.model.n.a;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class VoiceLoginUI extends BaseVoicePrintUI
  implements n.a
{
  private String igi = null;
  private n sMn = null;

  private void goBack()
  {
    AppMethodBeat.i(26196);
    setResult(0);
    finish();
    AppMethodBeat.o(26196);
  }

  public final void abU(String paramString)
  {
    AppMethodBeat.i(26198);
    ab.d("MicroMsg.VoiceLoginUI", "onGetText");
    this.sLs = paramString;
    this.sLM.cIe();
    this.sLM.setTipText(paramString);
    this.sLM.bQt();
    this.sLJ.setEnabled(true);
    AppMethodBeat.o(26198);
  }

  protected final void bKm()
  {
    AppMethodBeat.i(26195);
    findViewById(2131823774).setVisibility(8);
    this.sLM.bQs();
    this.sLM.setTitleText(2131304296);
    this.sLM.cIf();
    this.sLJ.setEnabled(false);
    AppMethodBeat.o(26195);
  }

  public final void cHM()
  {
    AppMethodBeat.i(26200);
    FV(2131304302);
    AppMethodBeat.o(26200);
  }

  public final void cHO()
  {
    AppMethodBeat.i(26201);
    this.sLJ.setEnabled(false);
    this.sLJ.setVisibility(4);
    this.sLM.bQt();
    this.sLM.setErr(2131304301);
    this.sLM.cIg();
    AppMethodBeat.o(26201);
  }

  protected final void cHU()
  {
    AppMethodBeat.i(26194);
    ab.d("MicroMsg.VoiceLoginUI", "sendVoice, filename:%s", new Object[] { this.sLO });
    if ((!bo.isNullOrNil(this.sLO)) && (!bo.isNullOrNil(this.sLs)))
    {
      Object localObject = this.sMn;
      localObject = new com.tencent.mm.plugin.voiceprint.model.h(this.sLO, ((n)localObject).sLt, ((n)localObject).hjp);
      ((com.tencent.mm.plugin.voiceprint.model.h)localObject).sLb = true;
      aw.Rg().a((m)localObject, 0);
      this.sLJ.setEnabled(false);
      this.sLM.bQs();
    }
    AppMethodBeat.o(26194);
  }

  public final void mh(boolean paramBoolean)
  {
    AppMethodBeat.i(26199);
    this.sLM.bQt();
    this.sLJ.setEnabled(true);
    if (paramBoolean)
    {
      ab.i("MicroMsg.VoiceLoginUI", "login success[%s]", new Object[] { bo.anv(this.sMn.gCk) });
      Intent localIntent = new Intent();
      localIntent.putExtra("VoiceLoginAuthPwd", this.sMn.gCk);
      setResult(-1, localIntent);
      finish();
      AppMethodBeat.o(26199);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.VoiceLoginUI", "login failed");
      this.sLM.setErr(2131304295);
      this.sLM.cIg();
      AppMethodBeat.o(26199);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26193);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.h.pYm.e(11557, new Object[] { Integer.valueOf(1) });
    this.igi = bo.bc(getIntent().getStringExtra("Kusername"), null);
    paramBundle = bo.bc(getIntent().getStringExtra("Kvertify_key"), null);
    ab.d("MicroMsg.VoiceLoginUI", "summerauth onCreate, username:%s loginTicket==null:%b", new Object[] { this.igi, Boolean.valueOf(bo.isNullOrNil(paramBundle)) });
    if ((bo.isNullOrNil(this.igi)) && (bo.isNullOrNil(paramBundle)))
    {
      ab.e("MicroMsg.VoiceLoginUI", "onCreate error, username and ticket are both null");
      AppMethodBeat.o(26193);
      return;
    }
    this.sMn = new n();
    this.sMn.igi = this.igi;
    this.sMn.hjp = paramBundle;
    this.sMn.sLv = this;
    paramBundle = this.sMn;
    if (bo.isNullOrNil(paramBundle.hjp))
    {
      paramBundle = new e(paramBundle.igi);
      aw.Rg().a(paramBundle, 0);
    }
    while (true)
    {
      ab.i("MicroMsg.VoiceLoginUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(b.a(this, "android.permission.RECORD_AUDIO", 80, "", "")), bo.dpG(), this });
      setBackBtn(new VoiceLoginUI.1(this));
      if (d.iW(23))
      {
        getWindow().setStatusBarColor(getResources().getColor(2131690304));
        dxW();
      }
      AppMethodBeat.o(26193);
      break;
      paramBundle.cHN();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(26202);
    super.onDestroy();
    if (this.sMn != null)
    {
      n localn = this.sMn;
      aw.Rg().b(618, localn);
      aw.Rg().b(616, localn);
      aw.Rg().b(617, localn);
      localn.sLv = null;
    }
    AppMethodBeat.o(26202);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(26197);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(26197);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(26197);
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(26203);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.VoiceLoginUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(26203);
      return;
    }
    ab.i("MicroMsg.VoiceLoginUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 80:
    }
    while (true)
    {
      AppMethodBeat.o(26203);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        cHR();
        AppMethodBeat.o(26203);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301928), getString(2131301936), getString(2131300878), getString(2131297773), false, new VoiceLoginUI.2(this), new VoiceLoginUI.3(this));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI
 * JD-Core Version:    0.6.2
 */