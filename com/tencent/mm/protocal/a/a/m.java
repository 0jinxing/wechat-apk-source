package com.tencent.mm.protocal.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class m extends com.tencent.mm.bt.a
{
  public int vzw;
  public int vzx;
  public LinkedList<n> vzy;

  public m()
  {
    AppMethodBeat.i(72832);
    this.vzy = new LinkedList();
    AppMethodBeat.o(72832);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72833);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vzw);
      paramArrayOfObject.iz(2, this.vzx);
      paramArrayOfObject.e(3, 8, this.vzy);
      AppMethodBeat.o(72833);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vzw) + 0 + e.a.a.b.b.a.bs(2, this.vzx) + e.a.a.a.c(3, 8, this.vzy);
        AppMethodBeat.o(72833);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vzy.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72833);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        m localm = (m)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72833);
          break;
        case 1:
          localm.vzw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72833);
          paramInt = 0;
          break;
        case 2:
          localm.vzx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72833);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new n();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((n)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localm.vzy.add(localObject1);
          }
          AppMethodBeat.o(72833);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72833);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a.m
 * JD-Core Version:    0.6.2
 */