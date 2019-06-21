package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aoj extends btd
{
  public int kCl;
  public String kCm;
  public String nWx;
  public LinkedList<atb> wsA;
  public String wsB;
  public int wsC;
  public LinkedList<String> wsD;
  public int wsE;

  public aoj()
  {
    AppMethodBeat.i(56837);
    this.kCl = 0;
    this.kCm = "ok";
    this.wsA = new LinkedList();
    this.wsD = new LinkedList();
    AppMethodBeat.o(56837);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56838);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56838);
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
      paramArrayOfObject.e(4, 8, this.wsA);
      if (this.wsB != null)
        paramArrayOfObject.e(5, this.wsB);
      paramArrayOfObject.iz(6, this.wsC);
      if (this.nWx != null)
        paramArrayOfObject.e(7, this.nWx);
      paramArrayOfObject.e(8, 1, this.wsD);
      paramArrayOfObject.iz(9, this.wsE);
      AppMethodBeat.o(56838);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label912;
    label912: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt + e.a.a.a.c(4, 8, this.wsA);
      paramInt = i;
      if (this.wsB != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wsB);
      i = paramInt + e.a.a.b.b.a.bs(6, this.wsC);
      paramInt = i;
      if (this.nWx != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.nWx);
      paramInt = paramInt + e.a.a.a.c(8, 1, this.wsD) + e.a.a.b.b.a.bs(9, this.wsE);
      AppMethodBeat.o(56838);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wsA.clear();
        this.wsD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56838);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56838);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aoj localaoj = (aoj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56838);
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
            localaoj.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56838);
          paramInt = i;
          break;
        case 2:
          localaoj.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56838);
          paramInt = i;
          break;
        case 3:
          localaoj.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56838);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new atb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atb)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaoj.wsA.add(localObject1);
          }
          AppMethodBeat.o(56838);
          paramInt = i;
          break;
        case 5:
          localaoj.wsB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56838);
          paramInt = i;
          break;
        case 6:
          localaoj.wsC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56838);
          paramInt = i;
          break;
        case 7:
          localaoj.nWx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56838);
          paramInt = i;
          break;
        case 8:
          localaoj.wsD.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(56838);
          paramInt = i;
          break;
        case 9:
          localaoj.wsE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56838);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56838);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aoj
 * JD-Core Version:    0.6.2
 */