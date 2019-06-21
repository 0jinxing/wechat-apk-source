package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class sb extends bsr
{
  public String fKh;
  public String jBB;
  public String jSY;
  public String ndP;
  public String rOh;
  public int vEt;
  public String vLo;
  public aw vRP;
  public String vXP;
  public String vYO;
  public String vYP;
  public String vYQ;
  public String vYR;
  public int vYS;
  public int vYU;
  public String vYV;
  public int vZt;
  public int vZu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56762);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      if (this.vYO != null)
        paramArrayOfObject.e(3, this.vYO);
      if (this.vLo != null)
        paramArrayOfObject.e(4, this.vLo);
      if (this.vYP != null)
        paramArrayOfObject.e(5, this.vYP);
      if (this.vYQ != null)
        paramArrayOfObject.e(6, this.vYQ);
      if (this.vYR != null)
        paramArrayOfObject.e(7, this.vYR);
      if (this.vXP != null)
        paramArrayOfObject.e(8, this.vXP);
      paramArrayOfObject.iz(9, this.vYS);
      if (this.vRP != null)
      {
        paramArrayOfObject.iy(10, this.vRP.computeSize());
        this.vRP.writeFields(paramArrayOfObject);
      }
      if (this.jBB != null)
        paramArrayOfObject.e(11, this.jBB);
      if (this.ndP != null)
        paramArrayOfObject.e(12, this.ndP);
      paramArrayOfObject.iz(13, this.vEt);
      paramArrayOfObject.iz(14, this.vZt);
      if (this.rOh != null)
        paramArrayOfObject.e(15, this.rOh);
      if (this.jSY != null)
        paramArrayOfObject.e(16, this.jSY);
      paramArrayOfObject.iz(17, this.vZu);
      paramArrayOfObject.iz(18, this.vYU);
      if (this.vYV != null)
        paramArrayOfObject.e(19, this.vYV);
      AppMethodBeat.o(56762);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1503;
    label1503: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.fKh);
      int j = paramInt;
      if (this.vYO != null)
        j = paramInt + e.a.a.b.b.a.f(3, this.vYO);
      i = j;
      if (this.vLo != null)
        i = j + e.a.a.b.b.a.f(4, this.vLo);
      paramInt = i;
      if (this.vYP != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vYP);
      i = paramInt;
      if (this.vYQ != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vYQ);
      paramInt = i;
      if (this.vYR != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vYR);
      i = paramInt;
      if (this.vXP != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vXP);
      paramInt = i + e.a.a.b.b.a.bs(9, this.vYS);
      i = paramInt;
      if (this.vRP != null)
        i = paramInt + e.a.a.a.ix(10, this.vRP.computeSize());
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.jBB);
      i = paramInt;
      if (this.ndP != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.ndP);
      i = i + e.a.a.b.b.a.bs(13, this.vEt) + e.a.a.b.b.a.bs(14, this.vZt);
      paramInt = i;
      if (this.rOh != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.rOh);
      i = paramInt;
      if (this.jSY != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.jSY);
      i = i + e.a.a.b.b.a.bs(17, this.vZu) + e.a.a.b.b.a.bs(18, this.vYU);
      paramInt = i;
      if (this.vYV != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.vYV);
      AppMethodBeat.o(56762);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56762);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        sb localsb = (sb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56762);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsb.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 2:
          localsb.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 3:
          localsb.vYO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 4:
          localsb.vLo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 5:
          localsb.vYP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 6:
          localsb.vYQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 7:
          localsb.vYR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 8:
          localsb.vXP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 9:
          localsb.vYS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsb.vRP = ((aw)localObject1);
          }
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 11:
          localsb.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 12:
          localsb.ndP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 13:
          localsb.vEt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 14:
          localsb.vZt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 15:
          localsb.rOh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 16:
          localsb.jSY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 17:
          localsb.vZu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 18:
          localsb.vYU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        case 19:
          localsb.vYV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56762);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56762);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.sb
 * JD-Core Version:    0.6.2
 */