package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cy extends com.tencent.mm.bt.a
{
  public cai vEX;
  public bts vEY;
  public int vEZ;
  public brf vFa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94503);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SnsADObject");
        AppMethodBeat.o(94503);
        throw paramArrayOfObject;
      }
      if (this.vEX != null)
      {
        paramArrayOfObject.iy(1, this.vEX.computeSize());
        this.vEX.writeFields(paramArrayOfObject);
      }
      if (this.vEY != null)
      {
        paramArrayOfObject.iy(2, this.vEY.computeSize());
        this.vEY.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.vEZ);
      if (this.vFa != null)
      {
        paramArrayOfObject.iy(4, this.vFa.computeSize());
        this.vFa.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94503);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vEX == null)
        break label733;
    label733: for (paramInt = e.a.a.a.ix(1, this.vEX.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vEY != null)
        i = paramInt + e.a.a.a.ix(2, this.vEY.computeSize());
      i += e.a.a.b.b.a.bs(3, this.vEZ);
      paramInt = i;
      if (this.vFa != null)
        paramInt = i + e.a.a.a.ix(4, this.vFa.computeSize());
      AppMethodBeat.o(94503);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SnsADObject");
          AppMethodBeat.o(94503);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94503);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cy localcy = (cy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94503);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cai();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcy.vEX = paramArrayOfObject;
          }
          AppMethodBeat.o(94503);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcy.vEY = ((bts)localObject1);
          }
          AppMethodBeat.o(94503);
          paramInt = i;
          break;
        case 3:
          localcy.vEZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94503);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new brf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcy.vFa = paramArrayOfObject;
          }
          AppMethodBeat.o(94503);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94503);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cy
 * JD-Core Version:    0.6.2
 */