package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aag extends btd
{
  public int lSN;
  public String lSO;
  public LinkedList<axh> vWz;
  public blr wfp;
  public String wfq;
  public String wfr;
  public String wfs;
  public String wft;
  public float wfu;
  public String wfv;

  public aag()
  {
    AppMethodBeat.i(839);
    this.vWz = new LinkedList();
    AppMethodBeat.o(839);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(840);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(840);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.vWz);
      if (this.wfp != null)
      {
        paramArrayOfObject.iy(3, this.wfp.computeSize());
        this.wfp.writeFields(paramArrayOfObject);
      }
      if (this.wfq != null)
        paramArrayOfObject.e(4, this.wfq);
      if (this.wfr != null)
        paramArrayOfObject.e(5, this.wfr);
      if (this.wfs != null)
        paramArrayOfObject.e(6, this.wfs);
      if (this.wft != null)
        paramArrayOfObject.e(7, this.wft);
      paramArrayOfObject.r(8, this.wfu);
      paramArrayOfObject.iz(9, this.lSN);
      if (this.lSO != null)
        paramArrayOfObject.e(10, this.lSO);
      if (this.wfv != null)
        paramArrayOfObject.e(11, this.wfv);
      AppMethodBeat.o(840);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1180;
    label1180: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 8, this.vWz);
      i = paramInt;
      if (this.wfp != null)
        i = paramInt + e.a.a.a.ix(3, this.wfp.computeSize());
      paramInt = i;
      if (this.wfq != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wfq);
      i = paramInt;
      if (this.wfr != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wfr);
      paramInt = i;
      if (this.wfs != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wfs);
      i = paramInt;
      if (this.wft != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wft);
      i = i + (e.a.a.b.b.a.fv(8) + 4) + e.a.a.b.b.a.bs(9, this.lSN);
      paramInt = i;
      if (this.lSO != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.lSO);
      i = paramInt;
      if (this.wfv != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.wfv);
      AppMethodBeat.o(840);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vWz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(840);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(840);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aag localaag = (aag)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(840);
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
            localaag.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((axh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaag.vWz.add(localObject1);
          }
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new blr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((blr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaag.wfp = ((blr)localObject1);
          }
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        case 4:
          localaag.wfq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        case 5:
          localaag.wfr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        case 6:
          localaag.wfs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        case 7:
          localaag.wft = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        case 8:
          localaag.wfu = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        case 9:
          localaag.lSN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        case 10:
          localaag.lSO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        case 11:
          localaag.wfv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(840);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(840);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aag
 * JD-Core Version:    0.6.2
 */