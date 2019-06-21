package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class dw extends com.tencent.mm.bt.a
{
  public int enabled;
  public String url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14676);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.enabled);
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      AppMethodBeat.o(14676);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.enabled) + 0;
        paramInt = i;
        if (this.url != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.url);
        AppMethodBeat.o(14676);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14676);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dw localdw = (dw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(14676);
          paramInt = -1;
          break;
        case 1:
          localdw.enabled = locala.BTU.vd();
          AppMethodBeat.o(14676);
          paramInt = 0;
          break;
        case 2:
          localdw.url = locala.BTU.readString();
          AppMethodBeat.o(14676);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(14676);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.dw
 * JD-Core Version:    0.6.2
 */