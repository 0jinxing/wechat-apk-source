package a.i.b.a.a;

import a.f.b.x;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "member", "returnType", "Ljava/lang/reflect/Type;", "instanceClass", "Ljava/lang/Class;", "valueParameterTypes", "", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "getInstanceClass", "()Ljava/lang/Class;", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "getReturnType", "()Ljava/lang/reflect/Type;", "checkObjectInstance", "", "obj", "", "BoundConstructor", "Companion", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflect-api"})
public abstract class e<M extends Member>
  implements d<M>
{
  public static final e.b AZe = new e.b((byte)0);
  final List<Type> AYH;
  final M AZb;
  final Type AZc;
  final Class<?> AZd;

  private e(M paramM, Type paramType, Class<?> paramClass, Type[] paramArrayOfType)
  {
    this.AZb = paramM;
    this.AZc = paramType;
    this.AZd = paramClass;
    paramM = this.AZd;
    if (paramM != null)
    {
      paramType = new x(2);
      paramType.add((Type)paramM);
      paramType.jdMethod_do(paramArrayOfType);
      paramType = a.a.j.listOf((Type[])paramType.toArray(new Type[paramType.ckx.size()]));
      paramM = paramType;
      if (paramType != null);
    }
    else
    {
      paramM = a.a.e.Q(paramArrayOfType);
    }
    this.AYH = paramM;
  }

  public void X(Object[] paramArrayOfObject)
  {
    a.f.b.j.p(paramArrayOfObject, "args");
    d.a.a(this, paramArrayOfObject);
  }

  public final M dXw()
  {
    return this.AZb;
  }

  public final Type dXx()
  {
    return this.AZc;
  }

  public final List<Type> dXy()
  {
    return this.AYH;
  }

  protected final void dz(Object paramObject)
  {
    if ((paramObject == null) || (!this.AZb.getDeclaringClass().isInstance(paramObject)))
      throw ((Throwable)new IllegalArgumentException("An object member requires the object instance passed as the first argument."));
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "requiresInstance", "", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "kotlin-reflect-api"})
  public static abstract class d extends e<Field>
  {
    private d(Field paramField, boolean paramBoolean)
    {
    }

    public Object W(Object[] paramArrayOfObject)
    {
      a.f.b.j.p(paramArrayOfObject, "args");
      X(paramArrayOfObject);
      Field localField = (Field)this.AZb;
      if (this.AZd != null);
      for (paramArrayOfObject = a.a.e.L(paramArrayOfObject); ; paramArrayOfObject = null)
        return localField.get(paramArrayOfObject);
    }

    @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflect-api"})
    public static final class c extends e.d
    {
      public c(Field paramField)
      {
        super(true, (byte)0);
        AppMethodBeat.i(118979);
        AppMethodBeat.o(118979);
      }
    }

    @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflect-api"})
    public static final class e extends e.d
    {
      public e(Field paramField)
      {
        super(false, (byte)0);
        AppMethodBeat.i(118982);
        AppMethodBeat.o(118982);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "notNull", "", "requiresInstance", "(Ljava/lang/reflect/Field;ZZ)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", "", "([Ljava/lang/Object;)V", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "kotlin-reflect-api"})
  public static abstract class e extends e<Field>
  {
    private final boolean AZf;

    private e(Field paramField, boolean paramBoolean1, boolean paramBoolean2)
    {
    }

    public Object W(Object[] paramArrayOfObject)
    {
      a.f.b.j.p(paramArrayOfObject, "args");
      X(paramArrayOfObject);
      Field localField = (Field)this.AZb;
      if (this.AZd != null);
      for (Object localObject = a.a.e.L(paramArrayOfObject); ; localObject = null)
      {
        localField.set(localObject, a.a.e.N(paramArrayOfObject));
        return y.AUy;
      }
    }

    public void X(Object[] paramArrayOfObject)
    {
      a.f.b.j.p(paramArrayOfObject, "args");
      super.X(paramArrayOfObject);
      if ((this.AZf) && (a.a.e.N(paramArrayOfObject) == null))
        throw ((Throwable)new IllegalArgumentException("null is not allowed as a value for this property."));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.e
 * JD-Core Version:    0.6.2
 */