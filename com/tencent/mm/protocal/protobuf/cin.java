package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cin extends btd
{
  public String xhu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28673);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.xhu != null)
        paramArrayOfObject.e(2, this.xhu);
      AppMethodBeat.o(28673);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label398;
    label398: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xhu != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xhu);
      AppMethodBeat.o(28673);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28673);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cin localcin = (cin)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(28673);
          paramInt = -1;
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
            localcin.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28673);
          paramInt = i;
          break;
        case 2:
          localcin.xhu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28673);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28673);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cin
 * JD-Core Version:    0.6.2
 */