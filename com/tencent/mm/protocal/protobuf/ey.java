package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ey extends com.tencent.mm.bt.a
{
  public long vGQ;
  public int vGR;
  public int vGS;
  public int vGT;
  public int vGU;
  public int vGV;
  public int vGW;
  public String vGX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96194);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.vGQ);
      paramArrayOfObject.iz(2, this.vGR);
      paramArrayOfObject.iz(3, this.vGS);
      paramArrayOfObject.iz(4, this.vGT);
      paramArrayOfObject.iz(5, this.vGU);
      paramArrayOfObject.iz(6, this.vGV);
      paramArrayOfObject.iz(7, this.vGW);
      if (this.vGX != null)
        paramArrayOfObject.e(8, this.vGX);
      AppMethodBeat.o(96194);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.vGQ) + 0 + e.a.a.b.b.a.bs(2, this.vGR) + e.a.a.b.b.a.bs(3, this.vGS) + e.a.a.b.b.a.bs(4, this.vGT) + e.a.a.b.b.a.bs(5, this.vGU) + e.a.a.b.b.a.bs(6, this.vGV) + e.a.a.b.b.a.bs(7, this.vGW);
        paramInt = i;
        if (this.vGX != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.vGX);
        AppMethodBeat.o(96194);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96194);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ey localey = (ey)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96194);
          break;
        case 1:
          localey.vGQ = locala.BTU.ve();
          AppMethodBeat.o(96194);
          paramInt = 0;
          break;
        case 2:
          localey.vGR = locala.BTU.vd();
          AppMethodBeat.o(96194);
          paramInt = 0;
          break;
        case 3:
          localey.vGS = locala.BTU.vd();
          AppMethodBeat.o(96194);
          paramInt = 0;
          break;
        case 4:
          localey.vGT = locala.BTU.vd();
          AppMethodBeat.o(96194);
          paramInt = 0;
          break;
        case 5:
          localey.vGU = locala.BTU.vd();
          AppMethodBeat.o(96194);
          paramInt = 0;
          break;
        case 6:
          localey.vGV = locala.BTU.vd();
          AppMethodBeat.o(96194);
          paramInt = 0;
          break;
        case 7:
          localey.vGW = locala.BTU.vd();
          AppMethodBeat.o(96194);
          paramInt = 0;
          break;
        case 8:
          localey.vGX = locala.BTU.readString();
          AppMethodBeat.o(96194);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96194);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ey
 * JD-Core Version:    0.6.2
 */