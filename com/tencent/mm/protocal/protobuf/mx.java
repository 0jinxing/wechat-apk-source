package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class mx extends com.tencent.mm.bt.a
{
  public int vRj;
  public LinkedList<Integer> vRk;

  public mx()
  {
    AppMethodBeat.i(58900);
    this.vRk = new LinkedList();
    AppMethodBeat.o(58900);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58901);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vRj);
      paramArrayOfObject.f(2, 2, this.vRk);
      AppMethodBeat.o(58901);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vRj) + 0 + e.a.a.a.d(2, 2, this.vRk);
        AppMethodBeat.o(58901);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vRk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58901);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        mx localmx = (mx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(58901);
          paramInt = -1;
          break;
        case 1:
          localmx.vRj = locala.BTU.vd();
          AppMethodBeat.o(58901);
          paramInt = 0;
          break;
        case 2:
          localmx.vRk = new e.a.a.a.a(locala.BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(58901);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(58901);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mx
 * JD-Core Version:    0.6.2
 */