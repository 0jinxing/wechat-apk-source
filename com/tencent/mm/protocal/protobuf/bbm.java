package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bbm extends com.tencent.mm.bt.a
{
  public String qjG;
  public int qjH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114978);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.qjG != null)
        paramArrayOfObject.e(1, this.qjG);
      paramArrayOfObject.iz(2, this.qjH);
      AppMethodBeat.o(114978);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.qjG == null)
        break label274;
    label274: for (paramInt = e.a.a.b.b.a.f(1, this.qjG) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.qjH);
      AppMethodBeat.o(114978);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114978);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bbm localbbm = (bbm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(114978);
          paramInt = -1;
          break;
        case 1:
          localbbm.qjG = locala.BTU.readString();
          AppMethodBeat.o(114978);
          paramInt = i;
          break;
        case 2:
          localbbm.qjH = locala.BTU.vd();
          AppMethodBeat.o(114978);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(114978);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbm
 * JD-Core Version:    0.6.2
 */