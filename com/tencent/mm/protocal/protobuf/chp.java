package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class chp extends com.tencent.mm.bt.a
{
  public int Scene;
  public String Title;
  public String ncM;
  public int vFH;
  public int vGB;
  public String wDM;
  public String wUo;
  public String wbI;
  public String xgs;
  public String xgt;
  public String xgu;
  public String xgv;
  public String xgw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124367);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xgs != null)
        paramArrayOfObject.e(1, this.xgs);
      if (this.wUo != null)
        paramArrayOfObject.e(2, this.wUo);
      if (this.ncM != null)
        paramArrayOfObject.e(3, this.ncM);
      if (this.xgt != null)
        paramArrayOfObject.e(4, this.xgt);
      if (this.xgu != null)
        paramArrayOfObject.e(5, this.xgu);
      if (this.xgv != null)
        paramArrayOfObject.e(6, this.xgv);
      if (this.Title != null)
        paramArrayOfObject.e(7, this.Title);
      if (this.wDM != null)
        paramArrayOfObject.e(8, this.wDM);
      paramArrayOfObject.iz(9, this.Scene);
      paramArrayOfObject.iz(10, this.vGB);
      if (this.xgw != null)
        paramArrayOfObject.e(11, this.xgw);
      if (this.wbI != null)
        paramArrayOfObject.e(12, this.wbI);
      paramArrayOfObject.iz(13, this.vFH);
      AppMethodBeat.o(124367);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xgs == null)
        break label951;
    label951: for (paramInt = e.a.a.b.b.a.f(1, this.xgs) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wUo != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wUo);
      paramInt = i;
      if (this.ncM != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ncM);
      i = paramInt;
      if (this.xgt != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xgt);
      paramInt = i;
      if (this.xgu != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.xgu);
      i = paramInt;
      if (this.xgv != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.xgv);
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.Title);
      i = paramInt;
      if (this.wDM != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wDM);
      i = i + e.a.a.b.b.a.bs(9, this.Scene) + e.a.a.b.b.a.bs(10, this.vGB);
      paramInt = i;
      if (this.xgw != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.xgw);
      i = paramInt;
      if (this.wbI != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wbI);
      paramInt = i + e.a.a.b.b.a.bs(13, this.vFH);
      AppMethodBeat.o(124367);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124367);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chp localchp = (chp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124367);
          break;
        case 1:
          localchp.xgs = locala.BTU.readString();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 2:
          localchp.wUo = locala.BTU.readString();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 3:
          localchp.ncM = locala.BTU.readString();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 4:
          localchp.xgt = locala.BTU.readString();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 5:
          localchp.xgu = locala.BTU.readString();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 6:
          localchp.xgv = locala.BTU.readString();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 7:
          localchp.Title = locala.BTU.readString();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 8:
          localchp.wDM = locala.BTU.readString();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 9:
          localchp.Scene = locala.BTU.vd();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 10:
          localchp.vGB = locala.BTU.vd();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 11:
          localchp.xgw = locala.BTU.readString();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 12:
          localchp.wbI = locala.BTU.readString();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        case 13:
          localchp.vFH = locala.BTU.vd();
          AppMethodBeat.o(124367);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124367);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chp
 * JD-Core Version:    0.6.2
 */