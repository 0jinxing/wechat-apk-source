package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class brz extends bsr
{
  public float cEB;
  public float cGm;
  public String cMC;
  public float wUa;
  public b wUb;
  public boolean wUc;
  public boolean wUd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89131);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.r(2, this.cGm);
      paramArrayOfObject.r(3, this.cEB);
      paramArrayOfObject.r(4, this.wUa);
      if (this.wUb != null)
        paramArrayOfObject.c(5, this.wUb);
      if (this.cMC != null)
        paramArrayOfObject.e(6, this.cMC);
      paramArrayOfObject.aO(7, this.wUc);
      paramArrayOfObject.aO(8, this.wUd);
      AppMethodBeat.o(89131);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label686;
    label686: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 4) + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4);
      paramInt = i;
      if (this.wUb != null)
        paramInt = i + e.a.a.b.b.a.b(5, this.wUb);
      i = paramInt;
      if (this.cMC != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.cMC);
      paramInt = i + (e.a.a.b.b.a.fv(7) + 1) + (e.a.a.b.b.a.fv(8) + 1);
      AppMethodBeat.o(89131);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89131);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        brz localbrz = (brz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89131);
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
            localbrz.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89131);
          paramInt = i;
          break;
        case 2:
          localbrz.cGm = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(89131);
          paramInt = i;
          break;
        case 3:
          localbrz.cEB = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(89131);
          paramInt = i;
          break;
        case 4:
          localbrz.wUa = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(89131);
          paramInt = i;
          break;
        case 5:
          localbrz.wUb = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(89131);
          paramInt = i;
          break;
        case 6:
          localbrz.cMC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89131);
          paramInt = i;
          break;
        case 7:
          localbrz.wUc = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(89131);
          paramInt = i;
          break;
        case 8:
          localbrz.wUd = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(89131);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89131);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.brz
 * JD-Core Version:    0.6.2
 */