package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class baa extends com.tencent.mm.bt.a
{
  public String csB;
  public boolean wDO;
  public boolean wDP;
  public int wDQ;
  public int wDR;
  public String wDS;
  public boolean wDT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51000);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.wDO);
      paramArrayOfObject.aO(2, this.wDP);
      paramArrayOfObject.iz(3, this.wDQ);
      paramArrayOfObject.iz(4, this.wDR);
      if (this.wDS != null)
        paramArrayOfObject.e(5, this.wDS);
      paramArrayOfObject.aO(6, this.wDT);
      if (this.csB != null)
        paramArrayOfObject.e(7, this.csB);
      AppMethodBeat.o(51000);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 1 + 0 + (e.a.a.b.b.a.fv(2) + 1) + e.a.a.b.b.a.bs(3, this.wDQ) + e.a.a.b.b.a.bs(4, this.wDR);
        paramInt = i;
        if (this.wDS != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.wDS);
        i = paramInt + (e.a.a.b.b.a.fv(6) + 1);
        paramInt = i;
        if (this.csB != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.csB);
        AppMethodBeat.o(51000);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51000);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        baa localbaa = (baa)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51000);
          break;
        case 1:
          localbaa.wDO = locala.BTU.ehX();
          AppMethodBeat.o(51000);
          paramInt = 0;
          break;
        case 2:
          localbaa.wDP = locala.BTU.ehX();
          AppMethodBeat.o(51000);
          paramInt = 0;
          break;
        case 3:
          localbaa.wDQ = locala.BTU.vd();
          AppMethodBeat.o(51000);
          paramInt = 0;
          break;
        case 4:
          localbaa.wDR = locala.BTU.vd();
          AppMethodBeat.o(51000);
          paramInt = 0;
          break;
        case 5:
          localbaa.wDS = locala.BTU.readString();
          AppMethodBeat.o(51000);
          paramInt = 0;
          break;
        case 6:
          localbaa.wDT = locala.BTU.ehX();
          AppMethodBeat.o(51000);
          paramInt = 0;
          break;
        case 7:
          localbaa.csB = locala.BTU.readString();
          AppMethodBeat.o(51000);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(51000);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.baa
 * JD-Core Version:    0.6.2
 */