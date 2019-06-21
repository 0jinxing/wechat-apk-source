package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bec extends btd
{
  public int vBm;
  public int vQe;
  public SKBuiltinBuffer_t wHH;
  public SKBuiltinBuffer_t wHI;
  public int wHJ;
  public int wHK;
  public LinkedList<tb> wHL;

  public bec()
  {
    AppMethodBeat.i(58918);
    this.wHL = new LinkedList();
    AppMethodBeat.o(58918);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58919);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(58919);
        throw paramArrayOfObject;
      }
      if (this.wHH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CurrentSynckey");
        AppMethodBeat.o(58919);
        throw paramArrayOfObject;
      }
      if (this.wHI == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MaxSynckey");
        AppMethodBeat.o(58919);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wHH != null)
      {
        paramArrayOfObject.iy(2, this.wHH.computeSize());
        this.wHH.writeFields(paramArrayOfObject);
      }
      if (this.wHI != null)
      {
        paramArrayOfObject.iy(3, this.wHI.computeSize());
        this.wHI.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.vQe);
      paramArrayOfObject.iz(5, this.wHJ);
      paramArrayOfObject.iz(6, this.wHK);
      paramArrayOfObject.e(7, 8, this.wHL);
      paramArrayOfObject.iz(8, this.vBm);
      AppMethodBeat.o(58919);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1114;
    label1114: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wHH != null)
        paramInt = i + e.a.a.a.ix(2, this.wHH.computeSize());
      i = paramInt;
      if (this.wHI != null)
        i = paramInt + e.a.a.a.ix(3, this.wHI.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(4, this.vQe) + e.a.a.b.b.a.bs(5, this.wHJ) + e.a.a.b.b.a.bs(6, this.wHK) + e.a.a.a.c(7, 8, this.wHL) + e.a.a.b.b.a.bs(8, this.vBm);
      AppMethodBeat.o(58919);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wHL.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(58919);
          throw paramArrayOfObject;
        }
        if (this.wHH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CurrentSynckey");
          AppMethodBeat.o(58919);
          throw paramArrayOfObject;
        }
        if (this.wHI == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MaxSynckey");
          AppMethodBeat.o(58919);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58919);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bec localbec = (bec)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58919);
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
            localbec.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(58919);
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
            localbec.wHH = paramArrayOfObject;
          }
          AppMethodBeat.o(58919);
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
            localbec.wHI = paramArrayOfObject;
          }
          AppMethodBeat.o(58919);
          paramInt = i;
          break;
        case 4:
          localbec.vQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58919);
          paramInt = i;
          break;
        case 5:
          localbec.wHJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58919);
          paramInt = i;
          break;
        case 6:
          localbec.wHK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58919);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new tb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((tb)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbec.wHL.add(localObject1);
          }
          AppMethodBeat.o(58919);
          paramInt = i;
          break;
        case 8:
          localbec.vBm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58919);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58919);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bec
 * JD-Core Version:    0.6.2
 */