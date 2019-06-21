package com.tencent.mm.plugin.mmsight.segment;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class RecyclerThumbSeekBar$a
  implements Runnable
{
  private Bitmap bitmap;
  private ImageView cAw;
  private RecyclerThumbSeekBar.b oyA;

  RecyclerThumbSeekBar$a(RecyclerThumbSeekBar paramRecyclerThumbSeekBar, Bitmap paramBitmap, ImageView paramImageView, RecyclerThumbSeekBar.b paramb)
  {
    this.bitmap = paramBitmap;
    this.cAw = paramImageView;
    this.oyA = paramb;
  }

  public final void run()
  {
    boolean bool = true;
    AppMethodBeat.i(54985);
    if ((this.bitmap == null) || (this.bitmap.isRecycled()))
      if (this.bitmap == null)
      {
        ab.i("RecyclerThumbSeekBar", "bitmap is null %b in DrawBitmapOnViewTask", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(54985);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      if ((this.oyA == null) || (this.oyA.fIa) || (this.cAw == null))
      {
        ab.i("RecyclerThumbSeekBar", "bitmap in DrawBitmapOnViewTask");
        AppMethodBeat.o(54985);
      }
      else
      {
        ImageView localImageView = this.cAw;
        localImageView.setTag(null);
        ObjectAnimator.ofInt(localImageView, "imageAlpha", new int[] { 50, 255 }).setDuration(200L).start();
        localImageView.setImageBitmap(this.bitmap);
        AppMethodBeat.o(54985);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.a
 * JD-Core Version:    0.6.2
 */