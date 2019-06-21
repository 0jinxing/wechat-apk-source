package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

final class u$d extends InputStream
{
  private u.b BAu;
  private p BAv;
  private int BAw;
  private int BAx;
  private int BAy;
  private int mark;

  public u$d(u paramu)
  {
    AppMethodBeat.i(121596);
    initialize();
    AppMethodBeat.o(121596);
  }

  private int B(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121599);
    int i = paramInt2;
    int j = paramInt1;
    paramInt1 = i;
    i = j;
    if (paramInt1 > 0)
    {
      eiE();
      if (this.BAv == null)
      {
        if (paramInt1 != paramInt2)
          break label116;
        paramInt1 = -1;
        AppMethodBeat.o(121599);
      }
    }
    while (true)
    {
      return paramInt1;
      int k = Math.min(this.BAw - this.BAx, paramInt1);
      j = i;
      if (paramArrayOfByte != null)
      {
        this.BAv.f(paramArrayOfByte, this.BAx, i, k);
        j = i + k;
      }
      this.BAx += k;
      paramInt1 -= k;
      i = j;
      break;
      label116: paramInt1 = paramInt2 - paramInt1;
      AppMethodBeat.o(121599);
    }
  }

  private void eiE()
  {
    AppMethodBeat.i(121604);
    if ((this.BAv != null) && (this.BAx == this.BAw))
    {
      this.BAy += this.BAw;
      this.BAx = 0;
      if (this.BAu.hasNext())
      {
        this.BAv = this.BAu.eiD();
        this.BAw = this.BAv.size();
        AppMethodBeat.o(121604);
      }
    }
    while (true)
    {
      return;
      this.BAv = null;
      this.BAw = 0;
      AppMethodBeat.o(121604);
    }
  }

  private void initialize()
  {
    AppMethodBeat.i(121603);
    this.BAu = new u.b(this.BAt, (byte)0);
    this.BAv = this.BAu.eiD();
    this.BAw = this.BAv.size();
    this.BAx = 0;
    this.BAy = 0;
    AppMethodBeat.o(121603);
  }

  public final int available()
  {
    AppMethodBeat.i(121601);
    int i = this.BAy;
    int j = this.BAx;
    int k = this.BAt.size();
    AppMethodBeat.o(121601);
    return k - (i + j);
  }

  public final void mark(int paramInt)
  {
    this.mark = (this.BAy + this.BAx);
  }

  public final boolean markSupported()
  {
    return true;
  }

  public final int read()
  {
    AppMethodBeat.i(121600);
    eiE();
    int i;
    if (this.BAv == null)
    {
      i = -1;
      AppMethodBeat.o(121600);
    }
    while (true)
    {
      return i;
      p localp = this.BAv;
      i = this.BAx;
      this.BAx = (i + 1);
      i = localp.Us(i) & 0xFF;
      AppMethodBeat.o(121600);
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121597);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = new NullPointerException();
      AppMethodBeat.o(121597);
      throw paramArrayOfByte;
    }
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt2 > paramArrayOfByte.length - paramInt1))
    {
      paramArrayOfByte = new IndexOutOfBoundsException();
      AppMethodBeat.o(121597);
      throw paramArrayOfByte;
    }
    paramInt1 = B(paramArrayOfByte, paramInt1, paramInt2);
    AppMethodBeat.o(121597);
    return paramInt1;
  }

  public final void reset()
  {
    try
    {
      AppMethodBeat.i(121602);
      initialize();
      B(null, 0, this.mark);
      AppMethodBeat.o(121602);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(121598);
    if (paramLong < 0L)
    {
      IndexOutOfBoundsException localIndexOutOfBoundsException = new IndexOutOfBoundsException();
      AppMethodBeat.o(121598);
      throw localIndexOutOfBoundsException;
    }
    long l = paramLong;
    if (paramLong > 2147483647L)
      l = 2147483647L;
    paramLong = B(null, 0, (int)l);
    AppMethodBeat.o(121598);
    return paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.u.d
 * JD-Core Version:    0.6.2
 */