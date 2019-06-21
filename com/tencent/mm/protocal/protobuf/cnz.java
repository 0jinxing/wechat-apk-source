package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cnz extends btd
{
  public int fJT;
  public LinkedList<bts> vEg;
  public int wnW;
  public String xlz;

  public cnz()
  {
    AppMethodBeat.i(116815);
    this.vEg = new LinkedList();
    AppMethodBeat.o(116815);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(116816);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(116816);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.fJT);
      paramArrayOfObject.iz(3, this.wnW);
      paramArrayOfObject.e(4, 8, this.vEg);
      if (this.xlz != null)
        paramArrayOfObject.e(5, this.xlz);
      AppMethodBeat.o(116816);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label672;
    label672: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.fJT) + e.a.a.b.b.a.bs(3, this.wnW) + e.a.a.a.c(4, 8, this.vEg);
      paramInt = i;
      if (this.xlz != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.xlz);
      AppMethodBeat.o(116816);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEg.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(116816);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(116816);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnz localcnz = (cnz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(116816);
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
            localcnz.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(116816);
          paramInt = i;
          break;
        case 2:
          localcnz.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116816);
          paramInt = i;
          break;
        case 3:
          localcnz.wnW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116816);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnz.vEg.add(paramArrayOfObject);
          }
          AppMethodBeat.o(116816);
          paramInt = i;
          break;
        case 5:
          localcnz.xlz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116816);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(116816);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnz
 * JD-Core Version:    0.6.2
 */