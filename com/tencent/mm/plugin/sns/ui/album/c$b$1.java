package com.tencent.mm.plugin.sns.ui.album;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$b$1
  implements View.OnClickListener
{
  c$b$1(c.b paramb, c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39980);
    if ((paramView.getTag() != null) && ((paramView.getTag() instanceof c.c)) && (this.rFI.rFG.rFE != null))
      this.rFI.rFG.rFE.bi(((c.c)paramView.getTag()).cNE, ((c.c)paramView.getTag()).cHr);
    AppMethodBeat.o(39980);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.c.b.1
 * JD-Core Version:    0.6.2
 */