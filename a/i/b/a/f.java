package a.i.b.a;

import a.f.b.j;
import a.i.b.a.d.a;
import a.i.b.a.d.b;
import a.i.b.a.d.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/pcollections/HashPMap;", "", "kotlin.jvm.PlatformType", "", "clearKClassCache", "", "getOrCreateKotlinClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "jClass", "Ljava/lang/Class;", "kotlin-reflect-api"})
public final class f
{
  private static b<String, Object> AWE;

  static
  {
    AppMethodBeat.i(118693);
    b localb = b.ekF();
    j.o(localb, "HashPMap.empty<String, Any>()");
    AWE = localb;
    AppMethodBeat.o(118693);
  }

  public static final <T> g<T> aO(Class<T> paramClass)
  {
    Object localObject1 = null;
    AppMethodBeat.i(118692);
    j.p(paramClass, "jClass");
    String str = paramClass.getName();
    Object localObject2 = AWE.UV(str.hashCode());
    Object localObject3;
    if ((localObject2 != null) && (((a)localObject2).size > 0))
    {
      localObject3 = (e)((a)localObject2).first;
      if (((e)localObject3).aCx.equals(str))
      {
        localObject2 = ((e)localObject3).value;
        label67: if (!(localObject2 instanceof WeakReference))
          break label130;
        localObject3 = (g)((WeakReference)localObject2).get();
        localObject2 = localObject1;
        if (localObject3 != null)
          localObject2 = ((g)localObject3).AVA;
        if (!j.j(localObject2, paramClass))
          break label281;
        AppMethodBeat.o(118692);
        paramClass = (Class<T>)localObject3;
      }
    }
    while (true)
    {
      return paramClass;
      localObject2 = ((a)localObject2).BNz;
      break;
      localObject2 = null;
      break label67;
      label130: if (localObject2 != null)
      {
        WeakReference[] arrayOfWeakReference = (WeakReference[])localObject2;
        int i = arrayOfWeakReference.length;
        label203: for (int j = 0; ; j++)
        {
          if (j >= i)
            break label209;
          localObject3 = (g)arrayOfWeakReference[j].get();
          if (localObject3 != null);
          for (localObject1 = ((g)localObject3).AVA; ; localObject1 = null)
          {
            if (!j.j(localObject1, paramClass))
              break label203;
            AppMethodBeat.o(118692);
            paramClass = (Class<T>)localObject3;
            break;
          }
        }
        label209: j = ((Object[])localObject2).length;
        localObject1 = new WeakReference[j + 1];
        System.arraycopy(localObject2, 0, localObject1, 0, j);
        paramClass = new g(paramClass);
        localObject1[j] = new WeakReference(paramClass);
        localObject2 = AWE.K(str, localObject1);
        j.o(localObject2, "K_CLASS_CACHE.plus(name, newArray)");
        AWE = (b)localObject2;
        AppMethodBeat.o(118692);
      }
      else
      {
        label281: paramClass = new g(paramClass);
        localObject2 = AWE.K(str, new WeakReference(paramClass));
        j.o(localObject2, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        AWE = (b)localObject2;
        AppMethodBeat.o(118692);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.f
 * JD-Core Version:    0.6.2
 */