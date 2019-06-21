package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class o extends btd
{
  public String cJF;
  public int kCl = 268513600;
  public String kCm = "请求不成功，请稍候再试";
  public String nYX;
  public String pPw;
  public a vAf;
  public String vAg;
  public String vzN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56683);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56683);
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
      if (this.nYX != null)
        paramArrayOfObject.e(4, this.nYX);
      if (this.cJF != null)
        paramArrayOfObject.e(5, this.cJF);
      if (this.pPw != null)
        paramArrayOfObject.e(7, this.pPw);
      if (this.vzN != null)
        paramArrayOfObject.e(8, this.vzN);
      if (this.vAf != null)
      {
        paramArrayOfObject.iy(9, this.vAf.computeSize());
        this.vAf.writeFields(paramArrayOfObject);
      }
      if (this.vAg != null)
        paramArrayOfObject.e(10, this.vAg);
      AppMethodBeat.o(56683);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label967;
    label967: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.nYX != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.nYX);
      paramInt = i;
      if (this.cJF != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.cJF);
      i = paramInt;
      if (this.pPw != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.pPw);
      paramInt = i;
      if (this.vzN != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vzN);
      i = paramInt;
      if (this.vAf != null)
        i = paramInt + e.a.a.a.ix(9, this.vAf.computeSize());
      paramInt = i;
      if (this.vAg != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vAg);
      AppMethodBeat.o(56683);
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
          AppMethodBeat.o(56683);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56683);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        o localo = (o)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 6:
        default:
          paramInt = -1;
          AppMethodBeat.o(56683);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localo.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56683);
          paramInt = i;
          break;
        case 2:
          localo.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56683);
          paramInt = i;
          break;
        case 3:
          localo.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56683);
          paramInt = i;
          break;
        case 4:
          localo.nYX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56683);
          paramInt = i;
          break;
        case 5:
          localo.cJF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56683);
          paramInt = i;
          break;
        case 7:
          localo.pPw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56683);
          paramInt = i;
          break;
        case 8:
          localo.vzN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56683);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new a();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localo.vAf = paramArrayOfObject;
          }
          AppMethodBeat.o(56683);
          paramInt = i;
          break;
        case 10:
          localo.vAg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56683);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56683);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.o
 * JD-Core Version:    0.6.2
 */