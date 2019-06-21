package com.tencent.mm.ui.chatting.c.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.b.r;

final class a$1$1
  implements Runnable
{
  a$1$1(a.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31886);
    if (a.a(this.yTq.yTp))
    {
      ab.d("MicroMsg.AppBrandServiceComponent", "OnWxaOptionsChangedEvent refuse:%b, setRejectIcon View.Visible", new Object[] { Boolean.valueOf(a.a(this.yTq.yTp)) });
      ((r)this.yTq.yTp.cgL.aF(r.class)).OA(0);
      AppMethodBeat.o(31886);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.AppBrandServiceComponent", "OnWxaOptionsChangedEvent refuse:%b, setRejectIcon View.GONE", new Object[] { Boolean.valueOf(a.a(this.yTq.yTp)) });
      ((r)this.yTq.yTp.cgL.aF(r.class)).OA(8);
      AppMethodBeat.o(31886);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.a.1.1
 * JD-Core Version:    0.6.2
 */