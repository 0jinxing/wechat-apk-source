package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class afe extends btd
{
  public int kCl;
  public String kCm;
  public LinkedList<String> ttN;
  public String wmE;

  public afe()
  {
    AppMethodBeat.i(56809);
    this.ttN = new LinkedList();
    AppMethodBeat.o(56809);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56810);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56810);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 1, this.ttN);
      paramArrayOfObject.iz(3, this.kCl);
      if (this.kCm != null)
        paramArrayOfObject.e(4, this.kCm);
      if (this.wmE != null)
        paramArrayOfObject.e(5, this.wmE);
      AppMethodBeat.o(56810);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label607;
    label607: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 1, this.ttN) + e.a.a.b.b.a.bs(3, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kCm);
      i = paramInt;
      if (this.wmE != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wmE);
      AppMethodBeat.o(56810);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.ttN.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56810);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56810);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        afe localafe = (afe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56810);
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
            localafe.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56810);
          paramInt = i;
          break;
        case 2:
          localafe.ttN.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(56810);
          paramInt = i;
          break;
        case 3:
          localafe.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56810);
          paramInt = i;
          break;
        case 4:
          localafe.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56810);
          paramInt = i;
          break;
        case 5:
          localafe.wmE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56810);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56810);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.afe
 * JD-Core Version:    0.6.2
 */