package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bbk extends com.tencent.mm.bt.a
{
  public boolean wFY;
  public String wFZ;
  public LinkedList<Integer> wGa;

  public bbk()
  {
    AppMethodBeat.i(56856);
    this.wGa = new LinkedList();
    AppMethodBeat.o(56856);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56857);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.wFY);
      if (this.wFZ != null)
        paramArrayOfObject.e(2, this.wFZ);
      paramArrayOfObject.e(3, 2, this.wGa);
      AppMethodBeat.o(56857);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 1 + 0;
        paramInt = i;
        if (this.wFZ != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wFZ);
        paramInt += e.a.a.a.c(3, 2, this.wGa);
        AppMethodBeat.o(56857);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wGa.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56857);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bbk localbbk = (bbk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56857);
          break;
        case 1:
          localbbk.wFY = locala.BTU.ehX();
          AppMethodBeat.o(56857);
          paramInt = 0;
          break;
        case 2:
          localbbk.wFZ = locala.BTU.readString();
          AppMethodBeat.o(56857);
          paramInt = 0;
          break;
        case 3:
          localbbk.wGa.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(56857);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56857);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbk
 * JD-Core Version:    0.6.2
 */