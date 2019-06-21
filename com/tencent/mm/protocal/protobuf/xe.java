package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class xe extends com.tencent.mm.bt.a
{
  public int wcX;
  public xf wcY;
  public int wcZ;
  public xf wda;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60034);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcY == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NightTime");
        AppMethodBeat.o(60034);
        throw paramArrayOfObject;
      }
      if (this.wda == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AllDayTime");
        AppMethodBeat.o(60034);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wcX);
      if (this.wcY != null)
      {
        paramArrayOfObject.iy(2, this.wcY.computeSize());
        this.wcY.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wcZ);
      if (this.wda != null)
      {
        paramArrayOfObject.iy(4, this.wda.computeSize());
        this.wda.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(60034);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wcX) + 0;
        paramInt = i;
        if (this.wcY != null)
          paramInt = i + e.a.a.a.ix(2, this.wcY.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(3, this.wcZ);
        paramInt = i;
        if (this.wda != null)
          paramInt = i + e.a.a.a.ix(4, this.wda.computeSize());
        AppMethodBeat.o(60034);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcY == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NightTime");
          AppMethodBeat.o(60034);
          throw paramArrayOfObject;
        }
        if (this.wda == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AllDayTime");
          AppMethodBeat.o(60034);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(60034);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xe localxe = (xe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60034);
          break;
        case 1:
          localxe.wcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60034);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxe.wcY = paramArrayOfObject;
          }
          AppMethodBeat.o(60034);
          paramInt = 0;
          break;
        case 3:
          localxe.wcZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60034);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxe.wda = paramArrayOfObject;
          }
          AppMethodBeat.o(60034);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(60034);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xe
 * JD-Core Version:    0.6.2
 */