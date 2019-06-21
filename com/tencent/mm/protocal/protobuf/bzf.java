package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bzf extends com.tencent.mm.bt.a
{
  public int wYj;
  public String wdO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28656);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wdO != null)
        paramArrayOfObject.e(1, this.wdO);
      paramArrayOfObject.iz(2, this.wYj);
      AppMethodBeat.o(28656);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wdO == null)
        break label282;
    label282: for (paramInt = e.a.a.b.b.a.f(1, this.wdO) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.wYj);
      AppMethodBeat.o(28656);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28656);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzf localbzf = (bzf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28656);
          paramInt = -1;
          break;
        case 1:
          localbzf.wdO = locala.BTU.readString();
          AppMethodBeat.o(28656);
          paramInt = i;
          break;
        case 2:
          localbzf.wYj = locala.BTU.vd();
          AppMethodBeat.o(28656);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28656);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzf
 * JD-Core Version:    0.6.2
 */