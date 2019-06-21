package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bao extends btd
{
  public String kbH;
  public int kbI;
  public String kbJ;
  public String kdS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89112);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(89112);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.kbH != null)
        paramArrayOfObject.e(2, this.kbH);
      paramArrayOfObject.iz(3, this.kbI);
      if (this.kbJ != null)
        paramArrayOfObject.e(4, this.kbJ);
      if (this.kdS != null)
        paramArrayOfObject.e(5, this.kdS);
      AppMethodBeat.o(89112);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label611;
    label611: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kbH != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kbH);
      i += e.a.a.b.b.a.bs(3, this.kbI);
      paramInt = i;
      if (this.kbJ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kbJ);
      i = paramInt;
      if (this.kdS != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.kdS);
      AppMethodBeat.o(89112);
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
          AppMethodBeat.o(89112);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(89112);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bao localbao = (bao)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89112);
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
            localbao.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(89112);
          paramInt = i;
          break;
        case 2:
          localbao.kbH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89112);
          paramInt = i;
          break;
        case 3:
          localbao.kbI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89112);
          paramInt = i;
          break;
        case 4:
          localbao.kbJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89112);
          paramInt = i;
          break;
        case 5:
          localbao.kdS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89112);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89112);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bao
 * JD-Core Version:    0.6.2
 */