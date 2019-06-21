package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cjr extends bsr
{
  public String dFl;
  public String devicetype;
  public String oYp;
  public int xij;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28680);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.devicetype == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: devicetype");
        AppMethodBeat.o(28680);
        throw paramArrayOfObject;
      }
      if (this.oYp == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: deviceid");
        AppMethodBeat.o(28680);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.devicetype != null)
        paramArrayOfObject.e(2, this.devicetype);
      if (this.oYp != null)
        paramArrayOfObject.e(3, this.oYp);
      if (this.dFl != null)
        paramArrayOfObject.e(4, this.dFl);
      paramArrayOfObject.iz(5, this.xij);
      AppMethodBeat.o(28680);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label670;
    label670: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.devicetype != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.devicetype);
      i = paramInt;
      if (this.oYp != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.oYp);
      paramInt = i;
      if (this.dFl != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.dFl);
      paramInt += e.a.a.b.b.a.bs(5, this.xij);
      AppMethodBeat.o(28680);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.devicetype == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: devicetype");
          AppMethodBeat.o(28680);
          throw paramArrayOfObject;
        }
        if (this.oYp == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: deviceid");
          AppMethodBeat.o(28680);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28680);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cjr localcjr = (cjr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28680);
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
            localcjr.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28680);
          paramInt = i;
          break;
        case 2:
          localcjr.devicetype = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28680);
          paramInt = i;
          break;
        case 3:
          localcjr.oYp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28680);
          paramInt = i;
          break;
        case 4:
          localcjr.dFl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28680);
          paramInt = i;
          break;
        case 5:
          localcjr.xij = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28680);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28680);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cjr
 * JD-Core Version:    0.6.2
 */