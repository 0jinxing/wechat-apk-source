package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bup extends bsr
{
  public String category;
  public String mac;
  public String userName;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28622);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mac == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: mac");
        AppMethodBeat.o(28622);
        throw paramArrayOfObject;
      }
      if (this.userName == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: userName");
        AppMethodBeat.o(28622);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.mac != null)
        paramArrayOfObject.e(2, this.mac);
      if (this.userName != null)
        paramArrayOfObject.e(3, this.userName);
      if (this.category != null)
        paramArrayOfObject.e(4, this.category);
      AppMethodBeat.o(28622);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label622;
    label622: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mac != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mac);
      i = paramInt;
      if (this.userName != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.userName);
      paramInt = i;
      if (this.category != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.category);
      AppMethodBeat.o(28622);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mac == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: mac");
          AppMethodBeat.o(28622);
          throw paramArrayOfObject;
        }
        if (this.userName == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: userName");
          AppMethodBeat.o(28622);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28622);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bup localbup = (bup)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28622);
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
            localbup.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28622);
          paramInt = i;
          break;
        case 2:
          localbup.mac = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28622);
          paramInt = i;
          break;
        case 3:
          localbup.userName = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28622);
          paramInt = i;
          break;
        case 4:
          localbup.category = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28622);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28622);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bup
 * JD-Core Version:    0.6.2
 */