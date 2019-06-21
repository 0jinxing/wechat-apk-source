package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class km extends com.tencent.mm.bt.a
{
  public boolean vNA;
  public int vNB;
  public boolean vNC;
  public hf vND;
  public boolean vNE;
  public String vNb;
  public int vNt;
  public int vNu;
  public int vNv;
  public int vNw;
  public long vNx;
  public long vNy;
  public int vNz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11710);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vNb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: brand_user_name");
        AppMethodBeat.o(11710);
        throw paramArrayOfObject;
      }
      if (this.vNb != null)
        paramArrayOfObject.e(1, this.vNb);
      paramArrayOfObject.iz(2, this.vNt);
      paramArrayOfObject.iz(3, this.vNu);
      paramArrayOfObject.iz(4, this.vNv);
      paramArrayOfObject.iz(5, this.vNw);
      paramArrayOfObject.ai(6, this.vNx);
      paramArrayOfObject.ai(7, this.vNy);
      paramArrayOfObject.iz(8, this.vNz);
      paramArrayOfObject.aO(9, this.vNA);
      paramArrayOfObject.iz(10, this.vNB);
      paramArrayOfObject.aO(11, this.vNC);
      if (this.vND != null)
      {
        paramArrayOfObject.iy(12, this.vND.computeSize());
        this.vND.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(13, this.vNE);
      AppMethodBeat.o(11710);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vNb == null)
        break label967;
    label967: for (paramInt = e.a.a.b.b.a.f(1, this.vNb) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vNt) + e.a.a.b.b.a.bs(3, this.vNu) + e.a.a.b.b.a.bs(4, this.vNv) + e.a.a.b.b.a.bs(5, this.vNw) + e.a.a.b.b.a.o(6, this.vNx) + e.a.a.b.b.a.o(7, this.vNy) + e.a.a.b.b.a.bs(8, this.vNz) + (e.a.a.b.b.a.fv(9) + 1) + e.a.a.b.b.a.bs(10, this.vNB) + (e.a.a.b.b.a.fv(11) + 1);
      paramInt = i;
      if (this.vND != null)
        paramInt = i + e.a.a.a.ix(12, this.vND.computeSize());
      paramInt += e.a.a.b.b.a.fv(13) + 1;
      AppMethodBeat.o(11710);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vNb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: brand_user_name");
          AppMethodBeat.o(11710);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11710);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        km localkm = (km)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11710);
          break;
        case 1:
          localkm.vNb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 2:
          localkm.vNt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 3:
          localkm.vNu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 4:
          localkm.vNv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 5:
          localkm.vNw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 6:
          localkm.vNx = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 7:
          localkm.vNy = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 8:
          localkm.vNz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 9:
          localkm.vNA = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 10:
          localkm.vNB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 11:
          localkm.vNC = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localkm.vND = ((hf)localObject1);
          }
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        case 13:
          localkm.vNE = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(11710);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11710);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.km
 * JD-Core Version:    0.6.2
 */