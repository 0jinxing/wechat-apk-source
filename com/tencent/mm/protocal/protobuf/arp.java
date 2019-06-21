package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class arp extends com.tencent.mm.bt.a
{
  public int vBA;
  public String vBB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89110);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vBA);
      if (this.vBB != null)
        paramArrayOfObject.e(2, this.vBB);
      AppMethodBeat.o(89110);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vBA) + 0;
        paramInt = i;
        if (this.vBB != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vBB);
        AppMethodBeat.o(89110);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89110);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        arp localarp = (arp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(89110);
          paramInt = -1;
          break;
        case 1:
          localarp.vBA = locala.BTU.vd();
          AppMethodBeat.o(89110);
          paramInt = 0;
          break;
        case 2:
          localarp.vBB = locala.BTU.readString();
          AppMethodBeat.o(89110);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(89110);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.arp
 * JD-Core Version:    0.6.2
 */