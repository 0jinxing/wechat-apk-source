package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cxw extends com.tencent.mm.bt.a
{
  public LinkedList<Integer> xkP;
  public cxp xsZ;
  public String xto;
  public int xtp;
  public int xtq;

  public cxw()
  {
    AppMethodBeat.i(115023);
    this.xkP = new LinkedList();
    AppMethodBeat.o(115023);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(115024);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xsZ != null)
      {
        paramArrayOfObject.iy(1, this.xsZ.computeSize());
        this.xsZ.writeFields(paramArrayOfObject);
      }
      if (this.xto != null)
        paramArrayOfObject.e(2, this.xto);
      paramArrayOfObject.e(3, 2, this.xkP);
      paramArrayOfObject.iz(4, this.xtp);
      paramArrayOfObject.iz(5, this.xtq);
      AppMethodBeat.o(115024);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xsZ == null)
        break label543;
    label543: for (paramInt = e.a.a.a.ix(1, this.xsZ.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xto != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xto);
      paramInt = i + e.a.a.a.c(3, 2, this.xkP) + e.a.a.b.b.a.bs(4, this.xtp) + e.a.a.b.b.a.bs(5, this.xtq);
      AppMethodBeat.o(115024);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xkP.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(115024);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cxw localcxw = (cxw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(115024);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cxp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxw.xsZ = ((cxp)localObject1);
          }
          AppMethodBeat.o(115024);
          paramInt = i;
          break;
        case 2:
          localcxw.xto = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(115024);
          paramInt = i;
          break;
        case 3:
          localcxw.xkP.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(115024);
          paramInt = i;
          break;
        case 4:
          localcxw.xtp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(115024);
          paramInt = i;
          break;
        case 5:
          localcxw.xtq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(115024);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(115024);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxw
 * JD-Core Version:    0.6.2
 */