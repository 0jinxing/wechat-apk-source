package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ccp extends com.tencent.mm.bt.a
{
  public int wBs;
  public int wcL;
  public int xbW;
  public int xbX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94627);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wcL);
      paramArrayOfObject.iz(2, this.wBs);
      paramArrayOfObject.iz(3, this.xbW);
      paramArrayOfObject.iz(4, this.xbX);
      AppMethodBeat.o(94627);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wcL) + 0 + e.a.a.b.b.a.bs(2, this.wBs) + e.a.a.b.b.a.bs(3, this.xbW) + e.a.a.b.b.a.bs(4, this.xbX);
        AppMethodBeat.o(94627);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94627);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ccp localccp = (ccp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94627);
          break;
        case 1:
          localccp.wcL = locala.BTU.vd();
          AppMethodBeat.o(94627);
          paramInt = 0;
          break;
        case 2:
          localccp.wBs = locala.BTU.vd();
          AppMethodBeat.o(94627);
          paramInt = 0;
          break;
        case 3:
          localccp.xbW = locala.BTU.vd();
          AppMethodBeat.o(94627);
          paramInt = 0;
          break;
        case 4:
          localccp.xbX = locala.BTU.vd();
          AppMethodBeat.o(94627);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94627);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccp
 * JD-Core Version:    0.6.2
 */