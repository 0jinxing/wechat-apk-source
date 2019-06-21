package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bgt extends com.tencent.mm.bt.a
{
  public int type;
  public com.tencent.mm.bt.b wKq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60054);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wKq == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: buf");
        AppMethodBeat.o(60054);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.type);
      if (this.wKq != null)
        paramArrayOfObject.c(2, this.wKq);
      AppMethodBeat.o(60054);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.type) + 0;
        paramInt = i;
        if (this.wKq != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.wKq);
        AppMethodBeat.o(60054);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wKq == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: buf");
          AppMethodBeat.o(60054);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(60054);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bgt localbgt = (bgt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(60054);
          paramInt = -1;
          break;
        case 1:
          localbgt.type = locala.BTU.vd();
          AppMethodBeat.o(60054);
          paramInt = 0;
          break;
        case 2:
          localbgt.wKq = locala.BTU.emu();
          AppMethodBeat.o(60054);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(60054);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bgt
 * JD-Core Version:    0.6.2
 */