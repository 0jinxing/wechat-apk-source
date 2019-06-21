package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bkl extends btd
{
  public int kdT;
  public String kdU;
  public String wNA;
  public he wNB;
  public String wNC;
  public LinkedList<bkm> wNy;
  public long wNz;

  public bkl()
  {
    AppMethodBeat.i(56919);
    this.wNy = new LinkedList();
    AppMethodBeat.o(56919);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56920);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56920);
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
      paramArrayOfObject.e(4, 8, this.wNy);
      paramArrayOfObject.ai(5, this.wNz);
      if (this.wNA != null)
        paramArrayOfObject.e(6, this.wNA);
      if (this.wNB != null)
      {
        paramArrayOfObject.iy(7, this.wNB.computeSize());
        this.wNB.writeFields(paramArrayOfObject);
      }
      if (this.wNC != null)
        paramArrayOfObject.e(8, this.wNC);
      AppMethodBeat.o(56920);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label966;
    label966: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      paramInt = paramInt + e.a.a.a.c(4, 8, this.wNy) + e.a.a.b.b.a.o(5, this.wNz);
      i = paramInt;
      if (this.wNA != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wNA);
      paramInt = i;
      if (this.wNB != null)
        paramInt = i + e.a.a.a.ix(7, this.wNB.computeSize());
      i = paramInt;
      if (this.wNC != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wNC);
      AppMethodBeat.o(56920);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wNy.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56920);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56920);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bkl localbkl = (bkl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56920);
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
            localbkl.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56920);
          paramInt = i;
          break;
        case 2:
          localbkl.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56920);
          paramInt = i;
          break;
        case 3:
          localbkl.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56920);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bkm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkl.wNy.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56920);
          paramInt = i;
          break;
        case 5:
          localbkl.wNz = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56920);
          paramInt = i;
          break;
        case 6:
          localbkl.wNA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56920);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new he();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((he)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkl.wNB = ((he)localObject1);
          }
          AppMethodBeat.o(56920);
          paramInt = i;
          break;
        case 8:
          localbkl.wNC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56920);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56920);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bkl
 * JD-Core Version:    0.6.2
 */