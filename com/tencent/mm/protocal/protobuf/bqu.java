package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bqu extends btd
{
  public int jBv;
  public String vKq;
  public int wBg;
  public LinkedList<cmj> wTh;
  public cie wTi;

  public bqu()
  {
    AppMethodBeat.i(113790);
    this.wTh = new LinkedList();
    AppMethodBeat.o(113790);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(113791);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(113791);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jBv);
      paramArrayOfObject.e(3, 8, this.wTh);
      if (this.vKq != null)
        paramArrayOfObject.e(4, this.vKq);
      paramArrayOfObject.iz(5, this.wBg);
      if (this.wTi != null)
      {
        paramArrayOfObject.iy(6, this.wTi.computeSize());
        this.wTi.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(113791);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label831;
    label831: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jBv) + e.a.a.a.c(3, 8, this.wTh);
      paramInt = i;
      if (this.vKq != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vKq);
      i = paramInt + e.a.a.b.b.a.bs(5, this.wBg);
      paramInt = i;
      if (this.wTi != null)
        paramInt = i + e.a.a.a.ix(6, this.wTi.computeSize());
      AppMethodBeat.o(113791);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wTh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(113791);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(113791);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bqu localbqu = (bqu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(113791);
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
            localbqu.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(113791);
          paramInt = i;
          break;
        case 2:
          localbqu.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113791);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cmj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cmj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqu.wTh.add(localObject1);
          }
          AppMethodBeat.o(113791);
          paramInt = i;
          break;
        case 4:
          localbqu.vKq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(113791);
          paramInt = i;
          break;
        case 5:
          localbqu.wBg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113791);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cie();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqu.wTi = paramArrayOfObject;
          }
          AppMethodBeat.o(113791);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(113791);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqu
 * JD-Core Version:    0.6.2
 */