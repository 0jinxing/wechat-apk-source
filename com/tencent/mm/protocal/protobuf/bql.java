package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bql extends com.tencent.mm.bt.a
{
  public String fjK;
  public String kLS;
  public int wSJ;
  public float wSN;
  public float wSO;
  public String wSP;
  public LinkedList<String> wSQ;
  public String wSR;
  public LinkedList<String> wSS;
  public LinkedList<bqm> wST;

  public bql()
  {
    AppMethodBeat.i(108899);
    this.wSQ = new LinkedList();
    this.wSS = new LinkedList();
    this.wST = new LinkedList();
    AppMethodBeat.o(108899);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(108900);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wSP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: music_url");
        AppMethodBeat.o(108900);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wSJ);
      paramArrayOfObject.r(2, this.wSN);
      paramArrayOfObject.r(3, this.wSO);
      if (this.wSP != null)
        paramArrayOfObject.e(4, this.wSP);
      paramArrayOfObject.e(5, 1, this.wSQ);
      if (this.wSR != null)
        paramArrayOfObject.e(6, this.wSR);
      paramArrayOfObject.e(7, 1, this.wSS);
      paramArrayOfObject.e(8, 8, this.wST);
      if (this.kLS != null)
        paramArrayOfObject.e(9, this.kLS);
      if (this.fjK != null)
        paramArrayOfObject.e(10, this.fjK);
      AppMethodBeat.o(108900);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wSJ) + 0 + (e.a.a.b.b.a.fv(2) + 4) + (e.a.a.b.b.a.fv(3) + 4);
        paramInt = i;
        if (this.wSP != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wSP);
        i = paramInt + e.a.a.a.c(5, 1, this.wSQ);
        paramInt = i;
        if (this.wSR != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.wSR);
        i = paramInt + e.a.a.a.c(7, 1, this.wSS) + e.a.a.a.c(8, 8, this.wST);
        paramInt = i;
        if (this.kLS != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.kLS);
        i = paramInt;
        if (this.fjK != null)
          i = paramInt + e.a.a.b.b.a.f(10, this.fjK);
        AppMethodBeat.o(108900);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wSQ.clear();
        this.wSS.clear();
        this.wST.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wSP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: music_url");
          AppMethodBeat.o(108900);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(108900);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bql localbql = (bql)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(108900);
          break;
        case 1:
          localbql.wSJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(108900);
          paramInt = 0;
          break;
        case 2:
          localbql.wSN = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(108900);
          paramInt = 0;
          break;
        case 3:
          localbql.wSO = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(108900);
          paramInt = 0;
          break;
        case 4:
          localbql.wSP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(108900);
          paramInt = 0;
          break;
        case 5:
          localbql.wSQ.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(108900);
          paramInt = 0;
          break;
        case 6:
          localbql.wSR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(108900);
          paramInt = 0;
          break;
        case 7:
          localbql.wSS.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(108900);
          paramInt = 0;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bqm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bqm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbql.wST.add(localObject1);
          }
          AppMethodBeat.o(108900);
          paramInt = 0;
          break;
        case 9:
          localbql.kLS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(108900);
          paramInt = 0;
          break;
        case 10:
          localbql.fjK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(108900);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(108900);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bql
 * JD-Core Version:    0.6.2
 */