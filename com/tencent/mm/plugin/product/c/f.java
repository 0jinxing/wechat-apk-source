package com.tencent.mm.plugin.product.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class f extends com.tencent.mm.bt.a
{
  public j phQ;
  public String phR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56629);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.phQ != null)
      {
        paramArrayOfObject.iy(1, this.phQ.computeSize());
        this.phQ.writeFields(paramArrayOfObject);
      }
      if (this.phR != null)
        paramArrayOfObject.e(2, this.phR);
      AppMethodBeat.o(56629);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.phQ == null)
        break label391;
    label391: for (paramInt = e.a.a.a.ix(1, this.phQ.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.phR != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.phR);
      AppMethodBeat.o(56629);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56629);
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
          AppMethodBeat.o(56629);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new j();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((j)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localf.phQ = ((j)localObject1);
          }
          AppMethodBeat.o(56629);
          paramInt = i;
          break;
        case 2:
          localf.phR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56629);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(56629);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.c.f
 * JD-Core Version:    0.6.2
 */