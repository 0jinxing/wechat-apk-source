package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class awc extends bsr
{
  public String fKh;
  public b jBi;
  public int wzE;
  public int wzF;
  public cxh wzG;
  public String wzR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96266);
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
      if (this.jBi != null)
        paramArrayOfObject.c(3, this.jBi);
      if (this.wzR != null)
        paramArrayOfObject.e(4, this.wzR);
      paramArrayOfObject.iz(5, this.wzE);
      paramArrayOfObject.iz(6, this.wzF);
      if (this.wzG != null)
      {
        paramArrayOfObject.iy(7, this.wzG.computeSize());
        this.wzG.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(96266);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label767;
    label767: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      paramInt = i;
      if (this.jBi != null)
        paramInt = i + e.a.a.b.b.a.b(3, this.jBi);
      i = paramInt;
      if (this.wzR != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wzR);
      i = i + e.a.a.b.b.a.bs(5, this.wzE) + e.a.a.b.b.a.bs(6, this.wzF);
      paramInt = i;
      if (this.wzG != null)
        paramInt = i + e.a.a.a.ix(7, this.wzG.computeSize());
      AppMethodBeat.o(96266);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96266);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        awc localawc = (awc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96266);
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
            localawc.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96266);
          paramInt = i;
          break;
        case 2:
          localawc.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96266);
          paramInt = i;
          break;
        case 3:
          localawc.jBi = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(96266);
          paramInt = i;
          break;
        case 4:
          localawc.wzR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96266);
          paramInt = i;
          break;
        case 5:
          localawc.wzE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96266);
          paramInt = i;
          break;
        case 6:
          localawc.wzF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96266);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cxh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localawc.wzG = ((cxh)localObject1);
          }
          AppMethodBeat.o(96266);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96266);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.awc
 * JD-Core Version:    0.6.2
 */