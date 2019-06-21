package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cqv extends com.tencent.mm.bt.a
{
  public String xoG;
  public int xoH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102403);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoG != null)
        paramArrayOfObject.e(1, this.xoG);
      paramArrayOfObject.iz(2, this.xoH);
      AppMethodBeat.o(102403);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoG == null)
        break label274;
    label274: for (paramInt = e.a.a.b.b.a.f(1, this.xoG) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.xoH);
      AppMethodBeat.o(102403);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102403);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cqv localcqv = (cqv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(102403);
          paramInt = -1;
          break;
        case 1:
          localcqv.xoG = locala.BTU.readString();
          AppMethodBeat.o(102403);
          paramInt = i;
          break;
        case 2:
          localcqv.xoH = locala.BTU.vd();
          AppMethodBeat.o(102403);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(102403);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqv
 * JD-Core Version:    0.6.2
 */