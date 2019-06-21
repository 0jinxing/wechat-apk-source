package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMAutoCompleteTextView;
import com.tencent.mm.ui.base.h;
import java.util.Map;
import java.util.Set;

public class RegByEmailUI extends MMActivity
  implements f
{
  private static String[] gFE;
  private String dtV;
  private ProgressDialog ehJ = null;
  private EditText gFA;
  private CheckBox gFB;
  private String gFC;
  private Map<String, String> gFD;
  private MMAutoCompleteTextView gFz;
  private String gsF;
  private String guf;

  private void goBack()
  {
    AppMethodBeat.i(125317);
    h.a(this, 2131302226, 2131302229, 2131296994, 2131296868, new RegByEmailUI.2(this), null);
    AppMethodBeat.o(125317);
  }

  public final int getLayoutId()
  {
    return 2130970492;
  }

  public final void initView()
  {
    AppMethodBeat.i(125316);
    this.gFz = ((MMAutoCompleteTextView)findViewById(2131826915));
    this.gFA = ((EditText)findViewById(2131826916));
    this.gFB = ((CheckBox)findViewById(2131826066));
    if (!bo.isNullOrNil(this.gFC))
    {
      this.gFA.postDelayed(new RegByEmailUI.1(this), 500L);
      this.gFz.setText(this.gFC);
    }
    if (gFE != null)
    {
      c localc = new c(this, gFE, "@");
      this.gFz.setSpilter("@");
      this.gFz.setDropDownAnchor(2131826914);
      this.gFz.setDropDownVerticalOffset(this.gFz.getPaddingBottom());
      this.gFz.setAdapter(localc);
    }
    findViewById(2131826067).setOnClickListener(new RegByEmailUI.5(this));
    this.gFB.setOnCheckedChangeListener(new RegByEmailUI.6(this));
    addTextOptionMenu(0, getString(2131296989), new RegByEmailUI.7(this));
    enableOptionMenu(false);
    this.gFz.addTextChangedListener(new RegByEmailUI.8(this));
    this.gFA.addTextChangedListener(new RegByEmailUI.9(this));
    this.gFA.setOnEditorActionListener(new RegByEmailUI.10(this));
    this.gFA.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        boolean bool = false;
        AppMethodBeat.i(125311);
        if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
          if (!RegByEmailUI.d(RegByEmailUI.this).isChecked())
            AppMethodBeat.o(125311);
        while (true)
        {
          return bool;
          RegByEmailUI.c(RegByEmailUI.this);
          bool = true;
          AppMethodBeat.o(125311);
          continue;
          AppMethodBeat.o(125311);
        }
      }
    });
    setBackBtn(new RegByEmailUI.12(this));
    AppMethodBeat.o(125316);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125313);
    super.onCreate(paramBundle);
    paramBundle = getString(2131302242);
    if (d.vxr)
      paramBundle = getString(2131296982) + getString(2131296513);
    setMMTitle(paramBundle);
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    this.gFC = w.ct(this);
    ab.i("MicroMsg.RegByEmailUI", "get google account:[%s]", new Object[] { this.gFC });
    this.gFD = j.ghe.cl(this);
    if ((this.gFD != null) && (!this.gFD.isEmpty()))
    {
      gFE = new String[this.gFD.size()];
      this.gFD.keySet().toArray(gFE);
    }
    this.gsF = com.tencent.mm.plugin.b.a.arO();
    initView();
    AppMethodBeat.o(125313);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125318);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(125318);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125318);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(125315);
    super.onPause();
    g.Rg().b(481, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R500_100,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R500_100") + ",2");
    AppMethodBeat.o(125315);
  }

  public void onResume()
  {
    AppMethodBeat.i(125314);
    super.onResume();
    g.Rg().a(481, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R500_100,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R500_100") + ",1");
    com.tencent.mm.plugin.b.a.wz("R500_100");
    AppMethodBeat.o(125314);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125319);
    ab.i("MicroMsg.RegByEmailUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (paramm.getType() != 481)
    {
      ab.e("MicroMsg.RegByEmailUI", "error cgi type callback:[%d]", new Object[] { Integer.valueOf(paramm.getType()) });
      AppMethodBeat.o(125319);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.b.a.wA("R500_200");
        paramString = new Intent(this, EmailVerifyUI.class);
        paramString.putExtra("email_address", this.dtV);
        paramString.putExtra("password", this.guf);
        if ((this.gFD != null) && (!this.gFD.isEmpty()))
        {
          paramm = this.dtV.split("@");
          if ((paramm != null) && (paramm.length == 2))
          {
            paramm = paramm[1];
            paramString.putExtra("email_login_page", (String)this.gFD.get(paramm));
          }
        }
        startActivity(paramString);
        AppMethodBeat.o(125319);
      }
      else
      {
        int i;
        if (com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString))
          i = 1;
        while (true)
        {
          if (i == 0)
            break label486;
          AppMethodBeat.o(125319);
          break;
          switch (paramInt2)
          {
          default:
            i = 0;
            break;
          case -7:
            paramm = new StringBuilder();
            g.RN();
            paramm = paramm.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R20_email_duplicate_confirm,");
            g.RN();
            com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R20_email_duplicate_confirm") + ",3");
            h.a(this, 2131302243, 2131302229, 2131302245, 2131302244, new RegByEmailUI.4(this), null);
            i = 1;
            break;
          case -111:
            h.g(this, 2131302232, 2131302229);
            i = 1;
            break;
          case -34:
            Toast.makeText(this, 2131302227, 0).show();
            i = 1;
            break;
          case -75:
            h.g(this, 2131296516, 2131302222);
            i = 1;
          }
        }
        label486: if (!bo.isNullOrNil(paramString))
        {
          paramString = br.z(paramString, "e");
          if ((paramString != null) && (paramString.size() > 0))
          {
            paramString = (String)paramString.get(".e.Content");
            if (!bo.isNullOrNil(paramString))
            {
              h.b(this, paramString, getString(2131302229), true);
              AppMethodBeat.o(125319);
            }
          }
        }
        else
        {
          Toast.makeText(this, getString(2131302240, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          AppMethodBeat.o(125319);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByEmailUI
 * JD-Core Version:    0.6.2
 */