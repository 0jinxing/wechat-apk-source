package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bbg extends com.tencent.mm.bt.a
{
  public String clY;
  public LinkedList<String> wFX;

  public bbg()
  {
    AppMethodBeat.i(2544);
    this.wFX = new LinkedList();
    AppMethodBeat.o(2544);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(2545);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.clY != null)
        paramArrayOfObject.e(1, this.clY);
      paramArrayOfObject.e(2, 1, this.wFX);
      AppMethodBeat.o(2545);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.clY == null)
        break label298;
    label298: for (paramInt = e.a.a.b.b.a.f(1, this.clY) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 1, this.wFX);
      AppMethodBeat.o(2545);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wFX.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(2545);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bbg localbbg = (bbg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(2545);
          paramInt = -1;
          break;
        case 1:
          localbbg.clY = locala.BTU.readString();
          AppMethodBeat.o(2545);
          paramInt = i;
          break;
        case 2:
          localbbg.wFX.add(locala.BTU.readString());
          AppMethodBeat.o(2545);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(2545);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbg
 * JD-Core Version:    0.6.2
 */