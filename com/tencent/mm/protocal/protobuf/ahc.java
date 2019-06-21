package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ahc extends com.tencent.mm.bt.a
{
  public int vEI;
  public bts wnA;
  public int wnB;
  public int wnC;
  public int wnD = 1;
  public int wnE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5580);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wnA == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ChatroomId");
        AppMethodBeat.o(5580);
        throw paramArrayOfObject;
      }
      if (this.wnA != null)
      {
        paramArrayOfObject.iy(1, this.wnA.computeSize());
        this.wnA.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vEI);
      paramArrayOfObject.iz(3, this.wnB);
      paramArrayOfObject.iz(4, this.wnC);
      paramArrayOfObject.iz(5, this.wnD);
      paramArrayOfObject.iz(6, this.wnE);
      AppMethodBeat.o(5580);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wnA == null)
        break label615;
    label615: for (paramInt = e.a.a.a.ix(1, this.wnA.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vEI) + e.a.a.b.b.a.bs(3, this.wnB) + e.a.a.b.b.a.bs(4, this.wnC) + e.a.a.b.b.a.bs(5, this.wnD) + e.a.a.b.b.a.bs(6, this.wnE);
      AppMethodBeat.o(5580);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wnA == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ChatroomId");
          AppMethodBeat.o(5580);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5580);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ahc localahc = (ahc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5580);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahc.wnA = ((bts)localObject1);
          }
          AppMethodBeat.o(5580);
          paramInt = i;
          break;
        case 2:
          localahc.vEI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5580);
          paramInt = i;
          break;
        case 3:
          localahc.wnB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5580);
          paramInt = i;
          break;
        case 4:
          localahc.wnC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5580);
          paramInt = i;
          break;
        case 5:
          localahc.wnD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5580);
          paramInt = i;
          break;
        case 6:
          localahc.wnE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5580);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5580);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ahc
 * JD-Core Version:    0.6.2
 */