package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class abt extends com.tencent.mm.bt.a
{
  public int fileCount;
  public int wiK;
  public int wiL;
  public int wiM;
  public int wiN;
  public int wiO;
  public int wiP;
  public int wiQ;
  public int wiR;
  public int wiS;
  public int wiT;
  public int wiU;
  public int wiV;
  public int wiW;
  public int wiX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51423);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wiK);
      paramArrayOfObject.iz(2, this.wiL);
      paramArrayOfObject.iz(3, this.wiM);
      paramArrayOfObject.iz(4, this.wiN);
      paramArrayOfObject.iz(5, this.wiO);
      paramArrayOfObject.iz(6, this.wiP);
      paramArrayOfObject.iz(7, this.wiQ);
      paramArrayOfObject.iz(8, this.fileCount);
      paramArrayOfObject.iz(9, this.wiR);
      paramArrayOfObject.iz(10, this.wiS);
      paramArrayOfObject.iz(11, this.wiT);
      paramArrayOfObject.iz(12, this.wiU);
      paramArrayOfObject.iz(13, this.wiV);
      paramArrayOfObject.iz(14, this.wiW);
      paramArrayOfObject.iz(15, this.wiX);
      AppMethodBeat.o(51423);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wiK) + 0 + e.a.a.b.b.a.bs(2, this.wiL) + e.a.a.b.b.a.bs(3, this.wiM) + e.a.a.b.b.a.bs(4, this.wiN) + e.a.a.b.b.a.bs(5, this.wiO) + e.a.a.b.b.a.bs(6, this.wiP) + e.a.a.b.b.a.bs(7, this.wiQ) + e.a.a.b.b.a.bs(8, this.fileCount) + e.a.a.b.b.a.bs(9, this.wiR) + e.a.a.b.b.a.bs(10, this.wiS) + e.a.a.b.b.a.bs(11, this.wiT) + e.a.a.b.b.a.bs(12, this.wiU) + e.a.a.b.b.a.bs(13, this.wiV) + e.a.a.b.b.a.bs(14, this.wiW) + e.a.a.b.b.a.bs(15, this.wiX);
        AppMethodBeat.o(51423);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51423);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abt localabt = (abt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51423);
          break;
        case 1:
          localabt.wiK = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 2:
          localabt.wiL = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 3:
          localabt.wiM = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 4:
          localabt.wiN = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 5:
          localabt.wiO = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 6:
          localabt.wiP = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 7:
          localabt.wiQ = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 8:
          localabt.fileCount = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 9:
          localabt.wiR = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 10:
          localabt.wiS = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 11:
          localabt.wiT = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 12:
          localabt.wiU = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 13:
          localabt.wiV = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 14:
          localabt.wiW = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        case 15:
          localabt.wiX = locala.BTU.vd();
          AppMethodBeat.o(51423);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(51423);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abt
 * JD-Core Version:    0.6.2
 */