package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class clb extends btd
{
  public int ptw;
  public int ptx;
  public String vXm;
  public String vXn;
  public String xiL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80202);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80202);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptw);
      paramArrayOfObject.iz(3, this.ptx);
      if (this.xiL != null)
        paramArrayOfObject.e(4, this.xiL);
      if (this.vXm != null)
        paramArrayOfObject.e(5, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(6, this.vXn);
      AppMethodBeat.o(80202);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label655;
    label655: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptw) + e.a.a.b.b.a.bs(3, this.ptx);
      paramInt = i;
      if (this.xiL != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xiL);
      i = paramInt;
      if (this.vXm != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vXm);
      paramInt = i;
      if (this.vXn != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vXn);
      AppMethodBeat.o(80202);
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
          AppMethodBeat.o(80202);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80202);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        clb localclb = (clb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80202);
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
            localclb.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(80202);
          paramInt = i;
          break;
        case 2:
          localclb.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80202);
          paramInt = i;
          break;
        case 3:
          localclb.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80202);
          paramInt = i;
          break;
        case 4:
          localclb.xiL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80202);
          paramInt = i;
          break;
        case 5:
          localclb.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80202);
          paramInt = i;
          break;
        case 6:
          localclb.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80202);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80202);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.clb
 * JD-Core Version:    0.6.2
 */