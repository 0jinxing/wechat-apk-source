package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class ll extends com.tencent.mm.bt.a
{
  public int port;
  public int type;
  public b vOX;
  public b vOY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58894);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      paramArrayOfObject.iz(2, this.port);
      if (this.vOX != null)
        paramArrayOfObject.c(3, this.vOX);
      if (this.vOY != null)
        paramArrayOfObject.c(4, this.vOY);
      AppMethodBeat.o(58894);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.type) + 0 + e.a.a.b.b.a.bs(2, this.port);
        paramInt = i;
        if (this.vOX != null)
          paramInt = i + e.a.a.b.b.a.b(3, this.vOX);
        i = paramInt;
        if (this.vOY != null)
          i = paramInt + e.a.a.b.b.a.b(4, this.vOY);
        AppMethodBeat.o(58894);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58894);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ll localll = (ll)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58894);
          break;
        case 1:
          localll.type = locala.BTU.vd();
          AppMethodBeat.o(58894);
          paramInt = 0;
          break;
        case 2:
          localll.port = locala.BTU.vd();
          AppMethodBeat.o(58894);
          paramInt = 0;
          break;
        case 3:
          localll.vOX = locala.BTU.emu();
          AppMethodBeat.o(58894);
          paramInt = 0;
          break;
        case 4:
          localll.vOY = locala.BTU.emu();
          AppMethodBeat.o(58894);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(58894);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ll
 * JD-Core Version:    0.6.2
 */