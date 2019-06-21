package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cwc extends com.tencent.mm.bt.a
{
  public int xrX;
  public String xrY;
  public String xrZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(11825);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xrX);
      if (this.xrY != null)
        paramArrayOfObject.e(2, this.xrY);
      if (this.xrZ != null)
        paramArrayOfObject.e(3, this.xrZ);
      AppMethodBeat.o(11825);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xrX) + 0;
        paramInt = i;
        if (this.xrY != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xrY);
        i = paramInt;
        if (this.xrZ != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.xrZ);
        AppMethodBeat.o(11825);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11825);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cwc localcwc = (cwc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11825);
          break;
        case 1:
          localcwc.xrX = locala.BTU.vd();
          AppMethodBeat.o(11825);
          paramInt = 0;
          break;
        case 2:
          localcwc.xrY = locala.BTU.readString();
          AppMethodBeat.o(11825);
          paramInt = 0;
          break;
        case 3:
          localcwc.xrZ = locala.BTU.readString();
          AppMethodBeat.o(11825);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(11825);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwc
 * JD-Core Version:    0.6.2
 */