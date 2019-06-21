package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpk extends btd
{
  public int wIr;
  public int wPb;
  public int wem;
  public long wen;
  public int xmS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5243);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5243);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.wPb);
      paramArrayOfObject.iz(5, this.wIr);
      paramArrayOfObject.iz(6, this.xmS);
      AppMethodBeat.o(5243);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label614;
    label614: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.wPb) + e.a.a.b.b.a.bs(5, this.wIr) + e.a.a.b.b.a.bs(6, this.xmS);
      AppMethodBeat.o(5243);
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
          AppMethodBeat.o(5243);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5243);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpk localcpk = (cpk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5243);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpk.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(5243);
          paramInt = i;
          break;
        case 2:
          localcpk.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5243);
          paramInt = i;
          break;
        case 3:
          localcpk.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5243);
          paramInt = i;
          break;
        case 4:
          localcpk.wPb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5243);
          paramInt = i;
          break;
        case 5:
          localcpk.wIr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5243);
          paramInt = i;
          break;
        case 6:
          localcpk.xmS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5243);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5243);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpk
 * JD-Core Version:    0.6.2
 */