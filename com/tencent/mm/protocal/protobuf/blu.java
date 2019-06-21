package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class blu extends bsr
{
  public String ndF;
  public long wOP;
  public int wOQ;
  public String wOR;
  public long wOS;
  public int wem;
  public long wen;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28575);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      if (this.ndF != null)
        paramArrayOfObject.e(4, this.ndF);
      paramArrayOfObject.ai(5, this.wOP);
      paramArrayOfObject.iz(6, this.wOQ);
      if (this.wOR != null)
        paramArrayOfObject.e(7, this.wOR);
      paramArrayOfObject.ai(8, this.wOS);
      AppMethodBeat.o(28575);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label703;
    label703: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen);
      paramInt = i;
      if (this.ndF != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ndF);
      i = paramInt + e.a.a.b.b.a.o(5, this.wOP) + e.a.a.b.b.a.bs(6, this.wOQ);
      paramInt = i;
      if (this.wOR != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wOR);
      paramInt += e.a.a.b.b.a.o(8, this.wOS);
      AppMethodBeat.o(28575);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28575);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        blu localblu = (blu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28575);
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
            localblu.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28575);
          paramInt = i;
          break;
        case 2:
          localblu.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28575);
          paramInt = i;
          break;
        case 3:
          localblu.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28575);
          paramInt = i;
          break;
        case 4:
          localblu.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28575);
          paramInt = i;
          break;
        case 5:
          localblu.wOP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28575);
          paramInt = i;
          break;
        case 6:
          localblu.wOQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28575);
          paramInt = i;
          break;
        case 7:
          localblu.wOR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28575);
          paramInt = i;
          break;
        case 8:
          localblu.wOS = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28575);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28575);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.blu
 * JD-Core Version:    0.6.2
 */