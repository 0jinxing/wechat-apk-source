package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aei extends btd
{
  public String vME;
  public String vMF;
  public bfu wmk;
  public int wml;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80064);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80064);
        throw paramArrayOfObject;
      }
      if (this.wmk == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppInfo");
        AppMethodBeat.o(80064);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wmk != null)
      {
        paramArrayOfObject.iy(2, this.wmk.computeSize());
        this.wmk.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wml);
      if (this.vMF != null)
        paramArrayOfObject.e(4, this.vMF);
      if (this.vME != null)
        paramArrayOfObject.e(5, this.vME);
      AppMethodBeat.o(80064);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label751;
    label751: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wmk != null)
        i = paramInt + e.a.a.a.ix(2, this.wmk.computeSize());
      i += e.a.a.b.b.a.bs(3, this.wml);
      paramInt = i;
      if (this.vMF != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vMF);
      i = paramInt;
      if (this.vME != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vME);
      AppMethodBeat.o(80064);
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
          AppMethodBeat.o(80064);
          throw paramArrayOfObject;
        }
        if (this.wmk == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppInfo");
          AppMethodBeat.o(80064);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80064);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aei localaei = (aei)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80064);
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
            localaei.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(80064);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bfu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaei.wmk = paramArrayOfObject;
          }
          AppMethodBeat.o(80064);
          paramInt = i;
          break;
        case 3:
          localaei.wml = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80064);
          paramInt = i;
          break;
        case 4:
          localaei.vMF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80064);
          paramInt = i;
          break;
        case 5:
          localaei.vME = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80064);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80064);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aei
 * JD-Core Version:    0.6.2
 */