package com.tencent.mm.compatible.j;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.a.a.a;

final class b$1
  implements a.a
{
  b$1(Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(93116);
    this.evM.putExtra("android.intent.extra.durationLimit", 30);
    this.evM.putExtra("android.intent.extra.sizeLimit", 10485760);
    AppMethodBeat.o(93116);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.j.b.1
 * JD-Core Version:    0.6.2
 */