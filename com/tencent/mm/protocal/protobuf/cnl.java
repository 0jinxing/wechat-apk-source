package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cnl extends btd
{
  public int vYu;
  public int wTs;
  public cob wTx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28698);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28698);
        throw paramArrayOfObject;
      }
      if (this.wTx == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NextPiece");
        AppMethodBeat.o(28698);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wTx != null)
      {
        paramArrayOfObject.iy(2, this.wTx.computeSize());
        this.wTx.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.vYu);
      paramArrayOfObject.iz(4, this.wTs);
      AppMethodBeat.o(28698);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label683;
    label683: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wTx != null)
        i = paramInt + e.a.a.a.ix(2, this.wTx.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.vYu) + e.a.a.b.b.a.bs(4, this.wTs);
      AppMethodBeat.o(28698);
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
          AppMethodBeat.o(28698);
          throw paramArrayOfObject;
        }
        if (this.wTx == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NextPiece");
          AppMethodBeat.o(28698);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28698);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnl localcnl = (cnl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28698);
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
            localcnl.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28698);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cob();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnl.wTx = paramArrayOfObject;
          }
          AppMethodBeat.o(28698);
          paramInt = i;
          break;
        case 3:
          localcnl.vYu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28698);
          paramInt = i;
          break;
        case 4:
          localcnl.wTs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28698);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28698);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnl
 * JD-Core Version:    0.6.2
 */