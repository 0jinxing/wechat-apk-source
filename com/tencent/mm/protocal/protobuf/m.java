package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class m extends btd
{
  public int kCl = 268513600;
  public String kCm = "请求不成功，请稍候再试";
  public String kCx;
  public String kCy;
  public int vAa;
  public int vAb;
  public long vAc;
  public long vAd;
  public int vzZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56681);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56681);
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
      paramArrayOfObject.iz(4, this.vzZ);
      paramArrayOfObject.iz(5, this.vAa);
      paramArrayOfObject.iz(6, this.vAb);
      paramArrayOfObject.ai(7, this.vAc);
      paramArrayOfObject.ai(8, this.vAd);
      if (this.kCx != null)
        paramArrayOfObject.e(9, this.kCx);
      if (this.kCy != null)
        paramArrayOfObject.e(10, this.kCy);
      AppMethodBeat.o(56681);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label846;
    label846: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt + e.a.a.b.b.a.bs(4, this.vzZ) + e.a.a.b.b.a.bs(5, this.vAa) + e.a.a.b.b.a.bs(6, this.vAb) + e.a.a.b.b.a.o(7, this.vAc) + e.a.a.b.b.a.o(8, this.vAd);
      paramInt = i;
      if (this.kCx != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.kCx);
      i = paramInt;
      if (this.kCy != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.kCy);
      AppMethodBeat.o(56681);
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
          AppMethodBeat.o(56681);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56681);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        m localm = (m)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56681);
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
            localm.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56681);
          paramInt = i;
          break;
        case 2:
          localm.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56681);
          paramInt = i;
          break;
        case 3:
          localm.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56681);
          paramInt = i;
          break;
        case 4:
          localm.vzZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56681);
          paramInt = i;
          break;
        case 5:
          localm.vAa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56681);
          paramInt = i;
          break;
        case 6:
          localm.vAb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56681);
          paramInt = i;
          break;
        case 7:
          localm.vAc = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56681);
          paramInt = i;
          break;
        case 8:
          localm.vAd = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56681);
          paramInt = i;
          break;
        case 9:
          localm.kCx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56681);
          paramInt = i;
          break;
        case 10:
          localm.kCy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56681);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56681);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.m
 * JD-Core Version:    0.6.2
 */