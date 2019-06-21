package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class adp extends btd
{
  public String SSID;
  public String Title;
  public String jBB;
  public String ncM;
  public String nzz;
  public String vAI;
  public int vAS;
  public avn wlA;
  public adl wlB;
  public String wlC;
  public int wlD;
  public LinkedList<le> wlE;
  public String wlF;
  public vc wlG;
  public SKBuiltinBuffer_t wlH;
  public int wlI;
  public LinkedList<atp> wlJ;
  public String wlK;
  public String wlL;
  public SKBuiltinBuffer_t wlw;
  public String wly;
  public String wlz;

  public adp()
  {
    AppMethodBeat.i(80055);
    this.wlE = new LinkedList();
    this.wlJ = new LinkedList();
    AppMethodBeat.o(80055);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80056);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80056);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wly != null)
        paramArrayOfObject.e(2, this.wly);
      if (this.wlz != null)
        paramArrayOfObject.e(3, this.wlz);
      paramArrayOfObject.iz(4, this.vAS);
      if (this.Title != null)
        paramArrayOfObject.e(5, this.Title);
      if (this.ncM != null)
        paramArrayOfObject.e(6, this.ncM);
      if (this.wlA != null)
      {
        paramArrayOfObject.iy(7, this.wlA.computeSize());
        this.wlA.writeFields(paramArrayOfObject);
      }
      if (this.wlB != null)
      {
        paramArrayOfObject.iy(8, this.wlB.computeSize());
        this.wlB.writeFields(paramArrayOfObject);
      }
      if (this.jBB != null)
        paramArrayOfObject.e(9, this.jBB);
      if (this.wlC != null)
        paramArrayOfObject.e(15, this.wlC);
      paramArrayOfObject.iz(16, this.wlD);
      paramArrayOfObject.e(17, 8, this.wlE);
      if (this.wlF != null)
        paramArrayOfObject.e(18, this.wlF);
      if (this.SSID != null)
        paramArrayOfObject.e(20, this.SSID);
      if (this.vAI != null)
        paramArrayOfObject.e(21, this.vAI);
      if (this.wlG != null)
      {
        paramArrayOfObject.iy(22, this.wlG.computeSize());
        this.wlG.writeFields(paramArrayOfObject);
      }
      if (this.wlH != null)
      {
        paramArrayOfObject.iy(23, this.wlH.computeSize());
        this.wlH.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(24, this.wlI);
      paramArrayOfObject.e(25, 8, this.wlJ);
      if (this.nzz != null)
        paramArrayOfObject.e(26, this.nzz);
      if (this.wlK != null)
        paramArrayOfObject.e(27, this.wlK);
      if (this.wlw != null)
      {
        paramArrayOfObject.iy(28, this.wlw.computeSize());
        this.wlw.writeFields(paramArrayOfObject);
      }
      if (this.wlL != null)
        paramArrayOfObject.e(29, this.wlL);
      AppMethodBeat.o(80056);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label2406;
    label2406: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wly != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wly);
      i = paramInt;
      if (this.wlz != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wlz);
      i += e.a.a.b.b.a.bs(4, this.vAS);
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.Title);
      int j = paramInt;
      if (this.ncM != null)
        j = paramInt + e.a.a.b.b.a.f(6, this.ncM);
      i = j;
      if (this.wlA != null)
        i = j + e.a.a.a.ix(7, this.wlA.computeSize());
      paramInt = i;
      if (this.wlB != null)
        paramInt = i + e.a.a.a.ix(8, this.wlB.computeSize());
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.jBB);
      paramInt = i;
      if (this.wlC != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.wlC);
      paramInt = paramInt + e.a.a.b.b.a.bs(16, this.wlD) + e.a.a.a.c(17, 8, this.wlE);
      i = paramInt;
      if (this.wlF != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.wlF);
      paramInt = i;
      if (this.SSID != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.SSID);
      i = paramInt;
      if (this.vAI != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.vAI);
      paramInt = i;
      if (this.wlG != null)
        paramInt = i + e.a.a.a.ix(22, this.wlG.computeSize());
      i = paramInt;
      if (this.wlH != null)
        i = paramInt + e.a.a.a.ix(23, this.wlH.computeSize());
      i = i + e.a.a.b.b.a.bs(24, this.wlI) + e.a.a.a.c(25, 8, this.wlJ);
      paramInt = i;
      if (this.nzz != null)
        paramInt = i + e.a.a.b.b.a.f(26, this.nzz);
      i = paramInt;
      if (this.wlK != null)
        i = paramInt + e.a.a.b.b.a.f(27, this.wlK);
      paramInt = i;
      if (this.wlw != null)
        paramInt = i + e.a.a.a.ix(28, this.wlw.computeSize());
      i = paramInt;
      if (this.wlL != null)
        i = paramInt + e.a.a.b.b.a.f(29, this.wlL);
      AppMethodBeat.o(80056);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wlE.clear();
        this.wlJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(80056);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80056);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        adp localadp = (adp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 19:
        default:
          paramInt = -1;
          AppMethodBeat.o(80056);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadp.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 2:
          localadp.wly = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 3:
          localadp.wlz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 4:
          localadp.vAS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 5:
          localadp.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 6:
          localadp.ncM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new avn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((avn)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadp.wlA = ((avn)localObject1);
          }
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new adl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((adl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadp.wlB = ((adl)localObject1);
          }
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 9:
          localadp.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 15:
          localadp.wlC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 16:
          localadp.wlD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 17:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new le();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadp.wlE.add(paramArrayOfObject);
          }
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 18:
          localadp.wlF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 20:
          localadp.SSID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 21:
          localadp.vAI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 22:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new vc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((vc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadp.wlG = ((vc)localObject1);
          }
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 23:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadp.wlH = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 24:
          localadp.wlI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 25:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new atp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadp.wlJ.add(localObject1);
          }
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 26:
          localadp.nzz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 27:
          localadp.wlK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 28:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadp.wlw = paramArrayOfObject;
          }
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        case 29:
          localadp.wlL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80056);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80056);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.adp
 * JD-Core Version:    0.6.2
 */