package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cdo extends com.tencent.mm.bt.a
{
  public int hzv;
  public int timestamp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(55724);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.timestamp);
      paramArrayOfObject.iz(2, this.hzv);
      AppMethodBeat.o(55724);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.timestamp) + 0 + e.a.a.b.b.a.bs(2, this.hzv);
        AppMethodBeat.o(55724);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55724);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cdo localcdo = (cdo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(55724);
          paramInt = -1;
          break;
        case 1:
          localcdo.timestamp = locala.BTU.vd();
          AppMethodBeat.o(55724);
          paramInt = 0;
          break;
        case 2:
          localcdo.hzv = locala.BTU.vd();
          AppMethodBeat.o(55724);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(55724);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdo
 * JD-Core Version:    0.6.2
 */