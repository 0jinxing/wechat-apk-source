package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class beo extends btd
{
  public int vOn;
  public int vOr;
  public String wIF;
  public String wIG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(81506);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(81506);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vOn);
      if (this.wIF != null)
        paramArrayOfObject.e(3, this.wIF);
      if (this.wIG != null)
        paramArrayOfObject.e(4, this.wIG);
      paramArrayOfObject.iz(5, this.vOr);
      AppMethodBeat.o(81506);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label591;
    label591: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vOn);
      paramInt = i;
      if (this.wIF != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wIF);
      i = paramInt;
      if (this.wIG != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wIG);
      paramInt = i + e.a.a.b.b.a.bs(5, this.vOr);
      AppMethodBeat.o(81506);
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
          AppMethodBeat.o(81506);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(81506);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        beo localbeo = (beo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(81506);
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
            localbeo.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(81506);
          paramInt = i;
          break;
        case 2:
          localbeo.vOn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(81506);
          paramInt = i;
          break;
        case 3:
          localbeo.wIF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(81506);
          paramInt = i;
          break;
        case 4:
          localbeo.wIG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(81506);
          paramInt = i;
          break;
        case 5:
          localbeo.vOr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(81506);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(81506);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.beo
 * JD-Core Version:    0.6.2
 */