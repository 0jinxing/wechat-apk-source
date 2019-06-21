package a.i.b.a.a;

import a.f.a;
import a.f.b.j;
import a.f.b.k;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"equals", "", "T", "", "other", "invoke"})
final class b$a extends k
  implements a.f.a.b<Object, Boolean>
{
  b$a(Class paramClass, List paramList, Map paramMap)
  {
    super(1);
  }

  public final boolean dy(Object paramObject)
  {
    Object localObject1 = null;
    AppMethodBeat.i(118960);
    if (!(paramObject instanceof Annotation));
    for (Object localObject2 = null; ; localObject2 = paramObject)
    {
      Object localObject3 = (Annotation)localObject2;
      localObject2 = localObject1;
      if (localObject3 != null)
      {
        localObject3 = a.a((Annotation)localObject3);
        localObject2 = localObject1;
        if (localObject3 != null)
          localObject2 = a.a((a.i.b)localObject3);
      }
      label185: int i;
      if (j.j(localObject2, this.AYS))
      {
        localObject2 = (Iterable)this.AYT;
        if ((!(localObject2 instanceof Collection)) || (!((Collection)localObject2).isEmpty()))
        {
          localObject2 = ((Iterable)localObject2).iterator();
          if (((Iterator)localObject2).hasNext())
          {
            localObject1 = (Method)((Iterator)localObject2).next();
            localObject3 = this.AYU.get(((Method)localObject1).getName());
            localObject1 = ((Method)localObject1).invoke(paramObject, new Object[0]);
            if ((localObject3 instanceof boolean[]))
            {
              localObject3 = (boolean[])localObject3;
              if (localObject1 == null)
              {
                paramObject = new v("null cannot be cast to non-null type kotlin.BooleanArray");
                AppMethodBeat.o(118960);
                throw paramObject;
              }
              bool = Arrays.equals((boolean[])localObject3, (boolean[])localObject1);
              if (bool)
                break label618;
              i = 0;
              label193: if (i == 0)
                break label626;
              AppMethodBeat.o(118960);
            }
          }
        }
      }
      for (boolean bool = true; ; bool = false)
      {
        return bool;
        if ((localObject3 instanceof char[]))
        {
          localObject3 = (char[])localObject3;
          if (localObject1 == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.CharArray");
            AppMethodBeat.o(118960);
            throw paramObject;
          }
          bool = Arrays.equals((char[])localObject3, (char[])localObject1);
          break label185;
        }
        if ((localObject3 instanceof byte[]))
        {
          localObject3 = (byte[])localObject3;
          if (localObject1 == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.ByteArray");
            AppMethodBeat.o(118960);
            throw paramObject;
          }
          bool = Arrays.equals((byte[])localObject3, (byte[])localObject1);
          break label185;
        }
        if ((localObject3 instanceof short[]))
        {
          localObject3 = (short[])localObject3;
          if (localObject1 == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.ShortArray");
            AppMethodBeat.o(118960);
            throw paramObject;
          }
          bool = Arrays.equals((short[])localObject3, (short[])localObject1);
          break label185;
        }
        if ((localObject3 instanceof int[]))
        {
          localObject3 = (int[])localObject3;
          if (localObject1 == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.IntArray");
            AppMethodBeat.o(118960);
            throw paramObject;
          }
          bool = Arrays.equals((int[])localObject3, (int[])localObject1);
          break label185;
        }
        if ((localObject3 instanceof float[]))
        {
          localObject3 = (float[])localObject3;
          if (localObject1 == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.FloatArray");
            AppMethodBeat.o(118960);
            throw paramObject;
          }
          bool = Arrays.equals((float[])localObject3, (float[])localObject1);
          break label185;
        }
        if ((localObject3 instanceof long[]))
        {
          localObject3 = (long[])localObject3;
          if (localObject1 == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.LongArray");
            AppMethodBeat.o(118960);
            throw paramObject;
          }
          bool = Arrays.equals((long[])localObject3, (long[])localObject1);
          break label185;
        }
        if ((localObject3 instanceof double[]))
        {
          localObject3 = (double[])localObject3;
          if (localObject1 == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.DoubleArray");
            AppMethodBeat.o(118960);
            throw paramObject;
          }
          bool = Arrays.equals((double[])localObject3, (double[])localObject1);
          break label185;
        }
        if ((localObject3 instanceof Object[]))
        {
          localObject3 = (Object[])localObject3;
          if (localObject1 == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.Array<*>");
            AppMethodBeat.o(118960);
            throw paramObject;
          }
          bool = Arrays.equals((Object[])localObject3, (Object[])localObject1);
          break label185;
        }
        bool = j.j(localObject3, localObject1);
        break label185;
        label618: break;
        i = 1;
        break label193;
        label626: AppMethodBeat.o(118960);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.b.a
 * JD-Core Version:    0.6.2
 */