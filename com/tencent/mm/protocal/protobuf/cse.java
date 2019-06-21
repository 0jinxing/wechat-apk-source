package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cse extends com.tencent.mm.bt.a
{
  public SKBuiltinBuffer_t vEF;
  public String vLX;
  public SKBuiltinBuffer_t vMb;
  public String xpA;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58940);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vMb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KSid");
        AppMethodBeat.o(58940);
        throw paramArrayOfObject;
      }
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(58940);
        throw paramArrayOfObject;
      }
      if (this.xpA != null)
        paramArrayOfObject.e(1, this.xpA);
      if (this.vMb != null)
      {
        paramArrayOfObject.iy(2, this.vMb.computeSize());
        this.vMb.writeFields(paramArrayOfObject);
      }
      if (this.vLX != null)
        paramArrayOfObject.e(3, this.vLX);
      if (this.vEF != null)
      {
        paramArrayOfObject.iy(4, this.vEF.computeSize());
        this.vEF.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58940);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xpA == null)
        break label704;
    label704: for (i = e.a.a.b.b.a.f(1, this.xpA) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vMb != null)
        paramInt = i + e.a.a.a.ix(2, this.vMb.computeSize());
      i = paramInt;
      if (this.vLX != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vLX);
      paramInt = i;
      if (this.vEF != null)
        paramInt = i + e.a.a.a.ix(4, this.vEF.computeSize());
      AppMethodBeat.o(58940);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vMb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KSid");
          AppMethodBeat.o(58940);
          throw paramArrayOfObject;
        }
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(58940);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58940);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cse localcse = (cse)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58940);
          break;
        case 1:
          localcse.xpA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58940);
          paramInt = i;
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
            localcse.vMb = paramArrayOfObject;
          }
          AppMethodBeat.o(58940);
          paramInt = i;
          break;
        case 3:
          localcse.vLX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58940);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcse.vEF = paramArrayOfObject;
          }
          AppMethodBeat.o(58940);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58940);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cse
 * JD-Core Version:    0.6.2
 */