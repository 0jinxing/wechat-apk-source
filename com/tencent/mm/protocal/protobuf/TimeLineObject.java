package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class TimeLineObject extends com.tencent.mm.bt.a
{
  public String Id;
  public int dtW;
  public int fgt;
  public String ijx;
  public String jBB;
  public int pcX;
  public av qNO;
  public cvi qNQ;
  public String rCK;
  public String rjC;
  public String vjM;
  public int wEJ;
  public String xfF;
  public ayt xfG;
  public ds xfH;
  public uf xfI;
  public String xfJ;
  public int xfK;
  public int xfL;
  public String xfM;
  public cfg xfN;
  public cth xfO;
  public int xfP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94634);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Id != null)
        paramArrayOfObject.e(1, this.Id);
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      paramArrayOfObject.iz(3, this.wEJ);
      paramArrayOfObject.iz(4, this.pcX);
      if (this.xfF != null)
        paramArrayOfObject.e(5, this.xfF);
      if (this.xfG != null)
      {
        paramArrayOfObject.iy(6, this.xfG.computeSize());
        this.xfG.writeFields(paramArrayOfObject);
      }
      if (this.xfH != null)
      {
        paramArrayOfObject.iy(7, this.xfH.computeSize());
        this.xfH.writeFields(paramArrayOfObject);
      }
      if (this.xfI != null)
      {
        paramArrayOfObject.iy(8, this.xfI.computeSize());
        this.xfI.writeFields(paramArrayOfObject);
      }
      if (this.ijx != null)
        paramArrayOfObject.e(9, this.ijx);
      if (this.vjM != null)
        paramArrayOfObject.e(10, this.vjM);
      if (this.xfJ != null)
        paramArrayOfObject.e(11, this.xfJ);
      paramArrayOfObject.iz(12, this.xfK);
      paramArrayOfObject.iz(13, this.xfL);
      if (this.xfM != null)
        paramArrayOfObject.e(14, this.xfM);
      if (this.qNO != null)
      {
        paramArrayOfObject.iy(15, this.qNO.computeSize());
        this.qNO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(16, this.fgt);
      if (this.xfN != null)
      {
        paramArrayOfObject.iy(17, this.xfN.computeSize());
        this.xfN.writeFields(paramArrayOfObject);
      }
      if (this.rjC != null)
        paramArrayOfObject.e(18, this.rjC);
      if (this.rCK != null)
        paramArrayOfObject.e(19, this.rCK);
      if (this.xfO != null)
      {
        paramArrayOfObject.iy(20, this.xfO.computeSize());
        this.xfO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(21, this.xfP);
      if (this.qNQ != null)
      {
        paramArrayOfObject.iy(22, this.qNQ.computeSize());
        this.qNQ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(23, this.dtW);
      AppMethodBeat.o(94634);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Id == null)
        break label2201;
    label2201: for (paramInt = e.a.a.b.b.a.f(1, this.Id) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jBB);
      i = i + e.a.a.b.b.a.bs(3, this.wEJ) + e.a.a.b.b.a.bs(4, this.pcX);
      paramInt = i;
      if (this.xfF != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.xfF);
      i = paramInt;
      if (this.xfG != null)
        i = paramInt + e.a.a.a.ix(6, this.xfG.computeSize());
      int j = i;
      if (this.xfH != null)
        j = i + e.a.a.a.ix(7, this.xfH.computeSize());
      paramInt = j;
      if (this.xfI != null)
        paramInt = j + e.a.a.a.ix(8, this.xfI.computeSize());
      i = paramInt;
      if (this.ijx != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.ijx);
      paramInt = i;
      if (this.vjM != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vjM);
      i = paramInt;
      if (this.xfJ != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.xfJ);
      i = i + e.a.a.b.b.a.bs(12, this.xfK) + e.a.a.b.b.a.bs(13, this.xfL);
      paramInt = i;
      if (this.xfM != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.xfM);
      i = paramInt;
      if (this.qNO != null)
        i = paramInt + e.a.a.a.ix(15, this.qNO.computeSize());
      i += e.a.a.b.b.a.bs(16, this.fgt);
      paramInt = i;
      if (this.xfN != null)
        paramInt = i + e.a.a.a.ix(17, this.xfN.computeSize());
      i = paramInt;
      if (this.rjC != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.rjC);
      paramInt = i;
      if (this.rCK != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.rCK);
      i = paramInt;
      if (this.xfO != null)
        i = paramInt + e.a.a.a.ix(20, this.xfO.computeSize());
      i += e.a.a.b.b.a.bs(21, this.xfP);
      paramInt = i;
      if (this.qNQ != null)
        paramInt = i + e.a.a.a.ix(22, this.qNQ.computeSize());
      paramInt += e.a.a.b.b.a.bs(23, this.dtW);
      AppMethodBeat.o(94634);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94634);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        TimeLineObject localTimeLineObject = (TimeLineObject)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94634);
          break;
        case 1:
          localTimeLineObject.Id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 2:
          localTimeLineObject.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 3:
          localTimeLineObject.wEJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 4:
          localTimeLineObject.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 5:
          localTimeLineObject.xfF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ayt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ayt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localTimeLineObject.xfG = ((ayt)localObject1);
          }
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ds();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ds)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localTimeLineObject.xfH = ((ds)localObject1);
          }
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new uf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localTimeLineObject.xfI = paramArrayOfObject;
          }
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 9:
          localTimeLineObject.ijx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 10:
          localTimeLineObject.vjM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 11:
          localTimeLineObject.xfJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 12:
          localTimeLineObject.xfK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 13:
          localTimeLineObject.xfL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 14:
          localTimeLineObject.xfM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new av();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localTimeLineObject.qNO = paramArrayOfObject;
          }
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 16:
          localTimeLineObject.fgt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 17:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cfg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localTimeLineObject.xfN = paramArrayOfObject;
          }
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 18:
          localTimeLineObject.rjC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 19:
          localTimeLineObject.rCK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 20:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cth();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cth)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localTimeLineObject.xfO = ((cth)localObject1);
          }
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 21:
          localTimeLineObject.xfP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 22:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cvi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cvi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localTimeLineObject.qNQ = ((cvi)localObject1);
          }
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        case 23:
          localTimeLineObject.dtW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94634);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94634);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.TimeLineObject
 * JD-Core Version:    0.6.2
 */