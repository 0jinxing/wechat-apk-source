package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ki extends bsr
{
  public String ctj;
  public int offset;
  public String vNb;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11706);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vNb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: brand_user_name");
        AppMethodBeat.o(11706);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vNb != null)
        paramArrayOfObject.e(2, this.vNb);
      if (this.ctj != null)
        paramArrayOfObject.e(3, this.ctj);
      paramArrayOfObject.iz(4, this.offset);
      AppMethodBeat.o(11706);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label558;
    label558: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vNb != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vNb);
      i = paramInt;
      if (this.ctj != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ctj);
      paramInt = i + e.a.a.b.b.a.bs(4, this.offset);
      AppMethodBeat.o(11706);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vNb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: brand_user_name");
          AppMethodBeat.o(11706);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11706);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ki localki = (ki)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11706);
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
            localki.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11706);
          paramInt = i;
          break;
        case 2:
          localki.vNb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11706);
          paramInt = i;
          break;
        case 3:
          localki.ctj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11706);
          paramInt = i;
          break;
        case 4:
          localki.offset = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11706);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11706);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ki
 * JD-Core Version:    0.6.2
 */