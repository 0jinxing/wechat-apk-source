package com.tencent.mm.j.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends com.tencent.mm.bt.a
{
  public long eoC;
  public long eoD;
  public long eoE;
  public long eoF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(59617);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.eoC);
      paramArrayOfObject.ai(2, this.eoD);
      paramArrayOfObject.ai(3, this.eoE);
      paramArrayOfObject.ai(4, this.eoF);
      AppMethodBeat.o(59617);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.eoC) + 0 + e.a.a.b.b.a.o(2, this.eoD) + e.a.a.b.b.a.o(3, this.eoE) + e.a.a.b.b.a.o(4, this.eoF);
        AppMethodBeat.o(59617);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(59617);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        c localc = (c)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(59617);
          break;
        case 1:
          localc.eoC = locala.BTU.ve();
          AppMethodBeat.o(59617);
          paramInt = 0;
          break;
        case 2:
          localc.eoD = locala.BTU.ve();
          AppMethodBeat.o(59617);
          paramInt = 0;
          break;
        case 3:
          localc.eoE = locala.BTU.ve();
          AppMethodBeat.o(59617);
          paramInt = 0;
          break;
        case 4:
          localc.eoF = locala.BTU.ve();
          AppMethodBeat.o(59617);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(59617);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.j.a.a.c
 * JD-Core Version:    0.6.2
 */