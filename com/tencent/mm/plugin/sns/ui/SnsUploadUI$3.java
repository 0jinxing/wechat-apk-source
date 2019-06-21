package com.tencent.mm.plugin.sns.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsUploadUI$3
  implements View.OnTouchListener
{
  SnsUploadUI$3(SnsUploadUI paramSnsUploadUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(39741);
    ab.d("MicroMsg.SnsUploadUI", "upload_content onTouch");
    boolean bool;
    if (SnsUploadUI.D(this.rCO))
    {
      bool = true;
      AppMethodBeat.o(39741);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(39741);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.3
 * JD-Core Version:    0.6.2
 */