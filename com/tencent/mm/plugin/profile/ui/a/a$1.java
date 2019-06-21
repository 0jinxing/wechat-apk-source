package com.tencent.mm.plugin.profile.ui.a;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.base.h;

final class a$1
  implements ap.a
{
  a$1(a parama)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(23796);
    if (!this.ppJ.czX.isFinishing())
    {
      a locala = this.ppJ;
      Activity localActivity = this.ppJ.czX;
      this.ppJ.czX.getString(2131297061);
      locala.mzU = h.b(localActivity, this.ppJ.czX.getString(2131297086), true, new a.1.1(this));
    }
    AppMethodBeat.o(23796);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.a.a.1
 * JD-Core Version:    0.6.2
 */