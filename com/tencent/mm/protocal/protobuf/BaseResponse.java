package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class BaseResponse extends com.tencent.mm.bt.a
{
  public bts ErrMsg;
  public int Ret;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58893);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ErrMsg == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ErrMsg");
        AppMethodBeat.o(58893);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.Ret);
      if (this.ErrMsg != null)
      {
        paramArrayOfObject.iy(2, this.ErrMsg.computeSize());
        this.ErrMsg.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58893);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.Ret) + 0;
        paramInt = i;
        if (this.ErrMsg != null)
          paramInt = i + e.a.a.a.ix(2, this.ErrMsg.computeSize());
        AppMethodBeat.o(58893);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ErrMsg == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ErrMsg");
          AppMethodBeat.o(58893);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58893);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        BaseResponse localBaseResponse = (BaseResponse)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(58893);
          paramInt = -1;
          break;
        case 1:
          localBaseResponse.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58893);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localBaseResponse.ErrMsg = paramArrayOfObject;
          }
          AppMethodBeat.o(58893);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(58893);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.BaseResponse
 * JD-Core Version:    0.6.2
 */