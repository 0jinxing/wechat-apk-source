package com.tencent.mm.plugin.facedetect.c;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1
  implements View.OnClickListener
{
  e$1(e parame, int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(149);
    if (this.lTp)
    {
      e.a(this.lTv);
      AppMethodBeat.o(149);
    }
    while (true)
    {
      return;
      this.lTv.a(this.crc, this.crd, this.ftO, this.lTq);
      AppMethodBeat.o(149);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.c.e.1
 * JD-Core Version:    0.6.2
 */