package com.bumptech.glide.b;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.List;

public final class d
{
  public final byte[] ayl;
  public ByteBuffer aym;
  public c ayn;
  public int blockSize;

  public d()
  {
    AppMethodBeat.i(123372);
    this.ayl = new byte[256];
    this.blockSize = 0;
    AppMethodBeat.o(123372);
  }

  private int[] dc(int paramInt)
  {
    AppMethodBeat.i(123376);
    int[] arrayOfInt1 = null;
    byte[] arrayOfByte = new byte[paramInt * 3];
    int[] arrayOfInt2 = arrayOfInt1;
    try
    {
      this.aym.get(arrayOfByte);
      arrayOfInt2 = arrayOfInt1;
      arrayOfInt1 = new int[256];
      int i = 0;
      for (int j = 0; ; j++)
      {
        arrayOfInt2 = arrayOfInt1;
        if (j >= paramInt)
          break;
        int k = i + 1;
        int m = arrayOfByte[i];
        int n = k + 1;
        k = arrayOfByte[k];
        i = n + 1;
        arrayOfInt1[j] = ((m & 0xFF) << 16 | 0xFF000000 | (k & 0xFF) << 8 | arrayOfByte[n] & 0xFF);
      }
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      Log.isLoggable("GifHeaderParser", 3);
      this.ayn.status = 1;
      AppMethodBeat.o(123376);
    }
    return arrayOfInt2;
  }

  private void lZ()
  {
    AppMethodBeat.i(123374);
    do
    {
      mc();
      if (this.ayl[0] == 1)
      {
        int i = this.ayl[1];
        int j = this.ayl[2];
        this.ayn.ayk = (i & 0xFF | (j & 0xFF) << 8);
      }
    }
    while ((this.blockSize > 0) && (!md()));
    AppMethodBeat.o(123374);
  }

  private void mb()
  {
    AppMethodBeat.i(123377);
    int i;
    do
    {
      i = read();
      int j = Math.min(this.aym.position() + i, this.aym.limit());
      this.aym.position(j);
    }
    while (i > 0);
    AppMethodBeat.o(123377);
  }

  private void mc()
  {
    AppMethodBeat.i(123378);
    this.blockSize = read();
    int i;
    int j;
    int k;
    if (this.blockSize > 0)
    {
      i = 0;
      j = 0;
      k = i;
    }
    while (true)
    {
      try
      {
        if (j < this.blockSize)
        {
          k = i;
          i = this.blockSize - j;
          k = i;
          this.aym.get(this.ayl, j, i);
          j += i;
          break;
        }
        AppMethodBeat.o(123378);
        return;
      }
      catch (Exception localException)
      {
        if (Log.isLoggable("GifHeaderParser", 3))
          new StringBuilder("Error Reading Block n: ").append(j).append(" count: ").append(k).append(" blockSize: ").append(this.blockSize);
        this.ayn.status = 1;
      }
      AppMethodBeat.o(123378);
    }
  }

  private int read()
  {
    AppMethodBeat.i(123379);
    int i = 0;
    try
    {
      int j = this.aym.get();
      i = j & 0xFF;
      AppMethodBeat.o(123379);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        this.ayn.status = 1;
    }
  }

  public final void lY()
  {
    AppMethodBeat.i(123373);
    int i = 0;
    while ((i == 0) && (!md()) && (this.ayn.frameCount <= 2147483647))
    {
      int j;
      int k;
      label186: Object localObject;
      boolean bool;
      switch (read())
      {
      default:
        this.ayn.status = 1;
        break;
      case 44:
        if (this.ayn.aye == null)
          this.ayn.aye = new b();
        this.ayn.aye.axT = this.aym.getShort();
        this.ayn.aye.axU = this.aym.getShort();
        this.ayn.aye.axV = this.aym.getShort();
        this.ayn.aye.axW = this.aym.getShort();
        j = read();
        int m;
        if ((j & 0x80) != 0)
        {
          k = 1;
          m = (int)Math.pow(2.0D, (j & 0x7) + 1);
          localObject = this.ayn.aye;
          if ((j & 0x40) == 0)
            break label327;
          bool = true;
          ((b)localObject).axX = bool;
          if (k == 0)
            break label333;
        }
        for (this.ayn.aye.ayc = dc(m); ; this.ayn.aye.ayc = null)
        {
          this.ayn.aye.ayb = this.aym.position();
          read();
          mb();
          if (md())
            break;
          localObject = this.ayn;
          ((c)localObject).frameCount += 1;
          this.ayn.ayf.add(this.ayn.aye);
          break;
          k = 0;
          break label186;
          bool = false;
          break label221;
        }
      case 33:
        label327: label333: switch (read())
        {
        default:
          mb();
          break;
        case 249:
          this.ayn.aye = new b();
          read();
          k = read();
          this.ayn.aye.axZ = ((k & 0x1C) >> 2);
          if (this.ayn.aye.axZ == 0)
            this.ayn.aye.axZ = 1;
          localObject = this.ayn.aye;
          if ((k & 0x1) != 0);
          for (bool = true; ; bool = false)
          {
            ((b)localObject).axY = bool;
            j = this.aym.getShort();
            k = j;
            if (j < 2)
              k = 10;
            this.ayn.aye.delay = (k * 10);
            this.ayn.aye.aya = read();
            read();
            break;
          }
        case 255:
          mc();
          localObject = new StringBuilder();
          for (k = 0; k < 11; k++)
            ((StringBuilder)localObject).append((char)this.ayl[k]);
          if (((StringBuilder)localObject).toString().equals("NETSCAPE2.0"))
            lZ();
          else
            mb();
          break;
        case 254:
          mb();
          break;
        case 1:
          mb();
        }
        break;
      case 59:
        label221: i = 1;
      }
    }
    AppMethodBeat.o(123373);
  }

  public final void ma()
  {
    boolean bool = true;
    AppMethodBeat.i(123375);
    Object localObject = new StringBuilder();
    for (int i = 0; i < 6; i++)
      ((StringBuilder)localObject).append((char)read());
    if (!((StringBuilder)localObject).toString().startsWith("GIF"))
    {
      this.ayn.status = 1;
      AppMethodBeat.o(123375);
      return;
    }
    this.ayn.width = this.aym.getShort();
    this.ayn.height = this.aym.getShort();
    i = read();
    localObject = this.ayn;
    if ((i & 0x80) != 0);
    while (true)
    {
      ((c)localObject).ayg = bool;
      this.ayn.ayh = ((int)Math.pow(2.0D, (i & 0x7) + 1));
      this.ayn.ayi = read();
      this.ayn.ayj = read();
      if ((this.ayn.ayg) && (!md()))
      {
        this.ayn.ayd = dc(this.ayn.ayh);
        this.ayn.bgColor = this.ayn.ayd[this.ayn.ayi];
      }
      AppMethodBeat.o(123375);
      break;
      bool = false;
    }
  }

  public final boolean md()
  {
    if (this.ayn.status != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.b.d
 * JD-Core Version:    0.6.2
 */