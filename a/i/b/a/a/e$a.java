package a.i.b.a.a;

import a.f.b.j;
import a.f.b.x;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "boundReceiver", "", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
public final class e$a extends e<Constructor<?>>
  implements c
{
  private final Object AXt;

  public e$a(Constructor<?> paramConstructor, Object paramObject)
  {
    super(localMember, (Type)localObject, null, paramConstructor, (byte)0);
    AppMethodBeat.i(118973);
    this.AXt = paramObject;
    AppMethodBeat.o(118973);
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118972);
    j.p(paramArrayOfObject, "args");
    X(paramArrayOfObject);
    Constructor localConstructor = (Constructor)this.AZb;
    x localx = new x(2);
    localx.add(this.AXt);
    localx.jdMethod_do(paramArrayOfObject);
    paramArrayOfObject = localConstructor.newInstance(localx.toArray(new Object[localx.ckx.size()]));
    AppMethodBeat.o(118972);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.e.a
 * JD-Core Version:    0.6.2
 */