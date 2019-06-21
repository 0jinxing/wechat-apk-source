package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cpl extends bsr
{
  public int jCt;
  public int wem;
  public long wen;
  public long xlQ;
  public String xmT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5244);
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
      if (this.xmT != null)
        paramArrayOfObject.e(4, this.xmT);
      paramArrayOfObject.iz(5, this.jCt);
      paramArrayOfObject.ai(6, this.xlQ);
      AppMethodBeat.o(5244);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label587;
    label587: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen);
      paramInt = i;
      if (this.xmT != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xmT);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.jCt) + e.a.a.b.b.a.o(6, this.xlQ);
      AppMethodBeat.o(5244);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5244);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpl localcpl = (cpl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5244);
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
            localcpl.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(5244);
          paramInt = i;
          break;
        case 2:
          localcpl.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5244);
          paramInt = i;
          break;
        case 3:
          localcpl.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5244);
          paramInt = i;
          break;
        case 4:
          localcpl.xmT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5244);
          paramInt = i;
          break;
        case 5:
          localcpl.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5244);
          paramInt = i;
          break;
        case 6:
          localcpl.xlQ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5244);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5244);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpl
 * JD-Core Version:    0.6.2
 */