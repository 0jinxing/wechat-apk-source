package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class nb extends com.tencent.mm.bt.a
{
  public int vRF;
  public int vRG;
  public String vRH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56734);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vRF);
      paramArrayOfObject.iz(2, this.vRG);
      if (this.vRH != null)
        paramArrayOfObject.e(3, this.vRH);
      AppMethodBeat.o(56734);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vRF) + 0 + e.a.a.b.b.a.bs(2, this.vRG);
        paramInt = i;
        if (this.vRH != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.vRH);
        AppMethodBeat.o(56734);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56734);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        nb localnb = (nb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56734);
          break;
        case 1:
          localnb.vRF = locala.BTU.vd();
          AppMethodBeat.o(56734);
          paramInt = 0;
          break;
        case 2:
          localnb.vRG = locala.BTU.vd();
          AppMethodBeat.o(56734);
          paramInt = 0;
          break;
        case 3:
          localnb.vRH = locala.BTU.readString();
          AppMethodBeat.o(56734);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56734);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nb
 * JD-Core Version:    0.6.2
 */