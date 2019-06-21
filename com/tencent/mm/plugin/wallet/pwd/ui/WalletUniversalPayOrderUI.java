package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ci.f;
import com.tencent.mm.plugin.wallet.pwd.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.sortlist.DragSortListView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletUniversalPayOrderUI extends WalletBaseUI
{
  private ViewGroup kox;
  private ViewGroup laj;
  private DragSortListView ttn;
  private WalletUniversalPayOrderUI.a tto;
  private TextView ttp;
  private TextView ttq;
  private TextView ttr;
  private MMSwitchBtn tts;
  private TextView ttt;
  private TextView ttu;
  private Dialog ttv;
  private boolean ttw = true;

  private void bGb()
  {
    AppMethodBeat.i(46442);
    this.kox = ((ViewGroup)LayoutInflater.from(this).inflate(2130971088, null, false));
    this.ttu = ((TextView)this.kox.findViewById(2131828771));
    this.ttn.addFooterView(this.kox, null, false);
    AppMethodBeat.o(46442);
  }

  private void cOP()
  {
    AppMethodBeat.i(46441);
    this.laj = ((ViewGroup)LayoutInflater.from(this).inflate(2130971089, null, false));
    this.ttp = ((TextView)this.laj.findViewById(2131828772));
    this.ttq = ((TextView)this.laj.findViewById(2131828773));
    this.ttr = ((TextView)this.laj.findViewById(2131828774));
    this.tts = ((MMSwitchBtn)this.laj.findViewById(2131828775));
    this.ttt = ((TextView)this.laj.findViewById(2131828776));
    this.ttn.addHeaderView(this.laj, null, false);
    AppMethodBeat.o(46441);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130971091;
  }

  public final void initView()
  {
    AppMethodBeat.i(46440);
    this.ttn = ((DragSortListView)findViewById(2131828780));
    cOP();
    bGb();
    this.tto = new WalletUniversalPayOrderUI.a(this);
    this.ttn.setAdapter(this.tto);
    this.ttn.setDropListener(new WalletUniversalPayOrderUI.1(this));
    this.ttn.setRemoveListener(new WalletUniversalPayOrderUI.5(this));
    AppMethodBeat.o(46440);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46439);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(-1);
    dyb();
    setMMTitle("");
    initView();
    ab.i("MicroMsg.WalletUniversalPayOrderUI", "do query uni pay order");
    getString(2131296899);
    this.ttv = com.tencent.mm.ui.base.h.b(this, getString(2131305190), false, new WalletUniversalPayOrderUI.6(this));
    new c().acy().b(new WalletUniversalPayOrderUI.7(this));
    com.tencent.mm.plugin.report.service.h.pYm.e(16343, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(46439);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI
 * JD-Core Version:    0.6.2
 */