package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Stack;

final class u$a
{
  final Stack<d> BAn;

  private u$a()
  {
    AppMethodBeat.i(121583);
    this.BAn = new Stack();
    AppMethodBeat.o(121583);
  }

  private static int UD(int paramInt)
  {
    AppMethodBeat.i(121585);
    int i = Arrays.binarySearch(u.eiB(), paramInt);
    paramInt = i;
    if (i < 0)
      paramInt = -(i + 1) - 1;
    AppMethodBeat.o(121585);
    return paramInt;
  }

  final void f(d paramd)
  {
    AppMethodBeat.i(121584);
    while (true)
    {
      if (paramd.ehU())
      {
        int i = UD(paramd.size());
        int j = u.eiB()[(i + 1)];
        if ((this.BAn.isEmpty()) || (((d)this.BAn.peek()).size() >= j))
        {
          this.BAn.push(paramd);
          AppMethodBeat.o(121584);
        }
        while (true)
        {
          return;
          i = u.eiB()[i];
          for (Object localObject = (d)this.BAn.pop(); (!this.BAn.isEmpty()) && (((d)this.BAn.peek()).size() < i); localObject = new u((d)this.BAn.pop(), (d)localObject, (byte)0));
          for (paramd = new u((d)localObject, paramd, (byte)0); !this.BAn.isEmpty(); paramd = new u((d)this.BAn.pop(), paramd, (byte)0))
          {
            i = UD(paramd.size());
            i = u.eiB()[(i + 1)];
            if (((d)this.BAn.peek()).size() >= i)
              break;
          }
          this.BAn.push(paramd);
          AppMethodBeat.o(121584);
        }
      }
      if (!(paramd instanceof u))
        break;
      paramd = (u)paramd;
      f(u.a(paramd));
      paramd = u.b(paramd);
    }
    paramd = String.valueOf(String.valueOf(paramd.getClass()));
    paramd = new IllegalArgumentException(paramd.length() + 49 + "Has a new type of ByteString been created? Found " + paramd);
    AppMethodBeat.o(121584);
    throw paramd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.u.a
 * JD-Core Version:    0.6.2
 */