package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class axk extends com.tencent.mm.bt.a
{
  public int wBs;
  public String wBt;
  public int wkB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80637);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wBs);
      if (this.wBt != null)
        paramArrayOfObject.e(2, this.wBt);
      paramArrayOfObject.iz(3, this.wkB);
      AppMethodBeat.o(80637);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wBs) + 0;
        paramInt = i;
        if (this.wBt != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wBt);
        paramInt += e.a.a.b.b.a.bs(3, this.wkB);
        AppMethodBeat.o(80637);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80637);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        axk localaxk = (axk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80637);
          break;
        case 1:
          localaxk.wBs = locala.BTU.vd();
          AppMethodBeat.o(80637);
          paramInt = 0;
          break;
        case 2:
          localaxk.wBt = locala.BTU.readString();
          AppMethodBeat.o(80637);
          paramInt = 0;
          break;
        case 3:
          localaxk.wkB = locala.BTU.vd();
          AppMethodBeat.o(80637);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(80637);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axk
 * JD-Core Version:    0.6.2
 */