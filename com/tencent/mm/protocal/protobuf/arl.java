package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class arl extends bsr
{
  public String cMC;
  public String wvx;
  public int wvy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89108);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cMC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: card_id");
        AppMethodBeat.o(89108);
        throw paramArrayOfObject;
      }
      if (this.wvx == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: to_username");
        AppMethodBeat.o(89108);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.cMC != null)
        paramArrayOfObject.e(2, this.cMC);
      if (this.wvx != null)
        paramArrayOfObject.e(3, this.wvx);
      paramArrayOfObject.iz(4, this.wvy);
      AppMethodBeat.o(89108);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label593;
    label593: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.cMC != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.cMC);
      i = paramInt;
      if (this.wvx != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wvx);
      paramInt = i + e.a.a.b.b.a.bs(4, this.wvy);
      AppMethodBeat.o(89108);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.cMC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: card_id");
          AppMethodBeat.o(89108);
          throw paramArrayOfObject;
        }
        if (this.wvx == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: to_username");
          AppMethodBeat.o(89108);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(89108);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        arl localarl = (arl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89108);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localarl.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89108);
          paramInt = i;
          break;
        case 2:
          localarl.cMC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89108);
          paramInt = i;
          break;
        case 3:
          localarl.wvx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89108);
          paramInt = i;
          break;
        case 4:
          localarl.wvy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89108);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89108);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.arl
 * JD-Core Version:    0.6.2
 */