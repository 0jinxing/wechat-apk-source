package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class y$a$1
  implements Runnable
{
  y$a$1(y.a parama, boolean paramBoolean, String paramString, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123822);
    if (this.jgu)
      this.jgy.jgs.B(this.jgv);
    try
    {
      while (true)
      {
        this.jgy.jgs.setSelection(Math.min(this.jgw + this.jgx, this.jgv.length()));
        AppMethodBeat.o(123822);
        return;
        this.jgy.jgs.setText(this.jgv);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.WebEditText", "replace softBank to unicode, setSelection ", new Object[] { localException });
        AppMethodBeat.o(123822);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.y.a.1
 * JD-Core Version:    0.6.2
 */