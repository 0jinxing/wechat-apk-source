package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class h extends com.tencent.mm.bt.a
{
  public double tmR;
  public double tmS;
  public double tmT;
  public String tmU;
  public LinkedList<t> tmV;
  public i tmW;
  public int tmX;
  public String tmY;
  public String tmZ;
  public double tna;
  public double tnb;
  public int tnc;
  public String tnd;
  public String tne;
  public a tnf;
  public LinkedList<g> tng;
  public b tnh;

  public h()
  {
    AppMethodBeat.i(56649);
    this.tmV = new LinkedList();
    this.tng = new LinkedList();
    AppMethodBeat.o(56649);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56650);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.f(1, this.tmR);
      paramArrayOfObject.f(2, this.tmS);
      paramArrayOfObject.f(3, this.tmT);
      if (this.tmU != null)
        paramArrayOfObject.e(4, this.tmU);
      paramArrayOfObject.e(5, 8, this.tmV);
      if (this.tmW != null)
      {
        paramArrayOfObject.iy(6, this.tmW.computeSize());
        this.tmW.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.tmX);
      if (this.tmY != null)
        paramArrayOfObject.e(8, this.tmY);
      if (this.tmZ != null)
        paramArrayOfObject.e(9, this.tmZ);
      paramArrayOfObject.f(10, this.tna);
      paramArrayOfObject.f(11, this.tnb);
      paramArrayOfObject.iz(12, this.tnc);
      if (this.tnd != null)
        paramArrayOfObject.e(13, this.tnd);
      if (this.tne != null)
        paramArrayOfObject.e(14, this.tne);
      if (this.tnf != null)
      {
        paramArrayOfObject.iy(15, this.tnf.computeSize());
        this.tnf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(16, 8, this.tng);
      if (this.tnh != null)
      {
        paramArrayOfObject.iy(17, this.tnh.computeSize());
        this.tnh.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56650);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.fv(1) + 8 + 0 + (e.a.a.b.b.a.fv(2) + 8) + (e.a.a.b.b.a.fv(3) + 8);
        paramInt = i;
        if (this.tmU != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.tmU);
        i = paramInt + e.a.a.a.c(5, 8, this.tmV);
        paramInt = i;
        if (this.tmW != null)
          paramInt = i + e.a.a.a.ix(6, this.tmW.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(7, this.tmX);
        paramInt = i;
        if (this.tmY != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.tmY);
        i = paramInt;
        if (this.tmZ != null)
          i = paramInt + e.a.a.b.b.a.f(9, this.tmZ);
        paramInt = i + (e.a.a.b.b.a.fv(10) + 8) + (e.a.a.b.b.a.fv(11) + 8) + e.a.a.b.b.a.bs(12, this.tnc);
        i = paramInt;
        if (this.tnd != null)
          i = paramInt + e.a.a.b.b.a.f(13, this.tnd);
        paramInt = i;
        if (this.tne != null)
          paramInt = i + e.a.a.b.b.a.f(14, this.tne);
        i = paramInt;
        if (this.tnf != null)
          i = paramInt + e.a.a.a.ix(15, this.tnf.computeSize());
        i += e.a.a.a.c(16, 8, this.tng);
        paramInt = i;
        if (this.tnh != null)
          paramInt = i + e.a.a.a.ix(17, this.tnh.computeSize());
        AppMethodBeat.o(56650);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.tmV.clear();
        this.tng.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56650);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        h localh = (h)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56650);
          break;
        case 1:
          localh.tmR = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 2:
          localh.tmS = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 3:
          localh.tmT = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 4:
          localh.tmU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.tmV.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new i();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.tmW = paramArrayOfObject;
          }
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 7:
          localh.tmX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 8:
          localh.tmY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 9:
          localh.tmZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 10:
          localh.tna = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 11:
          localh.tnb = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 12:
          localh.tnc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 13:
          localh.tnd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 14:
          localh.tne = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 15:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new a();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((a)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.tnf = ((a)localObject1);
          }
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 16:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new g();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.tng.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        case 17:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new b();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.tnh = paramArrayOfObject;
          }
          AppMethodBeat.o(56650);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56650);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.h
 * JD-Core Version:    0.6.2
 */