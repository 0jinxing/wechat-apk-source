package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.mm.plugin.report.kvdata.log_13905;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.pluginsdk.ui.chat.n;
import com.tencent.mm.pluginsdk.ui.chat.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

public class VoiceInputFooter extends BasePanelKeybordLayout
{
  private MMActivity crP;
  private ChatFooterPanel eAk;
  MMEditText jZg;
  LinearLayout oDC;
  n viY;
  ImageButton viZ;
  private ImageButton vja;
  private boolean vjb;
  private boolean vjc;
  private final int vjd;
  private final int vje;
  private VoiceInputFooter.a vjf;

  public VoiceInputFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(27560);
    this.jZg = null;
    this.vjb = false;
    this.vjc = false;
    this.vjd = 1;
    this.vje = 2;
    this.crP = ((MMActivity)paramContext);
    paramContext = (ViewGroup)v.hu(this.crP).inflate(2130971013, this);
    this.vja = ((ImageButton)paramContext.findViewById(2131828456));
    this.vja.setOnClickListener(new VoiceInputFooter.3(this));
    this.viZ = ((ImageButton)paramContext.findViewById(2131825682));
    this.viZ.setOnClickListener(new VoiceInputFooter.4(this));
    if (e.vom == null)
    {
      this.eAk = new d(this.crP);
      AppMethodBeat.o(27560);
    }
    while (true)
    {
      return;
      this.eAk = e.vom.dF(getContext());
      this.eAk.setEntranceScene(ChatFooterPanel.vhh);
      this.eAk.setVisibility(8);
      this.oDC = ((LinearLayout)findViewById(2131820987));
      this.oDC.setOnClickListener(null);
      this.oDC.addView(this.eAk, -1, 0);
      this.eAk.AD();
      this.eAk.bf(false);
      this.eAk.setOnTextOperationListener(new VoiceInputFooter.5(this));
      AppMethodBeat.o(27560);
    }
  }

  private static void kT(int paramInt)
  {
    AppMethodBeat.i(27567);
    VoiceInputBehavior localVoiceInputBehavior = new VoiceInputBehavior();
    if (paramInt == 1)
    {
      localVoiceInputBehavior.smileIconClick = 1;
      ab.i("MicroMsg.VoiceInputFooter", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", new Object[] { Integer.valueOf(localVoiceInputBehavior.cancel), Integer.valueOf(localVoiceInputBehavior.send), Integer.valueOf(localVoiceInputBehavior.click), Integer.valueOf(localVoiceInputBehavior.longClick), Long.valueOf(localVoiceInputBehavior.longClickTime), Integer.valueOf(localVoiceInputBehavior.textClick), Integer.valueOf(localVoiceInputBehavior.textChangeCount), Long.valueOf(localVoiceInputBehavior.textChangeTime), Integer.valueOf(localVoiceInputBehavior.textChangeReturn), Long.valueOf(localVoiceInputBehavior.voiceInputTime), Integer.valueOf(localVoiceInputBehavior.fail), Integer.valueOf(localVoiceInputBehavior.clear), Integer.valueOf(localVoiceInputBehavior.smileIconClick), Integer.valueOf(localVoiceInputBehavior.voiceIconClick), Integer.valueOf(localVoiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(localVoiceInputBehavior.fullScreenVoiceLongClickTime) });
      log_13905 locallog_13905 = new log_13905();
      locallog_13905.viOp_ = localVoiceInputBehavior;
      h.pYm.c(13905, locallog_13905);
      AppMethodBeat.o(27567);
    }
    while (true)
    {
      return;
      if (paramInt == 2)
      {
        localVoiceInputBehavior.voiceIconClick = 1;
        break;
      }
      AppMethodBeat.o(27567);
    }
  }

  final void aRe()
  {
    AppMethodBeat.i(27564);
    this.vjc = false;
    this.eAk.onPause();
    this.eAk.setVisibility(8);
    AppMethodBeat.o(27564);
  }

  public final boolean aYV()
  {
    AppMethodBeat.i(27561);
    boolean bool;
    if (this.eAk.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(27561);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27561);
    }
  }

  public final boolean djp()
  {
    AppMethodBeat.i(27562);
    boolean bool;
    if (this.viY.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(27562);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27562);
    }
  }

  final void djq()
  {
    AppMethodBeat.i(27563);
    this.vjb = false;
    if (this.viY != null)
    {
      this.viY.pause();
      this.viY.setVisibility(8);
      this.vja.setImageResource(2130840567);
      this.viZ.setVisibility(0);
      if (this.vjf != null)
        this.vjf.oA(false);
    }
    AppMethodBeat.o(27563);
  }

  public List<View> getPanelView()
  {
    AppMethodBeat.i(27565);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.eAk);
    localArrayList.add(this.viY);
    AppMethodBeat.o(27565);
    return localArrayList;
  }

  public final void release()
  {
    AppMethodBeat.i(27566);
    if (this.eAk != null)
    {
      this.eAk.AC();
      this.eAk.destroy();
    }
    if (this.viY != null)
      this.viY.destroy();
    AppMethodBeat.o(27566);
  }

  public void setVoiceInputFooterListener(VoiceInputFooter.a parama)
  {
    this.vjf = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputFooter
 * JD-Core Version:    0.6.2
 */