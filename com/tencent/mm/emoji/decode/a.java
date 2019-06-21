package com.tencent.mm.emoji.decode;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/decode/EmptyDecoder;", "Lcom/tencent/mm/emoji/decode/IGIFDecoder;", "()V", "TAG", "", "emptyFrame", "Landroid/graphics/Bitmap;", "decodeNextFrame", "", "destroy", "drawFrameBitmap", "", "bitmap", "frameHeight", "", "frameTime", "frameWidth", "getFrame", "plugin-emojisdk_release"})
public final class a
  implements b
{
  private final String TAG;
  private Bitmap exk;

  public a()
  {
    AppMethodBeat.i(63136);
    this.TAG = "MicroMsg.EmptyDecoder";
    ab.w(this.TAG, "init: should not call this, something error");
    Bitmap localBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    j.o(localBitmap, "Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
    this.exk = localBitmap;
    AppMethodBeat.o(63136);
  }

  public final void Or()
  {
  }

  public final Bitmap Os()
  {
    return this.exk;
  }

  public final int Ot()
  {
    return 2147483647;
  }

  public final int Ou()
  {
    AppMethodBeat.i(63134);
    int i = this.exk.getWidth();
    AppMethodBeat.o(63134);
    return i;
  }

  public final int Ov()
  {
    AppMethodBeat.i(63135);
    int i = this.exk.getHeight();
    AppMethodBeat.o(63135);
    return i;
  }

  public final void destroy()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.decode.a
 * JD-Core Version:    0.6.2
 */