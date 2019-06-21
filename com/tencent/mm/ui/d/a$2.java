package com.tencent.mm.ui.d;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.b.b;
import com.tencent.mm.model.b.b.b;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements View.OnClickListener
{
  a$2(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29990);
    ab.i("MicroMsg.ChattingMonitoredBanner", "hy: user required close the banner");
    this.ysi.Nx(2);
    aw.ZK().Ym().c(b.b.foh);
    aw.ZK().Ym().c(b.b.foi);
    this.ysi.setVisibility(8);
    AppMethodBeat.o(29990);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.d.a.2
 * JD-Core Version:    0.6.2
 */