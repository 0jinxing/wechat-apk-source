package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class g extends com.tencent.mm.bt.a
{
  public m tmC;
  public String tmE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56648);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.tmC != null)
      {
        paramArrayOfObject.iy(1, this.tmC.computeSize());
        this.tmC.writeFields(paramArrayOfObject);
      }
      if (this.tmE != null)
        paramArrayOfObject.e(2, this.tmE);
      AppMethodBeat.o(56648);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.tmC == null)
        break label390;
    label390: for (paramInt = e.a.a.a.ix(1, this.tmC.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.tmE != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.tmE);
      AppMethodBeat.o(56648);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56648);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        g localg = (g)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(56648);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new m();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localg.tmC = paramArrayOfObject;
          }
          AppMethodBeat.o(56648);
          paramInt = i;
          break;
        case 2:
          localg.tmE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56648);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(56648);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.g
 * JD-Core Version:    0.6.2
 */