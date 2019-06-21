package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class g extends btd
{
  public int kCl = 268513600;
  public String kCm = "请求不成功，请稍候再试";
  public String vzL;
  public String vzN;
  public y vzT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56674);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56674);
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
      if (this.vzL != null)
        paramArrayOfObject.e(4, this.vzL);
      if (this.vzN != null)
        paramArrayOfObject.e(5, this.vzN);
      if (this.vzT != null)
      {
        paramArrayOfObject.iy(6, this.vzT.computeSize());
        this.vzT.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56674);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label771;
    label771: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.vzL != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vzL);
      paramInt = i;
      if (this.vzN != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vzN);
      i = paramInt;
      if (this.vzT != null)
        i = paramInt + e.a.a.a.ix(6, this.vzT.computeSize());
      AppMethodBeat.o(56674);
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
          AppMethodBeat.o(56674);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56674);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        g localg = (g)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56674);
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
            localg.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56674);
          paramInt = i;
          break;
        case 2:
          localg.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56674);
          paramInt = i;
          break;
        case 3:
          localg.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56674);
          paramInt = i;
          break;
        case 4:
          localg.vzL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56674);
          paramInt = i;
          break;
        case 5:
          localg.vzN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56674);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new y();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((y)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localg.vzT = ((y)localObject1);
          }
          AppMethodBeat.o(56674);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56674);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.g
 * JD-Core Version:    0.6.2
 */