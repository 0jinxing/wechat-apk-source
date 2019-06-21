package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class azg extends com.tencent.mm.bt.a
{
  public String csB;
  public String kKY;
  public int kLb;
  public String wDa;
  public String wDb;
  public String wDc;
  public String wDd;
  public int wDe;
  public String wDf;
  public int wDg;
  public int wDh;
  public String wDi;
  public int wDj;
  public int wDk;
  public String wDl;
  public int wDm;
  public int wDn;
  public String wDo;
  public String wDp;
  public String wDq;
  public String wDr;
  public int wcR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80121);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      if (this.wDa != null)
        paramArrayOfObject.e(20, this.wDa);
      if (this.wDb != null)
        paramArrayOfObject.e(21, this.wDb);
      if (this.wDc != null)
        paramArrayOfObject.e(22, this.wDc);
      if (this.wDd != null)
        paramArrayOfObject.e(23, this.wDd);
      if (this.kKY != null)
        paramArrayOfObject.e(31, this.kKY);
      paramArrayOfObject.iz(32, this.kLb);
      paramArrayOfObject.iz(33, this.wDe);
      if (this.wDf != null)
        paramArrayOfObject.e(34, this.wDf);
      paramArrayOfObject.iz(35, this.wDg);
      paramArrayOfObject.iz(36, this.wDh);
      if (this.wDi != null)
        paramArrayOfObject.e(37, this.wDi);
      paramArrayOfObject.iz(38, this.wDj);
      paramArrayOfObject.iz(39, this.wDk);
      if (this.wDl != null)
        paramArrayOfObject.e(41, this.wDl);
      paramArrayOfObject.iz(200, this.wDm);
      paramArrayOfObject.iz(201, this.wDn);
      paramArrayOfObject.iz(202, this.wcR);
      if (this.wDo != null)
        paramArrayOfObject.e(203, this.wDo);
      if (this.wDp != null)
        paramArrayOfObject.e(204, this.wDp);
      if (this.wDq != null)
        paramArrayOfObject.e(205, this.wDq);
      if (this.wDr != null)
        paramArrayOfObject.e(206, this.wDr);
      AppMethodBeat.o(80121);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label1542;
    label1542: for (i = e.a.a.b.b.a.f(1, this.csB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wDa != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.wDa);
      int j = paramInt;
      if (this.wDb != null)
        j = paramInt + e.a.a.b.b.a.f(21, this.wDb);
      i = j;
      if (this.wDc != null)
        i = j + e.a.a.b.b.a.f(22, this.wDc);
      paramInt = i;
      if (this.wDd != null)
        paramInt = i + e.a.a.b.b.a.f(23, this.wDd);
      i = paramInt;
      if (this.kKY != null)
        i = paramInt + e.a.a.b.b.a.f(31, this.kKY);
      i = i + e.a.a.b.b.a.bs(32, this.kLb) + e.a.a.b.b.a.bs(33, this.wDe);
      paramInt = i;
      if (this.wDf != null)
        paramInt = i + e.a.a.b.b.a.f(34, this.wDf);
      i = paramInt + e.a.a.b.b.a.bs(35, this.wDg) + e.a.a.b.b.a.bs(36, this.wDh);
      paramInt = i;
      if (this.wDi != null)
        paramInt = i + e.a.a.b.b.a.f(37, this.wDi);
      i = paramInt + e.a.a.b.b.a.bs(38, this.wDj) + e.a.a.b.b.a.bs(39, this.wDk);
      paramInt = i;
      if (this.wDl != null)
        paramInt = i + e.a.a.b.b.a.f(41, this.wDl);
      i = paramInt + e.a.a.b.b.a.bs(200, this.wDm) + e.a.a.b.b.a.bs(201, this.wDn) + e.a.a.b.b.a.bs(202, this.wcR);
      paramInt = i;
      if (this.wDo != null)
        paramInt = i + e.a.a.b.b.a.f(203, this.wDo);
      i = paramInt;
      if (this.wDp != null)
        i = paramInt + e.a.a.b.b.a.f(204, this.wDp);
      paramInt = i;
      if (this.wDq != null)
        paramInt = i + e.a.a.b.b.a.f(205, this.wDq);
      i = paramInt;
      if (this.wDr != null)
        i = paramInt + e.a.a.b.b.a.f(206, this.wDr);
      AppMethodBeat.o(80121);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80121);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        azg localazg = (azg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(80121);
          paramInt = -1;
          break;
        case 1:
          localazg.csB = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 20:
          localazg.wDa = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 21:
          localazg.wDb = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 22:
          localazg.wDc = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 23:
          localazg.wDd = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 31:
          localazg.kKY = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 32:
          localazg.kLb = locala.BTU.vd();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 33:
          localazg.wDe = locala.BTU.vd();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 34:
          localazg.wDf = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 35:
          localazg.wDg = locala.BTU.vd();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 36:
          localazg.wDh = locala.BTU.vd();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 37:
          localazg.wDi = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 38:
          localazg.wDj = locala.BTU.vd();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 39:
          localazg.wDk = locala.BTU.vd();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 41:
          localazg.wDl = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 200:
          localazg.wDm = locala.BTU.vd();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 201:
          localazg.wDn = locala.BTU.vd();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 202:
          localazg.wcR = locala.BTU.vd();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 203:
          localazg.wDo = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 204:
          localazg.wDp = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 205:
          localazg.wDq = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        case 206:
          localazg.wDr = locala.BTU.readString();
          AppMethodBeat.o(80121);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80121);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azg
 * JD-Core Version:    0.6.2
 */