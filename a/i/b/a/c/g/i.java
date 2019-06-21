package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;

public abstract class i extends a
  implements Serializable
{
  protected i()
  {
  }

  protected i(byte paramByte)
  {
  }

  public static <ContainingType extends q, Type> i.f<ContainingType, Type> a(ContainingType paramContainingType, q paramq, int paramInt, z.a parama, Class paramClass)
  {
    return new i.f(paramContainingType, Collections.emptyList(), paramq, new e(paramInt, parama, true), paramClass);
  }

  public static <ContainingType extends q, Type> i.f<ContainingType, Type> a(ContainingType paramContainingType, Type paramType, q paramq, int paramInt, z.a parama, Class paramClass)
  {
    return new i.f(paramContainingType, paramType, paramq, new e(paramInt, parama, false), paramClass);
  }

  static Object d(Method paramMethod, Object[] paramArrayOfObject)
  {
    try
    {
      paramMethod = paramMethod.invoke(null, paramArrayOfObject);
      return paramMethod;
    }
    catch (IllegalAccessException paramMethod)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", paramMethod);
    }
    catch (InvocationTargetException paramMethod)
    {
      paramMethod = paramMethod.getCause();
      if ((paramMethod instanceof RuntimeException))
        throw ((RuntimeException)paramMethod);
      if ((paramMethod instanceof Error))
        throw ((Error)paramMethod);
    }
    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", paramMethod);
  }

  static Method d(Class paramClass, String paramString, Class[] paramArrayOfClass)
  {
    try
    {
      paramArrayOfClass = paramClass.getMethod(paramString, paramArrayOfClass);
      return paramArrayOfClass;
    }
    catch (NoSuchMethodException paramArrayOfClass)
    {
      paramClass = String.valueOf(String.valueOf(paramClass.getName()));
      paramString = String.valueOf(String.valueOf(paramString));
    }
    throw new RuntimeException(paramClass.length() + 45 + paramString.length() + "Generated message class \"" + paramClass + "\" missing method \"" + paramString + "\".", paramArrayOfClass);
  }

  protected boolean a(e parame, f paramf, g paramg, int paramInt)
  {
    return parame.a(paramInt, paramf);
  }

  public s<? extends q> ecy()
  {
    throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
  }

  protected void eio()
  {
  }

  static final class e
    implements h.a<e>
  {
    final j.b<?> BzO = null;
    final z.a BzP;
    final boolean BzQ;
    final boolean BzR;
    final int number;

    e(int paramInt, z.a parama, boolean paramBoolean)
    {
      this.number = paramInt;
      this.BzP = parama;
      this.BzQ = paramBoolean;
      this.BzR = false;
    }

    public final q.a a(q.a parama, q paramq)
    {
      AppMethodBeat.i(121524);
      parama = ((i.a)parama).a((i)paramq);
      AppMethodBeat.o(121524);
      return parama;
    }

    public final int edd()
    {
      return this.number;
    }

    public final z.a eik()
    {
      return this.BzP;
    }

    public final z.b eil()
    {
      return this.BzP.BBj;
    }

    public final boolean eim()
    {
      return this.BzQ;
    }

    public final boolean ein()
    {
      return this.BzR;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.i
 * JD-Core Version:    0.6.2
 */