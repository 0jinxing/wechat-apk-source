package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ctl extends com.tencent.mm.bt.a
{
  public int jCt;
  public String wdO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28719);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wdO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MD5");
        AppMethodBeat.o(28719);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.jCt);
      if (this.wdO != null)
        paramArrayOfObject.e(2, this.wdO);
      AppMethodBeat.o(28719);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.jCt) + 0;
        paramInt = i;
        if (this.wdO != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wdO);
        AppMethodBeat.o(28719);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wdO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MD5");
          AppMethodBeat.o(28719);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28719);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ctl localctl = (ctl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28719);
          paramInt = -1;
          break;
        case 1:
          localctl.jCt = locala.BTU.vd();
          AppMethodBeat.o(28719);
          paramInt = 0;
          break;
        case 2:
          localctl.wdO = locala.BTU.readString();
          AppMethodBeat.o(28719);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28719);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ctl
 * JD-Core Version:    0.6.2
 */