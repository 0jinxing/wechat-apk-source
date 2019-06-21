package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

public class BindLinkedInUI extends MMActivity
  implements f
{
  private String dun;
  private String duo;
  private ProgressDialog fsh;
  private boolean gqJ = false;
  private String gqK;
  private boolean gqL = false;
  private boolean gqM = false;
  private boolean gqN = false;
  private Bundle gqO;
  private boolean gqP = false;
  private boolean gqQ = false;
  private TextView gqR;
  private TextView gqS;
  private View gqT;
  private MMSwitchBtn gqU;
  private TextView gqV;
  private TextView gqW;
  private TextView gqX;
  private String gqY;
  private String gqZ;
  private String gra;
  private String grb;
  private String name;
  private int status;

  private void Kh()
  {
    boolean bool1 = true;
    AppMethodBeat.i(13405);
    this.gqK = ((String)g.RP().Ry().get(286721, null));
    if (!bo.isNullOrNil(this.gqK))
    {
      bool2 = true;
      this.gqJ = bool2;
      this.name = ((String)g.RP().Ry().get(286722, null));
      this.status = r.YD();
      if ((this.status & 0x400000) == 0)
        break label99;
    }
    label99: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.gqL = bool2;
      AppMethodBeat.o(13405);
      return;
      bool2 = false;
      break;
    }
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3)
  {
    AppMethodBeat.i(13411);
    this.gqX.setVisibility(8);
    if (paramBoolean1)
    {
      this.gqS.setVisibility(8);
      this.gqR.setVisibility(0);
      vK(paramString);
      this.gqT.setVisibility(0);
      this.gqV.setVisibility(8);
      if (paramBoolean2)
        this.gqW.setVisibility(0);
      this.gqU.setCheck(paramBoolean3);
      this.gqU.setSwitchListener(new BindLinkedInUI.3(this));
      AppMethodBeat.o(13411);
    }
    while (true)
    {
      return;
      this.gqR.setVisibility(8);
      this.gqR.setText(getString(2131298560));
      this.gqS.setVisibility(0);
      this.gqT.setVisibility(8);
      this.gqV.setVisibility(0);
      this.gqW.setVisibility(8);
      AppMethodBeat.o(13411);
    }
  }

  private void cu()
  {
    boolean bool = true;
    AppMethodBeat.i(13412);
    if ((this.gqM) && (this.gqO == null))
    {
      ab.e("MicroMsg.BindLinkedInUI", "bindBundle is null");
      AppMethodBeat.o(13412);
    }
    while (true)
    {
      return;
      if (this.gqN)
      {
        a(this.gqJ, false, this.name, this.gqL);
        AppMethodBeat.o(13412);
      }
      else
      {
        if (this.gqM)
        {
          if ((this.gqJ) && (this.gqK.equals(this.dun)));
          while (true)
          {
            d(bool, this.duo, this.gqL);
            AppMethodBeat.o(13412);
            break;
            bool = false;
          }
        }
        a(this.gqJ, true, this.name, this.gqL);
        AppMethodBeat.o(13412);
      }
    }
  }

  private void d(boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    AppMethodBeat.i(13410);
    this.gqR.setVisibility(0);
    vK(paramString);
    this.gqT.setVisibility(0);
    this.gqW.setVisibility(8);
    if (paramBoolean1)
    {
      this.gqS.setVisibility(8);
      this.gqV.setVisibility(8);
      this.gqX.setVisibility(8);
      this.gqU.setCheck(paramBoolean2);
      this.gqU.setSwitchListener(new MMSwitchBtn.a()
      {
        public final void di(boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(13400);
          BindLinkedInUI.a(BindLinkedInUI.this, paramAnonymousBoolean, true);
          AppMethodBeat.o(13400);
        }
      });
      AppMethodBeat.o(13410);
    }
    while (true)
    {
      return;
      this.gqS.setVisibility(0);
      this.gqV.setVisibility(0);
      this.gqX.setVisibility(0);
      this.gqU.setCheck(paramBoolean2);
      this.gqU.setSwitchListener(new BindLinkedInUI.2(this));
      AppMethodBeat.o(13410);
    }
  }

  private void dh(boolean paramBoolean)
  {
    AppMethodBeat.i(13408);
    if (this.gqO == null)
    {
      ab.e("MicroMsg.BindLinkedInUI", "bindBundle is null !!");
      AppMethodBeat.o(13408);
      return;
    }
    if (this.gqU.zMU);
    for (int i = 1; ; i = 2)
    {
      com.tencent.mm.plugin.account.bind.a.a locala = new com.tencent.mm.plugin.account.bind.a.a(i, this.dun, this.duo, "", this.gqY, this.gqZ, this.gra, this.grb);
      if (!paramBoolean)
        this.fsh = h.b(this, getString(2131300968), false, new BindLinkedInUI.11(this, locala));
      g.Rg().a(locala, 0);
      AppMethodBeat.o(13408);
      break;
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(13407);
    if (this.gqM)
      if (this.gqQ)
      {
        Intent localIntent = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
        localIntent.addFlags(603979776);
        localIntent.putExtra("preferred_tab", 2);
        startActivity(localIntent);
        AppMethodBeat.o(13407);
      }
    while (true)
    {
      return;
      setResult(-1);
      finish();
      AppMethodBeat.o(13407);
      continue;
      setResult(-1);
      finish();
      AppMethodBeat.o(13407);
    }
  }

  private void m(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(13413);
    if (paramBoolean1)
    {
      this.status |= 4194304;
      if (!paramBoolean1)
        break label131;
    }
    label131: for (int i = 1; ; i = 2)
    {
      g.RP().Ry().set(7, Integer.valueOf(this.status));
      if (paramBoolean2)
      {
        act localact = new act();
        localact.wkw = 33;
        localact.pvD = i;
        ((j)g.K(j.class)).XL().c(new j.a(23, localact));
        com.tencent.mm.plugin.account.a.a.gkF.BS();
      }
      AppMethodBeat.o(13413);
      return;
      this.status &= -4194305;
      break;
    }
  }

  private void vK(String paramString)
  {
    AppMethodBeat.i(13409);
    int i = getString(2131298559).indexOf("%s");
    Object localObject = getString(2131298559, new Object[] { paramString });
    localObject = Spannable.Factory.getInstance().newSpannable((CharSequence)localObject);
    ((Spannable)localObject).setSpan(new BindLinkedInUI.12(this), i, paramString.length() + i, 33);
    this.gqR.setText((CharSequence)localObject);
    AppMethodBeat.o(13409);
  }

  private boolean w(Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(13414);
    Object localObject = paramIntent.getBundleExtra("result_data");
    String str1 = ((Bundle)localObject).getString("ret");
    String str2 = ((Bundle)localObject).getString("limid");
    paramIntent = ((Bundle)localObject).getString("liname");
    String str3 = ((Bundle)localObject).getString("liurl");
    localObject = ((Bundle)localObject).getString("liswitch");
    if (bo.isNullOrNil(str1))
    {
      ab.e("MicroMsg.BindLinkedInUI", "linkedin oauth ret is null, maybe canceled");
      AppMethodBeat.o(13414);
    }
    while (true)
    {
      return bool;
      int i = bo.ank(str1);
      if (i != 0)
      {
        ab.e("MicroMsg.BindLinkedInUI", "linkedin oauth bind failed ret %s ", new Object[] { Integer.valueOf(i) });
        if (i == 1);
        for (i = 2131298570; ; i = 2131298569)
        {
          h.b(this, getString(i), null, true);
          AppMethodBeat.o(13414);
          break;
        }
      }
      if (!bo.isNullOrNil(str2))
        break;
      ab.e("MicroMsg.BindLinkedInUI", "linkedin member id is null");
      AppMethodBeat.o(13414);
    }
    ab.d("MicroMsg.BindLinkedInUI", "%s, %s, %s, %s", new Object[] { str2, paramIntent, str3, localObject });
    g.RP().Ry().set(286722, paramIntent);
    g.RP().Ry().set(286721, str2);
    g.RP().Ry().set(286723, str3);
    if (!bo.isNullOrNil((String)localObject))
      if (bo.ank((String)localObject) != 1)
        break label315;
    label315: for (bool = true; ; bool = false)
    {
      m(bool, false);
      Kh();
      cu();
      paramIntent = getString(2131298566);
      new BindLinkedInUI.4(this);
      h.bQ(this, paramIntent);
      AppMethodBeat.o(13414);
      bool = true;
      break;
    }
  }

  public final int getLayoutId()
  {
    return 2130968840;
  }

  public final void initView()
  {
    AppMethodBeat.i(13406);
    if (this.gqM)
      setMMTitle(2131298572);
    while (true)
    {
      this.gqR = ((TextView)findViewById(2131821756));
      this.gqS = ((TextView)findViewById(2131821755));
      this.gqT = findViewById(2131821757);
      this.gqU = ((MMSwitchBtn)findViewById(2131821758));
      this.gqV = ((TextView)findViewById(2131821759));
      this.gqW = ((TextView)findViewById(2131821760));
      this.gqX = ((TextView)findViewById(2131821761));
      this.gqR.setOnClickListener(new BindLinkedInUI.6(this));
      this.gqV.setOnClickListener(new BindLinkedInUI.7(this));
      this.gqW.setOnClickListener(new BindLinkedInUI.8(this));
      this.gqX.setOnClickListener(new BindLinkedInUI.9(this));
      setBackBtn(new BindLinkedInUI.10(this));
      cu();
      AppMethodBeat.o(13406);
      return;
      if (this.gqN)
        setMMTitle(2131298575);
      else
        setMMTitle(2131298565);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(13415);
    ab.d("MicroMsg.BindLinkedInUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    if (paramIntent == null)
      AppMethodBeat.o(13415);
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        ab.e("MicroMsg.BindLinkedInUI", "onActivityResult unknow request");
        AppMethodBeat.o(13415);
        break;
      case 100:
        w(paramIntent);
        AppMethodBeat.o(13415);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13401);
    super.onCreate(paramBundle);
    g.Rg().a(549, this);
    g.Rg().a(550, this);
    this.gqO = getIntent().getBundleExtra("qrcode_bundle");
    if (this.gqO != null);
    for (boolean bool = true; ; bool = false)
    {
      this.gqM = bool;
      if (this.gqO != null)
      {
        this.dun = this.gqO.getString("i");
        this.duo = this.gqO.getString("n");
        this.gqY = this.gqO.getString("t");
        this.gqZ = this.gqO.getString("o");
        this.gra = this.gqO.getString("s");
        this.grb = this.gqO.getString("r");
        if ((this.dun == null) || (this.duo == null) || (this.gqY == null) || (this.gra == null) || (this.grb == null))
          h.a(this, getString(2131298562), null, false, new BindLinkedInUI.1(this));
      }
      this.gqN = getIntent().getBooleanExtra("oversea_entry", false);
      Kh();
      if (this.gqM)
        this.gqL = true;
      initView();
      if ((this.gqO != null) && (this.gqJ) && (this.gqK.equals(this.dun)))
      {
        this.gqP = true;
        dh(true);
      }
      AppMethodBeat.o(13401);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13402);
    g.Rg().b(550, this);
    g.Rg().b(549, this);
    super.onDestroy();
    AppMethodBeat.o(13402);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(13417);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(13417);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13417);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(13404);
    super.onPause();
    AppMethodBeat.o(13404);
  }

  public void onResume()
  {
    AppMethodBeat.i(13403);
    super.onResume();
    AppMethodBeat.o(13403);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(13416);
    if (this.fsh != null)
    {
      this.fsh.dismiss();
      this.fsh = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
      if (paramm.getType() == 549)
        if (paramInt2 == 1)
        {
          paramInt1 = 2131298570;
          h.b(this, getString(paramInt1), null, true);
          AppMethodBeat.o(13416);
        }
    while (true)
    {
      return;
      paramInt1 = 2131298569;
      break;
      if (paramm.getType() == 550)
      {
        paramInt1 = 2131298571;
        break;
      }
      AppMethodBeat.o(13416);
      continue;
      if (paramm.getType() == 549)
      {
        this.gqQ = true;
        if (!this.gqP)
          paramInt1 = 2131298566;
      }
      while (true)
      {
        paramString = getString(paramInt1);
        new BindLinkedInUI.5(this);
        h.bQ(this, paramString);
        Kh();
        this.gqL = this.gqU.zMU;
        cu();
        AppMethodBeat.o(13416);
        break;
        paramInt1 = 2131298567;
        continue;
        if (paramm.getType() != 550)
          break label207;
        paramInt1 = 2131298577;
      }
      label207: AppMethodBeat.o(13416);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI
 * JD-Core Version:    0.6.2
 */