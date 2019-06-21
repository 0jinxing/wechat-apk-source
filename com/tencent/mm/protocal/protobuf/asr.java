package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class asr extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public int dFp;
  public long dFq;
  public String dFr;
  public String dFs;
  public String dFt;
  public String dFu;
  public String guS;
  public String mZj;
  public String vHO;
  public String vKF;
  public String wwm;
  public String wwn;
  public int wwo;
  public int wwp;
  public int wwq;
  public int wwr;
  public String wws;
  public String wwt;
  public String wwu;
  public String wwv;
  public int www;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10190);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wwm != null)
        paramArrayOfObject.e(1, this.wwm);
      if (this.vHO != null)
        paramArrayOfObject.e(2, this.vHO);
      if (this.vKF != null)
        paramArrayOfObject.e(3, this.vKF);
      if (this.wwn != null)
        paramArrayOfObject.e(4, this.wwn);
      paramArrayOfObject.iz(5, this.wwo);
      paramArrayOfObject.iz(6, this.wwp);
      paramArrayOfObject.iz(7, this.wwq);
      paramArrayOfObject.iz(8, this.wwr);
      if (this.wws != null)
        paramArrayOfObject.e(9, this.wws);
      if (this.guS != null)
        paramArrayOfObject.e(10, this.guS);
      if (this.IconUrl != null)
        paramArrayOfObject.e(11, this.IconUrl);
      if (this.mZj != null)
        paramArrayOfObject.e(12, this.mZj);
      if (this.wwt != null)
        paramArrayOfObject.e(13, this.wwt);
      if (this.wwu != null)
        paramArrayOfObject.e(14, this.wwu);
      if (this.wwv != null)
        paramArrayOfObject.e(15, this.wwv);
      paramArrayOfObject.iz(16, this.www);
      paramArrayOfObject.iz(17, this.dFp);
      paramArrayOfObject.ai(18, this.dFq);
      if (this.dFr != null)
        paramArrayOfObject.e(19, this.dFr);
      if (this.dFs != null)
        paramArrayOfObject.e(20, this.dFs);
      if (this.dFt != null)
        paramArrayOfObject.e(21, this.dFt);
      if (this.dFu != null)
        paramArrayOfObject.e(22, this.dFu);
      AppMethodBeat.o(10190);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wwm == null)
        break label1494;
    label1494: for (i = e.a.a.b.b.a.f(1, this.wwm) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vHO != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vHO);
      i = paramInt;
      if (this.vKF != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vKF);
      paramInt = i;
      if (this.wwn != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wwn);
      i = paramInt + e.a.a.b.b.a.bs(5, this.wwo) + e.a.a.b.b.a.bs(6, this.wwp) + e.a.a.b.b.a.bs(7, this.wwq) + e.a.a.b.b.a.bs(8, this.wwr);
      paramInt = i;
      if (this.wws != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wws);
      i = paramInt;
      if (this.guS != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.guS);
      paramInt = i;
      if (this.IconUrl != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.IconUrl);
      i = paramInt;
      if (this.mZj != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.mZj);
      paramInt = i;
      if (this.wwt != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.wwt);
      i = paramInt;
      if (this.wwu != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.wwu);
      paramInt = i;
      if (this.wwv != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.wwv);
      i = paramInt + e.a.a.b.b.a.bs(16, this.www) + e.a.a.b.b.a.bs(17, this.dFp) + e.a.a.b.b.a.o(18, this.dFq);
      paramInt = i;
      if (this.dFr != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.dFr);
      i = paramInt;
      if (this.dFs != null)
        i = paramInt + e.a.a.b.b.a.f(20, this.dFs);
      paramInt = i;
      if (this.dFt != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.dFt);
      i = paramInt;
      if (this.dFu != null)
        i = paramInt + e.a.a.b.b.a.f(22, this.dFu);
      AppMethodBeat.o(10190);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10190);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        asr localasr = (asr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10190);
          break;
        case 1:
          localasr.wwm = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 2:
          localasr.vHO = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 3:
          localasr.vKF = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 4:
          localasr.wwn = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 5:
          localasr.wwo = locala.BTU.vd();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 6:
          localasr.wwp = locala.BTU.vd();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 7:
          localasr.wwq = locala.BTU.vd();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 8:
          localasr.wwr = locala.BTU.vd();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 9:
          localasr.wws = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 10:
          localasr.guS = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 11:
          localasr.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 12:
          localasr.mZj = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 13:
          localasr.wwt = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 14:
          localasr.wwu = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 15:
          localasr.wwv = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 16:
          localasr.www = locala.BTU.vd();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 17:
          localasr.dFp = locala.BTU.vd();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 18:
          localasr.dFq = locala.BTU.ve();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 19:
          localasr.dFr = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 20:
          localasr.dFs = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 21:
          localasr.dFt = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        case 22:
          localasr.dFu = locala.BTU.readString();
          AppMethodBeat.o(10190);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10190);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asr
 * JD-Core Version:    0.6.2
 */