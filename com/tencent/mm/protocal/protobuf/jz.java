package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class jz extends com.tencent.mm.bt.a
{
  public int enabled;
  public int jVA;
  public int vGw;
  public int vMN;
  public int vMO;
  public int vMP;
  public int vMQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14711);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.enabled);
      paramArrayOfObject.iz(2, this.vMN);
      paramArrayOfObject.iz(3, this.vMO);
      paramArrayOfObject.iz(4, this.vMP);
      paramArrayOfObject.iz(5, this.vMQ);
      paramArrayOfObject.iz(6, this.jVA);
      paramArrayOfObject.iz(7, this.vGw);
      AppMethodBeat.o(14711);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.enabled) + 0 + e.a.a.b.b.a.bs(2, this.vMN) + e.a.a.b.b.a.bs(3, this.vMO) + e.a.a.b.b.a.bs(4, this.vMP) + e.a.a.b.b.a.bs(5, this.vMQ) + e.a.a.b.b.a.bs(6, this.jVA) + e.a.a.b.b.a.bs(7, this.vGw);
        AppMethodBeat.o(14711);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14711);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        jz localjz = (jz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14711);
          break;
        case 1:
          localjz.enabled = locala.BTU.vd();
          AppMethodBeat.o(14711);
          paramInt = 0;
          break;
        case 2:
          localjz.vMN = locala.BTU.vd();
          AppMethodBeat.o(14711);
          paramInt = 0;
          break;
        case 3:
          localjz.vMO = locala.BTU.vd();
          AppMethodBeat.o(14711);
          paramInt = 0;
          break;
        case 4:
          localjz.vMP = locala.BTU.vd();
          AppMethodBeat.o(14711);
          paramInt = 0;
          break;
        case 5:
          localjz.vMQ = locala.BTU.vd();
          AppMethodBeat.o(14711);
          paramInt = 0;
          break;
        case 6:
          localjz.jVA = locala.BTU.vd();
          AppMethodBeat.o(14711);
          paramInt = 0;
          break;
        case 7:
          localjz.vGw = locala.BTU.vd();
          AppMethodBeat.o(14711);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(14711);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jz
 * JD-Core Version:    0.6.2
 */