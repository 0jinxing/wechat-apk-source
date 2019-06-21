package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class fb extends com.tencent.mm.bt.a
{
  public com.tencent.mm.bt.b vGZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28313);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vGZ == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Cookies");
        AppMethodBeat.o(28313);
        throw paramArrayOfObject;
      }
      if (this.vGZ != null)
        paramArrayOfObject.c(1, this.vGZ);
      AppMethodBeat.o(28313);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vGZ == null)
        break label286;
    label286: for (paramInt = e.a.a.b.b.a.b(1, this.vGZ) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(28313);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vGZ == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Cookies");
          AppMethodBeat.o(28313);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28313);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        fb localfb = (fb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28313);
          paramInt = -1;
          break;
        case 1:
          localfb.vGZ = locala.BTU.emu();
          AppMethodBeat.o(28313);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28313);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fb
 * JD-Core Version:    0.6.2
 */