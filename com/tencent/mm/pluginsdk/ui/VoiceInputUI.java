package com.tencent.mm.pluginsdk.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.g.a.uc;
import com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.mm.plugin.report.kvdata.log_13905;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;

@com.tencent.mm.ui.base.a(3)
public class VoiceInputUI extends MMActivity
{
  private String bzH;
  private Button lcu;
  private int offset;
  private int textChangeCount;
  private String userCode;
  private long vjA;
  private boolean vjB;
  private boolean vjC;
  private View.OnTouchListener vjD;
  private MenuItem.OnMenuItemClickListener vjE;
  private VoiceInputFooter.a vjF;
  private MMEditText vjx;
  private VoiceInputFooter vjy;
  private String vjz;

  public VoiceInputUI()
  {
    AppMethodBeat.i(27613);
    this.vjA = 0L;
    this.textChangeCount = 0;
    this.vjB = true;
    this.vjC = false;
    this.vjD = new VoiceInputUI.2(this);
    this.vjE = new VoiceInputUI.3(this);
    this.vjF = new VoiceInputUI.4(this);
    AppMethodBeat.o(27613);
  }

  private static void a(VoiceInputBehavior paramVoiceInputBehavior)
  {
    AppMethodBeat.i(27621);
    ab.i("VoiceInputUI", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", new Object[] { Integer.valueOf(paramVoiceInputBehavior.cancel), Integer.valueOf(paramVoiceInputBehavior.send), Integer.valueOf(paramVoiceInputBehavior.click), Integer.valueOf(paramVoiceInputBehavior.longClick), Long.valueOf(paramVoiceInputBehavior.longClickTime), Integer.valueOf(paramVoiceInputBehavior.textClick), Integer.valueOf(paramVoiceInputBehavior.textChangeCount), Long.valueOf(paramVoiceInputBehavior.textChangeTime), Integer.valueOf(paramVoiceInputBehavior.textChangeReturn), Long.valueOf(paramVoiceInputBehavior.voiceInputTime), Integer.valueOf(paramVoiceInputBehavior.fail), Integer.valueOf(paramVoiceInputBehavior.clear), Integer.valueOf(paramVoiceInputBehavior.smileIconClick), Integer.valueOf(paramVoiceInputBehavior.voiceIconClick), Integer.valueOf(paramVoiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(paramVoiceInputBehavior.fullScreenVoiceLongClickTime) });
    log_13905 locallog_13905 = new log_13905();
    locallog_13905.viOp_ = paramVoiceInputBehavior;
    h.pYm.c(13905, locallog_13905);
    AppMethodBeat.o(27621);
  }

  private void kT(int paramInt)
  {
    AppMethodBeat.i(27622);
    VoiceInputBehavior localVoiceInputBehavior = new VoiceInputBehavior();
    localVoiceInputBehavior.textChangeCount = this.textChangeCount;
    localVoiceInputBehavior.textChangeReturn = paramInt;
    if (this.vjA != 0L)
    {
      localVoiceInputBehavior.textChangeTime = bo.az(this.vjA);
      this.vjA = 0L;
    }
    a(localVoiceInputBehavior);
    AppMethodBeat.o(27622);
  }

  public final void KP(int paramInt)
  {
    AppMethodBeat.i(27620);
    ab.i("VoiceInputUI", "alvinluo voiceinputui finish type: %d, call stack: %s", new Object[] { Integer.valueOf(paramInt), bo.dpG().toString() });
    uc localuc;
    if (paramInt == 8)
    {
      kT(7);
      localuc = new uc();
      if (paramInt != 7)
        break label159;
      localuc.cQk.action = 1;
      label67: if (!this.vjC)
        break label187;
    }
    label159: label187: for (localuc.cQk.cQl = 1; ; localuc.cQk.cQl = 2)
    {
      localuc.cQk.result = this.vjx.getText().toString();
      localuc.cQk.userCode = this.userCode;
      if (this.vjy != null)
        this.vjy.release();
      com.tencent.mm.sdk.b.a.xxA.m(localuc);
      bo.hideVKB(this.vjx);
      super.finish();
      AppMethodBeat.o(27620);
      return;
      kT(paramInt);
      break;
      if (paramInt == 8)
      {
        localuc.cQk.action = 4;
        break label67;
      }
      localuc.cQk.action = 2;
      break label67;
    }
  }

  public final int getLayoutId()
  {
    return 2130971012;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(27614);
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.bzH = paramBundle.getStringExtra("text");
      this.offset = paramBundle.getIntExtra("offset", -1);
      this.vjz = paramBundle.getStringExtra("punctuation");
      this.userCode = paramBundle.getStringExtra("userCode");
    }
    this.vjA = bo.yz();
    this.textChangeCount = 0;
    this.vjC = false;
    this.vjB = true;
    this.vjx = ((MMEditText)findViewById(2131828455));
    this.lcu = ((Button)findViewById(2131828454));
    this.vjx.addTextChangedListener(new VoiceInputUI.5(this));
    this.lcu.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(27612);
        paramAnonymousView = new VoiceInputBehavior();
        paramAnonymousView.send = 3;
        VoiceInputUI.b(paramAnonymousView);
        VoiceInputUI.this.KP(7);
        AppMethodBeat.o(27612);
      }
    });
    setMMTitle(getString(2131304293));
    enableOptionMenu(true);
    setBackBtn(new VoiceInputUI.1(this));
    this.vjx.setOnTouchListener(this.vjD);
    this.vjx.asB(this.bzH);
    if (this.offset != -1)
      this.vjx.setSelection(this.offset);
    this.vjy = ((VoiceInputFooter)findViewById(2131827849));
    paramBundle = this.vjy;
    MMEditText localMMEditText = this.vjx;
    String str1 = this.vjz;
    String str2 = this.userCode;
    paramBundle.jZg = localMMEditText;
    localMMEditText.setOnClickListener(new VoiceInputFooter.1(paramBundle));
    localMMEditText.setOnEditorActionListener(new VoiceInputFooter.2(paramBundle));
    if (paramBundle.viY == null)
    {
      paramBundle.viY = new n(paramBundle.getContext(), true, paramBundle.jZg);
      paramBundle.viY.setCallback(new VoiceInputFooter.6(paramBundle));
      paramBundle.viY.setPortHeightPX(j.gs(paramBundle.getContext()));
    }
    paramBundle.viY.dkM();
    paramBundle.viY.djT();
    paramBundle.viY.setVisibility(8);
    paramBundle.viY.setToUser(str2);
    paramBundle.viY.setFullScreenData(str1);
    paramBundle.oDC.addView(paramBundle.viY, -1, 0);
    this.vjy.setVoiceInputFooterListener(this.vjF);
    AppMethodBeat.o(27614);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(27617);
    super.onDestroy();
    AppMethodBeat.o(27617);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(27619);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
      KP(2);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(27619);
    return bool;
  }

  public void onPause()
  {
    AppMethodBeat.i(27616);
    super.onPause();
    AppMethodBeat.o(27616);
  }

  public void onResume()
  {
    AppMethodBeat.i(27615);
    super.onResume();
    this.vjx.requestFocus();
    AppMethodBeat.o(27615);
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(27618);
    KP(3);
    super.onSwipeBack();
    AppMethodBeat.o(27618);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputUI
 * JD-Core Version:    0.6.2
 */