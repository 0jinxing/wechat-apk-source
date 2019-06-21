package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class abj extends com.tencent.mm.bt.a
{
  public int nbk;
  public String wdK;
  public abd wiA;
  public LinkedList<abd> wiz;

  public abj()
  {
    AppMethodBeat.i(51409);
    this.wiz = new LinkedList();
    AppMethodBeat.o(51409);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51410);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.nbk);
      if (this.wdK != null)
        paramArrayOfObject.e(2, this.wdK);
      paramArrayOfObject.e(3, 8, this.wiz);
      if (this.wiA != null)
      {
        paramArrayOfObject.iy(4, this.wiA.computeSize());
        this.wiA.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(51410);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.nbk) + 0;
        paramInt = i;
        if (this.wdK != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wdK);
        i = paramInt + e.a.a.a.c(3, 8, this.wiz);
        paramInt = i;
        if (this.wiA != null)
          paramInt = i + e.a.a.a.ix(4, this.wiA.computeSize());
        AppMethodBeat.o(51410);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wiz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51410);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        abj localabj = (abj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51410);
          break;
        case 1:
          localabj.nbk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51410);
          paramInt = 0;
          break;
        case 2:
          localabj.wdK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51410);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((abd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabj.wiz.add(localObject1);
          }
          AppMethodBeat.o(51410);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((abd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localabj.wiA = ((abd)localObject1);
          }
          AppMethodBeat.o(51410);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(51410);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abj
 * JD-Core Version:    0.6.2
 */