package com.tencent.mm.plugin.account.friend.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$b
{
  String account;
  ImageView eks;
  TextView gnh;
  int gtF;
  View gtH;
  TextView gtN;
  TextView gtO;
  TextView gtP;
  ProgressBar gtQ;
  int status;

  public f$b(f paramf, View paramView)
  {
    AppMethodBeat.i(108605);
    this.gtN = ((TextView)paramView.findViewById(2131824172));
    this.eks = ((ImageView)paramView.findViewById(2131824173));
    this.gtO = ((TextView)paramView.findViewById(2131824174));
    this.gtP = ((TextView)paramView.findViewById(2131824175));
    this.gtH = paramView.findViewById(2131824176);
    this.gnh = ((TextView)paramView.findViewById(2131824177));
    this.gtQ = ((ProgressBar)paramView.findViewById(2131824178));
    this.gtH.setOnClickListener(new f.b.1(this, paramf));
    AppMethodBeat.o(108605);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.f.b
 * JD-Core Version:    0.6.2
 */