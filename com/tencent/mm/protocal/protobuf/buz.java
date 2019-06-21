package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class buz extends btd
{
  public String wWr;
  public SKBuiltinBuffer_t wok;
  public long won;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62580);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(62580);
        throw paramArrayOfObject;
      }
      if (this.wWr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SearchResult");
        AppMethodBeat.o(62580);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wWr != null)
        paramArrayOfObject.e(2, this.wWr);
      if (this.wok != null)
      {
        paramArrayOfObject.iy(3, this.wok.computeSize());
        this.wok.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(4, this.won);
      AppMethodBeat.o(62580);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label688;
    label688: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wWr != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wWr);
      i = paramInt;
      if (this.wok != null)
        i = paramInt + e.a.a.a.ix(3, this.wok.computeSize());
      paramInt = i + e.a.a.b.b.a.o(4, this.won);
      AppMethodBeat.o(62580);
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
          AppMethodBeat.o(62580);
          throw paramArrayOfObject;
        }
        if (this.wWr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SearchResult");
          AppMethodBeat.o(62580);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62580);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        buz localbuz = (buz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62580);
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
            localbuz.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(62580);
          paramInt = i;
          break;
        case 2:
          localbuz.wWr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62580);
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
            localbuz.wok = paramArrayOfObject;
          }
          AppMethodBeat.o(62580);
          paramInt = i;
          break;
        case 4:
          localbuz.won = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(62580);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62580);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.buz
 * JD-Core Version:    0.6.2
 */