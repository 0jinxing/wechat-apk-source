package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class e extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Name;
  public int Version;
  public int jBT;
  public boolean mZA;
  public boolean mZB;
  public boolean mZC;
  public boolean mZD;
  public cg mZE;
  public int mZF;
  public bx mZG;
  public LinkedList<String> mZH;
  public String mZm;
  public String mZo;
  public String mZr;
  public String mZs;
  public String mZt;
  public String mZu;
  public int mZv;
  public q mZw;
  public int mZx;
  public boolean mZy;
  public LinkedList<String> mZz;

  public e()
  {
    AppMethodBeat.i(111545);
    this.mZz = new LinkedList();
    this.mZH = new LinkedList();
    AppMethodBeat.o(111545);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111546);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppID");
        AppMethodBeat.o(111546);
        throw paramArrayOfObject;
      }
      if (this.mZs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: IconURL");
        AppMethodBeat.o(111546);
        throw paramArrayOfObject;
      }
      if (this.mZr != null)
        paramArrayOfObject.e(1, this.mZr);
      if (this.mZs != null)
        paramArrayOfObject.e(2, this.mZs);
      if (this.Name != null)
        paramArrayOfObject.e(3, this.Name);
      if (this.Desc != null)
        paramArrayOfObject.e(4, this.Desc);
      if (this.mZt != null)
        paramArrayOfObject.e(5, this.mZt);
      if (this.mZm != null)
        paramArrayOfObject.e(6, this.mZm);
      if (this.mZu != null)
        paramArrayOfObject.e(7, this.mZu);
      paramArrayOfObject.iz(8, this.mZv);
      if (this.mZw != null)
      {
        paramArrayOfObject.iy(9, this.mZw.computeSize());
        this.mZw.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(10, this.jBT);
      paramArrayOfObject.iz(11, this.mZx);
      if (this.mZo != null)
        paramArrayOfObject.e(12, this.mZo);
      paramArrayOfObject.aO(13, this.mZy);
      paramArrayOfObject.e(14, 1, this.mZz);
      paramArrayOfObject.aO(15, this.mZA);
      paramArrayOfObject.iz(16, this.Version);
      paramArrayOfObject.aO(17, this.mZB);
      paramArrayOfObject.aO(18, this.mZC);
      paramArrayOfObject.aO(19, this.mZD);
      if (this.mZE != null)
      {
        paramArrayOfObject.iy(20, this.mZE.computeSize());
        this.mZE.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(21, this.mZF);
      if (this.mZG != null)
      {
        paramArrayOfObject.iy(22, this.mZG.computeSize());
        this.mZG.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(23, 1, this.mZH);
      AppMethodBeat.o(111546);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZr == null)
        break label1843;
    label1843: for (i = e.a.a.b.b.a.f(1, this.mZr) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mZs != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mZs);
      i = paramInt;
      if (this.Name != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.Name);
      paramInt = i;
      if (this.Desc != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.Desc);
      i = paramInt;
      if (this.mZt != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.mZt);
      paramInt = i;
      if (this.mZm != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.mZm);
      i = paramInt;
      if (this.mZu != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.mZu);
      i += e.a.a.b.b.a.bs(8, this.mZv);
      paramInt = i;
      if (this.mZw != null)
        paramInt = i + e.a.a.a.ix(9, this.mZw.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(10, this.jBT) + e.a.a.b.b.a.bs(11, this.mZx);
      paramInt = i;
      if (this.mZo != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.mZo);
      i = paramInt + (e.a.a.b.b.a.fv(13) + 1) + e.a.a.a.c(14, 1, this.mZz) + (e.a.a.b.b.a.fv(15) + 1) + e.a.a.b.b.a.bs(16, this.Version) + (e.a.a.b.b.a.fv(17) + 1) + (e.a.a.b.b.a.fv(18) + 1) + (e.a.a.b.b.a.fv(19) + 1);
      paramInt = i;
      if (this.mZE != null)
        paramInt = i + e.a.a.a.ix(20, this.mZE.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(21, this.mZF);
      paramInt = i;
      if (this.mZG != null)
        paramInt = i + e.a.a.a.ix(22, this.mZG.computeSize());
      paramInt += e.a.a.a.c(23, 1, this.mZH);
      AppMethodBeat.o(111546);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.mZz.clear();
        this.mZH.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppID");
          AppMethodBeat.o(111546);
          throw paramArrayOfObject;
        }
        if (this.mZs == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: IconURL");
          AppMethodBeat.o(111546);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111546);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        e locale = (e)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111546);
          break;
        case 1:
          locale.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 2:
          locale.mZs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 3:
          locale.Name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 4:
          locale.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 5:
          locale.mZt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 6:
          locale.mZm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 7:
          locale.mZu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 8:
          locale.mZv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new q();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((q)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locale.mZw = ((q)localObject1);
          }
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 10:
          locale.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 11:
          locale.mZx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 12:
          locale.mZo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 13:
          locale.mZy = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 14:
          locale.mZz.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 15:
          locale.mZA = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 16:
          locale.Version = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 17:
          locale.mZB = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 18:
          locale.mZC = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 19:
          locale.mZD = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 20:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locale.mZE = paramArrayOfObject;
          }
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 21:
          locale.mZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 22:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locale.mZG = ((bx)localObject1);
          }
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        case 23:
          locale.mZH.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(111546);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111546);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.e
 * JD-Core Version:    0.6.2
 */