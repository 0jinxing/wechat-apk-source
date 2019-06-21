package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class nl extends com.tencent.mm.bt.a
{
  public String vRQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94512);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vRQ != null)
        paramArrayOfObject.e(1, this.vRQ);
      AppMethodBeat.o(94512);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vRQ == null)
        break label227;
    label227: for (paramInt = e.a.a.b.b.a.f(1, this.vRQ) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(94512);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94512);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        nl localnl = (nl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(94512);
          paramInt = -1;
          break;
        case 1:
          localnl.vRQ = locala.BTU.readString();
          AppMethodBeat.o(94512);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(94512);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nl
 * JD-Core Version:    0.6.2
 */