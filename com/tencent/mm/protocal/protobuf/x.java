package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class x extends btd
{
  public int kCl;
  public String kCm;
  public int vAA;
  public int vAB;
  public String vAC;
  public LinkedList<k> vAD;
  public String vAE;
  public String vAz;

  public x()
  {
    AppMethodBeat.i(56693);
    this.kCl = 268513600;
    this.kCm = "请求不成功，请稍候再试";
    this.vAD = new LinkedList();
    AppMethodBeat.o(56693);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56694);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56694);
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
      paramArrayOfObject.e(4, 8, this.vAD);
      if (this.vAE != null)
        paramArrayOfObject.e(5, this.vAE);
      if (this.vAz != null)
        paramArrayOfObject.e(6, this.vAz);
      paramArrayOfObject.iz(7, this.vAA);
      paramArrayOfObject.iz(8, this.vAB);
      if (this.vAC != null)
        paramArrayOfObject.e(9, this.vAC);
      AppMethodBeat.o(56694);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label916;
    label916: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt + e.a.a.a.c(4, 8, this.vAD);
      paramInt = i;
      if (this.vAE != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vAE);
      i = paramInt;
      if (this.vAz != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vAz);
      i = i + e.a.a.b.b.a.bs(7, this.vAA) + e.a.a.b.b.a.bs(8, this.vAB);
      paramInt = i;
      if (this.vAC != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vAC);
      AppMethodBeat.o(56694);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vAD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56694);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56694);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        x localx = (x)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56694);
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
            localx.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56694);
          paramInt = i;
          break;
        case 2:
          localx.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56694);
          paramInt = i;
          break;
        case 3:
          localx.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56694);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new k();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((k)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localx.vAD.add(localObject1);
          }
          AppMethodBeat.o(56694);
          paramInt = i;
          break;
        case 5:
          localx.vAE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56694);
          paramInt = i;
          break;
        case 6:
          localx.vAz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56694);
          paramInt = i;
          break;
        case 7:
          localx.vAA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56694);
          paramInt = i;
          break;
        case 8:
          localx.vAB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56694);
          paramInt = i;
          break;
        case 9:
          localx.vAC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56694);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56694);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.x
 * JD-Core Version:    0.6.2
 */