package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class uh extends btd
{
  public String vNb;
  public bos vNh;
  public int wbR;
  public acr wbS;
  public kk wbT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11742);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(11742);
        throw paramArrayOfObject;
      }
      if (this.vNh == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: qy_base_resp");
        AppMethodBeat.o(11742);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vNh != null)
      {
        paramArrayOfObject.iy(2, this.vNh.computeSize());
        this.vNh.writeFields(paramArrayOfObject);
      }
      if (this.vNb != null)
        paramArrayOfObject.e(3, this.vNb);
      paramArrayOfObject.iz(4, this.wbR);
      if (this.wbS != null)
      {
        paramArrayOfObject.iy(5, this.wbS.computeSize());
        this.wbS.writeFields(paramArrayOfObject);
      }
      if (this.wbT != null)
      {
        paramArrayOfObject.iy(6, this.wbT.computeSize());
        this.wbT.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(11742);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1022;
    label1022: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vNh != null)
        paramInt = i + e.a.a.a.ix(2, this.vNh.computeSize());
      i = paramInt;
      if (this.vNb != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vNb);
      i += e.a.a.b.b.a.bs(4, this.wbR);
      paramInt = i;
      if (this.wbS != null)
        paramInt = i + e.a.a.a.ix(5, this.wbS.computeSize());
      i = paramInt;
      if (this.wbT != null)
        i = paramInt + e.a.a.a.ix(6, this.wbT.computeSize());
      AppMethodBeat.o(11742);
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
          AppMethodBeat.o(11742);
          throw paramArrayOfObject;
        }
        if (this.vNh == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: qy_base_resp");
          AppMethodBeat.o(11742);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11742);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        uh localuh = (uh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11742);
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
            localuh.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(11742);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bos();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuh.vNh = paramArrayOfObject;
          }
          AppMethodBeat.o(11742);
          paramInt = i;
          break;
        case 3:
          localuh.vNb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11742);
          paramInt = i;
          break;
        case 4:
          localuh.wbR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11742);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new acr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuh.wbS = paramArrayOfObject;
          }
          AppMethodBeat.o(11742);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new kk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuh.wbT = paramArrayOfObject;
          }
          AppMethodBeat.o(11742);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11742);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.uh
 * JD-Core Version:    0.6.2
 */