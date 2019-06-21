package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bau extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Id;
  public String Title;
  public String Url;
  public int cNE;
  public int cuu;
  public String cvZ;
  public int jCt;
  public boolean qFG;
  public int rEd;
  public String rik;
  public int wEG;
  public String wEH;
  public int wEI;
  public int wEJ;
  public baw wEK;
  public String wEL;
  public int wEM;
  public int wEN;
  public String wEO;
  public String wEP;
  public String wEQ;
  public String wER;
  public String wES;
  public int wET;
  public long wEU;
  public String wEV;
  public String wEW;
  public int wEX;
  public String wEY;
  public String wEZ;
  public int wFa;
  public String wFb;
  public String wFc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94539);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Id != null)
        paramArrayOfObject.e(1, this.Id);
      paramArrayOfObject.iz(2, this.jCt);
      if (this.Desc != null)
        paramArrayOfObject.e(3, this.Desc);
      if (this.Url != null)
        paramArrayOfObject.e(4, this.Url);
      paramArrayOfObject.iz(5, this.wEG);
      if (this.wEH != null)
        paramArrayOfObject.e(6, this.wEH);
      paramArrayOfObject.iz(7, this.wEI);
      paramArrayOfObject.iz(8, this.wEJ);
      if (this.Title != null)
        paramArrayOfObject.e(9, this.Title);
      if (this.wEK != null)
      {
        paramArrayOfObject.iy(10, this.wEK.computeSize());
        this.wEK.writeFields(paramArrayOfObject);
      }
      if (this.wEL != null)
        paramArrayOfObject.e(11, this.wEL);
      paramArrayOfObject.iz(12, this.wEM);
      paramArrayOfObject.iz(13, this.cNE);
      paramArrayOfObject.iz(14, this.wEN);
      if (this.rik != null)
        paramArrayOfObject.e(15, this.rik);
      paramArrayOfObject.iz(16, this.cuu);
      if (this.cvZ != null)
        paramArrayOfObject.e(17, this.cvZ);
      if (this.wEO != null)
        paramArrayOfObject.e(18, this.wEO);
      if (this.wEP != null)
        paramArrayOfObject.e(19, this.wEP);
      if (this.wEQ != null)
        paramArrayOfObject.e(20, this.wEQ);
      paramArrayOfObject.iz(21, this.rEd);
      if (this.wER != null)
        paramArrayOfObject.e(22, this.wER);
      if (this.wES != null)
        paramArrayOfObject.e(23, this.wES);
      paramArrayOfObject.iz(24, this.wET);
      paramArrayOfObject.ai(25, this.wEU);
      if (this.wEV != null)
        paramArrayOfObject.e(26, this.wEV);
      if (this.wEW != null)
        paramArrayOfObject.e(27, this.wEW);
      paramArrayOfObject.iz(28, this.wEX);
      if (this.wEY != null)
        paramArrayOfObject.e(29, this.wEY);
      if (this.wEZ != null)
        paramArrayOfObject.e(30, this.wEZ);
      paramArrayOfObject.iz(31, this.wFa);
      if (this.wFb != null)
        paramArrayOfObject.e(32, this.wFb);
      if (this.wFc != null)
        paramArrayOfObject.e(33, this.wFc);
      paramArrayOfObject.aO(34, this.qFG);
      AppMethodBeat.o(94539);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Id == null)
        break label2226;
    label2226: for (paramInt = e.a.a.b.b.a.f(1, this.Id) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCt);
      paramInt = i;
      if (this.Desc != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.Desc);
      i = paramInt;
      if (this.Url != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.Url);
      i += e.a.a.b.b.a.bs(5, this.wEG);
      paramInt = i;
      if (this.wEH != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wEH);
      paramInt = paramInt + e.a.a.b.b.a.bs(7, this.wEI) + e.a.a.b.b.a.bs(8, this.wEJ);
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.Title);
      paramInt = i;
      if (this.wEK != null)
        paramInt = i + e.a.a.a.ix(10, this.wEK.computeSize());
      i = paramInt;
      if (this.wEL != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.wEL);
      i = i + e.a.a.b.b.a.bs(12, this.wEM) + e.a.a.b.b.a.bs(13, this.cNE) + e.a.a.b.b.a.bs(14, this.wEN);
      paramInt = i;
      if (this.rik != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.rik);
      paramInt += e.a.a.b.b.a.bs(16, this.cuu);
      i = paramInt;
      if (this.cvZ != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.cvZ);
      paramInt = i;
      if (this.wEO != null)
        paramInt = i + e.a.a.b.b.a.f(18, this.wEO);
      i = paramInt;
      if (this.wEP != null)
        i = paramInt + e.a.a.b.b.a.f(19, this.wEP);
      paramInt = i;
      if (this.wEQ != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.wEQ);
      i = paramInt + e.a.a.b.b.a.bs(21, this.rEd);
      paramInt = i;
      if (this.wER != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.wER);
      i = paramInt;
      if (this.wES != null)
        i = paramInt + e.a.a.b.b.a.f(23, this.wES);
      i = i + e.a.a.b.b.a.bs(24, this.wET) + e.a.a.b.b.a.o(25, this.wEU);
      paramInt = i;
      if (this.wEV != null)
        paramInt = i + e.a.a.b.b.a.f(26, this.wEV);
      i = paramInt;
      if (this.wEW != null)
        i = paramInt + e.a.a.b.b.a.f(27, this.wEW);
      i += e.a.a.b.b.a.bs(28, this.wEX);
      paramInt = i;
      if (this.wEY != null)
        paramInt = i + e.a.a.b.b.a.f(29, this.wEY);
      i = paramInt;
      if (this.wEZ != null)
        i = paramInt + e.a.a.b.b.a.f(30, this.wEZ);
      i += e.a.a.b.b.a.bs(31, this.wFa);
      paramInt = i;
      if (this.wFb != null)
        paramInt = i + e.a.a.b.b.a.f(32, this.wFb);
      i = paramInt;
      if (this.wFc != null)
        i = paramInt + e.a.a.b.b.a.f(33, this.wFc);
      paramInt = i + (e.a.a.b.b.a.fv(34) + 1);
      AppMethodBeat.o(94539);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94539);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bau localbau = (bau)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94539);
          break;
        case 1:
          localbau.Id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 2:
          localbau.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 3:
          localbau.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 4:
          localbau.Url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 5:
          localbau.wEG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 6:
          localbau.wEH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 7:
          localbau.wEI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 8:
          localbau.wEJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 9:
          localbau.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new baw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbau.wEK = paramArrayOfObject;
          }
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 11:
          localbau.wEL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 12:
          localbau.wEM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 13:
          localbau.cNE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 14:
          localbau.wEN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 15:
          localbau.rik = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 16:
          localbau.cuu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 17:
          localbau.cvZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 18:
          localbau.wEO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 19:
          localbau.wEP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 20:
          localbau.wEQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 21:
          localbau.rEd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 22:
          localbau.wER = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 23:
          localbau.wES = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 24:
          localbau.wET = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 25:
          localbau.wEU = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 26:
          localbau.wEV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 27:
          localbau.wEW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 28:
          localbau.wEX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 29:
          localbau.wEY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 30:
          localbau.wEZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 31:
          localbau.wFa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 32:
          localbau.wFb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 33:
          localbau.wFc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        case 34:
          localbau.qFG = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(94539);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94539);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bau
 * JD-Core Version:    0.6.2
 */