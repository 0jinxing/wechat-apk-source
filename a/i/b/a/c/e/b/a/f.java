package a.i.b.a.c.e.b.a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract class f
{
  public abstract String ehx();

  public abstract String getName();

  public abstract String pq();

  public final String toString()
  {
    return pq();
  }

  public static final class b extends f
  {
    public final String desc;
    public final String name;

    public b(String paramString1, String paramString2)
    {
      super();
      AppMethodBeat.i(121315);
      this.name = paramString1;
      this.desc = paramString2;
      AppMethodBeat.o(121315);
    }

    public final String ehx()
    {
      return this.desc;
    }

    public final boolean equals(Object paramObject)
    {
      AppMethodBeat.i(121317);
      boolean bool;
      if (this != paramObject)
      {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if ((!j.j(this.name, paramObject.name)) || (!j.j(this.desc, paramObject.desc)));
        }
      }
      else
      {
        bool = true;
        AppMethodBeat.o(121317);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(121317);
      }
    }

    public final String getName()
    {
      return this.name;
    }

    public final int hashCode()
    {
      int i = 0;
      AppMethodBeat.i(121316);
      String str = this.name;
      if (str != null);
      for (int j = str.hashCode(); ; j = 0)
      {
        str = this.desc;
        if (str != null)
          i = str.hashCode();
        AppMethodBeat.o(121316);
        return j * 31 + i;
      }
    }

    public final String pq()
    {
      AppMethodBeat.i(121314);
      String str = this.name + this.desc;
      AppMethodBeat.o(121314);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.f
 * JD-Core Version:    0.6.2
 */