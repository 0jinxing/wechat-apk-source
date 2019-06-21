package a.i.b.a.c.l;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends i
{
  public final ad BJa;
  public final ad BpK;

  public a(ad paramad1, ad paramad2)
  {
    AppMethodBeat.i(122486);
    this.BpK = paramad1;
    this.BJa = paramad2;
    AppMethodBeat.o(122486);
  }

  private a f(g paramg)
  {
    AppMethodBeat.i(122480);
    j.p(paramg, "newAnnotations");
    paramg = new a(this.BpK.d(paramg), this.BJa);
    AppMethodBeat.o(122480);
    return paramg;
  }

  private a sa(boolean paramBoolean)
  {
    AppMethodBeat.i(122483);
    a locala = new a(this.BpK.rL(paramBoolean), this.BJa.rL(paramBoolean));
    AppMethodBeat.o(122483);
    return locala;
  }

  protected final ad eby()
  {
    return this.BpK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a
 * JD-Core Version:    0.6.2
 */