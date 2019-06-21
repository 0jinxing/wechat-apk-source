package com.tencent.mm.plugin.aa.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.n;

public final class a extends n
{
  private a.a gmZ;

  public a(a.a parama)
  {
    super(2, null);
    this.gmZ = parama;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40707);
    if (this.gmZ != null)
      this.gmZ.aos();
    AppMethodBeat.o(40707);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.a
 * JD-Core Version:    0.6.2
 */