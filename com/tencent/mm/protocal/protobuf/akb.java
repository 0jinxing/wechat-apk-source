package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class akb extends bsr
{
  public String vQq;
  public String vRN;
  public cx wpB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56811);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wpB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Address");
        AppMethodBeat.o(56811);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vQq != null)
        paramArrayOfObject.e(2, this.vQq);
      if (this.vRN != null)
        paramArrayOfObject.e(3, this.vRN);
      if (this.wpB != null)
      {
        paramArrayOfObject.iy(4, this.wpB.computeSize());
        this.wpB.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56811);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label658;
    label658: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vQq != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vQq);
      i = paramInt;
      if (this.vRN != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vRN);
      paramInt = i;
      if (this.wpB != null)
        paramInt = i + e.a.a.a.ix(4, this.wpB.computeSize());
      AppMethodBeat.o(56811);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wpB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Address");
          AppMethodBeat.o(56811);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56811);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        akb localakb = (akb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56811);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakb.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56811);
          paramInt = i;
          break;
        case 2:
          localakb.vQq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56811);
          paramInt = i;
          break;
        case 3:
          localakb.vRN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56811);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakb.wpB = ((cx)localObject1);
          }
          AppMethodBeat.o(56811);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56811);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.akb
 * JD-Core Version:    0.6.2
 */