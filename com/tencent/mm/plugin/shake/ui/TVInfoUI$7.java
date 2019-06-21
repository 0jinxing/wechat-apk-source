package com.tencent.mm.plugin.shake.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TVInfoUI$7
  implements Runnable
{
  TVInfoUI$7(TVInfoUI paramTVInfoUI, String paramString, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24917);
    if ((TVInfoUI.e(this.qwG) != null) && (TVInfoUI.e(this.qwG).equals(this.paQ)))
    {
      if ((TVInfoUI.f(this.qwG) != null) && (this.val$bitmap != null))
      {
        TVInfoUI.f(this.qwG).setImageBitmap(this.val$bitmap);
        TVInfoUI.g(this.qwG);
      }
      TVInfoUI.h(this.qwG);
    }
    AppMethodBeat.o(24917);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.TVInfoUI.7
 * JD-Core Version:    0.6.2
 */