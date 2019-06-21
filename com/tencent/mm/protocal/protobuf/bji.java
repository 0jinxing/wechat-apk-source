package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bji extends btd
{
  public int luT;
  public String luU;
  public bjj wME;
  public bix wMF;
  public LinkedList<biw> wMG;
  public int wMH;

  public bji()
  {
    AppMethodBeat.i(56896);
    this.wMG = new LinkedList();
    AppMethodBeat.o(56896);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56897);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56897);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.luT);
      if (this.luU != null)
        paramArrayOfObject.e(3, this.luU);
      if (this.wME != null)
      {
        paramArrayOfObject.iy(4, this.wME.computeSize());
        this.wME.writeFields(paramArrayOfObject);
      }
      if (this.wMF != null)
      {
        paramArrayOfObject.iy(5, this.wMF.computeSize());
        this.wMF.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(6, 8, this.wMG);
      paramArrayOfObject.iz(7, this.wMH);
      AppMethodBeat.o(56897);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label991;
    label991: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.luT);
      paramInt = i;
      if (this.luU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.luU);
      i = paramInt;
      if (this.wME != null)
        i = paramInt + e.a.a.a.ix(4, this.wME.computeSize());
      paramInt = i;
      if (this.wMF != null)
        paramInt = i + e.a.a.a.ix(5, this.wMF.computeSize());
      paramInt = paramInt + e.a.a.a.c(6, 8, this.wMG) + e.a.a.b.b.a.bs(7, this.wMH);
      AppMethodBeat.o(56897);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wMG.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56897);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56897);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bji localbji = (bji)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56897);
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
            localbji.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56897);
          paramInt = i;
          break;
        case 2:
          localbji.luT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56897);
          paramInt = i;
          break;
        case 3:
          localbji.luU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56897);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bjj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbji.wME = paramArrayOfObject;
          }
          AppMethodBeat.o(56897);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bix();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bix)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbji.wMF = ((bix)localObject1);
          }
          AppMethodBeat.o(56897);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new biw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbji.wMG.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56897);
          paramInt = i;
          break;
        case 7:
          localbji.wMH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56897);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56897);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bji
 * JD-Core Version:    0.6.2
 */