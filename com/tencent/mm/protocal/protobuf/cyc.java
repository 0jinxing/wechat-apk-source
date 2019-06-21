package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cyc extends com.tencent.mm.bt.a
{
  public int Scene;
  public int vMG;
  public int wzF;
  public int xtw;
  public int xtx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96348);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wzF);
      paramArrayOfObject.iz(2, this.vMG);
      paramArrayOfObject.iz(3, this.xtw);
      paramArrayOfObject.iz(4, this.Scene);
      paramArrayOfObject.iz(10, this.xtx);
      AppMethodBeat.o(96348);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wzF) + 0 + e.a.a.b.b.a.bs(2, this.vMG) + e.a.a.b.b.a.bs(3, this.xtw) + e.a.a.b.b.a.bs(4, this.Scene) + e.a.a.b.b.a.bs(10, this.xtx);
        AppMethodBeat.o(96348);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96348);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cyc localcyc = (cyc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        default:
          paramInt = -1;
          AppMethodBeat.o(96348);
          break;
        case 1:
          localcyc.wzF = locala.BTU.vd();
          AppMethodBeat.o(96348);
          paramInt = 0;
          break;
        case 2:
          localcyc.vMG = locala.BTU.vd();
          AppMethodBeat.o(96348);
          paramInt = 0;
          break;
        case 3:
          localcyc.xtw = locala.BTU.vd();
          AppMethodBeat.o(96348);
          paramInt = 0;
          break;
        case 4:
          localcyc.Scene = locala.BTU.vd();
          AppMethodBeat.o(96348);
          paramInt = 0;
          break;
        case 10:
          localcyc.xtx = locala.BTU.vd();
          AppMethodBeat.o(96348);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96348);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cyc
 * JD-Core Version:    0.6.2
 */