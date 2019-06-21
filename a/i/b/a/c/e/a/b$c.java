package a.i.b.a.c.e.a;

import a.i.b.a.c.g.j.a;

public abstract class b$c<E>
{
  public final int Bxf;
  public final int offset;

  private b$c(int paramInt1, int paramInt2)
  {
    this.offset = paramInt1;
    this.Bxf = paramInt2;
  }

  public static b.a a(c<?> paramc)
  {
    return new b.a(paramc.offset + paramc.Bxf);
  }

  public static <E extends j.a> c<E> a(c<?> paramc, E[] paramArrayOfE)
  {
    return new b.b(paramc.offset + paramc.Bxf, paramArrayOfE);
  }

  public static b.a egn()
  {
    return new b.a(0);
  }

  public abstract int dK(E paramE);

  public abstract E get(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.b.c
 * JD-Core Version:    0.6.2
 */