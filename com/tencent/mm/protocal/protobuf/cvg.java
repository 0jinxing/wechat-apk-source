package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cvg extends com.tencent.mm.bt.a
{
  public int Scene;
  public String luQ;
  public String vKt;
  public long vQd;
  public int wDH;
  public axy wDI;
  public LinkedList<String> xrm;
  public LinkedList<tn> xrn;

  public cvg()
  {
    AppMethodBeat.i(124383);
    this.xrm = new LinkedList();
    this.xrn = new LinkedList();
    AppMethodBeat.o(124383);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124384);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 1, this.xrm);
      paramArrayOfObject.iz(2, this.wDH);
      if (this.luQ != null)
        paramArrayOfObject.e(3, this.luQ);
      paramArrayOfObject.iz(4, this.Scene);
      paramArrayOfObject.ai(5, this.vQd);
      if (this.vKt != null)
        paramArrayOfObject.e(6, this.vKt);
      if (this.wDI != null)
      {
        paramArrayOfObject.iy(7, this.wDI.computeSize());
        this.wDI.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(8, 8, this.xrn);
      AppMethodBeat.o(124384);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 1, this.xrm) + 0 + e.a.a.b.b.a.bs(2, this.wDH);
        paramInt = i;
        if (this.luQ != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.luQ);
        i = paramInt + e.a.a.b.b.a.bs(4, this.Scene) + e.a.a.b.b.a.o(5, this.vQd);
        paramInt = i;
        if (this.vKt != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.vKt);
        i = paramInt;
        if (this.wDI != null)
          i = paramInt + e.a.a.a.ix(7, this.wDI.computeSize());
        paramInt = i + e.a.a.a.c(8, 8, this.xrn);
        AppMethodBeat.o(124384);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xrm.clear();
        this.xrn.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124384);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cvg localcvg = (cvg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124384);
          break;
        case 1:
          localcvg.xrm.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(124384);
          paramInt = 0;
          break;
        case 2:
          localcvg.wDH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124384);
          paramInt = 0;
          break;
        case 3:
          localcvg.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124384);
          paramInt = 0;
          break;
        case 4:
          localcvg.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124384);
          paramInt = 0;
          break;
        case 5:
          localcvg.vQd = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(124384);
          paramInt = 0;
          break;
        case 6:
          localcvg.vKt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124384);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new axy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvg.wDI = paramArrayOfObject;
          }
          AppMethodBeat.o(124384);
          paramInt = 0;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvg.xrn.add(paramArrayOfObject);
          }
          AppMethodBeat.o(124384);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124384);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvg
 * JD-Core Version:    0.6.2
 */