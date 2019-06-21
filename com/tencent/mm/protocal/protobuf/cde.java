package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cde extends com.tencent.mm.bt.a
{
  public String mVX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94629);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mVX != null)
        paramArrayOfObject.e(1, this.mVX);
      AppMethodBeat.o(94629);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mVX == null)
        break label227;
    label227: for (paramInt = e.a.a.b.b.a.f(1, this.mVX) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(94629);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94629);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cde localcde = (cde)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(94629);
          paramInt = -1;
          break;
        case 1:
          localcde.mVX = locala.BTU.readString();
          AppMethodBeat.o(94629);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(94629);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cde
 * JD-Core Version:    0.6.2
 */