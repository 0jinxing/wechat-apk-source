package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class e$10
  implements View.OnClickListener
{
  public e$10(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26867);
    ab.i("NoteSelectManager", "bold");
    this.uRO.dfh();
    AppMethodBeat.o(26867);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.e.10
 * JD-Core Version:    0.6.2
 */