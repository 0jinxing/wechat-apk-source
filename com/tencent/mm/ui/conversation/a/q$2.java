package com.tencent.mm.ui.conversation.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.tl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class q$2
  implements View.OnClickListener
{
  q$2(q paramq)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34734);
    ab.i("MicroMsg.TryNewInitBanner", "summerinit onClick trynewinit layout start try");
    this.zxn.setVisibility(8);
    a.xxA.m(new tl());
    ab.i("MicroMsg.TryNewInitBanner", "summerinit onClick tryNeeInitAgain done callBack (now by event to notice initbanner)");
    AppMethodBeat.o(34734);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.q.2
 * JD-Core Version:    0.6.2
 */