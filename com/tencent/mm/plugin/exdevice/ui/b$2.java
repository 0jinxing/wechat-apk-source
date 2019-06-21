package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements View.OnClickListener
{
  b$2(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20094);
    ab.i("MicroMsg.ExdeviceRankAdapter", "hy: user clicked on the content");
    int i = ((Integer)paramView.getTag()).intValue();
    paramView = this.lCO.uU(i);
    b.a(this.lCO).KI(paramView.lFy.field_username);
    AppMethodBeat.o(20094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.b.2
 * JD-Core Version:    0.6.2
 */