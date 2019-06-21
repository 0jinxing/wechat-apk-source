package com.tencent.mm.ui.conversation.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ap;

final class o$4
  implements View.OnClickListener
{
  o$4(o paramo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34713);
    o.a(this.zxg, this.zxg.sIN);
    this.zxg.sIN = 1;
    if (this.zxg.zxe == null)
    {
      paramView = this.zxg;
      paramView.zxe = new o.1(paramView);
      a.xxA.b(paramView.zxe);
    }
    if (this.zxg.zxd == null)
    {
      paramView = this.zxg;
      paramView.zxd = new ap(new o.2(paramView), true);
      paramView.zxd.ae(1000L, 1000L);
    }
    AppMethodBeat.o(34713);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.o.4
 * JD-Core Version:    0.6.2
 */