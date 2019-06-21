package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class auk extends com.tencent.mm.bt.a
{
  public SKBuiltinBuffer_t vEF;
  public bts wyu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80107);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(80107);
        throw paramArrayOfObject;
      }
      if (this.wyu == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Username");
        AppMethodBeat.o(80107);
        throw paramArrayOfObject;
      }
      if (this.vEF != null)
      {
        paramArrayOfObject.iy(1, this.vEF.computeSize());
        this.vEF.writeFields(paramArrayOfObject);
      }
      if (this.wyu != null)
      {
        paramArrayOfObject.iy(2, this.wyu.computeSize());
        this.wyu.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(80107);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vEF == null)
        break label578;
    label578: for (i = e.a.a.a.ix(1, this.vEF.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wyu != null)
        paramInt = i + e.a.a.a.ix(2, this.wyu.computeSize());
      AppMethodBeat.o(80107);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(80107);
          throw paramArrayOfObject;
        }
        if (this.wyu == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Username");
          AppMethodBeat.o(80107);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80107);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        auk localauk = (auk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(80107);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localauk.vEF = paramArrayOfObject;
          }
          AppMethodBeat.o(80107);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localauk.wyu = paramArrayOfObject;
          }
          AppMethodBeat.o(80107);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80107);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.auk
 * JD-Core Version:    0.6.2
 */