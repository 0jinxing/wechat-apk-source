package a.f.b;

import a.f.b;
import a.i.a;
import a.i.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

public abstract class c
  implements a, Serializable
{
  public static final Object AVy = a.dWG();
  private transient a AVw;
  protected final Object AVx;

  public c()
  {
    this(AVy);
  }

  protected c(Object paramObject)
  {
    this.AVx = paramObject;
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    return dWE().W(paramArrayOfObject);
  }

  protected abstract a dWB();

  public final Object dWC()
  {
    return this.AVx;
  }

  public final a dWD()
  {
    a locala1 = this.AVw;
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = dWB();
      this.AVw = locala2;
    }
    return locala2;
  }

  protected a dWE()
  {
    a locala = dWD();
    if (locala == this)
      throw new b();
    return locala;
  }

  public d dWF()
  {
    throw new AbstractMethodError();
  }

  public String due()
  {
    throw new AbstractMethodError();
  }

  public String getName()
  {
    throw new AbstractMethodError();
  }

  static final class a
    implements Serializable
  {
    private static final a AVz;

    static
    {
      AppMethodBeat.i(55898);
      AVz = new a();
      AppMethodBeat.o(55898);
    }

    private Object readResolve()
    {
      return AVz;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.f.b.c
 * JD-Core Version:    0.6.2
 */