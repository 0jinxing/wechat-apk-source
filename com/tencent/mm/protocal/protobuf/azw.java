package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class azw extends com.tencent.mm.bt.a
{
  public int Scene;
  public String vOy;
  public long wDE;
  public long wDF;
  public int wDG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124324);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Scene);
      if (this.vOy != null)
        paramArrayOfObject.e(2, this.vOy);
      paramArrayOfObject.ai(3, this.wDF);
      paramArrayOfObject.ai(4, this.wDE);
      paramArrayOfObject.iz(5, this.wDG);
      AppMethodBeat.o(124324);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.Scene) + 0;
        paramInt = i;
        if (this.vOy != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vOy);
        paramInt = paramInt + e.a.a.b.b.a.o(3, this.wDF) + e.a.a.b.b.a.o(4, this.wDE) + e.a.a.b.b.a.bs(5, this.wDG);
        AppMethodBeat.o(124324);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124324);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        azw localazw = (azw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124324);
          break;
        case 1:
          localazw.Scene = locala.BTU.vd();
          AppMethodBeat.o(124324);
          paramInt = 0;
          break;
        case 2:
          localazw.vOy = locala.BTU.readString();
          AppMethodBeat.o(124324);
          paramInt = 0;
          break;
        case 3:
          localazw.wDF = locala.BTU.ve();
          AppMethodBeat.o(124324);
          paramInt = 0;
          break;
        case 4:
          localazw.wDE = locala.BTU.ve();
          AppMethodBeat.o(124324);
          paramInt = 0;
          break;
        case 5:
          localazw.wDG = locala.BTU.vd();
          AppMethodBeat.o(124324);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124324);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azw
 * JD-Core Version:    0.6.2
 */