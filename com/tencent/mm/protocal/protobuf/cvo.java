package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cvo extends com.tencent.mm.bt.a
{
  public String xrA;
  public boolean xrB;
  public int xrC;
  public int xrD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(63695);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xrA != null)
        paramArrayOfObject.e(1, this.xrA);
      paramArrayOfObject.aO(2, this.xrB);
      paramArrayOfObject.iz(3, this.xrC);
      paramArrayOfObject.iz(4, this.xrD);
      AppMethodBeat.o(63695);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xrA == null)
        break label364;
    label364: for (paramInt = e.a.a.b.b.a.f(1, this.xrA) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + (e.a.a.b.b.a.fv(2) + 1) + e.a.a.b.b.a.bs(3, this.xrC) + e.a.a.b.b.a.bs(4, this.xrD);
      AppMethodBeat.o(63695);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(63695);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cvo localcvo = (cvo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(63695);
          break;
        case 1:
          localcvo.xrA = locala.BTU.readString();
          AppMethodBeat.o(63695);
          paramInt = i;
          break;
        case 2:
          localcvo.xrB = locala.BTU.ehX();
          AppMethodBeat.o(63695);
          paramInt = i;
          break;
        case 3:
          localcvo.xrC = locala.BTU.vd();
          AppMethodBeat.o(63695);
          paramInt = i;
          break;
        case 4:
          localcvo.xrD = locala.BTU.vd();
          AppMethodBeat.o(63695);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(63695);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvo
 * JD-Core Version:    0.6.2
 */