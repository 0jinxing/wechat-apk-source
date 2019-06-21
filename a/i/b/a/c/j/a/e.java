package a.i.b.a.c.j.a;

import a.f.b.j;
import a.i.b.a.c.b.am;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.a;
import a.i.b.a.c.e.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
{
  final c AWq;
  final a.c BGD;
  final a BGE;
  final am BGF;

  public e(c paramc, a.c paramc1, a parama, am paramam)
  {
    AppMethodBeat.i(122248);
    this.AWq = paramc;
    this.BGD = paramc1;
    this.BGE = parama;
    this.BGF = paramam;
    AppMethodBeat.o(122248);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(122251);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        if ((!j.j(this.AWq, paramObject.AWq)) || (!j.j(this.BGD, paramObject.BGD)) || (!j.j(this.BGE, paramObject.BGE)) || (!j.j(this.BGF, paramObject.BGF)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(122251);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122251);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(122250);
    Object localObject = this.AWq;
    int j;
    int k;
    if (localObject != null)
    {
      j = localObject.hashCode();
      localObject = this.BGD;
      if (localObject == null)
        break label94;
      k = localObject.hashCode();
      label36: localObject = this.BGE;
      if (localObject == null)
        break label100;
    }
    label94: label100: for (int m = localObject.hashCode(); ; m = 0)
    {
      localObject = this.BGF;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(122250);
      return (m + (k + j * 31) * 31) * 31 + i;
      j = 0;
      break;
      k = 0;
      break label36;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122249);
    String str = "ClassData(nameResolver=" + this.AWq + ", classProto=" + this.BGD + ", metadataVersion=" + this.BGE + ", sourceElement=" + this.BGF + ")";
    AppMethodBeat.o(122249);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.e
 * JD-Core Version:    0.6.2
 */