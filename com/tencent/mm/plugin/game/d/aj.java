package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aj extends com.tencent.mm.bt.a
{
  public cb naR;
  public cb naS;
  public cb naT;
  public cz naU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111576);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.naR != null)
      {
        paramArrayOfObject.iy(1, this.naR.computeSize());
        this.naR.writeFields(paramArrayOfObject);
      }
      if (this.naS != null)
      {
        paramArrayOfObject.iy(2, this.naS.computeSize());
        this.naS.writeFields(paramArrayOfObject);
      }
      if (this.naT != null)
      {
        paramArrayOfObject.iy(3, this.naT.computeSize());
        this.naT.writeFields(paramArrayOfObject);
      }
      if (this.naU != null)
      {
        paramArrayOfObject.iy(4, this.naU.computeSize());
        this.naU.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(111576);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.naR == null)
        break label797;
    label797: for (paramInt = e.a.a.a.ix(1, this.naR.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.naS != null)
        i = paramInt + e.a.a.a.ix(2, this.naS.computeSize());
      paramInt = i;
      if (this.naT != null)
        paramInt = i + e.a.a.a.ix(3, this.naT.computeSize());
      i = paramInt;
      if (this.naU != null)
        i = paramInt + e.a.a.a.ix(4, this.naU.computeSize());
      AppMethodBeat.o(111576);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111576);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aj localaj = (aj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111576);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaj.naR = paramArrayOfObject;
          }
          AppMethodBeat.o(111576);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaj.naS = paramArrayOfObject;
          }
          AppMethodBeat.o(111576);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cb)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaj.naT = ((cb)localObject1);
          }
          AppMethodBeat.o(111576);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaj.naU = paramArrayOfObject;
          }
          AppMethodBeat.o(111576);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111576);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.aj
 * JD-Core Version:    0.6.2
 */