package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ac$a
  implements ao.a
{
  float iuK;
  float iuL;
  View view;
  float x;
  float y;

  public final void dk(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91095);
    this.iuK = paramInt1;
    this.iuL = paramInt2;
    this.view.setX(this.x + paramInt1);
    this.view.setY(this.y + paramInt2);
    AppMethodBeat.o(91095);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.ac.a
 * JD-Core Version:    0.6.2
 */