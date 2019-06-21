package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class oh extends btd
{
  public int vQe;
  public SKBuiltinBuffer_t vTO;
  public tc vTR;
  public int vTS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114433);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(114433);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vTR != null)
      {
        paramArrayOfObject.iy(2, this.vTR.computeSize());
        this.vTR.writeFields(paramArrayOfObject);
      }
      if (this.vTO != null)
      {
        paramArrayOfObject.iy(3, this.vTO.computeSize());
        this.vTO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.vQe);
      paramArrayOfObject.iz(5, this.vTS);
      AppMethodBeat.o(114433);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label780;
    label780: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vTR != null)
        paramInt = i + e.a.a.a.ix(2, this.vTR.computeSize());
      i = paramInt;
      if (this.vTO != null)
        i = paramInt + e.a.a.a.ix(3, this.vTO.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(4, this.vQe) + e.a.a.b.b.a.bs(5, this.vTS);
      AppMethodBeat.o(114433);
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
          AppMethodBeat.o(114433);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(114433);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        oh localoh = (oh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114433);
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
            localoh.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(114433);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localoh.vTR = paramArrayOfObject;
          }
          AppMethodBeat.o(114433);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localoh.vTO = paramArrayOfObject;
          }
          AppMethodBeat.o(114433);
          paramInt = i;
          break;
        case 4:
          localoh.vQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(114433);
          paramInt = i;
          break;
        case 5:
          localoh.vTS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(114433);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114433);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.oh
 * JD-Core Version:    0.6.2
 */