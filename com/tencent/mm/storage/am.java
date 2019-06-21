package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class am extends com.tencent.mm.bt.a
{
  public int xXB;
  public LinkedList<Integer> xXC;
  public LinkedList<Integer> xXD;
  public LinkedList<Integer> xXE;
  public LinkedList<Long> xXF;
  public LinkedList<Long> xXG;
  public LinkedList<Long> xXH;

  public am()
  {
    AppMethodBeat.i(60134);
    this.xXC = new LinkedList();
    this.xXD = new LinkedList();
    this.xXE = new LinkedList();
    this.xXF = new LinkedList();
    this.xXG = new LinkedList();
    this.xXH = new LinkedList();
    AppMethodBeat.o(60134);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60135);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xXB);
      paramArrayOfObject.e(2, 2, this.xXC);
      paramArrayOfObject.e(3, 2, this.xXD);
      paramArrayOfObject.e(4, 2, this.xXE);
      paramArrayOfObject.e(5, 3, this.xXF);
      paramArrayOfObject.e(6, 3, this.xXG);
      paramArrayOfObject.e(7, 3, this.xXH);
      AppMethodBeat.o(60135);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.xXB) + 0 + e.a.a.a.c(2, 2, this.xXC) + e.a.a.a.c(3, 2, this.xXD) + e.a.a.a.c(4, 2, this.xXE) + e.a.a.a.c(5, 3, this.xXF) + e.a.a.a.c(6, 3, this.xXG) + e.a.a.a.c(7, 3, this.xXH);
        AppMethodBeat.o(60135);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xXC.clear();
        this.xXD.clear();
        this.xXE.clear();
        this.xXF.clear();
        this.xXG.clear();
        this.xXH.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60135);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        am localam = (am)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60135);
          break;
        case 1:
          localam.xXB = locala.BTU.vd();
          AppMethodBeat.o(60135);
          paramInt = 0;
          break;
        case 2:
          localam.xXC.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(60135);
          paramInt = 0;
          break;
        case 3:
          localam.xXD.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(60135);
          paramInt = 0;
          break;
        case 4:
          localam.xXE.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(60135);
          paramInt = 0;
          break;
        case 5:
          localam.xXF.add(Long.valueOf(locala.BTU.ve()));
          AppMethodBeat.o(60135);
          paramInt = 0;
          break;
        case 6:
          localam.xXG.add(Long.valueOf(locala.BTU.ve()));
          AppMethodBeat.o(60135);
          paramInt = 0;
          break;
        case 7:
          localam.xXH.add(Long.valueOf(locala.BTU.ve()));
          AppMethodBeat.o(60135);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(60135);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.am
 * JD-Core Version:    0.6.2
 */