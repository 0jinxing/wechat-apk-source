package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cht extends com.tencent.mm.bt.a
{
  public String cIY;
  public String cJb;
  public int dtW;
  public String extInfo;
  public int fQi;
  public long fRS;
  public int tZU;
  public String text;
  public int type;
  public int uaU;
  public int uaV;
  public int uaW;
  public int xgA;
  public long xgB;
  public long xgz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55706);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cJb != null)
        paramArrayOfObject.e(1, this.cJb);
      paramArrayOfObject.iz(2, this.uaU);
      paramArrayOfObject.iz(3, this.uaV);
      paramArrayOfObject.ai(4, this.fRS);
      paramArrayOfObject.iz(5, this.tZU);
      paramArrayOfObject.iz(6, this.type);
      if (this.text != null)
        paramArrayOfObject.e(7, this.text);
      if (this.cIY != null)
        paramArrayOfObject.e(8, this.cIY);
      paramArrayOfObject.ai(9, this.xgz);
      paramArrayOfObject.iz(10, this.uaW);
      paramArrayOfObject.iz(11, this.xgA);
      paramArrayOfObject.ai(12, this.xgB);
      paramArrayOfObject.iz(13, this.dtW);
      paramArrayOfObject.iz(14, this.fQi);
      if (this.extInfo != null)
        paramArrayOfObject.e(15, this.extInfo);
      AppMethodBeat.o(55706);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cJb == null)
        break label937;
    label937: for (paramInt = e.a.a.b.b.a.f(1, this.cJb) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.uaU) + e.a.a.b.b.a.bs(3, this.uaV) + e.a.a.b.b.a.o(4, this.fRS) + e.a.a.b.b.a.bs(5, this.tZU) + e.a.a.b.b.a.bs(6, this.type);
      paramInt = i;
      if (this.text != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.text);
      i = paramInt;
      if (this.cIY != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.cIY);
      i = i + e.a.a.b.b.a.o(9, this.xgz) + e.a.a.b.b.a.bs(10, this.uaW) + e.a.a.b.b.a.bs(11, this.xgA) + e.a.a.b.b.a.o(12, this.xgB) + e.a.a.b.b.a.bs(13, this.dtW) + e.a.a.b.b.a.bs(14, this.fQi);
      paramInt = i;
      if (this.extInfo != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.extInfo);
      AppMethodBeat.o(55706);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55706);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cht localcht = (cht)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55706);
          break;
        case 1:
          localcht.cJb = locala.BTU.readString();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 2:
          localcht.uaU = locala.BTU.vd();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 3:
          localcht.uaV = locala.BTU.vd();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 4:
          localcht.fRS = locala.BTU.ve();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 5:
          localcht.tZU = locala.BTU.vd();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 6:
          localcht.type = locala.BTU.vd();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 7:
          localcht.text = locala.BTU.readString();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 8:
          localcht.cIY = locala.BTU.readString();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 9:
          localcht.xgz = locala.BTU.ve();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 10:
          localcht.uaW = locala.BTU.vd();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 11:
          localcht.xgA = locala.BTU.vd();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 12:
          localcht.xgB = locala.BTU.ve();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 13:
          localcht.dtW = locala.BTU.vd();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 14:
          localcht.fQi = locala.BTU.vd();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        case 15:
          localcht.extInfo = locala.BTU.readString();
          AppMethodBeat.o(55706);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55706);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cht
 * JD-Core Version:    0.6.2
 */