package a.i.b.a;

import a.f.a.a;
import a.f.b.c;
import a.i.a.b;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.d.a.o;
import a.i.b.a.c.e.b.a.f.a;
import a.l;
import a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "R", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "_descriptor", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "_javaField", "Ljava/lang/reflect/Field;", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getter", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "isBound", "", "()Z", "isConst", "isLateinit", "isSuspend", "javaField", "getJavaField", "()Ljava/lang/reflect/Field;", "getName", "()Ljava/lang/String;", "getSignature", "computeDelegateField", "equals", "other", "getDelegate", "field", "receiver", "hashCode", "", "toString", "Accessor", "Companion", "Getter", "Setter", "kotlin-reflect-api"})
public abstract class s<R> extends e<R>
  implements a.i.k<R>
{
  private static final Object AXZ = new Object();
  public static final s.b AYa = new s.b((byte)0);
  private final z.a<Field> AXX;
  private final z.a<ah> AXY;
  final i AXs;
  final Object AXt;
  final String name;
  final String signature;

  public s(i parami, ah paramah)
  {
    this(parami, str, ad.c(paramah).pq(), paramah, c.AVy);
  }

  private s(i parami, String paramString1, String paramString2, ah paramah, Object paramObject)
  {
    this.AXs = parami;
    this.name = paramString1;
    this.signature = paramString2;
    this.AXt = paramObject;
    parami = z.a(null, (a)new f(this));
    a.f.b.j.o(parami, "ReflectProperties.lazySo…y -> null\n        }\n    }");
    this.AXX = parami;
    parami = z.a(paramah, (a)new s.e(this));
    a.f.b.j.o(parami, "ReflectProperties.lazySo…or(name, signature)\n    }");
    this.AXY = parami;
  }

  public s(i parami, String paramString1, String paramString2, Object paramObject)
  {
    this(parami, paramString1, paramString2, null, paramObject);
  }

  protected final Object a(Field paramField, Object paramObject)
  {
    try
    {
      if ((paramObject == AXZ) && (dXp().dYQ() == null))
      {
        paramObject = new java/lang/RuntimeException;
        paramField = new java/lang/StringBuilder;
        paramField.<init>("'");
        paramObject.<init>(this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
        throw ((Throwable)paramObject);
      }
    }
    catch (IllegalAccessException paramField)
    {
      throw ((Throwable)new b(paramField));
    }
    if (paramField != null);
    for (paramField = paramField.get(paramObject); ; paramField = null)
      return paramField;
  }

  public final a.i.b.a.a.d<?> dWU()
  {
    return dXk().dWU();
  }

  public final i dWV()
  {
    return this.AXs;
  }

  public abstract s.c<R> dXk();

  public final Field dXn()
  {
    return (Field)this.AXX.invoke();
  }

  protected final Field dXo()
  {
    if (dXp().ead());
    for (Field localField = dXn(); ; localField = null)
      return localField;
  }

  public final ah dXp()
  {
    Object localObject = this.AXY.invoke();
    a.f.b.j.o(localObject, "_descriptor()");
    return (ah)localObject;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    paramObject = af.dx(paramObject);
    boolean bool2;
    if (paramObject == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (a.f.b.j.j(this.AXs, paramObject.AXs))
      {
        bool2 = bool1;
        if (a.f.b.j.j(this.name, paramObject.name))
        {
          bool2 = bool1;
          if (a.f.b.j.j(this.signature, paramObject.signature))
          {
            bool2 = bool1;
            if (a.f.b.j.j(this.AXt, paramObject.AXt))
              bool2 = true;
          }
        }
      }
    }
  }

  public final String getName()
  {
    return this.name;
  }

  public int hashCode()
  {
    return (this.AXs.hashCode() * 31 + this.name.hashCode()) * 31 + this.signature.hashCode();
  }

  public final boolean isBound()
  {
    return a.f.b.j.j(this.AXt, c.AVy) ^ true;
  }

  public String toString()
  {
    ab localab = ab.AYy;
    return ab.b(dXp());
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "R", "invoke"})
  static final class c$a extends a.f.b.k
    implements a<a.i.b.a.a.d<?>>
  {
    c$a(s.c paramc)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Ljava/lang/reflect/Field;", "R", "invoke"})
  static final class f extends a.f.b.k
    implements a<Field>
  {
    f(s params)
    {
      super();
    }

    private Field dXt()
    {
      Object localObject1 = null;
      Object localObject3 = null;
      AppMethodBeat.i(118863);
      Object localObject4 = ad.AYC;
      d locald = ad.c(this.AYd.dXp());
      ah localah;
      if ((locald instanceof d.c))
      {
        localah = ((d.c)locald).AWn;
        localObject4 = a.i.b.a.c.e.b.a.j.ByD;
        localObject4 = a.i.b.a.c.e.b.a.j.a(((d.c)locald).AWo, ((d.c)locald).AWq, ((d.c)locald).AWr);
        if (localObject4 != null)
          if ((o.d(localah)) || (a.i.b.a.c.e.b.a.j.f(((d.c)locald).AWo)))
            localObject1 = this.AYd.AXs.dWH().getEnclosingClass();
      }
      while (true)
      {
        if (localObject1 != null);
        try
        {
          localObject1 = ((Class)localObject1).getDeclaredField(((f.a)localObject4).name);
          label128: AppMethodBeat.o(118863);
          while (true)
          {
            return localObject1;
            localObject1 = localah.dXW();
            if ((localObject1 instanceof a.i.b.a.c.b.e))
            {
              localObject1 = af.a((a.i.b.a.c.b.e)localObject1);
              break;
            }
            localObject1 = this.AYd.AXs.dWH();
            break;
            localObject1 = null;
            break label128;
            AppMethodBeat.o(118863);
            continue;
            if ((locald instanceof d.a))
            {
              localObject1 = ((d.a)locald).eum;
              AppMethodBeat.o(118863);
            }
            else if ((locald instanceof d.b))
            {
              AppMethodBeat.o(118863);
            }
            else
            {
              if (!(locald instanceof d.d))
                break label245;
              AppMethodBeat.o(118863);
            }
          }
          label245: localObject1 = new m();
          AppMethodBeat.o(118863);
          throw ((Throwable)localObject1);
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          while (true)
            Object localObject2 = localObject3;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.s
 * JD-Core Version:    0.6.2
 */