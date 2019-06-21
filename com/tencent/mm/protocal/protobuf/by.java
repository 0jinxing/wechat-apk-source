package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class by extends bsr
{
  public String vEf;
  public LinkedList<String> vEg;

  public by()
  {
    AppMethodBeat.i(118262);
    this.vEg = new LinkedList();
    AppMethodBeat.o(118262);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(118263);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ChatRoomName");
        AppMethodBeat.o(118263);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vEf != null)
        paramArrayOfObject.e(2, this.vEf);
      paramArrayOfObject.e(3, 1, this.vEg);
      AppMethodBeat.o(118263);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label497;
    label497: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vEf != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vEf);
      paramInt = i + e.a.a.a.c(3, 1, this.vEg);
      AppMethodBeat.o(118263);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEg.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ChatRoomName");
          AppMethodBeat.o(118263);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(118263);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        by localby = (by)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(118263);
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
            localby.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(118263);
          paramInt = i;
          break;
        case 2:
          localby.vEf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(118263);
          paramInt = i;
          break;
        case 3:
          localby.vEg.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(118263);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(118263);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.by
 * JD-Core Version:    0.6.2
 */