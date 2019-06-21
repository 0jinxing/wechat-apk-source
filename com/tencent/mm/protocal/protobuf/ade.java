package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ade extends com.tencent.mm.bt.a
{
  public String wkZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(112435);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wkZ != null)
        paramArrayOfObject.e(1, this.wkZ);
      AppMethodBeat.o(112435);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wkZ == null)
        break label227;
    label227: for (paramInt = e.a.a.b.b.a.f(1, this.wkZ) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(112435);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(112435);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ade localade = (ade)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(112435);
          paramInt = -1;
          break;
        case 1:
          localade.wkZ = locala.BTU.readString();
          AppMethodBeat.o(112435);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(112435);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ade
 * JD-Core Version:    0.6.2
 */