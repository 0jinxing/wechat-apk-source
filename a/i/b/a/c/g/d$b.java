package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;
import java.util.ArrayList;

public final class d$b extends OutputStream
{
  private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
  private final int Bzr;
  private final ArrayList<d> Bzs;
  private int Bzt;
  private byte[] buffer;
  private int bxm;

  d$b()
  {
    AppMethodBeat.i(121420);
    this.Bzr = 128;
    this.Bzs = new ArrayList();
    this.buffer = new byte[''];
    AppMethodBeat.o(121420);
  }

  private void Ut(int paramInt)
  {
    AppMethodBeat.i(121425);
    this.Bzs.add(new p(this.buffer));
    this.Bzt += this.buffer.length;
    this.buffer = new byte[Math.max(this.Bzr, Math.max(paramInt, this.Bzt >>> 1))];
    this.bxm = 0;
    AppMethodBeat.o(121425);
  }

  private int size()
  {
    try
    {
      int i = this.Bzt;
      int j = this.bxm;
      return i + j;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final d ehW()
  {
    try
    {
      AppMethodBeat.i(121423);
      Object localObject1;
      Object localObject2;
      if (this.bxm < this.buffer.length)
        if (this.bxm > 0)
        {
          localObject1 = this.buffer;
          int i = this.bxm;
          localObject2 = new byte[i];
          System.arraycopy(localObject1, 0, localObject2, 0, Math.min(localObject1.length, i));
          ArrayList localArrayList = this.Bzs;
          localObject1 = new a/i/b/a/c/g/p;
          ((p)localObject1).<init>((byte[])localObject2);
          localArrayList.add(localObject1);
        }
      while (true)
      {
        this.Bzt += this.bxm;
        this.bxm = 0;
        localObject2 = d.w(this.Bzs);
        AppMethodBeat.o(121423);
        return localObject2;
        localObject1 = this.Bzs;
        localObject2 = new a/i/b/a/c/g/p;
        ((p)localObject2).<init>(this.buffer);
        ((ArrayList)localObject1).add(localObject2);
        this.buffer = EMPTY_BYTE_ARRAY;
      }
    }
    finally
    {
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(121424);
    String str = String.format("<ByteString.Output@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()) });
    AppMethodBeat.o(121424);
    return str;
  }

  public final void write(int paramInt)
  {
    try
    {
      AppMethodBeat.i(121421);
      if (this.bxm == this.buffer.length)
        Ut(1);
      byte[] arrayOfByte = this.buffer;
      int i = this.bxm;
      this.bxm = (i + 1);
      arrayOfByte[i] = ((byte)(byte)paramInt);
      AppMethodBeat.o(121421);
      return;
    }
    finally
    {
    }
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(121422);
      if (paramInt2 <= this.buffer.length - this.bxm)
      {
        System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, this.bxm, paramInt2);
        this.bxm += paramInt2;
        AppMethodBeat.o(121422);
      }
      while (true)
      {
        return;
        int i = this.buffer.length - this.bxm;
        System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, this.bxm, i);
        paramInt2 -= i;
        Ut(paramInt2);
        System.arraycopy(paramArrayOfByte, paramInt1 + i, this.buffer, 0, paramInt2);
        this.bxm = paramInt2;
        AppMethodBeat.o(121422);
      }
    }
    finally
    {
    }
    throw paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.d.b
 * JD-Core Version:    0.6.2
 */