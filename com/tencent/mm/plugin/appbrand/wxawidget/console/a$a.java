package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a extends RecyclerView.v
{
  TextView gKl;
  TextView jpF;

  public a$a(View paramView, int paramInt)
  {
    super(paramView);
    AppMethodBeat.i(11125);
    this.jpF = ((TextView)paramView.findViewById(2131822952));
    this.gKl = ((TextView)paramView.findViewById(2131822953));
    switch (paramInt)
    {
    default:
      this.jpF.setText("L");
      this.gKl.setTextColor(-7829368);
      AppMethodBeat.o(11125);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      this.jpF.setText("L");
      this.gKl.setTextColor(-7829368);
      AppMethodBeat.o(11125);
      continue;
      this.jpF.setText("I");
      this.gKl.setTextColor(-16777216);
      AppMethodBeat.o(11125);
      continue;
      this.jpF.setText("W");
      this.gKl.setTextColor(Color.rgb(0, 0, 204));
      AppMethodBeat.o(11125);
      continue;
      this.jpF.setText("E");
      this.gKl.setTextColor(-65536);
      AppMethodBeat.o(11125);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.a.a
 * JD-Core Version:    0.6.2
 */