package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bl extends com.tencent.mm.bt.a
{
  public long cmn;
  public long cvx;
  public long hzT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60210);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.cvx);
      paramArrayOfObject.ai(2, this.hzT);
      paramArrayOfObject.ai(3, this.cmn);
      AppMethodBeat.o(60210);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.cvx) + 0 + e.a.a.b.b.a.o(2, this.hzT) + e.a.a.b.b.a.o(3, this.cmn);
        AppMethodBeat.o(60210);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60210);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bl localbl = (bl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60210);
          break;
        case 1:
          localbl.cvx = locala.BTU.ve();
          AppMethodBeat.o(60210);
          paramInt = 0;
          break;
        case 2:
          localbl.hzT = locala.BTU.ve();
          AppMethodBeat.o(60210);
          paramInt = 0;
          break;
        case 3:
          localbl.cmn = locala.BTU.ve();
          AppMethodBeat.o(60210);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(60210);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bl
 * JD-Core Version:    0.6.2
 */