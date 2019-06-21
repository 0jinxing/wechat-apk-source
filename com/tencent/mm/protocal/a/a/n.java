package com.tencent.mm.protocal.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n extends com.tencent.mm.bt.a
{
  public int type;
  public int vyQ;
  public int vzA;
  public int vzB;
  public int vzC;
  public int vzD;
  public int vzE;
  public int vzz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72834);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vyQ);
      paramArrayOfObject.iz(2, this.vzz);
      paramArrayOfObject.iz(3, this.vzA);
      paramArrayOfObject.iz(4, this.vzB);
      paramArrayOfObject.iz(5, this.vzC);
      paramArrayOfObject.iz(6, this.vzD);
      paramArrayOfObject.iz(7, this.vzE);
      paramArrayOfObject.iz(8, this.type);
      AppMethodBeat.o(72834);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vyQ) + 0 + e.a.a.b.b.a.bs(2, this.vzz) + e.a.a.b.b.a.bs(3, this.vzA) + e.a.a.b.b.a.bs(4, this.vzB) + e.a.a.b.b.a.bs(5, this.vzC) + e.a.a.b.b.a.bs(6, this.vzD) + e.a.a.b.b.a.bs(7, this.vzE) + e.a.a.b.b.a.bs(8, this.type);
        AppMethodBeat.o(72834);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72834);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        n localn = (n)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72834);
          break;
        case 1:
          localn.vyQ = locala.BTU.vd();
          AppMethodBeat.o(72834);
          paramInt = 0;
          break;
        case 2:
          localn.vzz = locala.BTU.vd();
          AppMethodBeat.o(72834);
          paramInt = 0;
          break;
        case 3:
          localn.vzA = locala.BTU.vd();
          AppMethodBeat.o(72834);
          paramInt = 0;
          break;
        case 4:
          localn.vzB = locala.BTU.vd();
          AppMethodBeat.o(72834);
          paramInt = 0;
          break;
        case 5:
          localn.vzC = locala.BTU.vd();
          AppMethodBeat.o(72834);
          paramInt = 0;
          break;
        case 6:
          localn.vzD = locala.BTU.vd();
          AppMethodBeat.o(72834);
          paramInt = 0;
          break;
        case 7:
          localn.vzE = locala.BTU.vd();
          AppMethodBeat.o(72834);
          paramInt = 0;
          break;
        case 8:
          localn.type = locala.BTU.vd();
          AppMethodBeat.o(72834);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72834);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a.n
 * JD-Core Version:    0.6.2
 */