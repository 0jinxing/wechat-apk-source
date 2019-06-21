package com.tencent.mm.plugin.facedetect.c;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2
  implements View.OnClickListener
{
  c$2(c paramc, boolean paramBoolean, int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(122);
    if (this.lTp)
    {
      paramView = this.lTo;
      paramView.bsk();
      paramView.isRetry = true;
      AppMethodBeat.o(122);
    }
    while (true)
    {
      return;
      this.lTo.a(this.crc, this.crd, this.ftO, this.lTq);
      AppMethodBeat.o(122);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.c.c.2
 * JD-Core Version:    0.6.2
 */