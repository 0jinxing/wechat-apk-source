package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class bcq extends com.tencent.mm.bt.a
{
  public int vOw;
  public String vXm;
  public String vXn;
  public int wGT;
  public b wGU;
  public String wGV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28556);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vOw);
      paramArrayOfObject.iz(2, this.wGT);
      if (this.wGU != null)
        paramArrayOfObject.c(3, this.wGU);
      if (this.wGV != null)
        paramArrayOfObject.e(4, this.wGV);
      if (this.vXm != null)
        paramArrayOfObject.e(5, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(6, this.vXn);
      AppMethodBeat.o(28556);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vOw) + 0 + e.a.a.b.b.a.bs(2, this.wGT);
        int i = paramInt;
        if (this.wGU != null)
          i = paramInt + e.a.a.b.b.a.b(3, this.wGU);
        paramInt = i;
        if (this.wGV != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wGV);
        i = paramInt;
        if (this.vXm != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.vXm);
        paramInt = i;
        if (this.vXn != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.vXn);
        AppMethodBeat.o(28556);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28556);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bcq localbcq = (bcq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28556);
          break;
        case 1:
          localbcq.vOw = locala.BTU.vd();
          AppMethodBeat.o(28556);
          paramInt = 0;
          break;
        case 2:
          localbcq.wGT = locala.BTU.vd();
          AppMethodBeat.o(28556);
          paramInt = 0;
          break;
        case 3:
          localbcq.wGU = locala.BTU.emu();
          AppMethodBeat.o(28556);
          paramInt = 0;
          break;
        case 4:
          localbcq.wGV = locala.BTU.readString();
          AppMethodBeat.o(28556);
          paramInt = 0;
          break;
        case 5:
          localbcq.vXm = locala.BTU.readString();
          AppMethodBeat.o(28556);
          paramInt = 0;
          break;
        case 6:
          localbcq.vXn = locala.BTU.readString();
          AppMethodBeat.o(28556);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28556);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bcq
 * JD-Core Version:    0.6.2
 */