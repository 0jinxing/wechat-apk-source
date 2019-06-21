package a.i.b.a.c.i;

import a.f.b.j;
import a.i.b.a.c.b.b;

public abstract class h extends i
{
  protected abstract void a(b paramb1, b paramb2);

  public final void b(b paramb1, b paramb2)
  {
    j.p(paramb1, "fromSuper");
    j.p(paramb2, "fromCurrent");
    a(paramb1, paramb2);
  }

  public final void c(b paramb1, b paramb2)
  {
    j.p(paramb1, "first");
    j.p(paramb2, "second");
    a(paramb1, paramb2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.h
 * JD-Core Version:    0.6.2
 */