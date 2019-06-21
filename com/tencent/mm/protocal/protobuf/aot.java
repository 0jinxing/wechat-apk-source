package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aot extends btd
{
  public LinkedList<bg> ncU;
  public LinkedList<aro> ncz;
  public int wsR;
  public LinkedList<bpe> wsS;
  public int wsT;
  public int wsU;
  public int wsV;
  public arn wsW;

  public aot()
  {
    AppMethodBeat.i(80099);
    this.wsS = new LinkedList();
    this.ncU = new LinkedList();
    this.ncz = new LinkedList();
    AppMethodBeat.o(80099);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80100);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80100);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wsR);
      paramArrayOfObject.e(3, 8, this.wsS);
      paramArrayOfObject.iz(4, this.wsT);
      paramArrayOfObject.iz(5, this.wsU);
      paramArrayOfObject.e(6, 8, this.ncU);
      paramArrayOfObject.iz(7, this.wsV);
      paramArrayOfObject.e(8, 8, this.ncz);
      if (this.wsW != null)
      {
        paramArrayOfObject.iy(9, this.wsW.computeSize());
        this.wsW.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(80100);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1146;
    label1146: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wsR) + e.a.a.a.c(3, 8, this.wsS) + e.a.a.b.b.a.bs(4, this.wsT) + e.a.a.b.b.a.bs(5, this.wsU) + e.a.a.a.c(6, 8, this.ncU) + e.a.a.b.b.a.bs(7, this.wsV) + e.a.a.a.c(8, 8, this.ncz);
      paramInt = i;
      if (this.wsW != null)
        paramInt = i + e.a.a.a.ix(9, this.wsW.computeSize());
      AppMethodBeat.o(80100);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wsS.clear();
        this.ncU.clear();
        this.ncz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(80100);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80100);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aot localaot = (aot)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80100);
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
            localaot.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(80100);
          paramInt = i;
          break;
        case 2:
          localaot.wsR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80100);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bpe();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bpe)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaot.wsS.add(localObject1);
          }
          AppMethodBeat.o(80100);
          paramInt = i;
          break;
        case 4:
          localaot.wsT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80100);
          paramInt = i;
          break;
        case 5:
          localaot.wsU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80100);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaot.ncU.add(paramArrayOfObject);
          }
          AppMethodBeat.o(80100);
          paramInt = i;
          break;
        case 7:
          localaot.wsV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80100);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aro();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aro)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaot.ncz.add(localObject1);
          }
          AppMethodBeat.o(80100);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new arn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaot.wsW = paramArrayOfObject;
          }
          AppMethodBeat.o(80100);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80100);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aot
 * JD-Core Version:    0.6.2
 */