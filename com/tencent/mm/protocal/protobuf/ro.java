package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ro extends bsr
{
  public String fKh;
  public String jBB;
  public String ndP;
  public int vEt;
  public String vLo;
  public aw vRP;
  public String vXP;
  public String vYO;
  public String vYP;
  public String vYQ;
  public String vYR;
  public int vYS;
  public String vYT;
  public int vYU;
  public String vYV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56760);
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
      if (this.vYT != null)
        paramArrayOfObject.e(11, this.vYT);
      if (this.jBB != null)
        paramArrayOfObject.e(12, this.jBB);
      if (this.ndP != null)
        paramArrayOfObject.e(13, this.ndP);
      paramArrayOfObject.iz(14, this.vEt);
      paramArrayOfObject.iz(15, this.vYU);
      if (this.vYV != null)
        paramArrayOfObject.e(16, this.vYV);
      AppMethodBeat.o(56760);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1336;
    label1336: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      paramInt = i;
      if (this.vYO != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vYO);
      i = paramInt;
      if (this.vLo != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vLo);
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
      if (this.vYT != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vYT);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.jBB);
      paramInt = i;
      if (this.ndP != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.ndP);
      i = paramInt + e.a.a.b.b.a.bs(14, this.vEt) + e.a.a.b.b.a.bs(15, this.vYU);
      paramInt = i;
      if (this.vYV != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.vYV);
      AppMethodBeat.o(56760);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56760);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ro localro = (ro)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56760);
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
            localro.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 2:
          localro.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 3:
          localro.vYO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 4:
          localro.vLo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 5:
          localro.vYP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 6:
          localro.vYQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 7:
          localro.vYR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 8:
          localro.vXP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 9:
          localro.vYS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localro.vRP = paramArrayOfObject;
          }
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 11:
          localro.vYT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 12:
          localro.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 13:
          localro.ndP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 14:
          localro.vEt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 15:
          localro.vYU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        case 16:
          localro.vYV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56760);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56760);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ro
 * JD-Core Version:    0.6.2
 */