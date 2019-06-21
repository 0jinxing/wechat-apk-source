package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cmh extends com.tencent.mm.bt.a
{
  public String jBB;
  public String wcD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28693);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.wcD != null)
        paramArrayOfObject.e(2, this.wcD);
      AppMethodBeat.o(28693);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label298;
    label298: for (i = e.a.a.b.b.a.f(1, this.jBB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wcD != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wcD);
      AppMethodBeat.o(28693);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28693);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cmh localcmh = (cmh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28693);
          paramInt = -1;
          break;
        case 1:
          localcmh.jBB = locala.BTU.readString();
          AppMethodBeat.o(28693);
          paramInt = i;
          break;
        case 2:
          localcmh.wcD = locala.BTU.readString();
          AppMethodBeat.o(28693);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28693);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmh
 * JD-Core Version:    0.6.2
 */