package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bas extends com.tencent.mm.bt.a
{
  public int nda;
  public int vFH;
  public int wED;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94538);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vFH);
      paramArrayOfObject.iz(2, this.nda);
      paramArrayOfObject.iz(3, this.wED);
      AppMethodBeat.o(94538);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vFH) + 0 + e.a.a.b.b.a.bs(2, this.nda) + e.a.a.b.b.a.bs(3, this.wED);
        AppMethodBeat.o(94538);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94538);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bas localbas = (bas)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94538);
          break;
        case 1:
          localbas.vFH = locala.BTU.vd();
          AppMethodBeat.o(94538);
          paramInt = 0;
          break;
        case 2:
          localbas.nda = locala.BTU.vd();
          AppMethodBeat.o(94538);
          paramInt = 0;
          break;
        case 3:
          localbas.wED = locala.BTU.vd();
          AppMethodBeat.o(94538);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94538);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bas
 * JD-Core Version:    0.6.2
 */