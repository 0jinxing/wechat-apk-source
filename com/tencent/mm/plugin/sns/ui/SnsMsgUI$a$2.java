package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class SnsMsgUI$a$2
  implements View.OnClickListener
{
  SnsMsgUI$a$2(SnsMsgUI.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39088);
    ab.v("MicroMsg.SnsMsgUI", "on delView clicked");
    this.rug.jJR.bIq();
    if (this.rug.ruf != null)
      this.rug.ruf.bN(paramView.getTag());
    AppMethodBeat.o(39088);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.a.2
 * JD-Core Version:    0.6.2
 */