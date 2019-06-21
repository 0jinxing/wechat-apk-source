package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class pp extends btd
{
  public String cBT;
  public int kCl;
  public String kCm;
  public int nUf;
  public String vFc;
  public String vWF;
  public String vWG;
  public String vWI;
  public String vWR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48800);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48800);
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
      if (this.cBT != null)
        paramArrayOfObject.e(4, this.cBT);
      if (this.vWI != null)
        paramArrayOfObject.e(5, this.vWI);
      if (this.vFc != null)
        paramArrayOfObject.e(6, this.vFc);
      paramArrayOfObject.iz(7, this.nUf);
      if (this.vWR != null)
        paramArrayOfObject.e(8, this.vWR);
      if (this.vWG != null)
        paramArrayOfObject.e(9, this.vWG);
      if (this.vWF != null)
        paramArrayOfObject.e(10, this.vWF);
      AppMethodBeat.o(48800);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label918;
    label918: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.kCl);
      i = paramInt;
      if (this.kCm != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kCm);
      paramInt = i;
      if (this.cBT != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.cBT);
      i = paramInt;
      if (this.vWI != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vWI);
      paramInt = i;
      if (this.vFc != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vFc);
      paramInt += e.a.a.b.b.a.bs(7, this.nUf);
      i = paramInt;
      if (this.vWR != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vWR);
      paramInt = i;
      if (this.vWG != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vWG);
      i = paramInt;
      if (this.vWF != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vWF);
      AppMethodBeat.o(48800);
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
          AppMethodBeat.o(48800);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48800);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        pp localpp = (pp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48800);
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
            localpp.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(48800);
          paramInt = i;
          break;
        case 2:
          localpp.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48800);
          paramInt = i;
          break;
        case 3:
          localpp.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48800);
          paramInt = i;
          break;
        case 4:
          localpp.cBT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48800);
          paramInt = i;
          break;
        case 5:
          localpp.vWI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48800);
          paramInt = i;
          break;
        case 6:
          localpp.vFc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48800);
          paramInt = i;
          break;
        case 7:
          localpp.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48800);
          paramInt = i;
          break;
        case 8:
          localpp.vWR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48800);
          paramInt = i;
          break;
        case 9:
          localpp.vWG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48800);
          paramInt = i;
          break;
        case 10:
          localpp.vWF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48800);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48800);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pp
 * JD-Core Version:    0.6.2
 */