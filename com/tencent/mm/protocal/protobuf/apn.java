package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class apn extends btd
{
  public int vIc;
  public LinkedList<String> wtA;
  public String wty;
  public String wtz;

  public apn()
  {
    AppMethodBeat.i(102379);
    this.wtA = new LinkedList();
    AppMethodBeat.o(102379);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102380);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(102380);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wty != null)
        paramArrayOfObject.e(2, this.wty);
      paramArrayOfObject.iz(3, this.vIc);
      if (this.wtz != null)
        paramArrayOfObject.e(4, this.wtz);
      paramArrayOfObject.e(5, 1, this.wtA);
      AppMethodBeat.o(102380);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label607;
    label607: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wty != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wty);
      i += e.a.a.b.b.a.bs(3, this.vIc);
      paramInt = i;
      if (this.wtz != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wtz);
      paramInt += e.a.a.a.c(5, 1, this.wtA);
      AppMethodBeat.o(102380);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wtA.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(102380);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(102380);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        apn localapn = (apn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102380);
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
            localapn.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(102380);
          paramInt = i;
          break;
        case 2:
          localapn.wty = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102380);
          paramInt = i;
          break;
        case 3:
          localapn.vIc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102380);
          paramInt = i;
          break;
        case 4:
          localapn.wtz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102380);
          paramInt = i;
          break;
        case 5:
          localapn.wtA.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(102380);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102380);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.apn
 * JD-Core Version:    0.6.2
 */