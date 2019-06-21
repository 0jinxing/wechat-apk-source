package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class od extends com.tencent.mm.bt.a
{
  public float cEB;
  public float cGm;
  public String country;
  public String descriptor;
  public String duc;
  public String dud;
  public String fBg;
  public String kck;
  public String kdF;
  public String name;
  public float qVo;
  public String vTL;
  public String vTM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89039);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.name != null)
        paramArrayOfObject.e(1, this.name);
      if (this.descriptor != null)
        paramArrayOfObject.e(2, this.descriptor);
      if (this.kck != null)
        paramArrayOfObject.e(3, this.kck);
      if (this.country != null)
        paramArrayOfObject.e(4, this.country);
      if (this.duc != null)
        paramArrayOfObject.e(5, this.duc);
      if (this.dud != null)
        paramArrayOfObject.e(6, this.dud);
      if (this.fBg != null)
        paramArrayOfObject.e(7, this.fBg);
      paramArrayOfObject.r(8, this.qVo);
      paramArrayOfObject.r(9, this.cGm);
      paramArrayOfObject.r(10, this.cEB);
      if (this.kdF != null)
        paramArrayOfObject.e(11, this.kdF);
      if (this.vTL != null)
        paramArrayOfObject.e(12, this.vTL);
      if (this.vTM != null)
        paramArrayOfObject.e(13, this.vTM);
      AppMethodBeat.o(89039);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.name == null)
        break label952;
    label952: for (paramInt = e.a.a.b.b.a.f(1, this.name) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.descriptor != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.descriptor);
      paramInt = i;
      if (this.kck != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kck);
      i = paramInt;
      if (this.country != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.country);
      paramInt = i;
      if (this.duc != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.duc);
      i = paramInt;
      if (this.dud != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.dud);
      paramInt = i;
      if (this.fBg != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.fBg);
      paramInt = paramInt + (e.a.a.b.b.a.fv(8) + 4) + (e.a.a.b.b.a.fv(9) + 4) + (e.a.a.b.b.a.fv(10) + 4);
      i = paramInt;
      if (this.kdF != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.kdF);
      paramInt = i;
      if (this.vTL != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vTL);
      i = paramInt;
      if (this.vTM != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.vTM);
      AppMethodBeat.o(89039);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89039);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        od localod = (od)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89039);
          break;
        case 1:
          localod.name = locala.BTU.readString();
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 2:
          localod.descriptor = locala.BTU.readString();
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 3:
          localod.kck = locala.BTU.readString();
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 4:
          localod.country = locala.BTU.readString();
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 5:
          localod.duc = locala.BTU.readString();
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 6:
          localod.dud = locala.BTU.readString();
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 7:
          localod.fBg = locala.BTU.readString();
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 8:
          localod.qVo = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 9:
          localod.cGm = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 10:
          localod.cEB = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 11:
          localod.kdF = locala.BTU.readString();
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 12:
          localod.vTL = locala.BTU.readString();
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        case 13:
          localod.vTM = locala.BTU.readString();
          AppMethodBeat.o(89039);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89039);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.od
 * JD-Core Version:    0.6.2
 */