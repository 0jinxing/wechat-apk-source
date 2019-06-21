package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ph extends com.tencent.mm.bt.a
{
  public pg vWA;
  public pg vWB;
  public pg vWC;
  public pg vWD;
  public pg vWE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89051);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vWA != null)
      {
        paramArrayOfObject.iy(1, this.vWA.computeSize());
        this.vWA.writeFields(paramArrayOfObject);
      }
      if (this.vWB != null)
      {
        paramArrayOfObject.iy(2, this.vWB.computeSize());
        this.vWB.writeFields(paramArrayOfObject);
      }
      if (this.vWC != null)
      {
        paramArrayOfObject.iy(3, this.vWC.computeSize());
        this.vWC.writeFields(paramArrayOfObject);
      }
      if (this.vWD != null)
      {
        paramArrayOfObject.iy(4, this.vWD.computeSize());
        this.vWD.writeFields(paramArrayOfObject);
      }
      if (this.vWE != null)
      {
        paramArrayOfObject.iy(5, this.vWE.computeSize());
        this.vWE.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(89051);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vWA == null)
        break label958;
    label958: for (i = e.a.a.a.ix(1, this.vWA.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vWB != null)
        paramInt = i + e.a.a.a.ix(2, this.vWB.computeSize());
      i = paramInt;
      if (this.vWC != null)
        i = paramInt + e.a.a.a.ix(3, this.vWC.computeSize());
      paramInt = i;
      if (this.vWD != null)
        paramInt = i + e.a.a.a.ix(4, this.vWD.computeSize());
      i = paramInt;
      if (this.vWE != null)
        i = paramInt + e.a.a.a.ix(5, this.vWE.computeSize());
      AppMethodBeat.o(89051);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89051);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ph localph = (ph)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89051);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new pg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((pg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localph.vWA = ((pg)localObject1);
          }
          AppMethodBeat.o(89051);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new pg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((pg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localph.vWB = ((pg)localObject1);
          }
          AppMethodBeat.o(89051);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new pg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localph.vWC = paramArrayOfObject;
          }
          AppMethodBeat.o(89051);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new pg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((pg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localph.vWD = ((pg)localObject1);
          }
          AppMethodBeat.o(89051);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new pg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localph.vWE = paramArrayOfObject;
          }
          AppMethodBeat.o(89051);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89051);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ph
 * JD-Core Version:    0.6.2
 */