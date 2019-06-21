package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bsy extends com.tencent.mm.bt.a
{
  public int wVd;
  public String wVe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80163);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wVe == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ResKey");
        AppMethodBeat.o(80163);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wVd);
      if (this.wVe != null)
        paramArrayOfObject.e(2, this.wVe);
      AppMethodBeat.o(80163);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wVd) + 0;
        paramInt = i;
        if (this.wVe != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wVe);
        AppMethodBeat.o(80163);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wVe == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ResKey");
          AppMethodBeat.o(80163);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80163);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bsy localbsy = (bsy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(80163);
          paramInt = -1;
          break;
        case 1:
          localbsy.wVd = locala.BTU.vd();
          AppMethodBeat.o(80163);
          paramInt = 0;
          break;
        case 2:
          localbsy.wVe = locala.BTU.readString();
          AppMethodBeat.o(80163);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(80163);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsy
 * JD-Core Version:    0.6.2
 */