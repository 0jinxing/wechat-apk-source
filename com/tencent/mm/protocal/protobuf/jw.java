package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class jw extends com.tencent.mm.bt.a
{
  public String vMu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80027);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vMu != null)
        paramArrayOfObject.e(1, this.vMu);
      AppMethodBeat.o(80027);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vMu == null)
        break label227;
    label227: for (paramInt = e.a.a.b.b.a.f(1, this.vMu) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(80027);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80027);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        jw localjw = (jw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(80027);
          paramInt = -1;
          break;
        case 1:
          localjw.vMu = locala.BTU.readString();
          AppMethodBeat.o(80027);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80027);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jw
 * JD-Core Version:    0.6.2
 */