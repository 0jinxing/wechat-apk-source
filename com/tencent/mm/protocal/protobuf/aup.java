package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aup extends bsr
{
  public String wbO;
  public String wyL;
  public LinkedList<String> wyM;

  public aup()
  {
    AppMethodBeat.i(11774);
    this.wyM = new LinkedList();
    AppMethodBeat.o(11774);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11775);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wbO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: corp_id");
        AppMethodBeat.o(11775);
        throw paramArrayOfObject;
      }
      if (this.wyL == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: bizchat_name");
        AppMethodBeat.o(11775);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wbO != null)
        paramArrayOfObject.e(2, this.wbO);
      if (this.wyL != null)
        paramArrayOfObject.e(3, this.wyL);
      paramArrayOfObject.e(4, 1, this.wyM);
      AppMethodBeat.o(11775);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label623;
    label623: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wbO != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wbO);
      i = paramInt;
      if (this.wyL != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wyL);
      paramInt = i + e.a.a.a.c(4, 1, this.wyM);
      AppMethodBeat.o(11775);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wyM.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wbO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: corp_id");
          AppMethodBeat.o(11775);
          throw paramArrayOfObject;
        }
        if (this.wyL == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: bizchat_name");
          AppMethodBeat.o(11775);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11775);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aup localaup = (aup)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11775);
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
            localaup.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(11775);
          paramInt = i;
          break;
        case 2:
          localaup.wbO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11775);
          paramInt = i;
          break;
        case 3:
          localaup.wyL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11775);
          paramInt = i;
          break;
        case 4:
          localaup.wyM.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(11775);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11775);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aup
 * JD-Core Version:    0.6.2
 */