package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bho extends btd
{
  public int kCl;
  public String kCm;
  public String kCx;
  public String kCy;
  public int wKN;
  public int wKO;
  public String wKP;
  public String wKQ;
  public int wKR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48912);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48912);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kCl);
      if (this.kCm != null)
        paramArrayOfObject.e(3, this.kCm);
      paramArrayOfObject.iz(4, this.wKN);
      paramArrayOfObject.iz(5, this.wKO);
      if (this.kCx != null)
        paramArrayOfObject.e(6, this.kCx);
      if (this.kCy != null)
        paramArrayOfObject.e(7, this.kCy);
      if (this.wKP != null)
        paramArrayOfObject.e(8, this.wKP);
      if (this.wKQ != null)
        paramArrayOfObject.e(9, this.wKQ);
      paramArrayOfObject.iz(10, this.wKR);
      AppMethodBeat.o(48912);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label882;
    label882: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt + e.a.a.b.b.a.bs(4, this.wKN) + e.a.a.b.b.a.bs(5, this.wKO);
      paramInt = i;
      if (this.kCx != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.kCx);
      i = paramInt;
      if (this.kCy != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.kCy);
      paramInt = i;
      if (this.wKP != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wKP);
      i = paramInt;
      if (this.wKQ != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wKQ);
      paramInt = i + e.a.a.b.b.a.bs(10, this.wKR);
      AppMethodBeat.o(48912);
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
          AppMethodBeat.o(48912);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48912);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bho localbho = (bho)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48912);
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
            localbho.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(48912);
          paramInt = i;
          break;
        case 2:
          localbho.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48912);
          paramInt = i;
          break;
        case 3:
          localbho.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48912);
          paramInt = i;
          break;
        case 4:
          localbho.wKN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48912);
          paramInt = i;
          break;
        case 5:
          localbho.wKO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48912);
          paramInt = i;
          break;
        case 6:
          localbho.kCx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48912);
          paramInt = i;
          break;
        case 7:
          localbho.kCy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48912);
          paramInt = i;
          break;
        case 8:
          localbho.wKP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48912);
          paramInt = i;
          break;
        case 9:
          localbho.wKQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48912);
          paramInt = i;
          break;
        case 10:
          localbho.wKR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48912);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48912);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bho
 * JD-Core Version:    0.6.2
 */