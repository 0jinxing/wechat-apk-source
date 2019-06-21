package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cm extends com.tencent.mm.bt.a
{
  public int jBT;
  public int nao;
  public int pcX;
  public int ptD;
  public long ptF;
  public bts vEB;
  public bts vEC;
  public bts vED;
  public int vEE;
  public SKBuiltinBuffer_t vEF;
  public String vEG;
  public String vEH;
  public int vEI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58884);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FromUserName");
        AppMethodBeat.o(58884);
        throw paramArrayOfObject;
      }
      if (this.vEC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ToUserName");
        AppMethodBeat.o(58884);
        throw paramArrayOfObject;
      }
      if (this.vED == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Content");
        AppMethodBeat.o(58884);
        throw paramArrayOfObject;
      }
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(58884);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.ptD);
      if (this.vEB != null)
      {
        paramArrayOfObject.iy(2, this.vEB.computeSize());
        this.vEB.writeFields(paramArrayOfObject);
      }
      if (this.vEC != null)
      {
        paramArrayOfObject.iy(3, this.vEC.computeSize());
        this.vEC.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.nao);
      if (this.vED != null)
      {
        paramArrayOfObject.iy(5, this.vED.computeSize());
        this.vED.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.jBT);
      paramArrayOfObject.iz(7, this.vEE);
      if (this.vEF != null)
      {
        paramArrayOfObject.iy(8, this.vEF.computeSize());
        this.vEF.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(9, this.pcX);
      if (this.vEG != null)
        paramArrayOfObject.e(10, this.vEG);
      if (this.vEH != null)
        paramArrayOfObject.e(11, this.vEH);
      paramArrayOfObject.ai(12, this.ptF);
      paramArrayOfObject.iz(13, this.vEI);
      AppMethodBeat.o(58884);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ptD) + 0;
        paramInt = i;
        if (this.vEB != null)
          paramInt = i + e.a.a.a.ix(2, this.vEB.computeSize());
        i = paramInt;
        if (this.vEC != null)
          i = paramInt + e.a.a.a.ix(3, this.vEC.computeSize());
        i += e.a.a.b.b.a.bs(4, this.nao);
        paramInt = i;
        if (this.vED != null)
          paramInt = i + e.a.a.a.ix(5, this.vED.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(6, this.jBT) + e.a.a.b.b.a.bs(7, this.vEE);
        paramInt = i;
        if (this.vEF != null)
          paramInt = i + e.a.a.a.ix(8, this.vEF.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(9, this.pcX);
        paramInt = i;
        if (this.vEG != null)
          paramInt = i + e.a.a.b.b.a.f(10, this.vEG);
        i = paramInt;
        if (this.vEH != null)
          i = paramInt + e.a.a.b.b.a.f(11, this.vEH);
        paramInt = i + e.a.a.b.b.a.o(12, this.ptF) + e.a.a.b.b.a.bs(13, this.vEI);
        AppMethodBeat.o(58884);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FromUserName");
          AppMethodBeat.o(58884);
          throw paramArrayOfObject;
        }
        if (this.vEC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ToUserName");
          AppMethodBeat.o(58884);
          throw paramArrayOfObject;
        }
        if (this.vED == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Content");
          AppMethodBeat.o(58884);
          throw paramArrayOfObject;
        }
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(58884);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58884);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cm localcm = (cm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58884);
          break;
        case 1:
          localcm.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcm.vEB = paramArrayOfObject;
          }
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcm.vEC = ((bts)localObject1);
          }
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 4:
          localcm.nao = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcm.vED = paramArrayOfObject;
          }
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 6:
          localcm.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 7:
          localcm.vEE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcm.vEF = paramArrayOfObject;
          }
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 9:
          localcm.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 10:
          localcm.vEG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 11:
          localcm.vEH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 12:
          localcm.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        case 13:
          localcm.vEI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58884);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(58884);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cm
 * JD-Core Version:    0.6.2
 */