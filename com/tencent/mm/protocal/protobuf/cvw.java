package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cvw extends com.tencent.mm.bt.a
{
  public String cvZ;
  public String url;
  public int vOO;
  public int xrP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96317);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xrP);
      paramArrayOfObject.iz(2, this.vOO);
      if (this.url != null)
        paramArrayOfObject.e(3, this.url);
      if (this.cvZ != null)
        paramArrayOfObject.e(4, this.cvZ);
      AppMethodBeat.o(96317);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xrP) + 0 + e.a.a.b.b.a.bs(2, this.vOO);
        paramInt = i;
        if (this.url != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.url);
        i = paramInt;
        if (this.cvZ != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.cvZ);
        AppMethodBeat.o(96317);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96317);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cvw localcvw = (cvw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96317);
          break;
        case 1:
          localcvw.xrP = locala.BTU.vd();
          AppMethodBeat.o(96317);
          paramInt = 0;
          break;
        case 2:
          localcvw.vOO = locala.BTU.vd();
          AppMethodBeat.o(96317);
          paramInt = 0;
          break;
        case 3:
          localcvw.url = locala.BTU.readString();
          AppMethodBeat.o(96317);
          paramInt = 0;
          break;
        case 4:
          localcvw.cvZ = locala.BTU.readString();
          AppMethodBeat.o(96317);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96317);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvw
 * JD-Core Version:    0.6.2
 */