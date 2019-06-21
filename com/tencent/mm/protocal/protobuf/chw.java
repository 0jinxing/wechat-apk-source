package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class chw extends com.tencent.mm.bt.a
{
  public long ctk;
  public boolean cui;
  public int fgI;
  public int fgJ;
  public String lvA;
  public String lvz;
  public String phw;
  public String qVw;
  public String source;
  public long timestamp;
  public String title;
  public String uaf;
  public String uag;
  public String uah;
  public String uai;
  public String uaj;
  public String ubA;
  public String videoUrl;
  public int voe;
  public LinkedList<bzs> wiH;
  public String xgQ;
  public int xgR;
  public String xgS;
  public long xgT;
  public String xgU;
  public String xgV;
  public int xgW;
  public String xgX;
  public String xgY;
  public long xgZ;
  public long xha;
  public LinkedList<chy> xhb;
  public LinkedList<abz> xhc;
  public int xhd;
  public long xhe;
  public int xhf;
  public int xhg;
  public boolean xhh;
  public String xhi;

  public chw()
  {
    AppMethodBeat.i(55710);
    this.wiH = new LinkedList();
    this.xhb = new LinkedList();
    this.xhc = new LinkedList();
    AppMethodBeat.o(55710);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55711);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.videoUrl != null)
        paramArrayOfObject.e(2, this.videoUrl);
      if (this.xgQ != null)
        paramArrayOfObject.e(3, this.xgQ);
      paramArrayOfObject.iz(4, this.xgR);
      if (this.xgS != null)
        paramArrayOfObject.e(5, this.xgS);
      paramArrayOfObject.iz(6, this.fgJ);
      paramArrayOfObject.iz(7, this.fgI);
      if (this.lvz != null)
        paramArrayOfObject.e(8, this.lvz);
      if (this.lvA != null)
        paramArrayOfObject.e(9, this.lvA);
      if (this.qVw != null)
        paramArrayOfObject.e(10, this.qVw);
      if (this.uaf != null)
        paramArrayOfObject.e(11, this.uaf);
      if (this.uag != null)
        paramArrayOfObject.e(12, this.uag);
      if (this.uah != null)
        paramArrayOfObject.e(13, this.uah);
      if (this.source != null)
        paramArrayOfObject.e(14, this.source);
      if (this.phw != null)
        paramArrayOfObject.e(15, this.phw);
      paramArrayOfObject.ai(16, this.xgT);
      if (this.xgU != null)
        paramArrayOfObject.e(17, this.xgU);
      if (this.xgV != null)
        paramArrayOfObject.e(18, this.xgV);
      if (this.uai != null)
        paramArrayOfObject.e(19, this.uai);
      if (this.uaj != null)
        paramArrayOfObject.e(20, this.uaj);
      paramArrayOfObject.iz(21, this.xgW);
      if (this.xgX != null)
        paramArrayOfObject.e(22, this.xgX);
      if (this.xgY != null)
        paramArrayOfObject.e(23, this.xgY);
      paramArrayOfObject.e(24, 8, this.wiH);
      paramArrayOfObject.ai(25, this.timestamp);
      paramArrayOfObject.aO(26, this.cui);
      if (this.ubA != null)
        paramArrayOfObject.e(27, this.ubA);
      paramArrayOfObject.ai(28, this.xgZ);
      paramArrayOfObject.ai(29, this.ctk);
      paramArrayOfObject.ai(30, this.xha);
      paramArrayOfObject.e(31, 8, this.xhb);
      paramArrayOfObject.e(32, 8, this.xhc);
      paramArrayOfObject.iz(33, this.xhd);
      paramArrayOfObject.ai(34, this.xhe);
      paramArrayOfObject.iz(35, this.xhf);
      paramArrayOfObject.iz(36, this.voe);
      paramArrayOfObject.iz(37, this.xhg);
      paramArrayOfObject.aO(38, this.xhh);
      if (this.xhi != null)
        paramArrayOfObject.e(39, this.xhi);
      AppMethodBeat.o(55711);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label2655;
    label2655: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.videoUrl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.videoUrl);
      i = paramInt;
      if (this.xgQ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.xgQ);
      i += e.a.a.b.b.a.bs(4, this.xgR);
      paramInt = i;
      if (this.xgS != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.xgS);
      i = paramInt + e.a.a.b.b.a.bs(6, this.fgJ) + e.a.a.b.b.a.bs(7, this.fgI);
      paramInt = i;
      if (this.lvz != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.lvz);
      i = paramInt;
      if (this.lvA != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.lvA);
      int j = i;
      if (this.qVw != null)
        j = i + e.a.a.b.b.a.f(10, this.qVw);
      paramInt = j;
      if (this.uaf != null)
        paramInt = j + e.a.a.b.b.a.f(11, this.uaf);
      j = paramInt;
      if (this.uag != null)
        j = paramInt + e.a.a.b.b.a.f(12, this.uag);
      i = j;
      if (this.uah != null)
        i = j + e.a.a.b.b.a.f(13, this.uah);
      paramInt = i;
      if (this.source != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.source);
      i = paramInt;
      if (this.phw != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.phw);
      paramInt = i + e.a.a.b.b.a.o(16, this.xgT);
      i = paramInt;
      if (this.xgU != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.xgU);
      paramInt = i;
      if (this.xgV != null)
        paramInt = i + e.a.a.b.b.a.f(18, this.xgV);
      i = paramInt;
      if (this.uai != null)
        i = paramInt + e.a.a.b.b.a.f(19, this.uai);
      paramInt = i;
      if (this.uaj != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.uaj);
      i = paramInt + e.a.a.b.b.a.bs(21, this.xgW);
      paramInt = i;
      if (this.xgX != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.xgX);
      i = paramInt;
      if (this.xgY != null)
        i = paramInt + e.a.a.b.b.a.f(23, this.xgY);
      i = i + e.a.a.a.c(24, 8, this.wiH) + e.a.a.b.b.a.o(25, this.timestamp) + (e.a.a.b.b.a.fv(26) + 1);
      paramInt = i;
      if (this.ubA != null)
        paramInt = i + e.a.a.b.b.a.f(27, this.ubA);
      i = paramInt + e.a.a.b.b.a.o(28, this.xgZ) + e.a.a.b.b.a.o(29, this.ctk) + e.a.a.b.b.a.o(30, this.xha) + e.a.a.a.c(31, 8, this.xhb) + e.a.a.a.c(32, 8, this.xhc) + e.a.a.b.b.a.bs(33, this.xhd) + e.a.a.b.b.a.o(34, this.xhe) + e.a.a.b.b.a.bs(35, this.xhf) + e.a.a.b.b.a.bs(36, this.voe) + e.a.a.b.b.a.bs(37, this.xhg) + (e.a.a.b.b.a.fv(38) + 1);
      paramInt = i;
      if (this.xhi != null)
        paramInt = i + e.a.a.b.b.a.f(39, this.xhi);
      AppMethodBeat.o(55711);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wiH.clear();
        this.xhb.clear();
        this.xhc.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55711);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        chw localchw = (chw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55711);
          break;
        case 1:
          localchw.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 2:
          localchw.videoUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 3:
          localchw.xgQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 4:
          localchw.xgR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 5:
          localchw.xgS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 6:
          localchw.fgJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 7:
          localchw.fgI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 8:
          localchw.lvz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 9:
          localchw.lvA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 10:
          localchw.qVw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 11:
          localchw.uaf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 12:
          localchw.uag = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 13:
          localchw.uah = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 14:
          localchw.source = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 15:
          localchw.phw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 16:
          localchw.xgT = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 17:
          localchw.xgU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 18:
          localchw.xgV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 19:
          localchw.uai = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 20:
          localchw.uaj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 21:
          localchw.xgW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 22:
          localchw.xgX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 23:
          localchw.xgY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 24:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzs();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchw.wiH.add(paramArrayOfObject);
          }
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 25:
          localchw.timestamp = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 26:
          localchw.cui = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 27:
          localchw.ubA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 28:
          localchw.xgZ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 29:
          localchw.ctk = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 30:
          localchw.xha = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 31:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new chy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchw.xhb.add(localObject1);
          }
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 32:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((abz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchw.xhc.add(localObject1);
          }
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 33:
          localchw.xhd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 34:
          localchw.xhe = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 35:
          localchw.xhf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 36:
          localchw.voe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 37:
          localchw.xhg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 38:
          localchw.xhh = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        case 39:
          localchw.xhi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55711);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55711);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chw
 * JD-Core Version:    0.6.2
 */