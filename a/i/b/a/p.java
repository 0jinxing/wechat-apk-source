package a.i.b.a;

import a.f;
import a.f.a.a;
import a.f.b.j;
import a.g;
import a.i.b.a.c.b.ah;
import a.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "R", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "kotlin.jvm.PlatformType", "delegateFieldValue", "Lkotlin/Lazy;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "get", "()Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflect-api"})
public class p<R> extends s<R>
  implements a.i.l<R>
{
  private final z.b<p.a<R>> AXO;
  private final f<Object> AXP;

  public p(i parami, ah paramah)
  {
    super(parami, paramah);
    AppMethodBeat.i(118835);
    parami = z.h((a)new p.b(this));
    j.o(parami, "ReflectProperties.lazy { Getter(this) }");
    this.AXO = parami;
    this.AXP = g.a(k.AUm, (a)new p.c(this));
    AppMethodBeat.o(118835);
  }

  public p(i parami, String paramString1, String paramString2, Object paramObject)
  {
    super(parami, paramString1, paramString2, paramObject);
    AppMethodBeat.i(118836);
    parami = z.h((a)new p.b(this));
    j.o(parami, "ReflectProperties.lazy { Getter(this) }");
    this.AXO = parami;
    this.AXP = g.a(k.AUm, (a)new p.c(this));
    AppMethodBeat.o(118836);
  }

  private p.a<R> dXj()
  {
    AppMethodBeat.i(118830);
    Object localObject = this.AXO.invoke();
    j.o(localObject, "_getter()");
    localObject = (p.a)localObject;
    AppMethodBeat.o(118830);
    return localObject;
  }

  public final R get()
  {
    AppMethodBeat.i(118833);
    Object localObject = dXj().W(new Object[0]);
    AppMethodBeat.o(118833);
    return localObject;
  }

  public final R invoke()
  {
    AppMethodBeat.i(118834);
    Object localObject = get();
    AppMethodBeat.o(118834);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.p
 * JD-Core Version:    0.6.2
 */