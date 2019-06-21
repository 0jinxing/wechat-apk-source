package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class sg extends btd
{
  public int jBT;
  public clu vZA;
  public bod vZB;
  public int vZC;
  public cof vZz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28363);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28363);
        throw paramArrayOfObject;
      }
      if (this.vZz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: TransRes");
        AppMethodBeat.o(28363);
        throw paramArrayOfObject;
      }
      if (this.vZA == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UploadCtx");
        AppMethodBeat.o(28363);
        throw paramArrayOfObject;
      }
      if (this.vZB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QueryCtx");
        AppMethodBeat.o(28363);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jBT);
      if (this.vZz != null)
      {
        paramArrayOfObject.iy(3, this.vZz.computeSize());
        this.vZz.writeFields(paramArrayOfObject);
      }
      if (this.vZA != null)
      {
        paramArrayOfObject.iy(4, this.vZA.computeSize());
        this.vZA.writeFields(paramArrayOfObject);
      }
      if (this.vZB != null)
      {
        paramArrayOfObject.iy(5, this.vZB.computeSize());
        this.vZB.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.vZC);
      AppMethodBeat.o(28363);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1106;
    label1106: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.jBT);
      i = paramInt;
      if (this.vZz != null)
        i = paramInt + e.a.a.a.ix(3, this.vZz.computeSize());
      paramInt = i;
      if (this.vZA != null)
        paramInt = i + e.a.a.a.ix(4, this.vZA.computeSize());
      i = paramInt;
      if (this.vZB != null)
        i = paramInt + e.a.a.a.ix(5, this.vZB.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(6, this.vZC);
      AppMethodBeat.o(28363);
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
          AppMethodBeat.o(28363);
          throw paramArrayOfObject;
        }
        if (this.vZz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: TransRes");
          AppMethodBeat.o(28363);
          throw paramArrayOfObject;
        }
        if (this.vZA == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UploadCtx");
          AppMethodBeat.o(28363);
          throw paramArrayOfObject;
        }
        if (this.vZB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QueryCtx");
          AppMethodBeat.o(28363);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28363);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        sg localsg = (sg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28363);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsg.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28363);
          paramInt = i;
          break;
        case 2:
          localsg.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28363);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cof();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cof)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsg.vZz = ((cof)localObject1);
          }
          AppMethodBeat.o(28363);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new clu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((clu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsg.vZA = ((clu)localObject1);
          }
          AppMethodBeat.o(28363);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bod();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bod)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsg.vZB = ((bod)localObject1);
          }
          AppMethodBeat.o(28363);
          paramInt = i;
          break;
        case 6:
          localsg.vZC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28363);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28363);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.sg
 * JD-Core Version:    0.6.2
 */