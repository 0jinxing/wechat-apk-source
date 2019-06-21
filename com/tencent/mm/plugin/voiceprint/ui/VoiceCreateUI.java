package com.tencent.mm.plugin.voiceprint.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.plugin.voiceprint.model.f;
import com.tencent.mm.plugin.voiceprint.model.l;
import com.tencent.mm.plugin.voiceprint.model.l.a;
import com.tencent.mm.plugin.voiceprint.model.o;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

public class VoiceCreateUI extends BaseVoicePrintUI
  implements l.a
{
  private View kIe;
  private int sLr;
  private l sMe;
  private o sMf;
  private View sMg;
  private NoiseDetectMaskView sMh;
  private Button sMi;
  private int sMj;
  private c sMk;

  public VoiceCreateUI()
  {
    AppMethodBeat.i(26168);
    this.sMf = null;
    this.kIe = null;
    this.sMi = null;
    this.sLr = 1;
    this.sMj = 0;
    this.sMk = new VoiceCreateUI.1(this);
    AppMethodBeat.o(26168);
  }

  private void cIa()
  {
    AppMethodBeat.i(26172);
    ab.d("MicroMsg.VoiceCreateUI", "start noise detect");
    this.kIe.setVisibility(4);
    this.sMg.setVisibility(4);
    this.sLK.setVisibility(4);
    this.sMh.setVisibility(0);
    this.sMf.cHP();
    AppMethodBeat.o(26172);
  }

  private void cIb()
  {
    AppMethodBeat.i(26177);
    Intent localIntent = new Intent();
    localIntent.putExtra("KIsCreateSuccess", false);
    setResult(-1, localIntent);
    AppMethodBeat.o(26177);
  }

  private void start()
  {
    AppMethodBeat.i(26171);
    ab.d("MicroMsg.VoiceCreateUI", "start create");
    this.sMf.reset();
    this.sMh.reset();
    cIa();
    AppMethodBeat.o(26171);
  }

  public final void E(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(26175);
    ab.d("MicroMsg.VoiceCreateUI", "onCreate, result:%b, step:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramBoolean)
    {
      switch (paramInt)
      {
      default:
      case 71:
      case 72:
      }
      while (true)
      {
        AppMethodBeat.o(26175);
        while (true)
        {
          return;
          ab.d("MicroMsg.VoiceCreateUI", "finish create step 1");
          this.sLJ.setEnabled(false);
          this.sLr = 2;
          cHS();
          a.a(this.sLM, new VoiceCreateUI.7(this));
          AppMethodBeat.o(26175);
        }
        this.sMj = 0;
        ab.d("MicroMsg.VoiceCreateUI", "finish create step 2");
        Intent localIntent = new Intent();
        localIntent.putExtra("KIsCreateSuccess", true);
        setResult(-1, localIntent);
        localIntent = new Intent();
        localIntent.setClass(this, VoicePrintFinishUI.class);
        localIntent.putExtra("kscene_type", 72);
        startActivity(localIntent);
        finish();
      }
    }
    switch (paramInt)
    {
    default:
    case 71:
    case 72:
    }
    while (true)
    {
      AppMethodBeat.o(26175);
      break;
      AppMethodBeat.o(26175);
      break;
      cIb();
      this.sMj += 1;
      if (this.sMj >= 2)
      {
        ab.d("MicroMsg.VoiceCreateUI", "in second step, verify two times failed");
        this.sMj = 0;
        startActivity(new Intent(this, VoiceReCreatePromptUI.class));
        overridePendingTransition(2131034265, 2131034262);
        finish();
        AppMethodBeat.o(26175);
        break;
      }
      this.sLJ.setEnabled(true);
      this.sLM.bQt();
      this.sLM.setErr(2131304313);
      this.sLM.cIg();
    }
  }

  public final void abS(String paramString)
  {
    AppMethodBeat.i(26173);
    ab.d("MicroMsg.VoiceCreateUI", "onGetFirstText");
    cHR();
    this.sLs = paramString;
    this.sLM.bQt();
    this.sLM.cIe();
    this.sLM.setTipText(paramString);
    this.sLJ.setEnabled(true);
    AppMethodBeat.o(26173);
  }

  public final void abT(String paramString)
  {
    AppMethodBeat.i(26174);
    ab.d("MicroMsg.VoiceCreateUI", "onGetSecondText");
    this.sLs = paramString;
    this.sLM.bQt();
    this.sLM.cIe();
    this.sLM.setTipText(paramString);
    this.sLJ.setEnabled(true);
    AppMethodBeat.o(26174);
  }

  protected final void bKm()
  {
    AppMethodBeat.i(26170);
    this.sMe = new l(this);
    findViewById(2131823774).setVisibility(8);
    this.sLM.setTitleText(2131304311);
    this.sLM.cIf();
    this.sLJ.setEnabled(false);
    this.sMf = new o();
    this.sMg = findViewById(2131828463);
    this.sMh = ((NoiseDetectMaskView)findViewById(2131827308));
    this.kIe = findViewById(2131823808);
    this.sMi = ((Button)findViewById(2131823774));
    this.sMi.setVisibility(8);
    this.sMi.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(26162);
        VoiceCreateUI.this.cHS();
        a.a(VoiceCreateUI.this.sLM, new VoiceCreateUI.2.1(this));
        AppMethodBeat.o(26162);
      }
    });
    this.sMh.setOnClickRetryCallback(new VoiceCreateUI.3(this));
    this.sMh.setOnCancelDetectCallback(new NoiseDetectMaskView.a()
    {
      public final void cHX()
      {
        AppMethodBeat.i(26164);
        VoiceCreateUI.e(VoiceCreateUI.this);
        o localo = VoiceCreateUI.f(VoiceCreateUI.this);
        ab.d("MicroMsg.VoicePrintNoiseDetector", "stopDetect");
        localo.sLw.EB();
        localo.sLx.stopTimer();
        VoiceCreateUI.this.finish();
        AppMethodBeat.o(26164);
      }
    });
    com.tencent.mm.sdk.b.a.xxA.c(this.sMk);
    this.kIe.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(26165);
        VoiceCreateUI.e(VoiceCreateUI.this);
        VoiceCreateUI.this.finish();
        AppMethodBeat.o(26165);
      }
    });
    start();
    AppMethodBeat.o(26170);
  }

  public final void cHM()
  {
    AppMethodBeat.i(26176);
    cHT();
    cIb();
    AppMethodBeat.o(26176);
  }

  protected final void cHU()
  {
    AppMethodBeat.i(26169);
    ab.d("MicroMsg.VoiceCreateUI", "sendVoice, filename:%s", new Object[] { this.sLO });
    l locall;
    f localf;
    if (!bo.isNullOrNil(this.sLO))
    {
      this.sLJ.setEnabled(false);
      this.sLM.bQs();
      if (this.sLr == 1)
      {
        locall = this.sMe;
        localf = new f(this.sLO, 71, locall.sLt, 0);
        localf.sLb = true;
        aw.Rg().a(localf, 0);
        locall.sLr = 71;
        AppMethodBeat.o(26169);
      }
    }
    while (true)
    {
      return;
      if (this.sLr == 2)
      {
        locall = this.sMe;
        localf = new f(this.sLO, 72, locall.sLt, locall.sLf);
        localf.sLb = true;
        aw.Rg().a(localf, 0);
        locall.sLr = 72;
      }
      AppMethodBeat.o(26169);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(26179);
    super.onBackPressed();
    cIb();
    AppMethodBeat.o(26179);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(26178);
    super.onDestroy();
    l locall = this.sMe;
    aw.Rg().b(611, locall);
    aw.Rg().b(612, locall);
    locall.sLu = null;
    com.tencent.mm.sdk.b.a.xxA.d(this.sMk);
    AppMethodBeat.o(26178);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI
 * JD-Core Version:    0.6.2
 */