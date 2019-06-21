package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class hv extends btd
{
  public int fJT;
  public LinkedList<String> vII;
  public int vKj;
  public LinkedList<xx> vKl;

  public hv()
  {
    AppMethodBeat.i(62521);
    this.vII = new LinkedList();
    this.vKl = new LinkedList();
    AppMethodBeat.o(62521);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62522);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(62522);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vKj);
      paramArrayOfObject.e(3, 1, this.vII);
      paramArrayOfObject.iz(4, this.fJT);
      paramArrayOfObject.e(5, 8, this.vKl);
      AppMethodBeat.o(62522);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label665;
    label665: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vKj) + e.a.a.a.c(3, 1, this.vII) + e.a.a.b.b.a.bs(4, this.fJT) + e.a.a.a.c(5, 8, this.vKl);
      AppMethodBeat.o(62522);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vII.clear();
        this.vKl.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(62522);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62522);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        hv localhv = (hv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62522);
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
            localhv.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(62522);
          paramInt = i;
          break;
        case 2:
          localhv.vKj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62522);
          paramInt = i;
          break;
        case 3:
          localhv.vII.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(62522);
          paramInt = i;
          break;
        case 4:
          localhv.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62522);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localhv.vKl.add(localObject1);
          }
          AppMethodBeat.o(62522);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62522);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hv
 * JD-Core Version:    0.6.2
 */