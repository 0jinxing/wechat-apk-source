package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.ay;

public final class s$h extends s.e
{
  public s$h(a parama)
  {
    super(parama);
  }

  public final void a(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(30726);
    paramView = (ay)paramView.getTag();
    parambi = new Intent();
    parambi.putExtra("geta8key_username", parama.getTalkerUserName());
    parambi.putExtra("rawUrl", paramView.dJv);
    d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", parambi);
    AppMethodBeat.o(30726);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.h
 * JD-Core Version:    0.6.2
 */