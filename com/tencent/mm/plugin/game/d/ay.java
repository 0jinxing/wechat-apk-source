package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.btd;
import e.a.a.b;
import java.util.LinkedList;

public final class ay extends btd
{
  public dd nbA;
  public m nbB;
  public dp nbC;
  public s nbD;
  public do nbE;
  public r nbF;
  public boolean nbv;
  public ak nbw;
  public String nbx;
  public ac nby;
  public f nbz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(117000);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(117000);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(2, this.nbv);
      if (this.nbw != null)
      {
        paramArrayOfObject.iy(3, this.nbw.computeSize());
        this.nbw.writeFields(paramArrayOfObject);
      }
      if (this.nbx != null)
        paramArrayOfObject.e(4, this.nbx);
      if (this.nby != null)
      {
        paramArrayOfObject.iy(6, this.nby.computeSize());
        this.nby.writeFields(paramArrayOfObject);
      }
      if (this.nbz != null)
      {
        paramArrayOfObject.iy(7, this.nbz.computeSize());
        this.nbz.writeFields(paramArrayOfObject);
      }
      if (this.nbA != null)
      {
        paramArrayOfObject.iy(8, this.nbA.computeSize());
        this.nbA.writeFields(paramArrayOfObject);
      }
      if (this.nbB != null)
      {
        paramArrayOfObject.iy(11, this.nbB.computeSize());
        this.nbB.writeFields(paramArrayOfObject);
      }
      if (this.nbC != null)
      {
        paramArrayOfObject.iy(12, this.nbC.computeSize());
        this.nbC.writeFields(paramArrayOfObject);
      }
      if (this.nbD != null)
      {
        paramArrayOfObject.iy(13, this.nbD.computeSize());
        this.nbD.writeFields(paramArrayOfObject);
      }
      if (this.nbE != null)
      {
        paramArrayOfObject.iy(14, this.nbE.computeSize());
        this.nbE.writeFields(paramArrayOfObject);
      }
      if (this.nbF != null)
      {
        paramArrayOfObject.iy(15, this.nbF.computeSize());
        this.nbF.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(117000);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1935;
    label1935: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.fv(2) + 1;
      i = paramInt;
      if (this.nbw != null)
        i = paramInt + e.a.a.a.ix(3, this.nbw.computeSize());
      paramInt = i;
      if (this.nbx != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nbx);
      int j = paramInt;
      if (this.nby != null)
        j = paramInt + e.a.a.a.ix(6, this.nby.computeSize());
      i = j;
      if (this.nbz != null)
        i = j + e.a.a.a.ix(7, this.nbz.computeSize());
      paramInt = i;
      if (this.nbA != null)
        paramInt = i + e.a.a.a.ix(8, this.nbA.computeSize());
      i = paramInt;
      if (this.nbB != null)
        i = paramInt + e.a.a.a.ix(11, this.nbB.computeSize());
      j = i;
      if (this.nbC != null)
        j = i + e.a.a.a.ix(12, this.nbC.computeSize());
      paramInt = j;
      if (this.nbD != null)
        paramInt = j + e.a.a.a.ix(13, this.nbD.computeSize());
      i = paramInt;
      if (this.nbE != null)
        i = paramInt + e.a.a.a.ix(14, this.nbE.computeSize());
      paramInt = i;
      if (this.nbF != null)
        paramInt = i + e.a.a.a.ix(15, this.nbF.computeSize());
      AppMethodBeat.o(117000);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(117000);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(117000);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ay localay = (ay)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5:
        case 9:
        case 10:
        default:
          paramInt = -1;
          AppMethodBeat.o(117000);
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
            localay.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 2:
          localay.nbv = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ak();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ak)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localay.nbw = ((ak)localObject1);
          }
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 4:
          localay.nbx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ac();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ac)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localay.nby = ((ac)localObject1);
          }
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new f();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localay.nbz = paramArrayOfObject;
          }
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new dd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((dd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localay.nbA = ((dd)localObject1);
          }
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new m();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localay.nbB = paramArrayOfObject;
          }
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new dp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localay.nbC = paramArrayOfObject;
          }
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 13:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new s();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((s)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localay.nbD = ((s)localObject1);
          }
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 14:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new do();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((do)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localay.nbE = ((do)localObject1);
          }
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        case 15:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new r();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((r)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localay.nbF = ((r)localObject1);
          }
          AppMethodBeat.o(117000);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(117000);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ay
 * JD-Core Version:    0.6.2
 */