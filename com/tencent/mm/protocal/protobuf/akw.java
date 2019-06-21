package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class akw extends btd
{
  public int kKI;
  public int kdT;
  public String kdU;
  public int wqk;
  public bij wqt;
  public bik wqu;
  public bik wqv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89100);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(89100);
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
      paramArrayOfObject.iz(4, this.kKI);
      paramArrayOfObject.iz(5, this.wqk);
      if (this.wqt != null)
      {
        paramArrayOfObject.iy(6, this.wqt.computeSize());
        this.wqt.writeFields(paramArrayOfObject);
      }
      if (this.wqu != null)
      {
        paramArrayOfObject.iy(7, this.wqu.computeSize());
        this.wqu.writeFields(paramArrayOfObject);
      }
      if (this.wqv != null)
      {
        paramArrayOfObject.iy(8, this.wqv.computeSize());
        this.wqv.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(89100);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1053;
    label1053: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      paramInt = paramInt + e.a.a.b.b.a.bs(4, this.kKI) + e.a.a.b.b.a.bs(5, this.wqk);
      i = paramInt;
      if (this.wqt != null)
        i = paramInt + e.a.a.a.ix(6, this.wqt.computeSize());
      paramInt = i;
      if (this.wqu != null)
        paramInt = i + e.a.a.a.ix(7, this.wqu.computeSize());
      i = paramInt;
      if (this.wqv != null)
        i = paramInt + e.a.a.a.ix(8, this.wqv.computeSize());
      AppMethodBeat.o(89100);
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
          AppMethodBeat.o(89100);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(89100);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        akw localakw = (akw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89100);
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
            localakw.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(89100);
          paramInt = i;
          break;
        case 2:
          localakw.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89100);
          paramInt = i;
          break;
        case 3:
          localakw.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89100);
          paramInt = i;
          break;
        case 4:
          localakw.kKI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89100);
          paramInt = i;
          break;
        case 5:
          localakw.wqk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89100);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bij();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakw.wqt = paramArrayOfObject;
          }
          AppMethodBeat.o(89100);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bik();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakw.wqu = paramArrayOfObject;
          }
          AppMethodBeat.o(89100);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bik();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bik)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakw.wqv = ((bik)localObject1);
          }
          AppMethodBeat.o(89100);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89100);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.akw
 * JD-Core Version:    0.6.2
 */