package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bns extends com.tencent.mm.bt.a
{
  public String luG;
  public int wQU;
  public String wfF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28597);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.luG != null)
        paramArrayOfObject.e(1, this.luG);
      paramArrayOfObject.iz(2, this.wQU);
      if (this.wfF != null)
        paramArrayOfObject.e(3, this.wfF);
      AppMethodBeat.o(28597);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.luG == null)
        break label346;
    label346: for (paramInt = e.a.a.b.b.a.f(1, this.luG) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wQU);
      paramInt = i;
      if (this.wfF != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wfF);
      AppMethodBeat.o(28597);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28597);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bns localbns = (bns)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28597);
          break;
        case 1:
          localbns.luG = locala.BTU.readString();
          AppMethodBeat.o(28597);
          paramInt = i;
          break;
        case 2:
          localbns.wQU = locala.BTU.vd();
          AppMethodBeat.o(28597);
          paramInt = i;
          break;
        case 3:
          localbns.wfF = locala.BTU.readString();
          AppMethodBeat.o(28597);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28597);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bns
 * JD-Core Version:    0.6.2
 */