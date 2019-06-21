package com.tencent.mm.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.k;
import com.tencent.mm.api.t.a;
import com.tencent.mm.br.b;
import com.tencent.mm.sdk.platformtools.ab;

final class a$9
  implements t.a
{
  a$9(a parama)
  {
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(116380);
    ab.i("MicroMsg.BaseDrawingView", "[onSelectedEmoji] emojiInfo:%s", new Object[] { paramk });
    this.zZU.getPresenter().d(paramk);
    onHide();
    AppMethodBeat.o(116380);
  }

  public final void onHide()
  {
    AppMethodBeat.i(116381);
    this.zZU.setActionBarVisible(true);
    this.zZU.rj(true);
    this.zZU.setFooterVisible(true);
    AppMethodBeat.o(116381);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.9
 * JD-Core Version:    0.6.2
 */