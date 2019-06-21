package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class b extends com.tencent.mm.bt.a
{
  public String egm;
  public String kKO;
  public long kKP;
  public String kKQ;
  public int kKR;
  public int kKS;
  public String kKT;
  public n kKU;
  public String kKV;
  public String kKW;
  public boolean kKX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35526);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.egm != null)
        paramArrayOfObject.e(1, this.egm);
      if (this.kKO != null)
        paramArrayOfObject.e(2, this.kKO);
      paramArrayOfObject.ai(3, this.kKP);
      if (this.kKQ != null)
        paramArrayOfObject.e(4, this.kKQ);
      paramArrayOfObject.iz(6, this.kKR);
      paramArrayOfObject.iz(7, this.kKS);
      if (this.kKT != null)
        paramArrayOfObject.e(8, this.kKT);
      if (this.kKU != null)
      {
        paramArrayOfObject.iy(9, this.kKU.computeSize());
        this.kKU.writeFields(paramArrayOfObject);
      }
      if (this.kKV != null)
        paramArrayOfObject.e(10, this.kKV);
      if (this.kKW != null)
        paramArrayOfObject.e(11, this.kKW);
      paramArrayOfObject.aO(12, this.kKX);
      AppMethodBeat.o(35526);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.egm == null)
        break label905;
    label905: for (paramInt = e.a.a.b.b.a.f(1, this.egm) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kKO != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kKO);
      i += e.a.a.b.b.a.o(3, this.kKP);
      paramInt = i;
      if (this.kKQ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kKQ);
      i = paramInt + e.a.a.b.b.a.bs(6, this.kKR) + e.a.a.b.b.a.bs(7, this.kKS);
      paramInt = i;
      if (this.kKT != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.kKT);
      i = paramInt;
      if (this.kKU != null)
        i = paramInt + e.a.a.a.ix(9, this.kKU.computeSize());
      paramInt = i;
      if (this.kKV != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.kKV);
      i = paramInt;
      if (this.kKW != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.kKW);
      paramInt = i + (e.a.a.b.b.a.fv(12) + 1);
      AppMethodBeat.o(35526);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35526);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 5:
        default:
          paramInt = -1;
          AppMethodBeat.o(35526);
          break;
        case 1:
          localb.egm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        case 2:
          localb.kKO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        case 3:
          localb.kKP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        case 4:
          localb.kKQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        case 6:
          localb.kKR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        case 7:
          localb.kKS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        case 8:
          localb.kKT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new n();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localb.kKU = paramArrayOfObject;
          }
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        case 10:
          localb.kKV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        case 11:
          localb.kKW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        case 12:
          localb.kKX = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(35526);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35526);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.b
 * JD-Core Version:    0.6.2
 */