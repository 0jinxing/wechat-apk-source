package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bvd extends btd
{
  public String vKK;
  public bbv vKL;
  public asq vLi;
  public asr vLj;
  public int wWt;
  public da wWu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28625);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28625);
        throw paramArrayOfObject;
      }
      if (this.vKL == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Contact");
        AppMethodBeat.o(28625);
        throw paramArrayOfObject;
      }
      if (this.vLi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HardDevice");
        AppMethodBeat.o(28625);
        throw paramArrayOfObject;
      }
      if (this.vLj == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HardDeviceAttr");
        AppMethodBeat.o(28625);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vKL != null)
      {
        paramArrayOfObject.iy(2, this.vKL.computeSize());
        this.vKL.writeFields(paramArrayOfObject);
      }
      if (this.vLi != null)
      {
        paramArrayOfObject.iy(3, this.vLi.computeSize());
        this.vLi.writeFields(paramArrayOfObject);
      }
      if (this.vLj != null)
      {
        paramArrayOfObject.iy(4, this.vLj.computeSize());
        this.vLj.writeFields(paramArrayOfObject);
      }
      if (this.vKK != null)
        paramArrayOfObject.e(5, this.vKK);
      paramArrayOfObject.iz(6, this.wWt);
      if (this.wWu != null)
      {
        paramArrayOfObject.iy(7, this.wWu.computeSize());
        this.wWu.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28625);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1282;
    label1282: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vKL != null)
        paramInt = i + e.a.a.a.ix(2, this.vKL.computeSize());
      i = paramInt;
      if (this.vLi != null)
        i = paramInt + e.a.a.a.ix(3, this.vLi.computeSize());
      paramInt = i;
      if (this.vLj != null)
        paramInt = i + e.a.a.a.ix(4, this.vLj.computeSize());
      i = paramInt;
      if (this.vKK != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vKK);
      i += e.a.a.b.b.a.bs(6, this.wWt);
      paramInt = i;
      if (this.wWu != null)
        paramInt = i + e.a.a.a.ix(7, this.wWu.computeSize());
      AppMethodBeat.o(28625);
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
          AppMethodBeat.o(28625);
          throw paramArrayOfObject;
        }
        if (this.vKL == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Contact");
          AppMethodBeat.o(28625);
          throw paramArrayOfObject;
        }
        if (this.vLi == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HardDevice");
          AppMethodBeat.o(28625);
          throw paramArrayOfObject;
        }
        if (this.vLj == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HardDeviceAttr");
          AppMethodBeat.o(28625);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28625);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bvd localbvd = (bvd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28625);
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
            localbvd.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28625);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bbv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bbv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvd.vKL = ((bbv)localObject1);
          }
          AppMethodBeat.o(28625);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new asq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvd.vLi = paramArrayOfObject;
          }
          AppMethodBeat.o(28625);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new asr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((asr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvd.vLj = ((asr)localObject1);
          }
          AppMethodBeat.o(28625);
          paramInt = i;
          break;
        case 5:
          localbvd.vKK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28625);
          paramInt = i;
          break;
        case 6:
          localbvd.wWt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28625);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new da();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((da)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvd.wWu = ((da)localObject1);
          }
          AppMethodBeat.o(28625);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28625);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bvd
 * JD-Core Version:    0.6.2
 */