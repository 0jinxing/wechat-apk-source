package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$b
{
  ImageView eks;
  TextView gnh;
  String gta;
  TextView gtb;
  TextView gtc;
  View gtd;
  ProgressBar gte;
  int position;

  public a$b(a parama, View paramView)
  {
    AppMethodBeat.i(13643);
    this.eks = ((ImageView)paramView.findViewById(2131824662));
    this.gtb = ((TextView)paramView.findViewById(2131824663));
    this.gtd = paramView.findViewById(2131824665);
    this.gnh = ((TextView)paramView.findViewById(2131824666));
    this.gte = ((ProgressBar)paramView.findViewById(2131824667));
    this.gtc = ((TextView)paramView.findViewById(2131824664));
    this.gtd.setOnClickListener(new a.b.1(this, parama));
    AppMethodBeat.o(13643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.a.b
 * JD-Core Version:    0.6.2
 */