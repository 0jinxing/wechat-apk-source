package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bve extends com.tencent.mm.bt.a
{
  public long wOP;
  public String wWv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124350);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wWv == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Query");
        AppMethodBeat.o(124350);
        throw paramArrayOfObject;
      }
      if (this.wWv != null)
        paramArrayOfObject.e(1, this.wWv);
      paramArrayOfObject.ai(2, this.wOP);
      AppMethodBeat.o(124350);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wWv == null)
        break label322;
    label322: for (paramInt = e.a.a.b.b.a.f(1, this.wWv) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.o(2, this.wOP);
      AppMethodBeat.o(124350);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wWv == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Query");
          AppMethodBeat.o(124350);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124350);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bve localbve = (bve)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(124350);
          paramInt = -1;
          break;
        case 1:
          localbve.wWv = locala.BTU.readString();
          AppMethodBeat.o(124350);
          paramInt = i;
          break;
        case 2:
          localbve.wOP = locala.BTU.ve();
          AppMethodBeat.o(124350);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(124350);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bve
 * JD-Core Version:    0.6.2
 */