package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bck extends com.tencent.mm.bt.a
{
  public String wGA;
  public bkg wGw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28555);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wGA == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ContactUsername");
        AppMethodBeat.o(28555);
        throw paramArrayOfObject;
      }
      if (this.wGw == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PhoneNumListInfo");
        AppMethodBeat.o(28555);
        throw paramArrayOfObject;
      }
      if (this.wGA != null)
        paramArrayOfObject.e(1, this.wGA);
      if (this.wGw != null)
      {
        paramArrayOfObject.iy(2, this.wGw.computeSize());
        this.wGw.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28555);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wGA == null)
        break label498;
    label498: for (paramInt = e.a.a.b.b.a.f(1, this.wGA) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wGw != null)
        i = paramInt + e.a.a.a.ix(2, this.wGw.computeSize());
      AppMethodBeat.o(28555);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wGA == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ContactUsername");
          AppMethodBeat.o(28555);
          throw paramArrayOfObject;
        }
        if (this.wGw == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PhoneNumListInfo");
          AppMethodBeat.o(28555);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28555);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bck localbck = (bck)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(28555);
          paramInt = -1;
          break;
        case 1:
          localbck.wGA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28555);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bkg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbck.wGw = paramArrayOfObject;
          }
          AppMethodBeat.o(28555);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28555);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bck
 * JD-Core Version:    0.6.2
 */