package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cop extends bsr
{
  public int vIw;
  public long wOP;
  public int wOQ;
  public long wen;
  public long xeF;
  public String xmv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135443);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wOQ);
      paramArrayOfObject.ai(3, this.xeF);
      paramArrayOfObject.ai(4, this.wen);
      if (this.xmv != null)
        paramArrayOfObject.e(5, this.xmv);
      paramArrayOfObject.ai(6, this.wOP);
      paramArrayOfObject.iz(7, this.vIw);
      AppMethodBeat.o(135443);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label621;
    label621: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wOQ) + e.a.a.b.b.a.o(3, this.xeF) + e.a.a.b.b.a.o(4, this.wen);
      paramInt = i;
      if (this.xmv != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.xmv);
      paramInt = paramInt + e.a.a.b.b.a.o(6, this.wOP) + e.a.a.b.b.a.bs(7, this.vIw);
      AppMethodBeat.o(135443);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(135443);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cop localcop = (cop)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135443);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcop.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(135443);
          paramInt = i;
          break;
        case 2:
          localcop.wOQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135443);
          paramInt = i;
          break;
        case 3:
          localcop.xeF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135443);
          paramInt = i;
          break;
        case 4:
          localcop.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135443);
          paramInt = i;
          break;
        case 5:
          localcop.xmv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135443);
          paramInt = i;
          break;
        case 6:
          localcop.wOP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135443);
          paramInt = i;
          break;
        case 7:
          localcop.vIw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135443);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135443);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cop
 * JD-Core Version:    0.6.2
 */