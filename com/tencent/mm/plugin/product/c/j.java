package com.tencent.mm.plugin.product.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class j extends com.tencent.mm.bt.a
{
  public int bJt;
  public String iqz;
  public g phT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56633);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.bJt);
      if (this.phT != null)
      {
        paramArrayOfObject.iy(2, this.phT.computeSize());
        this.phT.writeFields(paramArrayOfObject);
      }
      if (this.iqz != null)
        paramArrayOfObject.e(3, this.iqz);
      AppMethodBeat.o(56633);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.bJt) + 0;
        paramInt = i;
        if (this.phT != null)
          paramInt = i + e.a.a.a.ix(2, this.phT.computeSize());
        i = paramInt;
        if (this.iqz != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.iqz);
        AppMethodBeat.o(56633);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56633);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        j localj = (j)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56633);
          break;
        case 1:
          localj.bJt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56633);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new g();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.phT = paramArrayOfObject;
          }
          AppMethodBeat.o(56633);
          paramInt = 0;
          break;
        case 3:
          localj.iqz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56633);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56633);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.c.j
 * JD-Core Version:    0.6.2
 */