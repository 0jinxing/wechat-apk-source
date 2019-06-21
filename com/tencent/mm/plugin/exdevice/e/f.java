package com.tencent.mm.plugin.exdevice.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class f extends i
{
  public b luV;
  public b luW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(19423);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.lvj != null)
      {
        paramArrayOfObject.iy(1, this.lvj.computeSize());
        this.lvj.writeFields(paramArrayOfObject);
      }
      if (this.luV != null)
        paramArrayOfObject.c(2, this.luV);
      if (this.luW != null)
        paramArrayOfObject.c(3, this.luW);
      AppMethodBeat.o(19423);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.lvj == null)
        break label463;
    label463: for (i = e.a.a.a.ix(1, this.lvj.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.luV != null)
        paramInt = i + e.a.a.b.b.a.b(2, this.luV);
      i = paramInt;
      if (this.luW != null)
        i = paramInt + e.a.a.b.b.a.b(3, this.luW);
      AppMethodBeat.o(19423);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = i.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = i.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(19423);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        f localf = (f)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(19423);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((d)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, i.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localf.lvj = ((d)localObject1);
          }
          AppMethodBeat.o(19423);
          paramInt = i;
          break;
        case 2:
          localf.luV = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(19423);
          paramInt = i;
          break;
        case 3:
          localf.luW = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(19423);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(19423);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.e.f
 * JD-Core Version:    0.6.2
 */