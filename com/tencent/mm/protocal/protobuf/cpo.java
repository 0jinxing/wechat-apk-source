package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpo extends btd
{
  public int Timestamp;
  public int wem;
  public long wen;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5248);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5248);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.Timestamp);
      AppMethodBeat.o(5248);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label523;
    label523: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.Timestamp);
      AppMethodBeat.o(5248);
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
          AppMethodBeat.o(5248);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5248);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpo localcpo = (cpo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5248);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpo.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(5248);
          paramInt = i;
          break;
        case 2:
          localcpo.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5248);
          paramInt = i;
          break;
        case 3:
          localcpo.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5248);
          paramInt = i;
          break;
        case 4:
          localcpo.Timestamp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5248);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5248);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpo
 * JD-Core Version:    0.6.2
 */