package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class cix extends com.tencent.mm.bt.a
{
  public int xhO;
  public int xhP;
  public String xhQ;
  public b xhR;
  public int xhS;
  public int xhT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10245);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xhO);
      paramArrayOfObject.iz(2, this.xhP);
      if (this.xhQ != null)
        paramArrayOfObject.e(3, this.xhQ);
      if (this.xhR != null)
        paramArrayOfObject.c(4, this.xhR);
      paramArrayOfObject.iz(5, this.xhS);
      paramArrayOfObject.iz(6, this.xhT);
      AppMethodBeat.o(10245);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xhO) + 0 + e.a.a.b.b.a.bs(2, this.xhP);
        paramInt = i;
        if (this.xhQ != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.xhQ);
        i = paramInt;
        if (this.xhR != null)
          i = paramInt + e.a.a.b.b.a.b(4, this.xhR);
        paramInt = i + e.a.a.b.b.a.bs(5, this.xhS) + e.a.a.b.b.a.bs(6, this.xhT);
        AppMethodBeat.o(10245);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10245);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cix localcix = (cix)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10245);
          break;
        case 1:
          localcix.xhO = locala.BTU.vd();
          AppMethodBeat.o(10245);
          paramInt = 0;
          break;
        case 2:
          localcix.xhP = locala.BTU.vd();
          AppMethodBeat.o(10245);
          paramInt = 0;
          break;
        case 3:
          localcix.xhQ = locala.BTU.readString();
          AppMethodBeat.o(10245);
          paramInt = 0;
          break;
        case 4:
          localcix.xhR = locala.BTU.emu();
          AppMethodBeat.o(10245);
          paramInt = 0;
          break;
        case 5:
          localcix.xhS = locala.BTU.vd();
          AppMethodBeat.o(10245);
          paramInt = 0;
          break;
        case 6:
          localcix.xhT = locala.BTU.vd();
          AppMethodBeat.o(10245);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(10245);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cix
 * JD-Core Version:    0.6.2
 */