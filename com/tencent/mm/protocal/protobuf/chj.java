package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class chj extends com.tencent.mm.bt.a
{
  public String wld;
  public boolean xgg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14758);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wld != null)
        paramArrayOfObject.e(1, this.wld);
      paramArrayOfObject.aO(2, this.xgg);
      AppMethodBeat.o(14758);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wld == null)
        break label282;
    label282: for (paramInt = e.a.a.b.b.a.f(1, this.wld) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.fv(2) + 1;
      AppMethodBeat.o(14758);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14758);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chj localchj = (chj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(14758);
          paramInt = -1;
          break;
        case 1:
          localchj.wld = locala.BTU.readString();
          AppMethodBeat.o(14758);
          paramInt = i;
          break;
        case 2:
          localchj.xgg = locala.BTU.ehX();
          AppMethodBeat.o(14758);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(14758);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chj
 * JD-Core Version:    0.6.2
 */