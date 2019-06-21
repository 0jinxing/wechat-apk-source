package com.tencent.mm.plugin.voiceprint.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.plugin.voiceprint.model.m;
import com.tencent.mm.plugin.voiceprint.model.p;
import com.tencent.mm.plugin.voiceprint.model.p.1;
import com.tencent.mm.plugin.voiceprint.model.p.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ay.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.File;

public abstract class BaseVoicePrintUI extends MMActivity
{
  private final ap nNC = new ap(new ap.a()
  {
    public final boolean BI()
    {
      AppMethodBeat.i(26132);
      if (BaseVoicePrintUI.a(BaseVoicePrintUI.this) == null)
      {
        AppMethodBeat.o(26132);
        return true;
      }
      p localp = BaseVoicePrintUI.a(BaseVoicePrintUI.this);
      if (localp.chd != null)
      {
        i = localp.chd.getMaxAmplitude();
        if (i > p.cri)
          p.cri = i;
        ab.d("MicroMsg.VoicePrintRecoder", " map: " + i + " max:" + p.cri + " per:" + i * 100 / p.cri);
      }
      for (int i = i * 100 / p.cri; ; i = 0)
      {
        BaseVoicePrintUI.a(BaseVoicePrintUI.this, i);
        AppMethodBeat.o(26132);
        break;
      }
    }
  }
  , true);
  private boolean nNt = false;
  Button sLJ;
  View sLK;
  VoicePrintVolumeMeter sLL;
  VoiceTipInfoView sLM;
  p sLN = null;
  String sLO = null;
  private boolean sLP = false;
  private View sLQ;
  private boolean sLR = false;
  private final p.a sLS = new BaseVoicePrintUI.1(this);
  ap sLT = new ap(new BaseVoicePrintUI.4(this), true);
  private ak sLU = new ak(Looper.getMainLooper(), new ak.a()
  {
    public final boolean handleMessage(Message paramAnonymousMessage)
    {
      boolean bool = true;
      AppMethodBeat.i(26135);
      p localp;
      Object localObject;
      if (paramAnonymousMessage.what == 1)
      {
        ab.d("MicroMsg.BaseVoicePrintUI", "start record");
        ay.a(ah.getContext(), 2131304021, new ay.a()
        {
          public final void EA()
          {
            AppMethodBeat.i(26134);
            ab.i("MicroMsg.BaseVoicePrintUI", "play press sound end");
            AppMethodBeat.o(26134);
          }
        });
        BaseVoicePrintUI.a(BaseVoicePrintUI.this, "voice_pt_voice_print_record.rec");
        localp = BaseVoicePrintUI.a(BaseVoicePrintUI.this);
        localObject = BaseVoicePrintUI.d(BaseVoicePrintUI.this);
        paramAnonymousMessage = BaseVoicePrintUI.this;
        localp.fileName = ((String)localObject);
        ab.d("MicroMsg.VoicePrintRecoder", "start filename %s", new Object[] { localp.fileName });
        aw.ZL().a(localp);
        int i = aw.ZL().KM();
        localp.sth = false;
        localp.gar = new b(paramAnonymousMessage);
        if (i != 0)
        {
          localp.gE(100);
          BaseVoicePrintUI.e(BaseVoicePrintUI.this).ae(100L, 100L);
          paramAnonymousMessage = BaseVoicePrintUI.this;
          paramAnonymousMessage.sLM.cIh();
          localObject = paramAnonymousMessage.sLM;
          ab.d("MicroMsg.VoiceTipInfoView", "hideTitle, titleTv.getVisibility:%d, mAnimingTitle:%b", new Object[] { Integer.valueOf(((VoiceTipInfoView)localObject).iDT.getVisibility()), Boolean.valueOf(((VoiceTipInfoView)localObject).sMN) });
          if ((((VoiceTipInfoView)localObject).iDT.getVisibility() != 0) || (((VoiceTipInfoView)localObject).sMN))
            break label368;
          ((VoiceTipInfoView)localObject).iDT.clearAnimation();
          ((VoiceTipInfoView)localObject).sMN = true;
          a.a(((VoiceTipInfoView)localObject).iDT, ((VoiceTipInfoView)localObject).getContext(), new VoiceTipInfoView.3((VoiceTipInfoView)localObject));
          label263: paramAnonymousMessage.sLM.setTipText(paramAnonymousMessage.sLs);
          paramAnonymousMessage.sLT.stopTimer();
          paramAnonymousMessage.sLT.ae(500L, 500L);
          paramAnonymousMessage.sLK.setVisibility(0);
          paramAnonymousMessage = paramAnonymousMessage.sLL;
          paramAnonymousMessage.reset();
          paramAnonymousMessage.mIsPlaying = true;
          localObject = paramAnonymousMessage.sMw;
          long l = VoicePrintVolumeMeter.nOt;
          ((ap)localObject).ae(l, l);
          paramAnonymousMessage.cIc();
          AppMethodBeat.o(26135);
        }
      }
      while (true)
      {
        return bool;
        new p.1(localp).sendEmptyMessageDelayed(0, 50L);
        break;
        label368: ab.d("MicroMsg.VoiceTipInfoView", "hideTitle, directly set to INVISIBLE");
        ((VoiceTipInfoView)localObject).iDT.clearAnimation();
        ((VoiceTipInfoView)localObject).iDT.setVisibility(4);
        ((VoiceTipInfoView)localObject).iDT.invalidate();
        break label263;
        AppMethodBeat.o(26135);
        bool = false;
      }
    }
  });
  String sLs = null;

  protected final void FV(int paramInt)
  {
    this.sLM.bQt();
    this.sLM.setErr(paramInt);
    this.sLM.cIg();
  }

  protected abstract void bKm();

  protected final void cHR()
  {
    al.n(new BaseVoicePrintUI.7(this), 1300L);
  }

  protected final void cHS()
  {
    if ((this.sLQ.getVisibility() == 4) || (this.sLQ.getVisibility() == 8));
    while (true)
    {
      return;
      if (this.sLR)
      {
        this.sLQ.setVisibility(4);
      }
      else
      {
        this.sLR = true;
        a.a(this.sLQ, this, new BaseVoicePrintUI.9(this));
      }
    }
  }

  protected final void cHT()
  {
    FV(2131304303);
  }

  protected abstract void cHU();

  public final int getLayoutId()
  {
    return 2130971016;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.sLM = ((VoiceTipInfoView)findViewById(2131828462));
    this.sLJ = ((Button)findViewById(2131828464));
    this.sLK = findViewById(2131824678);
    this.sLL = ((VoicePrintVolumeMeter)findViewById(2131824679));
    this.sLQ = findViewById(2131828465);
    this.sLM.cIh();
    this.sLL.setArchView(this.sLJ);
    this.sLN = new p();
    this.sLN.sLE = this.sLS;
    this.sLJ.setOnTouchListener(new BaseVoicePrintUI.10(this));
    findViewById(2131823808).setOnClickListener(new BaseVoicePrintUI.2(this));
    bKm();
  }

  public void onDestroy()
  {
    super.onDestroy();
    Object localObject = this.sLL;
    ((VoicePrintVolumeMeter)localObject).sMw.stopTimer();
    ((VoicePrintVolumeMeter)localObject).sMv.oAl.getLooper().quit();
    ab.d("MicroMsg.VoicePrintVolumeMeter", "destroy, quit factor thread");
    ab.d("MicroMsg.VoicePrintLogic", "delete voiceprint voice file");
    localObject = new File(m.by("voice_pt_voice_print_record.rec", false));
    if (((File)localObject).exists())
      ((File)localObject).delete();
    localObject = new File(m.by("voice_pt_voice_print_noise_detect.rec", false));
    if (((File)localObject).exists())
      ((File)localObject).delete();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI
 * JD-Core Version:    0.6.2
 */