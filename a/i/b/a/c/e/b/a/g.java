package a.i.b.a.c.e.b.a;

import a.f.b.j;
import a.i.b.a.c.e.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class g extends a
{
  public static final g Byu;
  public static final g Byv;
  public static final g.a Byw;
  private final boolean Byt;

  static
  {
    AppMethodBeat.i(121321);
    Byw = new g.a((byte)0);
    Byu = new g(new int[] { 1, 1, 13 });
    Byv = new g(new int[0]);
    AppMethodBeat.o(121321);
  }

  public g(int[] paramArrayOfInt)
  {
    this(paramArrayOfInt, false);
    AppMethodBeat.i(121320);
    AppMethodBeat.o(121320);
  }

  public g(int[] paramArrayOfInt, boolean paramBoolean)
  {
    super(Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length));
    AppMethodBeat.i(121319);
    this.Byt = paramBoolean;
    AppMethodBeat.o(121319);
  }

  public final boolean ehy()
  {
    AppMethodBeat.i(121318);
    a locala;
    int i;
    if ((this.major != 1) || (this.minor != 0))
      if (this.Byt)
      {
        locala = (a)Byu;
        j.p(locala, "ourVersion");
        if (this.major == 0)
          if ((locala.major == 0) && (this.minor == locala.minor))
          {
            i = 1;
            if (i == 0)
              break label143;
            AppMethodBeat.o(121318);
          }
      }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 0;
      break;
      if ((this.major == locala.major) && (this.minor <= locala.minor))
      {
        i = 1;
        break;
      }
      i = 0;
      break;
      if ((this.major == 1) && (this.minor <= 4))
      {
        i = 1;
        break;
      }
      i = 0;
      break;
      label143: AppMethodBeat.o(121318);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.g
 * JD-Core Version:    0.6.2
 */