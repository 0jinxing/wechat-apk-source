package com.google.firebase.iid;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class x
  implements Runnable
{
  x(w paramw, u paramu)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(108777);
    Log.isLoggable("EnhancedIntentService", 3);
    w.a(this.bww).g(this.bwv.intent);
    this.bwv.finish();
    AppMethodBeat.o(108777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.x
 * JD-Core Version:    0.6.2
 */