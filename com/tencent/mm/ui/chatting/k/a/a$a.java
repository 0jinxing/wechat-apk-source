package com.tencent.mm.ui.chatting.k.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.widget.MMTextView.a;

 enum a$a
  implements MMTextView.a
{
  static
  {
    AppMethodBeat.i(32676);
    yZN = new a("TEXT_CALLBACK");
    yZO = new a[] { yZN };
    AppMethodBeat.o(32676);
  }

  public final void a(CharSequence paramCharSequence, long paramLong)
  {
    AppMethodBeat.i(32675);
    bi localbi = ((j)g.K(j.class)).bOr().jf(paramLong);
    if (bo.isNullOrNil(localbi.field_talker))
    {
      ab.w("MicroMsg.AAChattingHelper", "hy: not retrieving correct msg from db. try use old one. msg id: %d", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(32675);
    }
    while (true)
    {
      return;
      if ((localbi.field_flag & 0x10) == 0)
      {
        a.b(paramCharSequence, localbi);
        AppMethodBeat.o(32675);
      }
      else
      {
        ab.v("MicroMsg.AAChattingHelper", "hy: show already checked. msg id is: %d", new Object[] { Long.valueOf(paramLong) });
        AppMethodBeat.o(32675);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.k.a.a.a
 * JD-Core Version:    0.6.2
 */