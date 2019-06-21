package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bzu extends com.tencent.mm.bt.a
{
  public int Version;
  public com.tencent.mm.bt.b wYR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80189);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wYR == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Signature");
        AppMethodBeat.o(80189);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.Version);
      if (this.wYR != null)
        paramArrayOfObject.c(2, this.wYR);
      AppMethodBeat.o(80189);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.Version) + 0;
        paramInt = i;
        if (this.wYR != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.wYR);
        AppMethodBeat.o(80189);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wYR == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Signature");
          AppMethodBeat.o(80189);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80189);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzu localbzu = (bzu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(80189);
          paramInt = -1;
          break;
        case 1:
          localbzu.Version = locala.BTU.vd();
          AppMethodBeat.o(80189);
          paramInt = 0;
          break;
        case 2:
          localbzu.wYR = locala.BTU.emu();
          AppMethodBeat.o(80189);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(80189);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzu
 * JD-Core Version:    0.6.2
 */