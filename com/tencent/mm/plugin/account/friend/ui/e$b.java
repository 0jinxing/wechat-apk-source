package com.tencent.mm.plugin.account.friend.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$b
{
  ImageView eks;
  TextView gnh;
  int gtF;
  TextView gtG;
  View gtH;
  ProgressBar gtI;
  String gxL;
  int status;

  public e$b(e parame, View paramView)
  {
    AppMethodBeat.i(108594);
    this.eks = ((ImageView)paramView.findViewById(2131823840));
    this.gtG = ((TextView)paramView.findViewById(2131823841));
    this.gtH = paramView.findViewById(2131826677);
    this.gnh = ((TextView)paramView.findViewById(2131826678));
    this.gtI = ((ProgressBar)paramView.findViewById(2131826679));
    this.gtH.setOnClickListener(new e.b.1(this, parame));
    AppMethodBeat.o(108594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.e.b
 * JD-Core Version:    0.6.2
 */