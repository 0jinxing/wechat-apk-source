package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.asj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class HoneyPaySelectCardTypeUI$a
{
  public CdnImageView nrl;
  public TextView nrv;
  public CdnImageView ntk;
  public TextView ntl;
  public TextView ntm;
  public ImageView ntn;

  private HoneyPaySelectCardTypeUI$a(HoneyPaySelectCardTypeUI paramHoneyPaySelectCardTypeUI)
  {
  }

  final void a(View paramView, asj paramasj)
  {
    AppMethodBeat.i(41955);
    this.ntk = ((CdnImageView)paramView.findViewById(2131824942));
    this.nrv = ((TextView)paramView.findViewById(2131824943));
    this.ntl = ((TextView)paramView.findViewById(2131824944));
    this.ntn = ((ImageView)paramView.findViewById(2131824945));
    if (!bo.isNullOrNil(paramasj.cIY))
    {
      this.ntk.eb(paramasj.cIY, c.Y(paramasj.iAd, paramasj.wvW));
      this.nrv.setText(paramasj.kdf);
      this.ntl.setText(paramasj.kfM);
      if (!paramasj.wvW)
        break label182;
      ab.i("MicroMsg.HoneyPaySelectCardTypeUI", "disable this card");
      paramView.setEnabled(false);
      this.nrv.setEnabled(false);
      this.ntl.setEnabled(false);
      this.ntn.setVisibility(8);
      AppMethodBeat.o(41955);
    }
    while (true)
    {
      return;
      this.ntk.setImageResource(c.Y(paramasj.iAd, paramasj.wvW));
      break;
      label182: paramView.setOnClickListener(new HoneyPaySelectCardTypeUI.a.2(this, paramasj));
      AppMethodBeat.o(41955);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI.a
 * JD-Core Version:    0.6.2
 */