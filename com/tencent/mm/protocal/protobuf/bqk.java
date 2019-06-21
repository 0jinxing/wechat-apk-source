package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bqk extends com.tencent.mm.bt.a
{
  public int wSJ;
  public int wSK;
  public int wSL;
  public int wSM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(108898);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wSJ);
      paramArrayOfObject.iz(2, this.wSK);
      paramArrayOfObject.iz(3, this.wSL);
      paramArrayOfObject.iz(4, this.wSM);
      AppMethodBeat.o(108898);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wSJ) + 0 + e.a.a.b.b.a.bs(2, this.wSK) + e.a.a.b.b.a.bs(3, this.wSL) + e.a.a.b.b.a.bs(4, this.wSM);
        AppMethodBeat.o(108898);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(108898);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bqk localbqk = (bqk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(108898);
          break;
        case 1:
          localbqk.wSJ = locala.BTU.vd();
          AppMethodBeat.o(108898);
          paramInt = 0;
          break;
        case 2:
          localbqk.wSK = locala.BTU.vd();
          AppMethodBeat.o(108898);
          paramInt = 0;
          break;
        case 3:
          localbqk.wSL = locala.BTU.vd();
          AppMethodBeat.o(108898);
          paramInt = 0;
          break;
        case 4:
          localbqk.wSM = locala.BTU.vd();
          AppMethodBeat.o(108898);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(108898);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqk
 * JD-Core Version:    0.6.2
 */