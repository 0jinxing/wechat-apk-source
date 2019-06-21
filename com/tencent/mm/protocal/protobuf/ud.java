package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ud extends com.tencent.mm.bt.a
{
  public int guN;
  public String guS;
  public String jBB;
  public String jCH;
  public String ndT;
  public SKBuiltinBuffer_t vEF;
  public int wbA;
  public int wbB;
  public LinkedList<btp> wbC;
  public String wbD;
  public int wbE;
  public int wbF;
  public int wbG;
  public int wbH;
  public String wbs;
  public String wbt;
  public int wbu;
  public int wbv;
  public String wbw;
  public int wbx;
  public String wby;
  public String wbz;

  public ud()
  {
    AppMethodBeat.i(28370);
    this.wbC = new LinkedList();
    AppMethodBeat.o(28370);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28371);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(28371);
        throw paramArrayOfObject;
      }
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      if (this.wbs != null)
        paramArrayOfObject.e(3, this.wbs);
      if (this.wbt != null)
        paramArrayOfObject.e(4, this.wbt);
      paramArrayOfObject.iz(5, this.guN);
      if (this.vEF != null)
      {
        paramArrayOfObject.iy(6, this.vEF.computeSize());
        this.vEF.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.wbu);
      paramArrayOfObject.iz(8, this.wbv);
      if (this.wbw != null)
        paramArrayOfObject.e(9, this.wbw);
      paramArrayOfObject.iz(10, this.wbx);
      if (this.wby != null)
        paramArrayOfObject.e(11, this.wby);
      if (this.wbz != null)
        paramArrayOfObject.e(12, this.wbz);
      paramArrayOfObject.iz(13, this.wbA);
      paramArrayOfObject.iz(14, this.wbB);
      paramArrayOfObject.e(15, 8, this.wbC);
      if (this.wbD != null)
        paramArrayOfObject.e(16, this.wbD);
      paramArrayOfObject.iz(17, this.wbE);
      paramArrayOfObject.iz(18, this.wbF);
      if (this.ndT != null)
        paramArrayOfObject.e(19, this.ndT);
      paramArrayOfObject.iz(20, this.wbG);
      paramArrayOfObject.iz(21, this.wbH);
      if (this.guS != null)
        paramArrayOfObject.e(22, this.guS);
      AppMethodBeat.o(28371);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label1671;
    label1671: for (i = e.a.a.b.b.a.f(1, this.jBB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jCH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jCH);
      i = paramInt;
      if (this.wbs != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wbs);
      paramInt = i;
      if (this.wbt != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wbt);
      i = paramInt + e.a.a.b.b.a.bs(5, this.guN);
      paramInt = i;
      if (this.vEF != null)
        paramInt = i + e.a.a.a.ix(6, this.vEF.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(7, this.wbu) + e.a.a.b.b.a.bs(8, this.wbv);
      paramInt = i;
      if (this.wbw != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wbw);
      i = paramInt + e.a.a.b.b.a.bs(10, this.wbx);
      paramInt = i;
      if (this.wby != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wby);
      i = paramInt;
      if (this.wbz != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wbz);
      i = i + e.a.a.b.b.a.bs(13, this.wbA) + e.a.a.b.b.a.bs(14, this.wbB) + e.a.a.a.c(15, 8, this.wbC);
      paramInt = i;
      if (this.wbD != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.wbD);
      i = paramInt + e.a.a.b.b.a.bs(17, this.wbE) + e.a.a.b.b.a.bs(18, this.wbF);
      paramInt = i;
      if (this.ndT != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.ndT);
      i = paramInt + e.a.a.b.b.a.bs(20, this.wbG) + e.a.a.b.b.a.bs(21, this.wbH);
      paramInt = i;
      if (this.guS != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.guS);
      AppMethodBeat.o(28371);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wbC.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(28371);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28371);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ud localud = (ud)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28371);
          break;
        case 1:
          localud.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 2:
          localud.jCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 3:
          localud.wbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 4:
          localud.wbt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 5:
          localud.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localud.vEF = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 7:
          localud.wbu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 8:
          localud.wbv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 9:
          localud.wbw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 10:
          localud.wbx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 11:
          localud.wby = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 12:
          localud.wbz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 13:
          localud.wbA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 14:
          localud.wbB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localud.wbC.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 16:
          localud.wbD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 17:
          localud.wbE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 18:
          localud.wbF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 19:
          localud.ndT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 20:
          localud.wbG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 21:
          localud.wbH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        case 22:
          localud.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28371);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28371);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ud
 * JD-Core Version:    0.6.2
 */