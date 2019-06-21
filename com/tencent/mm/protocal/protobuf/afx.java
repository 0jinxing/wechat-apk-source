package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class afx extends bsr
{
  public int Cn;
  public String data;
  public String wbO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11767);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wbO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: corp_id");
        AppMethodBeat.o(11767);
        throw paramArrayOfObject;
      }
      if (this.data == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: data");
        AppMethodBeat.o(11767);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wbO != null)
        paramArrayOfObject.e(2, this.wbO);
      paramArrayOfObject.iz(3, this.Cn);
      if (this.data != null)
        paramArrayOfObject.e(4, this.data);
      AppMethodBeat.o(11767);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label610;
    label610: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wbO != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wbO);
      i += e.a.a.b.b.a.bs(3, this.Cn);
      paramInt = i;
      if (this.data != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.data);
      AppMethodBeat.o(11767);
      break;
      Object localObject1;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        localObject1 = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber((e.a.a.a.a)localObject1); paramInt > 0; paramInt = bsr.getNextFieldNumber((e.a.a.a.a)localObject1))
          if (!super.populateBuilderWithField((e.a.a.a.a)localObject1, this, paramInt))
            ((e.a.a.a.a)localObject1).ems();
        if (this.wbO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: corp_id");
          AppMethodBeat.o(11767);
          throw paramArrayOfObject;
        }
        if (paramArrayOfObject == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: data");
          AppMethodBeat.o(11767);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11767);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject2 = (e.a.a.a.a)paramArrayOfObject[0];
        localObject1 = (afx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11767);
          break;
        case 1:
          localObject2 = ((e.a.a.a.a)localObject2).Vh(paramInt);
          int j = ((LinkedList)localObject2).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject3 = (byte[])((LinkedList)localObject2).get(paramInt);
            paramArrayOfObject = new hl();
            localObject3 = new e.a.a.a.a((byte[])localObject3, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject3, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject3)));
            ((afx)localObject1).BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11767);
          paramInt = i;
          break;
        case 2:
          ((afx)localObject1).wbO = ((e.a.a.a.a)localObject2).BTU.readString();
          AppMethodBeat.o(11767);
          paramInt = i;
          break;
        case 3:
          ((afx)localObject1).Cn = ((e.a.a.a.a)localObject2).BTU.vd();
          AppMethodBeat.o(11767);
          paramInt = i;
          break;
        case 4:
          ((afx)localObject1).data = ((e.a.a.a.a)localObject2).BTU.readString();
          AppMethodBeat.o(11767);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11767);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.afx
 * JD-Core Version:    0.6.2
 */