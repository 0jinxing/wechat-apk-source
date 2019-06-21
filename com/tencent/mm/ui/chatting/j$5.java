package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.y.a;
import com.tencent.mm.storage.bi;

final class j$5
  implements Runnable
{
  j$5(bi parambi, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30538);
    o.alq().a(this.fku.field_imgPath, new j.5.1(this));
    AppMethodBeat.o(30538);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.j.5
 * JD-Core Version:    0.6.2
 */