package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ad extends com.tencent.mm.bt.a
{
  public int jCA;
  public int jCB;
  public int jCD;
  public String jCx;
  public int jCy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18079);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jCx == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DataID");
        AppMethodBeat.o(18079);
        throw paramArrayOfObject;
      }
      if (this.jCx != null)
        paramArrayOfObject.e(1, this.jCx);
      paramArrayOfObject.iz(2, this.jCy);
      paramArrayOfObject.iz(3, this.jCA);
      paramArrayOfObject.iz(4, this.jCB);
      paramArrayOfObject.iz(5, this.jCD);
      AppMethodBeat.o(18079);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jCx == null)
        break label470;
    label470: for (paramInt = e.a.a.b.b.a.f(1, this.jCx) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.jCy) + e.a.a.b.b.a.bs(3, this.jCA) + e.a.a.b.b.a.bs(4, this.jCB) + e.a.a.b.b.a.bs(5, this.jCD);
      AppMethodBeat.o(18079);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jCx == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DataID");
          AppMethodBeat.o(18079);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18079);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ad localad = (ad)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18079);
          break;
        case 1:
          localad.jCx = locala.BTU.readString();
          AppMethodBeat.o(18079);
          paramInt = i;
          break;
        case 2:
          localad.jCy = locala.BTU.vd();
          AppMethodBeat.o(18079);
          paramInt = i;
          break;
        case 3:
          localad.jCA = locala.BTU.vd();
          AppMethodBeat.o(18079);
          paramInt = i;
          break;
        case 4:
          localad.jCB = locala.BTU.vd();
          AppMethodBeat.o(18079);
          paramInt = i;
          break;
        case 5:
          localad.jCD = locala.BTU.vd();
          AppMethodBeat.o(18079);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18079);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.ad
 * JD-Core Version:    0.6.2
 */