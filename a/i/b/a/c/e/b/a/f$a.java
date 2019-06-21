package a.i.b.a.c.e.b.a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$a extends f
{
  public final String desc;
  public final String name;

  public f$a(String paramString1, String paramString2)
  {
    super((byte)0);
    AppMethodBeat.i(121311);
    this.name = paramString1;
    this.desc = paramString2;
    AppMethodBeat.o(121311);
  }

  public final String ehx()
  {
    return this.desc;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(121313);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((!j.j(this.name, paramObject.name)) || (!j.j(this.desc, paramObject.desc)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(121313);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121313);
    }
  }

  public final String getName()
  {
    return this.name;
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(121312);
    String str = this.name;
    if (str != null);
    for (int j = str.hashCode(); ; j = 0)
    {
      str = this.desc;
      if (str != null)
        i = str.hashCode();
      AppMethodBeat.o(121312);
      return j * 31 + i;
    }
  }

  public final String pq()
  {
    AppMethodBeat.i(121310);
    String str = this.name + ':' + this.desc;
    AppMethodBeat.o(121310);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.f.a
 * JD-Core Version:    0.6.2
 */