package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bnp extends btd
{
  public int kdT;
  public String kdU;
  public String tgu;
  public int wQn;
  public String wQo;
  public String wQp;
  public ase wQq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56939);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56939);
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
      paramArrayOfObject.iz(4, this.wQn);
      if (this.wQo != null)
        paramArrayOfObject.e(5, this.wQo);
      if (this.wQp != null)
        paramArrayOfObject.e(6, this.wQp);
      if (this.wQq != null)
      {
        paramArrayOfObject.iy(7, this.wQq.computeSize());
        this.wQq.writeFields(paramArrayOfObject);
      }
      if (this.tgu != null)
        paramArrayOfObject.e(100, this.tgu);
      AppMethodBeat.o(56939);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label914;
    label914: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt + e.a.a.b.b.a.bs(4, this.wQn);
      paramInt = i;
      if (this.wQo != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wQo);
      i = paramInt;
      if (this.wQp != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wQp);
      paramInt = i;
      if (this.wQq != null)
        paramInt = i + e.a.a.a.ix(7, this.wQq.computeSize());
      i = paramInt;
      if (this.tgu != null)
        i = paramInt + e.a.a.b.b.a.f(100, this.tgu);
      AppMethodBeat.o(56939);
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
          AppMethodBeat.o(56939);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56939);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnp localbnp = (bnp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56939);
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
            localbnp.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56939);
          paramInt = i;
          break;
        case 2:
          localbnp.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56939);
          paramInt = i;
          break;
        case 3:
          localbnp.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56939);
          paramInt = i;
          break;
        case 4:
          localbnp.wQn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56939);
          paramInt = i;
          break;
        case 5:
          localbnp.wQo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56939);
          paramInt = i;
          break;
        case 6:
          localbnp.wQp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56939);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ase();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ase)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnp.wQq = ((ase)localObject1);
          }
          AppMethodBeat.o(56939);
          paramInt = i;
          break;
        case 100:
          localbnp.tgu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56939);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56939);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnp
 * JD-Core Version:    0.6.2
 */