package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cjl extends bsr
{
  public String vMV;
  public String vNb;
  public kg xig;
  public kg xih;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11820);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vNb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: brand_user_name");
        AppMethodBeat.o(11820);
        throw paramArrayOfObject;
      }
      if (this.vMV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: bizchat_id");
        AppMethodBeat.o(11820);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vNb != null)
        paramArrayOfObject.e(2, this.vNb);
      if (this.vMV != null)
        paramArrayOfObject.e(3, this.vMV);
      if (this.xig != null)
      {
        paramArrayOfObject.iy(4, this.xig.computeSize());
        this.xig.writeFields(paramArrayOfObject);
      }
      if (this.xih != null)
      {
        paramArrayOfObject.iy(5, this.xih.computeSize());
        this.xih.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(11820);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label875;
    label875: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vNb != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vNb);
      paramInt = i;
      if (this.vMV != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vMV);
      i = paramInt;
      if (this.xig != null)
        i = paramInt + e.a.a.a.ix(4, this.xig.computeSize());
      paramInt = i;
      if (this.xih != null)
        paramInt = i + e.a.a.a.ix(5, this.xih.computeSize());
      AppMethodBeat.o(11820);
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
          AppMethodBeat.o(11820);
          throw paramArrayOfObject;
        }
        if (this.vMV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: bizchat_id");
          AppMethodBeat.o(11820);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11820);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cjl localcjl = (cjl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11820);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcjl.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11820);
          paramInt = i;
          break;
        case 2:
          localcjl.vNb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11820);
          paramInt = i;
          break;
        case 3:
          localcjl.vMV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11820);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new kg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcjl.xig = ((kg)localObject1);
          }
          AppMethodBeat.o(11820);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new kg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcjl.xih = paramArrayOfObject;
          }
          AppMethodBeat.o(11820);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11820);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cjl
 * JD-Core Version:    0.6.2
 */