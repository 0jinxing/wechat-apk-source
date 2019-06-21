package com.tencent.mm.plugin.scanner.util;

import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import f.a;

public final class c extends a
{
  public final byte[] cLa;
  public int height;
  public int left;
  final int qhr;
  final int qhs;
  public int top;
  public int width;

  public c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Rect paramRect)
  {
    super(paramRect.width(), paramRect.height());
    AppMethodBeat.i(81373);
    ab.v("MicroMsg.scanner.PlanarYUVLuminanceSource", "init yuvData.len: %d,  dataW: %d, dataH: %d, left: %d, top: %d, width: %d, height: %d ", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramRect.left), Integer.valueOf(paramRect.top), Integer.valueOf(paramRect.width()), Integer.valueOf(paramRect.height()) });
    this.cLa = paramArrayOfByte;
    this.qhr = paramInt1;
    this.qhs = paramInt2;
    if ((paramRect.left < 0) || (paramRect.left >= paramInt1))
    {
      j = 0;
      this.left = j;
      j = i;
      if (paramRect.top >= 0)
      {
        if (paramRect.top < paramInt2)
          break label282;
        j = i;
      }
      label167: this.top = j;
      if (this.left + paramRect.width() <= paramInt1)
        break label292;
      j = paramInt1 - this.left;
      label195: this.width = j;
      if (this.top + paramRect.height() <= paramInt2)
        break label302;
    }
    label282: label292: label302: for (int j = paramInt2 - this.top; ; j = paramRect.height())
    {
      this.height = j;
      if ((this.left + this.width <= paramInt1) && (this.top + this.height <= paramInt2))
        break label312;
      paramArrayOfByte = new IllegalArgumentException("Crop rectangle does not fit within image data.");
      AppMethodBeat.o(81373);
      throw paramArrayOfByte;
      j = paramRect.left;
      break;
      j = paramRect.top;
      break label167;
      j = paramRect.width();
      break label195;
    }
    label312: AppMethodBeat.o(81373);
  }

  public static void chQ()
  {
    AppMethodBeat.i(81375);
    l.cij().cik();
    System.gc();
    AppMethodBeat.o(81375);
  }

  public final byte[] chR()
  {
    int i = 0;
    AppMethodBeat.i(81376);
    Object localObject1;
    if ((this.width == this.qhr) && (this.height == this.qhs))
    {
      localObject1 = this.cLa;
      AppMethodBeat.o(81376);
    }
    while (true)
    {
      return localObject1;
      int j;
      int k;
      Object localObject2;
      try
      {
        j = this.width * this.height;
        localObject1 = l.cij();
        if (((l)localObject1).qit == null)
          ((l)localObject1).qit = new byte[j];
        while (true)
        {
          localObject1 = ((l)localObject1).qit;
          k = this.top * this.qhr + this.left;
          if (this.width != this.qhr)
            break label265;
          System.arraycopy(this.cLa, k, localObject1, 0, j);
          AppMethodBeat.o(81376);
          break;
          if (((l)localObject1).qit.length != j)
          {
            ((l)localObject1).qit = null;
            ((l)localObject1).qit = new byte[j];
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.scanner.PlanarYUVLuminanceSource", " yuvData.len:" + this.cLa.length + " dataWidth:" + this.qhr + " dataHeight:" + this.qhs + " left:" + this.left + " top:" + this.top + " width:" + this.width + " height:" + this.height + " tStr:" + localException.toString());
        AppMethodBeat.o(81376);
        localObject2 = null;
      }
      continue;
      label265: byte[] arrayOfByte = this.cLa;
      while (i < this.height)
      {
        System.arraycopy(arrayOfByte, k, localObject2, this.width * i, this.width);
        j = this.qhr;
        k += j;
        i++;
      }
      AppMethodBeat.o(81376);
    }
  }

  public final byte[] chS()
  {
    int i = 0;
    AppMethodBeat.i(81377);
    byte[] arrayOfByte1;
    if ((this.width == this.qhr) && (this.height == this.qhs))
    {
      arrayOfByte1 = this.cLa;
      AppMethodBeat.o(81377);
    }
    while (true)
    {
      return arrayOfByte1;
      try
      {
        int j = this.width * this.height;
        arrayOfByte1 = new byte[j];
        int k = this.top * this.qhr + this.left;
        if (this.width == this.qhr)
        {
          System.arraycopy(this.cLa, k, arrayOfByte1, 0, j);
          AppMethodBeat.o(81377);
        }
        else
        {
          byte[] arrayOfByte2 = this.cLa;
          while (i < this.height)
          {
            System.arraycopy(arrayOfByte2, k, arrayOfByte1, this.width * i, this.width);
            j = this.qhr;
            k += j;
            i++;
          }
          AppMethodBeat.o(81377);
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.scanner.PlanarYUVLuminanceSource", " yuvData.len:" + this.cLa.length + " dataWidth:" + this.qhr + " dataHeight:" + this.qhs + " left:" + this.left + " top:" + this.top + " width:" + this.width + " height:" + this.height + " tStr:" + localException.toString());
        Object localObject = null;
        AppMethodBeat.o(81377);
      }
    }
  }

  public final byte[] n(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(81374);
    if ((paramInt < 0) || (paramInt >= this.height))
    {
      paramArrayOfByte = new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(81374);
      throw paramArrayOfByte;
    }
    byte[] arrayOfByte;
    if (paramArrayOfByte != null)
    {
      arrayOfByte = paramArrayOfByte;
      if (paramArrayOfByte.length >= this.width);
    }
    else
    {
      arrayOfByte = new byte[this.width];
    }
    int i = this.top;
    int j = this.qhr;
    int k = this.left;
    System.arraycopy(this.cLa, (i + paramInt) * j + k, arrayOfByte, 0, this.width);
    AppMethodBeat.o(81374);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.c
 * JD-Core Version:    0.6.2
 */