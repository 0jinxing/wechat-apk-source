package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class gu extends com.tencent.mm.bt.a
{
  public int jCt;
  public int ptD;
  public long ptF;
  public bts vEB;
  public bts vEC;
  public bts vED;
  public String vEG;
  public String vFF;
  public int vIY;
  public int vIZ;
  public int vJa;
  public LinkedList<bts> vJb;
  public LinkedList<btt> vJc;
  public SKBuiltinBuffer_t vJd;
  public int vJe;
  public int vJf;
  public int vJg;
  public long vJh;
  public int vJi;

  public gu()
  {
    AppMethodBeat.i(28333);
    this.vJb = new LinkedList();
    this.vJc = new LinkedList();
    AppMethodBeat.o(28333);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28334);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FromUserName");
        AppMethodBeat.o(28334);
        throw paramArrayOfObject;
      }
      if (this.vEC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ToUserName");
        AppMethodBeat.o(28334);
        throw paramArrayOfObject;
      }
      if (this.vED == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Content");
        AppMethodBeat.o(28334);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.jCt);
      if (this.vFF != null)
        paramArrayOfObject.e(2, this.vFF);
      if (this.vEB != null)
      {
        paramArrayOfObject.iy(3, this.vEB.computeSize());
        this.vEB.writeFields(paramArrayOfObject);
      }
      if (this.vEC != null)
      {
        paramArrayOfObject.iy(4, this.vEC.computeSize());
        this.vEC.writeFields(paramArrayOfObject);
      }
      if (this.vED != null)
      {
        paramArrayOfObject.iy(5, this.vED.computeSize());
        this.vED.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.vIY);
      paramArrayOfObject.iz(7, this.vIZ);
      if (this.vEG != null)
        paramArrayOfObject.e(8, this.vEG);
      paramArrayOfObject.iz(9, this.ptD);
      paramArrayOfObject.iz(10, this.vJa);
      paramArrayOfObject.e(11, 8, this.vJb);
      paramArrayOfObject.e(12, 8, this.vJc);
      if (this.vJd != null)
      {
        paramArrayOfObject.iy(13, this.vJd.computeSize());
        this.vJd.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(14, this.vJe);
      paramArrayOfObject.iz(15, this.vJf);
      paramArrayOfObject.ai(16, this.ptF);
      paramArrayOfObject.iz(17, this.vJg);
      paramArrayOfObject.ai(18, this.vJh);
      paramArrayOfObject.iz(19, this.vJi);
      AppMethodBeat.o(28334);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.jCt) + 0;
        paramInt = i;
        if (this.vFF != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vFF);
        i = paramInt;
        if (this.vEB != null)
          i = paramInt + e.a.a.a.ix(3, this.vEB.computeSize());
        paramInt = i;
        if (this.vEC != null)
          paramInt = i + e.a.a.a.ix(4, this.vEC.computeSize());
        i = paramInt;
        if (this.vED != null)
          i = paramInt + e.a.a.a.ix(5, this.vED.computeSize());
        i = i + e.a.a.b.b.a.bs(6, this.vIY) + e.a.a.b.b.a.bs(7, this.vIZ);
        paramInt = i;
        if (this.vEG != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.vEG);
        i = paramInt + e.a.a.b.b.a.bs(9, this.ptD) + e.a.a.b.b.a.bs(10, this.vJa) + e.a.a.a.c(11, 8, this.vJb) + e.a.a.a.c(12, 8, this.vJc);
        paramInt = i;
        if (this.vJd != null)
          paramInt = i + e.a.a.a.ix(13, this.vJd.computeSize());
        paramInt = paramInt + e.a.a.b.b.a.bs(14, this.vJe) + e.a.a.b.b.a.bs(15, this.vJf) + e.a.a.b.b.a.o(16, this.ptF) + e.a.a.b.b.a.bs(17, this.vJg) + e.a.a.b.b.a.o(18, this.vJh) + e.a.a.b.b.a.bs(19, this.vJi);
        AppMethodBeat.o(28334);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vJb.clear();
        this.vJc.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FromUserName");
          AppMethodBeat.o(28334);
          throw paramArrayOfObject;
        }
        if (this.vEC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ToUserName");
          AppMethodBeat.o(28334);
          throw paramArrayOfObject;
        }
        if (this.vED == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Content");
          AppMethodBeat.o(28334);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28334);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        gu localgu = (gu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28334);
          break;
        case 1:
          localgu.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 2:
          localgu.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28334);
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
            localgu.vEB = ((bts)localObject1);
          }
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgu.vEC = paramArrayOfObject;
          }
          AppMethodBeat.o(28334);
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
            localgu.vED = paramArrayOfObject;
          }
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 6:
          localgu.vIY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 7:
          localgu.vIZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 8:
          localgu.vEG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 9:
          localgu.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 10:
          localgu.vJa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgu.vJb.add(localObject1);
          }
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new btt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((btt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgu.vJc.add(localObject1);
          }
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgu.vJd = paramArrayOfObject;
          }
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 14:
          localgu.vJe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 15:
          localgu.vJf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 16:
          localgu.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 17:
          localgu.vJg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 18:
          localgu.vJh = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        case 19:
          localgu.vJi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28334);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28334);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gu
 * JD-Core Version:    0.6.2
 */