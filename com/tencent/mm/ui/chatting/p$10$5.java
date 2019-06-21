package com.tencent.mm.ui.chatting;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d.a;

final class p$10$5
  implements d.a
{
  p$10$5(p.10 param10)
  {
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(30636);
    if (paramInt1 == 227)
      p.a(this.yJp.yJn, p.e(this.yJp.yJn), paramInt2, paramIntent);
    AppMethodBeat.o(30636);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.p.10.5
 * JD-Core Version:    0.6.2
 */