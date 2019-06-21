package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class k extends com.tencent.mm.bt.a
{
  public int cRT;
  public int cRU;
  public int cRV;
  public long cSh;
  public int kCd;
  public String nSX;
  public String nSd;
  public int nUh;
  public String nUi;
  public String nUj;
  public String nUk;
  public String nWO;
  public String nWP;
  public String nWQ;
  public String nWR;
  public String nWS;
  public String nWT;
  public long nWU;
  public long nWV;
  public long nWW;
  public String nWX;
  public int nWY;
  public int nWZ;
  public int nXa;
  public String nXb;
  public int nXc;
  public e nXd;
  public LinkedList<as> nXe;
  public as nXf;
  public String nXg;
  public String nXh;
  public int nXi;
  public LinkedList<w> nXj;
  public String nXk;
  public String nXl;
  public int nXm;
  public String nXn;
  public String nXo;
  public int resourceId;

  public k()
  {
    AppMethodBeat.i(56610);
    this.nXe = new LinkedList();
    this.nXj = new LinkedList();
    AppMethodBeat.o(56610);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56611);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.cRT);
      paramArrayOfObject.iz(2, this.cRU);
      if (this.nWO != null)
        paramArrayOfObject.e(3, this.nWO);
      if (this.nWP != null)
        paramArrayOfObject.e(4, this.nWP);
      if (this.nSd != null)
        paramArrayOfObject.e(5, this.nSd);
      if (this.nWQ != null)
        paramArrayOfObject.e(6, this.nWQ);
      if (this.nWR != null)
        paramArrayOfObject.e(7, this.nWR);
      if (this.nSX != null)
        paramArrayOfObject.e(8, this.nSX);
      if (this.nWS != null)
        paramArrayOfObject.e(9, this.nWS);
      if (this.nWT != null)
        paramArrayOfObject.e(10, this.nWT);
      paramArrayOfObject.ai(11, this.cSh);
      paramArrayOfObject.ai(12, this.nWU);
      paramArrayOfObject.ai(13, this.nWV);
      paramArrayOfObject.iz(14, this.kCd);
      paramArrayOfObject.ai(15, this.nWW);
      if (this.nWX != null)
        paramArrayOfObject.e(16, this.nWX);
      paramArrayOfObject.iz(17, this.nWY);
      paramArrayOfObject.iz(18, this.nWZ);
      paramArrayOfObject.iz(19, this.nXa);
      if (this.nXb != null)
        paramArrayOfObject.e(20, this.nXb);
      paramArrayOfObject.iz(21, this.cRV);
      paramArrayOfObject.iz(22, this.nXc);
      if (this.nXd != null)
      {
        paramArrayOfObject.iy(23, this.nXd.computeSize());
        this.nXd.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(24, this.nUh);
      if (this.nUj != null)
        paramArrayOfObject.e(25, this.nUj);
      paramArrayOfObject.e(26, 8, this.nXe);
      if (this.nXf != null)
      {
        paramArrayOfObject.iy(27, this.nXf.computeSize());
        this.nXf.writeFields(paramArrayOfObject);
      }
      if (this.nXg != null)
        paramArrayOfObject.e(28, this.nXg);
      if (this.nXh != null)
        paramArrayOfObject.e(29, this.nXh);
      paramArrayOfObject.iz(30, this.nXi);
      paramArrayOfObject.iz(31, this.resourceId);
      if (this.nUk != null)
        paramArrayOfObject.e(32, this.nUk);
      paramArrayOfObject.e(33, 8, this.nXj);
      if (this.nUi != null)
        paramArrayOfObject.e(34, this.nUi);
      if (this.nXk != null)
        paramArrayOfObject.e(35, this.nXk);
      if (this.nXl != null)
        paramArrayOfObject.e(36, this.nXl);
      paramArrayOfObject.iz(37, this.nXm);
      if (this.nXn != null)
        paramArrayOfObject.e(38, this.nXn);
      if (this.nXo != null)
        paramArrayOfObject.e(39, this.nXo);
      AppMethodBeat.o(56611);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.cRT) + 0 + e.a.a.b.b.a.bs(2, this.cRU);
        paramInt = i;
        if (this.nWO != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.nWO);
        i = paramInt;
        if (this.nWP != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.nWP);
        paramInt = i;
        if (this.nSd != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.nSd);
        i = paramInt;
        if (this.nWQ != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.nWQ);
        paramInt = i;
        if (this.nWR != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.nWR);
        i = paramInt;
        if (this.nSX != null)
          i = paramInt + e.a.a.b.b.a.f(8, this.nSX);
        paramInt = i;
        if (this.nWS != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.nWS);
        i = paramInt;
        if (this.nWT != null)
          i = paramInt + e.a.a.b.b.a.f(10, this.nWT);
        i = i + e.a.a.b.b.a.o(11, this.cSh) + e.a.a.b.b.a.o(12, this.nWU) + e.a.a.b.b.a.o(13, this.nWV) + e.a.a.b.b.a.bs(14, this.kCd) + e.a.a.b.b.a.o(15, this.nWW);
        paramInt = i;
        if (this.nWX != null)
          paramInt = i + e.a.a.b.b.a.f(16, this.nWX);
        i = paramInt + e.a.a.b.b.a.bs(17, this.nWY) + e.a.a.b.b.a.bs(18, this.nWZ) + e.a.a.b.b.a.bs(19, this.nXa);
        paramInt = i;
        if (this.nXb != null)
          paramInt = i + e.a.a.b.b.a.f(20, this.nXb);
        i = paramInt + e.a.a.b.b.a.bs(21, this.cRV) + e.a.a.b.b.a.bs(22, this.nXc);
        paramInt = i;
        if (this.nXd != null)
          paramInt = i + e.a.a.a.ix(23, this.nXd.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(24, this.nUh);
        paramInt = i;
        if (this.nUj != null)
          paramInt = i + e.a.a.b.b.a.f(25, this.nUj);
        i = paramInt + e.a.a.a.c(26, 8, this.nXe);
        paramInt = i;
        if (this.nXf != null)
          paramInt = i + e.a.a.a.ix(27, this.nXf.computeSize());
        i = paramInt;
        if (this.nXg != null)
          i = paramInt + e.a.a.b.b.a.f(28, this.nXg);
        paramInt = i;
        if (this.nXh != null)
          paramInt = i + e.a.a.b.b.a.f(29, this.nXh);
        i = paramInt + e.a.a.b.b.a.bs(30, this.nXi) + e.a.a.b.b.a.bs(31, this.resourceId);
        paramInt = i;
        if (this.nUk != null)
          paramInt = i + e.a.a.b.b.a.f(32, this.nUk);
        i = paramInt + e.a.a.a.c(33, 8, this.nXj);
        paramInt = i;
        if (this.nUi != null)
          paramInt = i + e.a.a.b.b.a.f(34, this.nUi);
        i = paramInt;
        if (this.nXk != null)
          i = paramInt + e.a.a.b.b.a.f(35, this.nXk);
        paramInt = i;
        if (this.nXl != null)
          paramInt = i + e.a.a.b.b.a.f(36, this.nXl);
        i = paramInt + e.a.a.b.b.a.bs(37, this.nXm);
        paramInt = i;
        if (this.nXn != null)
          paramInt = i + e.a.a.b.b.a.f(38, this.nXn);
        i = paramInt;
        if (this.nXo != null)
          i = paramInt + e.a.a.b.b.a.f(39, this.nXo);
        AppMethodBeat.o(56611);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nXe.clear();
        this.nXj.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56611);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        k localk = (k)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56611);
          break;
        case 1:
          localk.cRT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 2:
          localk.cRU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 3:
          localk.nWO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 4:
          localk.nWP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 5:
          localk.nSd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 6:
          localk.nWQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 7:
          localk.nWR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 8:
          localk.nSX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 9:
          localk.nWS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 10:
          localk.nWT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 11:
          localk.cSh = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 12:
          localk.nWU = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 13:
          localk.nWV = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 14:
          localk.kCd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 15:
          localk.nWW = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 16:
          localk.nWX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 17:
          localk.nWY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 18:
          localk.nWZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 19:
          localk.nXa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 20:
          localk.nXb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 21:
          localk.cRV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 22:
          localk.nXc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 23:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localk.nXd = ((e)localObject1);
          }
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 24:
          localk.nUh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 25:
          localk.nUj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 26:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new as();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localk.nXe.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 27:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new as();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((as)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localk.nXf = ((as)localObject1);
          }
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 28:
          localk.nXg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 29:
          localk.nXh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 30:
          localk.nXi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 31:
          localk.resourceId = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 32:
          localk.nUk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 33:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new w();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((w)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localk.nXj.add(localObject1);
          }
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 34:
          localk.nUi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 35:
          localk.nXk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 36:
          localk.nXl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 37:
          localk.nXm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 38:
          localk.nXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        case 39:
          localk.nXo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56611);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56611);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.k
 * JD-Core Version:    0.6.2
 */