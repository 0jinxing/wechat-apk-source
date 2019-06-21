package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cof extends com.tencent.mm.bt.a
{
  public int fJT;
  public int xlD;
  public String xlH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28704);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xlD);
      paramArrayOfObject.iz(2, this.fJT);
      if (this.xlH != null)
        paramArrayOfObject.e(3, this.xlH);
      AppMethodBeat.o(28704);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xlD) + 0 + e.a.a.b.b.a.bs(2, this.fJT);
        paramInt = i;
        if (this.xlH != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.xlH);
        AppMethodBeat.o(28704);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28704);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cof localcof = (cof)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28704);
          break;
        case 1:
          localcof.xlD = locala.BTU.vd();
          AppMethodBeat.o(28704);
          paramInt = 0;
          break;
        case 2:
          localcof.fJT = locala.BTU.vd();
          AppMethodBeat.o(28704);
          paramInt = 0;
          break;
        case 3:
          localcof.xlH = locala.BTU.readString();
          AppMethodBeat.o(28704);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28704);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cof
 * JD-Core Version:    0.6.2
 */