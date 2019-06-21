package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.model.t;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

public class WalletCardImportUI extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private static final String[] tGn = { "ABC_DEBIT", "ABC_CREDIT", "CITIC_CREDIT", "CMBC_DEBIT", "HSBC_DEBIT" };
  private Button gEZ;
  private Dialog mDialog;
  private com.tencent.mm.sdk.platformtools.ak mHandler;
  private String nQt;
  private String nQu;
  private PayInfo pVL;
  private Orders pWy;
  private WalletFormView tEq;
  private WalletFormView tFA;
  private WalletFormView tFD;
  private WalletFormView tFE;
  private CheckBox tFI;
  private String tFJ;
  private WalletFormView tFS;
  private WalletFormView tFj;
  private WalletFormView tFk;
  private WalletFormView tFm;
  private WalletFormView tFn;
  private WalletFormView tFu;
  private WalletFormView tFv;
  private WalletFormView tFw;
  private WalletFormView tFx;
  private WalletFormView tFy;
  private WalletFormView tFz;
  private TextView tGo;
  private MMScrollView tGp;
  private Bankcard tGq;
  private CheckBox tGr;
  private BaseAdapter tGs;
  private Authen toh;
  private WalletFormView trX;
  private int tsb;
  private ElementQuery tvu;

  public WalletCardImportUI()
  {
    AppMethodBeat.i(47278);
    this.mDialog = null;
    this.tFD = null;
    this.mHandler = new com.tencent.mm.sdk.platformtools.ak();
    this.tvu = new ElementQuery();
    this.toh = new Authen();
    this.pWy = null;
    this.pVL = null;
    this.tGq = null;
    this.tsb = 1;
    this.tGs = new WalletCardImportUI.9(this);
    AppMethodBeat.o(47278);
  }

  private boolean arW()
  {
    AppMethodBeat.i(47287);
    if (!this.tGr.isChecked());
    for (boolean bool = false; ; bool = true)
    {
      if (bool)
      {
        this.gEZ.setEnabled(true);
        this.gEZ.setClickable(true);
      }
      while (true)
      {
        AppMethodBeat.o(47287);
        return bool;
        this.gEZ.setEnabled(false);
        this.gEZ.setClickable(false);
      }
    }
  }

  private static boolean b(WalletFormView paramWalletFormView, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(47282);
    if (!bo.isNullOrNil(paramString))
    {
      KeyListener localKeyListener = paramWalletFormView.getKeyListener();
      paramWalletFormView.setKeyListener(null);
      paramWalletFormView.setEnabled(false);
      paramWalletFormView.setClickable(false);
      paramWalletFormView.setText(paramString);
      paramWalletFormView.setKeyListener(localKeyListener);
      paramWalletFormView.setVisibility(0);
      bool = true;
      AppMethodBeat.o(47282);
    }
    while (true)
    {
      return bool;
      paramWalletFormView.setVisibility(8);
      AppMethodBeat.o(47282);
    }
  }

  private void cRs()
  {
    AppMethodBeat.i(47284);
    label197: Object localObject;
    if (arW())
    {
      d.cSP();
      this.toh = new Authen();
      this.mBundle.putBoolean("key_is_follow_bank_username", this.tFI.isChecked());
      if ((this.tGq != null) && (!bo.isNullOrNil(this.tGq.txa)))
      {
        this.toh.tlk = this.tGq.txa;
        this.toh.pbo = this.tGq.field_bindSerial;
        this.toh.pbn = this.tGq.field_bankcardType;
        this.toh.twf = this.tGq.twf;
        this.toh.twc = this.mBundle.getString("key_pwd1");
        this.toh.token = this.mBundle.getString("kreq_token");
        com.tencent.mm.wallet_core.a.aE(this);
        if (dOE().p(new Object[] { this.toh, this.pWy }))
        {
          ab.i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
          AppMethodBeat.o(47284);
        }
      }
      else
      {
        localObject = this.mBundle.getString("key_card_id");
        if (this.tFE.getVisibility() != 0)
          break label614;
        localObject = this.tFE.getText();
      }
    }
    label614: 
    while (true)
    {
      this.toh.pGr = ((PayInfo)this.mBundle.getParcelable("key_pay_info"));
      this.toh.twg = ((String)localObject);
      this.toh.pbn = this.tvu.pbn;
      this.toh.twf = this.tsb;
      this.toh.twc = this.mBundle.getString("key_pwd1");
      if (!bo.isNullOrNil(this.tFk.getText()))
        this.toh.twh = this.tFk.getText();
      this.toh.tuk = this.tFn.getText();
      this.toh.twl = this.tFu.getText();
      this.toh.twm = this.tFv.getText();
      this.toh.country = this.tFJ;
      this.toh.duc = this.nQt;
      this.toh.dud = this.nQu;
      this.toh.fBg = this.tFx.getText();
      this.toh.nuN = this.tFy.getText();
      this.toh.gIO = this.tFz.getText();
      this.toh.dtV = this.tFA.getText();
      localObject = e.atu(this.toh.tuk);
      this.mBundle.putString("key_mobile", (String)localObject);
      localObject = this.mBundle;
      if (this.tvu.tuo == 2);
      for (boolean bool = true; ; bool = false)
      {
        ((Bundle)localObject).putBoolean("key_is_oversea", bool);
        this.toh.twe = this.trX.getText();
        this.toh.twd = this.tEq.getText();
        this.toh.twi = this.tFj.getText();
        ab.d("MicroMsg.WalletCardElmentUI", "payInfo " + this.toh.pGr + " elemt.bankcardTag : " + this.tvu.tuo);
        break;
      }
      ab.e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
      AppMethodBeat.o(47284);
      break label197;
    }
  }

  private void cRv()
  {
    AppMethodBeat.i(47283);
    this.tFu.setVisibility(8);
    this.tFv.setVisibility(8);
    this.tFw.setVisibility(8);
    this.tFx.setVisibility(8);
    this.tFy.setVisibility(8);
    this.tFz.setVisibility(8);
    this.tFA.setVisibility(8);
    AppMethodBeat.o(47283);
  }

  private void cu()
  {
    AppMethodBeat.i(47281);
    Object localObject1;
    label94: Object localObject2;
    label138: Object localObject3;
    if (this.tGq != null)
    {
      findViewById(2131828709).setVisibility(0);
      if (!bo.isNullOrNil(this.mBundle.getString("key_bank_username")))
      {
        localObject1 = this.mBundle.getString("key_recommand_desc");
        if (bo.isNullOrNil((String)localObject1))
        {
          this.tFI.setText(getString(2131304669, new Object[] { this.tGq.field_bankName }));
          this.tFI.setVisibility(0);
          cRv();
          if ((bo.isNullOrNil(this.tGq.field_bankcardTail)) || (!b(this.tFE, this.tGq.twO)))
            break label523;
          localObject1 = this.tFE;
          localObject2 = this.tFE;
          if (!this.tGq.cPe())
            break label539;
          localObject3 = getString(2131304760);
          label156: if ((bo.isNullOrNil(this.tGq.field_bankName)) || (!b(this.tFS, this.tGq.field_bankName + " " + (String)localObject3)))
            break label550;
          localObject2 = localObject1;
          if (localObject1 == null)
            localObject2 = this.tFS;
          localObject3 = this.tFS;
          localObject1 = localObject2;
          localObject2 = localObject3;
          label229: localObject3 = localObject2;
          localObject2 = localObject1;
          if (b(this.tEq, this.tGq.field_trueName))
          {
            localObject2 = localObject1;
            if (localObject1 == null)
              localObject2 = this.tEq;
            localObject3 = this.tEq;
          }
          localObject1 = localObject2;
          if (b(this.tFm, r.cPQ().Z(this.mController.ylL, this.tGq.twf)))
          {
            localObject1 = localObject2;
            if (localObject2 == null)
              localObject1 = this.tFm;
            localObject3 = this.tFm;
          }
          localObject2 = localObject3;
          localObject3 = localObject1;
          if (b(this.trX, this.tGq.twN))
          {
            localObject3 = localObject1;
            if (localObject1 == null)
              localObject3 = this.trX;
            localObject2 = this.trX;
          }
          localObject1 = localObject2;
          localObject2 = localObject3;
          if (b(this.tFn, this.tGq.field_mobile))
          {
            localObject2 = localObject3;
            if (localObject3 == null)
              localObject2 = this.tFn;
            localObject1 = this.tFn;
          }
          localObject3 = localObject1;
          localObject1 = localObject2;
          if (b(this.tFk, this.tGq.twh))
          {
            localObject1 = localObject2;
            if (localObject2 == null)
              localObject1 = this.tFk;
            localObject3 = this.tFk;
          }
          localObject2 = localObject1;
          if (b(this.tFj, this.tGq.twP))
          {
            localObject2 = localObject1;
            if (localObject1 == null)
              localObject2 = this.tFj;
            localObject3 = this.tFj;
          }
          ((WalletFormView)localObject2).setBackgroundResource(2130838396);
          ((WalletFormView)localObject3).setBackgroundResource(2130838396);
          if (!r.cPI().cQi())
            break label562;
          this.gEZ.setText(2131304681);
          AppMethodBeat.o(47281);
        }
      }
    }
    while (true)
    {
      return;
      this.tFI.setText((CharSequence)localObject1);
      break;
      this.tFI.setVisibility(8);
      break label94;
      label523: this.tFE.setVisibility(8);
      localObject2 = null;
      localObject1 = null;
      break label138;
      label539: localObject3 = getString(2131304780);
      break label156;
      label550: this.tFS.setVisibility(8);
      break label229;
      label562: this.gEZ.setText(2131304679);
      AppMethodBeat.o(47281);
      continue;
      AppMethodBeat.o(47281);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(47285);
    ab.d("MicroMsg.WalletCardElmentUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.mBundle;
      ab.d("MicroMsg.WalletCardElmentUI", "PayInfo  " + this.pVL);
      if ((paramm instanceof y))
      {
        paramString.putBoolean("intent_bind_end", true);
        com.tencent.mm.wallet_core.a.j(this, paramString);
        h.bQ(this, getString(2131304583));
        AppMethodBeat.o(47285);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(47285);
      bool = false;
      continue;
      AppMethodBeat.o(47285);
      bool = false;
    }
  }

  public final int getLayoutId()
  {
    return 2130971076;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(47288);
    arW();
    AppMethodBeat.o(47288);
  }

  public final void initView()
  {
    AppMethodBeat.i(47280);
    this.tFE = ((WalletFormView)findViewById(2131828712));
    com.tencent.mm.wallet_core.ui.formview.a.b(this.tFE);
    this.tFn = ((WalletFormView)findViewById(2131828579));
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.tFn);
    this.tEq = ((WalletFormView)findViewById(2131828681));
    com.tencent.mm.wallet_core.ui.formview.a.e(this, this.tEq);
    this.tFm = ((WalletFormView)findViewById(2131828719));
    this.trX = ((WalletFormView)findViewById(2131828720));
    com.tencent.mm.wallet_core.ui.formview.a.d(this.trX);
    this.tFS = ((WalletFormView)findViewById(2131823369));
    this.tFk = ((WalletFormView)findViewById(2131826502));
    com.tencent.mm.wallet_core.ui.formview.a.b(this, this.tFk);
    this.tFj = ((WalletFormView)findViewById(2131826504));
    com.tencent.mm.wallet_core.ui.formview.a.a(this, this.tFj);
    this.tGo = ((TextView)findViewById(2131826506));
    this.tFu = ((WalletFormView)findViewById(2131828731));
    this.tFv = ((WalletFormView)findViewById(2131828732));
    this.tFw = ((WalletFormView)findViewById(2131828733));
    this.tFx = ((WalletFormView)findViewById(2131828734));
    this.tFy = ((WalletFormView)findViewById(2131828735));
    this.tFz = ((WalletFormView)findViewById(2131828736));
    this.tFA = ((WalletFormView)findViewById(2131828737));
    com.tencent.mm.wallet_core.ui.formview.a.e(this.tFA);
    this.tGr = ((CheckBox)findViewById(2131828739));
    this.tFI = ((CheckBox)findViewById(2131828740));
    this.gEZ = ((Button)findViewById(2131822846));
    this.tGp = ((MMScrollView)findViewById(2131823366));
    MMScrollView localMMScrollView = this.tGp;
    localMMScrollView.a(localMMScrollView, localMMScrollView);
    this.tGp.setOnSizeChangeListener(new WalletCardImportUI.1(this));
    this.tEq.setOnInputValidChangeListener(this);
    this.tFE.setOnInputValidChangeListener(this);
    this.tFm.setOnInputValidChangeListener(this);
    this.trX.setOnInputValidChangeListener(this);
    this.tFn.setOnInputValidChangeListener(this);
    this.tFk.setOnInputValidChangeListener(this);
    this.tFj.setOnInputValidChangeListener(this);
    this.tFu.setOnInputValidChangeListener(this);
    this.tFv.setOnInputValidChangeListener(this);
    this.tFw.setOnInputValidChangeListener(this);
    this.tFx.setOnInputValidChangeListener(this);
    this.tFy.setOnInputValidChangeListener(this);
    this.tFz.setOnInputValidChangeListener(this);
    this.tFA.setOnInputValidChangeListener(this);
    this.tEq.setOnEditorActionListener(this);
    this.tFE.setOnEditorActionListener(this);
    this.tFm.setOnEditorActionListener(this);
    this.trX.setOnEditorActionListener(this);
    this.tFn.setOnEditorActionListener(this);
    this.tFk.setOnEditorActionListener(this);
    this.tFj.setOnEditorActionListener(this);
    this.tFu.setOnEditorActionListener(this);
    this.tFv.setOnEditorActionListener(this);
    this.tFw.setOnEditorActionListener(this);
    this.tFx.setOnEditorActionListener(this);
    this.tFy.setOnEditorActionListener(this);
    this.tFz.setOnEditorActionListener(this);
    this.tFA.setOnEditorActionListener(this);
    this.tFS.setOnClickListener(new WalletCardImportUI.2(this));
    this.tFm.setOnClickListener(new WalletCardImportUI.3(this));
    this.tGr.setChecked(true);
    this.tGr.setOnCheckedChangeListener(new WalletCardImportUI.4(this));
    this.tFI.setChecked(true);
    findViewById(2131826067).setOnClickListener(new WalletCardImportUI.5(this));
    this.tFw.setOnClickListener(new WalletCardImportUI.6(this));
    this.gEZ.setOnClickListener(new WalletCardImportUI.7(this));
    cu();
    arW();
    AppMethodBeat.o(47280);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(47286);
    ab.i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(47286);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      arW();
      AppMethodBeat.o(47286);
      break;
      this.tvu = ((ElementQuery)paramIntent.getParcelableExtra("elemt_query"));
      cu();
      continue;
      String str1 = paramIntent.getStringExtra("CountryName");
      String str2 = paramIntent.getStringExtra("Country");
      this.tFJ = (str1 + "|" + str2);
      String str3 = paramIntent.getStringExtra("ProviceName");
      String str4 = paramIntent.getStringExtra("CityName");
      if (!bo.isNullOrNil(paramIntent.getStringExtra("Contact_City")))
      {
        this.nQt = (str3 + "|" + paramIntent.getStringExtra("Contact_Province"));
        this.nQu = (str4 + "|" + paramIntent.getStringExtra("Contact_City"));
        this.tFw.setText(str1 + " " + str4);
      }
      while (true)
      {
        if ((!"US".equals(str2)) && (!"CA".equals(str2)) && (!this.tvu.tyR))
          break label420;
        this.tFz.setVisibility(0);
        break;
        if (!bo.isNullOrNil(paramIntent.getStringExtra("Contact_Province")))
        {
          this.nQu = (str3 + "|" + paramIntent.getStringExtra("Contact_Province"));
          this.tFw.setText(str1 + " " + str3);
        }
        else
        {
          this.nQu = this.tFJ;
          this.tFw.setText(str1);
        }
      }
      label420: this.tFz.setVisibility(8);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47279);
    super.onCreate(paramBundle);
    setMMTitle(2131304785);
    this.tvu = ((ElementQuery)this.mBundle.getParcelable("elemt_query"));
    this.pWy = ((Orders)this.mBundle.getParcelable("key_orders"));
    this.pVL = ((PayInfo)this.mBundle.getParcelable("key_pay_info"));
    this.tGq = ((Bankcard)this.mBundle.getParcelable("key_import_bankcard"));
    if (this.pVL == null)
      this.pVL = new PayInfo();
    ab.d("MicroMsg.WalletCardElmentUI", "mPayInfo " + this.pVL);
    initView();
    this.tGp.pageScroll(33);
    d.a(this, this.mBundle, 3);
    AppMethodBeat.o(47279);
  }

  public Dialog onCreateDialog(int paramInt)
  {
    AppMethodBeat.i(47291);
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
      AppMethodBeat.o(47291);
    case 1:
    }
    while (true)
    {
      return localObject;
      localObject = new i(this, 2131493549);
      ((Dialog)localObject).setContentView(2130971114);
      ListView localListView = (ListView)((Dialog)localObject).findViewById(2131821054);
      localListView.setAdapter(this.tGs);
      localListView.setOnItemClickListener(new WalletCardImportUI.8(this));
      AppMethodBeat.o(47291);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47290);
    if ((this.mDialog != null) && (this.mDialog.isShowing()))
    {
      this.mDialog.dismiss();
      this.mDialog = null;
    }
    super.onDestroy();
    AppMethodBeat.o(47290);
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(47289);
    ab.d("MicroMsg.WalletCardElmentUI", "onEditorAction actionId : ".concat(String.valueOf(paramInt)));
    boolean bool;
    switch (paramInt)
    {
    default:
      if (this.tFD == null)
        cRs();
      bool = false;
      AppMethodBeat.o(47289);
      return bool;
    case 5:
    }
    if (this.tFD != null)
      if ((this.tFD.isEnabled()) && (!this.tFD.isClickable()) && (this.tFD.dOQ()))
        this.tFD.dOS();
    while (true)
    {
      bool = true;
      AppMethodBeat.o(47289);
      break;
      this.tFD.performClick();
      continue;
      cRs();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI
 * JD-Core Version:    0.6.2
 */