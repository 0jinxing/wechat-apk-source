package org.apache.commons.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends OutputStream
{
  private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
  private int BWA;
  private byte[] BWB;
  private boolean BWC;
  private final List<byte[]> BWy;
  private int BWz;
  private int count;

  public a()
  {
    this((byte)0);
  }

  private a(byte paramByte)
  {
    AppMethodBeat.i(136486);
    this.BWy = new ArrayList();
    this.BWC = true;
    try
    {
      Vl(1024);
      return;
    }
    finally
    {
      AppMethodBeat.o(136486);
    }
  }

  private void Vl(int paramInt)
  {
    AppMethodBeat.i(136487);
    if (this.BWz < this.BWy.size() - 1)
    {
      this.BWA += this.BWB.length;
      this.BWz += 1;
      this.BWB = ((byte[])this.BWy.get(this.BWz));
      AppMethodBeat.o(136487);
      return;
    }
    if (this.BWB == null);
    for (this.BWA = 0; ; this.BWA += this.BWB.length)
    {
      this.BWz += 1;
      this.BWB = new byte[paramInt];
      this.BWy.add(this.BWB);
      AppMethodBeat.o(136487);
      break;
      paramInt = Math.max(this.BWB.length << 1, paramInt - this.BWA);
    }
  }

  public final void close()
  {
  }

  public final byte[] toByteArray()
  {
    while (true)
    {
      int j;
      int k;
      try
      {
        AppMethodBeat.i(136490);
        int i = this.count;
        if (i == 0)
        {
          arrayOfByte1 = EMPTY_BYTE_ARRAY;
          AppMethodBeat.o(136490);
          return arrayOfByte1;
        }
        byte[] arrayOfByte1 = new byte[i];
        Iterator localIterator = this.BWy.iterator();
        j = 0;
        if (localIterator.hasNext())
        {
          byte[] arrayOfByte2 = (byte[])localIterator.next();
          k = Math.min(arrayOfByte2.length, i);
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, j, k);
          i -= k;
          if (i != 0);
        }
        else
        {
          AppMethodBeat.o(136490);
          continue;
        }
      }
      finally
      {
      }
      j += k;
    }
  }

  @Deprecated
  public final String toString()
  {
    AppMethodBeat.i(136491);
    String str = new String(toByteArray(), Charset.defaultCharset());
    AppMethodBeat.o(136491);
    return str;
  }

  public final void write(int paramInt)
  {
    try
    {
      AppMethodBeat.i(136489);
      int i = this.count - this.BWA;
      int j = i;
      if (i == this.BWB.length)
      {
        Vl(this.count + 1);
        j = 0;
      }
      this.BWB[j] = ((byte)(byte)paramInt);
      this.count += 1;
      AppMethodBeat.o(136489);
      return;
    }
    finally
    {
    }
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(136488);
    if ((paramInt1 < 0) || (paramInt1 > paramArrayOfByte.length) || (paramInt2 < 0) || (paramInt1 + paramInt2 > paramArrayOfByte.length) || (paramInt1 + paramInt2 < 0))
    {
      paramArrayOfByte = new IndexOutOfBoundsException();
      AppMethodBeat.o(136488);
      throw paramArrayOfByte;
    }
    if (paramInt2 == 0)
      AppMethodBeat.o(136488);
    while (true)
    {
      return;
      try
      {
        int i = this.count + paramInt2;
        int j = this.count - this.BWA;
        int k = paramInt2;
        while (k > 0)
        {
          int m = Math.min(k, this.BWB.length - j);
          System.arraycopy(paramArrayOfByte, paramInt1 + paramInt2 - k, this.BWB, j, m);
          m = k - m;
          k = m;
          if (m > 0)
          {
            Vl(i);
            j = 0;
            k = m;
          }
        }
        this.count = i;
        AppMethodBeat.o(136488);
      }
      finally
      {
        AppMethodBeat.o(136488);
      }
    }
    throw paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.apache.commons.a.a.a
 * JD-Core Version:    0.6.2
 */