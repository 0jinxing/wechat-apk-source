package com.tencent.mm.plugin.order.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class i extends com.tencent.mm.bt.a
{
  public String ncH;
  public String pcU;
  public double pcV;
  public String pcW;
  public int pcX;
  public String pcY;
  public int pcZ;
  public String pda;
  public int pdb;
  public int pdc;
  public String pdd;
  public String pde;
  public String pdf;
  public String pdg;
  public String pdh;
  public int pdi;
  public LinkedList<k> pdj;
  public String pdk;
  public String pdl;
  public double pdm;
  public String pdn;

  public i()
  {
    AppMethodBeat.i(56618);
    this.pdj = new LinkedList();
    AppMethodBeat.o(56618);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56619);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pcU != null)
        paramArrayOfObject.e(1, this.pcU);
      paramArrayOfObject.f(2, this.pcV);
      if (this.pcW != null)
        paramArrayOfObject.e(3, this.pcW);
      paramArrayOfObject.iz(4, this.pcX);
      if (this.pcY != null)
        paramArrayOfObject.e(5, this.pcY);
      paramArrayOfObject.iz(6, this.pcZ);
      if (this.pda != null)
        paramArrayOfObject.e(7, this.pda);
      paramArrayOfObject.iz(8, this.pdb);
      paramArrayOfObject.iz(9, this.pdc);
      if (this.pdd != null)
        paramArrayOfObject.e(10, this.pdd);
      if (this.ncH != null)
        paramArrayOfObject.e(11, this.ncH);
      if (this.pde != null)
        paramArrayOfObject.e(12, this.pde);
      if (this.pdf != null)
        paramArrayOfObject.e(13, this.pdf);
      if (this.pdg != null)
        paramArrayOfObject.e(14, this.pdg);
      if (this.pdh != null)
        paramArrayOfObject.e(15, this.pdh);
      paramArrayOfObject.iz(16, this.pdi);
      paramArrayOfObject.e(17, 8, this.pdj);
      if (this.pdk != null)
        paramArrayOfObject.e(18, this.pdk);
      if (this.pdl != null)
        paramArrayOfObject.e(19, this.pdl);
      paramArrayOfObject.f(20, this.pdm);
      if (this.pdn != null)
        paramArrayOfObject.e(21, this.pdn);
      AppMethodBeat.o(56619);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pcU == null)
        break label1493;
    label1493: for (paramInt = e.a.a.b.b.a.f(1, this.pcU) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 8);
      paramInt = i;
      if (this.pcW != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.pcW);
      i = paramInt + e.a.a.b.b.a.bs(4, this.pcX);
      paramInt = i;
      if (this.pcY != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.pcY);
      i = paramInt + e.a.a.b.b.a.bs(6, this.pcZ);
      paramInt = i;
      if (this.pda != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.pda);
      paramInt = paramInt + e.a.a.b.b.a.bs(8, this.pdb) + e.a.a.b.b.a.bs(9, this.pdc);
      i = paramInt;
      if (this.pdd != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.pdd);
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.ncH);
      i = paramInt;
      if (this.pde != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.pde);
      paramInt = i;
      if (this.pdf != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.pdf);
      i = paramInt;
      if (this.pdg != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.pdg);
      paramInt = i;
      if (this.pdh != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.pdh);
      i = paramInt + e.a.a.b.b.a.bs(16, this.pdi) + e.a.a.a.c(17, 8, this.pdj);
      paramInt = i;
      if (this.pdk != null)
        paramInt = i + e.a.a.b.b.a.f(18, this.pdk);
      i = paramInt;
      if (this.pdl != null)
        i = paramInt + e.a.a.b.b.a.f(19, this.pdl);
      i += e.a.a.b.b.a.fv(20) + 8;
      paramInt = i;
      if (this.pdn != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.pdn);
      AppMethodBeat.o(56619);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.pdj.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56619);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        i locali = (i)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56619);
          break;
        case 1:
          locali.pcU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 2:
          locali.pcV = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 3:
          locali.pcW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 4:
          locali.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 5:
          locali.pcY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 6:
          locali.pcZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 7:
          locali.pda = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 8:
          locali.pdb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 9:
          locali.pdc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 10:
          locali.pdd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 11:
          locali.ncH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 12:
          locali.pde = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 13:
          locali.pdf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 14:
          locali.pdg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 15:
          locali.pdh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 16:
          locali.pdi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 17:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new k();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locali.pdj.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 18:
          locali.pdk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 19:
          locali.pdl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 20:
          locali.pdm = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        case 21:
          locali.pdn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56619);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56619);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.i
 * JD-Core Version:    0.6.2
 */