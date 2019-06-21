package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class apq extends bsr
{
  public String lCH;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28478);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: username");
        AppMethodBeat.o(28478);
        throw paramArrayOfObject;
      }
      if (this.lCH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: appusername");
        AppMethodBeat.o(28478);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.username != null)
        paramArrayOfObject.e(2, this.username);
      if (this.lCH != null)
        paramArrayOfObject.e(3, this.lCH);
      AppMethodBeat.o(28478);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label562;
    label562: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.username != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.username);
      i = paramInt;
      if (this.lCH != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.lCH);
      AppMethodBeat.o(28478);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.username == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: username");
          AppMethodBeat.o(28478);
          throw paramArrayOfObject;
        }
        if (this.lCH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: appusername");
          AppMethodBeat.o(28478);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28478);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        apq localapq = (apq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28478);
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
            localapq.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28478);
          paramInt = i;
          break;
        case 2:
          localapq.username = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28478);
          paramInt = i;
          break;
        case 3:
          localapq.lCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28478);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28478);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.apq
 * JD-Core Version:    0.6.2
 */