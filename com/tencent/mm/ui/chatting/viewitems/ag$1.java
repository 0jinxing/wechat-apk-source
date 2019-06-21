package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ay.a;
import com.tencent.mm.ay.a.b;
import com.tencent.mm.pluginsdk.ui.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;

final class ag$1 extends n
{
  ag$1(ag paramag, int paramInt1, int paramInt2, a parama, a.b paramb, ai.b paramb1, bi parambi, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33268);
    ab.i("MicroMsg.ChattingItemNewXmlSysImpl", "[onClick] pBaseNewXmlMsg:%s", new Object[] { this.yRf });
    this.zgi.a(this.zgj.mRR, this.fku, this.yRf, this.jPF);
    AppMethodBeat.o(33268);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ag.1
 * JD-Core Version:    0.6.2
 */