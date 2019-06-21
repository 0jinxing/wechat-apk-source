package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cku extends bsr
{
  public int bIb;
  public String ceI;
  public String cws;
  public String fhH;
  public String wWc;
  public int xiA;
  public int xiB;
  public int xiu;
  public int xiv;
  public String xiw;
  public int xix;
  public String xiy;
  public LinkedList<ccz> xiz;

  public cku()
  {
    AppMethodBeat.i(55725);
    this.xiz = new LinkedList();
    AppMethodBeat.o(55725);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55726);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ceI != null)
        paramArrayOfObject.e(2, this.ceI);
      if (this.cws != null)
        paramArrayOfObject.e(3, this.cws);
      paramArrayOfObject.iz(4, this.xiu);
      paramArrayOfObject.iz(5, this.xiv);
      paramArrayOfObject.iz(6, this.bIb);
      if (this.xiw != null)
        paramArrayOfObject.e(7, this.xiw);
      if (this.wWc != null)
        paramArrayOfObject.e(8, this.wWc);
      if (this.fhH != null)
        paramArrayOfObject.e(9, this.fhH);
      paramArrayOfObject.iz(10, this.xix);
      if (this.xiy != null)
        paramArrayOfObject.e(11, this.xiy);
      paramArrayOfObject.e(12, 8, this.xiz);
      paramArrayOfObject.iz(13, this.xiA);
      paramArrayOfObject.iz(14, this.xiB);
      AppMethodBeat.o(55726);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1139;
    label1139: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ceI != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ceI);
      i = paramInt;
      if (this.cws != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.cws);
      i = i + e.a.a.b.b.a.bs(4, this.xiu) + e.a.a.b.b.a.bs(5, this.xiv) + e.a.a.b.b.a.bs(6, this.bIb);
      paramInt = i;
      if (this.xiw != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.xiw);
      i = paramInt;
      if (this.wWc != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wWc);
      paramInt = i;
      if (this.fhH != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.fhH);
      i = paramInt + e.a.a.b.b.a.bs(10, this.xix);
      paramInt = i;
      if (this.xiy != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.xiy);
      paramInt = paramInt + e.a.a.a.c(12, 8, this.xiz) + e.a.a.b.b.a.bs(13, this.xiA) + e.a.a.b.b.a.bs(14, this.xiB);
      AppMethodBeat.o(55726);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xiz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55726);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cku localcku = (cku)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55726);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcku.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 2:
          localcku.ceI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 3:
          localcku.cws = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 4:
          localcku.xiu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 5:
          localcku.xiv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 6:
          localcku.bIb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 7:
          localcku.xiw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 8:
          localcku.wWc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 9:
          localcku.fhH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 10:
          localcku.xix = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 11:
          localcku.xiy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ccz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcku.xiz.add(localObject1);
          }
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 13:
          localcku.xiA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        case 14:
          localcku.xiB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55726);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55726);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cku
 * JD-Core Version:    0.6.2
 */