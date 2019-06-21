package g.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import g.a.c.b;

final class a$a
{
  short[] BZM;
  g.a.c.a[] BZN;
  g.a.c.a[] BZO;
  g.a.c.a BZP;
  int BZQ;

  a$a(a parama)
  {
    AppMethodBeat.i(86237);
    this.BZM = new short[2];
    this.BZN = new g.a.c.a[16];
    this.BZO = new g.a.c.a[16];
    this.BZP = new g.a.c.a(8);
    this.BZQ = 0;
    AppMethodBeat.o(86237);
  }

  public final void Vo(int paramInt)
  {
    AppMethodBeat.i(86238);
    while (this.BZQ < paramInt)
    {
      this.BZN[this.BZQ] = new g.a.c.a(3);
      this.BZO[this.BZQ] = new g.a.c.a(3);
      this.BZQ += 1;
    }
    AppMethodBeat.o(86238);
  }

  public final int a(b paramb, int paramInt)
  {
    AppMethodBeat.i(86240);
    if (paramb.g(this.BZM, 0) == 0)
    {
      paramInt = this.BZN[paramInt].a(paramb);
      AppMethodBeat.o(86240);
      return paramInt;
    }
    if (paramb.g(this.BZM, 1) == 0);
    for (paramInt = this.BZO[paramInt].a(paramb) + 8; ; paramInt = this.BZP.a(paramb) + 8 + 8)
    {
      AppMethodBeat.o(86240);
      break;
    }
  }

  public final void enq()
  {
    AppMethodBeat.i(86239);
    b.c(this.BZM);
    for (int i = 0; i < this.BZQ; i++)
    {
      b.c(this.BZN[i].BZY);
      b.c(this.BZO[i].BZY);
    }
    b.c(this.BZP.BZY);
    AppMethodBeat.o(86239);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     g.a.b.a.a
 * JD-Core Version:    0.6.2
 */