package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class cwz extends com.tencent.mm.bt.a
{
  public b vMS;
  public String xfb;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96337);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xfb != null)
        paramArrayOfObject.e(1, this.xfb);
      if (this.vMS != null)
        paramArrayOfObject.c(2, this.vMS);
      AppMethodBeat.o(96337);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xfb == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.xfb) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vMS != null)
        paramInt = i + e.a.a.b.b.a.b(2, this.vMS);
      AppMethodBeat.o(96337);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96337);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cwz localcwz = (cwz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(96337);
          paramInt = -1;
          break;
        case 1:
          localcwz.xfb = locala.BTU.readString();
          AppMethodBeat.o(96337);
          paramInt = i;
          break;
        case 2:
          localcwz.vMS = locala.BTU.emu();
          AppMethodBeat.o(96337);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(96337);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwz
 * JD-Core Version:    0.6.2
 */