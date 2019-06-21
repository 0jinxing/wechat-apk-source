package com.tencent.mm.plugin.bottle.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18544);
    ab.v("MicroMsg.BottleConversationAdapter", "on delView clicked");
    this.jJS.jJR.bIq();
    if (this.jJS.jJQ != null)
      this.jJS.jJQ.bN(paramView.getTag());
    AppMethodBeat.o(18544);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.a.1
 * JD-Core Version:    0.6.2
 */