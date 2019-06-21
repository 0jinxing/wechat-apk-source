package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class dq extends com.tencent.mm.bt.a
{
  public String mZL;
  public dr ndN;
  public ab ndO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111681);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ndN != null)
      {
        paramArrayOfObject.iy(1, this.ndN.computeSize());
        this.ndN.writeFields(paramArrayOfObject);
      }
      if (this.ndO != null)
      {
        paramArrayOfObject.iy(2, this.ndO.computeSize());
        this.ndO.writeFields(paramArrayOfObject);
      }
      if (this.mZL != null)
        paramArrayOfObject.e(3, this.mZL);
      AppMethodBeat.o(111681);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ndN == null)
        break label546;
    label546: for (i = e.a.a.a.ix(1, this.ndN.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ndO != null)
        paramInt = i + e.a.a.a.ix(2, this.ndO.computeSize());
      i = paramInt;
      if (this.mZL != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mZL);
      AppMethodBeat.o(111681);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111681);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        dq localdq = (dq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111681);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new dr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdq.ndN = paramArrayOfObject;
          }
          AppMethodBeat.o(111681);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ab();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ab)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdq.ndO = ((ab)localObject1);
          }
          AppMethodBeat.o(111681);
          paramInt = i;
          break;
        case 3:
          localdq.mZL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111681);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111681);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.dq
 * JD-Core Version:    0.6.2
 */