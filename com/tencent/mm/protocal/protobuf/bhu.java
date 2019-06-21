package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class bhu extends com.tencent.mm.bt.a
{
  public String Name;
  public String guO;
  public String guP;
  public String oRb;
  public double vNH;
  public double vNI;
  public String wKW;
  public String wKX;
  public String wKY;
  public String wKZ;
  public String wcl;
  public String wcm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(113787);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Name != null)
        paramArrayOfObject.e(1, this.Name);
      if (this.wKW != null)
        paramArrayOfObject.e(2, this.wKW);
      paramArrayOfObject.f(3, this.vNH);
      paramArrayOfObject.f(4, this.vNI);
      if (this.wKX != null)
        paramArrayOfObject.e(5, this.wKX);
      if (this.oRb != null)
        paramArrayOfObject.e(6, this.oRb);
      if (this.wKY != null)
        paramArrayOfObject.e(7, this.wKY);
      if (this.guO != null)
        paramArrayOfObject.e(8, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(9, this.guP);
      if (this.wcl != null)
        paramArrayOfObject.e(10, this.wcl);
      if (this.wcm != null)
        paramArrayOfObject.e(11, this.wcm);
      if (this.wKZ != null)
        paramArrayOfObject.e(12, this.wKZ);
      AppMethodBeat.o(113787);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Name == null)
        break label910;
    label910: for (paramInt = e.a.a.b.b.a.f(1, this.Name) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wKW != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wKW);
      paramInt = i + (e.a.a.b.b.a.fv(3) + 8) + (e.a.a.b.b.a.fv(4) + 8);
      i = paramInt;
      if (this.wKX != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wKX);
      paramInt = i;
      if (this.oRb != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.oRb);
      i = paramInt;
      if (this.wKY != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wKY);
      int j = i;
      if (this.guO != null)
        j = i + e.a.a.b.b.a.f(8, this.guO);
      paramInt = j;
      if (this.guP != null)
        paramInt = j + e.a.a.b.b.a.f(9, this.guP);
      i = paramInt;
      if (this.wcl != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wcl);
      paramInt = i;
      if (this.wcm != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wcm);
      i = paramInt;
      if (this.wKZ != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wKZ);
      AppMethodBeat.o(113787);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(113787);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bhu localbhu = (bhu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(113787);
          break;
        case 1:
          localbhu.Name = locala.BTU.readString();
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 2:
          localbhu.wKW = locala.BTU.readString();
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 3:
          localbhu.vNH = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 4:
          localbhu.vNI = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 5:
          localbhu.wKX = locala.BTU.readString();
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 6:
          localbhu.oRb = locala.BTU.readString();
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 7:
          localbhu.wKY = locala.BTU.readString();
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 8:
          localbhu.guO = locala.BTU.readString();
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 9:
          localbhu.guP = locala.BTU.readString();
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 10:
          localbhu.wcl = locala.BTU.readString();
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 11:
          localbhu.wcm = locala.BTU.readString();
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        case 12:
          localbhu.wKZ = locala.BTU.readString();
          AppMethodBeat.o(113787);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(113787);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bhu
 * JD-Core Version:    0.6.2
 */