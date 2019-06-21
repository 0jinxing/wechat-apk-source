package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cmb extends com.tencent.mm.bt.a
{
  public int apptype;
  public String csB;
  public String fhH;
  public String kfM;
  public int wGS;
  public LinkedList<cmc> xjN;
  public String xjO;
  public int xjP;

  public cmb()
  {
    AppMethodBeat.i(127735);
    this.xjN = new LinkedList();
    AppMethodBeat.o(127735);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(127736);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      if (this.fhH != null)
        paramArrayOfObject.e(2, this.fhH);
      paramArrayOfObject.iz(3, this.apptype);
      paramArrayOfObject.e(4, 8, this.xjN);
      paramArrayOfObject.iz(5, this.wGS);
      if (this.xjO != null)
        paramArrayOfObject.e(6, this.xjO);
      if (this.kfM != null)
        paramArrayOfObject.e(7, this.kfM);
      paramArrayOfObject.iz(8, this.xjP);
      AppMethodBeat.o(127736);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label708;
    label708: for (paramInt = e.a.a.b.b.a.f(1, this.csB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fhH != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fhH);
      i = i + e.a.a.b.b.a.bs(3, this.apptype) + e.a.a.a.c(4, 8, this.xjN) + e.a.a.b.b.a.bs(5, this.wGS);
      paramInt = i;
      if (this.xjO != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.xjO);
      i = paramInt;
      if (this.kfM != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.kfM);
      paramInt = i + e.a.a.b.b.a.bs(8, this.xjP);
      AppMethodBeat.o(127736);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xjN.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(127736);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cmb localcmb = (cmb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(127736);
          break;
        case 1:
          localcmb.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(127736);
          paramInt = i;
          break;
        case 2:
          localcmb.fhH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(127736);
          paramInt = i;
          break;
        case 3:
          localcmb.apptype = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127736);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cmc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcmb.xjN.add(paramArrayOfObject);
          }
          AppMethodBeat.o(127736);
          paramInt = i;
          break;
        case 5:
          localcmb.wGS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127736);
          paramInt = i;
          break;
        case 6:
          localcmb.xjO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(127736);
          paramInt = i;
          break;
        case 7:
          localcmb.kfM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(127736);
          paramInt = i;
          break;
        case 8:
          localcmb.xjP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127736);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(127736);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmb
 * JD-Core Version:    0.6.2
 */