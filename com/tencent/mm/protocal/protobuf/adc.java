package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class adc extends com.tencent.mm.bt.a
{
  public acv wkV;
  public LinkedList<String> wkW;

  public adc()
  {
    AppMethodBeat.i(112432);
    this.wkW = new LinkedList();
    AppMethodBeat.o(112432);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(112433);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wkV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: GameItem");
        AppMethodBeat.o(112433);
        throw paramArrayOfObject;
      }
      if (this.wkV != null)
      {
        paramArrayOfObject.iy(1, this.wkV.computeSize());
        this.wkV.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 1, this.wkW);
      AppMethodBeat.o(112433);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wkV == null)
        break label435;
    label435: for (paramInt = e.a.a.a.ix(1, this.wkV.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 1, this.wkW);
      AppMethodBeat.o(112433);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wkW.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wkV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: GameItem");
          AppMethodBeat.o(112433);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(112433);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        adc localadc = (adc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(112433);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new acv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((acv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadc.wkV = ((acv)localObject1);
          }
          AppMethodBeat.o(112433);
          paramInt = i;
          break;
        case 2:
          localadc.wkW.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(112433);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(112433);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.adc
 * JD-Core Version:    0.6.2
 */