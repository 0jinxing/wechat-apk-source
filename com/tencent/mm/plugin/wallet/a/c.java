package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class c extends com.tencent.mm.bt.a
{
  public String pbo;
  public LinkedList<d> tmL;

  public c()
  {
    AppMethodBeat.i(56643);
    this.tmL = new LinkedList();
    AppMethodBeat.o(56643);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56644);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pbo != null)
        paramArrayOfObject.e(1, this.pbo);
      paramArrayOfObject.e(2, 8, this.tmL);
      AppMethodBeat.o(56644);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pbo == null)
        break label375;
    label375: for (paramInt = e.a.a.b.b.a.f(1, this.pbo) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 8, this.tmL);
      AppMethodBeat.o(56644);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.tmL.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56644);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        c localc = (c)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(56644);
          paramInt = -1;
          break;
        case 1:
          localc.pbo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56644);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((d)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.tmL.add(localObject1);
          }
          AppMethodBeat.o(56644);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(56644);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.c
 * JD-Core Version:    0.6.2
 */