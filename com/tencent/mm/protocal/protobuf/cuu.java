package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cuu extends com.tencent.mm.bt.a
{
  public int Ret;
  public int vHX;
  public long vIs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28762);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Ret);
      paramArrayOfObject.iz(2, this.vHX);
      paramArrayOfObject.ai(3, this.vIs);
      AppMethodBeat.o(28762);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.Ret) + 0 + e.a.a.b.b.a.bs(2, this.vHX) + e.a.a.b.b.a.o(3, this.vIs);
        AppMethodBeat.o(28762);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28762);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cuu localcuu = (cuu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28762);
          break;
        case 1:
          localcuu.Ret = locala.BTU.vd();
          AppMethodBeat.o(28762);
          paramInt = 0;
          break;
        case 2:
          localcuu.vHX = locala.BTU.vd();
          AppMethodBeat.o(28762);
          paramInt = 0;
          break;
        case 3:
          localcuu.vIs = locala.BTU.ve();
          AppMethodBeat.o(28762);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28762);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cuu
 * JD-Core Version:    0.6.2
 */