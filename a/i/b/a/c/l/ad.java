package a.i.b.a.c.l;

import a.i.b.a.c.b.a.g;
import a.k.m;
import java.util.Iterator;
import java.util.List;

public abstract class ad extends az
{
  public ad()
  {
    super((byte)0);
  }

  public abstract ad d(g paramg);

  public abstract ad rL(boolean paramBoolean);

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = dYn().iterator();
    while (localIterator.hasNext())
    {
      localObject = (a.i.b.a.c.b.a.c)localIterator.next();
      m.a(localStringBuilder, new String[] { "[", a.i.b.a.c.h.c.a(a.i.b.a.c.h.c.BBN, (a.i.b.a.c.b.a.c)localObject), "] " });
    }
    localStringBuilder.append(ejw());
    if (!ejt().isEmpty())
      a.a.j.a((Iterable)ejt(), (Appendable)localStringBuilder, (CharSequence)", ", (CharSequence)"<", (CharSequence)">", 0, null, null, 112);
    if (eci())
      localStringBuilder.append("?");
    Object localObject = localStringBuilder.toString();
    a.f.b.j.o(localObject, "StringBuilder().apply(builderAction).toString()");
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.ad
 * JD-Core Version:    0.6.2
 */