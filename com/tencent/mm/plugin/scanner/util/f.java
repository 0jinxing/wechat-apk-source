package com.tencent.mm.plugin.scanner.util;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import f.a;

public final class f extends a
{
  private static int qhH = 10;
  private final byte[] qhG;

  public f(Bitmap paramBitmap)
  {
    super(paramBitmap.getWidth() + 0, paramBitmap.getHeight() + 0);
    AppMethodBeat.i(81414);
    int i = paramBitmap.getWidth() + 0;
    int j = paramBitmap.getHeight() + 0;
    int[] arrayOfInt = new int[i * j];
    paramBitmap.getPixels(arrayOfInt, 0, i, 0, 0, i, j);
    this.qhG = new byte[i * j];
    for (int k = 0; k < j; k++)
    {
      int m = k * i;
      int n = 0;
      if (n < i)
      {
        int i1 = arrayOfInt[(m + n)];
        int i2 = i1 >> 16 & 0xFF;
        int i3 = i1 >> 8 & 0xFF;
        i1 &= 255;
        if ((i2 == i3) && (i3 == i1))
          this.qhG[(m + n)] = ((byte)(byte)i2);
        while (true)
        {
          n++;
          break;
          this.qhG[(m + n)] = ((byte)(byte)(i1 + (i2 + i3 + i3) >> 2));
        }
      }
    }
    AppMethodBeat.o(81414);
  }

  public final byte[] chS()
  {
    return this.qhG;
  }

  public final byte[] n(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(81415);
    if ((paramInt < 0) || (paramInt >= this.height))
    {
      paramArrayOfByte = new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(81415);
      throw paramArrayOfByte;
    }
    int i = this.width;
    byte[] arrayOfByte;
    if (paramArrayOfByte != null)
    {
      arrayOfByte = paramArrayOfByte;
      if (paramArrayOfByte.length >= i);
    }
    else
    {
      arrayOfByte = new byte[i];
    }
    System.arraycopy(this.qhG, paramInt * i, arrayOfByte, 0, i);
    AppMethodBeat.o(81415);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.f
 * JD-Core Version:    0.6.2
 */