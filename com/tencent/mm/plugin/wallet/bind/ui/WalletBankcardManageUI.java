package com.tencent.mm.plugin.wallet.bind.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.f;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;

public class WalletBankcardManageUI extends WalletBaseUI
{
  private AdapterView.OnItemClickListener amz;
  private View.OnClickListener gKK;
  private ListView mListView;
  private com.tencent.mm.plugin.wallet_core.ui.s onl;
  protected ArrayList<Bankcard> tlM;
  private ArrayList<Bankcard> tlN;
  protected ak tlO;
  private ListView tlP;
  private a tlQ;
  private a tlR;
  private TextView tlS;
  private View tlT;
  private View tlU;
  private View tlV;
  private CdnImageView tlW;
  private TextView tlX;
  private n tlY;

  public WalletBankcardManageUI()
  {
    AppMethodBeat.i(45775);
    this.onl = new com.tencent.mm.plugin.wallet_core.ui.s();
    this.tlM = new ArrayList();
    this.tlN = new ArrayList();
    this.tlO = null;
    this.mListView = null;
    this.tlP = null;
    this.tlQ = null;
    this.tlR = null;
    this.gKK = new WalletBankcardManageUI.8(this);
    this.amz = new WalletBankcardManageUI.9(this);
    AppMethodBeat.o(45775);
  }

  private void a(n paramn)
  {
    AppMethodBeat.i(45788);
    Object localObject = (TextView)findViewById(2131828695);
    TextView localTextView;
    if (com.tencent.mm.plugin.wallet.b.a.Hn(paramn.field_red_dot_index))
    {
      ab.i("MicroMsg.WalletBankcardManageUI", "red point update");
      ((TextView)localObject).setVisibility(0);
      localTextView = (TextView)findViewById(2131828694);
      if (paramn.field_is_overdue != 1)
        break label101;
      ab.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.is_overdue = true");
      localTextView.setText(2131304606);
      localTextView.setTextColor(getResources().getColor(2131690384));
      label81: localTextView.setVisibility(0);
      AppMethodBeat.o(45788);
    }
    while (true)
    {
      return;
      ((TextView)localObject).setVisibility(8);
      break;
      label101: if (!bo.isNullOrNil(paramn.field_tips))
      {
        ab.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.tips not null");
        localTextView.setText(paramn.field_tips);
        break label81;
      }
      if (!bo.isNullOrNil(paramn.field_available_otb))
      {
        ab.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.available_otb not null");
        int i = paramn.field_available_otb.indexOf(".");
        localObject = paramn.field_available_otb;
        paramn = (n)localObject;
        if (i > 0)
          paramn = ((String)localObject).substring(0, i);
        localTextView.setText(getString(2131304605, new Object[] { paramn }));
        break label81;
      }
      localTextView.setVisibility(8);
      AppMethodBeat.o(45788);
    }
  }

  private void cNt()
  {
    AppMethodBeat.i(45783);
    g.RQ();
    f localf = f.acw((String)g.RP().Ry().get(ac.a.xTa, ""));
    if ((localf != null) && (!bo.isNullOrNil(localf.txz)))
    {
      if (!bo.isNullOrNil(localf.txA))
        this.tlW.setUrl(localf.txA);
      this.tlX.setText(localf.txz);
      if (localf.txv == 1)
      {
        this.tlV.setOnClickListener(new WalletBankcardManageUI.6(this, localf));
        this.tlV.setVisibility(0);
        AppMethodBeat.o(45783);
      }
    }
    while (true)
    {
      return;
      if (localf.txv == 2)
      {
        this.tlV.setOnClickListener(new WalletBankcardManageUI.7(this, localf));
        this.tlV.setVisibility(0);
        AppMethodBeat.o(45783);
      }
      else
      {
        ab.w("MicroMsg.WalletBankcardManageUI", "unknown type: %d", new Object[] { Integer.valueOf(localf.txv) });
        this.tlV.setVisibility(8);
        AppMethodBeat.o(45783);
      }
    }
  }

  private void cu()
  {
    AppMethodBeat.i(45787);
    if (this.tlO.cQl())
    {
      this.tlS.setEnabled(false);
      if ((this.tlM == null) || (this.tlM.size() <= 0))
        break label193;
      this.mListView.setVisibility(0);
      label49: if ((this.tlN == null) || (this.tlN.size() <= 0))
        break label205;
      this.tlP.setVisibility(0);
      label74: if ((this.tlY == null) || (this.tlY.field_is_show_entry != 1))
        break label217;
      ((TextView)this.tlU.findViewById(2131828693)).setText(this.tlY.field_title);
      a(this.tlY);
      this.tlU.setVisibility(0);
    }
    while (true)
    {
      this.tlQ.W(this.tlM);
      this.tlQ.notifyDataSetChanged();
      this.tlR.W(this.tlN);
      this.tlR.notifyDataSetChanged();
      this.tlS.setEnabled(true);
      AppMethodBeat.o(45787);
      return;
      this.tlS.setEnabled(true);
      break;
      label193: this.mListView.setVisibility(8);
      break label49;
      label205: this.tlP.setVisibility(8);
      break label74;
      label217: this.tlU.setVisibility(8);
    }
  }

  public final boolean bNf()
  {
    return false;
  }

  public final void c(Bankcard paramBankcard)
  {
    AppMethodBeat.i(45785);
    g.RQ();
    String str = (String)g.RP().Ry().get(ac.a.xNy, "");
    if (!bo.isNullOrNil(str))
    {
      ab.i("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is not null");
      Intent localIntent = new Intent();
      paramBankcard = String.format("bank_type=%s&card_tail=%s&bind_serial=%s", new Object[] { paramBankcard.field_bankcardType, paramBankcard.field_bankcardTail, paramBankcard.field_bindSerial });
      if (str.contains("?"))
      {
        paramBankcard = str + "&" + paramBankcard;
        localIntent.putExtra("rawUrl", paramBankcard);
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("disable_bounce_scroll", true);
        d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
        AppMethodBeat.o(45785);
      }
    }
    while (true)
    {
      return;
      paramBankcard = str + "?" + paramBankcard;
      break;
      ab.e("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is null");
      AppMethodBeat.o(45785);
    }
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45791);
    ab.i("MicroMsg.WalletBankcardManageUI", "onSceneEnd");
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof y)))
    {
      this.tlY = r.cPI().tCW;
      cNw();
      bool = true;
      AppMethodBeat.o(45791);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(45791);
    }
  }

  protected a cNu()
  {
    AppMethodBeat.i(45784);
    a locala = new a(this, this.tlM);
    AppMethodBeat.o(45784);
    return locala;
  }

  protected void cNv()
  {
    AppMethodBeat.i(45789);
    WalletBankcardManageUI.10 local10 = new WalletBankcardManageUI.10(this, new Bundle());
    ai localai = new ai();
    this.onl.a(new WalletBankcardManageUI.2(this, local10), localai.cQe());
    AppMethodBeat.o(45789);
  }

  protected final void cNw()
  {
    AppMethodBeat.i(45790);
    AM(0);
    this.tlO.f(this.tlM, this.tlN);
    cu();
    cNt();
    AppMethodBeat.o(45790);
  }

  protected void d(Bankcard paramBankcard)
  {
    AppMethodBeat.i(45786);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_bankcard", paramBankcard);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.bind.a.class, localBundle, null);
    AppMethodBeat.o(45786);
  }

  public void finish()
  {
    AppMethodBeat.i(45792);
    if (!getIntent().getBooleanExtra("intent_finish_self", false))
    {
      Intent localIntent = new Intent();
      localIntent.addFlags(67108864);
      d.b(this, "mall", ".ui.MallIndexUI", localIntent);
    }
    super.finish();
    AppMethodBeat.o(45792);
  }

  public final int getLayoutId()
  {
    return 2130971066;
  }

  public final void initView()
  {
    AppMethodBeat.i(45782);
    setBackBtn(new WalletBankcardManageUI.3(this));
    this.tlS = ((TextView)findViewById(2131828690));
    this.tlS.setOnClickListener(new WalletBankcardManageUI.4(this));
    this.mListView = ((ListView)findViewById(2131828683));
    this.tlQ = cNu();
    this.mListView.setAdapter(this.tlQ);
    this.mListView.setOnItemClickListener(this.amz);
    this.tlP = ((ListView)findViewById(2131828684));
    this.tlR = new a(this, this.tlN);
    this.tlP.setAdapter(this.tlR);
    this.tlP.setOnItemClickListener(this.amz);
    this.tlT = findViewById(2131828685);
    this.tlT.setOnClickListener(this.gKK);
    this.tlU = findViewById(2131828691);
    this.tlU.setOnClickListener(this.gKK);
    this.tlV = findViewById(2131828686);
    this.tlW = ((CdnImageView)findViewById(2131828687));
    this.tlX = ((TextView)findViewById(2131828688));
    cNt();
    findViewById(2131828696).setOnClickListener(this.gKK);
    uo localuo = new uo();
    localuo.cQJ.cQL = "4";
    localuo.callback = new WalletBankcardManageUI.5(this, localuo);
    com.tencent.mm.sdk.b.a.xxA.m(localuo);
    AppMethodBeat.o(45782);
  }

  protected void mV(boolean paramBoolean)
  {
    AppMethodBeat.i(45779);
    if (paramBoolean)
    {
      a(new y(null, 12), true, false);
      AppMethodBeat.o(45779);
    }
    while (true)
    {
      return;
      a(new y(null, 12), false, false);
      AppMethodBeat.o(45779);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45780);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
      {
        this.onl.bNo();
        AppMethodBeat.o(45780);
      }
    while (true)
    {
      return;
      this.onl.cancel();
      AppMethodBeat.o(45780);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45776);
    this.yll = true;
    super.onCreate(paramBundle);
    AM(4);
    ab.i("MicroMsg.WalletBankcardManageUI", "index Oncreate");
    com.tencent.mm.plugin.wallet.a.s.cNC();
    this.tlO = com.tencent.mm.plugin.wallet.a.s.cND();
    setMMTitle(2131304854);
    xE(this.mController.ylL.getResources().getColor(2131689913));
    dyb();
    initView();
    com.tencent.mm.wallet_core.c.z.hL(5, 0);
    com.tencent.mm.wallet_core.ui.e.QS(27);
    this.tlY = r.cPI().tCW;
    this.onl.tLw = new WalletBankcardManageUI.1(this);
    AppMethodBeat.o(45776);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45781);
    super.onDestroy();
    this.tlQ.tln.destory();
    this.tlR.tln.destory();
    AppMethodBeat.o(45781);
  }

  public void onPause()
  {
    AppMethodBeat.i(45778);
    super.onPause();
    this.onl.onPause();
    AppMethodBeat.o(45778);
  }

  public void onResume()
  {
    AppMethodBeat.i(45777);
    if (!this.tlO.cQl())
    {
      this.tlO.f(this.tlM, this.tlN);
      if (this.tlO.thy != null)
        AM(0);
      mV(false);
    }
    while (true)
    {
      this.onl.onResume();
      cu();
      super.onResume();
      AppMethodBeat.o(45777);
      return;
      mV(true);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI
 * JD-Core Version:    0.6.2
 */