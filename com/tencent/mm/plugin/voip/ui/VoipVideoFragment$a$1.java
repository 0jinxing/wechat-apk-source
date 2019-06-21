package com.tencent.mm.plugin.voip.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipVideoFragment$a$1
  implements Runnable
{
  VoipVideoFragment$a$1(VoipVideoFragment.a parama, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4897);
    if (this.sYr.sYn.sWq != null)
      this.sYr.sYn.sWq.setBackgroundDrawable(new BitmapDrawable(this.sWz));
    VoipVideoFragment.J(this.sYr.sYn);
    AppMethodBeat.o(4897);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.a.1
 * JD-Core Version:    0.6.2
 */