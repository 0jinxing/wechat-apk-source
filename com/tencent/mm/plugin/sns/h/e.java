package com.tencent.mm.plugin.sns.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cao;
import e.a.a.b;
import java.util.LinkedList;

public final class e extends com.tencent.mm.bt.a
{
  public cao qIS;
  public String qQm;
  public int qQn;
  public String qQo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(36828);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.qQm == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: clientID");
        AppMethodBeat.o(36828);
        throw paramArrayOfObject;
      }
      if (this.qIS == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: actionGroup");
        AppMethodBeat.o(36828);
        throw paramArrayOfObject;
      }
      if (this.qQm != null)
        paramArrayOfObject.e(1, this.qQm);
      if (this.qIS != null)
      {
        paramArrayOfObject.iy(2, this.qIS.computeSize());
        this.qIS.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.qQn);
      if (this.qQo != null)
        paramArrayOfObject.e(4, this.qQo);
      AppMethodBeat.o(36828);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.qQm == null)
        break label593;
    label593: for (paramInt = e.a.a.b.b.a.f(1, this.qQm) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.qIS != null)
        i = paramInt + e.a.a.a.ix(2, this.qIS.computeSize());
      i += e.a.a.b.b.a.bs(3, this.qQn);
      paramInt = i;
      if (this.qQo != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.qQo);
      AppMethodBeat.o(36828);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.qQm == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: clientID");
          AppMethodBeat.o(36828);
          throw paramArrayOfObject;
        }
        if (this.qIS == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: actionGroup");
          AppMethodBeat.o(36828);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(36828);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        e locale = (e)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(36828);
          break;
        case 1:
          locale.qQm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(36828);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cao();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cao)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locale.qIS = ((cao)localObject1);
          }
          AppMethodBeat.o(36828);
          paramInt = i;
          break;
        case 3:
          locale.qQn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(36828);
          paramInt = i;
          break;
        case 4:
          locale.qQo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(36828);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(36828);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.h.e
 * JD-Core Version:    0.6.2
 */