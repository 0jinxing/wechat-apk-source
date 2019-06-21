package a.i.b.a.c.j.a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class o<T extends a.i.b.a.c.e.a.a>
{
  private final T BHg;
  private final T BHh;
  private final a.i.b.a.c.f.a BcB;
  private final String filePath;

  public o(T paramT1, T paramT2, String paramString, a.i.b.a.c.f.a parama)
  {
    AppMethodBeat.i(122270);
    this.BHg = paramT1;
    this.BHh = paramT2;
    this.filePath = paramString;
    this.BcB = parama;
    AppMethodBeat.o(122270);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(122273);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof o))
      {
        paramObject = (o)paramObject;
        if ((!j.j(this.BHg, paramObject.BHg)) || (!j.j(this.BHh, paramObject.BHh)) || (!j.j(this.filePath, paramObject.filePath)) || (!j.j(this.BcB, paramObject.BcB)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(122273);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122273);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(122272);
    Object localObject = this.BHg;
    int j;
    int k;
    if (localObject != null)
    {
      j = localObject.hashCode();
      localObject = this.BHh;
      if (localObject == null)
        break label94;
      k = localObject.hashCode();
      label36: localObject = this.filePath;
      if (localObject == null)
        break label100;
    }
    label94: label100: for (int m = localObject.hashCode(); ; m = 0)
    {
      localObject = this.BcB;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(122272);
      return (m + (k + j * 31) * 31) * 31 + i;
      j = 0;
      break;
      k = 0;
      break label36;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122271);
    String str = "IncompatibleVersionErrorData(actualVersion=" + this.BHg + ", expectedVersion=" + this.BHh + ", filePath=" + this.filePath + ", classId=" + this.BcB + ")";
    AppMethodBeat.o(122271);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.o
 * JD-Core Version:    0.6.2
 */