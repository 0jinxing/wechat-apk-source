package a.i.b.a.c.b.c;

import a.i.b.a.c.b.a.b;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.f;
import a.i.b.a.c.h.c;

public abstract class j extends b
  implements l
{
  protected final f BgZ;

  public j(g paramg, f paramf)
  {
    super(paramg);
    this.BgZ = paramf;
  }

  public static String h(l paraml)
  {
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = c.BBN.k(paraml) + "[" + paraml.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(paraml)) + "]";
      paraml = (l)localObject;
      return paraml;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        paraml = paraml.getClass().getSimpleName() + " " + paraml.dZg();
    }
  }

  public l dZd()
  {
    return this;
  }

  public final f dZg()
  {
    return this.BgZ;
  }

  public String toString()
  {
    return h(this);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.j
 * JD-Core Version:    0.6.2
 */