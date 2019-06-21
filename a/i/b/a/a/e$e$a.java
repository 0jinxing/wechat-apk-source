package a.i.b.a.a;

import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "boundReceiver", "", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
public final class e$e$a extends e.e
  implements c
{
  private final Object AXt;

  public e$e$a(Field paramField, boolean paramBoolean, Object paramObject)
  {
    super(paramField, paramBoolean, false, (byte)0);
    AppMethodBeat.i(118984);
    this.AXt = paramObject;
    AppMethodBeat.o(118984);
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118983);
    j.p(paramArrayOfObject, "args");
    X(paramArrayOfObject);
    ((Field)this.AZb).set(this.AXt, a.a.e.L(paramArrayOfObject));
    paramArrayOfObject = y.AUy;
    AppMethodBeat.o(118983);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.e.e.a
 * JD-Core Version:    0.6.2
 */