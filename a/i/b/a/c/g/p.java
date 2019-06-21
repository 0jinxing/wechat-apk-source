package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;
import java.util.NoSuchElementException;

class p extends d
{
  private int puf = 0;
  protected final byte[] wR;

  p(byte[] paramArrayOfByte)
  {
    this.wR = paramArrayOfByte;
  }

  private static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (int i = paramInt2; i < paramInt2 + paramInt3; i++)
      paramInt1 = paramInt1 * 31 + paramArrayOfByte[i];
    return paramInt1;
  }

  public byte Us(int paramInt)
  {
    return this.wR[paramInt];
  }

  final boolean a(p paramp, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121577);
    if (paramInt2 > paramp.size())
    {
      paramInt1 = size();
      paramp = new IllegalArgumentException(40 + "Length too large: " + paramInt2 + paramInt1);
      AppMethodBeat.o(121577);
      throw paramp;
    }
    if (paramInt1 + paramInt2 > paramp.size())
    {
      i = paramp.size();
      paramp = new IllegalArgumentException(59 + "Ran off end of other: " + paramInt1 + ", " + paramInt2 + ", " + i);
      AppMethodBeat.o(121577);
      throw paramp;
    }
    byte[] arrayOfByte1 = this.wR;
    byte[] arrayOfByte2 = paramp.wR;
    int j = ehO();
    int i = ehO();
    paramInt1 = paramp.ehO() + paramInt1;
    boolean bool;
    if (i < j + paramInt2)
      if (arrayOfByte1[i] != arrayOfByte2[paramInt1])
      {
        bool = false;
        AppMethodBeat.o(121577);
      }
    while (true)
    {
      return bool;
      i++;
      paramInt1++;
      break;
      bool = true;
      AppMethodBeat.o(121577);
    }
  }

  protected final int aR(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(121575);
    paramInt2 = ehO() + paramInt2;
    byte[] arrayOfByte = this.wR;
    int i = paramInt2 + paramInt3;
    int j;
    int k;
    int m;
    if (paramInt1 != 0)
    {
      if (paramInt2 >= i)
        AppMethodBeat.o(121575);
      while (true)
      {
        return paramInt1;
        j = (byte)paramInt1;
        if (j < -32)
        {
          if (j >= -62)
          {
            paramInt1 = paramInt2 + 1;
            if (arrayOfByte[paramInt2] <= -65)
              break label343;
          }
          AppMethodBeat.o(121575);
          paramInt1 = -1;
        }
        else if (j < -16)
        {
          k = (byte)(paramInt1 >> 8 ^ 0xFFFFFFFF);
          paramInt1 = k;
          paramInt3 = paramInt2;
          if (k == 0)
          {
            paramInt3 = paramInt2 + 1;
            paramInt1 = arrayOfByte[paramInt2];
            if (paramInt3 >= i)
            {
              paramInt1 = y.iq(j, paramInt1);
              AppMethodBeat.o(121575);
            }
          }
          else
          {
            if ((paramInt1 <= -65) && ((j != -32) || (paramInt1 >= -96)) && ((j != -19) || (paramInt1 < -96)))
            {
              paramInt1 = paramInt3 + 1;
              if (arrayOfByte[paramInt3] <= -65)
                break label343;
            }
            AppMethodBeat.o(121575);
            paramInt1 = -1;
          }
        }
        else
        {
          paramInt3 = (byte)(paramInt1 >> 8 ^ 0xFFFFFFFF);
          k = 0;
          if (paramInt3 != 0)
            break;
          m = paramInt2 + 1;
          paramInt3 = arrayOfByte[paramInt2];
          if (m < i)
            break label360;
          paramInt1 = y.iq(j, paramInt3);
          AppMethodBeat.o(121575);
        }
      }
      paramInt1 = (byte)(paramInt1 >> 16);
    }
    while (true)
    {
      label343: label360: if (paramInt1 == 0)
      {
        k = paramInt2 + 1;
        m = arrayOfByte[paramInt2];
        paramInt1 = m;
        paramInt2 = k;
        if (k >= i)
        {
          paramInt1 = y.aT(j, paramInt3, m);
          AppMethodBeat.o(121575);
          break;
        }
      }
      if ((paramInt3 <= -65) && ((j << 28) + (paramInt3 + 112) >> 30 == 0) && (paramInt1 <= -65))
      {
        paramInt1 = paramInt2 + 1;
        if (arrayOfByte[paramInt2] <= -65);
      }
      else
      {
        AppMethodBeat.o(121575);
        paramInt1 = -1;
        break;
        paramInt1 = paramInt2;
      }
      paramInt1 = y.D(arrayOfByte, paramInt1, i);
      AppMethodBeat.o(121575);
      break;
      paramInt1 = k;
      paramInt2 = m;
    }
  }

  protected final int aS(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(121579);
    paramInt1 = a(paramInt1, this.wR, ehO() + paramInt2, paramInt3);
    AppMethodBeat.o(121579);
    return paramInt1;
  }

  final void b(OutputStream paramOutputStream, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121572);
    paramOutputStream.write(this.wR, ehO() + paramInt1, paramInt2);
    AppMethodBeat.o(121572);
  }

  protected int ehO()
  {
    return 0;
  }

  public d.a ehP()
  {
    AppMethodBeat.i(121581);
    a locala = new a((byte)0);
    AppMethodBeat.o(121581);
    return locala;
  }

  public final boolean ehQ()
  {
    AppMethodBeat.i(121574);
    int i = ehO();
    boolean bool = y.C(this.wR, i, size() + i);
    AppMethodBeat.o(121574);
    return bool;
  }

  public final e ehR()
  {
    AppMethodBeat.i(121580);
    e locale = e.a(this);
    AppMethodBeat.o(121580);
    return locale;
  }

  protected final int ehT()
  {
    return 0;
  }

  protected final boolean ehU()
  {
    return true;
  }

  protected final int ehV()
  {
    return this.puf;
  }

  public boolean equals(Object paramObject)
  {
    AppMethodBeat.i(121576);
    boolean bool;
    if (paramObject == this)
    {
      AppMethodBeat.o(121576);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof d))
      {
        AppMethodBeat.o(121576);
        bool = false;
      }
      else if (size() != ((d)paramObject).size())
      {
        AppMethodBeat.o(121576);
        bool = false;
      }
      else if (size() == 0)
      {
        AppMethodBeat.o(121576);
        bool = true;
      }
      else if ((paramObject instanceof p))
      {
        bool = a((p)paramObject, 0, size());
        AppMethodBeat.o(121576);
      }
      else
      {
        if (!(paramObject instanceof u))
          break;
        bool = paramObject.equals(this);
        AppMethodBeat.o(121576);
      }
    }
    paramObject = String.valueOf(String.valueOf(paramObject.getClass()));
    paramObject = new IllegalArgumentException(paramObject.length() + 49 + "Has a new type of ByteString been created? Found " + paramObject);
    AppMethodBeat.o(121576);
    throw paramObject;
  }

  protected void g(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(121571);
    System.arraycopy(this.wR, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    AppMethodBeat.o(121571);
  }

  public int hashCode()
  {
    AppMethodBeat.i(121578);
    int i = this.puf;
    int j = i;
    if (i == 0)
    {
      j = size();
      i = aS(j, 0, j);
      j = i;
      if (i == 0)
        j = 1;
      this.puf = j;
    }
    AppMethodBeat.o(121578);
    return j;
  }

  public int size()
  {
    return this.wR.length;
  }

  public final String toString(String paramString)
  {
    AppMethodBeat.i(121573);
    paramString = new String(this.wR, ehO(), size(), paramString);
    AppMethodBeat.o(121573);
    return paramString;
  }

  final class a
    implements d.a
  {
    private final int limit;
    private int position;

    private a()
    {
      AppMethodBeat.i(121567);
      this.position = 0;
      this.limit = p.this.size();
      AppMethodBeat.o(121567);
    }

    public final boolean hasNext()
    {
      if (this.position < this.limit);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final byte nextByte()
    {
      AppMethodBeat.i(121568);
      try
      {
        byte[] arrayOfByte = p.this.wR;
        int i = this.position;
        this.position = (i + 1);
        byte b = arrayOfByte[i];
        AppMethodBeat.o(121568);
        return b;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        NoSuchElementException localNoSuchElementException = new NoSuchElementException(localArrayIndexOutOfBoundsException.getMessage());
        AppMethodBeat.o(121568);
        throw localNoSuchElementException;
      }
    }

    public final void remove()
    {
      AppMethodBeat.i(121569);
      UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
      AppMethodBeat.o(121569);
      throw localUnsupportedOperationException;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.p
 * JD-Core Version:    0.6.2
 */