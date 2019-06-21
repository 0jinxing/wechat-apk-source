package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aul extends com.tencent.mm.bt.a
{
  public int wyA;
  public int wyB;
  public int wyC;
  public int wyD;
  public float wyE;
  public float wyF;
  public float wyG;
  public String wyv;
  public String wyw;
  public long wyx;
  public int wyy;
  public int wyz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(54937);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyv != null)
        paramArrayOfObject.e(1, this.wyv);
      if (this.wyw != null)
        paramArrayOfObject.e(2, this.wyw);
      paramArrayOfObject.ai(3, this.wyx);
      paramArrayOfObject.iz(4, this.wyy);
      paramArrayOfObject.iz(5, this.wyz);
      paramArrayOfObject.iz(6, this.wyA);
      paramArrayOfObject.iz(7, this.wyB);
      paramArrayOfObject.iz(8, this.wyC);
      paramArrayOfObject.iz(9, this.wyD);
      paramArrayOfObject.r(10, this.wyE);
      paramArrayOfObject.r(11, this.wyF);
      paramArrayOfObject.r(12, this.wyG);
      AppMethodBeat.o(54937);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wyv == null)
        break label761;
    label761: for (paramInt = e.a.a.b.b.a.f(1, this.wyv) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wyw != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wyw);
      paramInt = i + e.a.a.b.b.a.o(3, this.wyx) + e.a.a.b.b.a.bs(4, this.wyy) + e.a.a.b.b.a.bs(5, this.wyz) + e.a.a.b.b.a.bs(6, this.wyA) + e.a.a.b.b.a.bs(7, this.wyB) + e.a.a.b.b.a.bs(8, this.wyC) + e.a.a.b.b.a.bs(9, this.wyD) + (e.a.a.b.b.a.fv(10) + 4) + (e.a.a.b.b.a.fv(11) + 4) + (e.a.a.b.b.a.fv(12) + 4);
      AppMethodBeat.o(54937);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(54937);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aul localaul = (aul)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(54937);
          break;
        case 1:
          localaul.wyv = locala.BTU.readString();
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 2:
          localaul.wyw = locala.BTU.readString();
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 3:
          localaul.wyx = locala.BTU.ve();
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 4:
          localaul.wyy = locala.BTU.vd();
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 5:
          localaul.wyz = locala.BTU.vd();
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 6:
          localaul.wyA = locala.BTU.vd();
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 7:
          localaul.wyB = locala.BTU.vd();
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 8:
          localaul.wyC = locala.BTU.vd();
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 9:
          localaul.wyD = locala.BTU.vd();
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 10:
          localaul.wyE = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 11:
          localaul.wyF = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        case 12:
          localaul.wyG = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(54937);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(54937);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aul
 * JD-Core Version:    0.6.2
 */