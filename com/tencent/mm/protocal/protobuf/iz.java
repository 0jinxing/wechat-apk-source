package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class iz extends com.tencent.mm.bt.a
{
  public int vKR;
  public int vKS;
  public int vKT;
  public int vKd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28341);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vKd);
      paramArrayOfObject.iz(2, this.vKR);
      paramArrayOfObject.iz(3, this.vKS);
      paramArrayOfObject.iz(4, this.vKT);
      AppMethodBeat.o(28341);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vKd) + 0 + e.a.a.b.b.a.bs(2, this.vKR) + e.a.a.b.b.a.bs(3, this.vKS) + e.a.a.b.b.a.bs(4, this.vKT);
        AppMethodBeat.o(28341);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28341);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        iz localiz = (iz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28341);
          break;
        case 1:
          localiz.vKd = locala.BTU.vd();
          AppMethodBeat.o(28341);
          paramInt = 0;
          break;
        case 2:
          localiz.vKR = locala.BTU.vd();
          AppMethodBeat.o(28341);
          paramInt = 0;
          break;
        case 3:
          localiz.vKS = locala.BTU.vd();
          AppMethodBeat.o(28341);
          paramInt = 0;
          break;
        case 4:
          localiz.vKT = locala.BTU.vd();
          AppMethodBeat.o(28341);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28341);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.iz
 * JD-Core Version:    0.6.2
 */