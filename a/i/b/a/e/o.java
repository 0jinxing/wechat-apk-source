package a.i.b.a.e;

import a.f.b.j;
import a.i.b.a.c.d.a.e.m;
import a.i.b.a.c.f.a;
import a.i.b.a.c.f.f;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaEnumValueAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaEnumValueAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "value", "", "(Lorg/jetbrains/kotlin/name/Name;Ljava/lang/Enum;)V", "entryName", "getEntryName", "()Lorg/jetbrains/kotlin/name/Name;", "enumClassId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getEnumClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "descriptors.runtime"})
public final class o extends d
  implements m
{
  private final Enum<?> BOf;

  public o(f paramf, Enum<?> paramEnum)
  {
    super(paramf);
    AppMethodBeat.i(123094);
    this.BOf = paramEnum;
    AppMethodBeat.o(123094);
  }

  public final a ebQ()
  {
    AppMethodBeat.i(123092);
    Object localObject = this.BOf.getClass();
    if (((Class)localObject).isEnum());
    while (true)
    {
      j.o(localObject, "enumClass");
      localObject = b.bb((Class)localObject);
      AppMethodBeat.o(123092);
      return localObject;
      localObject = ((Class)localObject).getEnclosingClass();
    }
  }

  public final f ebR()
  {
    AppMethodBeat.i(123093);
    f localf = f.avX(this.BOf.name());
    AppMethodBeat.o(123093);
    return localf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.o
 * JD-Core Version:    0.6.2
 */