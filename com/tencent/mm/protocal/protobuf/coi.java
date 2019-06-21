package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class coi extends btd
{
  public int wem;
  public long wen;
  public int xlL;
  public int xlS;
  public cpr xlT;
  public int xlU;
  public int xlV;
  public int xlW;
  public int xlX;
  public SKBuiltinBuffer_t xlY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5226);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5226);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.xlS);
      if (this.xlT != null)
      {
        paramArrayOfObject.iy(5, this.xlT.computeSize());
        this.xlT.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.xlL);
      paramArrayOfObject.iz(7, this.xlU);
      paramArrayOfObject.iz(8, this.xlV);
      paramArrayOfObject.iz(9, this.xlW);
      paramArrayOfObject.iz(10, this.xlX);
      if (this.xlY != null)
      {
        paramArrayOfObject.iy(11, this.xlY.computeSize());
        this.xlY.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(5226);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1084;
    label1084: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.xlS);
      paramInt = i;
      if (this.xlT != null)
        paramInt = i + e.a.a.a.ix(5, this.xlT.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(6, this.xlL) + e.a.a.b.b.a.bs(7, this.xlU) + e.a.a.b.b.a.bs(8, this.xlV) + e.a.a.b.b.a.bs(9, this.xlW) + e.a.a.b.b.a.bs(10, this.xlX);
      paramInt = i;
      if (this.xlY != null)
        paramInt = i + e.a.a.a.ix(11, this.xlY.computeSize());
      AppMethodBeat.o(5226);
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
          AppMethodBeat.o(5226);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5226);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        coi localcoi = (coi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5226);
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
            localcoi.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        case 2:
          localcoi.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        case 3:
          localcoi.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        case 4:
          localcoi.xlS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cpr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cpr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcoi.xlT = ((cpr)localObject1);
          }
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        case 6:
          localcoi.xlL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        case 7:
          localcoi.xlU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        case 8:
          localcoi.xlV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        case 9:
          localcoi.xlW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        case 10:
          localcoi.xlX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcoi.xlY = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(5226);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5226);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.coi
 * JD-Core Version:    0.6.2
 */