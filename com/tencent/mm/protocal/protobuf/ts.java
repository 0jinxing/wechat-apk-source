package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ts extends com.tencent.mm.bt.a
{
  public int kzN;
  public int kzO;
  public int kzP;
  public int kzQ;
  public int kzR;
  public int kzS;
  public int kzT;
  public int kzU;
  public int kzV;
  public int waQ;
  public int waR;
  public int waS;
  public int waT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(135598);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.kzN);
      paramArrayOfObject.iz(2, this.waQ);
      paramArrayOfObject.iz(3, this.kzO);
      paramArrayOfObject.iz(4, this.kzP);
      paramArrayOfObject.iz(5, this.kzQ);
      paramArrayOfObject.iz(6, this.waR);
      paramArrayOfObject.iz(7, this.kzR);
      paramArrayOfObject.iz(8, this.kzS);
      paramArrayOfObject.iz(9, this.waS);
      paramArrayOfObject.iz(10, this.waT);
      paramArrayOfObject.iz(11, this.kzT);
      paramArrayOfObject.iz(12, this.kzU);
      paramArrayOfObject.iz(13, this.kzV);
      AppMethodBeat.o(135598);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.kzN) + 0 + e.a.a.b.b.a.bs(2, this.waQ) + e.a.a.b.b.a.bs(3, this.kzO) + e.a.a.b.b.a.bs(4, this.kzP) + e.a.a.b.b.a.bs(5, this.kzQ) + e.a.a.b.b.a.bs(6, this.waR) + e.a.a.b.b.a.bs(7, this.kzR) + e.a.a.b.b.a.bs(8, this.kzS) + e.a.a.b.b.a.bs(9, this.waS) + e.a.a.b.b.a.bs(10, this.waT) + e.a.a.b.b.a.bs(11, this.kzT) + e.a.a.b.b.a.bs(12, this.kzU) + e.a.a.b.b.a.bs(13, this.kzV);
        AppMethodBeat.o(135598);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(135598);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ts localts = (ts)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135598);
          break;
        case 1:
          localts.kzN = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 2:
          localts.waQ = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 3:
          localts.kzO = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 4:
          localts.kzP = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 5:
          localts.kzQ = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 6:
          localts.waR = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 7:
          localts.kzR = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 8:
          localts.kzS = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 9:
          localts.waS = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 10:
          localts.waT = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 11:
          localts.kzT = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 12:
          localts.kzU = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        case 13:
          localts.kzV = locala.BTU.vd();
          AppMethodBeat.o(135598);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(135598);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ts
 * JD-Core Version:    0.6.2
 */