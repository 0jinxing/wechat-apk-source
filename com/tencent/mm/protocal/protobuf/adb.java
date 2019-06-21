package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class adb extends com.tencent.mm.bt.a
{
  public String Title;
  public int type;
  public LinkedList<acv> wkO;
  public LinkedList<add> wkP;
  public String wkQ;
  public String wkR;
  public LinkedList<adc> wkS;
  public int wkT;
  public boolean wkU;

  public adb()
  {
    AppMethodBeat.i(112430);
    this.wkO = new LinkedList();
    this.wkP = new LinkedList();
    this.wkS = new LinkedList();
    AppMethodBeat.o(112430);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(112431);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      paramArrayOfObject.iz(2, this.type);
      paramArrayOfObject.e(3, 8, this.wkO);
      paramArrayOfObject.e(4, 8, this.wkP);
      if (this.wkQ != null)
        paramArrayOfObject.e(5, this.wkQ);
      if (this.wkR != null)
        paramArrayOfObject.e(6, this.wkR);
      paramArrayOfObject.e(7, 8, this.wkS);
      paramArrayOfObject.iz(8, this.wkT);
      paramArrayOfObject.aO(9, this.wkU);
      AppMethodBeat.o(112431);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label924;
    label924: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.type) + e.a.a.a.c(3, 8, this.wkO) + e.a.a.a.c(4, 8, this.wkP);
      paramInt = i;
      if (this.wkQ != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wkQ);
      i = paramInt;
      if (this.wkR != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wkR);
      paramInt = i + e.a.a.a.c(7, 8, this.wkS) + e.a.a.b.b.a.bs(8, this.wkT) + (e.a.a.b.b.a.fv(9) + 1);
      AppMethodBeat.o(112431);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wkO.clear();
        this.wkP.clear();
        this.wkS.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(112431);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        adb localadb = (adb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(112431);
          break;
        case 1:
          localadb.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112431);
          paramInt = i;
          break;
        case 2:
          localadb.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(112431);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new acv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((acv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadb.wkO.add(localObject1);
          }
          AppMethodBeat.o(112431);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new add();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadb.wkP.add(paramArrayOfObject);
          }
          AppMethodBeat.o(112431);
          paramInt = i;
          break;
        case 5:
          localadb.wkQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112431);
          paramInt = i;
          break;
        case 6:
          localadb.wkR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112431);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new adc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadb.wkS.add(paramArrayOfObject);
          }
          AppMethodBeat.o(112431);
          paramInt = i;
          break;
        case 8:
          localadb.wkT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(112431);
          paramInt = i;
          break;
        case 9:
          localadb.wkU = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(112431);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(112431);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.adb
 * JD-Core Version:    0.6.2
 */