package com.tencent.mm.ba;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g extends com.tencent.mm.bt.a
{
  public int cKB;
  public int fMk;
  public int fMl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(78445);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.cKB);
      paramArrayOfObject.iz(2, this.fMk);
      paramArrayOfObject.iz(3, this.fMl);
      AppMethodBeat.o(78445);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.cKB) + 0 + e.a.a.b.b.a.bs(2, this.fMk) + e.a.a.b.b.a.bs(3, this.fMl);
        AppMethodBeat.o(78445);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(78445);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        g localg = (g)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(78445);
          break;
        case 1:
          localg.cKB = locala.BTU.vd();
          AppMethodBeat.o(78445);
          paramInt = 0;
          break;
        case 2:
          localg.fMk = locala.BTU.vd();
          AppMethodBeat.o(78445);
          paramInt = 0;
          break;
        case 3:
          localg.fMl = locala.BTU.vd();
          AppMethodBeat.o(78445);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(78445);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.g
 * JD-Core Version:    0.6.2
 */