package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aay extends com.tencent.mm.bt.a
{
  public int cED;
  public String cIK;
  public String label;
  public double lat;
  public double lng;
  public boolean wih = false;
  public boolean wii = false;
  public boolean wij = false;
  public boolean wik = false;
  public boolean wil = false;

  public final aay D(double paramDouble)
  {
    this.lng = paramDouble;
    this.wih = true;
    return this;
  }

  public final aay E(double paramDouble)
  {
    this.lat = paramDouble;
    this.wii = true;
    return this;
  }

  public final aay LJ(int paramInt)
  {
    this.cED = paramInt;
    this.wij = true;
    return this;
  }

  public final aay alu(String paramString)
  {
    this.label = paramString;
    this.wik = true;
    return this;
  }

  public final aay alv(String paramString)
  {
    this.cIK = paramString;
    this.wil = true;
    return this;
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51399);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wih == true)
        paramArrayOfObject.f(1, this.lng);
      if (this.wii == true)
        paramArrayOfObject.f(2, this.lat);
      if (this.wij == true)
        paramArrayOfObject.iz(3, this.cED);
      if (this.label != null)
        paramArrayOfObject.e(4, this.label);
      if (this.cIK != null)
        paramArrayOfObject.e(5, this.cIK);
      AppMethodBeat.o(51399);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wih != true)
        break label523;
    label523: for (i = e.a.a.b.b.a.fv(1) + 8 + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wii == true)
        paramInt = i + (e.a.a.b.b.a.fv(2) + 8);
      i = paramInt;
      if (this.wij == true)
        i = paramInt + e.a.a.b.b.a.bs(3, this.cED);
      paramInt = i;
      if (this.label != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.label);
      i = paramInt;
      if (this.cIK != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.cIK);
      AppMethodBeat.o(51399);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51399);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aay localaay = (aay)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51399);
          break;
        case 1:
          localaay.lng = Double.longBitsToDouble(locala.BTU.eib());
          localaay.wih = true;
          AppMethodBeat.o(51399);
          paramInt = i;
          break;
        case 2:
          localaay.lat = Double.longBitsToDouble(locala.BTU.eib());
          localaay.wii = true;
          AppMethodBeat.o(51399);
          paramInt = i;
          break;
        case 3:
          localaay.cED = locala.BTU.vd();
          localaay.wij = true;
          AppMethodBeat.o(51399);
          paramInt = i;
          break;
        case 4:
          localaay.label = locala.BTU.readString();
          localaay.wik = true;
          AppMethodBeat.o(51399);
          paramInt = i;
          break;
        case 5:
          localaay.cIK = locala.BTU.readString();
          localaay.wil = true;
          AppMethodBeat.o(51399);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51399);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aay
 * JD-Core Version:    0.6.2
 */