package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ald extends btd
{
  public int vEq;
  public int wqC;
  public LinkedList<bfj> wqD;
  public String wqE;
  public int wqF;

  public ald()
  {
    AppMethodBeat.i(28450);
    this.wqD = new LinkedList();
    AppMethodBeat.o(28450);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28451);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28451);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wqC);
      paramArrayOfObject.e(3, 8, this.wqD);
      if (this.wqE != null)
        paramArrayOfObject.e(4, this.wqE);
      paramArrayOfObject.iz(5, this.vEq);
      paramArrayOfObject.iz(6, this.wqF);
      AppMethodBeat.o(28451);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label736;
    label736: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wqC) + e.a.a.a.c(3, 8, this.wqD);
      paramInt = i;
      if (this.wqE != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wqE);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.vEq) + e.a.a.b.b.a.bs(6, this.wqF);
      AppMethodBeat.o(28451);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wqD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28451);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28451);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ald localald = (ald)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28451);
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
            localald.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28451);
          paramInt = i;
          break;
        case 2:
          localald.wqC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28451);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bfj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bfj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localald.wqD.add(localObject1);
          }
          AppMethodBeat.o(28451);
          paramInt = i;
          break;
        case 4:
          localald.wqE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28451);
          paramInt = i;
          break;
        case 5:
          localald.vEq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28451);
          paramInt = i;
          break;
        case 6:
          localald.wqF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28451);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28451);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ald
 * JD-Core Version:    0.6.2
 */