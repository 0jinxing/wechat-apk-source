package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h extends com.tencent.mm.bt.a
{
  public int ptD;
  public long ptF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(67927);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ptD);
      paramArrayOfObject.ai(2, this.ptF);
      AppMethodBeat.o(67927);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.ptD) + 0 + e.a.a.b.b.a.o(2, this.ptF);
        AppMethodBeat.o(67927);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(67927);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        h localh = (h)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(67927);
          paramInt = -1;
          break;
        case 1:
          localh.ptD = locala.BTU.vd();
          AppMethodBeat.o(67927);
          paramInt = 0;
          break;
        case 2:
          localh.ptF = locala.BTU.ve();
          AppMethodBeat.o(67927);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(67927);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.h
 * JD-Core Version:    0.6.2
 */