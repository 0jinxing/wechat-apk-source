package a.i.b.a.a;

import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
public final class e$e$b extends e.e
  implements c
{
  public e$e$b(Field paramField, boolean paramBoolean)
  {
    super(paramField, paramBoolean, false, (byte)0);
    AppMethodBeat.i(118986);
    AppMethodBeat.o(118986);
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118985);
    j.p(paramArrayOfObject, "args");
    X(paramArrayOfObject);
    ((Field)this.AZb).set(null, a.a.e.N(paramArrayOfObject));
    paramArrayOfObject = y.AUy;
    AppMethodBeat.o(118985);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.e.e.b
 * JD-Core Version:    0.6.2
 */