package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ou extends btd
{
  public int kCl;
  public String kCm;
  public String kCn;
  public String vVU;
  public LinkedList<zr> vVV;

  public ou()
  {
    AppMethodBeat.i(56747);
    this.vVV = new LinkedList();
    AppMethodBeat.o(56747);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56748);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56748);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kCl);
      if (this.kCm != null)
        paramArrayOfObject.e(3, this.kCm);
      if (this.vVU != null)
        paramArrayOfObject.e(4, this.vVU);
      if (this.kCn != null)
        paramArrayOfObject.e(5, this.kCn);
      paramArrayOfObject.e(6, 8, this.vVV);
      AppMethodBeat.o(56748);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label755;
    label755: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.kCl);
      i = paramInt;
      if (this.kCm != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kCm);
      paramInt = i;
      if (this.vVU != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vVU);
      i = paramInt;
      if (this.kCn != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.kCn);
      paramInt = i + e.a.a.a.c(6, 8, this.vVV);
      AppMethodBeat.o(56748);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vVV.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56748);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56748);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ou localou = (ou)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56748);
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
            localou.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56748);
          paramInt = i;
          break;
        case 2:
          localou.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56748);
          paramInt = i;
          break;
        case 3:
          localou.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56748);
          paramInt = i;
          break;
        case 4:
          localou.vVU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56748);
          paramInt = i;
          break;
        case 5:
          localou.kCn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56748);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new zr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localou.vVV.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56748);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56748);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ou
 * JD-Core Version:    0.6.2
 */