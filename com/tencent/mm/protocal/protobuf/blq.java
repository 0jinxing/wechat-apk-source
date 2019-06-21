package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class blq extends com.tencent.mm.bt.a
{
  public String Name;
  public String PriceType;
  public int Scene;
  public String ThumbUrl;
  public int jBv;
  public int jCt;
  public int wOD;
  public LinkedList<axa> wOE;
  public int wOF;
  public String wOG;
  public String wOH;
  public int wOI;
  public String wOJ;
  public int wOK;
  public LinkedList<xd> wOL;
  public String wrm;

  public blq()
  {
    AppMethodBeat.i(56933);
    this.wOE = new LinkedList();
    this.wOL = new LinkedList();
    AppMethodBeat.o(56933);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56934);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wOD);
      paramArrayOfObject.e(2, 8, this.wOE);
      paramArrayOfObject.iz(3, this.jBv);
      paramArrayOfObject.iz(4, this.wOF);
      if (this.PriceType != null)
        paramArrayOfObject.e(5, this.PriceType);
      if (this.wrm != null)
        paramArrayOfObject.e(6, this.wrm);
      if (this.wOG != null)
        paramArrayOfObject.e(7, this.wOG);
      if (this.wOH != null)
        paramArrayOfObject.e(8, this.wOH);
      paramArrayOfObject.iz(9, this.jCt);
      if (this.Name != null)
        paramArrayOfObject.e(10, this.Name);
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(11, this.ThumbUrl);
      paramArrayOfObject.iz(12, this.wOI);
      paramArrayOfObject.iz(13, this.Scene);
      if (this.wOJ != null)
        paramArrayOfObject.e(14, this.wOJ);
      paramArrayOfObject.iz(15, this.wOK);
      paramArrayOfObject.e(16, 8, this.wOL);
      AppMethodBeat.o(56934);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wOD) + 0 + e.a.a.a.c(2, 8, this.wOE) + e.a.a.b.b.a.bs(3, this.jBv) + e.a.a.b.b.a.bs(4, this.wOF);
        i = paramInt;
        if (this.PriceType != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.PriceType);
        paramInt = i;
        if (this.wrm != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.wrm);
        i = paramInt;
        if (this.wOG != null)
          i = paramInt + e.a.a.b.b.a.f(7, this.wOG);
        paramInt = i;
        if (this.wOH != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.wOH);
        i = paramInt + e.a.a.b.b.a.bs(9, this.jCt);
        paramInt = i;
        if (this.Name != null)
          paramInt = i + e.a.a.b.b.a.f(10, this.Name);
        i = paramInt;
        if (this.ThumbUrl != null)
          i = paramInt + e.a.a.b.b.a.f(11, this.ThumbUrl);
        i = i + e.a.a.b.b.a.bs(12, this.wOI) + e.a.a.b.b.a.bs(13, this.Scene);
        paramInt = i;
        if (this.wOJ != null)
          paramInt = i + e.a.a.b.b.a.f(14, this.wOJ);
        paramInt = paramInt + e.a.a.b.b.a.bs(15, this.wOK) + e.a.a.a.c(16, 8, this.wOL);
        AppMethodBeat.o(56934);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wOE.clear();
        this.wOL.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56934);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        blq localblq = (blq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56934);
          break;
        case 1:
          localblq.wOD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axa();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((axa)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localblq.wOE.add(localObject1);
          }
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 3:
          localblq.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 4:
          localblq.wOF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 5:
          localblq.PriceType = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 6:
          localblq.wrm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 7:
          localblq.wOG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 8:
          localblq.wOH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 9:
          localblq.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 10:
          localblq.Name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 11:
          localblq.ThumbUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 12:
          localblq.wOI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 13:
          localblq.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 14:
          localblq.wOJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 15:
          localblq.wOK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        case 16:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localblq.wOL.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56934);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56934);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.blq
 * JD-Core Version:    0.6.2
 */