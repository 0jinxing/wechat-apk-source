package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class axj extends com.tencent.mm.bt.a
{
  public String wBq;
  public int wBr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28538);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wBq != null)
        paramArrayOfObject.e(1, this.wBq);
      paramArrayOfObject.iz(2, this.wBr);
      AppMethodBeat.o(28538);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wBq == null)
        break label282;
    label282: for (paramInt = e.a.a.b.b.a.f(1, this.wBq) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.wBr);
      AppMethodBeat.o(28538);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28538);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        axj localaxj = (axj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28538);
          paramInt = -1;
          break;
        case 1:
          localaxj.wBq = locala.BTU.readString();
          AppMethodBeat.o(28538);
          paramInt = i;
          break;
        case 2:
          localaxj.wBr = locala.BTU.vd();
          AppMethodBeat.o(28538);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28538);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axj
 * JD-Core Version:    0.6.2
 */