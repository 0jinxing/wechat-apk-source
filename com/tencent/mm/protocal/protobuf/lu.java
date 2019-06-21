package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class lu extends bsr
{
  public int cIb;
  public String jSY;
  public String nickname;
  public int pOA;
  public String pPT;
  public String pPU;
  public String pPW;
  public int pPY;
  public String pPZ;
  public String pPw;
  public String pQa;
  public String rOh;
  public int scene;
  public abv vFe;
  public String vFf;
  public int vFg;
  public String vPj;
  public String vPp;
  public String vPq;
  public String vPr;
  public int vPs;
  public boolean vPt;
  public boolean vPu;
  public String vPv;
  public int vPw;
  public String vPx;
  public int vPy;
  public int vPz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56724);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vPp == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: qrcode_id");
        AppMethodBeat.o(56724);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.pPZ != null)
        paramArrayOfObject.e(2, this.pPZ);
      if (this.vPp != null)
        paramArrayOfObject.e(3, this.vPp);
      paramArrayOfObject.iz(4, this.scene);
      if (this.vPq != null)
        paramArrayOfObject.e(5, this.vPq);
      if (this.pPT != null)
        paramArrayOfObject.e(6, this.pPT);
      paramArrayOfObject.iz(7, this.vFg);
      paramArrayOfObject.iz(8, this.cIb);
      if (this.pQa != null)
        paramArrayOfObject.e(9, this.pQa);
      if (this.pPU != null)
        paramArrayOfObject.e(10, this.pPU);
      if (this.vPr != null)
        paramArrayOfObject.e(11, this.vPr);
      paramArrayOfObject.iz(12, this.vPs);
      paramArrayOfObject.iz(13, this.pPY);
      if (this.vFf != null)
        paramArrayOfObject.e(14, this.vFf);
      if (this.vFe != null)
      {
        paramArrayOfObject.iy(15, this.vFe.computeSize());
        this.vFe.writeFields(paramArrayOfObject);
      }
      if (this.vPj != null)
        paramArrayOfObject.e(16, this.vPj);
      paramArrayOfObject.iz(17, this.pOA);
      paramArrayOfObject.aO(18, this.vPt);
      paramArrayOfObject.aO(19, this.vPu);
      if (this.rOh != null)
        paramArrayOfObject.e(20, this.rOh);
      if (this.jSY != null)
        paramArrayOfObject.e(21, this.jSY);
      if (this.vPv != null)
        paramArrayOfObject.e(22, this.vPv);
      if (this.pPW != null)
        paramArrayOfObject.e(23, this.pPW);
      if (this.nickname != null)
        paramArrayOfObject.e(24, this.nickname);
      if (this.pPw != null)
        paramArrayOfObject.e(25, this.pPw);
      paramArrayOfObject.iz(26, this.vPw);
      if (this.vPx != null)
        paramArrayOfObject.e(27, this.vPx);
      paramArrayOfObject.iz(28, this.vPy);
      paramArrayOfObject.iz(29, this.vPz);
      AppMethodBeat.o(56724);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label2087;
    label2087: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.pPZ != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.pPZ);
      i = paramInt;
      if (this.vPp != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vPp);
      i += e.a.a.b.b.a.bs(4, this.scene);
      paramInt = i;
      if (this.vPq != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vPq);
      i = paramInt;
      if (this.pPT != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.pPT);
      paramInt = i + e.a.a.b.b.a.bs(7, this.vFg) + e.a.a.b.b.a.bs(8, this.cIb);
      i = paramInt;
      if (this.pQa != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.pQa);
      paramInt = i;
      if (this.pPU != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.pPU);
      i = paramInt;
      if (this.vPr != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.vPr);
      paramInt = i + e.a.a.b.b.a.bs(12, this.vPs) + e.a.a.b.b.a.bs(13, this.pPY);
      i = paramInt;
      if (this.vFf != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.vFf);
      paramInt = i;
      if (this.vFe != null)
        paramInt = i + e.a.a.a.ix(15, this.vFe.computeSize());
      i = paramInt;
      if (this.vPj != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.vPj);
      i = i + e.a.a.b.b.a.bs(17, this.pOA) + (e.a.a.b.b.a.fv(18) + 1) + (e.a.a.b.b.a.fv(19) + 1);
      paramInt = i;
      if (this.rOh != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.rOh);
      i = paramInt;
      if (this.jSY != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.jSY);
      paramInt = i;
      if (this.vPv != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.vPv);
      i = paramInt;
      if (this.pPW != null)
        i = paramInt + e.a.a.b.b.a.f(23, this.pPW);
      paramInt = i;
      if (this.nickname != null)
        paramInt = i + e.a.a.b.b.a.f(24, this.nickname);
      i = paramInt;
      if (this.pPw != null)
        i = paramInt + e.a.a.b.b.a.f(25, this.pPw);
      i += e.a.a.b.b.a.bs(26, this.vPw);
      paramInt = i;
      if (this.vPx != null)
        paramInt = i + e.a.a.b.b.a.f(27, this.vPx);
      paramInt = paramInt + e.a.a.b.b.a.bs(28, this.vPy) + e.a.a.b.b.a.bs(29, this.vPz);
      AppMethodBeat.o(56724);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vPp == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: qrcode_id");
          AppMethodBeat.o(56724);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56724);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        lu locallu = (lu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56724);
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
            locallu.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 2:
          locallu.pPZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 3:
          locallu.vPp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 4:
          locallu.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 5:
          locallu.vPq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 6:
          locallu.pPT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 7:
          locallu.vFg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 8:
          locallu.cIb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 9:
          locallu.pQa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 10:
          locallu.pPU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 11:
          locallu.vPr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 12:
          locallu.vPs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 13:
          locallu.pPY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 14:
          locallu.vFf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new abv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallu.vFe = paramArrayOfObject;
          }
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 16:
          locallu.vPj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 17:
          locallu.pOA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 18:
          locallu.vPt = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 19:
          locallu.vPu = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 20:
          locallu.rOh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 21:
          locallu.jSY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 22:
          locallu.vPv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 23:
          locallu.pPW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 24:
          locallu.nickname = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 25:
          locallu.pPw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 26:
          locallu.vPw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 27:
          locallu.vPx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 28:
          locallu.vPy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        case 29:
          locallu.vPz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56724);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56724);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.lu
 * JD-Core Version:    0.6.2
 */