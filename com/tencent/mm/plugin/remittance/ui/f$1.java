package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$1
  implements View.OnClickListener
{
  f$1(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44981);
    if (f.a(this.pUt) != null)
    {
      f.a(this.pUt).onClick(paramView);
      this.pUt.dismiss();
    }
    AppMethodBeat.o(44981);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.f.1
 * JD-Core Version:    0.6.2
 */