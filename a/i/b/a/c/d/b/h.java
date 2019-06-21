package a.i.b.a.c.d.b;

import a.f.b.j;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h<T>
{
  private int Bru;
  private T Brv;
  private final k<T> Brw;

  public final void dH(T paramT)
  {
    AppMethodBeat.i(120265);
    j.p(paramT, "objectType");
    dI(paramT);
    AppMethodBeat.o(120265);
  }

  final void dI(T paramT)
  {
    AppMethodBeat.i(120266);
    j.p(paramT, "type");
    if (this.Brv == null)
      this.Brv = this.Brw.avM(m.s((CharSequence)"[", this.Bru) + this.Brw.toString(paramT));
    AppMethodBeat.o(120266);
  }

  public final void ecs()
  {
    if (this.Brv == null)
      this.Bru += 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.h
 * JD-Core Version:    0.6.2
 */