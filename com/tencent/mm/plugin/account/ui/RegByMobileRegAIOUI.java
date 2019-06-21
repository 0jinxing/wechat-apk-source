package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.au.b.a;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.z;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.protocal.n.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bqw;
import com.tencent.mm.protocal.protobuf.cgx;
import com.tencent.mm.protocal.protobuf.crs;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFormInputView;
import java.io.IOException;
import java.util.TimeZone;

public class RegByMobileRegAIOUI extends MMActivity
  implements f
{
  private String countryCode;
  private ImageView ejo;
  private String fHE;
  private com.tencent.mm.sdk.b.c gAY;
  private String gBE;
  private ba gBm;
  private ResizeLayout gCa;
  private TextView gDL;
  private Button gDN;
  private boolean gDT;
  private String gDV;
  private final int gDd;
  private String gDp;
  private String gDq;
  private int gDr;
  private String gDy;
  private int gEu;
  private EditText gFH;
  private TextView gFI;
  private MMFormInputView gFJ;
  private String gFK;
  private MMFormInputView gFL;
  private boolean gFM;
  private ImageView gFN;
  private MMFormInputView gFO;
  private Bitmap gFP;
  private ScrollView gFQ;
  private String gFR;
  private String gFS;
  private String gFT;
  private String gFU;
  private String gFV;
  private boolean gFW;
  private com.tencent.mm.ui.widget.a.c gFX;
  private boolean gFY;
  private int gFZ;
  private int gGa;
  private boolean gGb;
  private boolean gGc;
  private LinearLayout grF;
  private TextView grH;
  private String grJ;
  private String gsF;
  private com.tencent.mm.ui.base.p guc;

  public RegByMobileRegAIOUI()
  {
    AppMethodBeat.i(125373);
    this.grJ = null;
    this.fHE = null;
    this.countryCode = null;
    this.gBE = null;
    this.gDT = true;
    this.gFK = null;
    this.gDV = null;
    this.gFM = false;
    this.gDr = 0;
    this.gFW = true;
    this.gBm = new ba();
    this.gAY = new RegByMobileRegAIOUI.1(this);
    this.gFX = null;
    this.gFY = false;
    this.gDd = 128;
    AppMethodBeat.o(125373);
  }

  private boolean a(Editable[] paramArrayOfEditable)
  {
    boolean bool = true;
    AppMethodBeat.i(125390);
    int i = 0;
    if (i < 3)
    {
      Editable localEditable = paramArrayOfEditable[i];
      if ((localEditable != null) && (localEditable.toString().length() != 0));
    }
    for (i = 0; ; i = 1)
    {
      if ((i != 0) && (this.gDT))
        AppMethodBeat.o(125390);
      while (true)
      {
        return bool;
        i++;
        break;
        AppMethodBeat.o(125390);
        bool = false;
      }
    }
  }

  private void aoZ()
  {
    AppMethodBeat.i(125380);
    com.tencent.mm.plugin.b.a.wA(this.gsF);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",RE200_100,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("RE200_100") + ",2");
    finish();
    overridePendingTransition(2131034130, 2131034130);
    AppMethodBeat.o(125380);
  }

  private void apc()
  {
    AppMethodBeat.i(125377);
    if ((!bo.isNullOrNil(this.fHE)) && (!bo.isNullOrNil(this.countryCode)))
      AppMethodBeat.o(125377);
    while (true)
    {
      return;
      this.gBE = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      ab.i("MicroMsg.RegByMobileRegAIOUI", "tm.getSimCountryIso()" + this.gBE);
      if (bo.isNullOrNil(this.gBE))
      {
        ab.e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
        AppMethodBeat.o(125377);
      }
      else
      {
        b.a locala = com.tencent.mm.au.b.k(this, this.gBE, getString(2131298789));
        if (locala == null)
        {
          ab.e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
          AppMethodBeat.o(125377);
        }
        else
        {
          this.fHE = locala.fHE;
          this.countryCode = locala.fHD;
          AppMethodBeat.o(125377);
        }
      }
    }
  }

  private void arf()
  {
    AppMethodBeat.i(125383);
    if ((!bo.isNullOrNil(this.fHE)) && (!bo.isNullOrNil(this.countryCode)))
    {
      this.grH.setText(av.hS(this.fHE, this.countryCode));
      AppMethodBeat.o(125383);
    }
    while (true)
    {
      return;
      this.grH.setText(getString(2131301449));
      AppMethodBeat.o(125383);
    }
  }

  private void aro()
  {
    AppMethodBeat.i(125381);
    if (!bo.isNullOrNil(this.gFS))
    {
      if (this.guc != null)
        this.guc.dismiss();
      getString(2131297061);
      this.guc = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, null);
      com.tencent.mm.plugin.account.model.g localg = new com.tencent.mm.plugin.account.model.g(this.gFS);
      com.tencent.mm.kernel.g.Rg().a(localg, 0);
    }
    AppMethodBeat.o(125381);
  }

  private void arp()
  {
    AppMethodBeat.i(125386);
    getString(2131297061);
    this.guc = com.tencent.mm.ui.base.h.b(this, getString(2131302257), true, new RegByMobileRegAIOUI.17(this));
    com.tencent.mm.modelfriend.a locala = new com.tencent.mm.modelfriend.a(this.gFK + this.gDV, 14, "", 0, "");
    locala.rV(this.gDy);
    com.tencent.mm.kernel.g.Rg().a(locala, 0);
    AppMethodBeat.o(125386);
  }

  private void arq()
  {
    try
    {
      AppMethodBeat.i(125388);
      if (!this.gFY)
      {
        this.gFY = true;
        finish();
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localIntent.putExtra("bindmcontact_mobile", this.gFK + " " + this.gFH.getText().toString());
        localIntent.putExtra("bindmcontact_shortmobile", this.gDV);
        localIntent.putExtra("country_name", this.fHE);
        localIntent.putExtra("couttry_code", this.countryCode);
        localIntent.putExtra("mobileverify_countdownsec", this.gFZ);
        localIntent.putExtra("mobileverify_countdownstyle", this.gGa);
        localIntent.putExtra("mobileverify_fb", this.gGb);
        localIntent.putExtra("mobileverify_reg_qq", this.gGc);
        localIntent.putExtra("kintent_nickname", this.gFO.getText().toString());
        localIntent.putExtra("kintent_password", this.gFL.getText().toString());
        localIntent.putExtra("kintent_hasavatar", this.gFM);
        localIntent.putExtra("key_reg_style", 1);
        localIntent.putExtra("regsession_id", this.gDy);
        localIntent.putExtra("reg_3d_app_ticket", this.gFT);
        localIntent.putExtra("reg_3d_app_type", this.gEu);
        localIntent.putExtra("mobile_verify_purpose", 2);
        a(MobileVerifyUI.class, localIntent);
      }
      AppMethodBeat.o(125388);
      return;
    }
    finally
    {
    }
  }

  private boolean arr()
  {
    AppMethodBeat.i(125389);
    if (bo.isNullOrNil(this.countryCode));
    for (int i = 0; ; i = 1)
    {
      boolean bool = i & a(new Editable[] { this.gFH.getText(), this.gFL.getText(), this.gFO.getText() });
      if (bool)
        this.gDN.setEnabled(true);
      while (true)
      {
        AppMethodBeat.o(125389);
        return bool;
        this.gDN.setEnabled(false);
      }
    }
  }

  private void wv(String paramString)
  {
    AppMethodBeat.i(125382);
    if (!com.tencent.mm.plugin.account.a.b.a.O(this, this.gFL.getText().toString()))
      AppMethodBeat.o(125382);
    while (true)
    {
      return;
      if (this.guc != null)
        this.guc.dismiss();
      getString(2131297061);
      this.guc = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, null);
      Object localObject1 = av.amN(this.gFH.getText().toString().trim());
      int i;
      label124: Object localObject2;
      if ((this.gDp != null) && (this.gDq != null) && (!((String)localObject1).equals(this.gDp)) && (((String)localObject1).equals(this.gDq)))
      {
        i = 1;
        localObject1 = new com.tencent.mm.modelfriend.a(paramString, 12, "", 0, "");
        ((com.tencent.mm.modelfriend.a)localObject1).lo(this.gDr);
        ((com.tencent.mm.modelfriend.a)localObject1).lp(i);
        if (!bo.isNullOrNil(this.gFT))
        {
          localObject2 = this.gFT;
          ((n.a)((com.tencent.mm.modelfriend.a)localObject1).ftU.acF()).vyq.vLG = ((String)localObject2);
        }
        if (com.tencent.mm.plugin.normsg.a.b.oTO.TL("ie_reg"))
          com.tencent.mm.plugin.normsg.a.b.oTO.TK("ie_reg");
        localObject2 = new bqw();
        ((bqw)localObject2).jCH = this.gFO.getText().toString();
        if ((this.gFM) && (this.gFP != null) && (!this.gFP.isRecycled()))
          ((bqw)localObject2).wGk = ag.w(com.tencent.mm.sdk.platformtools.d.ai(this.gFP));
        ((bqw)localObject2).wTk = paramString;
        ((bqw)localObject2).wTj = ag.ck(this.gFL.getText().toString());
        ((bqw)localObject2).luP = bo.dpA();
        ((bqw)localObject2).wTl = TimeZone.getDefault().getID();
        ab.i("MicroMsg.RegByMobileRegAIOUI", "%s,%s", new Object[] { ((bqw)localObject2).luP, ((bqw)localObject2).wTl });
        paramString = new crs();
        paramString.xpk = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.TM("ie_reg"));
        paramString.xpl = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.TP("ce_reg"));
        paramString.xpm = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.Am(6));
      }
      try
      {
        SKBuiltinBuffer_t localSKBuiltinBuffer_t = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
        localSKBuiltinBuffer_t.<init>();
        paramString.xpn = localSKBuiltinBuffer_t.setBuffer(((bqw)localObject2).toByteArray());
        ((com.tencent.mm.modelfriend.a)localObject1).a(paramString);
        com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
        this.gDp = av.amN(this.gFH.getText().toString().trim());
        this.gDr += 1;
        AppMethodBeat.o(125382);
        continue;
        if ((this.gDp != null) && (this.gDq != null) && (!this.gDq.equals(this.gDp)) && (!((String)localObject1).equals(this.gDq)))
        {
          i = 2;
          break label124;
        }
        i = 0;
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.RegByMobileRegAIOUI", localIOException, "convert to byte error ! %s", new Object[] { localIOException.getMessage() });
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970496;
  }

  public final void initView()
  {
    AppMethodBeat.i(125378);
    this.grF = ((LinearLayout)findViewById(2131821726));
    this.grH = ((TextView)findViewById(2131821728));
    this.gFI = ((TextView)findViewById(2131826924));
    this.gFJ = ((MMFormInputView)findViewById(2131826930));
    this.gFJ.setInputType(3);
    this.gFH = this.gFJ.getContentEditText();
    this.gDL = ((TextView)findViewById(2131826124));
    this.gDN = ((Button)findViewById(2131826932));
    this.ejo = ((ImageView)findViewById(2131826928));
    this.gFN = ((ImageView)findViewById(2131826929));
    this.gFL = ((MMFormInputView)findViewById(2131826931));
    com.tencent.mm.ui.tools.b.c.d(this.gFL.getContentEditText()).PM(16).a(null);
    this.gFQ = ((ScrollView)findViewById(2131820921));
    this.gCa = ((ResizeLayout)findViewById(2131825288));
    this.gFO = ((MMFormInputView)findViewById(2131826926));
    this.gCa.setOnSizeChanged(new RegByMobileRegAIOUI.12(this));
    Object localObject = getString(2131300942);
    String str1;
    String str2;
    String str3;
    Spannable localSpannable;
    if (aa.doo())
    {
      str1 = getString(2131300943);
      str2 = getString(2131302021);
      str3 = getString(2131296519);
      localSpannable = Spannable.Factory.getInstance().newSpannable((String)localObject + "  " + str1 + str3 + str2);
      localSpannable.setSpan(new RegByMobileRegAIOUI.19(this), ((String)localObject).length() + "  ".length(), ((String)localObject).length() + str1.length() + "  ".length(), 33);
      localSpannable.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(125362);
          bo.M(RegByMobileRegAIOUI.this.mController.ylL, RegByMobileRegAIOUI.this.getString(2131305909, new Object[] { aa.dor(), aa.doq(), "setting", Integer.valueOf(0), Integer.valueOf(0) }));
          AppMethodBeat.o(125362);
        }

        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          AppMethodBeat.i(125363);
          paramAnonymousTextPaint.setColor(RegByMobileRegAIOUI.this.getResources().getColor(2131690208));
          paramAnonymousTextPaint.setUnderlineText(true);
          AppMethodBeat.o(125363);
        }
      }
      , ((String)localObject).length() + "  ".length() + str1.length() + str3.length(), ((String)localObject).length() + "  ".length() + str1.length() + str3.length() + str2.length(), 33);
      this.gDL.setText(localSpannable);
      this.gDL.setMovementMethod(LinkMovementMethod.getInstance());
      localObject = new boolean[1];
      localObject[0] = 1;
      this.gFH.addTextChangedListener(new RegByMobileRegAIOUI.23(this, (boolean[])localObject));
      this.gFH.setOnFocusChangeListener(new RegByMobileRegAIOUI.24(this, (boolean[])localObject));
      this.gFL.addTextChangedListener(new RegByMobileRegAIOUI.25(this));
      this.gFO.addTextChangedListener(new RegByMobileRegAIOUI.2(this));
      localObject = new boolean[1];
      localObject[0] = 0;
      this.gDN.setOnTouchListener(new RegByMobileRegAIOUI.3(this, (boolean[])localObject));
      this.gDN.setOnClickListener(new RegByMobileRegAIOUI.4(this, (boolean[])localObject));
      this.gDN.setEnabled(false);
      if (!bo.isNullOrNil(this.countryCode))
        break label1008;
      this.fHE = getString(2131298791);
      this.countryCode = av.amO(getString(2131298790));
      label589: if (!bo.isNullOrNil(this.gFR))
        this.gFI.setText(this.gFR);
      apc();
      arf();
      if ((this.grJ == null) || (this.grJ.equals("")))
        break label1030;
      this.gFH.setText(this.grJ);
      label649: this.grF.setOnClickListener(new RegByMobileRegAIOUI.6(this));
      setBackBtn(new RegByMobileRegAIOUI.7(this), 2131230735);
      this.ejo.setOnClickListener(new RegByMobileRegAIOUI.8(this));
      if (!bo.isNullOrNil(this.gFS))
        break label1048;
      com.tencent.mm.kernel.g.RS().a(new RegByMobileRegAIOUI.9(this));
    }
    while (true)
    {
      localObject = "";
      if (com.tencent.mm.protocal.d.vxr)
        localObject = getString(2131296982) + getString(2131296513);
      setMMTitle((String)localObject);
      xE(getResources().getColor(2131690310));
      dyb();
      if (com.tencent.mm.compatible.util.d.iW(23))
      {
        getWindow().setStatusBarColor(getResources().getColor(2131690304));
        dxW();
      }
      AppMethodBeat.o(125378);
      return;
      str3 = getString(2131300947);
      str1 = getString(2131300945);
      str2 = getString(2131296519);
      localSpannable = Spannable.Factory.getInstance().newSpannable((String)localObject + "  " + str3 + str2 + str1);
      localSpannable.setSpan(new RegByMobileRegAIOUI.21(this), ((String)localObject).length() + "  ".length(), ((String)localObject).length() + "  ".length() + str3.length(), 33);
      localSpannable.setSpan(new RegByMobileRegAIOUI.22(this), ((String)localObject).length() + str3.length() + "  ".length() + str2.length(), ((String)localObject).length() + str3.length() + "  ".length() + str2.length() + str1.length(), 33);
      this.gDL.setText(localSpannable);
      break;
      label1008: this.fHE = com.tencent.mm.au.b.l(this, this.countryCode, getString(2131298789));
      break label589;
      label1030: com.tencent.mm.kernel.g.RS().a(new RegByMobileRegAIOUI.5(this));
      break label649;
      label1048: this.gFO.setText(this.gFU);
      com.tencent.mm.kernel.g.RS().a(new RegByMobileRegAIOUI.10(this));
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(125384);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 30846)
    {
      if ((paramInt2 != -1) || (!arr()))
        break label264;
      arp();
      com.tencent.mm.plugin.b.a.wA("RE200_250");
      AppMethodBeat.o(125384);
    }
    while (true)
    {
      return;
      if (paramInt1 == 30847)
      {
        Bundle localBundle = null;
        if (paramIntent != null)
          localBundle = paramIntent.getBundleExtra("result_data");
        if ((localBundle != null) && (localBundle.getString("go_next", "").equals("agree_privacy")))
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(712L, 2L, 1L, false);
          this.gFW = false;
          if (!bo.isNullOrNil(this.gFS))
          {
            aro();
            AppMethodBeat.o(125384);
          }
          else
          {
            wv(this.gFK + this.gDV);
            AppMethodBeat.o(125384);
          }
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(712L, 1L, 1L, false);
          AppMethodBeat.o(125384);
        }
      }
      else
      {
        switch (paramInt2)
        {
        default:
          this.gFP = com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramIntent);
          if (this.gFP != null)
          {
            this.ejo.setImageBitmap(this.gFP);
            this.gFM = true;
            this.gFN.setVisibility(8);
          }
          AppMethodBeat.o(125384);
          break;
        case 100:
          label264: this.fHE = bo.bc(paramIntent.getStringExtra("country_name"), "");
          this.countryCode = bo.bc(paramIntent.getStringExtra("couttry_code"), "");
          this.gBE = bo.bc(paramIntent.getStringExtra("iso_code"), "");
          if (com.tencent.mm.au.b.sP(this.countryCode))
          {
            if ((!bo.isNullOrNil(this.gFS)) && (!bo.isNullOrNil(this.gFU)) && (!bo.isNullOrNil(this.gFV)))
            {
              arf();
              AppMethodBeat.o(125384);
            }
            else
            {
              paramIntent = new Intent(this, MobileInputUI.class);
              paramIntent.putExtra("mobile_input_purpose", 2);
              paramIntent.putExtra("couttry_code", this.countryCode);
              paramIntent.putExtra("country_name", this.fHE);
              startActivity(paramIntent);
              finish();
              overridePendingTransition(2131034130, 2131034130);
              AppMethodBeat.o(125384);
            }
          }
          else
          {
            arf();
            AppMethodBeat.o(125384);
          }
          break;
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125374);
    super.onCreate(paramBundle);
    this.fHE = bo.bc(getIntent().getStringExtra("country_name"), "");
    this.countryCode = av.amO(bo.bc(getIntent().getStringExtra("couttry_code"), ""));
    this.gBE = bo.nullAsNil(getIntent().getStringExtra("iso_code"));
    this.grJ = bo.bc(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    this.gFR = getIntent().getStringExtra("register_title");
    this.gFU = getIntent().getStringExtra("register_nick_name");
    this.gFV = getIntent().getStringExtra("register_avatar");
    this.gFS = getIntent().getStringExtra("third_app_token");
    this.gEu = getIntent().getIntExtra("reg_3d_app_type", 0);
    initView();
    AppMethodBeat.o(125374);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125387);
    com.tencent.mm.plugin.normsg.a.b.oTO.TK("ie_reg");
    if (this.gFX != null)
      this.gFX.dismiss();
    this.gBm.ajK();
    super.onDestroy();
    AppMethodBeat.o(125387);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125379);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(125379);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125379);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(125376);
    super.onPause();
    if (this.guc != null)
      this.guc.dismiss();
    com.tencent.mm.sdk.b.a.xxA.d(this.gAY);
    com.tencent.mm.kernel.g.Rg().b(701, this);
    com.tencent.mm.kernel.g.Rg().b(252, this);
    com.tencent.mm.kernel.g.Rg().b(145, this);
    com.tencent.mm.kernel.g.Rg().b(132, this);
    com.tencent.mm.kernel.g.Rg().b(755, this);
    com.tencent.mm.kernel.g.Rg().b(252, this);
    com.tencent.mm.kernel.g.Rg().b(701, this);
    com.tencent.mm.plugin.b.a.wz("RE200_100");
    AppMethodBeat.o(125376);
  }

  public void onResume()
  {
    AppMethodBeat.i(125375);
    com.tencent.mm.sdk.b.a.xxA.c(this.gAY);
    super.onResume();
    com.tencent.mm.kernel.g.Rg().a(701, this);
    com.tencent.mm.kernel.g.Rg().a(252, this);
    com.tencent.mm.kernel.g.Rg().a(145, this);
    com.tencent.mm.kernel.g.Rg().a(132, this);
    com.tencent.mm.kernel.g.Rg().a(755, this);
    com.tencent.mm.kernel.g.Rg().a(252, this);
    com.tencent.mm.kernel.g.Rg().a(701, this);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",RE200_100,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("RE200_100") + ",1");
    this.gDr = 0;
    AppMethodBeat.o(125375);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125385);
    ab.i("MicroMsg.RegByMobileRegAIOUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.guc != null)
    {
      this.guc.dismiss();
      this.guc = null;
    }
    if (paramInt2 == -75)
    {
      com.tencent.mm.ui.base.h.g(this, 2131296516, 2131302222);
      AppMethodBeat.o(125385);
    }
    while (true)
    {
      return;
      if (paramm.getType() != 145)
        break;
      int i = ((com.tencent.mm.modelfriend.a)paramm).Ah();
      if (i == 12)
      {
        if ((paramInt2 == -41) || (paramInt2 == -59))
        {
          paramString = com.tencent.mm.h.a.jY(paramString);
          if (paramString != null)
          {
            paramString.a(this, null, null);
            AppMethodBeat.o(125385);
          }
          else
          {
            com.tencent.mm.ui.base.h.g(this, 2131302269, 2131302270);
            AppMethodBeat.o(125385);
          }
        }
        else
        {
          this.gDV = av.amN(this.gDV);
          this.gDq = (this.gFK + this.gDV);
          this.gDy = ((com.tencent.mm.modelfriend.a)paramm).agt();
          if ((paramInt2 == -36) || (paramInt2 == -35) || (paramInt2 == -3))
          {
            paramm = ((com.tencent.mm.modelfriend.a)paramm).agi();
            if (!bo.isNullOrNil(paramm))
              this.gDV = paramm.trim();
            com.tencent.mm.plugin.b.a.wz("RE200_100");
            paramm = new StringBuilder();
            com.tencent.mm.kernel.g.RN();
            paramm = paramm.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",RE200_200,");
            com.tencent.mm.kernel.g.RN();
            com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("RE200_200") + ",1");
            paramString = com.tencent.mm.h.a.jY(paramString);
            if (paramString != null)
            {
              paramString.a(this, new RegByMobileRegAIOUI.11(this), new RegByMobileRegAIOUI.13(this));
              AppMethodBeat.o(125385);
            }
            else
            {
              arp();
              com.tencent.mm.plugin.b.a.wA("RE200_250");
              AppMethodBeat.o(125385);
            }
          }
          else if (paramInt2 == -355)
          {
            z.f(this, paramString, 30846);
            this.gBm.daR = this.gEu;
            this.gBm.cVS = 5L;
            this.gBm.ajK();
            AppMethodBeat.o(125385);
          }
          else if (paramInt2 == -34)
          {
            com.tencent.mm.ui.base.h.b(this, getString(2131297538), "", true);
            AppMethodBeat.o(125385);
          }
          else if (com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString))
          {
            AppMethodBeat.o(125385);
          }
          else
          {
            Toast.makeText(this, getString(2131297582, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          }
        }
      }
      else
      {
        if (i == 14)
        {
          if ((paramInt2 != 0) && (paramString != null))
            break label856;
          if (((com.tencent.mm.modelfriend.a)paramm).agj() != 1)
            break label801;
          String str1 = this.gFK + this.gDV;
          String str2 = ((com.tencent.mm.modelfriend.a)paramm).agl();
          String str3 = ((com.tencent.mm.modelfriend.a)paramm).agk();
          localObject = new Intent(this, RegByMobileSendSmsUI.class);
          ((Intent)localObject).putExtra("regsession_id", this.gDy);
          ((Intent)localObject).putExtra("key_reg_style", 1);
          ((Intent)localObject).putExtra("from_mobile", str1);
          ((Intent)localObject).putExtra("to_mobile", str2);
          ((Intent)localObject).putExtra("verify_code", str3);
          ((Intent)localObject).putExtra("kintent_nickname", this.gFO.getText().toString());
          ((Intent)localObject).putExtra("kintent_password", this.gFL.getText().toString());
          ((Intent)localObject).putExtra("kintent_hasavatar", this.gFM);
          ((Intent)localObject).putExtra("reg_3d_app_type", this.gEu);
          ((Intent)localObject).putExtra("reg_3d_app_ticket", this.gFT);
          startActivity((Intent)localObject);
        }
        while (true)
        {
          label777: if (!com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString))
            break label1253;
          AppMethodBeat.o(125385);
          break;
          label801: this.gFZ = ((com.tencent.mm.modelfriend.a)paramm).agn();
          this.gGa = ((com.tencent.mm.modelfriend.a)paramm).ago();
          this.gGb = ((com.tencent.mm.modelfriend.a)paramm).agp();
          this.gGc = ((com.tencent.mm.modelfriend.a)paramm).agq();
          arq();
        }
        label856: if (paramInt2 == -41)
        {
          com.tencent.mm.ui.base.h.g(this, 2131302269, 2131302270);
          AppMethodBeat.o(125385);
        }
        else if (paramInt2 == -34)
        {
          com.tencent.mm.ui.base.h.b(this, getString(2131297538), "", true);
          AppMethodBeat.o(125385);
        }
        else if (com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString))
        {
          AppMethodBeat.o(125385);
        }
        else
        {
          Toast.makeText(this, getString(2131297582, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          AppMethodBeat.o(125385);
        }
      }
    }
    if (paramm.getType() == 755)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        localObject = (com.tencent.mm.plugin.account.model.g)paramm;
        if (((com.tencent.mm.plugin.account.model.g)localObject).ehh.fsH.fsP == null)
          break label1312;
      }
    label1312: for (Object localObject = ((cgx)((com.tencent.mm.plugin.account.model.g)localObject).ehh.fsH.fsP).wIg; ; localObject = "")
    {
      this.gFT = ((String)localObject);
      wv(this.gFK + this.gDV);
      break label777;
      if (paramInt2 != -7)
        break label777;
      this.gBm.daR = this.gEu;
      this.gBm.cVS = 7L;
      this.gBm.ajK();
      com.tencent.mm.ui.base.h.a(this, getString(2131299550), getString(2131297061), getString(2131300419), getString(2131296868), true, new RegByMobileRegAIOUI.14(this), null);
      break label777;
      if (((paramm.getType() != 701) && (paramm.getType() != 252)) || (paramInt1 != 0) || (paramInt2 != 0))
        break label777;
      this.gBm.daR = this.gEu;
      this.gBm.cVS = 12L;
      this.gBm.ajK();
      l.apX();
      z.vx(r.Yz());
      w.cm(this);
      z.showAddrBookUploadConfirm(this, new RegByMobileRegAIOUI.15(this), false, 2);
      AppMethodBeat.o(125385);
      break;
      label1253: if ((paramm.getType() == 252) || (paramm.getType() == 701))
      {
        paramString = com.tencent.mm.h.a.jY(paramString);
        if ((paramString != null) && (paramString.a(this, null, null)))
        {
          AppMethodBeat.o(125385);
          break;
        }
      }
      AppMethodBeat.o(125385);
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI
 * JD-Core Version:    0.6.2
 */