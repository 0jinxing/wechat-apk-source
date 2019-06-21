package com.tencent.mm.plugin.freewifi.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.l;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class FreeWifiPcUI$2
  implements View.OnClickListener
{
  FreeWifiPcUI$2(FreeWifiPcUI paramFreeWifiPcUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21064);
    FreeWifiPcUI.b(this.mzV).setClickable(false);
    paramView = new ap(new FreeWifiPcUI.2.1(this), false);
    paramView.ae(2000L, 2000L);
    k.a locala = k.byo();
    locala.muc = String.valueOf(FreeWifiPcUI.e(this.mzV));
    locala.mud = FreeWifiPcUI.d(this.mzV);
    locala.kBq = FreeWifiPcUI.c(this.mzV);
    locala.muf = k.b.muM.muQ;
    locala.mug = k.b.muM.name;
    locala.byq().byp();
    ab.i("MicroMsg.FreeWifi.FreeWifiPcUI", "sessionKey=%s, step=%d, method=setOnClickListener, desc=It starts NetSceneSetPcLoginUserInfo.shopid=%d, appid=%s, ticket=%s", new Object[] { m.V(this.mzV.getIntent()), Integer.valueOf(m.W(this.mzV.getIntent())), Integer.valueOf(FreeWifiPcUI.e(this.mzV)), FreeWifiPcUI.d(this.mzV), FreeWifiPcUI.c(this.mzV) });
    new l(FreeWifiPcUI.d(this.mzV), FreeWifiPcUI.e(this.mzV), FreeWifiPcUI.c(this.mzV)).c(new FreeWifiPcUI.2.2(this, paramView));
    AppMethodBeat.o(21064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiPcUI.2
 * JD-Core Version:    0.6.2
 */