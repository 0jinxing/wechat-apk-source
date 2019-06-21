package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bti extends bsr
{
  public String ndF;
  public String ndG;
  public int pcX;
  public String vFF;
  public int wVo;
  public int wVp;
  public int wVq;
  public long wVr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28618);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vFF != null)
        paramArrayOfObject.e(2, this.vFF);
      paramArrayOfObject.iz(3, this.wVo);
      paramArrayOfObject.iz(4, this.pcX);
      paramArrayOfObject.iz(5, this.wVp);
      if (this.ndG != null)
        paramArrayOfObject.e(6, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(7, this.ndF);
      paramArrayOfObject.iz(8, this.wVq);
      paramArrayOfObject.ai(9, this.wVr);
      AppMethodBeat.o(28618);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label767;
    label767: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vFF != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vFF);
      i = i + e.a.a.b.b.a.bs(3, this.wVo) + e.a.a.b.b.a.bs(4, this.pcX) + e.a.a.b.b.a.bs(5, this.wVp);
      paramInt = i;
      if (this.ndG != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.ndG);
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.ndF);
      paramInt = i + e.a.a.b.b.a.bs(8, this.wVq) + e.a.a.b.b.a.o(9, this.wVr);
      AppMethodBeat.o(28618);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28618);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bti localbti = (bti)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28618);
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
            localbti.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28618);
          paramInt = i;
          break;
        case 2:
          localbti.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28618);
          paramInt = i;
          break;
        case 3:
          localbti.wVo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28618);
          paramInt = i;
          break;
        case 4:
          localbti.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28618);
          paramInt = i;
          break;
        case 5:
          localbti.wVp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28618);
          paramInt = i;
          break;
        case 6:
          localbti.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28618);
          paramInt = i;
          break;
        case 7:
          localbti.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28618);
          paramInt = i;
          break;
        case 8:
          localbti.wVq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28618);
          paramInt = i;
          break;
        case 9:
          localbti.wVr = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28618);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28618);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bti
 * JD-Core Version:    0.6.2
 */