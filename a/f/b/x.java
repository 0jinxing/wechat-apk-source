package a.f.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class x
{
  public final ArrayList<Object> ckx;

  public x(int paramInt)
  {
    AppMethodBeat.i(55893);
    this.ckx = new ArrayList(paramInt);
    AppMethodBeat.o(55893);
  }

  public final void add(Object paramObject)
  {
    AppMethodBeat.i(55895);
    this.ckx.add(paramObject);
    AppMethodBeat.o(55895);
  }

  public final void jdMethod_do(Object paramObject)
  {
    AppMethodBeat.i(55894);
    if (paramObject == null)
      AppMethodBeat.o(55894);
    while (true)
    {
      return;
      if (!(paramObject instanceof Object[]))
        break;
      Object[] arrayOfObject = (Object[])paramObject;
      if (arrayOfObject.length > 0)
      {
        this.ckx.ensureCapacity(this.ckx.size() + arrayOfObject.length);
        int i = arrayOfObject.length;
        for (int j = 0; j < i; j++)
        {
          paramObject = arrayOfObject[j];
          this.ckx.add(paramObject);
        }
      }
      AppMethodBeat.o(55894);
    }
    paramObject = new UnsupportedOperationException("Don't know how to spread " + paramObject.getClass());
    AppMethodBeat.o(55894);
    throw paramObject;
  }

  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(55896);
    paramArrayOfObject = this.ckx.toArray(paramArrayOfObject);
    AppMethodBeat.o(55896);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.f.b.x
 * JD-Core Version:    0.6.2
 */