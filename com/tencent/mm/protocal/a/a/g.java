package com.tencent.mm.protocal.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class g extends com.tencent.mm.bt.a
{
  public int vyT;
  public int vzj;
  public LinkedList<b> vzk;
  public com.tencent.mm.bt.b vzl;

  public g()
  {
    AppMethodBeat.i(72823);
    this.vzk = new LinkedList();
    AppMethodBeat.o(72823);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72824);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vyT);
      paramArrayOfObject.iz(2, this.vzj);
      paramArrayOfObject.e(3, 8, this.vzk);
      if (this.vzl != null)
        paramArrayOfObject.c(4, this.vzl);
      AppMethodBeat.o(72824);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.vyT) + 0 + e.a.a.b.b.a.bs(2, this.vzj) + e.a.a.a.c(3, 8, this.vzk);
        paramInt = i;
        if (this.vzl != null)
          paramInt = i + e.a.a.b.b.a.b(4, this.vzl);
        AppMethodBeat.o(72824);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vzk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72824);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        g localg = (g)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72824);
          break;
        case 1:
          localg.vyT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72824);
          paramInt = 0;
          break;
        case 2:
          localg.vzj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72824);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new b();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localg.vzk.add(paramArrayOfObject);
          }
          AppMethodBeat.o(72824);
          paramInt = 0;
          break;
        case 4:
          localg.vzl = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(72824);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72824);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a.g
 * JD-Core Version:    0.6.2
 */