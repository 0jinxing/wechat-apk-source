package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class sm extends com.tencent.mm.bt.a
{
  public String csB;
  public long jVD;
  public int jVE;
  public String path;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(11736);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.jVD);
      paramArrayOfObject.iz(2, this.jVE);
      if (this.csB != null)
        paramArrayOfObject.e(3, this.csB);
      if (this.path != null)
        paramArrayOfObject.e(4, this.path);
      AppMethodBeat.o(11736);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.jVD) + 0 + e.a.a.b.b.a.bs(2, this.jVE);
        paramInt = i;
        if (this.csB != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.csB);
        i = paramInt;
        if (this.path != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.path);
        AppMethodBeat.o(11736);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11736);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        sm localsm = (sm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11736);
          break;
        case 1:
          localsm.jVD = locala.BTU.ve();
          AppMethodBeat.o(11736);
          paramInt = 0;
          break;
        case 2:
          localsm.jVE = locala.BTU.vd();
          AppMethodBeat.o(11736);
          paramInt = 0;
          break;
        case 3:
          localsm.csB = locala.BTU.readString();
          AppMethodBeat.o(11736);
          paramInt = 0;
          break;
        case 4:
          localsm.path = locala.BTU.readString();
          AppMethodBeat.o(11736);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(11736);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.sm
 * JD-Core Version:    0.6.2
 */