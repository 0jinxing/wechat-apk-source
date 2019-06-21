package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bld extends com.tencent.mm.bt.a
{
  public int wOd;
  public int wOe;
  public String wOf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94549);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wOd);
      paramArrayOfObject.iz(2, this.wOe);
      if (this.wOf != null)
        paramArrayOfObject.e(3, this.wOf);
      AppMethodBeat.o(94549);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wOd) + 0 + e.a.a.b.b.a.bs(2, this.wOe);
        paramInt = i;
        if (this.wOf != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.wOf);
        AppMethodBeat.o(94549);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94549);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bld localbld = (bld)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94549);
          break;
        case 1:
          localbld.wOd = locala.BTU.vd();
          AppMethodBeat.o(94549);
          paramInt = 0;
          break;
        case 2:
          localbld.wOe = locala.BTU.vd();
          AppMethodBeat.o(94549);
          paramInt = 0;
          break;
        case 3:
          localbld.wOf = locala.BTU.readString();
          AppMethodBeat.o(94549);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94549);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bld
 * JD-Core Version:    0.6.2
 */