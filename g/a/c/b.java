package g.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class b
{
  public int Caa;
  public InputStream Cab;
  public int xcZ;

  public static void c(short[] paramArrayOfShort)
  {
    for (int i = 0; i < paramArrayOfShort.length; i++)
      paramArrayOfShort[i] = ((short)1024);
  }

  public final int g(short[] paramArrayOfShort, int paramInt)
  {
    AppMethodBeat.i(86247);
    int i = paramArrayOfShort[paramInt];
    int j = (this.Caa >>> 11) * i;
    if ((this.xcZ ^ 0x80000000) < (0x80000000 ^ j))
    {
      this.Caa = j;
      paramArrayOfShort[paramInt] = ((short)(short)(i + (2048 - i >>> 5)));
      if ((this.Caa & 0xFF000000) == 0)
      {
        this.xcZ = (this.xcZ << 8 | this.Cab.read());
        this.Caa <<= 8;
      }
      paramInt = 0;
      AppMethodBeat.o(86247);
    }
    while (true)
    {
      return paramInt;
      this.Caa -= j;
      this.xcZ -= j;
      paramArrayOfShort[paramInt] = ((short)(short)(i - (i >>> 5)));
      if ((this.Caa & 0xFF000000) == 0)
      {
        this.xcZ = (this.xcZ << 8 | this.Cab.read());
        this.Caa <<= 8;
      }
      paramInt = 1;
      AppMethodBeat.o(86247);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     g.a.c.b
 * JD-Core Version:    0.6.2
 */