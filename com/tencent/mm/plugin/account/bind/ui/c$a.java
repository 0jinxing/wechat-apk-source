package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a
{
  String cvZ;
  TextView gnh;
  int gtF;
  TextView gtG;
  View gtH;
  ProgressBar gtI;
  int status;

  public c$a(c paramc, View paramView)
  {
    AppMethodBeat.i(13699);
    this.gtG = ((TextView)paramView.findViewById(2131824020));
    this.gtH = paramView.findViewById(2131826116);
    this.gnh = ((TextView)paramView.findViewById(2131826117));
    this.gtI = ((ProgressBar)paramView.findViewById(2131826118));
    this.gtH.setOnClickListener(new c.a.1(this, paramc));
    AppMethodBeat.o(13699);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.c.a
 * JD-Core Version:    0.6.2
 */