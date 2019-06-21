package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class rd extends btd
{
  public String kKZ;
  public int kdT;
  public String kdU;
  public String nSd;
  public long vYi;
  public long vYj;
  public String vYk;
  public String vYl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48820);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48820);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdT);
      if (this.kdU != null)
        paramArrayOfObject.e(3, this.kdU);
      paramArrayOfObject.ai(4, this.vYi);
      paramArrayOfObject.ai(5, this.vYj);
      if (this.vYk != null)
        paramArrayOfObject.e(6, this.vYk);
      if (this.vYl != null)
        paramArrayOfObject.e(7, this.vYl);
      if (this.nSd != null)
        paramArrayOfObject.e(8, this.nSd);
      if (this.kKZ != null)
        paramArrayOfObject.e(9, this.kKZ);
      AppMethodBeat.o(48820);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label836;
    label836: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt + e.a.a.b.b.a.o(4, this.vYi) + e.a.a.b.b.a.o(5, this.vYj);
      paramInt = i;
      if (this.vYk != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vYk);
      i = paramInt;
      if (this.vYl != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vYl);
      paramInt = i;
      if (this.nSd != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.nSd);
      i = paramInt;
      if (this.kKZ != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.kKZ);
      AppMethodBeat.o(48820);
      paramInt = i;
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
          AppMethodBeat.o(48820);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48820);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        rd localrd = (rd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48820);
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
            localrd.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(48820);
          paramInt = i;
          break;
        case 2:
          localrd.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48820);
          paramInt = i;
          break;
        case 3:
          localrd.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48820);
          paramInt = i;
          break;
        case 4:
          localrd.vYi = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48820);
          paramInt = i;
          break;
        case 5:
          localrd.vYj = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48820);
          paramInt = i;
          break;
        case 6:
          localrd.vYk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48820);
          paramInt = i;
          break;
        case 7:
          localrd.vYl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48820);
          paramInt = i;
          break;
        case 8:
          localrd.nSd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48820);
          paramInt = i;
          break;
        case 9:
          localrd.kKZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48820);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48820);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.rd
 * JD-Core Version:    0.6.2
 */