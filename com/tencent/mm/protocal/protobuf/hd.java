package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class hd extends com.tencent.mm.bt.a
{
  public String nuL;
  public String pLH;
  public int pLI;
  public int pLJ;
  public String pLK;
  public String pLL;
  public String pLM;
  public long pLP;
  public String pbn;
  public LinkedList<yq> vJM;
  public String vJN;
  public String vJO;

  public hd()
  {
    AppMethodBeat.i(48776);
    this.vJM = new LinkedList();
    AppMethodBeat.o(48776);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48777);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pbn != null)
        paramArrayOfObject.e(1, this.pbn);
      if (this.nuL != null)
        paramArrayOfObject.e(2, this.nuL);
      if (this.pLH != null)
        paramArrayOfObject.e(3, this.pLH);
      paramArrayOfObject.iz(4, this.pLI);
      paramArrayOfObject.iz(5, this.pLJ);
      paramArrayOfObject.e(6, 8, this.vJM);
      if (this.pLK != null)
        paramArrayOfObject.e(7, this.pLK);
      if (this.pLL != null)
        paramArrayOfObject.e(8, this.pLL);
      if (this.pLM != null)
        paramArrayOfObject.e(9, this.pLM);
      if (this.vJN != null)
        paramArrayOfObject.e(10, this.vJN);
      if (this.vJO != null)
        paramArrayOfObject.e(11, this.vJO);
      paramArrayOfObject.ai(12, this.pLP);
      AppMethodBeat.o(48777);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pbn == null)
        break label969;
    label969: for (i = e.a.a.b.b.a.f(1, this.pbn) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.nuL != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.nuL);
      i = paramInt;
      if (this.pLH != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pLH);
      i = i + e.a.a.b.b.a.bs(4, this.pLI) + e.a.a.b.b.a.bs(5, this.pLJ) + e.a.a.a.c(6, 8, this.vJM);
      paramInt = i;
      if (this.pLK != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.pLK);
      i = paramInt;
      if (this.pLL != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.pLL);
      paramInt = i;
      if (this.pLM != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.pLM);
      i = paramInt;
      if (this.vJN != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vJN);
      paramInt = i;
      if (this.vJO != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vJO);
      paramInt += e.a.a.b.b.a.o(12, this.pLP);
      AppMethodBeat.o(48777);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vJM.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48777);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        hd localhd = (hd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48777);
          break;
        case 1:
          localhd.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 2:
          localhd.nuL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 3:
          localhd.pLH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 4:
          localhd.pLI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 5:
          localhd.pLJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new yq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((yq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localhd.vJM.add(localObject1);
          }
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 7:
          localhd.pLK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 8:
          localhd.pLL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 9:
          localhd.pLM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 10:
          localhd.vJN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 11:
          localhd.vJO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        case 12:
          localhd.pLP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48777);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48777);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hd
 * JD-Core Version:    0.6.2
 */