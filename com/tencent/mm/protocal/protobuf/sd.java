package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class sd extends bsr
{
  public String cFl;
  public String csB;
  public String tCi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96215);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      if (this.cFl != null)
        paramArrayOfObject.e(3, this.cFl);
      if (this.tCi != null)
        paramArrayOfObject.e(4, this.tCi);
      AppMethodBeat.o(96215);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label513;
    label513: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.csB);
      i = paramInt;
      if (this.cFl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.cFl);
      paramInt = i;
      if (this.tCi != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.tCi);
      AppMethodBeat.o(96215);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96215);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        sd localsd = (sd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96215);
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
            localsd.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96215);
          paramInt = i;
          break;
        case 2:
          localsd.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96215);
          paramInt = i;
          break;
        case 3:
          localsd.cFl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96215);
          paramInt = i;
          break;
        case 4:
          localsd.tCi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96215);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96215);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.sd
 * JD-Core Version:    0.6.2
 */