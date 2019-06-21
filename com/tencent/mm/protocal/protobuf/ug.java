package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ug extends bsr
{
  public String wbO;
  public String wbP;
  public String wbQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11741);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wbO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: corp_id");
        AppMethodBeat.o(11741);
        throw paramArrayOfObject;
      }
      if (this.wbP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: qychat_type");
        AppMethodBeat.o(11741);
        throw paramArrayOfObject;
      }
      if (this.wbQ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: qychat_id");
        AppMethodBeat.o(11741);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wbO != null)
        paramArrayOfObject.e(2, this.wbO);
      if (this.wbP != null)
        paramArrayOfObject.e(3, this.wbP);
      if (this.wbQ != null)
        paramArrayOfObject.e(4, this.wbQ);
      AppMethodBeat.o(11741);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label674;
    label674: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wbO != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wbO);
      paramInt = i;
      if (this.wbP != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wbP);
      i = paramInt;
      if (this.wbQ != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wbQ);
      AppMethodBeat.o(11741);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wbO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: corp_id");
          AppMethodBeat.o(11741);
          throw paramArrayOfObject;
        }
        if (this.wbP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: qychat_type");
          AppMethodBeat.o(11741);
          throw paramArrayOfObject;
        }
        if (this.wbQ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: qychat_id");
          AppMethodBeat.o(11741);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11741);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ug localug = (ug)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11741);
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
            localug.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11741);
          paramInt = i;
          break;
        case 2:
          localug.wbO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11741);
          paramInt = i;
          break;
        case 3:
          localug.wbP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11741);
          paramInt = i;
          break;
        case 4:
          localug.wbQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11741);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11741);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ug
 * JD-Core Version:    0.6.2
 */