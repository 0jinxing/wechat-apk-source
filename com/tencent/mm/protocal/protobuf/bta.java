package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bta extends com.tencent.mm.bt.a
{
  public int vek;
  public int wOI;
  public int wVd;
  public int wVf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80166);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wOI);
      paramArrayOfObject.iz(2, this.wVf);
      paramArrayOfObject.iz(3, this.wVd);
      paramArrayOfObject.iz(4, this.vek);
      AppMethodBeat.o(80166);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wOI) + 0 + e.a.a.b.b.a.bs(2, this.wVf) + e.a.a.b.b.a.bs(3, this.wVd) + e.a.a.b.b.a.bs(4, this.vek);
        AppMethodBeat.o(80166);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80166);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bta localbta = (bta)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80166);
          break;
        case 1:
          localbta.wOI = locala.BTU.vd();
          AppMethodBeat.o(80166);
          paramInt = 0;
          break;
        case 2:
          localbta.wVf = locala.BTU.vd();
          AppMethodBeat.o(80166);
          paramInt = 0;
          break;
        case 3:
          localbta.wVd = locala.BTU.vd();
          AppMethodBeat.o(80166);
          paramInt = 0;
          break;
        case 4:
          localbta.vek = locala.BTU.vd();
          AppMethodBeat.o(80166);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(80166);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bta
 * JD-Core Version:    0.6.2
 */