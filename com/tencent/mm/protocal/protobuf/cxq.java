package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cxq extends com.tencent.mm.bt.a
{
  public LinkedList<Integer> xkP;
  public cxp xsZ;
  public LinkedList<Integer> xta;
  public int xtb;
  public int xtc;

  public cxq()
  {
    AppMethodBeat.i(115016);
    this.xta = new LinkedList();
    this.xkP = new LinkedList();
    AppMethodBeat.o(115016);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(115017);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xsZ != null)
      {
        paramArrayOfObject.iy(1, this.xsZ.computeSize());
        this.xsZ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 2, this.xta);
      paramArrayOfObject.e(3, 2, this.xkP);
      paramArrayOfObject.iz(4, this.xtb);
      paramArrayOfObject.iz(5, this.xtc);
      AppMethodBeat.o(115017);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xsZ == null)
        break label541;
    label541: for (paramInt = e.a.a.a.ix(1, this.xsZ.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 2, this.xta) + e.a.a.a.c(3, 2, this.xkP) + e.a.a.b.b.a.bs(4, this.xtb) + e.a.a.b.b.a.bs(5, this.xtc);
      AppMethodBeat.o(115017);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xta.clear();
        this.xkP.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(115017);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cxq localcxq = (cxq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(115017);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cxp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxq.xsZ = paramArrayOfObject;
          }
          AppMethodBeat.o(115017);
          paramInt = i;
          break;
        case 2:
          localcxq.xta.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(115017);
          paramInt = i;
          break;
        case 3:
          localcxq.xkP.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(115017);
          paramInt = i;
          break;
        case 4:
          localcxq.xtb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(115017);
          paramInt = i;
          break;
        case 5:
          localcxq.xtc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(115017);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(115017);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxq
 * JD-Core Version:    0.6.2
 */