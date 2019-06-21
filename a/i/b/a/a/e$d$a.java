package a.i.b.a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "boundReceiver", "", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
public final class e$d$a extends e.d
  implements c
{
  private final Object AXt;

  public e$d$a(Field paramField, Object paramObject)
  {
    super(paramField, false, (byte)0);
    AppMethodBeat.i(118977);
    this.AXt = paramObject;
    AppMethodBeat.o(118977);
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118976);
    j.p(paramArrayOfObject, "args");
    X(paramArrayOfObject);
    paramArrayOfObject = ((Field)this.AZb).get(this.AXt);
    AppMethodBeat.o(118976);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.e.d.a
 * JD-Core Version:    0.6.2
 */