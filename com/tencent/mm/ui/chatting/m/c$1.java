package com.tencent.mm.ui.chatting.m;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

final class c$1 extends com.tencent.mm.plugin.messenger.a.a
{
  c$1(c paramc, LinkedList paramLinkedList)
  {
  }

  public final void onClickImp(View paramView)
  {
    AppMethodBeat.i(32744);
    c localc = this.zaI;
    paramView = this.qkd;
    if ((localc.zaF != null) && (localc.zaF.get() != null))
      ((a.b)localc.zaF.get()).aL(paramView);
    AppMethodBeat.o(32744);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.c.1
 * JD-Core Version:    0.6.2
 */