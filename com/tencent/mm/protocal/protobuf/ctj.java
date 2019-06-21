package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class ctj extends com.tencent.mm.bt.a
{
  public b jBi;
  public long xqp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28717);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.xqp);
      if (this.jBi != null)
        paramArrayOfObject.c(2, this.jBi);
      AppMethodBeat.o(28717);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.xqp) + 0;
        paramInt = i;
        if (this.jBi != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.jBi);
        AppMethodBeat.o(28717);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28717);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ctj localctj = (ctj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28717);
          paramInt = -1;
          break;
        case 1:
          localctj.xqp = locala.BTU.ve();
          AppMethodBeat.o(28717);
          paramInt = 0;
          break;
        case 2:
          localctj.jBi = locala.BTU.emu();
          AppMethodBeat.o(28717);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28717);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ctj
 * JD-Core Version:    0.6.2
 */