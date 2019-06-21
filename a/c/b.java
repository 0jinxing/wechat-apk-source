package a.c;

import a.f.a.m;
import a.f.b.j;
import a.f.b.u.b;
import a.l;
import a.v;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"})
public final class b
  implements e, Serializable
{
  private final e AUX;
  private final e.b AUY;

  public b(e parame, e.b paramb)
  {
    AppMethodBeat.i(56401);
    this.AUX = parame;
    this.AUY = paramb;
    AppMethodBeat.o(56401);
  }

  private final boolean a(e.b paramb)
  {
    AppMethodBeat.i(56396);
    boolean bool = j.j(get(paramb.getKey()), paramb);
    AppMethodBeat.o(56396);
    return bool;
  }

  private final int size()
  {
    Object localObject = (b)this;
    for (int i = 2; ; i++)
    {
      e locale = ((b)localObject).AUX;
      localObject = locale;
      if (!(locale instanceof b))
        localObject = null;
      localObject = (b)localObject;
      if (localObject == null)
        return i;
    }
  }

  private final Object writeReplace()
  {
    AppMethodBeat.i(56400);
    int i = size();
    Object localObject = new Serializable[i];
    u.b localb = new u.b();
    localb.AVD = 0;
    fold(y.AUy, (m)new b.c((e[])localObject, localb));
    if (localb.AVD == i);
    for (i = 1; i == 0; i = 0)
    {
      localObject = (Throwable)new IllegalStateException("Check failed.".toString());
      AppMethodBeat.o(56400);
      throw ((Throwable)localObject);
    }
    localObject = new b.a((e[])localObject);
    AppMethodBeat.o(56400);
    return localObject;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56397);
    b localb;
    boolean bool;
    if ((b)this != paramObject)
    {
      if ((!(paramObject instanceof b)) || (((b)paramObject).size() != size()))
        break label120;
      localb = (b)paramObject;
      paramObject = this;
      if (!localb.a(paramObject.AUY))
      {
        bool = false;
        label54: if (!bool)
          break label120;
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(56397);
    }
    while (true)
    {
      return bool;
      paramObject = paramObject.AUX;
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        break;
      }
      if (paramObject == null)
      {
        paramObject = new v("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
        AppMethodBeat.o(56397);
        throw paramObject;
      }
      bool = localb.a((e.b)paramObject);
      break label54;
      label120: AppMethodBeat.o(56397);
      bool = false;
    }
  }

  public final <R> R fold(R paramR, m<? super R, ? super e.b, ? extends R> paramm)
  {
    AppMethodBeat.i(56394);
    j.p(paramm, "operation");
    paramR = paramm.m(this.AUX.fold(paramR, paramm), this.AUY);
    AppMethodBeat.o(56394);
    return paramR;
  }

  public final <E extends e.b> E get(e.c<E> paramc)
  {
    AppMethodBeat.i(56393);
    j.p(paramc, "key");
    Object localObject = (b)this;
    e.b localb = ((b)localObject).AUY.get(paramc);
    if (localb != null)
    {
      AppMethodBeat.o(56393);
      paramc = localb;
    }
    while (true)
    {
      return paramc;
      localObject = ((b)localObject).AUX;
      if ((localObject instanceof b))
      {
        localObject = (b)localObject;
        break;
      }
      paramc = ((Serializable)localObject).get(paramc);
      AppMethodBeat.o(56393);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(56398);
    int i = this.AUX.hashCode();
    int j = this.AUY.hashCode();
    AppMethodBeat.o(56398);
    return i + j;
  }

  public final e minusKey(e.c<?> paramc)
  {
    AppMethodBeat.i(56395);
    j.p(paramc, "key");
    if (this.AUY.get(paramc) != null)
    {
      paramc = this.AUX;
      AppMethodBeat.o(56395);
    }
    while (true)
    {
      return paramc;
      paramc = this.AUX.minusKey(paramc);
      if (paramc == this.AUX)
      {
        paramc = (Serializable)this;
        AppMethodBeat.o(56395);
      }
      else if (paramc == f.AVg)
      {
        paramc = (Serializable)this.AUY;
        AppMethodBeat.o(56395);
      }
      else
      {
        paramc = (Serializable)new b(paramc, this.AUY);
        AppMethodBeat.o(56395);
      }
    }
  }

  public final e plus(e parame)
  {
    AppMethodBeat.i(56402);
    j.p(parame, "context");
    parame = e.a.a(this, parame);
    AppMethodBeat.o(56402);
    return parame;
  }

  public final String toString()
  {
    AppMethodBeat.i(56399);
    String str = "[" + (String)fold("", (m)b.b.AVb) + "]";
    AppMethodBeat.o(56399);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.c.b
 * JD-Core Version:    0.6.2
 */