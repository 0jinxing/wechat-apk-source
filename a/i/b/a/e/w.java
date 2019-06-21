package a.i.b.a.e;

import a.f.b.j;
import a.i.b.a.c.d.a.e.v;
import a.l;
import java.lang.reflect.Type;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "()V", "reflectType", "Ljava/lang/reflect/Type;", "getReflectType", "()Ljava/lang/reflect/Type;", "equals", "", "other", "", "hashCode", "", "toString", "", "Factory", "descriptors.runtime"})
public abstract class w
  implements v
{
  public static final w.a BOj = new w.a((byte)0);

  protected abstract Type ekI();

  public boolean equals(Object paramObject)
  {
    if (((paramObject instanceof w)) && (j.j(ekI(), ((w)paramObject).ekI())));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public int hashCode()
  {
    return ekI().hashCode();
  }

  public String toString()
  {
    return getClass().getName() + ": " + ekI();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.w
 * JD-Core Version:    0.6.2
 */