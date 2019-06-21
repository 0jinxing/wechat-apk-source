package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bfy extends btd
{
  public int kdT;
  public String kdU;
  public String vLb;
  public bks vLc;
  public bhg vLd;
  public String wJH;
  public String wJO;
  public aur wJP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48906);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48906);
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
      if (this.wJH != null)
        paramArrayOfObject.e(4, this.wJH);
      if (this.vLb != null)
        paramArrayOfObject.e(5, this.vLb);
      if (this.wJO != null)
        paramArrayOfObject.e(6, this.wJO);
      if (this.vLc != null)
      {
        paramArrayOfObject.iy(7, this.vLc.computeSize());
        this.vLc.writeFields(paramArrayOfObject);
      }
      if (this.vLd != null)
      {
        paramArrayOfObject.iy(8, this.vLd.computeSize());
        this.vLd.writeFields(paramArrayOfObject);
      }
      if (this.wJP != null)
      {
        paramArrayOfObject.iy(9, this.wJP.computeSize());
        this.wJP.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48906);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1154;
    label1154: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt;
      if (this.wJH != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wJH);
      paramInt = i;
      if (this.vLb != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vLb);
      i = paramInt;
      if (this.wJO != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wJO);
      paramInt = i;
      if (this.vLc != null)
        paramInt = i + e.a.a.a.ix(7, this.vLc.computeSize());
      i = paramInt;
      if (this.vLd != null)
        i = paramInt + e.a.a.a.ix(8, this.vLd.computeSize());
      paramInt = i;
      if (this.wJP != null)
        paramInt = i + e.a.a.a.ix(9, this.wJP.computeSize());
      AppMethodBeat.o(48906);
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
          AppMethodBeat.o(48906);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48906);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bfy localbfy = (bfy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48906);
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
            localbfy.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(48906);
          paramInt = i;
          break;
        case 2:
          localbfy.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48906);
          paramInt = i;
          break;
        case 3:
          localbfy.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48906);
          paramInt = i;
          break;
        case 4:
          localbfy.wJH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48906);
          paramInt = i;
          break;
        case 5:
          localbfy.vLb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48906);
          paramInt = i;
          break;
        case 6:
          localbfy.wJO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48906);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bks();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bks)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfy.vLc = ((bks)localObject1);
          }
          AppMethodBeat.o(48906);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bhg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfy.vLd = ((bhg)localObject1);
          }
          AppMethodBeat.o(48906);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aur();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aur)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfy.wJP = ((aur)localObject1);
          }
          AppMethodBeat.o(48906);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48906);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfy
 * JD-Core Version:    0.6.2
 */