package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class ks extends com.tencent.mm.bt.a
{
  public int cancel;
  public long cuQ;
  public int pos;
  public String vNN;
  public LinkedList<Integer> vNO;
  public int vNP;
  public int vNQ;
  public int vNR;
  public int vNS;
  public int vNT;
  public int vNU;
  public int vNV;
  public int vNW;
  public int vNX;
  public int vNY;
  public int vNZ;
  public int vNr;
  public int vOa;
  public int vOb;
  public String vOc;
  public long vOd;
  public int vOe;
  public int vOf;
  public int vOg;
  public int vOh;
  public int vOi;
  public int vOj;
  public int vOk;

  public ks()
  {
    AppMethodBeat.i(14714);
    this.vNO = new LinkedList();
    AppMethodBeat.o(14714);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14715);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vNN != null)
        paramArrayOfObject.e(1, this.vNN);
      paramArrayOfObject.ai(2, this.cuQ);
      paramArrayOfObject.iz(3, this.pos);
      paramArrayOfObject.e(4, 2, this.vNO);
      paramArrayOfObject.iz(5, this.vNP);
      paramArrayOfObject.iz(6, this.vNQ);
      paramArrayOfObject.iz(7, this.vNR);
      paramArrayOfObject.iz(8, this.vNS);
      paramArrayOfObject.iz(9, this.vNT);
      paramArrayOfObject.iz(10, this.vNU);
      paramArrayOfObject.iz(11, this.vNr);
      paramArrayOfObject.iz(12, this.vNV);
      paramArrayOfObject.iz(13, this.vNW);
      paramArrayOfObject.iz(14, this.cancel);
      paramArrayOfObject.iz(15, this.vNX);
      paramArrayOfObject.iz(16, this.vNY);
      paramArrayOfObject.iz(17, this.vNZ);
      paramArrayOfObject.iz(18, this.vOa);
      paramArrayOfObject.iz(19, this.vOb);
      if (this.vOc != null)
        paramArrayOfObject.e(20, this.vOc);
      paramArrayOfObject.ai(21, this.vOd);
      paramArrayOfObject.iz(22, this.vOe);
      paramArrayOfObject.iz(23, this.vOf);
      paramArrayOfObject.iz(24, this.vOg);
      paramArrayOfObject.iz(25, this.vOh);
      paramArrayOfObject.iz(26, this.vOi);
      paramArrayOfObject.iz(27, this.vOj);
      paramArrayOfObject.iz(28, this.vOk);
      AppMethodBeat.o(14715);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vNN == null)
        break label1565;
    label1565: for (paramInt = e.a.a.b.b.a.f(1, this.vNN) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.cuQ) + e.a.a.b.b.a.bs(3, this.pos) + e.a.a.a.c(4, 2, this.vNO) + e.a.a.b.b.a.bs(5, this.vNP) + e.a.a.b.b.a.bs(6, this.vNQ) + e.a.a.b.b.a.bs(7, this.vNR) + e.a.a.b.b.a.bs(8, this.vNS) + e.a.a.b.b.a.bs(9, this.vNT) + e.a.a.b.b.a.bs(10, this.vNU) + e.a.a.b.b.a.bs(11, this.vNr) + e.a.a.b.b.a.bs(12, this.vNV) + e.a.a.b.b.a.bs(13, this.vNW) + e.a.a.b.b.a.bs(14, this.cancel) + e.a.a.b.b.a.bs(15, this.vNX) + e.a.a.b.b.a.bs(16, this.vNY) + e.a.a.b.b.a.bs(17, this.vNZ) + e.a.a.b.b.a.bs(18, this.vOa) + e.a.a.b.b.a.bs(19, this.vOb);
      paramInt = i;
      if (this.vOc != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.vOc);
      paramInt = paramInt + e.a.a.b.b.a.o(21, this.vOd) + e.a.a.b.b.a.bs(22, this.vOe) + e.a.a.b.b.a.bs(23, this.vOf) + e.a.a.b.b.a.bs(24, this.vOg) + e.a.a.b.b.a.bs(25, this.vOh) + e.a.a.b.b.a.bs(26, this.vOi) + e.a.a.b.b.a.bs(27, this.vOj) + e.a.a.b.b.a.bs(28, this.vOk);
      AppMethodBeat.o(14715);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vNO.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14715);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ks localks = (ks)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14715);
          break;
        case 1:
          localks.vNN = locala.BTU.readString();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 2:
          localks.cuQ = locala.BTU.ve();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 3:
          localks.pos = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 4:
          localks.vNO.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 5:
          localks.vNP = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 6:
          localks.vNQ = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 7:
          localks.vNR = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 8:
          localks.vNS = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 9:
          localks.vNT = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 10:
          localks.vNU = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 11:
          localks.vNr = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 12:
          localks.vNV = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 13:
          localks.vNW = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 14:
          localks.cancel = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 15:
          localks.vNX = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 16:
          localks.vNY = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 17:
          localks.vNZ = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 18:
          localks.vOa = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 19:
          localks.vOb = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 20:
          localks.vOc = locala.BTU.readString();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 21:
          localks.vOd = locala.BTU.ve();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 22:
          localks.vOe = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 23:
          localks.vOf = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 24:
          localks.vOg = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 25:
          localks.vOh = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 26:
          localks.vOi = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 27:
          localks.vOj = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        case 28:
          localks.vOk = locala.BTU.vd();
          AppMethodBeat.o(14715);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14715);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ks
 * JD-Core Version:    0.6.2
 */