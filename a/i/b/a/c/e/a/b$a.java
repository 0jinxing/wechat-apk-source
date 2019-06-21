package a.i.b.a.c.e.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$a extends b.c<Boolean>
{
  public b$a(int paramInt)
  {
    super(paramInt, 1, (byte)0);
  }

  public final Boolean Ug(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(121065);
    if ((1 << this.offset & paramInt) != 0);
    while (true)
    {
      AppMethodBeat.o(121065);
      return Boolean.valueOf(bool);
      bool = false;
    }
  }

  public final int n(Boolean paramBoolean)
  {
    AppMethodBeat.i(121066);
    int i;
    if (paramBoolean.booleanValue())
    {
      i = 1 << this.offset;
      AppMethodBeat.o(121066);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(121066);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.b.a
 * JD-Core Version:    0.6.2
 */