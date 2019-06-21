package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class baz extends com.tencent.mm.bt.a
{
  public int guN;
  public String guO;
  public String guP;
  public String guQ;
  public int guR;
  public String guW;
  public int wBT;
  public String wBU;
  public int wFJ;
  public bts wFK;
  public bts wFL;
  public bts wFM;
  public int wbA;
  public bts wcG;
  public bts wce;
  public bts wcf;
  public bts wyX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5594);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MemberName");
        AppMethodBeat.o(5594);
        throw paramArrayOfObject;
      }
      if (this.wyX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(5594);
        throw paramArrayOfObject;
      }
      if (this.wce == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PYInitial");
        AppMethodBeat.o(5594);
        throw paramArrayOfObject;
      }
      if (this.wcf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QuanPin");
        AppMethodBeat.o(5594);
        throw paramArrayOfObject;
      }
      if (this.wFK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Remark");
        AppMethodBeat.o(5594);
        throw paramArrayOfObject;
      }
      if (this.wFL == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RemarkPYInitial");
        AppMethodBeat.o(5594);
        throw paramArrayOfObject;
      }
      if (this.wFM == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RemarkQuanPin");
        AppMethodBeat.o(5594);
        throw paramArrayOfObject;
      }
      if (this.wcG != null)
      {
        paramArrayOfObject.iy(1, this.wcG.computeSize());
        this.wcG.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wFJ);
      if (this.wyX != null)
      {
        paramArrayOfObject.iy(3, this.wyX.computeSize());
        this.wyX.writeFields(paramArrayOfObject);
      }
      if (this.wce != null)
      {
        paramArrayOfObject.iy(4, this.wce.computeSize());
        this.wce.writeFields(paramArrayOfObject);
      }
      if (this.wcf != null)
      {
        paramArrayOfObject.iy(5, this.wcf.computeSize());
        this.wcf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.guN);
      if (this.wFK != null)
      {
        paramArrayOfObject.iy(9, this.wFK.computeSize());
        this.wFK.writeFields(paramArrayOfObject);
      }
      if (this.wFL != null)
      {
        paramArrayOfObject.iy(10, this.wFL.computeSize());
        this.wFL.writeFields(paramArrayOfObject);
      }
      if (this.wFM != null)
      {
        paramArrayOfObject.iy(11, this.wFM.computeSize());
        this.wFM.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(12, this.wbA);
      if (this.guO != null)
        paramArrayOfObject.e(13, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(14, this.guP);
      if (this.guQ != null)
        paramArrayOfObject.e(15, this.guQ);
      paramArrayOfObject.iz(16, this.guR);
      paramArrayOfObject.iz(17, this.wBT);
      if (this.wBU != null)
        paramArrayOfObject.e(18, this.wBU);
      if (this.guW != null)
        paramArrayOfObject.e(19, this.guW);
      AppMethodBeat.o(5594);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wcG == null)
        break label2224;
    label2224: for (paramInt = e.a.a.a.ix(1, this.wcG.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.wFJ);
      i = paramInt;
      if (this.wyX != null)
        i = paramInt + e.a.a.a.ix(3, this.wyX.computeSize());
      paramInt = i;
      if (this.wce != null)
        paramInt = i + e.a.a.a.ix(4, this.wce.computeSize());
      i = paramInt;
      if (this.wcf != null)
        i = paramInt + e.a.a.a.ix(5, this.wcf.computeSize());
      i += e.a.a.b.b.a.bs(6, this.guN);
      paramInt = i;
      if (this.wFK != null)
        paramInt = i + e.a.a.a.ix(9, this.wFK.computeSize());
      i = paramInt;
      if (this.wFL != null)
        i = paramInt + e.a.a.a.ix(10, this.wFL.computeSize());
      paramInt = i;
      if (this.wFM != null)
        paramInt = i + e.a.a.a.ix(11, this.wFM.computeSize());
      paramInt += e.a.a.b.b.a.bs(12, this.wbA);
      i = paramInt;
      if (this.guO != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.guO);
      paramInt = i;
      if (this.guP != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.guP);
      i = paramInt;
      if (this.guQ != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.guQ);
      i = i + e.a.a.b.b.a.bs(16, this.guR) + e.a.a.b.b.a.bs(17, this.wBT);
      paramInt = i;
      if (this.wBU != null)
        paramInt = i + e.a.a.b.b.a.f(18, this.wBU);
      i = paramInt;
      if (this.guW != null)
        i = paramInt + e.a.a.b.b.a.f(19, this.guW);
      AppMethodBeat.o(5594);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MemberName");
          AppMethodBeat.o(5594);
          throw paramArrayOfObject;
        }
        if (this.wyX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(5594);
          throw paramArrayOfObject;
        }
        if (this.wce == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PYInitial");
          AppMethodBeat.o(5594);
          throw paramArrayOfObject;
        }
        if (this.wcf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QuanPin");
          AppMethodBeat.o(5594);
          throw paramArrayOfObject;
        }
        if (this.wFK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Remark");
          AppMethodBeat.o(5594);
          throw paramArrayOfObject;
        }
        if (this.wFL == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RemarkPYInitial");
          AppMethodBeat.o(5594);
          throw paramArrayOfObject;
        }
        if (this.wFM == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RemarkQuanPin");
          AppMethodBeat.o(5594);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5594);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        baz localbaz = (baz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 7:
        case 8:
        default:
          paramInt = -1;
          AppMethodBeat.o(5594);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbaz.wcG = paramArrayOfObject;
          }
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 2:
          localbaz.wFJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbaz.wyX = paramArrayOfObject;
          }
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbaz.wce = ((bts)localObject1);
          }
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbaz.wcf = ((bts)localObject1);
          }
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 6:
          localbaz.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbaz.wFK = paramArrayOfObject;
          }
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbaz.wFL = paramArrayOfObject;
          }
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbaz.wFM = paramArrayOfObject;
          }
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 12:
          localbaz.wbA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 13:
          localbaz.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 14:
          localbaz.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 15:
          localbaz.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 16:
          localbaz.guR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 17:
          localbaz.wBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 18:
          localbaz.wBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        case 19:
          localbaz.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5594);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5594);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.baz
 * JD-Core Version:    0.6.2
 */