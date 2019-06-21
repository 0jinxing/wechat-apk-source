package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.cb.g;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.CustomScrollView;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.textview.a.a;

@com.tencent.mm.ui.base.a(3)
public class TextPreviewUI extends MMActivity
  implements f
{
  private int bottom = 0;
  private bi cKd;
  private Animation qzo;
  private Animation qzp;
  private TextView sW = null;
  private CharSequence text = null;
  private boolean vpf = false;
  private int yI;
  private TextView yJL = null;
  private final int yMA = 1;
  private final int yMB = 2;
  private boolean yMC = false;
  private ToolsBar yMD;
  private View yME;
  private com.tencent.mm.ui.widget.textview.a yMs;
  private com.tencent.mm.ui.widget.b.a yMt;
  private CharSequence yMu;
  private View yMv;
  private View yMw;
  private View yMx;
  private CustomScrollView yMy;
  private final int yMz = 0;

  private void ba(bi parambi)
  {
    AppMethodBeat.i(31063);
    com.tencent.mm.ui.chatting.view.b localb = new com.tencent.mm.ui.chatting.view.b(this.mController.ylL);
    localb.zaY = new TextPreviewUI.4(this, localb, parambi);
    localb.show();
    AppMethodBeat.o(31063);
  }

  public final int getLayoutId()
  {
    return 2130969075;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(31062);
    finish();
    AppMethodBeat.o(31062);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(31060);
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    if (d.iW(19))
      getWindow().setFlags(67109888, 67109888);
    this.yMv = findViewById(2131822632);
    this.text = getIntent().getCharSequenceExtra("key_chat_text");
    long l = getIntent().getLongExtra("Chat_Msg_Id", 0L);
    aw.ZK();
    this.cKd = c.XO().jf(l);
    this.sW = ((TextView)findViewById(2131822635));
    this.yJL = ((TextView)findViewById(2131822633));
    CharSequence localCharSequence = this.text;
    TextView localTextView = this.yJL;
    paramBundle = localCharSequence;
    if ((localCharSequence instanceof SpannableString))
    {
      localTextView.setText(((SpannableString)localCharSequence).toString());
      j.h(localTextView, 1);
      paramBundle = localTextView.getText();
    }
    this.text = paramBundle;
    this.sW.setText(g.dqQ().b(this.text, this.sW.getTextSize()));
    this.yMw = findViewById(2131822637);
    this.yMx = this.yMw.findViewById(2131822638);
    this.yMy = ((CustomScrollView)findViewById(2131822634));
    this.sW.getViewTreeObserver().addOnPreDrawListener(new TextPreviewUI.1(this));
    this.qzp = AnimationUtils.loadAnimation(this.mController.ylL, 2131034229);
    this.qzo = AnimationUtils.loadAnimation(this.mController.ylL, 2131034227);
    this.yMt = new com.tencent.mm.ui.widget.b.a(this.mController.ylL, this.sW);
    this.yMt.zSa = true;
    this.yMt.zRZ = new TextPreviewUI.8(this);
    this.yMt.rBm = new TextPreviewUI.9(this);
    if ((this.yMs == null) && (!bh.o(this.cKd)))
    {
      paramBundle = new a.a(this.sW, this.yMt);
      paramBundle.zWt = 2131690424;
      paramBundle.zWu = 2131689912;
      this.yMs = paramBundle.dLT();
      this.yMs.zWl = new TextPreviewUI.10(this);
    }
    this.yMv.setOnClickListener(new TextPreviewUI.11(this));
    this.sW.setOnClickListener(new TextPreviewUI.12(this));
    if (!bo.isNullOrNil(bh.r(this.cKd)))
    {
      this.yMw.setVisibility(0);
      this.yMx.setOnClickListener(new TextPreviewUI.13(this));
    }
    while (true)
    {
      setBackBtn(new TextPreviewUI.14(this));
      this.yMy.setOnTouchListener(new TextPreviewUI.15(this));
      this.yMy.setOnScrollChangeListener(new TextPreviewUI.2(this));
      aw.Rg().a(525, this);
      AppMethodBeat.o(31060);
      return;
      if (!bh.o(this.cKd))
      {
        paramBundle = (ViewStub)findViewById(2131822636);
        if (paramBundle != null)
          this.yME = paramBundle.inflate();
        this.yMD = ((ToolsBar)findViewById(2131828247));
        this.yMD.setVisibility(0);
        if (this.yMD != null)
        {
          this.yMD.c(0, new TextPreviewUI.5(this));
          this.yMD.c(1, new TextPreviewUI.6(this));
          this.yMD.c(2, new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(31050);
              TextPreviewUI.b(TextPreviewUI.this, TextPreviewUI.b(TextPreviewUI.this));
              AppMethodBeat.o(31050);
            }
          });
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(31064);
    super.onDestroy();
    aw.Rg().b(525, this);
    AppMethodBeat.o(31064);
  }

  public void onResume()
  {
    AppMethodBeat.i(31061);
    super.onResume();
    if (this.yMs != null)
    {
      if (!this.yMs.zWC)
        this.yMs.dLS();
      if (!this.yMs.zWD)
        this.yMs.dLO();
    }
    AppMethodBeat.o(31061);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(31065);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramm.getType())
      {
      default:
        AppMethodBeat.o(31065);
      case 525:
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.TextPreviewUI", "set msg remind!");
      com.tencent.mm.ui.widget.snackbar.b.a(this.mController.ylL, this.mController.ylL.getResources().getString(2131300518), "", null);
      AppMethodBeat.o(31065);
      continue;
      if (paramm.getType() == 525)
      {
        ab.e("MicroMsg.TextPreviewUI", "[setMsgRemind] scene type:%s errCode:%s, errType:%s, errMsg:%s", new Object[] { Integer.valueOf(525), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), bo.nullAsNil(paramString) });
        AppCompatActivity localAppCompatActivity = this.mController.ylL;
        paramm = paramString;
        if (bo.isNullOrNil(paramString))
          paramm = getResources().getString(2131302350);
        com.tencent.mm.ui.base.h.b(localAppCompatActivity, paramm, this.mController.ylL.getResources().getString(2131302351), true);
        com.tencent.mm.plugin.report.service.h.pYm.a(795L, 4L, 1L, false);
      }
      AppMethodBeat.o(31065);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.TextPreviewUI
 * JD-Core Version:    0.6.2
 */