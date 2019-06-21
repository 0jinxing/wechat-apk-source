package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.aqi;
import com.tencent.mm.protocal.protobuf.blx;
import com.tencent.mm.protocal.protobuf.crw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class IPCallDialUI extends MMActivity
  implements f, b.a
{
  private String gHT;
  private TextView goa;
  private b nCg;
  private String nCh;
  private String nCi;
  private String nCj;
  private String nCk;
  private int nCl;
  private int nCm;
  private int nCn;
  private LinkedList<crw> nCo;
  com.tencent.mm.plugin.ipcall.a.d.b nCp;
  com.tencent.mm.plugin.ipcall.a.d.c nCq;
  private com.tencent.mm.sdk.b.c nCr;
  private DialPad nzR;
  private TextView nzS;
  private EditText nzT;
  private View nzU;
  private ImageButton nzV;
  private View nzW;
  private TextView nzX;
  private TextView nzY;

  public IPCallDialUI()
  {
    AppMethodBeat.i(22129);
    this.nCl = 0;
    this.nCm = 0;
    this.nCn = -1;
    this.nCr = new IPCallDialUI.2(this);
    AppMethodBeat.o(22129);
  }

  private void bIm()
  {
    AppMethodBeat.i(22141);
    ab.i("MicroMsg.IPCallDialUI", "modifyCountryCodeByUsder");
    this.nCn = 2;
    if (this.nCm == 1)
    {
      this.nCm = 2;
      AppMethodBeat.o(22141);
    }
    while (true)
    {
      return;
      this.nCm = 4;
      AppMethodBeat.o(22141);
    }
  }

  private void init()
  {
    AppMethodBeat.i(22133);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.RECORD_AUDIO", 80, null, null);
    ab.i("MicroMsg.IPCallDialUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
    if (!bool)
      AppMethodBeat.o(22133);
    while (true)
    {
      return;
      setMMTitle(2131300723);
      setVolumeControlStream(1);
      this.nzR = ((DialPad)findViewById(2131825087));
      this.nzS = ((TextView)findViewById(2131825078));
      this.nzW = findViewById(2131825081);
      this.nzT = ((EditText)findViewById(2131825079));
      this.nzU = findViewById(2131825080);
      this.goa = ((TextView)findViewById(2131825083));
      this.nzV = ((ImageButton)findViewById(2131823306));
      this.nzX = ((TextView)findViewById(2131825082));
      this.nzY = ((TextView)findViewById(2131825084));
      this.nCg = new b(this, this.nzT, this.nzS, this.nzU, this.nzR, this.nzV, this.goa, this.nzW, this.nzX, this.nzY);
      this.nCg.nzQ = this;
      if (!bo.isNullOrNil(this.nCh))
        this.nCg.cq(this.nCh, -1);
      if (!bo.isNullOrNil(this.nCj))
        this.nCg.OZ(this.nCj);
      if ((!bo.isNullOrNil(this.nCh)) && (!bo.isNullOrNil(this.nCj)))
        this.nCg.bId();
      this.nCg.ae(this.nCo);
      AppMethodBeat.o(22133);
    }
  }

  public final void Pa(String paramString)
  {
    AppMethodBeat.i(22139);
    ab.i("MicroMsg.IPCallDialUI", "onModifyCountryCodeByUser:countryCode:%s,mCountryCode:%s", new Object[] { paramString, this.nCj });
    if ((this.nCn != 2) && (this.nCn != -1) && (!this.nCj.equals(paramString)))
      bIm();
    AppMethodBeat.o(22139);
  }

  public final void Pb(String paramString)
  {
    AppMethodBeat.i(22140);
    ab.i("MicroMsg.IPCallDialUI", "onModifyPhoneNumberByUser:phoneNumber:%s,mPhoneNumber:%s", new Object[] { paramString, this.nCh });
    if ((this.nCn != 2) && (this.nCn != -1) && (!this.nCh.equals(paramString)))
      bIm();
    AppMethodBeat.o(22140);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969888;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(22134);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    b localb = this.nCg;
    ab.d("MicroMsg.DialPadController", "onActivityResult");
    if ((paramInt1 == 100) && (paramInt2 == 100))
    {
      String str = bo.bc(paramIntent.getStringExtra("country_name"), "");
      paramIntent = bo.bc(paramIntent.getStringExtra("couttry_code"), "");
      ab.d("MicroMsg.DialPadController", "onActivityResult, countryName: %s, countryCode: %s", new Object[] { paramIntent, str });
      if ((!bo.isNullOrNil(paramIntent)) && (!bo.isNullOrNil(str)))
      {
        localb.nzZ = str;
        localb.nAa = "+".concat(String.valueOf(paramIntent));
        localb.nzS.setText(localb.nAa);
        localb.nAb = b.eL(paramIntent.replace("+", ""), localb.nAb);
        localb.cq(localb.nAb, -1);
        localb.nAf = false;
      }
      AppMethodBeat.o(22134);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 1001) && (paramInt2 == -1))
      {
        paramIntent.getBooleanExtra("IPCallTalkUI_TalkIsOverdue", false);
        localb.crP.setResult(-1, paramIntent);
        localb.crP.finish();
      }
      AppMethodBeat.o(22134);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22130);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.xxA.c(this.nCr);
    aw.Rg().a(807, this);
    aw.Rg().a(746, this);
    getWindow().addFlags(131072);
    setBackBtn(new IPCallDialUI.1(this), 2131230755);
    this.gHT = getIntent().getStringExtra("IPCallTalkUI_nickname");
    this.nCh = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
    this.nCi = getIntent().getStringExtra("IPCallTalkUI_contactId");
    this.nCj = getIntent().getStringExtra("IPCallTalkUI_countryCode");
    this.nCk = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
    this.nCl = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
    ab.i("MicroMsg.IPCallDialUI", "onCreate nickName:%s, phoneNumber:%s, contactId:%s, countryCode:%s, toUserName:%s, dialScene:%d", new Object[] { this.gHT, this.nCh, this.nCi, this.nCj, this.nCk, Integer.valueOf(this.nCl) });
    if (!bo.isNullOrNil(this.nCh))
      this.nCh = com.tencent.mm.plugin.ipcall.b.c.PA(this.nCh);
    if (bo.isNullOrNil(this.nCj))
    {
      if (com.tencent.mm.plugin.ipcall.b.a.Pu(this.nCh))
      {
        if (bo.isNullOrNil(com.tencent.mm.plugin.ipcall.b.a.Ps(this.nCh)))
          this.nCh = com.tencent.mm.plugin.ipcall.b.a.Pv(this.nCh);
      }
      else
        this.nCj = com.tencent.mm.plugin.ipcall.b.c.bIR();
    }
    else
    {
      if (this.nCl == 1)
        break label470;
      this.nCn = 0;
      this.nCm = 3;
      this.nCp = new com.tencent.mm.plugin.ipcall.a.d.b(this.nCh, this.nCj, "", bo.gQ(this), this.nCl);
      aw.Rg().a(this.nCp, 0);
    }
    while (true)
    {
      init();
      AppMethodBeat.o(22130);
      while (true)
      {
        return;
        ab.i("MicroMsg.IPCallDialUI", "country code exist, directly go to talk ui.");
        this.nCm = 4;
        paramBundle = new Intent(this, IPCallTalkUI.class);
        paramBundle.putExtra("IPCallTalkUI_contactId", this.nCi);
        paramBundle.putExtra("IPCallTalkUI_countryCode", this.nCj);
        paramBundle.putExtra("IPCallTalkUI_nickname", this.gHT);
        paramBundle.putExtra("IPCallTalkUI_phoneNumber", this.nCh);
        paramBundle.putExtra("IPCallTalkUI_dialScene", this.nCl);
        paramBundle.putExtra("IPCallTalkUI_countryType", this.nCm);
        startActivityForResult(paramBundle, 1001);
        finish();
        AppMethodBeat.o(22130);
      }
      label470: this.nCn = -1;
      this.nCm = 4;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22136);
    super.onDestroy();
    if (this.nCg != null)
      this.nCg.nzQ = null;
    com.tencent.mm.sdk.b.a.xxA.d(this.nCr);
    aw.Rg().b(807, this);
    aw.Rg().b(746, this);
    AppMethodBeat.o(22136);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(22137);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.IPCallDialUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(22137);
      return;
    }
    ab.i("MicroMsg.IPCallDialUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 80:
    }
    while (true)
    {
      AppMethodBeat.o(22137);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        init();
        AppMethodBeat.o(22137);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301928), getString(2131301936), getString(2131300878), getString(2131297773), false, new IPCallDialUI.3(this), new IPCallDialUI.4(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(22132);
    ab.d("MicroMsg.IPCallDialUI", "onResume");
    super.onResume();
    AppMethodBeat.o(22132);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(22138);
    if ((paramm instanceof com.tencent.mm.plugin.ipcall.a.d.b))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramm == this.nCp))
      {
        if (this.nCp.nyi != null)
          ab.i("MicroMsg.IPCallDialUI", "Response Result:%d,PureNumber:%s,CountryCode:%s", new Object[] { Integer.valueOf(this.nCp.nyi.vYu), this.nCp.nyi.wOT, this.nCp.nyi.nHd });
        if (this.nCn != 2)
        {
          this.nCn = 1;
          this.nCm = 1;
          paramString = this.nCp;
          if ((paramString.nyi != null) && (paramString.nyi.vYu == 2))
          {
            paramInt1 = 1;
            if (paramInt1 == 0)
              break label162;
            ab.i("MicroMsg.IPCallDialUI", "check error show error dialog");
            AppMethodBeat.o(22138);
          }
        }
        while (true)
        {
          return;
          paramInt1 = 0;
          break;
          label162: paramString = this.nCp;
          if ((paramString.nyi != null) && ((paramString.nyi.vYu == 1) || (paramString.nyi.vYu == 0)))
          {
            paramInt1 = 1;
            label197: if (paramInt1 != 0)
            {
              if ((this.nCp.nyi == null) || (bo.isNullOrNil(this.nCp.nyi.nHd)))
                break label408;
              if (this.nCg != null)
              {
                ab.i("MicroMsg.IPCallDialUI", "response country code:%s, old country code:%s", new Object[] { this.nCp.nyi.nHd, this.nCj });
                this.nCj = this.nCp.nyi.nHd;
                this.nCg.OZ(this.nCp.nyi.nHd);
              }
            }
          }
          while (true)
          {
            if ((this.nCp.nyi == null) || (bo.isNullOrNil(this.nCp.nyi.wOT)) || (this.nCg == null))
              break label485;
            ab.i("MicroMsg.IPCallDialUI", "response number:%s, old number:%s", new Object[] { this.nCp.nyi.wOT, this.nCh });
            this.nCh = this.nCp.nyi.wOT;
            this.nCg.cq(this.nCp.nyi.wOT, -1);
            AppMethodBeat.o(22138);
            break;
            paramInt1 = 0;
            break label197;
            label408: ab.i("MicroMsg.IPCallDialUI", "response country code is empty, ignore");
          }
          ab.i("MicroMsg.IPCallDialUI", "NetSceneIPCallCheckNumber onSceneEnd, mCheckNumberStatus = userModify, ignore");
          AppMethodBeat.o(22138);
        }
      }
    }
    else if ((paramm instanceof com.tencent.mm.plugin.ipcall.a.d.c))
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label494;
    label485: label494: for (this.nCo = ((com.tencent.mm.plugin.ipcall.a.d.c)paramm).nyk.wuh; ; this.nCo = null)
    {
      if (this.nCg != null)
        this.nCg.ae(this.nCo);
      AppMethodBeat.o(22138);
      break;
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(22131);
    super.onStart();
    this.nCq = new com.tencent.mm.plugin.ipcall.a.d.c();
    aw.Rg().a(this.nCq, 0);
    AppMethodBeat.o(22131);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void p(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(22135);
    ab.i("MicroMsg.IPCallDialUI", "onDial, countryCode: %s, phoneNumber: %s, contactId: %s, nickname: %s", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    if (!com.tencent.mm.plugin.ipcall.b.c.eo(this))
      AppMethodBeat.o(22135);
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.ipcall.a.c.bHc().xf(bo.getInt(paramString1, -1)))
      {
        com.tencent.mm.ui.base.h.b(this, getString(2131297768), getString(2131297769), true);
        com.tencent.mm.plugin.report.service.h.pYm.X(12058, paramString1);
        AppMethodBeat.o(22135);
      }
      else
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
        Intent localIntent = new Intent(this, IPCallTalkUI.class);
        localIntent.putExtra("IPCallTalkUI_contactId", paramString3);
        localIntent.putExtra("IPCallTalkUI_countryCode", paramString1);
        localIntent.putExtra("IPCallTalkUI_nickname", paramString4);
        localIntent.putExtra("IPCallTalkUI_phoneNumber", paramString2);
        localIntent.putExtra("IPCallTalkUI_dialScene", this.nCl);
        localIntent.putExtra("IPCallTalkUI_countryType", this.nCm);
        startActivityForResult(localIntent, 1001);
        AppMethodBeat.o(22135);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallDialUI
 * JD-Core Version:    0.6.2
 */