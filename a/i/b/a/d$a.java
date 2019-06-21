package a.i.b.a;

import a.f.b.j;
import a.i.b.a.c.d.a.o;
import a.i.b.a.e.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "getField", "()Ljava/lang/reflect/Field;", "asString", "", "kotlin-reflect-api"})
public final class d$a extends d
{
  final Field eum;

  public d$a(Field paramField)
  {
    super((byte)0);
    AppMethodBeat.i(118680);
    this.eum = paramField;
    AppMethodBeat.o(118680);
  }

  public final String pq()
  {
    AppMethodBeat.i(118679);
    StringBuilder localStringBuilder = new StringBuilder().append(o.avJ(this.eum.getName())).append("()");
    Object localObject = this.eum.getType();
    j.o(localObject, "field.type");
    localObject = b.bc((Class)localObject);
    AppMethodBeat.o(118679);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.d.a
 * JD-Core Version:    0.6.2
 */