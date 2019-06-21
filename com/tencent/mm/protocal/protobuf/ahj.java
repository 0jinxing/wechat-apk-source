package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ahj extends com.tencent.mm.bt.a
  implements bzw
{
  public int Ret;
  public int vZM;
  public int vZN;
  public int vZO;
  public LinkedList<cff> vZP;
  public LinkedList<cff> vZQ;
  public LinkedList<cff> vZR;
  public int vZS;
  public int vZT;
  public int vZU;
  public ate vZV;
  public int wnO;
  public int wnP;
  public int wnQ;
  public LinkedList<cff> wnR;
  public LinkedList<cff> wnS;
  public LinkedList<cff> wnT;

  public ahj()
  {
    AppMethodBeat.i(72850);
    this.vZP = new LinkedList();
    this.vZQ = new LinkedList();
    this.vZR = new LinkedList();
    this.wnR = new LinkedList();
    this.wnS = new LinkedList();
    this.wnT = new LinkedList();
    AppMethodBeat.o(72850);
  }

  public final int getRet()
  {
    return this.Ret;
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72851);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Ret);
      paramArrayOfObject.iz(2, this.vZM);
      paramArrayOfObject.iz(3, this.vZN);
      paramArrayOfObject.iz(4, this.vZO);
      paramArrayOfObject.e(5, 8, this.vZP);
      paramArrayOfObject.e(6, 8, this.vZQ);
      paramArrayOfObject.e(7, 8, this.vZR);
      paramArrayOfObject.iz(8, this.vZS);
      paramArrayOfObject.iz(9, this.vZT);
      paramArrayOfObject.iz(10, this.vZU);
      paramArrayOfObject.iz(11, this.wnO);
      paramArrayOfObject.iz(12, this.wnP);
      paramArrayOfObject.iz(13, this.wnQ);
      paramArrayOfObject.e(14, 8, this.wnR);
      paramArrayOfObject.e(15, 8, this.wnS);
      paramArrayOfObject.e(16, 8, this.wnT);
      if (this.vZV != null)
      {
        paramArrayOfObject.iy(17, this.vZV.computeSize());
        this.vZV.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(72851);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.Ret) + 0 + e.a.a.b.b.a.bs(2, this.vZM) + e.a.a.b.b.a.bs(3, this.vZN) + e.a.a.b.b.a.bs(4, this.vZO) + e.a.a.a.c(5, 8, this.vZP) + e.a.a.a.c(6, 8, this.vZQ) + e.a.a.a.c(7, 8, this.vZR) + e.a.a.b.b.a.bs(8, this.vZS) + e.a.a.b.b.a.bs(9, this.vZT) + e.a.a.b.b.a.bs(10, this.vZU) + e.a.a.b.b.a.bs(11, this.wnO) + e.a.a.b.b.a.bs(12, this.wnP) + e.a.a.b.b.a.bs(13, this.wnQ) + e.a.a.a.c(14, 8, this.wnR) + e.a.a.a.c(15, 8, this.wnS) + e.a.a.a.c(16, 8, this.wnT);
        paramInt = i;
        if (this.vZV != null)
          paramInt = i + e.a.a.a.ix(17, this.vZV.computeSize());
        AppMethodBeat.o(72851);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vZP.clear();
        this.vZQ.clear();
        this.vZR.clear();
        this.wnR.clear();
        this.wnS.clear();
        this.wnT.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72851);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ahj localahj = (ahj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72851);
          break;
        case 1:
          localahj.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 2:
          localahj.vZM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 3:
          localahj.vZN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 4:
          localahj.vZO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cff();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahj.vZP.add(paramArrayOfObject);
          }
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cff();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cff)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahj.vZQ.add(localObject1);
          }
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cff();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahj.vZR.add(paramArrayOfObject);
          }
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 8:
          localahj.vZS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 9:
          localahj.vZT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 10:
          localahj.vZU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 11:
          localahj.wnO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 12:
          localahj.wnP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 13:
          localahj.wnQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cff();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahj.wnR.add(paramArrayOfObject);
          }
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cff();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahj.wnS.add(paramArrayOfObject);
          }
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 16:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cff();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cff)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahj.wnT.add(localObject1);
          }
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        case 17:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ate();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahj.vZV = paramArrayOfObject;
          }
          AppMethodBeat.o(72851);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72851);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ahj
 * JD-Core Version:    0.6.2
 */