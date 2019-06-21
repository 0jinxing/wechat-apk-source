package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.net.NetworkInfo.State;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.ab;

@Deprecated
public class FreewifiActivateWeChatNoAuthStateUI extends FreeWifiActivateNoAuthStateUI
{
  private int cyC;
  private String mAs;
  private String mAt;

  public final void a(NetworkInfo.State paramState)
  {
    AppMethodBeat.i(21113);
    ab.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.MD(this.ssid)) && (this.mxY))
    {
      bzD();
      this.mxY = false;
      this.mAs = d.byK();
      this.mAt = d.byO();
      this.cyC = d.byL();
      ab.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "now has connect the ap, check from server rssi is :  %d, mac : %s, ssid is : %s", new Object[] { Integer.valueOf(this.cyC), this.mAs, this.mAt });
      new a(this.jUg, this.mAs, this.mAt, this.cyC, this.cdf, m.V(getIntent())).c(new FreewifiActivateWeChatNoAuthStateUI.1(this));
    }
    AppMethodBeat.o(21113);
  }

  protected final String bzA()
  {
    AppMethodBeat.i(21112);
    String str = getString(2131300078);
    AppMethodBeat.o(21112);
    return str;
  }

  protected final int bzz()
  {
    AppMethodBeat.i(21115);
    j.byV();
    int i = d.MC(this.ssid);
    ab.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "get connect state = %d", new Object[] { Integer.valueOf(i) });
    if (i == 0)
    {
      i = -2014;
      AppMethodBeat.o(21115);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(21115);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(21114);
    super.onDestroy();
    AppMethodBeat.o(21114);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreewifiActivateWeChatNoAuthStateUI
 * JD-Core Version:    0.6.2
 */