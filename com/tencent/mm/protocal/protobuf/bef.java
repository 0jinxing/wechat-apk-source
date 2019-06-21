package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bef extends btd
{
  public int fJT;
  public String pZE;
  public String pZF;
  public com.tencent.mm.bt.b wHQ;
  public float wHU;
  public LinkedList<cit> wpm;

  public bef()
  {
    AppMethodBeat.i(81503);
    this.wpm = new LinkedList();
    AppMethodBeat.o(81503);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(81504);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(81504);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.fJT);
      paramArrayOfObject.e(3, 8, this.wpm);
      if (this.wHQ != null)
        paramArrayOfObject.c(4, this.wHQ);
      paramArrayOfObject.r(5, this.wHU);
      if (this.pZE != null)
        paramArrayOfObject.e(6, this.pZE);
      if (this.pZF != null)
        paramArrayOfObject.e(7, this.pZF);
      AppMethodBeat.o(81504);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label805;
    label805: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.fJT) + e.a.a.a.c(3, 8, this.wpm);
      paramInt = i;
      if (this.wHQ != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.wHQ);
      i = paramInt + (e.a.a.b.b.a.fv(5) + 4);
      paramInt = i;
      if (this.pZE != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.pZE);
      i = paramInt;
      if (this.pZF != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.pZF);
      AppMethodBeat.o(81504);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wpm.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(81504);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(81504);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bef localbef = (bef)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(81504);
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
            localbef.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(81504);
          paramInt = i;
          break;
        case 2:
          localbef.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(81504);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cit();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cit)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbef.wpm.add(localObject1);
          }
          AppMethodBeat.o(81504);
          paramInt = i;
          break;
        case 4:
          localbef.wHQ = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(81504);
          paramInt = i;
          break;
        case 5:
          localbef.wHU = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(81504);
          paramInt = i;
          break;
        case 6:
          localbef.pZE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(81504);
          paramInt = i;
          break;
        case 7:
          localbef.pZF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(81504);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(81504);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bef
 * JD-Core Version:    0.6.2
 */