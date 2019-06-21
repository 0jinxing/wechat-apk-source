package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.platformtools.ag;
import com.tencent.mm.platformtools.c;
import com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI;
import com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI;
import com.tencent.mm.plugin.account.friend.a.ad;
import com.tencent.mm.plugin.account.friend.a.t.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.aor;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.vfs.b;
import java.util.LinkedList;
import java.util.Map;

public class RegSetInfoUI extends MMActivity
  implements f
{
  private String bCu;
  private ProgressDialog ehJ;
  private String elr;
  private ba gBm;
  private c gCd;
  private String gDy;
  private int gEm;
  private int gEs;
  private int gEu;
  private boolean gFM;
  private String gFm;
  private EditText gGu;
  private ProgressBar gHA;
  private String gHB;
  private ImageView gHC;
  private View gHD;
  private TextView gHE;
  private String gHF;
  private boolean gHG;
  private o gHH;
  private View gHI;
  private boolean gHJ;
  private String gHK;
  private ap gHL;
  private EditText gHm;
  private Button gHn;
  private String gHo;
  private String gHp;
  private int gHq;
  private String gHr;
  private String gHs;
  private TextView gHt;
  private View gHu;
  private boolean gHv;
  private ImageView gHw;
  private int gHx;
  private LinkedList<String> gHy;
  private ImageView gHz;
  private SecurityImage gue;
  private int sceneType;

  public RegSetInfoUI()
  {
    AppMethodBeat.i(125540);
    this.ehJ = null;
    this.sceneType = 0;
    this.gue = null;
    this.gHv = false;
    this.gFM = false;
    this.gHx = 3;
    this.gHy = new LinkedList();
    this.gHB = "";
    this.gHF = null;
    this.gHG = false;
    this.gHJ = false;
    this.gBm = new ba();
    this.gHL = new ap(Looper.myLooper(), new RegSetInfoUI.1(this), true);
    AppMethodBeat.o(125540);
  }

  private void aoZ()
  {
    AppMethodBeat.i(125555);
    aqX();
    if (arC())
    {
      h.a(this, getString(2131302338), "", new RegSetInfoUI.21(this), new RegSetInfoUI.22(this));
      AppMethodBeat.o(125555);
    }
    while (true)
    {
      return;
      if (!arD())
      {
        if (arE())
        {
          h.a(this, getString(2131302337), "", new RegSetInfoUI.24(this), new RegSetInfoUI.25(this));
          AppMethodBeat.o(125555);
        }
        else if (arG())
        {
          h.a(this, getString(2131302337), "", new RegSetInfoUI.26(this), new RegSetInfoUI.27(this));
          AppMethodBeat.o(125555);
        }
        else
        {
          com.tencent.mm.plugin.b.a.wA("R200_100");
          Intent localIntent = new Intent(this, MobileInputUI.class);
          localIntent.putExtra("mobile_input_purpose", 2);
          localIntent.addFlags(67108864);
          startActivity(localIntent);
          finish();
        }
      }
      else
        AppMethodBeat.o(125555);
    }
  }

  private boolean arA()
  {
    if ((this.gHx & 0x1) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean arB()
  {
    if ((this.gHx & 0x2) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean arC()
  {
    boolean bool = true;
    if (this.sceneType == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private boolean arD()
  {
    if (this.sceneType == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean arE()
  {
    if (this.sceneType == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean arF()
  {
    if (this.sceneType == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean arG()
  {
    if (this.sceneType == 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private int arH()
  {
    int i = 2;
    AppMethodBeat.i(125550);
    if (arC())
    {
      i = 4;
      AppMethodBeat.o(125550);
    }
    while (true)
    {
      return i;
      if (arD())
      {
        AppMethodBeat.o(125550);
      }
      else if (arG())
      {
        i = 6;
        AppMethodBeat.o(125550);
      }
      else if (arF())
      {
        i = 1;
        AppMethodBeat.o(125550);
      }
      else
      {
        AppMethodBeat.o(125550);
      }
    }
  }

  private String arI()
  {
    AppMethodBeat.i(125551);
    String str;
    if ((arC()) || (arF()))
    {
      str = this.gHo;
      AppMethodBeat.o(125551);
    }
    while (true)
    {
      return str;
      if (arG())
      {
        str = this.gHp;
        AppMethodBeat.o(125551);
      }
      else
      {
        str = this.gHs;
        AppMethodBeat.o(125551);
      }
    }
  }

  private void arx()
  {
    AppMethodBeat.i(125545);
    int i = arH();
    g.Rg().a(126, this);
    int j;
    s locals;
    if (arB())
      if ((this.gHy == null) || (this.gHy.size() == 0))
      {
        j = 0;
        locals = new s("", this.gHr, this.bCu, this.gHq, this.gHp, this.gHo, "", "", this.elr, i, this.gHK, "", "", this.gHv, this.gFM);
        ((v.a)locals.ftU.acF()).vyI.wHX = j;
      }
    while (true)
    {
      locals.ts(this.gDy);
      locals.tt(this.gFm);
      locals.lX(this.gEm);
      g.Rg().a(locals, 0);
      getString(2131297061);
      this.ehJ = h.b(this, getString(2131302326), true, new RegSetInfoUI.7(this, locals));
      AppMethodBeat.o(125545);
      return;
      if (this.gHy.contains(this.gHK))
      {
        j = 1;
        break;
      }
      j = 2;
      break;
      locals = new s("", this.gHr, this.bCu, this.gHq, this.gHp, this.gHo, "", "", this.elr, i, "", "", "", this.gHv, this.gFM);
    }
  }

  private boolean ary()
  {
    AppMethodBeat.i(125547);
    boolean bool;
    if ((this.gHz.getVisibility() == 8) || (this.gHG))
    {
      bool = true;
      AppMethodBeat.o(125547);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125547);
    }
  }

  private void arz()
  {
    AppMethodBeat.i(125548);
    String str = this.gGu.getText().toString().trim();
    Button localButton = this.gHn;
    if (!bo.isNullOrNil(str));
    for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      AppMethodBeat.o(125548);
      return;
    }
  }

  private boolean j(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(125553);
    Object localObject = new ag(paramInt1, paramInt2, paramString);
    boolean bool;
    if (this.gCd.a(this, (ag)localObject))
    {
      AppMethodBeat.o(125553);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (com.tencent.mm.plugin.account.a.a.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(125553);
        bool = true;
      }
      else
      {
        switch (paramInt2)
        {
        default:
          bool = false;
          AppMethodBeat.o(125553);
          break;
        case -10:
        case -7:
          h.g(this, 2131302221, 2131302222);
          AppMethodBeat.o(125553);
          bool = true;
          break;
        case -75:
          h.g(this, 2131296516, 2131302222);
          AppMethodBeat.o(125553);
          bool = true;
        case -100:
        case -48:
        }
      }
    }
    com.tencent.mm.kernel.a.hold();
    localObject = this.mController.ylL;
    g.RN();
    if (TextUtils.isEmpty(com.tencent.mm.kernel.a.QH()));
    for (paramString = com.tencent.mm.bz.a.an(this.mController.ylL, 2131301294); ; paramString = com.tencent.mm.kernel.a.QH())
    {
      h.a((Context)localObject, paramString, this.mController.ylL.getString(2131297061), new RegSetInfoUI.19(this), new RegSetInfoUI.20(this));
      AppMethodBeat.o(125553);
      bool = true;
      break;
      g.RN();
    }
    paramString = com.tencent.mm.h.a.jY(paramString);
    if (paramString != null)
      paramString.a(this, null, null);
    while (true)
    {
      AppMethodBeat.o(125553);
      bool = true;
      break;
      h.b(this, getString(2131302344), "", true);
    }
  }

  private void o(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(125546);
    if (bo.isNullOrNil(this.gHm.getText().toString().trim()))
      paramBoolean1 = false;
    ImageView localImageView = this.gHz;
    if (paramBoolean2)
    {
      i = 2130840227;
      localImageView.setImageResource(i);
      localImageView = this.gHz;
      if (!paramBoolean1)
        break label109;
    }
    label109: for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      boolean bool2 = bool1;
      if (paramBoolean1)
      {
        bool2 = bool1;
        if (paramBoolean2)
          bool2 = true;
      }
      this.gHG = bool2;
      AppMethodBeat.o(125546);
      return;
      i = 2130840224;
      break;
    }
  }

  public final int getLayoutId()
  {
    return 2130970501;
  }

  public final void initView()
  {
    int i = 0;
    AppMethodBeat.i(125544);
    this.gHI = findViewById(2131826957);
    this.gHD = findViewById(2131826927);
    this.gHw = ((ImageView)findViewById(2131826928));
    this.gGu = ((EditText)findViewById(2131826956));
    this.gHE = ((TextView)findViewById(2131826955));
    this.gHm = ((EditText)findViewById(2131826959));
    this.gHt = ((TextView)findViewById(2131826961));
    this.gHu = findViewById(2131826958);
    this.gHz = ((ImageView)findViewById(2131826960));
    this.gHA = ((ProgressBar)findViewById(2131826908));
    this.gHC = ((ImageView)findViewById(2131826929));
    this.gHn = ((Button)findViewById(2131822846));
    this.gHz.setVisibility(8);
    this.gHA.setVisibility(8);
    this.gHC.setVisibility(8);
    this.gFM = false;
    this.gHG = false;
    Object localObject = this.gHD;
    int j;
    if (arA())
    {
      j = 0;
      ((View)localObject).setVisibility(j);
      localObject = this.gHu;
      if (!arB())
        break label491;
      j = 0;
      label237: ((View)localObject).setVisibility(j);
      localObject = this.gHt;
      if (!arB())
        break label497;
      j = i;
      label256: ((TextView)localObject).setVisibility(j);
      if ((!arA()) || (!arB()))
        break label503;
      this.gHE.setText(getString(2131302343));
    }
    while (true)
    {
      g.RS().a(new RegSetInfoUI.23(this));
      this.gGu.addTextChangedListener(new RegSetInfoUI.28(this));
      this.gHn.setOnClickListener(new RegSetInfoUI.29(this));
      this.gHm.setOnFocusChangeListener(new RegSetInfoUI.30(this));
      this.gHm.addTextChangedListener(new RegSetInfoUI.31(this));
      setBackBtn(new RegSetInfoUI.32(this));
      this.gGu.setOnEditorActionListener(new RegSetInfoUI.33(this));
      this.gGu.setOnKeyListener(new RegSetInfoUI.2(this));
      this.gHm.setOnEditorActionListener(new RegSetInfoUI.3(this));
      this.gHm.setOnKeyListener(new RegSetInfoUI.4(this));
      this.gHw.setOnClickListener(new RegSetInfoUI.5(this));
      localObject = new b(com.tencent.mm.compatible.util.e.euY);
      if (!((b)localObject).exists())
        ((b)localObject).mkdirs();
      arz();
      AppMethodBeat.o(125544);
      return;
      j = 8;
      break;
      label491: j = 8;
      break label237;
      label497: j = 8;
      break label256;
      label503: if ((arA()) && (!arB()))
        this.gHE.setText(getString(2131302341));
      else if ((!arA()) && (arB()))
        this.gHE.setText(getString(2131302342));
      else
        this.gHE.setText(getString(2131302340));
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(125549);
    ab.i("MiroMsg.RegSetInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramIntent != null) && (paramInt1 == 300))
    {
      paramIntent = paramIntent.getBundleExtra("result_data");
      if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("birthdayComfirmOK")))
        arx();
      AppMethodBeat.o(125549);
    }
    while (true)
    {
      return;
      paramIntent = com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramIntent);
      if (paramIntent != null)
      {
        this.gHw.setImageBitmap(paramIntent);
        this.gFM = true;
        this.gHC.setVisibility(0);
      }
      AppMethodBeat.o(125549);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125541);
    super.onCreate(paramBundle);
    paramBundle = getString(2131302346);
    if (com.tencent.mm.protocal.d.vxr)
      paramBundle = getString(2131296982) + getString(2131296513);
    setMMTitle(paramBundle);
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    this.gHo = getIntent().getStringExtra("regsetinfo_user");
    this.gHp = getIntent().getStringExtra("regsetinfo_bind_email");
    this.elr = getIntent().getStringExtra("regsetinfo_ticket");
    this.gHr = getIntent().getStringExtra("regsetinfo_pwd");
    this.gHs = getIntent().getStringExtra("regsetinfo_binduin");
    this.gEm = getIntent().getIntExtra("mobile_check_type", 0);
    if (!bo.isNullOrNil(this.gHs))
      this.gHq = com.tencent.mm.a.p.cB(this.gHs);
    this.sceneType = getIntent().getExtras().getInt("regsetinfo_ismobile", 0);
    this.gHv = getIntent().getExtras().getBoolean("regsetinfo_isForce", false);
    this.gHx = getIntent().getIntExtra("regsetinfo_NextControl", 3);
    this.gDy = getIntent().getStringExtra("regsession_id");
    this.gFm = getIntent().getStringExtra("reg_3d_app_ticket");
    this.gEu = getIntent().getIntExtra("reg_3d_app_type", 0);
    this.gEs = getIntent().getIntExtra("key_reg_style", 1);
    initView();
    if (this.sceneType == 1)
    {
      paramBundle = new StringBuilder();
      g.RN();
      paramBundle = paramBundle.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_900_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R200_900_phone") + ",1");
      com.tencent.mm.plugin.b.a.wz("R200_900_phone");
    }
    while (true)
    {
      this.gHJ = false;
      this.gCd = new c();
      AppMethodBeat.o(125541);
      return;
      if (this.sceneType == 2)
      {
        paramBundle = new StringBuilder();
        g.RN();
        paramBundle = paramBundle.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R4_QQ,");
        g.RN();
        com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R4_QQ") + ",1");
        com.tencent.mm.plugin.b.a.wz("R4_QQ");
      }
      else if (this.sceneType == 3)
      {
        paramBundle = new StringBuilder();
        g.RN();
        paramBundle = paramBundle.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_900_email,");
        g.RN();
        com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R200_900_email") + ",1");
        com.tencent.mm.plugin.b.a.wz("R200_900_email");
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125543);
    super.onDestroy();
    StringBuilder localStringBuilder;
    if (this.sceneType == 1)
    {
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_900_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R200_900_phone") + ",2");
    }
    while (true)
    {
      if (this.gCd != null)
        this.gCd.close();
      AppMethodBeat.o(125543);
      return;
      if (this.sceneType == 2)
      {
        localStringBuilder = new StringBuilder();
        g.RN();
        localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R4_QQ,");
        g.RN();
        com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R4_QQ") + ",2");
      }
      else if (this.sceneType == 3)
      {
        localStringBuilder = new StringBuilder();
        g.RN();
        localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_900_email,");
        g.RN();
        com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R200_900_email") + ",2");
      }
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125554);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(125554);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125554);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(125542);
    super.onResume();
    this.gGu.postDelayed(new RegSetInfoUI.12(this), 500L);
    AppMethodBeat.o(125542);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125552);
    ab.i("MiroMsg.RegSetInfoUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    String str1;
    String str2;
    int i;
    String str3;
    Object localObject1;
    Object localObject2;
    boolean bool1;
    boolean bool2;
    Object localObject3;
    if (paramm.getType() == 126)
    {
      g.Rg().b(126, this);
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.gBm.daR = this.gEu;
        this.gBm.cVS = 6L;
        this.gBm.ajK();
        this.gHF = null;
        str1 = arI();
        str2 = ((s)paramm).ajy();
        i = ((s)paramm).ajz();
        str3 = ((s)paramm).ajA();
        localObject1 = null;
        localObject2 = null;
        bool1 = false;
        bool2 = false;
        Map localMap = br.z(str3, "wording");
        if (localMap == null)
          break label1668;
        localObject3 = (String)localMap.get(".wording.switch");
        if (!bo.isNullOrNil((String)localObject3))
          break label567;
        bool2 = true;
        bool1 = bool2;
        if (!bool2)
          break label1668;
        localObject3 = (String)localMap.get(".wording.title");
        if (!bo.isNullOrNil((String)localObject3))
          localObject1 = localObject3;
        localObject3 = (String)localMap.get(".wording.desc");
        if (bo.isNullOrNil((String)localObject3))
          break label1665;
        localObject2 = localObject3;
      }
    }
    while (true)
    {
      ab.d("MiroMsg.RegSetInfoUI", "mShowStyleContactUploadWordings , %s", new Object[] { str3 });
      com.tencent.mm.kernel.a.unhold();
      com.tencent.mm.kernel.a.cm(true);
      if (this.gFM)
      {
        str3 = com.tencent.mm.compatible.util.e.euY + "temp.avatar";
        localObject3 = com.tencent.mm.compatible.util.e.euY + "temp.avatar.hd";
        com.tencent.mm.vfs.e.aQ(str3, (String)localObject3);
        com.tencent.mm.vfs.e.deleteFile(str3);
        com.tencent.mm.sdk.platformtools.d.c((String)localObject3, 96, 96, Bitmap.CompressFormat.JPEG, 90, str3);
        new com.tencent.mm.ah.m(this, com.tencent.mm.compatible.util.e.euY + "temp.avatar").a(new RegSetInfoUI.8(this, paramm, str1, str2, bool2, (String)localObject1, (String)localObject2, i), new RegSetInfoUI.9(this, paramm, str1, str2, bool2, (String)localObject1, (String)localObject2, i));
        label471: if ((paramInt2 != -6) && (paramInt2 != -311) && (paramInt2 != -310))
          break label938;
        if (this.gue != null)
          break label903;
        this.gue = SecurityImage.a.a(this.mController.ylL, 0, ((s)paramm).ajo(), ((s)paramm).ajn(), "", new RegSetInfoUI.10(this, paramm), null, new RegSetInfoUI.11(this), new RegSetInfoUI.13(this, paramm));
        AppMethodBeat.o(125552);
      }
      while (true)
      {
        return;
        label567: int j = bo.ank((String)localObject3);
        if (j == 0)
        {
          bool2 = false;
          break;
        }
        if (j != 1)
          break;
        bool2 = true;
        break;
        this.elr = ((s)paramm).ajw();
        av.fly.ak("login_user_name", str1);
        if ((str2 != null) && (str2.contains("0")))
        {
          com.tencent.mm.plugin.b.a.wA("R300_100_phone");
          if (!bool2);
          for (localObject1 = new Intent(this, FindMContactIntroUI.class); ; localObject1 = localObject3)
          {
            ((Intent)localObject1).addFlags(67108864);
            ((Intent)localObject1).putExtra("regsetinfo_ticket", this.elr);
            ((Intent)localObject1).putExtra("regsetinfo_NextStep", str2);
            ((Intent)localObject1).putExtra("regsetinfo_NextStyle", i);
            localObject2 = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
            ((Intent)localObject2).addFlags(67108864);
            ((Intent)localObject2).putExtra("LauncherUI.enter_from_reg", true);
            MMWizardActivity.b(this, (Intent)localObject1, (Intent)localObject2);
            finish();
            break;
            localObject3 = new Intent(this, FindMContactAlertUI.class);
            ((Intent)localObject3).putExtra("alert_title", (String)localObject1);
            ((Intent)localObject3).putExtra("alert_message", (String)localObject2);
          }
        }
        localObject1 = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
        ((Intent)localObject1).addFlags(67108864);
        ((Intent)localObject1).putExtra("LauncherUI.enter_from_reg", true);
        startActivity((Intent)localObject1);
        localObject1 = new StringBuilder();
        g.RN();
        localObject1 = ((StringBuilder)localObject1).append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_900_phone,");
        g.RN();
        com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_900_phone") + ",4");
        finish();
        break label471;
        label903: this.gue.b(0, ((s)paramm).ajo(), ((s)paramm).ajn(), "");
        AppMethodBeat.o(125552);
        continue;
        label938: localObject1 = com.tencent.mm.h.a.jY(paramString);
        if (localObject1 != null)
        {
          ((com.tencent.mm.h.a)localObject1).a(this, null, null);
          AppMethodBeat.o(125552);
        }
        else if (j(paramInt1, paramInt2, paramString))
        {
          AppMethodBeat.o(125552);
        }
        else if (paramm.getType() == 429)
        {
          g.Rg().b(429, this);
          if (this.ehJ != null)
          {
            this.ehJ.dismiss();
            this.ehJ = null;
          }
          this.gHA.setVisibility(8);
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            this.gHF = null;
            paramInt1 = ((t.b)((ad)paramm).ftU.ZS()).gvJ.wsP;
            ab.d("MiroMsg.RegSetInfoUI", "UsernameRet %d", new Object[] { Integer.valueOf(paramInt1) });
            if ((paramInt1 == -14) || (paramInt1 == -10) || (paramInt1 == -7))
            {
              paramm = ((t.b)((ad)paramm).ftU.ZS()).gvJ.jBw;
              paramString = com.tencent.mm.h.a.jY(paramString);
              if (paramString != null)
                this.gHt.setText(paramString.desc);
              this.gHy.clear();
              if ((paramm != null) && (paramm.size() > 0))
              {
                if (paramm.size() > 3);
                for (paramInt1 = 3; ; paramInt1 = paramm.size())
                {
                  paramString = new String[paramInt1];
                  for (paramInt2 = 0; paramInt2 < paramInt1; paramInt2++)
                  {
                    paramString[paramInt2] = ((bts)paramm.get(paramInt2)).wVI;
                    this.gHy.add(paramString[paramInt2]);
                  }
                }
                if (this.gHJ)
                {
                  if (this.gHH != null)
                  {
                    this.gHH.dismiss();
                    this.gHH = null;
                  }
                  this.gHH = p.a(this, this.gHI, paramString, new RegSetInfoUI.18(this, paramString));
                }
              }
              o(true, true);
              AppMethodBeat.o(125552);
            }
            else if (bo.isNullOrNil(this.gHm.getText().toString().trim()))
            {
              o(false, false);
              AppMethodBeat.o(125552);
            }
            else
            {
              o(true, false);
              this.gHt.setText(getString(2131302345));
              if (this.gHH != null)
              {
                this.gHH.dismiss();
                this.gHH = null;
              }
              this.gHm.postDelayed(new RegSetInfoUI.14(this), 50L);
              AppMethodBeat.o(125552);
            }
          }
          else if ((paramInt2 == -6) || (paramInt2 == -311) || (paramInt2 == -310))
          {
            if (this.gue == null)
            {
              this.gue = SecurityImage.a.a(this.mController.ylL, 0, ((ad)paramm).ajo(), ((ad)paramm).ajn(), "", new RegSetInfoUI.15(this, paramm), null, new RegSetInfoUI.16(this), new RegSetInfoUI.17(this, paramm));
              AppMethodBeat.o(125552);
            }
            else
            {
              this.gue.b(0, ((ad)paramm).ajo(), ((ad)paramm).ajn(), "");
              AppMethodBeat.o(125552);
            }
          }
          else
          {
            o(true, true);
          }
        }
        else if (j(paramInt1, paramInt2, paramString))
        {
          AppMethodBeat.o(125552);
        }
        else if (paramInt1 == 8)
        {
          this.gHF = getString(2131299945, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          Toast.makeText(this, this.gHF, 0).show();
          AppMethodBeat.o(125552);
        }
        else
        {
          if ((paramInt1 != 0) || (paramInt2 != 0))
            Toast.makeText(this, getString(2131299990, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          AppMethodBeat.o(125552);
        }
      }
      label1665: continue;
      label1668: localObject1 = null;
      bool2 = bool1;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI
 * JD-Core Version:    0.6.2
 */