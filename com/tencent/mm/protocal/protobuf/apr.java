package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class apr extends btd
{
  public int lCg;
  public boolean lvH;
  public String lvw;
  public String lvy;
  public String source;
  public LinkedList<ach> vEx;
  public LinkedList<cdo> vFi;
  public String wtC;
  public cyk wtD;
  public LinkedList<cym> wtE;
  public LinkedList<cyl> wtF;
  public LinkedList<String> wtG;
  public String wtH;
  public String wtI;
  public LinkedList<mq> wtJ;
  public boolean wtK;

  public apr()
  {
    AppMethodBeat.i(28479);
    this.wtE = new LinkedList();
    this.wtF = new LinkedList();
    this.wtG = new LinkedList();
    this.vFi = new LinkedList();
    this.vEx = new LinkedList();
    this.wtJ = new LinkedList();
    AppMethodBeat.o(28479);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28480);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28480);
        throw paramArrayOfObject;
      }
      if (this.wtC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: coverurl");
        AppMethodBeat.o(28480);
        throw paramArrayOfObject;
      }
      if (this.lvy == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: motto");
        AppMethodBeat.o(28480);
        throw paramArrayOfObject;
      }
      if (this.wtD == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: rankdesc");
        AppMethodBeat.o(28480);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wtC != null)
        paramArrayOfObject.e(2, this.wtC);
      if (this.lvy != null)
        paramArrayOfObject.e(3, this.lvy);
      if (this.wtD != null)
      {
        paramArrayOfObject.iy(4, this.wtD.computeSize());
        this.wtD.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(5, 8, this.wtE);
      paramArrayOfObject.e(6, 8, this.wtF);
      if (this.source != null)
        paramArrayOfObject.e(7, this.source);
      paramArrayOfObject.e(8, 1, this.wtG);
      if (this.wtH != null)
        paramArrayOfObject.e(9, this.wtH);
      if (this.wtI != null)
        paramArrayOfObject.e(10, this.wtI);
      paramArrayOfObject.e(14, 8, this.vFi);
      paramArrayOfObject.e(15, 8, this.vEx);
      paramArrayOfObject.aO(16, this.lvH);
      paramArrayOfObject.e(17, 8, this.wtJ);
      paramArrayOfObject.aO(18, this.wtK);
      paramArrayOfObject.iz(19, this.lCg);
      if (this.lvw != null)
        paramArrayOfObject.e(20, this.lvw);
      AppMethodBeat.o(28480);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label2017;
    label2017: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wtC != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wtC);
      paramInt = i;
      if (this.lvy != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.lvy);
      i = paramInt;
      if (this.wtD != null)
        i = paramInt + e.a.a.a.ix(4, this.wtD.computeSize());
      i = i + e.a.a.a.c(5, 8, this.wtE) + e.a.a.a.c(6, 8, this.wtF);
      paramInt = i;
      if (this.source != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.source);
      i = paramInt + e.a.a.a.c(8, 1, this.wtG);
      paramInt = i;
      if (this.wtH != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wtH);
      i = paramInt;
      if (this.wtI != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wtI);
      i = i + e.a.a.a.c(14, 8, this.vFi) + e.a.a.a.c(15, 8, this.vEx) + (e.a.a.b.b.a.fv(16) + 1) + e.a.a.a.c(17, 8, this.wtJ) + (e.a.a.b.b.a.fv(18) + 1) + e.a.a.b.b.a.bs(19, this.lCg);
      paramInt = i;
      if (this.lvw != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.lvw);
      AppMethodBeat.o(28480);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wtE.clear();
        this.wtF.clear();
        this.wtG.clear();
        this.vFi.clear();
        this.vEx.clear();
        this.wtJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28480);
          throw paramArrayOfObject;
        }
        if (this.wtC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: coverurl");
          AppMethodBeat.o(28480);
          throw paramArrayOfObject;
        }
        if (this.lvy == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: motto");
          AppMethodBeat.o(28480);
          throw paramArrayOfObject;
        }
        if (this.wtD == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: rankdesc");
          AppMethodBeat.o(28480);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28480);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        apr localapr = (apr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 11:
        case 12:
        case 13:
        default:
          paramInt = -1;
          AppMethodBeat.o(28480);
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
            localapr.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 2:
          localapr.wtC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 3:
          localapr.lvy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cyk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapr.wtD = paramArrayOfObject;
          }
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cym();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapr.wtE.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cyl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cyl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapr.wtF.add(localObject1);
          }
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 7:
          localapr.source = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 8:
          localapr.wtG.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 9:
          localapr.wtH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 10:
          localapr.wtI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 14:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cdo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cdo)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapr.vFi.add(localObject1);
          }
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ach();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapr.vEx.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 16:
          localapr.lvH = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 17:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapr.wtJ.add(localObject1);
          }
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 18:
          localapr.wtK = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 19:
          localapr.lCg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        case 20:
          localapr.lvw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28480);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28480);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.apr
 * JD-Core Version:    0.6.2
 */