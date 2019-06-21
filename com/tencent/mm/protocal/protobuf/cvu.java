package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cvu extends com.tencent.mm.bt.a
{
  public String Md5;
  public String vMJ;
  public String xql;
  public int xrE;
  public int xrF;
  public String xrK;
  public cvm xrL;
  public cvt xrM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(63702);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xrK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: EntranceDomain");
        AppMethodBeat.o(63702);
        throw paramArrayOfObject;
      }
      if (this.xql == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Charset");
        AppMethodBeat.o(63702);
        throw paramArrayOfObject;
      }
      if (this.xrK != null)
        paramArrayOfObject.e(4, this.xrK);
      if (this.xql != null)
        paramArrayOfObject.e(12, this.xql);
      if (this.xrL != null)
      {
        paramArrayOfObject.iy(9, this.xrL.computeSize());
        this.xrL.writeFields(paramArrayOfObject);
      }
      if (this.xrM != null)
      {
        paramArrayOfObject.iy(10, this.xrM.computeSize());
        this.xrM.writeFields(paramArrayOfObject);
      }
      if (this.Md5 != null)
        paramArrayOfObject.e(5, this.Md5);
      if (this.vMJ != null)
        paramArrayOfObject.e(6, this.vMJ);
      paramArrayOfObject.iz(7, this.xrE);
      paramArrayOfObject.iz(8, this.xrF);
      AppMethodBeat.o(63702);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xrK == null)
        break label938;
    label938: for (i = e.a.a.b.b.a.f(4, this.xrK) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xql != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.xql);
      i = paramInt;
      if (this.xrL != null)
        i = paramInt + e.a.a.a.ix(9, this.xrL.computeSize());
      paramInt = i;
      if (this.xrM != null)
        paramInt = i + e.a.a.a.ix(10, this.xrM.computeSize());
      i = paramInt;
      if (this.Md5 != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.Md5);
      paramInt = i;
      if (this.vMJ != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vMJ);
      paramInt = paramInt + e.a.a.b.b.a.bs(7, this.xrE) + e.a.a.b.b.a.bs(8, this.xrF);
      AppMethodBeat.o(63702);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xrK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: EntranceDomain");
          AppMethodBeat.o(63702);
          throw paramArrayOfObject;
        }
        if (this.xql == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Charset");
          AppMethodBeat.o(63702);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(63702);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cvu localcvu = (cvu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 11:
        default:
          AppMethodBeat.o(63702);
          paramInt = -1;
          break;
        case 4:
          localcvu.xrK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63702);
          paramInt = i;
          break;
        case 12:
          localcvu.xql = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63702);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cvm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cvm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvu.xrL = ((cvm)localObject1);
          }
          AppMethodBeat.o(63702);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cvt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cvt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvu.xrM = ((cvt)localObject1);
          }
          AppMethodBeat.o(63702);
          paramInt = i;
          break;
        case 5:
          localcvu.Md5 = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63702);
          paramInt = i;
          break;
        case 6:
          localcvu.vMJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63702);
          paramInt = i;
          break;
        case 7:
          localcvu.xrE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(63702);
          paramInt = i;
          break;
        case 8:
          localcvu.xrF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(63702);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(63702);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvu
 * JD-Core Version:    0.6.2
 */