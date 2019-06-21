package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ccb extends btd
{
  public int OpCode;
  public int jBv;
  public LinkedList<cbz> jBw;
  public int qJO;
  public String xbu;

  public ccb()
  {
    AppMethodBeat.i(94609);
    this.jBw = new LinkedList();
    AppMethodBeat.o(94609);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94610);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(94610);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.OpCode);
      if (this.xbu != null)
        paramArrayOfObject.e(3, this.xbu);
      paramArrayOfObject.iz(4, this.jBv);
      paramArrayOfObject.e(5, 8, this.jBw);
      paramArrayOfObject.iz(6, this.qJO);
      AppMethodBeat.o(94610);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label718;
    label718: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.OpCode);
      paramInt = i;
      if (this.xbu != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xbu);
      paramInt = paramInt + e.a.a.b.b.a.bs(4, this.jBv) + e.a.a.a.c(5, 8, this.jBw) + e.a.a.b.b.a.bs(6, this.qJO);
      AppMethodBeat.o(94610);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.jBw.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(94610);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94610);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ccb localccb = (ccb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94610);
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
            localccb.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(94610);
          paramInt = i;
          break;
        case 2:
          localccb.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94610);
          paramInt = i;
          break;
        case 3:
          localccb.xbu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94610);
          paramInt = i;
          break;
        case 4:
          localccb.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94610);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cbz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localccb.jBw.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94610);
          paramInt = i;
          break;
        case 6:
          localccb.qJO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94610);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94610);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccb
 * JD-Core Version:    0.6.2
 */