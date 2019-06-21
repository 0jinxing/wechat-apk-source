package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cvb extends com.tencent.mm.bt.a
{
  public String nQB;
  public String xra;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124377);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xra != null)
        paramArrayOfObject.e(1, this.xra);
      if (this.nQB != null)
        paramArrayOfObject.e(2, this.nQB);
      AppMethodBeat.o(124377);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xra == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.xra) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.nQB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.nQB);
      AppMethodBeat.o(124377);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124377);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cvb localcvb = (cvb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(124377);
          paramInt = -1;
          break;
        case 1:
          localcvb.xra = locala.BTU.readString();
          AppMethodBeat.o(124377);
          paramInt = i;
          break;
        case 2:
          localcvb.nQB = locala.BTU.readString();
          AppMethodBeat.o(124377);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(124377);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvb
 * JD-Core Version:    0.6.2
 */