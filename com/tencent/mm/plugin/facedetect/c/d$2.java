package com.tencent.mm.plugin.facedetect.c;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$2
  implements View.OnClickListener
{
  d$2(d paramd, boolean paramBoolean, int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(135);
    if (this.lTp)
    {
      paramView = this.lTu;
      paramView.bsk();
      paramView.isRetry = true;
      AppMethodBeat.o(135);
    }
    while (true)
    {
      return;
      this.lTu.a(this.crc, this.crd, this.ftO, this.lTq);
      AppMethodBeat.o(135);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.c.d.2
 * JD-Core Version:    0.6.2
 */