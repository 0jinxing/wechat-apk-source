package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class i extends com.tencent.mm.bt.a
{
  public LinkedList<j> tni;
  public b tnj;

  public i()
  {
    AppMethodBeat.i(56651);
    this.tni = new LinkedList();
    AppMethodBeat.o(56651);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56652);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.tni);
      if (this.tnj != null)
        paramArrayOfObject.c(2, this.tnj);
      AppMethodBeat.o(56652);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 8, this.tni) + 0;
        paramInt = i;
        if (this.tnj != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.tnj);
        AppMethodBeat.o(56652);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.tni.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56652);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        i locali = (i)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(56652);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new j();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locali.tni.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56652);
          paramInt = 0;
          break;
        case 2:
          locali.tnj = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56652);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(56652);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.i
 * JD-Core Version:    0.6.2
 */