package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class av extends com.tencent.mm.bt.a
{
  public int Scene;
  public String Url;
  public int jCt;
  public dj vCA;
  public du vCB;
  public dt vCC;
  public dt vCD;
  public String vCv;
  public String vCw;
  public String vCx;
  public at vCy;
  public String vCz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94490);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jCt);
      if (this.Url != null)
        paramArrayOfObject.e(2, this.Url);
      paramArrayOfObject.iz(3, this.Scene);
      if (this.vCv != null)
        paramArrayOfObject.e(4, this.vCv);
      if (this.vCw != null)
        paramArrayOfObject.e(5, this.vCw);
      if (this.vCx != null)
        paramArrayOfObject.e(6, this.vCx);
      if (this.vCy != null)
      {
        paramArrayOfObject.iy(7, this.vCy.computeSize());
        this.vCy.writeFields(paramArrayOfObject);
      }
      if (this.vCz != null)
        paramArrayOfObject.e(8, this.vCz);
      if (this.vCA != null)
      {
        paramArrayOfObject.iy(9, this.vCA.computeSize());
        this.vCA.writeFields(paramArrayOfObject);
      }
      if (this.vCB != null)
      {
        paramArrayOfObject.iy(10, this.vCB.computeSize());
        this.vCB.writeFields(paramArrayOfObject);
      }
      if (this.vCC != null)
      {
        paramArrayOfObject.iy(11, this.vCC.computeSize());
        this.vCC.writeFields(paramArrayOfObject);
      }
      if (this.vCD != null)
      {
        paramArrayOfObject.iy(12, this.vCD.computeSize());
        this.vCD.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94490);
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
        if (this.Url != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.Url);
        i = paramInt + e.a.a.b.b.a.bs(3, this.Scene);
        paramInt = i;
        if (this.vCv != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.vCv);
        i = paramInt;
        if (this.vCw != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.vCw);
        paramInt = i;
        if (this.vCx != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.vCx);
        i = paramInt;
        if (this.vCy != null)
          i = paramInt + e.a.a.a.ix(7, this.vCy.computeSize());
        paramInt = i;
        if (this.vCz != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.vCz);
        i = paramInt;
        if (this.vCA != null)
          i = paramInt + e.a.a.a.ix(9, this.vCA.computeSize());
        paramInt = i;
        if (this.vCB != null)
          paramInt = i + e.a.a.a.ix(10, this.vCB.computeSize());
        i = paramInt;
        if (this.vCC != null)
          i = paramInt + e.a.a.a.ix(11, this.vCC.computeSize());
        paramInt = i;
        if (this.vCD != null)
          paramInt = i + e.a.a.a.ix(12, this.vCD.computeSize());
        AppMethodBeat.o(94490);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94490);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        av localav = (av)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94490);
          break;
        case 1:
          localav.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 2:
          localav.Url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 3:
          localav.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 4:
          localav.vCv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 5:
          localav.vCw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 6:
          localav.vCx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new at();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localav.vCy = paramArrayOfObject;
          }
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 8:
          localav.vCz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new dj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((dj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localav.vCA = ((dj)localObject1);
          }
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new du();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((du)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localav.vCB = ((du)localObject1);
          }
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new dt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localav.vCC = paramArrayOfObject;
          }
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new dt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localav.vCD = paramArrayOfObject;
          }
          AppMethodBeat.o(94490);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94490);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.av
 * JD-Core Version:    0.6.2
 */