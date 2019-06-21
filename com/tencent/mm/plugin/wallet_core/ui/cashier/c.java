package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.i;
import com.tencent.soter.a.g.f;

public final class c extends i
  implements LifecycleObserver
{
  private ViewGroup ius;
  private ImageView tMG;
  TextView tMH;
  ImageView tMI;
  TextView tMJ;
  a tMK;
  c.b tML;

  public c(Context paramContext)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(47830);
    init();
    AppMethodBeat.o(47830);
  }

  public c(Context paramContext, int paramInt)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(47831);
    init();
    AppMethodBeat.o(47831);
  }

  private void init()
  {
    AppMethodBeat.i(47832);
    initView();
    setContentView(this.ius);
    setCanceledOnTouchOutside(false);
    this.tMK = new a();
    setOnCancelListener(new c.1(this));
    setOnDismissListener(new c.2(this));
    AppMethodBeat.o(47832);
  }

  private void initView()
  {
    AppMethodBeat.i(47833);
    this.ius = ((ViewGroup)View.inflate(getContext(), 2130971196, null));
    this.tMG = ((ImageView)this.ius.findViewById(2131829126));
    this.tMH = ((TextView)this.ius.findViewById(2131829127));
    this.tMI = ((ImageView)this.ius.findViewById(2131829128));
    this.tMJ = ((TextView)this.ius.findViewById(2131829129));
    ImageView localImageView = this.tMG;
    int i = b.tLO;
    int j = b.tLO;
    bo.n(localImageView, i, i, j, j);
    this.tMG.setOnClickListener(new c.3(this));
    AppMethodBeat.o(47833);
  }

  public final int cSu()
  {
    if (this.tMK == null);
    for (int i = 0; ; i = this.tMK.tJZ)
      return i;
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
  public final void onActivityPause()
  {
    AppMethodBeat.i(47835);
    ab.i("MicroMsg.WcPayCashierFingerprintDialog", "activity paused, release and dismiss");
    cancel();
    AppMethodBeat.o(47835);
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47834);
    super.onCreate(paramBundle);
    paramBundle = this.tMK;
    ab.i("MicroMsg.WcPayCashierFingerprintDialog", "req fingerprint");
    f.dRn().dRo();
    com.tencent.mm.plugin.soter.d.a.cvP();
    paramBundle.tMN = new lv();
    paramBundle.tMN.cHD.cBT = paramBundle.czZ;
    paramBundle.tMN.cHD.cHF = 1;
    paramBundle.tMN.cHD.cHH = new c.a.1(paramBundle);
    com.tencent.mm.sdk.b.a.xxA.m(paramBundle.tMN);
    AppMethodBeat.o(47834);
  }

  final class a
  {
    public String czZ;
    public l mrm;
    int msy;
    int tJZ;
    lv tMN;

    a()
    {
      AppMethodBeat.i(47829);
      this.mrm = ((l)g.K(l.class));
      AppMethodBeat.o(47829);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.c
 * JD-Core Version:    0.6.2
 */