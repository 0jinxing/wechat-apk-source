package com.tencent.mm.plugin.facedetect.c;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$3
  implements View.OnClickListener
{
  c$3(c paramc, int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(123);
    this.lTo.a(this.crc, this.crd, this.ftO, this.lTq);
    AppMethodBeat.o(123);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.c.c.3
 * JD-Core Version:    0.6.2
 */