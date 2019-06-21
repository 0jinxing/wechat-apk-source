package com.tencent.mm.plugin.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.RandomAccessFile;

public final class e extends a
{
  public static final int gkf;
  public static final int gkg;
  public static final int gkh;
  long duration = 0L;
  long gki = 0L;
  long gkj = 0L;
  long gkk = 0L;

  static
  {
    AppMethodBeat.i(117846);
    gkf = c.aT("vide");
    gkg = c.aT("soun");
    gkh = c.aT("hint");
    AppMethodBeat.o(117846);
  }

  public e(int paramInt1, long paramLong, int paramInt2)
  {
    super(paramInt1, paramLong, paramInt2, 0L);
  }

  public final boolean a(RandomAccessFile paramRandomAccessFile, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(117845);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = paramRandomAccessFile.read(paramArrayOfByte);
    int n;
    int i1;
    byte[] arrayOfByte;
    label71: boolean bool;
    if (m >= 8)
    {
      n = c.readInt(paramArrayOfByte, 0);
      i1 = c.readInt(paramArrayOfByte, 4);
      if (i1 == a.aWy)
      {
        arrayOfByte = new byte[4];
        i1 = paramRandomAccessFile.read(arrayOfByte);
        if (i1 < 4)
        {
          i1 = -1;
          if (i1 > 0)
            break label255;
          ab.w("MicroMsg.MdiaAtom", "handle mdhd atom error.");
          bool = false;
          AppMethodBeat.o(117845);
        }
      }
    }
    while (true)
    {
      return bool;
      i1 += 0;
      if (arrayOfByte[0] == 0)
      {
        if (!c.a(paramRandomAccessFile, 8L))
        {
          i1 = -1;
          break label71;
        }
        i = paramRandomAccessFile.read(paramArrayOfByte);
        if (i < 8)
        {
          i1 = -1;
          break label71;
        }
        i1 = i1 + 8 + i;
        this.gki = c.B(paramArrayOfByte, 0);
        this.duration = c.B(paramArrayOfByte, 4);
        break label71;
      }
      if (!c.a(paramRandomAccessFile, 16L))
      {
        i1 = -1;
        break label71;
      }
      int i2 = paramRandomAccessFile.read(arrayOfByte);
      if (i2 < 4)
      {
        i1 = -1;
        break label71;
      }
      this.gki = c.B(arrayOfByte, 0);
      i = paramRandomAccessFile.read(paramArrayOfByte);
      if (i < 8)
      {
        i1 = -1;
        break label71;
      }
      i1 = i + (i1 + 16 + i2);
      this.duration = c.af(paramArrayOfByte);
      break label71;
      label255: i = 1;
      long l = n - m - i1;
      i1 = k;
      while (true)
      {
        if ((i != 0) && (j != 0))
        {
          n = i1;
          m = j;
          k = i;
          if (i1 != 0)
            break label493;
        }
        if (c.a(paramRandomAccessFile, l))
          break label468;
        bool = false;
        AppMethodBeat.o(117845);
        break;
        if (i1 == a.aWz)
        {
          if (!c.a(paramRandomAccessFile, 8L))
            i1 = -1;
          while (true)
          {
            if (i1 > 0)
              break label398;
            ab.w("MicroMsg.MdiaAtom", "handle hdlr atom error.");
            bool = false;
            AppMethodBeat.o(117845);
            break;
            i1 = paramRandomAccessFile.read(paramArrayOfByte, 0, 4);
            if (i1 < 4)
            {
              i1 = -1;
            }
            else
            {
              this.gkj = c.readInt(paramArrayOfByte, 0);
              i1 += 8;
            }
          }
          label398: j = 1;
          l = n - m - i1;
          i1 = k;
        }
        else if (i1 == a.aWm)
        {
          this.gkk = (paramRandomAccessFile.getFilePointer() - m);
          l = n - m;
          i1 = 1;
        }
        else
        {
          l = n - 8;
          i1 = k;
        }
      }
      label468: m = paramRandomAccessFile.read(paramArrayOfByte);
      k = i1;
      break;
      n = k;
      k = i;
      m = j;
      label493: if ((k != 0) && (m != 0) && (n != 0))
      {
        bool = true;
        AppMethodBeat.o(117845);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(117845);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.a.e
 * JD-Core Version:    0.6.2
 */