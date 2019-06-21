package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bgz extends btd
{
  public SKBuiltinBuffer_t wKr;
  public tc wKs;
  public int wKt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80150);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80150);
        throw paramArrayOfObject;
      }
      if (this.wKs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: cmd_list");
        AppMethodBeat.o(80150);
        throw paramArrayOfObject;
      }
      if (this.wKr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: key_buf");
        AppMethodBeat.o(80150);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wKs != null)
      {
        paramArrayOfObject.iy(2, this.wKs.computeSize());
        this.wKs.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wKt);
      if (this.wKr != null)
      {
        paramArrayOfObject.iy(4, this.wKr.computeSize());
        this.wKr.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(80150);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label830;
    label830: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wKs != null)
        i = paramInt + e.a.a.a.ix(2, this.wKs.computeSize());
      i += e.a.a.b.b.a.bs(3, this.wKt);
      paramInt = i;
      if (this.wKr != null)
        paramInt = i + e.a.a.a.ix(4, this.wKr.computeSize());
      AppMethodBeat.o(80150);
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
          AppMethodBeat.o(80150);
          throw paramArrayOfObject;
        }
        if (this.wKs == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: cmd_list");
          AppMethodBeat.o(80150);
          throw paramArrayOfObject;
        }
        if (this.wKr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: key_buf");
          AppMethodBeat.o(80150);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80150);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bgz localbgz = (bgz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80150);
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
            localbgz.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(80150);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new tc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((tc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbgz.wKs = ((tc)localObject1);
          }
          AppMethodBeat.o(80150);
          paramInt = i;
          break;
        case 3:
          localbgz.wKt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80150);
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
            localbgz.wKr = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80150);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80150);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bgz
 * JD-Core Version:    0.6.2
 */