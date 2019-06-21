package a.i.b.a.e;

import a.i.b.a.c.d.a.e.n;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaField;", "member", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "hasConstantNotNullInitializer", "", "getHasConstantNotNullInitializer", "()Z", "initializerValue", "", "getInitializerValue", "()Ljava/lang/Void;", "isEnumEntry", "getMember", "()Ljava/lang/reflect/Field;", "type", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "descriptors.runtime"})
public final class p extends r
  implements n
{
  public final Field BOg;

  public p(Field paramField)
  {
    AppMethodBeat.i(123097);
    this.BOg = paramField;
    AppMethodBeat.o(123097);
  }

  public final boolean ebS()
  {
    AppMethodBeat.i(123095);
    boolean bool = this.BOg.isEnumConstant();
    AppMethodBeat.o(123095);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.p
 * JD-Core Version:    0.6.2
 */