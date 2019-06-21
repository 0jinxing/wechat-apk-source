package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class fl extends btd
{
  public int kCl;
  public String kCm;
  public hd vHt;
  public String vHu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48774);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48774);
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
      if (this.vHt != null)
      {
        paramArrayOfObject.iy(4, this.vHt.computeSize());
        this.vHt.writeFields(paramArrayOfObject);
      }
      if (this.vHu != null)
        paramArrayOfObject.e(5, this.vHu);
      AppMethodBeat.o(48774);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label704;
    label704: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.kCl);
      i = paramInt;
      if (this.kCm != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kCm);
      paramInt = i;
      if (this.vHt != null)
        paramInt = i + e.a.a.a.ix(4, this.vHt.computeSize());
      i = paramInt;
      if (this.vHu != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vHu);
      AppMethodBeat.o(48774);
      paramInt = i;
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
          AppMethodBeat.o(48774);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48774);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fl localfl = (fl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48774);
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
            localfl.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(48774);
          paramInt = i;
          break;
        case 2:
          localfl.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48774);
          paramInt = i;
          break;
        case 3:
          localfl.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48774);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfl.vHt = ((hd)localObject1);
          }
          AppMethodBeat.o(48774);
          paramInt = i;
          break;
        case 5:
          localfl.vHu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48774);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48774);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fl
 * JD-Core Version:    0.6.2
 */