package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.luckymoney.a.a;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyPickEnvelopeUI$c extends RecyclerView.v
{
  ImageView eks;
  private Dialog gII;
  TextView gtb;
  TextView hrg;
  TextView jXx;
  ImageView ohc;
  RadioButton ohd;
  View ohe;
  ImageView ohf;
  ProgressBar ohg;
  TextView ohh;

  public LuckyMoneyPickEnvelopeUI$c(LuckyMoneyPickEnvelopeUI paramLuckyMoneyPickEnvelopeUI, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(42925);
    this.gII = null;
    this.ohc = ((ImageView)paramView.findViewById(2131825600));
    this.gtb = ((TextView)paramView.findViewById(2131825605));
    this.hrg = ((TextView)paramView.findViewById(2131825607));
    this.ohd = ((RadioButton)paramView.findViewById(2131825606));
    this.eks = ((ImageView)paramView.findViewById(2131825602));
    this.jXx = ((TextView)paramView.findViewById(2131825603));
    this.ohe = paramView.findViewById(2131825608);
    this.ohf = ((ImageView)paramView.findViewById(2131825609));
    this.ohg = ((ProgressBar)paramView.findViewById(2131825610));
    this.ohh = ((TextView)paramView.findViewById(2131825611));
    AppMethodBeat.o(42925);
  }

  final void a(atb paramatb, boolean paramBoolean)
  {
    AppMethodBeat.i(42926);
    ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "try load cover image");
    if (paramBoolean)
    {
      this.ohf.setVisibility(8);
      this.ohg.setVisibility(0);
      this.ohh.setVisibility(8);
    }
    ((a)g.K(a.class)).a(this.ohc, paramatb, new LuckyMoneyPickEnvelopeUI.c.2(this));
    AppMethodBeat.o(42926);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.c
 * JD-Core Version:    0.6.2
 */