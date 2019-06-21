package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.o;
import com.tencent.mm.at.p.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.aj;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.protocal.protobuf.boj;
import com.tencent.mm.protocal.protobuf.byh;
import com.tencent.mm.protocal.protobuf.byi;
import com.tencent.mm.protocal.protobuf.csf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WalletBalancePrivacyUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private Dialog gnn;
  private CheckBoxPreference tqR;
  private WalletBalancePrivacyMMHeaderPreference tqS;

  public final int JC()
  {
    return 2131165309;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(46216);
    if (bo.isEqual(paramPreference.mKey, "wallet_banlance_privacy_cb"))
    {
      ab.i("MicroMsg.WalletBalancePrivacyUI", "set balance privacy: %s", new Object[] { Boolean.valueOf(((CheckBoxPreference)paramPreference).isChecked()) });
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.wallet.pwd.a.h(((CheckBoxPreference)paramPreference).isChecked()), 0);
    }
    AppMethodBeat.o(46216);
    return false;
  }

  public final void initView()
  {
    AppMethodBeat.i(46217);
    setMMTitle("");
    xE(getResources().getColor(2131689613));
    setBackGroundColorResource(2131689613);
    setBackBtn(new WalletBalancePrivacyUI.1(this));
    if (this.nDp != null)
    {
      int i = this.mController.ylL.getResources().getDimensionPixelSize(2131427595);
      this.nDp.setPadding(i, 0, i, 0);
      this.nDp.setBackgroundColor(getResources().getColor(2131689613));
    }
    this.ehK = this.yCw;
    if (this.ehK != null)
      this.ehK.removeAll();
    this.gnn = com.tencent.mm.wallet_core.ui.g.b(this, false, null);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.wallet.pwd.a.f(), 0);
    AppMethodBeat.o(46217);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46214);
    super.onCreate(paramBundle);
    dyb();
    initView();
    AppMethodBeat.o(46214);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46219);
    super.onDestroy();
    if (this.tqS != null)
    {
      WalletBalancePrivacyMMHeaderPreference localWalletBalancePrivacyMMHeaderPreference = this.tqS;
      Iterator localIterator = localWalletBalancePrivacyMMHeaderPreference.tqO.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        o.aho().b((String)localEntry.getKey(), (p.a)localEntry.getValue());
      }
      localWalletBalancePrivacyMMHeaderPreference.tqO.clear();
    }
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(2635, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(2554, this);
    AppMethodBeat.o(46219);
  }

  public void onResume()
  {
    AppMethodBeat.i(46215);
    super.onResume();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(2635, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(2554, this);
    AppMethodBeat.o(46215);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(46218);
    ab.i("MicroMsg.WalletBalancePrivacyUI", "onSceneEnd() errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " netsceneType:" + paramm.getType());
    int i;
    if ((paramm instanceof com.tencent.mm.plugin.wallet.pwd.a.f))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label587;
      ab.i("MicroMsg.WalletBalancePrivacyUI", "success get balance privacy detail");
      paramString = (com.tencent.mm.plugin.wallet.pwd.a.f)paramm;
      if ((this.ehK != null) && (paramString != null) && (paramString.cOm() != null) && (paramString.cOm().wRj != null))
        break label353;
      i = 0;
      if ((this.gnn != null) && (this.gnn.isShowing()))
        this.gnn.dismiss();
      if (i == 0)
        com.tencent.mm.ui.base.h.a(this, getString(2131305318), "", false, new WalletBalancePrivacyUI.2(this));
    }
    label178: if ((paramm instanceof com.tencent.mm.plugin.wallet.pwd.a.h))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramInt1 = ((com.tencent.mm.plugin.wallet.pwd.a.h)paramm).cOn().wRi;
        if (this.tqR == null)
          this.tqR = ((CheckBoxPreference)this.ehK.aqO("wallet_banlance_privacy_cb"));
        if (this.tqR != null)
        {
          paramString = Boolean.valueOf(this.tqR.isChecked());
          label249: ab.i("MicroMsg.WalletBalancePrivacyUI", "success set balance privacy detail:%s switchState:%s", new Object[] { paramString, Integer.valueOf(paramInt1) });
          paramString = r.cPE().cRh();
          paramString.field_wallet_entrance_balance_switch_state = ((com.tencent.mm.plugin.wallet.pwd.a.h)paramm).cOn().wRi;
          r.cPE().b(paramString);
          r.cPI().tCV = new ai(paramString.field_switchConfig, paramString.field_wallet_entrance_balance_switch_state);
          if (this.tqR != null)
          {
            paramString = this.tqR;
            if (paramInt1 != 1)
              break label652;
          }
        }
        while (true)
        {
          paramString.qg(bool);
          AppMethodBeat.o(46218);
          return;
          label353: ab.i("MicroMsg.WalletBalancePrivacyUI", "refresh() title_icon:%s,title:%s,switch_title:%s,switch_desc:%s,switch_state:%s", new Object[] { paramString.cOm().wRj.xpB, paramString.cOm().wRj.title, paramString.cOm().wRj.xhW, paramString.cOm().wRj.xpC, Integer.valueOf(paramString.cOm().wRi) });
          this.ehK.addPreferencesFromResource(2131165309);
          this.tqS = ((WalletBalancePrivacyMMHeaderPreference)this.ehK.aqO("wallet_balance_privacy_header"));
          this.tqS.cIY = paramString.cOm().wRj.xpB;
          this.tqS.title = paramString.cOm().wRj.title;
          this.tqR = ((CheckBoxPreference)this.ehK.aqO("wallet_banlance_privacy_cb"));
          this.tqR.yDf = false;
          this.tqR.setTitle(paramString.cOm().wRj.xhW);
          this.tqR.setSummary(paramString.cOm().wRj.xpC);
          this.tqR.uOT = bo.gW(paramString.cOm().wRi, 1);
          this.ehK.notifyDataSetChanged();
          i = 1;
          break;
          label587: ab.i("MicroMsg.WalletBalancePrivacyUI", "fail get balance privacy detail");
          if ((this.gnn != null) && (this.gnn.isShowing()))
            this.gnn.dismiss();
          com.tencent.mm.ui.base.h.a(this, getString(2131305318), "", false, new WalletBalancePrivacyUI.3(this));
          break label178;
          paramString = "null";
          break label249;
          bool = false;
        }
      }
      t.makeText(this, getString(2131305313), 1).show();
      if (this.tqR == null)
      {
        paramString = this.tqR;
        if (this.tqR.isChecked())
          break label756;
        bool = true;
        label698: paramString.qg(bool);
      }
      paramString = (com.tencent.mm.plugin.wallet.pwd.a.h)paramm;
      if (paramString.tqz != null)
        break label762;
    }
    label652: label756: label762: for (paramString = new byh(); ; paramString = paramString.tqz)
    {
      ab.i("MicroMsg.WalletBalancePrivacyUI", "fail set balance privacy %s", new Object[] { Integer.valueOf(paramString.wXF) });
      AppMethodBeat.o(46218);
      break;
      bool = false;
      break label698;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyUI
 * JD-Core Version:    0.6.2
 */