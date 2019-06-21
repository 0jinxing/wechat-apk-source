package com.tencent.luggage.d;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$6
  implements Runnable
{
  f$6(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(90779);
    if (!((Activity)this.bPt.mContext).isFinishing())
      this.bPt.bPo = m.a(this.bPt.mContext.getApplicationContext(), this.bPt.xe());
    AppMethodBeat.o(90779);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.f.6
 * JD-Core Version:    0.6.2
 */