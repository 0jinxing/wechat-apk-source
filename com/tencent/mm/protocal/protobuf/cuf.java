package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cuf extends com.tencent.mm.bt.a
{
  public LinkedList<Integer> xqG;
  public boolean xqH;

  public cuf()
  {
    AppMethodBeat.i(28744);
    this.xqG = new LinkedList();
    AppMethodBeat.o(28744);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28745);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 2, this.xqG);
      paramArrayOfObject.aO(2, this.xqH);
      AppMethodBeat.o(28745);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 2, this.xqG) + 0 + (e.a.a.b.b.a.fv(2) + 1);
        AppMethodBeat.o(28745);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xqG.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28745);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cuf localcuf = (cuf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28745);
          paramInt = -1;
          break;
        case 1:
          localcuf.xqG.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(28745);
          paramInt = 0;
          break;
        case 2:
          localcuf.xqH = locala.BTU.ehX();
          AppMethodBeat.o(28745);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28745);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cuf
 * JD-Core Version:    0.6.2
 */