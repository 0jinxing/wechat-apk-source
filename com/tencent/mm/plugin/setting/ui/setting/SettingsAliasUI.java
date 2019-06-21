package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.plugin.setting.model.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;

public class SettingsAliasUI extends MMActivity
  implements f
{
  private String dFl;
  private ProgressDialog ehJ = null;
  private ImageView ejo;
  private TextView ejp;
  private TextView gGA;
  private EditText qmS;
  private d qmT;
  private boolean qmU = false;
  private TextView qmV;
  private f qmb = null;

  public final int getLayoutId()
  {
    return 2130970630;
  }

  public final void initView()
  {
    AppMethodBeat.i(127194);
    setMMTitle(2131301491);
    this.ejo = ((ImageView)findViewById(2131821183));
    this.ejp = ((TextView)findViewById(2131823149));
    this.gGA = ((TextView)findViewById(2131826877));
    this.qmV = ((TextView)findViewById(2131827381));
    this.qmS = ((EditText)findViewById(2131827380));
    String str = com.tencent.mm.model.r.Yz();
    if (!ad.aoA(str))
    {
      this.qmS.setText(com.tencent.mm.model.r.Yz());
      this.gGA.setText(getString(2131296520, new Object[] { str }));
    }
    this.qmS.setSelection(this.qmS.getText().length());
    this.qmS.setFocusable(true);
    this.qmS.setFocusableInTouchMode(true);
    this.qmS.addTextChangedListener(new SettingsAliasUI.1(this));
    this.ejp.setText(j.b(this, bo.nullAsNil(com.tencent.mm.model.r.YB()), this.ejp.getTextSize()));
    a.b.b(this.ejo, str);
    setBackBtn(new SettingsAliasUI.2(this));
    a(0, getString(2131297038), new SettingsAliasUI.3(this), q.b.ymu);
    enableOptionMenu(false);
    AppMethodBeat.o(127194);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127191);
    super.onCreate(paramBundle);
    this.qmU = getIntent().getBooleanExtra("KFromSetAliasTips", false);
    initView();
    g.Rg().a(177, this);
    AppMethodBeat.o(127191);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127193);
    if (this.qmT != null)
      g.Rg().c(this.qmT);
    g.Rg().b(177, this);
    super.onDestroy();
    AppMethodBeat.o(127193);
  }

  public void onPause()
  {
    AppMethodBeat.i(127192);
    super.onPause();
    AppMethodBeat.o(127192);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    int i = 1;
    AppMethodBeat.i(127195);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.qmU)
        com.tencent.mm.plugin.report.service.h.pYm.X(10358, "1");
      aqX();
      g.RP().Ry().set(42, this.dFl);
      paramString = g.Rg();
      paramm = new SettingsAliasUI.5(this);
      this.qmb = paramm;
      paramString.a(255, paramm);
      paramString = new com.tencent.mm.modelsimple.r(1);
      g.Rg().a(paramString, 0);
      AppMethodBeat.o(127195);
    }
    while (true)
    {
      return;
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if (b.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
        paramInt1 = i;
      while (true)
      {
        if (paramInt1 == 0)
          break label224;
        AppMethodBeat.o(127195);
        break;
        switch (paramInt1)
        {
        default:
        case 4:
        }
        do
        {
          paramInt1 = 0;
          break;
        }
        while ((paramInt2 != -7) && (paramInt2 != -10));
        com.tencent.mm.ui.base.h.g(this.mController.ylL, 2131302221, 2131301495);
        paramInt1 = i;
      }
      label224: AppMethodBeat.o(127195);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI
 * JD-Core Version:    0.6.2
 */