package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.d.a.a;

public final class r$a extends b.b
{
  public r$a(r paramr)
  {
    super(paramr);
  }

  public final boolean a(Context paramContext, a parama)
  {
    AppMethodBeat.i(62035);
    parama = (r)parama;
    a(this.mLq.mDz.mDY, parama.hpS);
    d.f(paramContext, ".ui.chatting.ChattingUI", new Intent().putExtra("Chat_User", parama.username).putExtra("finish_direct", true));
    AppMethodBeat.o(62035);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.r.a
 * JD-Core Version:    0.6.2
 */