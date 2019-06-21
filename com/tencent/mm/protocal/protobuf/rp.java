package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class rp extends btd
{
  public int luT;
  public String luU;
  public String token;
  public bjk vYW;
  public String vwr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56761);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56761);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.luT);
      if (this.luU != null)
        paramArrayOfObject.e(3, this.luU);
      if (this.token != null)
        paramArrayOfObject.e(4, this.token);
      if (this.vYW != null)
      {
        paramArrayOfObject.iy(5, this.vYW.computeSize());
        this.vYW.writeFields(paramArrayOfObject);
      }
      if (this.vwr != null)
        paramArrayOfObject.e(6, this.vwr);
      AppMethodBeat.o(56761);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label767;
    label767: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.luT);
      i = paramInt;
      if (this.luU != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.luU);
      paramInt = i;
      if (this.token != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.token);
      i = paramInt;
      if (this.vYW != null)
        i = paramInt + e.a.a.a.ix(5, this.vYW.computeSize());
      paramInt = i;
      if (this.vwr != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vwr);
      AppMethodBeat.o(56761);
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
          AppMethodBeat.o(56761);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56761);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        rp localrp = (rp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56761);
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
            localrp.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56761);
          paramInt = i;
          break;
        case 2:
          localrp.luT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56761);
          paramInt = i;
          break;
        case 3:
          localrp.luU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56761);
          paramInt = i;
          break;
        case 4:
          localrp.token = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56761);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bjk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localrp.vYW = paramArrayOfObject;
          }
          AppMethodBeat.o(56761);
          paramInt = i;
          break;
        case 6:
          localrp.vwr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56761);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56761);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.rp
 * JD-Core Version:    0.6.2
 */