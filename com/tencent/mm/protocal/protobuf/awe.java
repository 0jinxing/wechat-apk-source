package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class awe extends bsr
{
  public String fKh;
  public int wzF;
  public cxh wzG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96268);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      paramArrayOfObject.iz(3, this.wzF);
      if (this.wzG != null)
      {
        paramArrayOfObject.iy(4, this.wzG.computeSize());
        this.wzG.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(96268);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label594;
    label594: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      i += e.a.a.b.b.a.bs(3, this.wzF);
      paramInt = i;
      if (this.wzG != null)
        paramInt = i + e.a.a.a.ix(4, this.wzG.computeSize());
      AppMethodBeat.o(96268);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96268);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        awe localawe = (awe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96268);
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
            localawe.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96268);
          paramInt = i;
          break;
        case 2:
          localawe.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96268);
          paramInt = i;
          break;
        case 3:
          localawe.wzF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96268);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cxh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localawe.wzG = ((cxh)localObject1);
          }
          AppMethodBeat.o(96268);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96268);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.awe
 * JD-Core Version:    0.6.2
 */