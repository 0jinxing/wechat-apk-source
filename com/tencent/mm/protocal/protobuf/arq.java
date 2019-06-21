package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class arq extends com.tencent.mm.bt.a
{
  public String wvD;
  public int wvE;
  public int wvF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(60037);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wvD != null)
        paramArrayOfObject.e(1, this.wvD);
      paramArrayOfObject.iz(2, this.wvE);
      paramArrayOfObject.iz(3, this.wvF);
      AppMethodBeat.o(60037);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wvD == null)
        break label321;
    label321: for (paramInt = e.a.a.b.b.a.f(1, this.wvD) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wvE) + e.a.a.b.b.a.bs(3, this.wvF);
      AppMethodBeat.o(60037);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60037);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        arq localarq = (arq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60037);
          break;
        case 1:
          localarq.wvD = locala.BTU.readString();
          AppMethodBeat.o(60037);
          paramInt = i;
          break;
        case 2:
          localarq.wvE = locala.BTU.vd();
          AppMethodBeat.o(60037);
          paramInt = i;
          break;
        case 3:
          localarq.wvF = locala.BTU.vd();
          AppMethodBeat.o(60037);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(60037);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.arq
 * JD-Core Version:    0.6.2
 */