package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class xo extends btd
{
  public int fJT;
  public int ptD;
  public long ptF;
  public SKBuiltinBuffer_t ptz;
  public String vFF;
  public int vOq;
  public int wdn;
  public int wdp;
  public int wdq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(116803);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(116803);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(116803);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.ptD);
      paramArrayOfObject.iz(2, this.vOq);
      paramArrayOfObject.iz(3, this.wdn);
      paramArrayOfObject.iz(5, this.wdp);
      if (this.vFF != null)
        paramArrayOfObject.e(6, this.vFF);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(7, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.fJT);
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(9, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(10, this.wdq);
      paramArrayOfObject.ai(11, this.ptF);
      AppMethodBeat.o(116803);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ptD) + 0 + e.a.a.b.b.a.bs(2, this.vOq) + e.a.a.b.b.a.bs(3, this.wdn) + e.a.a.b.b.a.bs(5, this.wdp);
        paramInt = i;
        if (this.vFF != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.vFF);
        i = paramInt;
        if (this.ptz != null)
          i = paramInt + e.a.a.a.ix(7, this.ptz.computeSize());
        i += e.a.a.b.b.a.bs(8, this.fJT);
        paramInt = i;
        if (this.BaseResponse != null)
          paramInt = i + e.a.a.a.ix(9, this.BaseResponse.computeSize());
        paramInt = paramInt + e.a.a.b.b.a.bs(10, this.wdq) + e.a.a.b.b.a.o(11, this.ptF);
        AppMethodBeat.o(116803);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(116803);
          throw paramArrayOfObject;
        }
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(116803);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(116803);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xo localxo = (xo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 4:
        default:
          paramInt = -1;
          AppMethodBeat.o(116803);
          break;
        case 1:
          localxo.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116803);
          paramInt = 0;
          break;
        case 2:
          localxo.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116803);
          paramInt = 0;
          break;
        case 3:
          localxo.wdn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116803);
          paramInt = 0;
          break;
        case 5:
          localxo.wdp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116803);
          paramInt = 0;
          break;
        case 6:
          localxo.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116803);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxo.ptz = paramArrayOfObject;
          }
          AppMethodBeat.o(116803);
          paramInt = 0;
          break;
        case 8:
          localxo.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116803);
          paramInt = 0;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxo.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(116803);
          paramInt = 0;
          break;
        case 10:
          localxo.wdq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116803);
          paramInt = 0;
          break;
        case 11:
          localxo.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(116803);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(116803);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xo
 * JD-Core Version:    0.6.2
 */