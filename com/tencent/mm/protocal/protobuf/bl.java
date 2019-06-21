package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bl extends com.tencent.mm.bt.a
{
  public long endTime;
  public int qDF;
  public int qDG;
  public long startTime;
  public float vDD;
  public float vDE;
  public float vDF;
  public long vDG;
  public long vDH;
  public long vDI;
  public long vDJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94496);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.qDF);
      paramArrayOfObject.iz(2, this.qDG);
      paramArrayOfObject.r(3, this.vDD);
      paramArrayOfObject.r(4, this.vDE);
      paramArrayOfObject.r(5, this.vDF);
      paramArrayOfObject.ai(6, this.startTime);
      paramArrayOfObject.ai(7, this.endTime);
      paramArrayOfObject.ai(8, this.vDG);
      paramArrayOfObject.ai(9, this.vDH);
      paramArrayOfObject.ai(10, this.vDI);
      paramArrayOfObject.ai(11, this.vDJ);
      AppMethodBeat.o(94496);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.qDF) + 0 + e.a.a.b.b.a.bs(2, this.qDG) + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4) + (e.a.a.b.b.a.fv(5) + 4) + e.a.a.b.b.a.o(6, this.startTime) + e.a.a.b.b.a.o(7, this.endTime) + e.a.a.b.b.a.o(8, this.vDG) + e.a.a.b.b.a.o(9, this.vDH) + e.a.a.b.b.a.o(10, this.vDI) + e.a.a.b.b.a.o(11, this.vDJ);
        AppMethodBeat.o(94496);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94496);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bl localbl = (bl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94496);
          break;
        case 1:
          localbl.qDF = locala.BTU.vd();
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        case 2:
          localbl.qDG = locala.BTU.vd();
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        case 3:
          localbl.vDD = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        case 4:
          localbl.vDE = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        case 5:
          localbl.vDF = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        case 6:
          localbl.startTime = locala.BTU.ve();
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        case 7:
          localbl.endTime = locala.BTU.ve();
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        case 8:
          localbl.vDG = locala.BTU.ve();
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        case 9:
          localbl.vDH = locala.BTU.ve();
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        case 10:
          localbl.vDI = locala.BTU.ve();
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        case 11:
          localbl.vDJ = locala.BTU.ve();
          AppMethodBeat.o(94496);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94496);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bl
 * JD-Core Version:    0.6.2
 */