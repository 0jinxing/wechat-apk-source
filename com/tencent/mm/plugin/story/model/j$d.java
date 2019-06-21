package com.tencent.mm.plugin.story.model;

import a.l;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class j$d
  implements Runnable
{
  j$d(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109081);
    Looper.prepare();
    j.a(this.rTb, new ak());
    Looper.loop();
    AppMethodBeat.o(109081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.j.d
 * JD-Core Version:    0.6.2
 */