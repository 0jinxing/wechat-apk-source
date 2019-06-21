package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class kq extends btd
{
  public String ProductID;
  public int jCt;
  public String vNK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11716);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(11716);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jCt);
      if (this.vNK != null)
        paramArrayOfObject.e(3, this.vNK);
      if (this.ProductID != null)
        paramArrayOfObject.e(4, this.ProductID);
      AppMethodBeat.o(11716);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label558;
    label558: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCt);
      paramInt = i;
      if (this.vNK != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vNK);
      i = paramInt;
      if (this.ProductID != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ProductID);
      AppMethodBeat.o(11716);
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
          AppMethodBeat.o(11716);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11716);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        kq localkq = (kq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11716);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localkq.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(11716);
          paramInt = i;
          break;
        case 2:
          localkq.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11716);
          paramInt = i;
          break;
        case 3:
          localkq.vNK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11716);
          paramInt = i;
          break;
        case 4:
          localkq.ProductID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11716);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11716);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.kq
 * JD-Core Version:    0.6.2
 */