package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public final class i$f<ContainingType extends q, Type>
{
  final ContainingType BzS;
  final q BzT;
  final i.e BzU;
  final Class BzV;
  final Method BzW;
  final Type aze;

  i$f(ContainingType paramContainingType, Type paramType, q paramq, i.e parame, Class paramClass)
  {
    AppMethodBeat.i(121525);
    if (paramContainingType == null)
    {
      paramContainingType = new IllegalArgumentException("Null containingTypeDefaultInstance");
      AppMethodBeat.o(121525);
      throw paramContainingType;
    }
    if ((parame.BzP == z.a.BBb) && (paramq == null))
    {
      paramContainingType = new IllegalArgumentException("Null messageDefaultInstance");
      AppMethodBeat.o(121525);
      throw paramContainingType;
    }
    this.BzS = paramContainingType;
    this.aze = paramType;
    this.BzT = paramq;
    this.BzU = parame;
    this.BzV = paramClass;
    if (j.a.class.isAssignableFrom(paramClass))
    {
      this.BzW = i.d(paramClass, "valueOf", new Class[] { Integer.TYPE });
      AppMethodBeat.o(121525);
    }
    while (true)
    {
      return;
      this.BzW = null;
      AppMethodBeat.o(121525);
    }
  }

  final Object dM(Object paramObject)
  {
    AppMethodBeat.i(121526);
    if (this.BzU.BzP.BBj == z.b.BBt)
    {
      paramObject = i.d(this.BzW, new Object[] { (Integer)paramObject });
      AppMethodBeat.o(121526);
    }
    while (true)
    {
      return paramObject;
      AppMethodBeat.o(121526);
    }
  }

  final Object dN(Object paramObject)
  {
    AppMethodBeat.i(121527);
    if (this.BzU.BzP.BBj == z.b.BBt)
    {
      paramObject = Integer.valueOf(((j.a)paramObject).edd());
      AppMethodBeat.o(121527);
    }
    while (true)
    {
      return paramObject;
      AppMethodBeat.o(121527);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.i.f
 * JD-Core Version:    0.6.2
 */