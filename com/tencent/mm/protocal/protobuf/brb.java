package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class brb extends bsr
{
  public int jCs;
  public int wTs;
  public cob wTt;
  public int wTu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28615);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wTt == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PieceData");
        AppMethodBeat.o(28615);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jCs);
      paramArrayOfObject.iz(3, this.wTs);
      if (this.wTt != null)
      {
        paramArrayOfObject.iy(4, this.wTt.computeSize());
        this.wTt.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wTu);
      AppMethodBeat.o(28615);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label683;
    label683: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCs) + e.a.a.b.b.a.bs(3, this.wTs);
      paramInt = i;
      if (this.wTt != null)
        paramInt = i + e.a.a.a.ix(4, this.wTt.computeSize());
      paramInt += e.a.a.b.b.a.bs(5, this.wTu);
      AppMethodBeat.o(28615);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wTt == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PieceData");
          AppMethodBeat.o(28615);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28615);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        brb localbrb = (brb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28615);
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
            localbrb.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28615);
          paramInt = i;
          break;
        case 2:
          localbrb.jCs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28615);
          paramInt = i;
          break;
        case 3:
          localbrb.wTs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28615);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cob();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbrb.wTt = paramArrayOfObject;
          }
          AppMethodBeat.o(28615);
          paramInt = i;
          break;
        case 5:
          localbrb.wTu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28615);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28615);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.brb
 * JD-Core Version:    0.6.2
 */