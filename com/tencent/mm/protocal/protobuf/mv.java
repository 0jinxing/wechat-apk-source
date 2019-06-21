package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class mv extends com.tencent.mm.bt.a
{
  public int vQP;
  public int vQQ;
  public int vQR;
  public int vQS;
  public int vQT;
  public int vQU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58897);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vQP);
      paramArrayOfObject.iz(2, this.vQQ);
      paramArrayOfObject.iz(3, this.vQR);
      paramArrayOfObject.iz(4, this.vQS);
      paramArrayOfObject.iz(5, this.vQT);
      paramArrayOfObject.iz(6, this.vQU);
      AppMethodBeat.o(58897);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vQP) + 0 + e.a.a.b.b.a.bs(2, this.vQQ) + e.a.a.b.b.a.bs(3, this.vQR) + e.a.a.b.b.a.bs(4, this.vQS) + e.a.a.b.b.a.bs(5, this.vQT) + e.a.a.b.b.a.bs(6, this.vQU);
        AppMethodBeat.o(58897);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58897);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        mv localmv = (mv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58897);
          break;
        case 1:
          localmv.vQP = locala.BTU.vd();
          AppMethodBeat.o(58897);
          paramInt = 0;
          break;
        case 2:
          localmv.vQQ = locala.BTU.vd();
          AppMethodBeat.o(58897);
          paramInt = 0;
          break;
        case 3:
          localmv.vQR = locala.BTU.vd();
          AppMethodBeat.o(58897);
          paramInt = 0;
          break;
        case 4:
          localmv.vQS = locala.BTU.vd();
          AppMethodBeat.o(58897);
          paramInt = 0;
          break;
        case 5:
          localmv.vQT = locala.BTU.vd();
          AppMethodBeat.o(58897);
          paramInt = 0;
          break;
        case 6:
          localmv.vQU = locala.BTU.vd();
          AppMethodBeat.o(58897);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(58897);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mv
 * JD-Core Version:    0.6.2
 */