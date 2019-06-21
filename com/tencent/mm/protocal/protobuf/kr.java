package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class kr extends com.tencent.mm.bt.a
{
  public String vNL;
  public String vNM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14713);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vNL != null)
        paramArrayOfObject.e(1, this.vNL);
      if (this.vNM != null)
        paramArrayOfObject.e(2, this.vNM);
      AppMethodBeat.o(14713);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vNL == null)
        break label298;
    label298: for (i = e.a.a.b.b.a.f(1, this.vNL) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vNM != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vNM);
      AppMethodBeat.o(14713);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14713);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        kr localkr = (kr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(14713);
          paramInt = -1;
          break;
        case 1:
          localkr.vNL = locala.BTU.readString();
          AppMethodBeat.o(14713);
          paramInt = i;
          break;
        case 2:
          localkr.vNM = locala.BTU.readString();
          AppMethodBeat.o(14713);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(14713);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.kr
 * JD-Core Version:    0.6.2
 */