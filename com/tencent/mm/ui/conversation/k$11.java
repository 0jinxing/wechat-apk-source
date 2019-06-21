package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$11
  implements Runnable
{
  k$11(k paramk, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34480);
    if (k.h(this.zuQ) != null)
      k.h(this.zuQ).setMessage(k.a(this.zuQ).getString(2131296966) + this.gyJ + "%");
    AppMethodBeat.o(34480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.11
 * JD-Core Version:    0.6.2
 */