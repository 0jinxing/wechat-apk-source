package com.tencent.mm.emoji.decode;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/decode/MMBitmapDecoder;", "Lcom/tencent/mm/emoji/decode/IGIFDecoder;", "bytes", "", "([B)V", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "lastValidFrame", "decodeNextFrame", "", "destroy", "drawFrameBitmap", "", "frameHeight", "", "frameTime", "frameWidth", "getFrame", "plugin-emojisdk_release"})
public final class c
  implements b
{
  private Bitmap exl;

  public c(Bitmap paramBitmap)
  {
    AppMethodBeat.i(63139);
    Bitmap localBitmap = paramBitmap;
    if (paramBitmap == null)
    {
      localBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
      j.o(localBitmap, "Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
    }
    this.exl = localBitmap;
    this.exl.setDensity(320);
    AppMethodBeat.o(63139);
  }

  public c(byte[] paramArrayOfByte)
  {
    this(d.bQ(paramArrayOfByte));
    AppMethodBeat.i(63140);
    AppMethodBeat.o(63140);
  }

  public final void Or()
  {
  }

  public final Bitmap Os()
  {
    return this.exl;
  }

  public final int Ot()
  {
    return 2147483647;
  }

  public final int Ou()
  {
    AppMethodBeat.i(63137);
    int i = this.exl.getWidth();
    AppMethodBeat.o(63137);
    return i;
  }

  public final int Ov()
  {
    AppMethodBeat.i(63138);
    int i = this.exl.getHeight();
    AppMethodBeat.o(63138);
    return i;
  }

  public final void destroy()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.decode.c
 * JD-Core Version:    0.6.2
 */