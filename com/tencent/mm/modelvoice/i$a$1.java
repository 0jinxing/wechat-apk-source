package com.tencent.mm.modelvoice;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.d.b;
import com.tencent.mm.sdk.platformtools.ah;

final class i$a$1
  implements Runnable
{
  i$a$1(i.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55795);
    Toast.makeText(ah.getContext(), "Save to: " + i.m(this.fZH.fZG).mFilePath, 1).show();
    AppMethodBeat.o(55795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.i.a.1
 * JD-Core Version:    0.6.2
 */