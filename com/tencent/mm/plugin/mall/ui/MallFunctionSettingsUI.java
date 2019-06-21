package com.tencent.mm.plugin.mall.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bz.a;
import com.tencent.mm.ci.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.mall.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.List;

public class MallFunctionSettingsUI extends WalletBaseUI
{
  int cQG;
  private ListView omf;
  private final int omg;
  private TextView omh;
  private TextView omi;
  private MallFunctionSettingsUI.a omj;
  private List<MallFunctionSettingsUI.b> omk;

  public MallFunctionSettingsUI()
  {
    AppMethodBeat.i(43159);
    this.omg = a.fromDPToPix(ah.getContext(), 40);
    this.omk = new ArrayList();
    AppMethodBeat.o(43159);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130970028;
  }

  public final void initView()
  {
    AppMethodBeat.i(43161);
    this.omf = ((ListView)findViewById(2131825756));
    this.omj = new MallFunctionSettingsUI.a(this, (byte)0);
    ViewGroup localViewGroup = (ViewGroup)View.inflate(this, 2130970025, null);
    this.omf.addHeaderView(localViewGroup, null, false);
    LinearLayout localLinearLayout = new LinearLayout(this.mController.ylL);
    localLinearLayout.setMinimumHeight(a.fromDPToPix(this.mController.ylL, 80));
    this.omf.addFooterView(localLinearLayout, null, false);
    this.omf.setAdapter(this.omj);
    this.omh = ((TextView)localViewGroup.findViewById(2131825746));
    this.omi = ((TextView)localViewGroup.findViewById(2131825747));
    AppMethodBeat.o(43161);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(43160);
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131690691));
    dyb();
    this.cQG = ((Integer)g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
    ab.i("MicroMsg.MallFunctionSettingsUI", "wallet region: %s", new Object[] { Integer.valueOf(this.cQG) });
    initView();
    setMMTitle("");
    ab.i("MicroMsg.MallFunctionSettingsUI", "do get function list");
    new b(this.cQG).acy().b(new MallFunctionSettingsUI.1(this));
    AppMethodBeat.o(43160);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43162);
    super.onDestroy();
    AppMethodBeat.o(43162);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI
 * JD-Core Version:    0.6.2
 */