package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p extends com.tencent.mm.bt.a
{
  public String fgd;
  public int fjA;
  public int fjB;
  public String fjC;
  public String fjD;
  public int fjE;
  public int fjF;
  public String fjG;
  public String fjH;
  public String fjI;
  public String fjJ;
  public String fjK;
  public String fjL;
  public int fjM;
  public int fjN;
  public String fjO;
  public String fjv;
  public String fjw;
  public String fjx;
  public String fjy;
  public String fjz;
  public long time;
  public String title;
  public int type;
  public String url;
  public int videoHeight;
  public int videoWidth;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(105479);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.fjv != null)
        paramArrayOfObject.e(3, this.fjv);
      if (this.fjw != null)
        paramArrayOfObject.e(4, this.fjw);
      paramArrayOfObject.ai(5, this.time);
      if (this.fjx != null)
        paramArrayOfObject.e(6, this.fjx);
      if (this.fjy != null)
        paramArrayOfObject.e(7, this.fjy);
      if (this.fjz != null)
        paramArrayOfObject.e(8, this.fjz);
      paramArrayOfObject.iz(9, this.type);
      paramArrayOfObject.iz(10, this.fjA);
      paramArrayOfObject.iz(11, this.fjB);
      if (this.fjC != null)
        paramArrayOfObject.e(12, this.fjC);
      if (this.fjD != null)
        paramArrayOfObject.e(13, this.fjD);
      paramArrayOfObject.iz(14, this.fjE);
      paramArrayOfObject.iz(15, this.fjF);
      if (this.fjG != null)
        paramArrayOfObject.e(16, this.fjG);
      if (this.fjH != null)
        paramArrayOfObject.e(17, this.fjH);
      if (this.fjI != null)
        paramArrayOfObject.e(18, this.fjI);
      if (this.fjJ != null)
        paramArrayOfObject.e(19, this.fjJ);
      if (this.fjK != null)
        paramArrayOfObject.e(20, this.fjK);
      if (this.fjL != null)
        paramArrayOfObject.e(21, this.fjL);
      paramArrayOfObject.iz(22, this.fjM);
      paramArrayOfObject.iz(23, this.fjN);
      if (this.fjO != null)
        paramArrayOfObject.e(24, this.fjO);
      paramArrayOfObject.iz(25, this.videoWidth);
      paramArrayOfObject.iz(26, this.videoHeight);
      if (this.fgd != null)
        paramArrayOfObject.e(27, this.fgd);
      AppMethodBeat.o(105479);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label1741;
    label1741: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.url);
      i = paramInt;
      if (this.fjv != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.fjv);
      paramInt = i;
      if (this.fjw != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.fjw);
      i = paramInt + e.a.a.b.b.a.o(5, this.time);
      paramInt = i;
      if (this.fjx != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.fjx);
      i = paramInt;
      if (this.fjy != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.fjy);
      paramInt = i;
      if (this.fjz != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.fjz);
      i = paramInt + e.a.a.b.b.a.bs(9, this.type) + e.a.a.b.b.a.bs(10, this.fjA) + e.a.a.b.b.a.bs(11, this.fjB);
      paramInt = i;
      if (this.fjC != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.fjC);
      i = paramInt;
      if (this.fjD != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.fjD);
      paramInt = i + e.a.a.b.b.a.bs(14, this.fjE) + e.a.a.b.b.a.bs(15, this.fjF);
      i = paramInt;
      if (this.fjG != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.fjG);
      paramInt = i;
      if (this.fjH != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.fjH);
      i = paramInt;
      if (this.fjI != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.fjI);
      paramInt = i;
      if (this.fjJ != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.fjJ);
      i = paramInt;
      if (this.fjK != null)
        i = paramInt + e.a.a.b.b.a.f(20, this.fjK);
      paramInt = i;
      if (this.fjL != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.fjL);
      i = paramInt + e.a.a.b.b.a.bs(22, this.fjM) + e.a.a.b.b.a.bs(23, this.fjN);
      paramInt = i;
      if (this.fjO != null)
        paramInt = i + e.a.a.b.b.a.f(24, this.fjO);
      i = paramInt + e.a.a.b.b.a.bs(25, this.videoWidth) + e.a.a.b.b.a.bs(26, this.videoHeight);
      paramInt = i;
      if (this.fgd != null)
        paramInt = i + e.a.a.b.b.a.f(27, this.fgd);
      AppMethodBeat.o(105479);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(105479);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        p localp = (p)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(105479);
          break;
        case 1:
          localp.title = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 2:
          localp.url = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 3:
          localp.fjv = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 4:
          localp.fjw = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 5:
          localp.time = locala.BTU.ve();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 6:
          localp.fjx = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 7:
          localp.fjy = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 8:
          localp.fjz = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 9:
          localp.type = locala.BTU.vd();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 10:
          localp.fjA = locala.BTU.vd();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 11:
          localp.fjB = locala.BTU.vd();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 12:
          localp.fjC = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 13:
          localp.fjD = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 14:
          localp.fjE = locala.BTU.vd();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 15:
          localp.fjF = locala.BTU.vd();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 16:
          localp.fjG = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 17:
          localp.fjH = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 18:
          localp.fjI = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 19:
          localp.fjJ = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 20:
          localp.fjK = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 21:
          localp.fjL = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 22:
          localp.fjM = locala.BTU.vd();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 23:
          localp.fjN = locala.BTU.vd();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 24:
          localp.fjO = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 25:
          localp.videoWidth = locala.BTU.vd();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 26:
          localp.videoHeight = locala.BTU.vd();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        case 27:
          localp.fgd = locala.BTU.readString();
          AppMethodBeat.o(105479);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(105479);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.p
 * JD-Core Version:    0.6.2
 */