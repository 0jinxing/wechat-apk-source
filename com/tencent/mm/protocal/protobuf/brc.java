package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class brc extends btd
{
  public int wTs;
  public int wTv;
  public int wTw;
  public cob wTx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28616);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28616);
        throw paramArrayOfObject;
      }
      if (this.wTx == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NextPiece");
        AppMethodBeat.o(28616);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wTv);
      paramArrayOfObject.iz(3, this.wTw);
      if (this.wTx != null)
      {
        paramArrayOfObject.iy(4, this.wTx.computeSize());
        this.wTx.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wTs);
      AppMethodBeat.o(28616);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label731;
    label731: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wTv) + e.a.a.b.b.a.bs(3, this.wTw);
      paramInt = i;
      if (this.wTx != null)
        paramInt = i + e.a.a.a.ix(4, this.wTx.computeSize());
      paramInt += e.a.a.b.b.a.bs(5, this.wTs);
      AppMethodBeat.o(28616);
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
          AppMethodBeat.o(28616);
          throw paramArrayOfObject;
        }
        if (this.wTx == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NextPiece");
          AppMethodBeat.o(28616);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28616);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        brc localbrc = (brc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28616);
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
            localbrc.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28616);
          paramInt = i;
          break;
        case 2:
          localbrc.wTv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28616);
          paramInt = i;
          break;
        case 3:
          localbrc.wTw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28616);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cob();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbrc.wTx = paramArrayOfObject;
          }
          AppMethodBeat.o(28616);
          paramInt = i;
          break;
        case 5:
          localbrc.wTs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28616);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28616);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.brc
 * JD-Core Version:    0.6.2
 */