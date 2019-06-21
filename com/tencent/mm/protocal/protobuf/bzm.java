package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bzm extends com.tencent.mm.bt.a
{
  public LinkedList<String> wYv;
  public LinkedList<String> wYw;
  public LinkedList<Integer> wYx;
  public LinkedList<Integer> wYy;

  public bzm()
  {
    AppMethodBeat.i(89146);
    this.wYv = new LinkedList();
    this.wYw = new LinkedList();
    this.wYx = new LinkedList();
    this.wYy = new LinkedList();
    AppMethodBeat.o(89146);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89147);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 1, this.wYv);
      paramArrayOfObject.e(2, 1, this.wYw);
      paramArrayOfObject.e(3, 2, this.wYx);
      paramArrayOfObject.e(4, 2, this.wYy);
      AppMethodBeat.o(89147);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 1, this.wYv) + 0 + e.a.a.a.c(2, 1, this.wYw) + e.a.a.a.c(3, 2, this.wYx) + e.a.a.a.c(4, 2, this.wYy);
        AppMethodBeat.o(89147);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wYv.clear();
        this.wYw.clear();
        this.wYx.clear();
        this.wYy.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89147);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzm localbzm = (bzm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89147);
          break;
        case 1:
          localbzm.wYv.add(locala.BTU.readString());
          AppMethodBeat.o(89147);
          paramInt = 0;
          break;
        case 2:
          localbzm.wYw.add(locala.BTU.readString());
          AppMethodBeat.o(89147);
          paramInt = 0;
          break;
        case 3:
          localbzm.wYx.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(89147);
          paramInt = 0;
          break;
        case 4:
          localbzm.wYy.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(89147);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(89147);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzm
 * JD-Core Version:    0.6.2
 */