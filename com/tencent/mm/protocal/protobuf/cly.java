package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cly extends btd
{
  public int fJT;
  public String ndF;
  public String ndG;
  public int pcX;
  public int ptD;
  public long ptF;
  public String vFF;
  public int vOq;
  public int wdn;
  public int wdp;
  public int wdq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(116812);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(116812);
        throw paramArrayOfObject;
      }
      if (this.ndG != null)
        paramArrayOfObject.e(1, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(2, this.ndF);
      paramArrayOfObject.iz(3, this.vOq);
      paramArrayOfObject.iz(4, this.wdn);
      paramArrayOfObject.iz(5, this.pcX);
      if (this.vFF != null)
        paramArrayOfObject.e(6, this.vFF);
      paramArrayOfObject.iz(7, this.ptD);
      paramArrayOfObject.iz(8, this.wdp);
      paramArrayOfObject.iz(9, this.fJT);
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(10, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(11, this.wdq);
      paramArrayOfObject.ai(12, this.ptF);
      AppMethodBeat.o(116812);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ndG == null)
        break label941;
    label941: for (paramInt = e.a.a.b.b.a.f(1, this.ndG) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ndF);
      i = i + e.a.a.b.b.a.bs(3, this.vOq) + e.a.a.b.b.a.bs(4, this.wdn) + e.a.a.b.b.a.bs(5, this.pcX);
      paramInt = i;
      if (this.vFF != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vFF);
      i = paramInt + e.a.a.b.b.a.bs(7, this.ptD) + e.a.a.b.b.a.bs(8, this.wdp) + e.a.a.b.b.a.bs(9, this.fJT);
      paramInt = i;
      if (this.BaseResponse != null)
        paramInt = i + e.a.a.a.ix(10, this.BaseResponse.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(11, this.wdq) + e.a.a.b.b.a.o(12, this.ptF);
      AppMethodBeat.o(116812);
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
          AppMethodBeat.o(116812);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(116812);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cly localcly = (cly)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(116812);
          break;
        case 1:
          localcly.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 2:
          localcly.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 3:
          localcly.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 4:
          localcly.wdn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 5:
          localcly.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 6:
          localcly.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 7:
          localcly.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 8:
          localcly.wdp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 9:
          localcly.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcly.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 11:
          localcly.wdq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        case 12:
          localcly.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(116812);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(116812);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cly
 * JD-Core Version:    0.6.2
 */