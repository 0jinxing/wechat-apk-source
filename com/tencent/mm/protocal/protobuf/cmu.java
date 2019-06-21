package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cmu extends com.tencent.mm.bt.a
{
  public int state;
  public String wzd;
  public int xkt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10249);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wzd != null)
        paramArrayOfObject.e(1, this.wzd);
      paramArrayOfObject.iz(2, this.state);
      paramArrayOfObject.iz(3, this.xkt);
      AppMethodBeat.o(10249);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wzd == null)
        break label330;
    label330: for (paramInt = e.a.a.b.b.a.f(1, this.wzd) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.state) + e.a.a.b.b.a.bs(3, this.xkt);
      AppMethodBeat.o(10249);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10249);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cmu localcmu = (cmu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10249);
          break;
        case 1:
          localcmu.wzd = locala.BTU.readString();
          AppMethodBeat.o(10249);
          paramInt = i;
          break;
        case 2:
          localcmu.state = locala.BTU.vd();
          AppMethodBeat.o(10249);
          paramInt = i;
          break;
        case 3:
          localcmu.xkt = locala.BTU.vd();
          AppMethodBeat.o(10249);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10249);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmu
 * JD-Core Version:    0.6.2
 */