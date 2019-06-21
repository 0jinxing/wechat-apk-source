package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.g.a.iy.a;
import com.tencent.mm.plugin.wallet_core.c.x;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.plugin.wallet_core.model.q.a;
import com.tencent.mm.plugin.wallet_core.model.q.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.HashMap;

@com.tencent.mm.ui.base.a(3)
public class WalletBindCardResultUI extends WalletBaseUI
{
  private PayInfo pVL;
  private String pVl;
  private TextView pWB;
  private com.tencent.mm.sdk.b.c pap;
  private String pdC;
  private BindCardOrder tEB;
  private boolean tEC;
  private String tED;
  private String tEE;
  private q.b tEF;
  private WalletOrderInfoNewUI.b tEG;
  private HashMap<String, WalletOrderInfoNewUI.a> tEH;
  private String tEI;
  private BindCardOrder tEJ;
  private String tEK;
  private Button tEL;
  private ImageView tEM;
  private ViewGroup tEN;
  private CdnImageView tEO;
  private TextView tEP;
  private TextView tEQ;
  private View tER;
  private Button tES;
  private ViewGroup tET;
  private boolean tEU;
  private boolean tEV;
  private boolean tEW;
  private com.tencent.mm.wallet_core.c tEX;
  private int tzY;

  public WalletBindCardResultUI()
  {
    AppMethodBeat.i(47193);
    this.pdC = null;
    this.tEC = false;
    this.tEH = new HashMap();
    this.tEJ = null;
    this.tEK = "-1";
    this.tEU = false;
    this.tEV = false;
    this.tEW = false;
    this.pap = new WalletBindCardResultUI.1(this);
    AppMethodBeat.o(47193);
  }

  private void acZ(String paramString)
  {
    AppMethodBeat.i(47200);
    cRq();
    e.n(this, paramString, false);
    AppMethodBeat.o(47200);
  }

  private void cRn()
  {
    AppMethodBeat.i(47197);
    this.tET.setVisibility(0);
    AppMethodBeat.o(47197);
  }

  private void cRo()
  {
    AppMethodBeat.i(47198);
    this.pWB.setText(this.tEB.txH);
    AppMethodBeat.o(47198);
  }

  private void cRp()
  {
    AppMethodBeat.i(47199);
    this.tEN.setVisibility(4);
    this.tEV = false;
    this.tEU = false;
    if (this.tEB != null)
      if (this.tEB.txN != null)
      {
        ab.i("MicroMsg.WalletBindCardResultUI", "activityPromotions: %s", new Object[] { this.tEJ });
        if ((this.tEB == null) || ((!this.tEB.cPi()) && (!this.tEB.cPk())) || (this.tEB.txN.ttW <= 0L) || (bo.isNullOrNil(this.tEB.txO.tzS)))
          break label854;
        this.tEJ = this.tEB;
        this.tER.setVisibility(8);
        this.tEO.setRoundCorner(true);
        this.tES.setEnabled(true);
        this.tES.setBackgroundResource(2130838000);
        this.tEQ.setCompoundDrawables(null, null, null, null);
        locala = (WalletOrderInfoNewUI.a)this.tEH.get(this.tEJ.txN.ttW);
        if (locala == null)
          break label639;
        if (!bo.isNullOrNil(locala.cIY))
          this.tEO.setUrl(locala.cIY);
        if (!bo.isNullOrNil(locala.cEh))
          this.tEP.setText(locala.cEh);
        if (!bo.isNullOrNil(locala.tID))
        {
          this.tES.setText(locala.tID);
          this.tES.setBackgroundResource(2130840727);
        }
        localObject = (RelativeLayout.LayoutParams)this.tEQ.getLayoutParams();
        if ((locala == null) || (bo.isNullOrNil(locala.title)))
          break label693;
        this.tEQ.setText(locala.title);
        ((RelativeLayout.LayoutParams)localObject).addRule(15, 0);
        this.tEQ.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.tES.setVisibility(0);
        this.tES.setOnClickListener(new WalletBindCardResultUI.3(this));
        if (this.tEJ.txN.tzN != 1L)
          this.tEN.setOnClickListener(new WalletBindCardResultUI.4(this));
        localObject = this.tEK;
        i = -1;
        switch (((String)localObject).hashCode())
        {
        default:
          switch (i)
          {
          default:
            localObject = this.tEP.getText();
            if ((!bo.ac((CharSequence)localObject)) && (((CharSequence)localObject).length() > 9))
            {
              this.tEP.setText(((CharSequence)localObject).subSequence(0, 9));
              this.tEP.append("...");
            }
            localObject = (ViewGroup.MarginLayoutParams)this.tEN.getLayoutParams();
            ((ViewGroup.MarginLayoutParams)localObject).topMargin = com.tencent.mm.bz.a.fromDPToPix(this, 50);
            this.tEN.setLayoutParams((ViewGroup.LayoutParams)localObject);
            this.tEN.setVisibility(0);
          case 0:
          }
          break;
        case 48:
        case 1444:
        case 51:
        case 52:
        case 50:
        case 49:
        }
      }
    label639: 
    while ((this.tEB.txP == null) || (bo.isNullOrNil(this.tEB.txP.tzW)) || (!this.tEB.cPj()))
      while (true)
      {
        WalletOrderInfoNewUI.a locala;
        int i;
        if (this.tEP.getVisibility() == 0)
          this.tEP.post(new WalletBindCardResultUI.6(this));
        if (this.tEN.getVisibility() == 8)
        {
          localObject = (ViewGroup.MarginLayoutParams)this.tEM.getLayoutParams();
          ((ViewGroup.MarginLayoutParams)localObject).topMargin = com.tencent.mm.bz.a.fromDPToPix(this, 91);
          this.tEM.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
        AppMethodBeat.o(47199);
        return;
        this.tEO.setUrl(this.tEB.txO.pia);
        this.tEP.setText(this.tEB.txO.name);
        this.tES.setText(this.tEB.txO.tzS);
        continue;
        if (!bo.isNullOrNil(this.tEB.txO.title))
        {
          this.tEQ.setText(this.tEB.txO.title);
          ((RelativeLayout.LayoutParams)localObject).addRule(15, 0);
        }
        else
        {
          this.tEQ.setVisibility(8);
          ((RelativeLayout.LayoutParams)localObject).addRule(15, -1);
          continue;
          if (((String)localObject).equals("0"))
          {
            i = 0;
            continue;
            if (((String)localObject).equals("-1"))
            {
              i = 1;
              continue;
              if (((String)localObject).equals("3"))
              {
                i = 2;
                continue;
                if (((String)localObject).equals("4"))
                {
                  i = 3;
                  continue;
                  if (((String)localObject).equals("2"))
                  {
                    i = 4;
                    continue;
                    if (((String)localObject).equals("1"))
                    {
                      i = 5;
                      continue;
                      this.tES.setEnabled(false);
                    }
                  }
                }
              }
            }
          }
        }
      }
    label693: label854: this.tED = this.tEB.txP.tzW;
    this.tEE = this.tEB.txP.ttg;
    this.tzY = this.tEB.txP.tzY;
    this.tEF = this.tEB.txP;
    this.tEO.setUrl(this.tEB.txP.tzU);
    this.tEP.setText(this.tEB.txP.tzV);
    this.tEQ.setText(getString(2131304516));
    this.tEQ.setVisibility(0);
    this.tEO.setRoundCorner(true);
    this.tES.setEnabled(true);
    this.tES.setBackgroundResource(2130838000);
    Object localObject = (RelativeLayout.LayoutParams)this.tEQ.getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject).addRule(15, 0);
    this.tEQ.setLayoutParams((ViewGroup.LayoutParams)localObject);
    if (this.tEB.txN.ttW > 0L)
    {
      if (!bo.isNullOrNil(this.tEB.txP.tzX))
      {
        this.tES.setVisibility(0);
        this.tES.setText(this.tEB.txP.tzX);
        this.tER.setVisibility(8);
      }
      localObject = (WalletOrderInfoNewUI.a)this.tEH.get(this.tEB.txN.ttW);
      if (localObject != null)
      {
        if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject).tzU))
          this.tEO.setUrl(((WalletOrderInfoNewUI.a)localObject).tzU);
        if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject).tzV))
          this.tEP.setText(((WalletOrderInfoNewUI.a)localObject).tzV);
        if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject).tzX))
        {
          this.tES.setText(((WalletOrderInfoNewUI.a)localObject).tzX);
          this.tES.setBackgroundResource(2130840727);
        }
        if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject).tzW))
          this.tED = ((WalletOrderInfoNewUI.a)localObject).tzW;
        if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject).ttg))
          this.tEE = ((WalletOrderInfoNewUI.a)localObject).ttg;
      }
    }
    while (true)
    {
      localObject = new WalletBindCardResultUI.5(this);
      this.tEN.setOnClickListener((View.OnClickListener)localObject);
      this.tES.setOnClickListener((View.OnClickListener)localObject);
      localObject = this.tEP.getText();
      if ((bo.ac((CharSequence)localObject)) || (((CharSequence)localObject).length() <= 9))
        break;
      this.tEP.setText(((CharSequence)localObject).subSequence(0, 9));
      this.tEP.append("...");
      break;
      this.tES.setVisibility(8);
      this.tER.setVisibility(8);
    }
  }

  private void cRq()
  {
    int i = 0;
    AppMethodBeat.i(47206);
    if (!this.tEC)
    {
      iy localiy = new iy();
      localiy.cEc.requestCode = 4;
      iy.a locala = localiy.cEc;
      if (this.mBundle.getBoolean("intent_pay_end", false))
        i = -1;
      locala.bFZ = i;
      com.tencent.mm.sdk.b.a.xxA.m(localiy);
      this.tEC = true;
    }
    AppMethodBeat.o(47206);
  }

  public final void AM(int paramInt)
  {
    AppMethodBeat.i(47208);
    this.mController.contentView.setVisibility(paramInt);
    AppMethodBeat.o(47208);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(47207);
    boolean bool;
    if ((paramm instanceof x))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (x)paramm;
        paramm = new WalletOrderInfoNewUI.a(paramString.hwh);
        if (this.tEG != null)
        {
          this.tEH.put(paramString.tuv, paramm);
          cRp();
          cRn();
        }
      }
      else
      {
        AppMethodBeat.o(47207);
        bool = false;
      }
    while (true)
    {
      return bool;
      if (!this.tEU)
        break;
      this.tEH.put(paramString.tuv, paramm);
      cRp();
      cRn();
      break;
      if (!(paramm instanceof com.tencent.mm.plugin.wallet_core.c.m))
        break;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.wallet_core.c.m)paramm;
        paramm = paramString.tud;
        if ((this.tEJ != null) && (this.tEJ.txN.ttW == paramString.tuf.txN.ttW))
        {
          ab.i("MicroMsg.WalletBindCardResultUI", "activityAwardState: %s", new Object[] { this.tEJ });
          this.tEK = paramm;
          cRp();
          cRn();
          if ((!bo.isNullOrNil(paramString.ehr)) && (!"3".equals(paramm)))
            this.tES.setText(paramString.ehr);
        }
        if ((!"-1".equals(paramm)) && (!"0".equals(paramm)) && (!bo.isNullOrNil(paramString.tue)))
          com.tencent.mm.ui.base.h.b(this, paramString.tue, "", true);
        while (!"0".equals(paramm))
        {
          AppMethodBeat.o(47207);
          bool = true;
          break;
        }
        if (!bo.isNullOrNil(paramString.tue));
        for (paramString = paramString.tue; ; paramString = getString(2131305156))
        {
          Toast.makeText(this, paramString, 0).show();
          break;
        }
      }
      paramm = paramString;
      if (bo.isNullOrNil(paramString))
        paramm = getString(2131305389);
      com.tencent.mm.ui.base.h.a(this, paramm, null, false, new WalletBindCardResultUI.8(this));
      AppMethodBeat.o(47207);
      bool = true;
    }
  }

  public final void done()
  {
    AppMethodBeat.i(47203);
    Bundle localBundle = new Bundle();
    if (this.tEX != null)
    {
      this.tEX.a(this, 0, localBundle);
      AppMethodBeat.o(47203);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(47203);
    }
  }

  public final int getLayoutId()
  {
    return 2130971073;
  }

  public final void initView()
  {
    AppMethodBeat.i(47196);
    if (getSupportActionBar() != null)
      getSupportActionBar().hide();
    this.tEM = ((ImageView)findViewById(2131828704));
    this.pWB = ((TextView)findViewById(2131828705));
    this.tEL = ((Button)findViewById(2131828708));
    showHomeBtn(false);
    enableBackMenu(false);
    String str = getString(2131296944);
    if ((this.tEB != null) && (!bo.isNullOrNil(this.tEB.txG)))
      this.tEL.setText(this.tEB.txG);
    while (true)
    {
      this.tEL.setOnClickListener(new WalletBindCardResultUI.2(this));
      this.tET = ((ViewGroup)findViewById(2131828707));
      this.tEN = ((ViewGroup)findViewById(2131827111));
      this.tEO = ((CdnImageView)findViewById(2131827112));
      this.tEO.setUseSdcardCache(true);
      this.tEP = ((TextView)findViewById(2131827114));
      this.tEQ = ((TextView)findViewById(2131827113));
      this.tES = ((Button)findViewById(2131827115));
      this.tER = findViewById(2131826995);
      this.tET.setVisibility(4);
      cRo();
      cRp();
      cRn();
      if ((!bo.isNullOrNil(this.tEB.txI)) && (!bo.isNullOrNil(this.tEB.txJ)))
        ((TextView)findViewById(2131828706)).setText(getString(2131304610, new Object[] { this.tEB.txI, this.tEB.txJ }));
      AppMethodBeat.o(47196);
      return;
      this.tEL.setText(str);
    }
  }

  public final void jX(int paramInt)
  {
    AppMethodBeat.i(47209);
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
    if (this.tEB.txN == null);
    for (String str = ""; ; str = bo.bc(this.tEB.txN.ttW, ""))
    {
      localh.e(14877, new Object[] { str, this.tEB.txK, Integer.valueOf(paramInt), this.tEB.pbn });
      AppMethodBeat.o(47209);
      return;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(47201);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.WalletBindCardResultUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      ab.i("MicroMsg.WalletBindCardResultUI", "do query pay arawrd");
      a(new x(this.tEG.tuv, this.tEG.tIF, this.tEG.tIG, this.tEG.tIH, this.tEG.tBC, this.tEG.tII, this.tEB.pbn, this.tEB.txK, this.tEB.txL, this.tEB.txL), true, true);
    }
    AppMethodBeat.o(47201);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47194);
    super.onCreate(paramBundle);
    if (d.iW(21))
    {
      if (!d.iW(23))
        break label176;
      getWindow().setStatusBarColor(-1);
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    while (true)
    {
      AM(4);
      com.tencent.mm.wallet_core.a.aE(this);
      this.pVL = ((PayInfo)this.mBundle.getParcelable("key_pay_info"));
      this.mBundle.getInt("key_pay_type", -1);
      BindCardOrder localBindCardOrder = (BindCardOrder)this.mBundle.getParcelable("key_bindcard_value_result");
      paramBundle = localBindCardOrder;
      if (localBindCardOrder == null)
        paramBundle = new BindCardOrder();
      this.tEB = paramBundle;
      AM(0);
      initView();
      this.tEX = dOD();
      cRo();
      jX(1);
      nf(1979);
      com.tencent.mm.sdk.b.a.xxA.c(this.pap);
      this.tEW = true;
      AppMethodBeat.o(47194);
      return;
      label176: getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
    }
  }

  @Deprecated
  public Dialog onCreateDialog(int paramInt)
  {
    AppMethodBeat.i(47202);
    Dialog localDialog = com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131305064), getResources().getStringArray(2131755065), "", new h.c()
    {
      public final void iE(int paramAnonymousInt)
      {
        AppMethodBeat.i(47192);
        switch (paramAnonymousInt)
        {
        default:
        case 0:
        }
        while (true)
        {
          AppMethodBeat.o(47192);
          return;
          Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + WalletBindCardResultUI.i(WalletBindCardResultUI.this)));
          localIntent.addFlags(268435456);
          WalletBindCardResultUI.this.startActivity(localIntent);
        }
      }
    });
    AppMethodBeat.o(47202);
    return localDialog;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47205);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.xxA.d(this.pap);
    ng(1979);
    AppMethodBeat.o(47205);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(47204);
    boolean bool;
    if (paramInt == 4)
    {
      done();
      bool = true;
      AppMethodBeat.o(47204);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(47204);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(47195);
    super.onResume();
    ab.i("MicroMsg.WalletBindCardResultUI", "onResume, isFirstInit: %s activityPromotions: %s, isClickTinyappActivity: %s, isClickActivity: %s, recommendTinyAppInfo: %s", new Object[] { Boolean.valueOf(this.tEW), this.tEJ, Boolean.valueOf(this.tEU), Boolean.valueOf(this.tEV), this.tEF });
    if (this.tEW)
    {
      this.tEW = false;
      AppMethodBeat.o(47195);
    }
    while (true)
    {
      return;
      if ((this.tEJ != null) && (this.tEV))
      {
        a(new x(this.tEJ.txN.ttW, this.tEJ.txN.tzO, this.tEJ.txN.tzP, this.tEJ.txN.tzQ, this.tEJ.txN.tzN, this.tEJ.txN.tzR, this.tEB.pbn, this.tEB.txK, this.tEB.txL, this.tEB.txL), true, true);
        AppMethodBeat.o(47195);
      }
      else
      {
        if ((this.tEU) && (this.tEF != null))
          a(new x(this.tEB.txN.ttW, this.tEB.txN.tzO, this.tEB.txN.tzP, this.tEB.txN.tzQ, this.tEB.txN.tzR, this.tEB.txN.tzN, this.tEB.pbn, this.tEB.txK, this.tEB.txL, this.tEB.txL), true, true);
        AppMethodBeat.o(47195);
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
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI
 * JD-Core Version:    0.6.2
 */