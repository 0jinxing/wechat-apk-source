package a.i.b.a;

import a.f;
import a.f.a.a;
import a.f.b.j;
import a.g;
import a.i.b.a.c.b.ah;
import a.i.n;
import a.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KProperty2Impl;", "D", "E", "R", "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "kotlin.jvm.PlatformType", "delegateField", "Lkotlin/Lazy;", "Ljava/lang/reflect/Field;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "get", "receiver1", "receiver2", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "", "invoke", "Getter", "kotlin-reflect-api"})
public class r<D, E, R> extends s<R>
  implements n<D, E, R>
{
  private final z.b<r.a<D, E, R>> AXO;
  private final f<Field> AXS;

  public r(i parami, ah paramah)
  {
    super(parami, paramah);
    AppMethodBeat.i(118856);
    parami = z.h((a)new r.b(this));
    j.o(parami, "ReflectProperties.lazy { Getter(this) }");
    this.AXO = parami;
    this.AXS = g.a(k.AUm, (a)new r.c(this));
    AppMethodBeat.o(118856);
  }

  private r.a<D, E, R> dXm()
  {
    AppMethodBeat.i(118852);
    Object localObject = this.AXO.invoke();
    j.o(localObject, "_getter()");
    localObject = (r.a)localObject;
    AppMethodBeat.o(118852);
    return localObject;
  }

  public final R m(D paramD, E paramE)
  {
    AppMethodBeat.i(118855);
    paramD = t(paramD, paramE);
    AppMethodBeat.o(118855);
    return paramD;
  }

  public final R t(D paramD, E paramE)
  {
    AppMethodBeat.i(118854);
    paramD = dXm().W(new Object[] { paramD, paramE });
    AppMethodBeat.o(118854);
    return paramD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.r
 * JD-Core Version:    0.6.2
 */