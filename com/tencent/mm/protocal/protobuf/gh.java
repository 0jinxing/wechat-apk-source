package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class gh extends com.tencent.mm.bt.a
{
  public SKBuiltinBuffer_t vIq;
  public xu vIr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58890);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vIq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AesEncryptKey");
        AppMethodBeat.o(58890);
        throw paramArrayOfObject;
      }
      if (this.vIq != null)
      {
        paramArrayOfObject.iy(2, this.vIq.computeSize());
        this.vIq.writeFields(paramArrayOfObject);
      }
      if (this.vIr != null)
      {
        paramArrayOfObject.iy(3, this.vIr.computeSize());
        this.vIr.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58890);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vIq == null)
        break label531;
    label531: for (i = e.a.a.a.ix(2, this.vIq.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vIr != null)
        paramInt = i + e.a.a.a.ix(3, this.vIr.computeSize());
      AppMethodBeat.o(58890);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vIq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AesEncryptKey");
          AppMethodBeat.o(58890);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58890);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        gh localgh = (gh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58890);
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgh.vIq = paramArrayOfObject;
          }
          AppMethodBeat.o(58890);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgh.vIr = ((xu)localObject1);
          }
          AppMethodBeat.o(58890);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58890);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gh
 * JD-Core Version:    0.6.2
 */