package com.tencent.mm.plugin.facedetect.c;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$3
  implements View.OnClickListener
{
  d$3(d paramd, int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136);
    this.lTu.a(this.crc, this.crd, this.ftO, this.lTq);
    AppMethodBeat.o(136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.c.d.3
 * JD-Core Version:    0.6.2
 */