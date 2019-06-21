package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ast extends btd
{
  public SKBuiltinBuffer_t vHG;
  public SKBuiltinBuffer_t wwA;
  public int wwB;
  public int wwC;
  public int wwD;
  public SKBuiltinBuffer_t wwz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28519);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28519);
        throw paramArrayOfObject;
      }
      if (this.vHG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SessionKey");
        AppMethodBeat.o(28519);
        throw paramArrayOfObject;
      }
      if (this.wwz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SessionBuffer");
        AppMethodBeat.o(28519);
        throw paramArrayOfObject;
      }
      if (this.wwA == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KeyBuffer");
        AppMethodBeat.o(28519);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vHG != null)
      {
        paramArrayOfObject.iy(2, this.vHG.computeSize());
        this.vHG.writeFields(paramArrayOfObject);
      }
      if (this.wwz != null)
      {
        paramArrayOfObject.iy(3, this.wwz.computeSize());
        this.wwz.writeFields(paramArrayOfObject);
      }
      if (this.wwA != null)
      {
        paramArrayOfObject.iy(4, this.wwA.computeSize());
        this.wwA.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wwB);
      paramArrayOfObject.iz(6, this.wwC);
      paramArrayOfObject.iz(7, this.wwD);
      AppMethodBeat.o(28519);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1151;
    label1151: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vHG != null)
        i = paramInt + e.a.a.a.ix(2, this.vHG.computeSize());
      paramInt = i;
      if (this.wwz != null)
        paramInt = i + e.a.a.a.ix(3, this.wwz.computeSize());
      i = paramInt;
      if (this.wwA != null)
        i = paramInt + e.a.a.a.ix(4, this.wwA.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(5, this.wwB) + e.a.a.b.b.a.bs(6, this.wwC) + e.a.a.b.b.a.bs(7, this.wwD);
      AppMethodBeat.o(28519);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28519);
          throw paramArrayOfObject;
        }
        if (this.vHG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SessionKey");
          AppMethodBeat.o(28519);
          throw paramArrayOfObject;
        }
        if (this.wwz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SessionBuffer");
          AppMethodBeat.o(28519);
          throw paramArrayOfObject;
        }
        if (this.wwA == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KeyBuffer");
          AppMethodBeat.o(28519);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28519);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ast localast = (ast)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28519);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localast.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28519);
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
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localast.vHG = paramArrayOfObject;
          }
          AppMethodBeat.o(28519);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localast.wwz = paramArrayOfObject;
          }
          AppMethodBeat.o(28519);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localast.wwA = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28519);
          paramInt = i;
          break;
        case 5:
          localast.wwB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28519);
          paramInt = i;
          break;
        case 6:
          localast.wwC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28519);
          paramInt = i;
          break;
        case 7:
          localast.wwD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28519);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28519);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ast
 * JD-Core Version:    0.6.2
 */