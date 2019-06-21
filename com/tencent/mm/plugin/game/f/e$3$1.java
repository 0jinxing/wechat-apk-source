package com.tencent.mm.plugin.game.f;

import android.graphics.Bitmap;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$3$1
  implements Runnable
{
  e$3$1(e.3 param3, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112330);
    this.nnL.lvs.setImageBitmap(this.val$bitmap);
    ViewGroup.LayoutParams localLayoutParams = this.nnL.lvs.getLayoutParams();
    float f = this.nnL.val$height / this.nnL.val$width;
    localLayoutParams.width = this.nnL.nnK;
    localLayoutParams.height = ((int)(f * this.nnL.nnK));
    this.nnL.lvs.setLayoutParams(localLayoutParams);
    this.nnL.lvs.setScaleType(ImageView.ScaleType.FIT_XY);
    AppMethodBeat.o(112330);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.e.3.1
 * JD-Core Version:    0.6.2
 */