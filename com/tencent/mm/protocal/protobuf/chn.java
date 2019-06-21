package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class chn extends com.tencent.mm.bt.a
{
  public String cIy;
  public int cdf;
  public String ctj;
  public String cvF;
  public String hlm;
  public String nQB;
  public int offset;
  public int sBd;
  public int scene;
  public LinkedList<tn> tZG;
  public String tZP;
  public String url;
  public String xgj;
  public LinkedList<chu> xgk;
  public int xgl;
  public String xgm;
  public String xgn;
  public String xgo;
  public LinkedList<String> xgp;

  public chn()
  {
    AppMethodBeat.i(55702);
    this.tZG = new LinkedList();
    this.xgk = new LinkedList();
    this.xgp = new LinkedList();
    AppMethodBeat.o(55702);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55703);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.hlm != null)
        paramArrayOfObject.e(1, this.hlm);
      if (this.cvF != null)
        paramArrayOfObject.e(2, this.cvF);
      if (this.cIy != null)
        paramArrayOfObject.e(3, this.cIy);
      paramArrayOfObject.iz(4, this.offset);
      if (this.ctj != null)
        paramArrayOfObject.e(5, this.ctj);
      paramArrayOfObject.iz(6, this.scene);
      if (this.url != null)
        paramArrayOfObject.e(7, this.url);
      if (this.nQB != null)
        paramArrayOfObject.e(8, this.nQB);
      paramArrayOfObject.e(9, 8, this.tZG);
      if (this.xgj != null)
        paramArrayOfObject.e(10, this.xgj);
      paramArrayOfObject.e(11, 8, this.xgk);
      paramArrayOfObject.iz(12, this.sBd);
      paramArrayOfObject.iz(13, this.cdf);
      if (this.tZP != null)
        paramArrayOfObject.e(14, this.tZP);
      paramArrayOfObject.iz(15, this.xgl);
      if (this.xgm != null)
        paramArrayOfObject.e(16, this.xgm);
      if (this.xgn != null)
        paramArrayOfObject.e(17, this.xgn);
      if (this.xgo != null)
        paramArrayOfObject.e(18, this.xgo);
      paramArrayOfObject.e(19, 1, this.xgp);
      AppMethodBeat.o(55703);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.hlm == null)
        break label1467;
    label1467: for (i = e.a.a.b.b.a.f(1, this.hlm) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.cvF != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.cvF);
      i = paramInt;
      if (this.cIy != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.cIy);
      i += e.a.a.b.b.a.bs(4, this.offset);
      paramInt = i;
      if (this.ctj != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.ctj);
      i = paramInt + e.a.a.b.b.a.bs(6, this.scene);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.url);
      i = paramInt;
      if (this.nQB != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.nQB);
      i += e.a.a.a.c(9, 8, this.tZG);
      paramInt = i;
      if (this.xgj != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.xgj);
      i = paramInt + e.a.a.a.c(11, 8, this.xgk) + e.a.a.b.b.a.bs(12, this.sBd) + e.a.a.b.b.a.bs(13, this.cdf);
      paramInt = i;
      if (this.tZP != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.tZP);
      paramInt += e.a.a.b.b.a.bs(15, this.xgl);
      i = paramInt;
      if (this.xgm != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.xgm);
      paramInt = i;
      if (this.xgn != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.xgn);
      i = paramInt;
      if (this.xgo != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.xgo);
      paramInt = i + e.a.a.a.c(19, 1, this.xgp);
      AppMethodBeat.o(55703);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.tZG.clear();
        this.xgk.clear();
        this.xgp.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55703);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        chn localchn = (chn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55703);
          break;
        case 1:
          localchn.hlm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 2:
          localchn.cvF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 3:
          localchn.cIy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 4:
          localchn.offset = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 5:
          localchn.ctj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 6:
          localchn.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 7:
          localchn.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 8:
          localchn.nQB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new tn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((tn)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchn.tZG.add(localObject1);
          }
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 10:
          localchn.xgj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new chu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchn.xgk.add(localObject1);
          }
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 12:
          localchn.sBd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 13:
          localchn.cdf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 14:
          localchn.tZP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 15:
          localchn.xgl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 16:
          localchn.xgm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 17:
          localchn.xgn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 18:
          localchn.xgo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        case 19:
          localchn.xgp.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(55703);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55703);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chn
 * JD-Core Version:    0.6.2
 */