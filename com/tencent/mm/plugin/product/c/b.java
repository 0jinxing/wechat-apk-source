package com.tencent.mm.plugin.product.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class b extends com.tencent.mm.bt.a
{
  public String name;
  public LinkedList<i> phB;

  public b()
  {
    AppMethodBeat.i(56622);
    this.phB = new LinkedList();
    AppMethodBeat.o(56622);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56623);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.name != null)
        paramArrayOfObject.e(1, this.name);
      paramArrayOfObject.e(2, 8, this.phB);
      AppMethodBeat.o(56623);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.name == null)
        break label374;
    label374: for (paramInt = e.a.a.b.b.a.f(1, this.name) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 8, this.phB);
      AppMethodBeat.o(56623);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.phB.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56623);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(56623);
          paramInt = -1;
          break;
        case 1:
          localb.name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56623);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new i();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localb.phB.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56623);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(56623);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.c.b
 * JD-Core Version:    0.6.2
 */