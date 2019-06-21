package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.btd;
import e.a.a.b;
import java.util.LinkedList;

public final class ba extends btd
{
  public e mZk;
  public String nbJ;
  public LinkedList<v> nbK;
  public cf nbL;
  public bv nbM;
  public bs nbN;
  public cv nbO;
  public LinkedList<w> nbP;
  public da nbQ;
  public bu nbR;
  public br nbS;

  public ba()
  {
    AppMethodBeat.i(111595);
    this.nbK = new LinkedList();
    this.nbP = new LinkedList();
    AppMethodBeat.o(111595);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111596);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(111596);
        throw paramArrayOfObject;
      }
      if (this.mZk == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppItem");
        AppMethodBeat.o(111596);
        throw paramArrayOfObject;
      }
      if (this.nbJ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BackGroundURL");
        AppMethodBeat.o(111596);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.mZk != null)
      {
        paramArrayOfObject.iy(2, this.mZk.computeSize());
        this.mZk.writeFields(paramArrayOfObject);
      }
      if (this.nbJ != null)
        paramArrayOfObject.e(3, this.nbJ);
      paramArrayOfObject.e(4, 8, this.nbK);
      if (this.nbL != null)
      {
        paramArrayOfObject.iy(5, this.nbL.computeSize());
        this.nbL.writeFields(paramArrayOfObject);
      }
      if (this.nbM != null)
      {
        paramArrayOfObject.iy(7, this.nbM.computeSize());
        this.nbM.writeFields(paramArrayOfObject);
      }
      if (this.nbN != null)
      {
        paramArrayOfObject.iy(8, this.nbN.computeSize());
        this.nbN.writeFields(paramArrayOfObject);
      }
      if (this.nbO != null)
      {
        paramArrayOfObject.iy(9, this.nbO.computeSize());
        this.nbO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(10, 8, this.nbP);
      if (this.nbQ != null)
      {
        paramArrayOfObject.iy(11, this.nbQ.computeSize());
        this.nbQ.writeFields(paramArrayOfObject);
      }
      if (this.nbR != null)
      {
        paramArrayOfObject.iy(12, this.nbR.computeSize());
        this.nbR.writeFields(paramArrayOfObject);
      }
      if (this.nbS != null)
      {
        paramArrayOfObject.iy(13, this.nbS.computeSize());
        this.nbS.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(111596);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label2099;
    label2099: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mZk != null)
        paramInt = i + e.a.a.a.ix(2, this.mZk.computeSize());
      i = paramInt;
      if (this.nbJ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.nbJ);
      paramInt = i + e.a.a.a.c(4, 8, this.nbK);
      i = paramInt;
      if (this.nbL != null)
        i = paramInt + e.a.a.a.ix(5, this.nbL.computeSize());
      paramInt = i;
      if (this.nbM != null)
        paramInt = i + e.a.a.a.ix(7, this.nbM.computeSize());
      i = paramInt;
      if (this.nbN != null)
        i = paramInt + e.a.a.a.ix(8, this.nbN.computeSize());
      paramInt = i;
      if (this.nbO != null)
        paramInt = i + e.a.a.a.ix(9, this.nbO.computeSize());
      i = paramInt + e.a.a.a.c(10, 8, this.nbP);
      paramInt = i;
      if (this.nbQ != null)
        paramInt = i + e.a.a.a.ix(11, this.nbQ.computeSize());
      i = paramInt;
      if (this.nbR != null)
        i = paramInt + e.a.a.a.ix(12, this.nbR.computeSize());
      paramInt = i;
      if (this.nbS != null)
        paramInt = i + e.a.a.a.ix(13, this.nbS.computeSize());
      AppMethodBeat.o(111596);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nbK.clear();
        this.nbP.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(111596);
          throw paramArrayOfObject;
        }
        if (this.mZk == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppItem");
          AppMethodBeat.o(111596);
          throw paramArrayOfObject;
        }
        if (this.nbJ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BackGroundURL");
          AppMethodBeat.o(111596);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111596);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ba localba = (ba)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 6:
        default:
          paramInt = -1;
          AppMethodBeat.o(111596);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.mZk = ((e)localObject1);
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 3:
          localba.nbJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new v();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((v)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.nbK.add(localObject1);
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.nbL = ((cf)localObject1);
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.nbM = paramArrayOfObject;
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bs();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.nbN = paramArrayOfObject;
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.nbO = ((cv)localObject1);
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new w();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.nbP.add(paramArrayOfObject);
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new da();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((da)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.nbQ = ((da)localObject1);
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.nbR = paramArrayOfObject;
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        case 13:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new br();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((br)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localba.nbS = ((br)localObject1);
          }
          AppMethodBeat.o(111596);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111596);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ba
 * JD-Core Version:    0.6.2
 */