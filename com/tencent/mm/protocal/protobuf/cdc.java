package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cdc extends com.tencent.mm.bt.a
{
  public String kdi;
  public String xcM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89148);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xcM != null)
        paramArrayOfObject.e(1, this.xcM);
      if (this.kdi != null)
        paramArrayOfObject.e(2, this.kdi);
      AppMethodBeat.o(89148);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xcM == null)
        break label294;
    label294: for (paramInt = e.a.a.b.b.a.f(1, this.xcM) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kdi != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kdi);
      AppMethodBeat.o(89148);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89148);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cdc localcdc = (cdc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(89148);
          paramInt = -1;
          break;
        case 1:
          localcdc.xcM = locala.BTU.readString();
          AppMethodBeat.o(89148);
          paramInt = i;
          break;
        case 2:
          localcdc.kdi = locala.BTU.readString();
          AppMethodBeat.o(89148);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(89148);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdc
 * JD-Core Version:    0.6.2
 */