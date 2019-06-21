package a.i.b.a.c.m;

import a.f.b.j;
import a.i.b.a.c.b.t;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract class f
  implements b
{
  private final String description;

  private f(String paramString)
  {
    this.description = paramString;
  }

  public final String getDescription()
  {
    return this.description;
  }

  public final String i(t paramt)
  {
    j.p(paramt, "functionDescriptor");
    return b.a.a(this, paramt);
  }

  public static final class b extends f
  {
    public static final b BLE;

    static
    {
      AppMethodBeat.i(122870);
      BLE = new b();
      AppMethodBeat.o(122870);
    }

    private b()
    {
      super((byte)0);
    }

    public final boolean h(t paramt)
    {
      AppMethodBeat.i(122869);
      j.p(paramt, "functionDescriptor");
      boolean bool;
      if ((paramt.dYR() != null) || (paramt.dYQ() != null))
      {
        bool = true;
        AppMethodBeat.o(122869);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(122869);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.m.f
 * JD-Core Version:    0.6.2
 */