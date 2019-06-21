package com.tencent.mm.ui.websearch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.websearch.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

@com.tencent.mm.ui.base.a(7)
public class WebSearchVoiceUI extends WebSearchBaseActivity
{
  private String cIy;
  private String cvF;
  private int scene;
  private com.tencent.mm.pluginsdk.ui.websearch.a zLK;
  private View zLL;
  private int zLM;

  public final int getLayoutId()
  {
    return 2130971205;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(35385);
    super.onBackPressed();
    setResult(0);
    finish();
    AppMethodBeat.o(35385);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(35384);
    super.onCreate(paramBundle);
    if (getIntent() != null)
    {
      this.cvF = getIntent().getStringExtra("sessionId");
      this.cIy = getIntent().getStringExtra("subSessionId");
      this.scene = getIntent().getIntExtra("key_scene", -1);
      this.zLM = getIntent().getIntExtra("key_is_nav_voice", 0);
    }
    this.zLL = findViewById(2131828441);
    this.mController.hideTitleView();
    if (this.zLK == null)
    {
      this.zLK = new com.tencent.mm.pluginsdk.ui.websearch.a(this.mController.ylL);
      this.zLK.setCallback(new a.a()
      {
        public final void ajt(String paramAnonymousString)
        {
          AppMethodBeat.i(35382);
          String str = paramAnonymousString;
          if (!TextUtils.isEmpty(paramAnonymousString))
          {
            str = paramAnonymousString;
            if (paramAnonymousString.length() > 2)
              str = paramAnonymousString.substring(0, paramAnonymousString.length() - 1);
          }
          paramAnonymousString = new Intent();
          paramAnonymousString.putExtra("text", str);
          WebSearchVoiceUI.this.setResult(0, paramAnonymousString);
          h.pYm.e(15178, new Object[] { Integer.valueOf(3), Long.valueOf(System.currentTimeMillis()), str, WebSearchVoiceUI.a(WebSearchVoiceUI.this), WebSearchVoiceUI.b(WebSearchVoiceUI.this), Integer.valueOf(WebSearchVoiceUI.c(WebSearchVoiceUI.this)), Integer.valueOf(WebSearchVoiceUI.d(WebSearchVoiceUI.this)) });
          WebSearchVoiceUI.this.finish();
          AppMethodBeat.o(35382);
        }

        public final void djr()
        {
          AppMethodBeat.i(35381);
          WebSearchVoiceUI.this.setResult(0);
          h.pYm.e(15178, new Object[] { Integer.valueOf(4), Long.valueOf(System.currentTimeMillis()), "", WebSearchVoiceUI.a(WebSearchVoiceUI.this), WebSearchVoiceUI.b(WebSearchVoiceUI.this), Integer.valueOf(WebSearchVoiceUI.c(WebSearchVoiceUI.this)), Integer.valueOf(WebSearchVoiceUI.d(WebSearchVoiceUI.this)) });
          WebSearchVoiceUI.this.finish();
          AppMethodBeat.o(35381);
        }

        public final void oz(boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(35383);
          if (paramAnonymousBoolean)
            h.pYm.e(15178, new Object[] { Integer.valueOf(2), Long.valueOf(System.currentTimeMillis()), "", WebSearchVoiceUI.a(WebSearchVoiceUI.this), WebSearchVoiceUI.b(WebSearchVoiceUI.this), Integer.valueOf(WebSearchVoiceUI.c(WebSearchVoiceUI.this)), Integer.valueOf(WebSearchVoiceUI.d(WebSearchVoiceUI.this)) });
          AppMethodBeat.o(35383);
        }
      });
    }
    this.zLK.dkM();
    com.tencent.mm.pluginsdk.ui.websearch.a locala = this.zLK;
    ab.d("MicroMsg.VoiceInputPanel", "refreshHeight DISPLAY_HEIGHT_PORT_IN_PX %s,needRefreshProtHeight %s", new Object[] { Integer.valueOf(locala.vmi), Boolean.valueOf(locala.vpB) });
    if (locala.vpB)
    {
      locala.vpB = false;
      View localView = locala.findViewById(2131828442);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      int i = locala.vmi;
      paramBundle = localLayoutParams;
      if (localLayoutParams == null)
        paramBundle = new LinearLayout.LayoutParams(-1, i);
      paramBundle.height = i;
      localView.setLayoutParams(paramBundle);
      locala.dkO();
      locala.requestLayout();
    }
    this.zLK.setVisibility(0);
    paramBundle = new RelativeLayout.LayoutParams(-1, -2);
    paramBundle.addRule(12);
    ((ViewGroup)findViewById(2131820987)).addView(this.zLK, paramBundle);
    h.pYm.e(15178, new Object[] { Integer.valueOf(1), Long.valueOf(System.currentTimeMillis()), "", this.cvF, this.cIy, Integer.valueOf(this.scene), Integer.valueOf(this.zLM) });
    AppMethodBeat.o(35384);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(35386);
    super.onDestroy();
    if (this.zLK != null)
      this.zLK.destroy();
    AppMethodBeat.o(35386);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.websearch.WebSearchVoiceUI
 * JD-Core Version:    0.6.2
 */