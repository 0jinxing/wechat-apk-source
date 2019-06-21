package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class j extends com.tencent.mm.bt.a
{
  public LinkedList<String> jBx;
  public LinkedList<Long> jBy;

  public j()
  {
    AppMethodBeat.i(18055);
    this.jBx = new LinkedList();
    this.jBy = new LinkedList();
    AppMethodBeat.o(18055);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(18056);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 1, this.jBx);
      paramArrayOfObject.e(2, 3, this.jBy);
      AppMethodBeat.o(18056);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 1, this.jBx) + 0 + e.a.a.a.c(2, 3, this.jBy);
        AppMethodBeat.o(18056);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.jBx.clear();
        this.jBy.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(18056);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        j localj = (j)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18056);
          break;
        case 1:
          localj.jBx.add(locala.BTU.readString());
          AppMethodBeat.o(18056);
          paramInt = 0;
          break;
        case 2:
          localj.jBy.add(Long.valueOf(locala.BTU.ve()));
          AppMethodBeat.o(18056);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(18056);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.j
 * JD-Core Version:    0.6.2
 */