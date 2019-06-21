package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class agc extends btd
{
  public mw vMl;
  public mw vMm;
  public mw vMn;
  public SKBuiltinBuffer_t vMo;
  public SKBuiltinBuffer_t vMp;
  public mw vMq;
  public int vMr;
  public mv vMs;
  public mv vMt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80070);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80070);
        throw paramArrayOfObject;
      }
      if (this.vMl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DnsInfo");
        AppMethodBeat.o(80070);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vMl != null)
      {
        paramArrayOfObject.iy(2, this.vMl.computeSize());
        this.vMl.writeFields(paramArrayOfObject);
      }
      if (this.vMm != null)
      {
        paramArrayOfObject.iy(3, this.vMm.computeSize());
        this.vMm.writeFields(paramArrayOfObject);
      }
      if (this.vMn != null)
      {
        paramArrayOfObject.iy(4, this.vMn.computeSize());
        this.vMn.writeFields(paramArrayOfObject);
      }
      if (this.vMo != null)
      {
        paramArrayOfObject.iy(5, this.vMo.computeSize());
        this.vMo.writeFields(paramArrayOfObject);
      }
      if (this.vMp != null)
      {
        paramArrayOfObject.iy(6, this.vMp.computeSize());
        this.vMp.writeFields(paramArrayOfObject);
      }
      if (this.vMq != null)
      {
        paramArrayOfObject.iy(7, this.vMq.computeSize());
        this.vMq.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.vMr);
      if (this.vMs != null)
      {
        paramArrayOfObject.iy(9, this.vMs.computeSize());
        this.vMs.writeFields(paramArrayOfObject);
      }
      if (this.vMt != null)
      {
        paramArrayOfObject.iy(10, this.vMt.computeSize());
        this.vMt.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(80070);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1740;
    label1740: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vMl != null)
        i = paramInt + e.a.a.a.ix(2, this.vMl.computeSize());
      paramInt = i;
      if (this.vMm != null)
        paramInt = i + e.a.a.a.ix(3, this.vMm.computeSize());
      i = paramInt;
      if (this.vMn != null)
        i = paramInt + e.a.a.a.ix(4, this.vMn.computeSize());
      paramInt = i;
      if (this.vMo != null)
        paramInt = i + e.a.a.a.ix(5, this.vMo.computeSize());
      i = paramInt;
      if (this.vMp != null)
        i = paramInt + e.a.a.a.ix(6, this.vMp.computeSize());
      paramInt = i;
      if (this.vMq != null)
        paramInt = i + e.a.a.a.ix(7, this.vMq.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(8, this.vMr);
      paramInt = i;
      if (this.vMs != null)
        paramInt = i + e.a.a.a.ix(9, this.vMs.computeSize());
      i = paramInt;
      if (this.vMt != null)
        i = paramInt + e.a.a.a.ix(10, this.vMt.computeSize());
      AppMethodBeat.o(80070);
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
          AppMethodBeat.o(80070);
          throw paramArrayOfObject;
        }
        if (this.vMl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DnsInfo");
          AppMethodBeat.o(80070);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80070);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agc localagc = (agc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80070);
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
            localagc.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(80070);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagc.vMl = ((mw)localObject1);
          }
          AppMethodBeat.o(80070);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagc.vMm = ((mw)localObject1);
          }
          AppMethodBeat.o(80070);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagc.vMn = paramArrayOfObject;
          }
          AppMethodBeat.o(80070);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagc.vMo = paramArrayOfObject;
          }
          AppMethodBeat.o(80070);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagc.vMp = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80070);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagc.vMq = paramArrayOfObject;
          }
          AppMethodBeat.o(80070);
          paramInt = i;
          break;
        case 8:
          localagc.vMr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80070);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagc.vMs = ((mv)localObject1);
          }
          AppMethodBeat.o(80070);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagc.vMt = ((mv)localObject1);
          }
          AppMethodBeat.o(80070);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80070);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agc
 * JD-Core Version:    0.6.2
 */