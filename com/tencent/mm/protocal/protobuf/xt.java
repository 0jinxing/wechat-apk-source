package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class xt extends com.tencent.mm.bt.a
{
  public boolean wdu;
  public boolean wdv;
  public String wdw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89065);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.wdu);
      paramArrayOfObject.aO(2, this.wdv);
      if (this.wdw != null)
        paramArrayOfObject.e(3, this.wdw);
      AppMethodBeat.o(89065);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 1 + 0 + (e.a.a.b.b.a.fv(2) + 1);
        paramInt = i;
        if (this.wdw != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.wdw);
        AppMethodBeat.o(89065);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89065);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        xt localxt = (xt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89065);
          break;
        case 1:
          localxt.wdu = locala.BTU.ehX();
          AppMethodBeat.o(89065);
          paramInt = 0;
          break;
        case 2:
          localxt.wdv = locala.BTU.ehX();
          AppMethodBeat.o(89065);
          paramInt = 0;
          break;
        case 3:
          localxt.wdw = locala.BTU.readString();
          AppMethodBeat.o(89065);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(89065);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xt
 * JD-Core Version:    0.6.2
 */