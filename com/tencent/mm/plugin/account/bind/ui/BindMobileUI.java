package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b;
import com.tencent.mm.au.b.a;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.friend.ui.i;
import com.tencent.mm.plugin.account.friend.ui.i.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMWizardActivity;

public class BindMobileUI extends MMWizardActivity
{
  private String cFl;
  private String countryCode = null;
  private String fHE = null;
  private EditText grE;
  private LinearLayout grF;
  private TextView grH;
  private TextView grI;
  private String grJ = null;
  private BindWordingContent grY;
  private int grZ;
  private i gro;
  private TextView gsf;
  private Button gsg;
  private TextView gsh;
  private TextView gsi;
  private CheckBox gsj;
  private CheckBox gsk;
  private LinearLayout gsl;
  private ImageView gsm;
  private boolean gsn;

  private void apc()
  {
    AppMethodBeat.i(13521);
    if ((!bo.isNullOrNil(this.fHE)) || (!bo.isNullOrNil(this.countryCode)))
      AppMethodBeat.o(13521);
    while (true)
    {
      return;
      Object localObject = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      ab.d("MicroMsg.BindMContactUI", "tm.getSimCountryIso()".concat(String.valueOf(localObject)));
      if (bo.isNullOrNil((String)localObject))
      {
        ab.e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
        AppMethodBeat.o(13521);
      }
      else
      {
        localObject = b.k(this, (String)localObject, getString(2131298789));
        if (localObject == null)
        {
          ab.e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
          AppMethodBeat.o(13521);
        }
        else
        {
          this.fHE = ((b.a)localObject).fHE;
          this.countryCode = ((b.a)localObject).fHD;
          AppMethodBeat.o(13521);
        }
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130968835;
  }

  public final void initView()
  {
    AppMethodBeat.i(13519);
    this.grE = ((EditText)findViewById(2131821729));
    this.grF = ((LinearLayout)findViewById(2131821726));
    this.grH = ((TextView)findViewById(2131821728));
    this.grI = ((TextView)findViewById(2131821727));
    this.gsf = ((TextView)findViewById(2131821725));
    this.gsg = ((Button)findViewById(2131821730));
    this.gsh = ((TextView)findViewById(2131821736));
    this.gsf.setText(getString(2131297556));
    this.gsi = ((TextView)findViewById(2131821734));
    this.gsl = ((LinearLayout)findViewById(2131821731));
    this.gsk = ((CheckBox)findViewById(2131821733));
    this.gsj = ((CheckBox)findViewById(2131821732));
    this.gsm = ((ImageView)findViewById(2131821724));
    if (this.grY != null)
    {
      if ((this.grY.title != null) && (this.grY.title.length() > 0))
        this.gsf.setText(this.grY.title);
      if ((this.grY.content != null) && (this.grY.content.length() > 0))
        this.gsi.setText(this.grY.content);
    }
    switch (this.grY.bWu.intValue())
    {
    default:
      switch (this.grZ)
      {
      default:
      case 0:
      case 1:
      }
      break;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      apc();
      if ((this.fHE != null) && (!this.fHE.equals("")))
        this.grH.setText(this.fHE);
      if ((this.countryCode != null) && (!this.countryCode.equals("")))
        this.grI.setText("+" + this.countryCode);
      if ((this.grJ != null) && (!this.grJ.equals("")))
        this.grE.setText(this.grJ);
      this.gsg.setOnClickListener(new BindMobileUI.2(this));
      this.gsh.setOnClickListener(new BindMobileUI.3(this));
      if (this.gsn)
      {
        setMMTitle(2131297524);
        this.gsm.setVisibility(8);
        this.gsf.setText(2131297545);
        this.gsl.setVisibility(8);
        this.gsk.setVisibility(8);
        this.gsk.setChecked(false);
        this.gsj.setVisibility(0);
        this.gsj.setChecked(false);
        this.gsi.setVisibility(8);
        this.gsi.setText(getString(2131297526));
        this.gsh.setVisibility(8);
        this.gsg.setText(2131297524);
        setBackBtn(new BindMobileUI.4(this));
      }
      this.grF.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(13513);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("country_name", BindMobileUI.f(BindMobileUI.this));
          paramAnonymousView.putExtra("couttry_code", BindMobileUI.g(BindMobileUI.this));
          a.gkE.b(paramAnonymousView, BindMobileUI.this);
          AppMethodBeat.o(13513);
        }
      });
      this.grF.setOnClickListener(new BindMobileUI.6(this));
      AppMethodBeat.o(13519);
      return;
      this.gsm.setImageResource(2130837898);
      break;
      this.gsm.setImageResource(2130837901);
      break;
      this.gsm.setImageResource(2130837899);
      break;
      this.gsl.setVisibility(0);
      this.gsk.setVisibility(0);
      this.gsi.setVisibility(8);
      continue;
      this.gsl.setVisibility(8);
      this.gsk.setVisibility(8);
      this.gsi.setVisibility(0);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(13520);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    default:
    case 100:
    }
    while (true)
    {
      AppMethodBeat.o(13520);
      return;
      this.fHE = bo.bc(paramIntent.getStringExtra("country_name"), "");
      this.countryCode = bo.bc(paramIntent.getStringExtra("couttry_code"), "");
      if (!this.fHE.equals(""))
        this.grH.setText(this.fHE);
      if (!this.countryCode.equals(""))
        this.grI.setText("+" + this.countryCode);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13516);
    super.onCreate(paramBundle);
    setMMTitle(2131297560);
    this.fHE = bo.bc(getIntent().getStringExtra("country_name"), "");
    this.countryCode = bo.bc(getIntent().getStringExtra("couttry_code"), "");
    this.grJ = bo.bc(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    this.grY = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.grZ = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.gsn = getIntent().getBooleanExtra("is_bind_for_chatroom_upgrade", false);
    initView();
    AppMethodBeat.o(13516);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13517);
    super.onDestroy();
    if (this.gro != null)
      this.gro.recycle();
    AppMethodBeat.o(13517);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(13518);
    if (paramInt == 4)
    {
      Ni(1);
      AppMethodBeat.o(13518);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13518);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileUI
 * JD-Core Version:    0.6.2
 */