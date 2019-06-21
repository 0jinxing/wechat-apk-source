package com.tencent.mm.ui.chatting;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d.a;
import com.tencent.mm.ui.chatting.c.b.i;
import com.tencent.mm.ui.chatting.d.a;

final class n$1
  implements d.a
{
  n$1(a parama)
  {
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(30617);
    paramIntent = (i)this.yIT.aF(i.class);
    if ((-1 == paramInt2) && (paramIntent != null) && (paramIntent.dDN()))
      paramIntent.dDL();
    AppMethodBeat.o(30617);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.n.1
 * JD-Core Version:    0.6.2
 */