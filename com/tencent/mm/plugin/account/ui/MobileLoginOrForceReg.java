package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.platformtools.ag;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;

public class MobileLoginOrForceReg extends MMActivity
  implements com.tencent.mm.ai.f
{
  private String cFl;
  private String cOG;
  private String cxb;
  protected ProgressDialog ehJ;
  private ImageView ejo;
  private TextView ejp;
  private int fPA;
  private com.tencent.mm.sdk.b.c gAY;
  private f gBT;
  private ba gBm;
  private com.tencent.mm.platformtools.c gCd;
  private g gDu;
  private String gDy;
  private Button gEf;
  private Button gEg;
  private LinearLayout gEh;
  private LinearLayout gEi;
  private int gEj;
  private String gEk;
  private String gEl;
  private int gEm;
  private String gEn;
  private boolean gEo;
  private boolean gEp;
  private String gEq;
  private String gEr;
  private int gEs;
  private String gEt;
  private int gEu;
  private TextView grM;
  private SecurityImage gue;
  private ak handler;
  private String nickname;
  private String username;

  public MobileLoginOrForceReg()
  {
    AppMethodBeat.i(125222);
    this.ehJ = null;
    this.gDu = null;
    this.gEo = true;
    this.handler = new MobileLoginOrForceReg.1(this);
    this.gue = null;
    this.gBm = new ba();
    this.gAY = new MobileLoginOrForceReg.12(this);
    this.gBT = null;
    AppMethodBeat.o(125222);
  }

  private void goBack()
  {
    AppMethodBeat.i(125229);
    com.tencent.mm.plugin.b.a.wA("R200_100");
    if (this.gEs == 1);
    for (Object localObject = new Intent(this, RegByMobileRegAIOUI.class); ; localObject = new Intent(this, MobileInputUI.class))
    {
      ((Intent)localObject).putExtra("mobile_input_purpose", 2);
      ((Intent)localObject).addFlags(67108864);
      startActivity((Intent)localObject);
      com.tencent.mm.plugin.b.a.wz(this.gEn);
      localObject = new StringBuilder();
      com.tencent.mm.kernel.g.RN();
      localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_600,");
      com.tencent.mm.kernel.g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R200_600") + ",2");
      finish();
      AppMethodBeat.o(125229);
      return;
    }
  }

  private void wu(String paramString)
  {
    AppMethodBeat.i(125224);
    com.tencent.mm.kernel.g.RS().aa(new MobileLoginOrForceReg.13(this, paramString));
    AppMethodBeat.o(125224);
  }

  public final int getLayoutId()
  {
    return 2130970238;
  }

  public final void initView()
  {
    AppMethodBeat.i(125225);
    this.gEf = ((Button)findViewById(2131826128));
    this.gEg = ((Button)findViewById(2131826129));
    this.gEh = ((LinearLayout)findViewById(2131826127));
    this.gEi = ((LinearLayout)findViewById(2131826126));
    this.ejo = ((ImageView)findViewById(2131821183));
    this.ejp = ((TextView)findViewById(2131823149));
    this.grM = ((TextView)findViewById(2131821769));
    new com.tencent.mm.sdk.platformtools.av();
    Object localObject;
    if (this.cFl.startsWith("+"))
    {
      localObject = com.tencent.mm.sdk.platformtools.av.Ps(this.cFl);
      if (!bo.isNullOrNil((String)localObject))
      {
        String str = this.cFl.substring(((String)localObject).length() + 1);
        localObject = "+" + (String)localObject + " " + com.tencent.mm.sdk.platformtools.av.formatNumber((String)localObject, str);
      }
    }
    while (true)
    {
      this.grM.setText((CharSequence)localObject);
      if ((!bo.isNullOrNil(this.nickname)) || (!bo.isNullOrNil(this.gEl)))
        break;
      this.gEi.setVisibility(0);
      this.gEh.setVisibility(8);
      this.gEf.setOnClickListener(new MobileLoginOrForceReg.14(this));
      this.gEg.setOnClickListener(new MobileLoginOrForceReg.15(this));
      setMMTitle(2131301460);
      setBackBtn(new MobileLoginOrForceReg.16(this));
      AppMethodBeat.o(125225);
      return;
      localObject = this.cFl;
      continue;
      localObject = "+86 " + com.tencent.mm.sdk.platformtools.av.formatNumber("86", this.cFl);
    }
    this.gEi.setVisibility(8);
    this.gEh.setVisibility(0);
    if (bo.isNullOrNil(this.nickname))
      this.ejp.setVisibility(8);
    while (true)
    {
      localObject = a.b.diS().AZ();
      if (localObject != null)
        this.ejo.setImageBitmap((Bitmap)localObject);
      if (bo.isNullOrNil(this.gEl))
        break;
      wu(this.gEl);
      break;
      this.ejp.setText(this.nickname);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125223);
    super.onCreate(paramBundle);
    this.gEn = com.tencent.mm.plugin.b.a.arO();
    com.tencent.mm.kernel.g.Rg().a(701, this);
    com.tencent.mm.kernel.g.Rg().a(252, this);
    com.tencent.mm.kernel.g.Rg().a(126, this);
    com.tencent.mm.kernel.g.Rg().a(255, this);
    this.gEs = getIntent().getIntExtra("key_reg_style", 1);
    this.cxb = getIntent().getStringExtra("ticket");
    this.cFl = getIntent().getStringExtra("moble");
    this.gEj = getIntent().getIntExtra("next_controll", 0);
    this.username = getIntent().getStringExtra("username");
    this.gEk = getIntent().getStringExtra("password");
    this.nickname = getIntent().getStringExtra("nickname");
    this.gEl = getIntent().getStringExtra("avatar_url");
    this.gDy = getIntent().getStringExtra("regsession_id");
    this.gEt = getIntent().getStringExtra("reg_3d_app_ticket");
    this.gEu = getIntent().getIntExtra("reg_3d_app_type", 0);
    this.gEm = getIntent().getIntExtra("mobile_check_type", 0);
    this.gEp = getIntent().getBooleanExtra("kintent_hasavatar", false);
    this.gEq = getIntent().getStringExtra("kintent_nickname");
    this.gEr = getIntent().getStringExtra("kintent_password");
    if ((this.gEr != null) && (this.gEr.length() >= 8));
    for (this.fPA = 1; ; this.fPA = 4)
    {
      initView();
      this.gCd = new com.tencent.mm.platformtools.c();
      AppMethodBeat.o(125223);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125228);
    com.tencent.mm.kernel.g.Rg().b(701, this);
    com.tencent.mm.kernel.g.Rg().b(252, this);
    com.tencent.mm.kernel.g.Rg().b(126, this);
    com.tencent.mm.kernel.g.Rg().b(255, this);
    if (this.gCd != null)
      this.gCd.close();
    super.onDestroy();
    AppMethodBeat.o(125228);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125230);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(125230);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125230);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(125227);
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.gAY);
    AppMethodBeat.o(125227);
  }

  public void onResume()
  {
    AppMethodBeat.i(125226);
    com.tencent.mm.sdk.b.a.xxA.c(this.gAY);
    super.onResume();
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_600,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_600") + ",1");
    com.tencent.mm.plugin.b.a.wz("R200_600");
    AppMethodBeat.o(125226);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125231);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (this.gBT == null)
      this.gBT = new f();
    boolean bool;
    if (paramm.getType() == 255)
    {
      if ((paramInt2 == -3) && (paramInt1 == 4))
      {
        bool = this.gEo;
        paramString = new Intent(this, RegByMobileSetPwdUI.class);
        paramString.putExtra("kintent_hint", getString(2131303155));
        paramString.putExtra("kintent_cancelable", bool);
        startActivityForResult(paramString, 0);
      }
      AppMethodBeat.o(125231);
    }
    while (true)
    {
      return;
      if (((paramm.getType() == 252) || (paramm.getType() == 701)) && (this.gDu != null))
      {
        if ((paramInt2 == -6) || (paramInt2 == -311) || (paramInt2 == -310))
        {
          this.gBT.account = this.username;
          this.gBT.gCK = this.gEr;
          this.gBT.guh = ((com.tencent.mm.modelsimple.q)paramm).ajn();
          this.gBT.gug = ((com.tencent.mm.modelsimple.q)paramm).ajo();
          this.gBT.gui = ((com.tencent.mm.modelsimple.q)paramm).ajp();
          this.gBT.gCL = ((com.tencent.mm.modelsimple.q)paramm).getSecCodeType();
          if (this.gue == null)
          {
            this.gue = SecurityImage.a.a(this, this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui, new MobileLoginOrForceReg.17(this), null, new MobileLoginOrForceReg.18(this), this.gBT);
            AppMethodBeat.o(125231);
          }
          else
          {
            this.gue.b(this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui);
            AppMethodBeat.o(125231);
          }
        }
        else
        {
          this.cOG = ((com.tencent.mm.modelsimple.q)paramm).ajm();
          this.gDu.a(this, paramInt1, paramInt2, paramString, paramm);
          if ((paramm instanceof com.tencent.mm.modelsimple.q))
            this.gEo = ((com.tencent.mm.modelsimple.q)paramm).ajv();
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            paramString = new r(1);
            com.tencent.mm.kernel.g.Rg().a(paramString, 0);
            getString(2131297061);
            this.ehJ = h.b(this, getString(2131296965), true, new MobileLoginOrForceReg.19(this, paramString));
            if (!bo.isNullOrNil(this.gEt))
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWX, Integer.valueOf(this.gEu));
          }
          AppMethodBeat.o(125231);
        }
      }
      else
      {
        Object localObject1;
        Object localObject2;
        if (paramm.getType() == 126)
        {
          if ((paramInt2 == -6) || (paramInt2 == -311) || (paramInt2 == -310))
          {
            localObject1 = Boolean.valueOf(this.gEp);
            localObject2 = this.gEr;
            paramString = this.gEq;
            if (this.gue == null)
            {
              this.gue = SecurityImage.a.a(this, 0, ((s)paramm).ajo(), ((s)paramm).ajn(), "", new MobileLoginOrForceReg.2(this, (String)localObject2, paramString, paramm, (Boolean)localObject1), null, new MobileLoginOrForceReg.3(this), new MobileLoginOrForceReg.4(this, (String)localObject2, paramString, paramm, (Boolean)localObject1));
              AppMethodBeat.o(125231);
            }
            else
            {
              this.gue.b(0, ((s)paramm).ajo(), ((s)paramm).ajn(), "");
              AppMethodBeat.o(125231);
            }
          }
          else
          {
            String str;
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              str = this.cFl;
              bool = this.gEp;
              this.gBm.daR = this.gEu;
              this.gBm.cVS = 6L;
              this.gBm.ajK();
              com.tencent.mm.kernel.g.RN();
              com.tencent.mm.kernel.a.unhold();
              com.tencent.mm.kernel.a.cm(true);
              if (!Boolean.valueOf(bool).booleanValue())
                break label916;
              localObject2 = com.tencent.mm.compatible.util.e.euY + "temp.avatar";
              localObject1 = com.tencent.mm.compatible.util.e.euY + "temp.avatar.hd";
              com.tencent.mm.vfs.e.aQ((String)localObject2, (String)localObject1);
              com.tencent.mm.vfs.e.deleteFile((String)localObject2);
              d.c((String)localObject1, 96, 96, Bitmap.CompressFormat.JPEG, 90, (String)localObject2);
              new com.tencent.mm.ah.m(this, com.tencent.mm.compatible.util.e.euY + "temp.avatar").a(new MobileLoginOrForceReg.5(this, paramm, str), new MobileLoginOrForceReg.6(this, paramm, str));
            }
            while (true)
            {
              localObject1 = com.tencent.mm.h.a.jY(paramString);
              if (localObject1 == null)
                break label1057;
              ((com.tencent.mm.h.a)localObject1).a(this, null, null);
              AppMethodBeat.o(125231);
              break;
              label916: this.cxb = ((s)paramm).ajw();
              com.tencent.mm.model.av.fly.ak("login_user_name", str);
              localObject1 = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
              ((Intent)localObject1).addFlags(67108864);
              ((Intent)localObject1).putExtra("LauncherUI.enter_from_reg", true);
              startActivity((Intent)localObject1);
              finish();
              com.tencent.mm.plugin.b.a.wA("RE900_100");
              localObject1 = new StringBuilder();
              com.tencent.mm.kernel.g.RN();
              localObject1 = ((StringBuilder)localObject1).append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_600,");
              com.tencent.mm.kernel.g.RN();
              com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R200_600") + ",4");
            }
          }
        }
        else
        {
          label1057: localObject1 = new ag(paramInt1, paramInt2, paramString);
          int i;
          if (this.gCd.a(this, (ag)localObject1))
            i = 1;
          while (true)
            if (i != 0)
            {
              AppMethodBeat.o(125231);
              break;
              i = 0;
              switch (paramInt2)
              {
              default:
                break;
              case -140:
                if (!bo.isNullOrNil(this.cOG))
                  com.tencent.mm.platformtools.z.o(this.mController.ylL, paramString, this.cOG);
                i = 1;
                break;
              case -34:
                Toast.makeText(this, 2131297538, 0).show();
                i = 1;
                break;
              case -43:
                Toast.makeText(this, 2131297535, 0).show();
                i = 1;
                break;
              case -41:
                Toast.makeText(this, 2131297537, 0).show();
                i = 1;
                break;
              case -36:
                Toast.makeText(this, 2131297540, 0).show();
                i = 1;
                break;
              case -32:
                h.a(this, getString(2131297585), "", new MobileLoginOrForceReg.7(this));
                i = 1;
                break;
              case -33:
                h.a(this, 2131297583, 2131297589, new MobileLoginOrForceReg.8(this));
                i = 1;
                break;
              case -75:
                h.g(this, 2131296516, 2131302222);
                i = 1;
                break;
              case -100:
                com.tencent.mm.kernel.g.RN();
                com.tencent.mm.kernel.a.hold();
                localObject2 = this.mController.ylL;
                com.tencent.mm.kernel.g.RN();
                if (TextUtils.isEmpty(com.tencent.mm.kernel.a.QH()));
                for (localObject1 = com.tencent.mm.bz.a.an(this.mController.ylL, 2131301294); ; localObject1 = com.tencent.mm.kernel.a.QH())
                {
                  h.a((Context)localObject2, (String)localObject1, this.mController.ylL.getString(2131297061), new MobileLoginOrForceReg.9(this), new MobileLoginOrForceReg.10(this));
                  i = 1;
                  break;
                  com.tencent.mm.kernel.g.RN();
                }
              }
            }
          if ((paramm.getType() == 252) || (paramm.getType() == 701))
          {
            paramString = com.tencent.mm.h.a.jY(paramString);
            if ((paramString != null) && (paramString.a(this.mController.ylL, null, null)))
              AppMethodBeat.o(125231);
          }
          else
          {
            if ((paramInt1 != 0) || (paramInt2 != 0))
              Toast.makeText(this.mController.ylL, getString(2131297582, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
            AppMethodBeat.o(125231);
          }
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg
 * JD-Core Version:    0.6.2
 */