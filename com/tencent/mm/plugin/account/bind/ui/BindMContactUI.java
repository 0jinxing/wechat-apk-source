package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.ui.i;
import com.tencent.mm.plugin.account.friend.ui.i.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import java.util.Map;

public class BindMContactUI extends MMWizardActivity
{
  private String cFl;
  private String countryCode = null;
  private String fHE = null;
  private int fromScene = 0;
  private boolean gqB = false;
  private EditText grE;
  private LinearLayout grF;
  private TextView grG;
  private TextView grH;
  private TextView grI;
  private String grJ = null;
  private i gro;

  private void apb()
  {
    AppMethodBeat.i(13471);
    if ((this.fromScene != 0) && (this.fromScene != 3))
    {
      ynD.clear();
      Ni(1);
      AppMethodBeat.o(13471);
      return;
    }
    int i;
    if (this.fromScene == 3)
    {
      i = 2131297542;
      label52: if (this.fromScene != 3)
        break label94;
    }
    label94: for (int j = 2131297544; ; j = 2131297543)
    {
      h.a(this, i, j, new BindMContactUI.1(this), null);
      AppMethodBeat.o(13471);
      break;
      i = 2131297541;
      break label52;
    }
  }

  private void vL(String paramString)
  {
    AppMethodBeat.i(13474);
    if (this.gro == null)
    {
      i.b localb = i.b.gyv;
      if (this.fromScene == 3)
        localb = i.b.gyw;
      this.gro = new i(localb, this, new BindMContactUI.7(this, paramString));
    }
    this.gro.wn(paramString);
    AppMethodBeat.o(13474);
  }

  public final int getLayoutId()
  {
    return 2130968841;
  }

  public final void initView()
  {
    AppMethodBeat.i(13472);
    this.gqB = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.fromScene = getIntent().getIntExtra("bind_scene", 0);
    ab.i("MicroMsg.BindMContactUI", "bindScene:%d", new Object[] { Integer.valueOf(this.fromScene) });
    this.grE = ((EditText)findViewById(2131821729));
    this.grF = ((LinearLayout)findViewById(2131821726));
    this.grH = ((TextView)findViewById(2131821728));
    this.grI = ((TextView)findViewById(2131821727));
    this.grG = ((TextView)findViewById(2131821762));
    String str1;
    String str3;
    String str4;
    if (this.fromScene == 3)
    {
      str1 = (String)g.RP().Ry().get(6, null);
      if (!bo.isNullOrNil(str1))
      {
        if (!str1.startsWith("+"))
          break label434;
        String str2 = av.Ps(str1);
        str3 = str1;
        str4 = str2;
        if (!bo.isNullOrNil(str2))
        {
          str3 = str1.substring(str2.length() + 1);
          str4 = str2;
        }
        new av();
        str4 = av.formatNumber(str4, str3);
        this.grG.setText(getString(2131297530, new Object[] { str4 }));
      }
    }
    if (!bo.isNullOrNil(this.fHE))
      this.grH.setText(this.fHE);
    if (bo.isNullOrNil(this.countryCode))
    {
      this.countryCode = getString(2131298790);
      if (this.countryCode.startsWith("+"))
        this.countryCode = this.countryCode.substring(1);
    }
    this.grI.setText("+" + this.countryCode);
    if ((this.grJ != null) && (!this.grJ.equals("")))
    {
      this.grE.setText(this.grJ);
      this.grE.setSelection(this.grJ.length());
    }
    while (true)
    {
      addTextOptionMenu(0, getString(2131296989), new BindMContactUI.3(this));
      this.grE.requestFocus();
      setBackBtn(new BindMContactUI.4(this));
      this.grF.setOnClickListener(new BindMContactUI.5(this));
      AppMethodBeat.o(13472);
      return;
      label434: str4 = "86";
      str3 = str1;
      break;
      g.RS().a(new BindMContactUI.2(this));
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(13473);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    default:
      switch (paramInt1)
      {
      default:
      case 30767:
      case 30766:
      case 30765:
      }
      break;
    case 100:
    }
    while (true)
    {
      label60: AppMethodBeat.o(13473);
      while (true)
      {
        return;
        this.fHE = bo.bc(paramIntent.getStringExtra("country_name"), "");
        this.countryCode = bo.bc(paramIntent.getStringExtra("couttry_code"), "");
        if (!this.fHE.equals(""))
          this.grH.setText(this.fHE);
        if (this.countryCode.equals(""))
          break;
        this.grI.setText("+" + this.countryCode);
        break;
        if (paramIntent == null)
          break label60;
        paramIntent = paramIntent.getBundleExtra("result_data");
        if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("agree_privacy")))
          vL(this.cFl);
        AppMethodBeat.o(13473);
        continue;
        if (paramIntent == null)
          break label60;
        paramIntent = paramIntent.getBundleExtra("result_data");
        if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("agree_privacy")))
          al.n(new BindMContactUI.6(this), 100L);
        AppMethodBeat.o(13473);
      }
      if (paramIntent != null)
      {
        paramIntent = paramIntent.getBundleExtra("result_data");
        if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("birthdayComfirmOK")))
          vL(this.cFl);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13468);
    super.onCreate(paramBundle);
    setMMTitle(2131297563);
    this.fHE = bo.bc(getIntent().getStringExtra("country_name"), "");
    this.countryCode = bo.bc(getIntent().getStringExtra("couttry_code"), "");
    this.grJ = bo.bc(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    initView();
    AppMethodBeat.o(13468);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13469);
    super.onDestroy();
    if (this.gro != null)
      this.gro.recycle();
    AppMethodBeat.o(13469);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(13470);
    boolean bool;
    if (paramInt == 4)
    {
      apb();
      bool = true;
      AppMethodBeat.o(13470);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13470);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactUI
 * JD-Core Version:    0.6.2
 */