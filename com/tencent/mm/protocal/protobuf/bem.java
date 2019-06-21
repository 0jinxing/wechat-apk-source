package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bem extends com.tencent.mm.bt.a
{
  public int wIA;
  public long wIB;
  public long wIC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124332);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wIA);
      paramArrayOfObject.ai(2, this.wIB);
      paramArrayOfObject.ai(3, this.wIC);
      AppMethodBeat.o(124332);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wIA) + 0 + e.a.a.b.b.a.o(2, this.wIB) + e.a.a.b.b.a.o(3, this.wIC);
        AppMethodBeat.o(124332);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124332);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bem localbem = (bem)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124332);
          break;
        case 1:
          localbem.wIA = locala.BTU.vd();
          AppMethodBeat.o(124332);
          paramInt = 0;
          break;
        case 2:
          localbem.wIB = locala.BTU.ve();
          AppMethodBeat.o(124332);
          paramInt = 0;
          break;
        case 3:
          localbem.wIC = locala.BTU.ve();
          AppMethodBeat.o(124332);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124332);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bem
 * JD-Core Version:    0.6.2
 */