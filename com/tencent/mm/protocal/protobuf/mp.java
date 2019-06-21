package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class mp extends com.tencent.mm.bt.a
{
  public long vQE;
  public String vQF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124303);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vQF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ObjectDesc");
        AppMethodBeat.o(124303);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.vQE);
      if (this.vQF != null)
        paramArrayOfObject.e(2, this.vQF);
      AppMethodBeat.o(124303);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.vQE) + 0;
        paramInt = i;
        if (this.vQF != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vQF);
        AppMethodBeat.o(124303);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vQF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ObjectDesc");
          AppMethodBeat.o(124303);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124303);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        mp localmp = (mp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(124303);
          paramInt = -1;
          break;
        case 1:
          localmp.vQE = locala.BTU.ve();
          AppMethodBeat.o(124303);
          paramInt = 0;
          break;
        case 2:
          localmp.vQF = locala.BTU.readString();
          AppMethodBeat.o(124303);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(124303);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mp
 * JD-Core Version:    0.6.2
 */