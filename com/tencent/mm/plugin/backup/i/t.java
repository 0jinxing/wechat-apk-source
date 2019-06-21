package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class t extends com.tencent.mm.bt.a
{
  public String ID;
  public int jCo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18068);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ID == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ID");
        AppMethodBeat.o(18068);
        throw paramArrayOfObject;
      }
      if (this.ID != null)
        paramArrayOfObject.e(1, this.ID);
      paramArrayOfObject.iz(2, this.jCo);
      AppMethodBeat.o(18068);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ID == null)
        break label334;
    label334: for (paramInt = e.a.a.b.b.a.f(1, this.ID) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.jCo);
      AppMethodBeat.o(18068);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ID == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ID");
          AppMethodBeat.o(18068);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18068);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        t localt = (t)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(18068);
          paramInt = -1;
          break;
        case 1:
          localt.ID = locala.BTU.readString();
          AppMethodBeat.o(18068);
          paramInt = i;
          break;
        case 2:
          localt.jCo = locala.BTU.vd();
          AppMethodBeat.o(18068);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(18068);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.t
 * JD-Core Version:    0.6.2
 */