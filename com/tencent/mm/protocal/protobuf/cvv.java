package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cvv extends com.tencent.mm.bt.a
{
  public String csB;
  public int vOP;
  public String xrN;
  public String xrO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10250);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      paramArrayOfObject.iz(2, this.vOP);
      if (this.xrN != null)
        paramArrayOfObject.e(3, this.xrN);
      if (this.xrO != null)
        paramArrayOfObject.e(4, this.xrO);
      AppMethodBeat.o(10250);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label414;
    label414: for (paramInt = e.a.a.b.b.a.f(1, this.csB) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vOP);
      paramInt = i;
      if (this.xrN != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xrN);
      i = paramInt;
      if (this.xrO != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xrO);
      AppMethodBeat.o(10250);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10250);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cvv localcvv = (cvv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10250);
          break;
        case 1:
          localcvv.csB = locala.BTU.readString();
          AppMethodBeat.o(10250);
          paramInt = i;
          break;
        case 2:
          localcvv.vOP = locala.BTU.vd();
          AppMethodBeat.o(10250);
          paramInt = i;
          break;
        case 3:
          localcvv.xrN = locala.BTU.readString();
          AppMethodBeat.o(10250);
          paramInt = i;
          break;
        case 4:
          localcvv.xrO = locala.BTU.readString();
          AppMethodBeat.o(10250);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10250);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvv
 * JD-Core Version:    0.6.2
 */