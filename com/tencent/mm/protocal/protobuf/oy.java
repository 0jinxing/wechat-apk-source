package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class oy extends btd
{
  public int kCl;
  public int pPV;
  public String pPW;
  public String pPX;
  public String twd;
  public String url;
  public LinkedList<bbc> vVY;
  public bbc vVZ;
  public String vWa;
  public boolean vWb;
  public String vWc;
  public int vWd;
  public bbj vWe;
  public bpt vWf;

  public oy()
  {
    AppMethodBeat.i(56752);
    this.vVY = new LinkedList();
    AppMethodBeat.o(56752);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56753);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56753);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      paramArrayOfObject.e(3, 8, this.vVY);
      if (this.vVZ != null)
      {
        paramArrayOfObject.iy(4, this.vVZ.computeSize());
        this.vVZ.writeFields(paramArrayOfObject);
      }
      if (this.twd != null)
        paramArrayOfObject.e(5, this.twd);
      if (this.vWa != null)
        paramArrayOfObject.e(6, this.vWa);
      paramArrayOfObject.aO(7, this.vWb);
      paramArrayOfObject.iz(8, this.pPV);
      if (this.vWc != null)
        paramArrayOfObject.e(9, this.vWc);
      if (this.pPW != null)
        paramArrayOfObject.e(10, this.pPW);
      if (this.pPX != null)
        paramArrayOfObject.e(11, this.pPX);
      paramArrayOfObject.iz(12, this.vWd);
      if (this.vWe != null)
      {
        paramArrayOfObject.iy(13, this.vWe.computeSize());
        this.vWe.writeFields(paramArrayOfObject);
      }
      if (this.vWf != null)
      {
        paramArrayOfObject.iy(14, this.vWf.computeSize());
        this.vWf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(15, this.kCl);
      AppMethodBeat.o(56753);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1570;
    label1570: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.url);
      paramInt = i + e.a.a.a.c(3, 8, this.vVY);
      i = paramInt;
      if (this.vVZ != null)
        i = paramInt + e.a.a.a.ix(4, this.vVZ.computeSize());
      paramInt = i;
      if (this.twd != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.twd);
      i = paramInt;
      if (this.vWa != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vWa);
      i = i + (e.a.a.b.b.a.fv(7) + 1) + e.a.a.b.b.a.bs(8, this.pPV);
      paramInt = i;
      if (this.vWc != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vWc);
      i = paramInt;
      if (this.pPW != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.pPW);
      paramInt = i;
      if (this.pPX != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.pPX);
      i = paramInt + e.a.a.b.b.a.bs(12, this.vWd);
      paramInt = i;
      if (this.vWe != null)
        paramInt = i + e.a.a.a.ix(13, this.vWe.computeSize());
      i = paramInt;
      if (this.vWf != null)
        i = paramInt + e.a.a.a.ix(14, this.vWf.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(15, this.kCl);
      AppMethodBeat.o(56753);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vVY.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56753);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56753);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        oy localoy = (oy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56753);
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
            localoy.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 2:
          localoy.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bbc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bbc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localoy.vVY.add(localObject1);
          }
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bbc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localoy.vVZ = paramArrayOfObject;
          }
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 5:
          localoy.twd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 6:
          localoy.vWa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 7:
          localoy.vWb = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 8:
          localoy.pPV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 9:
          localoy.vWc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 10:
          localoy.pPW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 11:
          localoy.pPX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 12:
          localoy.vWd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bbj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localoy.vWe = paramArrayOfObject;
          }
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bpt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localoy.vWf = paramArrayOfObject;
          }
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        case 15:
          localoy.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56753);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56753);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.oy
 * JD-Core Version:    0.6.2
 */