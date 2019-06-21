package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.fv;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.g.a.ob.a;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.wallet_core.utils.c;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.zr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.c.p.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class RemittanceF2fDynamicCodeUI extends WalletBaseUI
{
  private static int pWe = 60000;
  private String czU;
  private String kGW;
  private x.a kHg;
  private int nUf;
  private String nickname;
  private String pPJ;
  private Button pTi;
  private PayInfo pVL;
  private String pVM;
  private String pVN;
  private String pVO;
  private String pVP;
  private String pVQ;
  private String pVR;
  private String pVS;
  private List<zr> pVT;
  private boolean pVU;
  private TextView pVV;
  private TextView pVW;
  private LinearLayout pVX;
  private ImageView pVY;
  private LinearLayout pVZ;
  private WalletTextView pWa;
  private boolean pWb;
  private long pWc;
  private long pWd;
  private ap pWf;
  private String pcI;
  private String username;

  public RemittanceF2fDynamicCodeUI()
  {
    AppMethodBeat.i(45059);
    this.pVT = new ArrayList();
    this.pVU = false;
    this.pWb = false;
    this.pWc = 0L;
    this.pWd = 0L;
    this.pWf = new ap(new a((byte)0), true);
    this.kHg = new RemittanceF2fDynamicCodeUI.1(this);
    AppMethodBeat.o(45059);
  }

  private boolean cfX()
  {
    AppMethodBeat.i(45067);
    boolean bool = getIntent().getBooleanExtra("from_patch_ui", false);
    AppMethodBeat.o(45067);
    return bool;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(45066);
    if ((cfX()) && ((paramm instanceof com.tencent.mm.plugin.remittance.model.m)))
    {
      this.pWb = false;
      paramString = (com.tencent.mm.plugin.remittance.model.m)paramm;
      AM(0);
      paramString.a(new RemittanceF2fDynamicCodeUI.2(this, paramString)).b(new p.a()
      {
        public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
        {
        }
      }).c(new RemittanceF2fDynamicCodeUI.9(this));
    }
    AppMethodBeat.o(45066);
    return true;
  }

  public final int getLayoutId()
  {
    return 2130970512;
  }

  public final void initView()
  {
    AppMethodBeat.i(45061);
    if (cfX())
    {
      this.pVV = ((TextView)findViewById(2131827067));
      this.pVW = ((TextView)findViewById(2131827072));
      this.pTi = ((Button)findViewById(2131827073));
      this.pVY = ((ImageView)findViewById(2131827069));
      this.pVX = ((LinearLayout)findViewById(2131827070));
      this.pVZ = ((LinearLayout)findViewById(2131827071));
      this.pWa = ((WalletTextView)findViewById(2131827068));
      this.pWa.setText(getString(2131302464, new Object[] { com.tencent.mm.wallet_core.ui.e.G(this.nUf / 100.0D) }));
      this.pTi.setOnClickListener(new RemittanceF2fDynamicCodeUI.4(this));
      this.pVY.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          AppMethodBeat.i(45055);
          RemittanceF2fDynamicCodeUI.d(RemittanceF2fDynamicCodeUI.this);
          AppMethodBeat.o(45055);
          return false;
        }
      });
    }
    AppMethodBeat.o(45061);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(45065);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ob localob;
    if (cfX())
    {
      ab.i("MicroMsg.RemittanceF2fDynamicCodeUI", "onActivityResult requestCode:%s resultCode:%s %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramIntent });
      if (paramInt1 == 1)
      {
        localob = new ob();
        ob.a locala = localob.cKr;
        if (paramInt2 == -1)
        {
          locala.cwB = bool;
          if (paramIntent == null)
            break label143;
          localob.cKr.cKs = paramIntent.getIntExtra("key_pay_reslut_type", 3);
          label106: com.tencent.mm.sdk.b.a.xxA.m(localob);
          if (paramInt2 != -1)
            break label155;
          setResult(-1, paramIntent);
          finish();
          AppMethodBeat.o(45065);
        }
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label143: localob.cKr.cKs = 3;
      break label106;
      label155: if (c.aw(paramIntent))
      {
        setResult(0, paramIntent);
        finish();
        AppMethodBeat.o(45065);
      }
      else if (c.ax(paramIntent))
      {
        AppMethodBeat.o(45065);
      }
      else
      {
        paramIntent = new fv();
        paramIntent.czR.czS = false;
        com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
        AppMethodBeat.o(45065);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45060);
    super.onCreate(paramBundle);
    if (cfX())
    {
      if (getSupportActionBar() != null)
      {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131690389)));
        View localView = getSupportActionBar().getCustomView();
        if (localView != null)
        {
          paramBundle = localView.findViewById(2131821128);
          if (paramBundle != null)
            paramBundle.setBackgroundColor(getResources().getColor(2131690157));
          paramBundle = localView.findViewById(16908308);
          if ((paramBundle != null) && ((paramBundle instanceof TextView)))
            ((TextView)paramBundle).setTextColor(getResources().getColor(2131689761));
        }
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(-2147483648);
        paramBundle.setStatusBarColor(getResources().getColor(2131690389));
      }
      if (d.iW(21))
      {
        if (!d.iW(23))
          break label462;
        getWindow().getDecorView().setSystemUiVisibility(8192);
      }
    }
    while (true)
    {
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(45053);
          if (RemittanceF2fDynamicCodeUI.c(RemittanceF2fDynamicCodeUI.this))
          {
            RemittanceF2fDynamicCodeUI.this.aqX();
            RemittanceF2fDynamicCodeUI.this.showDialog(1000);
          }
          while (true)
          {
            AppMethodBeat.o(45053);
            return true;
            RemittanceF2fDynamicCodeUI.this.setResult(0, new Intent().putExtra("key_pay_reslut_type", 4));
            RemittanceF2fDynamicCodeUI.this.finish();
          }
        }
      }
      , 2131230935);
      nf(2736);
      setMMTitle(2131302373);
      this.pVL = ((PayInfo)getIntent().getParcelableExtra("key_pay_info"));
      if (this.pVL == null)
      {
        ab.e("MicroMsg.RemittanceF2fDynamicCodeUI", "payinfo is null");
        finish();
      }
      AM(4);
      this.nUf = this.pVL.vwh.getInt("extinfo_key_15");
      this.username = this.pVL.vwh.getString("extinfo_key_1");
      this.pcI = this.pVL.vwh.getString("extinfo_key_2");
      this.pVO = this.pVL.vwh.getString("extinfo_key_17");
      this.pVP = this.pVL.vwh.getString("extinfo_key_18");
      this.pVM = getIntent().getStringExtra("key_rcvr_open_id");
      this.pVQ = getIntent().getStringExtra("key_mch_info");
      this.pVN = getIntent().getStringExtra("key_transfer_qrcode_id");
      this.kGW = getIntent().getStringExtra("key_mch_photo");
      this.pPJ = getIntent().getStringExtra("show_paying_wording");
      this.pVR = getIntent().getStringExtra("dynamic_code_spam_wording");
      this.pVU = getIntent().getBooleanExtra("show_avatar_type", false);
      this.nickname = com.tencent.mm.wallet_core.ui.e.mJ(this.username);
      initView();
      AppMethodBeat.o(45060);
      return;
      label462: getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45064);
    if (cfX())
      ng(2736);
    super.onDestroy();
    AppMethodBeat.o(45064);
  }

  public void onPause()
  {
    AppMethodBeat.i(45063);
    super.onPause();
    if (cfX())
    {
      this.pWf.stopTimer();
      ab.d("MicroMsg.RemittanceF2fDynamicCodeUI", "stop timer");
    }
    AppMethodBeat.o(45063);
  }

  public void onResume()
  {
    AppMethodBeat.i(45062);
    super.onResume();
    e.cfP().eL(this);
    if (cfX())
    {
      l = System.currentTimeMillis();
      if (this.pWc > 0L)
        break label120;
    }
    label120: for (long l = 0L; ; l = pWe - (l - this.pWc))
    {
      this.pWd = l;
      ab.i("MicroMsg.RemittanceF2fDynamicCodeUI", "last time: %s, delay: %s", new Object[] { Long.valueOf(this.pWc), Long.valueOf(this.pWd) });
      if (this.pWd < 0L)
        this.pWd = 0L;
      this.pWf.ae(this.pWd, pWe);
      ab.d("MicroMsg.RemittanceF2fDynamicCodeUI", "start timer");
      AppMethodBeat.o(45062);
      return;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a
    implements ap.a
  {
    private a()
    {
    }

    public final boolean BI()
    {
      AppMethodBeat.i(45058);
      ab.d("MicroMsg.RemittanceF2fDynamicCodeUI", "timer expired");
      if (RemittanceF2fDynamicCodeUI.e(RemittanceF2fDynamicCodeUI.this))
        AppMethodBeat.o(45058);
      while (true)
      {
        return true;
        RemittanceF2fDynamicCodeUI.a(RemittanceF2fDynamicCodeUI.this, System.currentTimeMillis());
        RemittanceF2fDynamicCodeUI.f(RemittanceF2fDynamicCodeUI.this);
        AppMethodBeat.o(45058);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI
 * JD-Core Version:    0.6.2
 */