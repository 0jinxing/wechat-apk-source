package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet.pwd.a.k;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.wallet_core.c.aa;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Iterator;
import java.util.Vector;

public class WalletDigitalCertUI extends WalletBaseUI
{
  private Button gzI;
  private ImageView iyo;
  private TextView pNx;
  private Button tro;
  private LinearLayout trp;
  private TextView trq;

  private void cOA()
  {
    AppMethodBeat.i(46258);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletDigitalCertUI", "updateCrtState");
    this.trp.removeAllViews();
    Object localObject;
    if (com.tencent.mm.wallet_core.c.ab.dNZ().dOa())
    {
      this.tro.setVisibility(8);
      this.gzI.setVisibility(0);
      this.pNx.setText(2131305122);
      this.iyo.setImageResource(2130840687);
      localObject = com.tencent.mm.wallet_core.c.ab.dNZ().Agf;
      if (((Vector)localObject).size() != 0)
        break label139;
      this.trp.setVisibility(8);
      this.trq.setVisibility(8);
      AppMethodBeat.o(46258);
    }
    while (true)
    {
      return;
      this.tro.setVisibility(0);
      this.gzI.setVisibility(8);
      this.pNx.setText(2131305106);
      this.iyo.setImageResource(2130840688);
      break;
      label139: this.trp.setVisibility(0);
      this.trq.setVisibility(0);
      Iterator localIterator = ((Vector)localObject).iterator();
      while (localIterator.hasNext())
      {
        aa localaa = (aa)localIterator.next();
        if (localaa.AfZ <= 0)
        {
          View localView = View.inflate(this, 2130971078, null);
          TextView localTextView1 = (TextView)localView.findViewById(2131828744);
          localObject = (TextView)localView.findViewById(2131828745);
          TextView localTextView2 = (TextView)localView.findViewById(2131828746);
          localTextView1.setText(localaa.xoz);
          ((TextView)localObject).setText(localaa.AfY);
          localTextView2.setTag(localaa);
          localTextView2.setOnClickListener(new WalletDigitalCertUI.4(this));
          this.trp.addView(localView);
        }
      }
      if (this.trp.getChildCount() == 0)
      {
        this.trq.setVisibility(8);
        AppMethodBeat.o(46258);
      }
      else
      {
        this.trq.setVisibility(0);
        AppMethodBeat.o(46258);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(46262);
    if (!(paramm instanceof k))
    {
      if (!(paramm instanceof com.tencent.mm.wallet_core.c.m))
        break label91;
      if (paramInt2 != 0)
        break label98;
      paramString = new bj();
      paramString.cVT = 2L;
      paramString.dcm = 2L;
      paramString.ajK();
      h.pYm.e(13731, new Object[] { Integer.valueOf(11) });
      com.tencent.mm.wallet_core.c.ab.dNZ().atp(((com.tencent.mm.wallet_core.c.m)paramm).Afw);
    }
    while (true)
    {
      cOA();
      label91: AppMethodBeat.o(46262);
      return false;
      label98: h.pYm.e(13731, new Object[] { Integer.valueOf(12) });
    }
  }

  public final int getLayoutId()
  {
    return 2130971092;
  }

  public final void initView()
  {
    AppMethodBeat.i(46257);
    setMMTitle(2131305103);
    this.iyo = ((ImageView)findViewById(2131828781));
    this.pNx = ((TextView)findViewById(2131828782));
    this.tro = ((Button)findViewById(2131828786));
    this.gzI = ((Button)findViewById(2131828787));
    this.trp = ((LinearLayout)findViewById(2131828789));
    this.trq = ((TextView)findViewById(2131828788));
    this.tro.setOnClickListener(new WalletDigitalCertUI.1(this));
    this.gzI.setOnClickListener(new WalletDigitalCertUI.2(this));
    setBackBtn(new WalletDigitalCertUI.3(this));
    cOA();
    AppMethodBeat.o(46257);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(46263);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    Object localObject;
    if ((1 == paramInt1) && (paramInt2 == -1))
    {
      bool = ((l)g.K(l.class)).bxe();
      localObject = ah.doB();
      if (localObject == null)
        break label116;
      paramIntent = ((SharedPreferences)localObject).getString("cpu_id", null);
      localObject = ((SharedPreferences)localObject).getString("uid", null);
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletDigitalCertUI", "alvinluo getSecurityInfo isOpenTouchPay: %b", new Object[] { Boolean.valueOf(bool) });
      a(new k(bool, paramIntent, (String)localObject), false, false);
      AppMethodBeat.o(46263);
      return;
      label116: localObject = null;
      paramIntent = null;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46256);
    super.onCreate(paramBundle);
    nf(1654);
    nf(1568);
    nf(1669);
    initView();
    h.pYm.e(13731, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(46256);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46261);
    super.onDestroy();
    ng(1654);
    ng(1568);
    ng(1669);
    AppMethodBeat.o(46261);
  }

  public void onPause()
  {
    AppMethodBeat.i(46260);
    super.onPause();
    AppMethodBeat.o(46260);
  }

  public void onResume()
  {
    AppMethodBeat.i(46259);
    super.onResume();
    AppMethodBeat.o(46259);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI
 * JD-Core Version:    0.6.2
 */