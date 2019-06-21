package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bfx extends bsr
{
  public int cHF;
  public int cME;
  public String pbn;
  public String tuk;
  public String vKZ;
  public String vLa;
  public boolean wJJ;
  public String wJK;
  public String wJL;
  public int wJM;
  public String wJN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48905);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vKZ != null)
        paramArrayOfObject.e(2, this.vKZ);
      if (this.vLa != null)
        paramArrayOfObject.e(3, this.vLa);
      if (this.wJK != null)
        paramArrayOfObject.e(4, this.wJK);
      if (this.wJL != null)
        paramArrayOfObject.e(5, this.wJL);
      if (this.tuk != null)
        paramArrayOfObject.e(6, this.tuk);
      if (this.pbn != null)
        paramArrayOfObject.e(7, this.pbn);
      paramArrayOfObject.iz(8, this.cHF);
      paramArrayOfObject.iz(9, this.wJM);
      paramArrayOfObject.aO(10, this.wJJ);
      paramArrayOfObject.iz(11, this.cME);
      if (this.wJN != null)
        paramArrayOfObject.e(12, this.wJN);
      AppMethodBeat.o(48905);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label961;
    label961: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vKZ != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vKZ);
      i = paramInt;
      if (this.vLa != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vLa);
      paramInt = i;
      if (this.wJK != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wJK);
      i = paramInt;
      if (this.wJL != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wJL);
      paramInt = i;
      if (this.tuk != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.tuk);
      i = paramInt;
      if (this.pbn != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.pbn);
      i = i + e.a.a.b.b.a.bs(8, this.cHF) + e.a.a.b.b.a.bs(9, this.wJM) + (e.a.a.b.b.a.fv(10) + 1) + e.a.a.b.b.a.bs(11, this.cME);
      paramInt = i;
      if (this.wJN != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wJN);
      AppMethodBeat.o(48905);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48905);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bfx localbfx = (bfx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48905);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfx.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 2:
          localbfx.vKZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 3:
          localbfx.vLa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 4:
          localbfx.wJK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 5:
          localbfx.wJL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 6:
          localbfx.tuk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 7:
          localbfx.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 8:
          localbfx.cHF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 9:
          localbfx.wJM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 10:
          localbfx.wJJ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 11:
          localbfx.cME = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        case 12:
          localbfx.wJN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48905);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48905);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfx
 * JD-Core Version:    0.6.2
 */