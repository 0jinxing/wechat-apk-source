package com.tencent.mm.plugin.voip.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipBaseFragment$b$1
  implements Runnable
{
  VoipBaseFragment$b$1(VoipBaseFragment.b paramb, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4846);
    if (this.sWB.sWy.sWr != null)
    {
      this.sWB.sWy.sWr.setBackgroundDrawable(new BitmapDrawable(this.sWz));
      this.sWB.sWy.sWr.getBackground().setAlpha(230);
      this.sWB.sWy.sWr.getBackground().setFilterBitmap(true);
    }
    VoipBaseFragment.b(this.sWB.sWy);
    AppMethodBeat.o(4846);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipBaseFragment.b.1
 * JD-Core Version:    0.6.2
 */