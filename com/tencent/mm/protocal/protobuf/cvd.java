package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cvd extends com.tencent.mm.bt.a
{
  public int Scene;
  public int jCt;
  public int vOq;
  public String vQg;
  public int wCv;
  public String wCy;
  public int wDH;
  public axy wDI;
  public String wIF;
  public String wSi;
  public int wUr;
  public String wkD;
  public int xfr;
  public LinkedList<String> xgp;
  public LinkedList<tn> xqa;
  public int xrc;
  public String xrd;
  public int xre;
  public int xrf;

  public cvd()
  {
    AppMethodBeat.i(124379);
    this.wCv = 2;
    this.xqa = new LinkedList();
    this.xgp = new LinkedList();
    AppMethodBeat.o(124379);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124380);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vOq);
      paramArrayOfObject.iz(2, this.wDH);
      paramArrayOfObject.iz(3, this.wUr);
      if (this.wkD != null)
        paramArrayOfObject.e(4, this.wkD);
      if (this.wDI != null)
      {
        paramArrayOfObject.iy(5, this.wDI.computeSize());
        this.wDI.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.Scene);
      if (this.vQg != null)
        paramArrayOfObject.e(7, this.vQg);
      paramArrayOfObject.iz(8, this.xrc);
      paramArrayOfObject.iz(9, this.wCv);
      paramArrayOfObject.e(10, 8, this.xqa);
      if (this.wCy != null)
        paramArrayOfObject.e(11, this.wCy);
      if (this.wIF != null)
        paramArrayOfObject.e(12, this.wIF);
      paramArrayOfObject.iz(13, this.xfr);
      if (this.xrd != null)
        paramArrayOfObject.e(14, this.xrd);
      if (this.wSi != null)
        paramArrayOfObject.e(15, this.wSi);
      paramArrayOfObject.e(16, 1, this.xgp);
      paramArrayOfObject.iz(17, this.xre);
      paramArrayOfObject.iz(18, this.jCt);
      paramArrayOfObject.iz(19, this.xrf);
      AppMethodBeat.o(124380);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.vOq) + 0 + e.a.a.b.b.a.bs(2, this.wDH) + e.a.a.b.b.a.bs(3, this.wUr);
        paramInt = i;
        if (this.wkD != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wkD);
        i = paramInt;
        if (this.wDI != null)
          i = paramInt + e.a.a.a.ix(5, this.wDI.computeSize());
        i += e.a.a.b.b.a.bs(6, this.Scene);
        paramInt = i;
        if (this.vQg != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.vQg);
        i = paramInt + e.a.a.b.b.a.bs(8, this.xrc) + e.a.a.b.b.a.bs(9, this.wCv) + e.a.a.a.c(10, 8, this.xqa);
        paramInt = i;
        if (this.wCy != null)
          paramInt = i + e.a.a.b.b.a.f(11, this.wCy);
        i = paramInt;
        if (this.wIF != null)
          i = paramInt + e.a.a.b.b.a.f(12, this.wIF);
        i += e.a.a.b.b.a.bs(13, this.xfr);
        paramInt = i;
        if (this.xrd != null)
          paramInt = i + e.a.a.b.b.a.f(14, this.xrd);
        i = paramInt;
        if (this.wSi != null)
          i = paramInt + e.a.a.b.b.a.f(15, this.wSi);
        paramInt = i + e.a.a.a.c(16, 1, this.xgp) + e.a.a.b.b.a.bs(17, this.xre) + e.a.a.b.b.a.bs(18, this.jCt) + e.a.a.b.b.a.bs(19, this.xrf);
        AppMethodBeat.o(124380);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xqa.clear();
        this.xgp.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124380);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cvd localcvd = (cvd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124380);
          break;
        case 1:
          localcvd.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 2:
          localcvd.wDH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 3:
          localcvd.wUr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 4:
          localcvd.wkD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new axy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvd.wDI = paramArrayOfObject;
          }
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 6:
          localcvd.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 7:
          localcvd.vQg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 8:
          localcvd.xrc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 9:
          localcvd.wCv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvd.xqa.add(paramArrayOfObject);
          }
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 11:
          localcvd.wCy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 12:
          localcvd.wIF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 13:
          localcvd.xfr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 14:
          localcvd.xrd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 15:
          localcvd.wSi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 16:
          localcvd.xgp.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 17:
          localcvd.xre = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 18:
          localcvd.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        case 19:
          localcvd.xrf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124380);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124380);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvd
 * JD-Core Version:    0.6.2
 */