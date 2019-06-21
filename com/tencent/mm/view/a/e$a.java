package com.tencent.mm.view.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a
{
  View Abk;
  View Abl;
  View Abm;
  TextView Abp;
  TextView gnC;
  ImageView iqT;

  public e$a(e parame, View paramView)
  {
    AppMethodBeat.i(62981);
    this.iqT = ((ImageView)paramView.findViewById(2131821503));
    this.gnC = ((TextView)paramView.findViewById(2131827578));
    this.Abp = ((TextView)paramView.findViewById(2131827579));
    this.Abp.setTextSize(1, 12.0F);
    this.Abk = paramView.findViewById(2131823497);
    this.Abl = paramView.findViewById(2131823498);
    this.Abm = paramView.findViewById(2131823499);
    AppMethodBeat.o(62981);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.e.a
 * JD-Core Version:    0.6.2
 */