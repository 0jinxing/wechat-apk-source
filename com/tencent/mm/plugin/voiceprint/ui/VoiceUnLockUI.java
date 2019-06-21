package com.tencent.mm.plugin.voiceprint.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.voiceprint.model.d;
import com.tencent.mm.plugin.voiceprint.model.j;
import com.tencent.mm.plugin.voiceprint.model.q;
import com.tencent.mm.plugin.voiceprint.model.q.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class VoiceUnLockUI extends BaseVoicePrintUI
  implements q.a
{
  private q sMT;

  public final void abU(String paramString)
  {
    AppMethodBeat.i(26244);
    this.sLs = paramString;
    this.sLM.cIe();
    this.sLM.setTipText(paramString);
    this.sLM.bQt();
    this.sLJ.setEnabled(true);
    AppMethodBeat.o(26244);
  }

  protected final void bKm()
  {
    AppMethodBeat.i(26243);
    findViewById(2131823774).setVisibility(8);
    this.sLM.bQs();
    this.sLM.setTitleText(2131304296);
    this.sLM.cIf();
    this.sLJ.setEnabled(false);
    AppMethodBeat.o(26243);
  }

  public final void cHM()
  {
    AppMethodBeat.i(26247);
    cHT();
    AppMethodBeat.o(26247);
  }

  protected final void cHU()
  {
    AppMethodBeat.i(26242);
    ab.d("MicroMsg.VoiceUnLockUI", "sendVoice, filename:%s", new Object[] { this.sLO });
    if ((!bo.isNullOrNil(this.sLO)) && (!bo.isNullOrNil(this.sMT.sLs)))
    {
      Object localObject = this.sMT;
      localObject = new j(this.sLO, ((q)localObject).sLt);
      ((j)localObject).sLb = true;
      aw.Rg().a((m)localObject, 0);
      this.sLJ.setEnabled(false);
      this.sLM.bQs();
    }
    AppMethodBeat.o(26242);
  }

  protected void cId()
  {
    AppMethodBeat.i(26246);
    Intent localIntent = new Intent();
    localIntent.putExtra("kscene_type", 73);
    localIntent.setClass(this, VoicePrintFinishUI.class);
    startActivity(localIntent);
    finish();
    AppMethodBeat.o(26246);
  }

  public final void mi(boolean paramBoolean)
  {
    AppMethodBeat.i(26245);
    this.sLM.bQt();
    this.sLJ.setEnabled(true);
    if (paramBoolean)
    {
      ab.d("MicroMsg.VoiceUnLockUI", "unlock success");
      cId();
      AppMethodBeat.o(26245);
    }
    while (true)
    {
      return;
      this.sLM.setErr(2131304295);
      this.sLM.cIg();
      AppMethodBeat.o(26245);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26241);
    super.onCreate(paramBundle);
    this.sMT = new q(this);
    ab.d("MicroMsg.VoicePrintUnLockService", "getVoiceText");
    aw.Rg().a(new d(73, ""), 0);
    AppMethodBeat.o(26241);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(26248);
    super.onDestroy();
    q localq = this.sMT;
    aw.Rg().b(611, localq);
    aw.Rg().b(613, localq);
    localq.sLI = null;
    AppMethodBeat.o(26248);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI
 * JD-Core Version:    0.6.2
 */