package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bhl extends com.tencent.mm.bt.a
{
  public String cMC;
  public String kdG;
  public int wKK;
  public int wKL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89113);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cMC != null)
        paramArrayOfObject.e(1, this.cMC);
      if (this.kdG != null)
        paramArrayOfObject.e(2, this.kdG);
      paramArrayOfObject.iz(3, this.wKK);
      paramArrayOfObject.iz(4, this.wKL);
      AppMethodBeat.o(89113);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cMC == null)
        break label384;
    label384: for (paramInt = e.a.a.b.b.a.f(1, this.cMC) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kdG != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kdG);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wKK) + e.a.a.b.b.a.bs(4, this.wKL);
      AppMethodBeat.o(89113);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89113);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bhl localbhl = (bhl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89113);
          break;
        case 1:
          localbhl.cMC = locala.BTU.readString();
          AppMethodBeat.o(89113);
          paramInt = i;
          break;
        case 2:
          localbhl.kdG = locala.BTU.readString();
          AppMethodBeat.o(89113);
          paramInt = i;
          break;
        case 3:
          localbhl.wKK = locala.BTU.vd();
          AppMethodBeat.o(89113);
          paramInt = i;
          break;
        case 4:
          localbhl.wKL = locala.BTU.vd();
          AppMethodBeat.o(89113);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89113);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bhl
 * JD-Core Version:    0.6.2
 */