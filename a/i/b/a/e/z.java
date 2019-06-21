package a.i.b.a.e;

import a.a.e;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaWildcardType;", "reflectType", "Ljava/lang/reflect/WildcardType;", "(Ljava/lang/reflect/WildcardType;)V", "bound", "getBound", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "isExtends", "", "()Z", "getReflectType", "()Ljava/lang/reflect/WildcardType;", "descriptors.runtime"})
public final class z extends w
  implements a.i.b.a.c.d.a.e.z
{
  private final WildcardType BOp;

  public z(WildcardType paramWildcardType)
  {
    AppMethodBeat.i(123132);
    this.BOp = paramWildcardType;
    AppMethodBeat.o(123132);
  }

  public final boolean ece()
  {
    AppMethodBeat.i(123131);
    Type[] arrayOfType = this.BOp.getUpperBounds();
    j.o(arrayOfType, "reflectType.upperBounds");
    boolean bool = j.j((Type)e.M(arrayOfType), Object.class);
    AppMethodBeat.o(123131);
    return bool ^ true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.z
 * JD-Core Version:    0.6.2
 */