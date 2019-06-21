package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ag;
import com.tencent.mm.platformtools.c;
import com.tencent.mm.platformtools.z;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText.c;
import java.util.Timer;

public class MobileVerifyUI extends MMActivity
{
  String bCu;
  protected String cFl;
  protected ProgressDialog ehJ = null;
  int fPA;
  private c gCd;
  private int gDW;
  protected boolean gDc = false;
  protected String gDy;
  protected MMFormInputView gEV;
  protected TextView gEW;
  protected TextView gEX;
  protected TextView gEY;
  protected Button gEZ;
  String gEk;
  int gEs;
  protected int gEu;
  protected ScrollView gFa;
  private long gFb = 0L;
  private boolean gFc = false;
  private String[] gFd;
  private boolean gFe = false;
  Boolean gFf;
  private int gFg = 30;
  protected boolean gFh = false;
  protected boolean gFi = false;
  protected int gFj = -1;
  private MobileVerifyUI.b gFk;
  String gFl;
  protected String gFm;
  protected EditText grL;
  protected TextView grM;
  String gsF;
  SecurityImage gue = null;
  private Timer mTimer;

  private void arh()
  {
    AppMethodBeat.i(125286);
    if (!this.gFc)
    {
      this.mTimer = new Timer();
      this.gFc = true;
      this.gFb = this.gFg;
      MobileVerifyUI.1 local1 = new MobileVerifyUI.1(this);
      this.mTimer.schedule(local1, 1000L, 1000L);
    }
    AppMethodBeat.o(125286);
  }

  private void ari()
  {
    AppMethodBeat.i(125289);
    aqX();
    if (this.grL.getText().toString().trim().equals(""))
    {
      h.g(this, 2131297590, 2131297061);
      AppMethodBeat.o(125289);
    }
    while (true)
    {
      return;
      this.gFk.a(MobileVerifyUI.a.gFu);
      AppMethodBeat.o(125289);
    }
  }

  private void arj()
  {
    AppMethodBeat.i(125290);
    this.gFe = false;
    this.gEW.setEnabled(false);
    this.gEX.setVisibility(0);
    this.gEX.setText(getResources().getQuantityString(2131361811, this.gFg, new Object[] { Integer.valueOf(this.gFg) }));
    this.gEW.setVisibility(8);
    arh();
    this.gFk.a(MobileVerifyUI.a.gFv);
    h.bQ(this, getString(2131301452));
    AppMethodBeat.o(125290);
  }

  private void goBack()
  {
    AppMethodBeat.i(125292);
    com.tencent.mm.plugin.b.a.wA(this.gsF);
    if (!this.gFk.a(MobileVerifyUI.a.gFt))
    {
      finish();
      AppMethodBeat.o(125292);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(125292);
    }
  }

  protected final void dq(boolean paramBoolean)
  {
    AppMethodBeat.i(125295);
    Intent localIntent = new Intent(this, RegByMobileSetPwdUI.class);
    localIntent.putExtra("kintent_hint", getString(2131303155));
    localIntent.putExtra("kintent_cancelable", paramBoolean);
    startActivityForResult(localIntent, 0);
    AppMethodBeat.o(125295);
  }

  public final int getLayoutId()
  {
    return 2130970239;
  }

  public final void initView()
  {
    AppMethodBeat.i(125288);
    ab.d("MicroMsg.MobileVerifyUI", "init getintent mobile:" + this.cFl);
    this.gEV = ((MMFormInputView)findViewById(2131821771));
    this.gEV.setImeOption(5);
    this.gEV.setInputType(3);
    this.grL = this.gEV.getContentEditText();
    this.gEW = ((TextView)findViewById(2131826131));
    this.gEX = ((TextView)findViewById(2131826132));
    this.grM = ((TextView)findViewById(2131821769));
    this.grM.setText(this.cFl);
    this.cFl = av.amN(this.cFl);
    this.gEW.setText(getString(2131301477));
    this.gEY = ((TextView)findViewById(2131826130));
    this.gEZ = ((Button)findViewById(2131822846));
    this.gFa = ((ScrollView)findViewById(2131820741));
    this.gFd = getResources().getStringArray(2131755059);
    Object localObject = getString(2131302268);
    this.gEY.setText(Html.fromHtml((String)localObject));
    localObject = new MobileVerifyUI.5(this);
    this.gEX.setVisibility(0);
    this.gEX.setText(getResources().getQuantityString(2131361811, this.gFg, new Object[] { Integer.valueOf(this.gFg) }));
    arh();
    this.gFe = false;
    this.grL.setFilters(new InputFilter[] { localObject });
    this.grL.addTextChangedListener(new MMEditText.c(this.grL, null, 12));
    this.gEZ.setOnClickListener(new MobileVerifyUI.6(this));
    this.gEZ.setEnabled(false);
    this.grL.setTextSize(15.0F);
    this.grL.addTextChangedListener(new MobileVerifyUI.7(this));
    this.gEW.setOnClickListener(new MobileVerifyUI.8(this));
    this.gEW.setEnabled(false);
    setBackBtn(new MobileVerifyUI.9(this));
    this.grL.setOnEditorActionListener(new MobileVerifyUI.10(this));
    this.grL.setOnKeyListener(new MobileVerifyUI.11(this));
    AppMethodBeat.o(125288);
  }

  protected final boolean j(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(125294);
    Object localObject = com.tencent.mm.h.a.jY(paramString);
    boolean bool;
    if (localObject != null)
    {
      ((com.tencent.mm.h.a)localObject).a(this, null, null);
      AppMethodBeat.o(125294);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramInt1 == 4);
      int i;
      switch (paramInt2)
      {
      default:
        switch (paramInt2)
        {
        default:
          i = 0;
        case -34:
        case -43:
        case -41:
        case -36:
        case -32:
        case -33:
        case -100:
        }
        break;
      case -1:
      case -75:
      }
      while (true)
        if (i != 0)
        {
          AppMethodBeat.o(125294);
          bool = true;
          break;
          if (g.Rg().acS() == 5)
          {
            h.g(this, 2131301656, 2131301655);
            AppMethodBeat.o(125294);
            bool = true;
            break;
          }
          z.cu(this);
          AppMethodBeat.o(125294);
          bool = true;
          break;
          Toast.makeText(this, 2131297538, 0).show();
          i = 1;
          continue;
          Toast.makeText(this, 2131297535, 0).show();
          i = 1;
          continue;
          Toast.makeText(this, 2131297537, 0).show();
          i = 1;
          continue;
          Toast.makeText(this, 2131297540, 0).show();
          i = 1;
          continue;
          h.a(this, getString(2131297585), "", new MobileVerifyUI.12(this));
          i = 1;
          continue;
          h.a(this, 2131297583, 2131297589, new MobileVerifyUI.2(this));
          i = 1;
          continue;
          com.tencent.mm.kernel.a.hold();
          AppCompatActivity localAppCompatActivity = this.mController.ylL;
          g.RN();
          if (TextUtils.isEmpty(com.tencent.mm.kernel.a.QH()));
          for (localObject = com.tencent.mm.bz.a.an(this.mController.ylL, 2131301294); ; localObject = com.tencent.mm.kernel.a.QH())
          {
            h.a(localAppCompatActivity, (String)localObject, this.mController.ylL.getString(2131297061), new MobileVerifyUI.3(this), new MobileVerifyUI.4(this));
            i = 1;
            break;
            g.RN();
          }
        }
      paramString = new ag(paramInt1, paramInt2, paramString);
      if (this.gCd.a(this, paramString))
      {
        AppMethodBeat.o(125294);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(125294);
        bool = false;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125282);
    super.onCreate(paramBundle);
    this.gEs = getIntent().getIntExtra("key_reg_style", 1);
    this.gDW = getIntent().getIntExtra("mobile_verify_purpose", 0);
    this.gFl = getIntent().getStringExtra("MicroMsg.MobileVerifyUIIntent_sms_code");
    this.gEk = getIntent().getStringExtra("kintent_password");
    this.bCu = getIntent().getStringExtra("kintent_nickname");
    this.gFf = Boolean.valueOf(getIntent().getBooleanExtra("kintent_hasavatar", false));
    this.gDc = getIntent().getBooleanExtra("from_deep_link", false);
    this.gDy = getIntent().getStringExtra("regsession_id");
    this.gFm = getIntent().getStringExtra("reg_3d_app_ticket");
    this.gEu = getIntent().getIntExtra("reg_3d_app_type", 0);
    switch (this.gDW)
    {
    default:
      ab.e("MicroMsg.MobileVerifyUI", "wrong purpose %s", new Object[] { Integer.valueOf(this.gDW) });
      finish();
      AppMethodBeat.o(125282);
      return;
    case 2:
      this.gFk = new o();
      if ((this.gEk != null) && (this.gEk.length() >= 8))
      {
        this.fPA = 1;
        label261: paramBundle = getString(2131297566);
        if (d.vxr)
          paramBundle = getString(2131296982) + getString(2131296513);
        setMMTitle(paramBundle);
        this.gFg = getIntent().getIntExtra("mobileverify_countdownsec", 30);
        this.gFh = getIntent().getBooleanExtra("mobileverify_fb", false);
        this.gFi = getIntent().getBooleanExtra("mobileverify_reg_qq", false);
        this.cFl = getIntent().getExtras().getString("bindmcontact_mobile");
        this.gsF = com.tencent.mm.plugin.b.a.arO();
        initView();
        this.gFk.a(this);
        if (this.gFl == null)
          break label477;
        this.grL.setText(this.gFl);
        ari();
      }
      break;
    case 3:
    case 5:
    case 4:
    }
    while (true)
    {
      this.gCd = new c();
      AppMethodBeat.o(125282);
      break;
      this.fPA = 4;
      break label261;
      this.gFk = new m(this.gDW);
      break label261;
      this.gFk = new n();
      break label261;
      label477: if (this.gDW == 5)
        this.gFk.a(MobileVerifyUI.a.gFv);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125283);
    if (this.gCd != null)
      this.gCd.close();
    super.onDestroy();
    AppMethodBeat.o(125283);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125291);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(125291);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125291);
    }
  }

  public final void onKeyboardStateChanged()
  {
    AppMethodBeat.i(125287);
    if (this.mController.ymc == 1)
    {
      this.gFa.scrollTo(0, this.gFa.getChildAt(0).getMeasuredHeight() - this.gFa.getMeasuredHeight());
      AppMethodBeat.o(125287);
    }
    while (true)
    {
      return;
      this.gFa.scrollTo(0, 0);
      AppMethodBeat.o(125287);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(125293);
    super.onNewIntent(paramIntent);
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getStringExtra("nofification_type");
      ab.d("MicroMsg.MobileVerifyUI", "[oneliang][notificationType]%s", new Object[] { paramIntent });
      if ((paramIntent != null) && (paramIntent.equals("no_reg_notification")))
        arj();
    }
    AppMethodBeat.o(125293);
  }

  public void onPause()
  {
    AppMethodBeat.i(125285);
    super.onPause();
    this.gFk.stop();
    AppMethodBeat.o(125285);
  }

  public void onResume()
  {
    AppMethodBeat.i(125284);
    super.onResume();
    this.gFk.start();
    AppMethodBeat.o(125284);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileVerifyUI
 * JD-Core Version:    0.6.2
 */