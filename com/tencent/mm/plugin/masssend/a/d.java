package com.tencent.mm.plugin.masssend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends com.tencent.mm.bt.a
{
  public int ccb;
  public int end;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(22735);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ccb);
      paramArrayOfObject.iz(2, this.end);
      AppMethodBeat.o(22735);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.ccb) + 0 + e.a.a.b.b.a.bs(2, this.end);
        AppMethodBeat.o(22735);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(22735);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        d locald = (d)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(22735);
          paramInt = -1;
          break;
        case 1:
          locald.ccb = locala.BTU.vd();
          AppMethodBeat.o(22735);
          paramInt = 0;
          break;
        case 2:
          locald.end = locala.BTU.vd();
          AppMethodBeat.o(22735);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(22735);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.a.d
 * JD-Core Version:    0.6.2
 */