package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ub extends bsr
{
  public String fKh;
  public String vIk;
  public String wbq;
  public String wbr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28368);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wbq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DeviceId");
        AppMethodBeat.o(28368);
        throw paramArrayOfObject;
      }
      if (this.vIk == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DeviceType");
        AppMethodBeat.o(28368);
        throw paramArrayOfObject;
      }
      if (this.wbr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ClientInfo");
        AppMethodBeat.o(28368);
        throw paramArrayOfObject;
      }
      if (this.fKh == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppId");
        AppMethodBeat.o(28368);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wbq != null)
        paramArrayOfObject.e(2, this.wbq);
      if (this.vIk != null)
        paramArrayOfObject.e(3, this.vIk);
      if (this.wbr != null)
        paramArrayOfObject.e(4, this.wbr);
      if (this.fKh != null)
        paramArrayOfObject.e(5, this.fKh);
      AppMethodBeat.o(28368);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label786;
    label786: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wbq != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wbq);
      paramInt = i;
      if (this.vIk != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vIk);
      i = paramInt;
      if (this.wbr != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wbr);
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.fKh);
      AppMethodBeat.o(28368);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wbq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DeviceId");
          AppMethodBeat.o(28368);
          throw paramArrayOfObject;
        }
        if (this.vIk == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DeviceType");
          AppMethodBeat.o(28368);
          throw paramArrayOfObject;
        }
        if (this.wbr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ClientInfo");
          AppMethodBeat.o(28368);
          throw paramArrayOfObject;
        }
        if (this.fKh == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppId");
          AppMethodBeat.o(28368);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28368);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ub localub = (ub)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28368);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localub.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28368);
          paramInt = i;
          break;
        case 2:
          localub.wbq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28368);
          paramInt = i;
          break;
        case 3:
          localub.vIk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28368);
          paramInt = i;
          break;
        case 4:
          localub.wbr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28368);
          paramInt = i;
          break;
        case 5:
          localub.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28368);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28368);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ub
 * JD-Core Version:    0.6.2
 */