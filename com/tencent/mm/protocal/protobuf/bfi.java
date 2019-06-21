package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bfi extends btd
{
  public int kdT;
  public String kdU;
  public String tgu;
  public azb wJa;
  public int wJb;
  public int wJc;
  public int wJd;
  public LinkedList<xg> wJe;
  public LinkedList<bqr> wJf;
  public LinkedList<hc> wJg;

  public bfi()
  {
    AppMethodBeat.i(56869);
    this.wJe = new LinkedList();
    this.wJf = new LinkedList();
    this.wJg = new LinkedList();
    AppMethodBeat.o(56869);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56870);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56870);
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
      paramArrayOfObject.iz(4, this.wJb);
      paramArrayOfObject.iz(5, this.wJc);
      paramArrayOfObject.iz(6, this.wJd);
      paramArrayOfObject.e(8, 8, this.wJe);
      if (this.wJa != null)
      {
        paramArrayOfObject.iy(9, this.wJa.computeSize());
        this.wJa.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(10, 8, this.wJf);
      paramArrayOfObject.e(11, 8, this.wJg);
      if (this.tgu != null)
        paramArrayOfObject.e(100, this.tgu);
      AppMethodBeat.o(56870);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1320;
    label1320: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt + e.a.a.b.b.a.bs(4, this.wJb) + e.a.a.b.b.a.bs(5, this.wJc) + e.a.a.b.b.a.bs(6, this.wJd) + e.a.a.a.c(8, 8, this.wJe);
      paramInt = i;
      if (this.wJa != null)
        paramInt = i + e.a.a.a.ix(9, this.wJa.computeSize());
      i = paramInt + e.a.a.a.c(10, 8, this.wJf) + e.a.a.a.c(11, 8, this.wJg);
      paramInt = i;
      if (this.tgu != null)
        paramInt = i + e.a.a.b.b.a.f(100, this.tgu);
      AppMethodBeat.o(56870);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wJe.clear();
        this.wJf.clear();
        this.wJg.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56870);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56870);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bfi localbfi = (bfi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56870);
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
            localbfi.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        case 2:
          localbfi.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        case 3:
          localbfi.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        case 4:
          localbfi.wJb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        case 5:
          localbfi.wJc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        case 6:
          localbfi.wJd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfi.wJe.add(localObject1);
          }
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new azb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfi.wJa = paramArrayOfObject;
          }
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bqr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bqr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfi.wJf.add(localObject1);
          }
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfi.wJg.add(localObject1);
          }
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        case 100:
          localbfi.tgu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56870);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56870);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfi
 * JD-Core Version:    0.6.2
 */