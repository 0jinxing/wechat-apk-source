package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class alx extends btd
{
  public int jBv;
  public LinkedList<bic> jBw;
  public int jCt;
  public int vQe;
  public int wqX;

  public alx()
  {
    AppMethodBeat.i(80093);
    this.jBw = new LinkedList();
    AppMethodBeat.o(80093);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80094);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80094);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jBv);
      paramArrayOfObject.e(3, 8, this.jBw);
      paramArrayOfObject.iz(4, this.vQe);
      paramArrayOfObject.iz(5, this.wqX);
      paramArrayOfObject.iz(6, this.jCt);
      AppMethodBeat.o(80094);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label700;
    label700: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.jBv) + e.a.a.a.c(3, 8, this.jBw) + e.a.a.b.b.a.bs(4, this.vQe) + e.a.a.b.b.a.bs(5, this.wqX) + e.a.a.b.b.a.bs(6, this.jCt);
      AppMethodBeat.o(80094);
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
          AppMethodBeat.o(80094);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80094);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        alx localalx = (alx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80094);
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
            localalx.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(80094);
          paramInt = i;
          break;
        case 2:
          localalx.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80094);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bic();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bic)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localalx.jBw.add(localObject1);
          }
          AppMethodBeat.o(80094);
          paramInt = i;
          break;
        case 4:
          localalx.vQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80094);
          paramInt = i;
          break;
        case 5:
          localalx.wqX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80094);
          paramInt = i;
          break;
        case 6:
          localalx.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80094);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80094);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.alx
 * JD-Core Version:    0.6.2
 */