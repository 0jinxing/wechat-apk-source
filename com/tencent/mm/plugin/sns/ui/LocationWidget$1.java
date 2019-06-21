package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LocationWidget$1
  implements View.OnClickListener
{
  LocationWidget$1(LocationWidget paramLocationWidget, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38285);
    if (LocationWidget.a(this.rko) == this.val$index + 1)
      LocationWidget.b(this.rko);
    while (true)
    {
      LocationWidget.c(this.rko);
      AppMethodBeat.o(38285);
      return;
      LocationWidget.a(this.rko, this.val$index + 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.LocationWidget.1
 * JD-Core Version:    0.6.2
 */