package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class azb extends com.tencent.mm.bt.a
{
  public String wCO;
  public boolean wCP;
  public gw wCQ;
  public String wCR;
  public boolean wCS;
  public int wCT;
  public String wCU;
  public int wCV;
  public LinkedList<oq> wmz;

  public azb()
  {
    AppMethodBeat.i(56849);
    this.wmz = new LinkedList();
    AppMethodBeat.o(56849);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56850);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wCO != null)
        paramArrayOfObject.e(1, this.wCO);
      paramArrayOfObject.e(2, 8, this.wmz);
      paramArrayOfObject.aO(3, this.wCP);
      if (this.wCQ != null)
      {
        paramArrayOfObject.iy(4, this.wCQ.computeSize());
        this.wCQ.writeFields(paramArrayOfObject);
      }
      if (this.wCR != null)
        paramArrayOfObject.e(5, this.wCR);
      paramArrayOfObject.aO(6, this.wCS);
      paramArrayOfObject.iz(7, this.wCT);
      if (this.wCU != null)
        paramArrayOfObject.e(8, this.wCU);
      paramArrayOfObject.iz(9, this.wCV);
      AppMethodBeat.o(56850);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wCO == null)
        break label849;
    label849: for (paramInt = e.a.a.b.b.a.f(1, this.wCO) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.wmz) + (e.a.a.b.b.a.fv(3) + 1);
      paramInt = i;
      if (this.wCQ != null)
        paramInt = i + e.a.a.a.ix(4, this.wCQ.computeSize());
      i = paramInt;
      if (this.wCR != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wCR);
      i = i + (e.a.a.b.b.a.fv(6) + 1) + e.a.a.b.b.a.bs(7, this.wCT);
      paramInt = i;
      if (this.wCU != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wCU);
      paramInt += e.a.a.b.b.a.bs(9, this.wCV);
      AppMethodBeat.o(56850);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wmz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56850);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        azb localazb = (azb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56850);
          break;
        case 1:
          localazb.wCO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56850);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new oq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((oq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localazb.wmz.add(localObject1);
          }
          AppMethodBeat.o(56850);
          paramInt = i;
          break;
        case 3:
          localazb.wCP = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56850);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new gw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((gw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localazb.wCQ = ((gw)localObject1);
          }
          AppMethodBeat.o(56850);
          paramInt = i;
          break;
        case 5:
          localazb.wCR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56850);
          paramInt = i;
          break;
        case 6:
          localazb.wCS = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56850);
          paramInt = i;
          break;
        case 7:
          localazb.wCT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56850);
          paramInt = i;
          break;
        case 8:
          localazb.wCU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56850);
          paramInt = i;
          break;
        case 9:
          localazb.wCV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56850);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56850);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azb
 * JD-Core Version:    0.6.2
 */