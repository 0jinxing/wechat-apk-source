package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class clt extends btd
{
  public int ptD;
  public long ptF;
  public String vFF;
  public String vRw;
  public int wEt;
  public int xjp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51009);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(51009);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vFF != null)
        paramArrayOfObject.e(2, this.vFF);
      paramArrayOfObject.iz(3, this.ptD);
      paramArrayOfObject.iz(4, this.wEt);
      paramArrayOfObject.iz(5, this.xjp);
      paramArrayOfObject.ai(6, this.ptF);
      if (this.vRw != null)
        paramArrayOfObject.e(7, this.vRw);
      AppMethodBeat.o(51009);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label686;
    label686: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vFF != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vFF);
      i = i + e.a.a.b.b.a.bs(3, this.ptD) + e.a.a.b.b.a.bs(4, this.wEt) + e.a.a.b.b.a.bs(5, this.xjp) + e.a.a.b.b.a.o(6, this.ptF);
      paramInt = i;
      if (this.vRw != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vRw);
      AppMethodBeat.o(51009);
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
          AppMethodBeat.o(51009);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(51009);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        clt localclt = (clt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51009);
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
            localclt.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(51009);
          paramInt = i;
          break;
        case 2:
          localclt.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51009);
          paramInt = i;
          break;
        case 3:
          localclt.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51009);
          paramInt = i;
          break;
        case 4:
          localclt.wEt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51009);
          paramInt = i;
          break;
        case 5:
          localclt.xjp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51009);
          paramInt = i;
          break;
        case 6:
          localclt.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(51009);
          paramInt = i;
          break;
        case 7:
          localclt.vRw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51009);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51009);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.clt
 * JD-Core Version:    0.6.2
 */