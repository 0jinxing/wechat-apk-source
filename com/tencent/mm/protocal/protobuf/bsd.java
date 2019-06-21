package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bsd extends bsr
{
  public int vPy;
  public String wKQ;
  public b wUg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48953);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wUg != null)
        paramArrayOfObject.c(2, this.wUg);
      if (this.wKQ != null)
        paramArrayOfObject.e(3, this.wKQ);
      paramArrayOfObject.iz(4, this.vPy);
      AppMethodBeat.o(48953);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label496;
    label496: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wUg != null)
        paramInt = i + e.a.a.b.b.a.b(2, this.wUg);
      i = paramInt;
      if (this.wKQ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wKQ);
      paramInt = i + e.a.a.b.b.a.bs(4, this.vPy);
      AppMethodBeat.o(48953);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48953);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bsd localbsd = (bsd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48953);
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
            localbsd.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(48953);
          paramInt = i;
          break;
        case 2:
          localbsd.wUg = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(48953);
          paramInt = i;
          break;
        case 3:
          localbsd.wKQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48953);
          paramInt = i;
          break;
        case 4:
          localbsd.vPy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48953);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48953);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsd
 * JD-Core Version:    0.6.2
 */