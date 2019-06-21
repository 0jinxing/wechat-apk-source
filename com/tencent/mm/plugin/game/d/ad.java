package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ad extends com.tencent.mm.bt.a
{
  public String fKh;
  public String mZL;
  public int mZN;
  public int mZQ;
  public String mZj;
  public ca naA;
  public dn naB;
  public cj naC;
  public ck naD;
  public aw naE;
  public cs naF;
  public as naG;
  public o naH;
  public cn naI;
  public cy naJ;
  public n naK;
  public n naL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(111567);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.mZQ);
      paramArrayOfObject.iz(2, this.mZN);
      if (this.mZL != null)
        paramArrayOfObject.e(3, this.mZL);
      if (this.fKh != null)
        paramArrayOfObject.e(4, this.fKh);
      if (this.mZj != null)
        paramArrayOfObject.e(17, this.mZj);
      if (this.naA != null)
      {
        paramArrayOfObject.iy(5, this.naA.computeSize());
        this.naA.writeFields(paramArrayOfObject);
      }
      if (this.naB != null)
      {
        paramArrayOfObject.iy(6, this.naB.computeSize());
        this.naB.writeFields(paramArrayOfObject);
      }
      if (this.naC != null)
      {
        paramArrayOfObject.iy(7, this.naC.computeSize());
        this.naC.writeFields(paramArrayOfObject);
      }
      if (this.naD != null)
      {
        paramArrayOfObject.iy(8, this.naD.computeSize());
        this.naD.writeFields(paramArrayOfObject);
      }
      if (this.naE != null)
      {
        paramArrayOfObject.iy(9, this.naE.computeSize());
        this.naE.writeFields(paramArrayOfObject);
      }
      if (this.naF != null)
      {
        paramArrayOfObject.iy(10, this.naF.computeSize());
        this.naF.writeFields(paramArrayOfObject);
      }
      if (this.naG != null)
      {
        paramArrayOfObject.iy(11, this.naG.computeSize());
        this.naG.writeFields(paramArrayOfObject);
      }
      if (this.naH != null)
      {
        paramArrayOfObject.iy(12, this.naH.computeSize());
        this.naH.writeFields(paramArrayOfObject);
      }
      if (this.naI != null)
      {
        paramArrayOfObject.iy(13, this.naI.computeSize());
        this.naI.writeFields(paramArrayOfObject);
      }
      if (this.naJ != null)
      {
        paramArrayOfObject.iy(14, this.naJ.computeSize());
        this.naJ.writeFields(paramArrayOfObject);
      }
      if (this.naK != null)
      {
        paramArrayOfObject.iy(15, this.naK.computeSize());
        this.naK.writeFields(paramArrayOfObject);
      }
      if (this.naL != null)
      {
        paramArrayOfObject.iy(16, this.naL.computeSize());
        this.naL.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(111567);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.mZQ) + 0 + e.a.a.b.b.a.bs(2, this.mZN);
        i = paramInt;
        if (this.mZL != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.mZL);
        paramInt = i;
        if (this.fKh != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.fKh);
        i = paramInt;
        if (this.mZj != null)
          i = paramInt + e.a.a.b.b.a.f(17, this.mZj);
        int j = i;
        if (this.naA != null)
          j = i + e.a.a.a.ix(5, this.naA.computeSize());
        paramInt = j;
        if (this.naB != null)
          paramInt = j + e.a.a.a.ix(6, this.naB.computeSize());
        i = paramInt;
        if (this.naC != null)
          i = paramInt + e.a.a.a.ix(7, this.naC.computeSize());
        paramInt = i;
        if (this.naD != null)
          paramInt = i + e.a.a.a.ix(8, this.naD.computeSize());
        j = paramInt;
        if (this.naE != null)
          j = paramInt + e.a.a.a.ix(9, this.naE.computeSize());
        i = j;
        if (this.naF != null)
          i = j + e.a.a.a.ix(10, this.naF.computeSize());
        paramInt = i;
        if (this.naG != null)
          paramInt = i + e.a.a.a.ix(11, this.naG.computeSize());
        i = paramInt;
        if (this.naH != null)
          i = paramInt + e.a.a.a.ix(12, this.naH.computeSize());
        paramInt = i;
        if (this.naI != null)
          paramInt = i + e.a.a.a.ix(13, this.naI.computeSize());
        i = paramInt;
        if (this.naJ != null)
          i = paramInt + e.a.a.a.ix(14, this.naJ.computeSize());
        paramInt = i;
        if (this.naK != null)
          paramInt = i + e.a.a.a.ix(15, this.naK.computeSize());
        i = paramInt;
        if (this.naL != null)
          i = paramInt + e.a.a.a.ix(16, this.naL.computeSize());
        AppMethodBeat.o(111567);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111567);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ad localad = (ad)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111567);
          break;
        case 1:
          localad.mZQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 2:
          localad.mZN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 3:
          localad.mZL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 4:
          localad.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 17:
          localad.mZj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ca();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naA = paramArrayOfObject;
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new dn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naB = paramArrayOfObject;
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naC = ((cj)localObject1);
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ck();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naD = paramArrayOfObject;
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naE = ((aw)localObject1);
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cs();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cs)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naF = ((cs)localObject1);
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new as();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((as)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naG = ((as)localObject1);
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new o();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naH = paramArrayOfObject;
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naI = paramArrayOfObject;
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 14:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naJ = ((cy)localObject1);
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 15:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new n();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((n)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naK = ((n)localObject1);
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        case 16:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new n();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((n)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localad.naL = ((n)localObject1);
          }
          AppMethodBeat.o(111567);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(111567);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ad
 * JD-Core Version:    0.6.2
 */