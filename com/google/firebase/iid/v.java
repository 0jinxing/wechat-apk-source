package com.google.firebase.iid;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class v
  implements Runnable
{
  v(u paramu, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(108776);
    String str = this.bwo.getAction();
    new StringBuilder(String.valueOf(str).length() + 61).append("Service took too long to process intent: ").append(str).append(" App may get closed.");
    this.bwt.finish();
    AppMethodBeat.o(108776);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.v
 * JD-Core Version:    0.6.2
 */