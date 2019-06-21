package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cek extends com.tencent.mm.bt.a
{
  public String Id;
  public String Url;
  public int cNE;
  public int cuu;
  public String cvZ;
  public float duration;
  public int jCt;
  public int wEG;
  public String wEH;
  public int wEI;
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
    AppMethodBeat.i(56527);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Id != null)
        paramArrayOfObject.e(1, this.Id);
      paramArrayOfObject.iz(2, this.jCt);
      if (this.Url != null)
        paramArrayOfObject.e(3, this.Url);
      paramArrayOfObject.iz(4, this.wEG);
      if (this.wEH != null)
        paramArrayOfObject.e(5, this.wEH);
      paramArrayOfObject.iz(6, this.wEI);
      paramArrayOfObject.iz(7, this.cuu);
      if (this.cvZ != null)
        paramArrayOfObject.e(8, this.cvZ);
      if (this.wFc != null)
        paramArrayOfObject.e(9, this.wFc);
      paramArrayOfObject.iz(10, this.cNE);
      paramArrayOfObject.iz(11, this.wET);
      paramArrayOfObject.ai(12, this.wEU);
      if (this.wEV != null)
        paramArrayOfObject.e(13, this.wEV);
      if (this.wEW != null)
        paramArrayOfObject.e(14, this.wEW);
      paramArrayOfObject.iz(15, this.wEX);
      if (this.wEY != null)
        paramArrayOfObject.e(16, this.wEY);
      if (this.wEZ != null)
        paramArrayOfObject.e(17, this.wEZ);
      paramArrayOfObject.iz(18, this.wFa);
      if (this.wFb != null)
        paramArrayOfObject.e(19, this.wFb);
      paramArrayOfObject.r(20, this.duration);
      AppMethodBeat.o(56527);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Id == null)
        break label1291;
    label1291: for (paramInt = e.a.a.b.b.a.f(1, this.Id) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCt);
      paramInt = i;
      if (this.Url != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.Url);
      i = paramInt + e.a.a.b.b.a.bs(4, this.wEG);
      paramInt = i;
      if (this.wEH != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wEH);
      i = paramInt + e.a.a.b.b.a.bs(6, this.wEI) + e.a.a.b.b.a.bs(7, this.cuu);
      paramInt = i;
      if (this.cvZ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.cvZ);
      i = paramInt;
      if (this.wFc != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wFc);
      i = i + e.a.a.b.b.a.bs(10, this.cNE) + e.a.a.b.b.a.bs(11, this.wET) + e.a.a.b.b.a.o(12, this.wEU);
      paramInt = i;
      if (this.wEV != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.wEV);
      i = paramInt;
      if (this.wEW != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.wEW);
      i += e.a.a.b.b.a.bs(15, this.wEX);
      paramInt = i;
      if (this.wEY != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.wEY);
      i = paramInt;
      if (this.wEZ != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.wEZ);
      i += e.a.a.b.b.a.bs(18, this.wFa);
      paramInt = i;
      if (this.wFb != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.wFb);
      paramInt += e.a.a.b.b.a.fv(20) + 4;
      AppMethodBeat.o(56527);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56527);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cek localcek = (cek)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56527);
          break;
        case 1:
          localcek.Id = locala.BTU.readString();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 2:
          localcek.jCt = locala.BTU.vd();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 3:
          localcek.Url = locala.BTU.readString();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 4:
          localcek.wEG = locala.BTU.vd();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 5:
          localcek.wEH = locala.BTU.readString();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 6:
          localcek.wEI = locala.BTU.vd();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 7:
          localcek.cuu = locala.BTU.vd();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 8:
          localcek.cvZ = locala.BTU.readString();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 9:
          localcek.wFc = locala.BTU.readString();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 10:
          localcek.cNE = locala.BTU.vd();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 11:
          localcek.wET = locala.BTU.vd();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 12:
          localcek.wEU = locala.BTU.ve();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 13:
          localcek.wEV = locala.BTU.readString();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 14:
          localcek.wEW = locala.BTU.readString();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 15:
          localcek.wEX = locala.BTU.vd();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 16:
          localcek.wEY = locala.BTU.readString();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 17:
          localcek.wEZ = locala.BTU.readString();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 18:
          localcek.wFa = locala.BTU.vd();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 19:
          localcek.wFb = locala.BTU.readString();
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        case 20:
          localcek.duration = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(56527);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56527);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cek
 * JD-Core Version:    0.6.2
 */